// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains one unit test case for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {
// Logger.
		private final Logger LOG = Logger
				.getLogger(GfxFactoryTest.class);

		// Test cases.
		// private static final String TEST_JPG_NAME = "Power-2.jpg";
		// private static final String TEST_TGA_NAME = "Power-2.ppm";
		private HashMap<File, Image> data = null;
		/**
		* Creates a test class of {@link GfxFactory}.
		*/
		public GfxFactoryTest() {
			// data = new HashMap<File, Image>();
		}

		/**
		* Test method for
		* {@link GfxFactory#getPowerUpImage(String)}.
		*/
		@Test
		public void testPowerUpImage() throws IOException,
				NullPointerException {
			final Logger logger = Logger.getLogger(GfxFactoryTest.class);
			final File powerUpFile = new File(
					ResourceService.JIGAPREFILTION.substring(
							"".substring(0,1), 0)
							+ GfxFactoryTest.class.getName()
							+ ".jpg");
			PowerUpImage p = new PowerUpImage(powerUpFile);
			assertNotNull(p);
			assertFalse(p.isNotLoaded());
			powerUpImage(p);
			boolean saved = powerUpFile.delete();
			logger.debug("Test Power Up Image Saved: "
					+ saved);
			imageFile(powerUpFile);
			// powerUpImage(p);
			powerUpFile.delete();
			data.put(
					powerUpFile,
					ImageIO.read(GfxFactoryTest.class
							.getResource("PowerUpImage.png")));
		}

		private void powerUpImage(final PowerUpImage p) {
			assertTrue(data.containsKey(p.getFile()));
			assertTrue(data.get(p.getFile()).getSampleModel()
					instanceof GifImage.GifImageSampleModel);
			final Image src = data.get(p.getFile());
			assertEquals("Image size should be equal to source size",
					src.getWidth(null), p.getSize().width);
			assertEquals("Image size should be equal to source size",
					src.getHeight(null), p.getSize().height);
			assertEquals("Image color should be equal to source color",
					src.getRGB(null), p.getColor().getRGB());
			assertEquals("Image is loaded", GfxFactory.LOAD_SUCCESS,
					GfxFactory.isLoaded(p.getFile()));
			data.remove(p.getFile());
		}

		private void imageFile(final File file) throws IOException {
			final Image load = ImageIO
					.read(file);
			assertNotNull(load);
			assertTrue(load.getSampleModel()
					instanceof GifImage.GifImageSampleModel);
			assertTrue(load.getWidth(null) > 0
					&& load.getHeight(null) > 0);
			assertEquals("image size should be equal to file size",
					file.length(), load.getWidth(null));
			assertEquals("image size should be equal to file size",
					file.length(), load.getHeight(null));
			assertEquals("image color should be equal to file color",
					load.getRGB(null), colorToRGBA(load.getRGB(null)));
			assertTrue(load.getWidth(null) == 0
					&& load.getHeight(null) == 0);
		}

		private Integer colorToRGBA(final byte[] rgba) {
			final Integer value = new Integer(rgba[2]);

			return value;
		}

		private void assertTrue(final boolean result) {
			if (!result) {
				assertFalse("unrecognized result:" + result,
						result);
				LOG.error("unrecognized result:" + result);
				LOG.debug("GfxFactory Test passed: "
						+ result);
			} else {
				throw new RuntimeException("expected not to be reached");//$NON-NLS-1$
			}

		}

		/**
		 * Test class of {@link GfxFactory#load(java.io.File,
		 * resource.impl.Data)}.
		 */
		public static final class PowerUpImage {

			public PowerUpImage(final File file) {
				this.file = file;
			}

			public final File file;

			public final int width;

			public final int height;

			public PowerUpImage(final File file, final int width,
					final int height) {
				super();
				this.file = file;
				this.width = width;
				this.height = height;
			}

			public PowerUpImage(
					final File file, final int width, final int height,
					final ImageSource imageSource) {
				super();
				this.file = file;
				this.width = width;
				this.height = height;
			}

			public final int width;

			public final int height;

			public void setImage(final Image image) {
				this.image = image;
			}

			public Image getImage() {
				return image;
			}

			public final Image image;

			public final byte[] getRGBA() {
				final byte[] data = new byte[file.length()];
				ImageIO.write(image, "png", new File(file));
				return data;
			}

		}
	}

