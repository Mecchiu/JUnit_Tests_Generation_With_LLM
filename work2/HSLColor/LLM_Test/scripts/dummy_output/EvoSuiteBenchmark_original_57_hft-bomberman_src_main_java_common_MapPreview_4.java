// MapPreviewTest.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapPreview}.
* It contains one unit test case for the {@link MapPreview#getMapPreview(int)} method.
*/
class MapPreviewTest {
		public static final String testFolder = "test-data/org/jmri/odb/common/testing_data";

		private static final String TEST_MAP_FILE = "JmriODBImage";
		private static final String TEST_MAP_FILE_2 = "test/JmriODBImage";

		private static final int TEST_PADDING = 100;
		private static final Integer TEST_SIZE = 6;
		private static final Integer TEST_WIDTH = 150;

		private static final String TEST_STRING = "This is a test string";

		static {
			TILE_WALL_IMAGE = ImageIO.read(new File(testFolder + File.separator + TEST_STRING));
			TILE_STONE_IMAGE= ImageIO.read(new File(testFolder + File.separator + TEST_STRING + ".png"));
		}

		/**
		 * @param args not used here.
		 * @throws IOException
		 * @throws ClassNotFoundException
		 * @throws InterruptedException
		 */
		@Test
		public void testGetMapPreview(String fileName) throws IOException, ClassNotFoundException, InterruptedException {
			BufferedImage m = ScaleImage(TILE_WALL_IMAGE, TEST_WIDTH);
			BufferedImage expected = ScaleImage(TILE_STONE_IMAGE, TEST_SIZE);
			ImageIcon i = getMapPreview(TEST_SIZE);

			assertEquals("GetImageIcon", i.getImage(), expected);

			if(m!=null) {
				m = ScaleImage(TILE_WALL_IMAGE, TEST_WIDTH);
				i = getMapPreview(TEST_WIDTH);

				assertEquals("Get", expected, i.getImage());
			}


		}

		/**
		 * @throws IOException
		 */
		private BufferedImage ZoomedTileImage(BufferedImage bi, int width, int height) {
			AffineTransformOp op = new AffineTransformOp(new AffineTransform(0.0f, width, 0.0f, height, 0.0f, 0.0f));
			return BIOUtil.convertToBufferedImage(BIOUtil.doubleBuffer(op.filter(bi, AffineTransformOp.TYPE_BILINEAR).getRGBImage()), BIOUtil.doubleBuffer(BIOUtil.doubleBuffer(bi)));
		}
		private boolean ZoomEqualsTile(BufferedImage zi, BufferedImage ci) {
			if(zi!= null)
				return BIOUtil.equals(zi,BIOUtil.doubleBuffer(ci));
			else
				return BIOUtil.equals(zi,null);
		}
		/**
		 * Load a scaled image
		 * @throws IOException
		 * @throws ClassNotFoundException
		 * @throws InterruptedException
		 */
		private BufferedImage ScaleImage(BufferedImage bi, int width, int height)
				throws IOException, ClassNotFoundException, InterruptedException {
			Point p1 = new Point(TEST_PADDING, TEST_PADDING);
			int h = height-TEST_PADDING;
			int w = TEST_PADDING + TEST_WIDTH;

			BufferedImage result = bi;
			if (isScaledTile(li))
				result = ZoomedTileImage(li, width,height);
			if(isScaledTile(ci)&&ZoomEqualsTile(li, ci))
				result = ZoomedTileImage(li, w,h);

			return result;
		}

		/**
		 * @param image
		 * @return BufferedImage
		 */
		private boolean isScaledTile(BufferedImage image) {
			return image!= null &&!image.getHeight(null)==0 &&!image.getWidth(null)==0;
		}

		/**
		 * Gets Icon based on the given Image.
		 *
		 * @param image
		 * @return
		 * @throws IOException
		 */
		private ImageIcon getMapPreview(int width, int height) throws IOException {
			ImageIcon mapPreviewIcon = null;

			BufferedImage bimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

//			System.out.println("Using " + width + "x" + height);

			paint(bimg, mapPreviewIcon);

			return mapPreviewIcon;
		}

		public void paint(BufferedImage bi, ImageIcon imageIcon) {
}
}