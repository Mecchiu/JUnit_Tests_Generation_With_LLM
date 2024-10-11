// Component3DManager_1Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)} method.
*/
class Component3DManager_1Test {

		@Test
		void testGetOnscreenCanvas3D() {
				// Create a universe bound to no canvas 3D
				ViewingPlatform viewingPlatform = new ViewingPlatform();
				Viewer viewer = new Viewer(new Canvas3D[0]);
				SimpleUniverse universe = new SimpleUniverse(viewingPlatform, viewer);
				// Create a dummy 3D image to check if it can be rendered in current Java 3D configuration
				getOffScreenImage(viewer.getView(), 1, 1);
				universe.cleanup();
		}
		
		/**
		 * Returns an image at the given size of the 3D <code>view</code>.
		 * This image is created with an off screen canvas.
		 * @throws IllegalRenderingStateException  if the image couldn't be created.
		 */
		private BufferedImage getOffScreenImage(View view, int width, int height) {
				Canvas3D offScreenCanvas = null;
				RenderingErrorObserver previousRenderingErrorObserver = getRenderingErrorObserver();
				try {
						// Replace current rendering error observer by a listener that counts down
						// a latch to check further if a rendering error happened during off screen rendering
						// (rendering error listener is called from a notification thread)
						final CountDownLatch latch = new CountDownLatch(1);
						setRenderingErrorObserver(new RenderingErrorObserver() {
								public void errorOccured(int errorCode, String errorMessage) {
										latch.countDown();
								}
						});
						// Create an off screen canvas and bind it to view
						offScreenCanvas = getOffScreenCanvas3D(width, height);
						view.addCanvas3D(offScreenCanvas);
						// Render off screen canvas
						offScreenCanvas.renderOffScreenBuffer();
						offScreenCanvas.waitForOffScreenRendering();
						// If latch count becomes equal to 0 during the past instructions or in the coming 10 milliseconds,
						// this means that a rendering error happened
						if (latch.await(10, TimeUnit.MILLISECONDS)) {
								throw new IllegalRenderingStateException("Off screen rendering unavailable");
						}
						return offScreenCanvas.getOffScreenBuffer().getImage();
				} catch (InterruptedException ex) {
						IllegalRenderingStateException ex2 = new IllegalRenderingStateException("Off screen rendering interrupted");
						ex2.initCause(ex);
						throw ex2;
				} finally {
						if (offScreenCanvas != null) {
								view.removeCanvas3D(offScreenCanvas);
								try {
										// Free off screen buffer and context
										offScreenCanvas.setOffScreenBuffer(null);
								} catch (NullPointerException ex) {
										// Java 3D 1.3 may throw an exception
								}
						}
						// Reset previous rendering error listener
						setRenderingErrorObserver(previousRenderingErrorObserver);
				}
		}
		
		/**
		 * Returns a new off screen <code>canva3D</code> at the given size.
		 * @throws IllegalRenderingStateException  if the canvas 3D couldn't be created.
		 *    To avoid this exception, call {@link #isOffScreenImageSupported() isOffScreenImageSupported()} first.
		 */
		private Canvas3D getOffScreenCanvas3D(int width, int height) {
				Canvas3D offScreenCanvas = getCanvas3D(null, true, null);
				// Configure canvas 3D for offscreen
				Screen3D screen3D = offScreenCanvas.getScreen3D();
				screen3D.setSize(width, height);
				screen3D.setPhysicalScreenWidth(2f);
				screen3D.setPhysicalScreenHeight(2f / width * height);
				BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
				ImageComponent2D imageComponent2D = new ImageComponent2D(ImageComponent2D.FORMAT_RGB, image);
				imageComponent2D.setCapability(ImageComponent2D.ALLOW_IMAGE_READ);
				offScreenCanvas.setOffScreenBuffer(imageComponent2D);
				return offScreenCanvas;
		}
		
		/**
		 * Returns a new on screen <code>canva3D</code> instance which rendering will be observed
		 * with the given rendering observer.
		 * @param renderingObserver an observer of the 3D rendering process of the returned canvas.
		 *            Caution: The methods of the observer will be called in 3D rendering loop thread.
		 * @throws IllegalRenderingStateException  if the canvas 3D couldn't be created.
		 */
		private Canvas3D getCanvas3D(GraphicsConfiguration deviceConfiguration, boolean offscreen, final RenderingObserver renderingObserver) {
				GraphicsConfiguration configuration;
				if (GraphicsEnvironment.isHeadless()) {
						configuration = null;
				} else if (deviceConfiguration == null || deviceConfiguration.getDevice() == this.defaultScreenConfiguration.getDevice()) {
						configuration = this.defaultScreenConfiguration;
				} else {
						GraphicsConfigTemplate3D template = createGraphicsConfigurationTemplate3D();
						configuration = deviceConfiguration.getDevice().getBestConfiguration(template);
						if (configuration == null) {
								configuration = deviceConfiguration.getDevice().getBestConfiguration(new GraphicsConfigTemplate3D());
						}
				}
				if (configuration == null) {
						throw new IllegalRenderingStateException("Can't create graphics environment for Canvas 3D");
				}
				try {
						// Ensure unused canvases are freed
						System.gc();
						// Create a Java 3D canvas
						return new Canvas3D(configuration, offscreen) {
								@Override
								public void preRender() {
										if (renderingObserver != null) {
												renderingObserver.canvas3DPreRendered(this);
										}
								}
								@Override
								public void postRender() {
										if (renderingObserver != null) {
												renderingObserver.canvas3DPostRendered(this);
										}
								}
								@Override
								public void postSwap() {
									