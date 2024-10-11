// Component3DManagerTest.java
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
class Component3DManagerTest {

	@Test
	public void testGetOnscreenCanvas3D() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = new Component3DManager();
		RenderingObserver renderingObserver = new RenderingObserver() {
			public void renderingStarted(Canvas3D canvas3D) {
			}
			
			public void renderingEnded(Canvas3D canvas3D) {
			}
		};
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(renderingObserver);
		assertNotNull(canvas3D);
		assertEquals(renderingObserver, canvas3D.getRenderingObserver());
		assertEquals(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration(), 
				canvas3D.getGraphicsConfiguration());
	}
}

// RenderingObserver.java
package com.eteks.sweethome3d.j3d;

import javax.media.j3d.Canvas3D;

/**
 * Interface of an observer of the 3D rendering process of a <code>Canvas3D</code>.
 * Caution: The methods of the observer will be called in 3D rendering loop thread.
 *
 * @author Emmanuel Puybaret
 */
public interface RenderingObserver {

    /**
     * Invoked when the rendering of a <code>Canvas3D</code> starts.
     */
    public void renderingStarted(Canvas3D canvas3D);

    /**
     * Invoked when the rendering of a <code>Canvas3D</code> ends.
     */
    public void renderingEnded(Canvas3D canvas3D);
}

// RenderingObserverTest.java
package com.eteks.sweethome3d.j3d;

import javax.media.j3d.Canvas3D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RenderingObserver}.
* It contains ten unit test cases for the {@link RenderingObserver#renderingStarted(Canvas3D)} and 
* {@link RenderingObserver#renderingEnded(Canvas3D)} methods.
*/
class RenderingObserverTest {
		
	@Test
	public void testRenderingStarted() {
		// Test the renderingStarted method
		RenderingObserver renderingObserver = new RenderingObserver() {
			public void renderingStarted(Canvas3D canvas3D) {
			}
			
			public void renderingEnded(Canvas3D canvas3D) {
			}
		};
		Canvas3D canvas3D = new Canvas3D(null);
		renderingObserver.renderingStarted(canvas3D);
	}
	
	@Test
	public void testRenderingEnded() {
		// Test the renderingEnded method
		RenderingObserver renderingObserver = new RenderingObserver() {
			public void renderingStarted(Canvas3D canvas3D) {
			}
			
			public void renderingEnded(Canvas3D canvas3D) {
			}
		};
		Canvas3D canvas3D = new Canvas3D(null);
		renderingObserver.renderingEnded(canvas3D);
	}
}