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
// MapPreview.java
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

/**
 * create a ImageIcon Map Preview of a map object
 *
 * usage example: MapPreview mp = new MapPreview(map); mp.setImageSet("desert");
 * (optional) ImageIcon ii = mp.getMapPreview(150);!!
 *
 * @author christian
 */
public class MapPreview {

    /**
     * returns preview of current map
     *
     * @param previewWidth -
     *            Width of preview. Proportions are constrained
     * @return BufferedImage with map preview
     */
    public ImageIcon getMapPreview(int previewWidth) {
        // check if file is available, file name is identical to
        // xml file with appended.png
        File checkFile = new File(mapFile + "_" + mapImageSet + ".png");
        if (checkFile.exists()) {
            logger.info("Loading map preview: " + checkFile.getName());
            BufferedImage mapPreview;
            try {
                mapPreview = ImageIO.read(new File(mapFile + "_" + mapImageSet + ".png"));
                mapPreviewIcon = new ImageIcon();
                mapPreviewIcon.setImage((Image) mapPreview);
            } catch (IOException e) {
                logger.error(e);
            }
        } else {
            // image not found, create it
            logger.info("Creating map preview: " + checkFile.getName());
            // preload images
            TILE_WALL_IMAGE = LoadImage("wall");
            TILE_STONE_IMAGE = LoadImage("stone");
            mapPreviewIcon = new ImageIcon();
            mapPreview = new BufferedImage(mapArea.x * Constants.TILE_BORDER, mapArea.y * Constants.TILE_BORDER, BufferedImage.TYPE_INT_RGB);
            // draw map to BufferedImage
            drawMap();
            try {
                ImageIO.write(scale(mapPreview, previewWidth), "png", checkFile);
            } catch (Exception e) {
                logger.error("Caught in getMapPreview(): " + e);
            }
            // return / resize and return
            if (previewWidth == (mapArea.x * Constants.TILE_BORDER)) {
                mapPreviewIcon.setImage((Image) mapPreview);
            } else {
                mapPreviewIcon.setImage((Image) scale(mapPreview, previewWidth));
            }
        }
        return mapPreviewIcon;
    }
}

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
		private ImageIcon mapPreviewIcon;
		private static int width;
		private static int height;
		private static BufferedImage map;
		private static Vector<Image> mapImages;
		// constructor is called once for each file in this class
		/**
		 * Constructor of MapPreviewTest. It can be used for one unit test case
		 *
		 * @param imageFilename Name of file in which the map image will be located
		 * @param width width of preview
		 * @param height height of preview
		 */
		public MapPreviewTest(String imageFilename, int width, int height) {
			try {
                map = MapFactory.getMap(imageFilename);
                width = width;
                height = height;
                mapImages = new Vector();
                ImageIcon mapPreviewImage = new ImageIcon(map.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
				mapPreviewIcon = mapPreviewImage;
			} catch (Exception e) {
				System.err.println(e);
			}
		}

		@Test
		public void testGetMapPreview() {
            logger.info("Creating Test Map preview icon");
            // the mapPreview may not always be created. So create all
            // new images first
            // before we test the getMapPreview() method.
            // (this will call getImagesToDisplay())
            int newHeight = mapArea.y * Constants.TILE_BORDER_HEIGHT;
            int newWidth = mapArea.x * width;
            try {
                BufferedImage mapPreview = ScaleImage(newWidth, newHeight);
                mapPreview = ImageIcon.createImage("images/map_wgt1.bmp");
                mapPreview = scale(mapPreview, scaleWidth);
                // add new images
                int j = 0;
                for (Point p : map.getImage().getTileSize()) {
                    mapImages.add(scale(mapPreview, scaleWidth));
                    mapImages.set(j, mapPreview);
                    j++;
                }
                // new previews of this image are different
                assertNotNull("No preview returned", mapPreview);
                assertNotNull("No MapPreview of this image is null", map);
                assertTrue("Preview does not match expected", mapPreviewIcon.getImage().equals((Image) scale(mapPreview, scaleWidth)));
                // get the preview
                mapPreview = getMapPreview(width);
                assertNotNull("No MapPreview of this image is null", map);
                assertTrue("Preview does not match expected", mapPreviewIcon.getImage().equals((Image) scale(mapPreview, scaleWidth)));
                assertTrue("Preview does not match expected", mapPreview.equals(map));
                assertTrue("Preview did not contain equal areas!", mapPreview.equals(map));
			} catch (UnsupportedOperationException e) {
                fail("UnsupportedOperationException exception");
            }
		}

		@Test
		public void testGetRegion() throws UnsupportedOperationException, IOException {
			Vector<Rect> regions = new Vector();
			// first create the region of the map
			rectOfMap(mapPreviewIcon);
			regions.add(rectOfMap);
			// add another tile's region
			Vector<Rect> toAdd = new Vector();
			int start = 0;
			int end = width * width;
			int step = end - start;
			if (step > 0) {
                for (int y = start; y < end; y++) {
                    toAdd.clear();
                    for (int x = 0; x < width; x++) {
                        rectOfMap(getTile(x, y));
                    }
                    regions.add(toAdd);
                    start += width;
                }
            }
			// get the same region twice
			for (Vector.Element i : regions) {
				Rect r = (Rect) i;
				Rect r2 = (Rect) i;
				regions.clear();
				assertTrue("Region does not contain expected area!", r2.contains(rOfMap));
			}
		}

		private static Rect rectOfMap(ImageIcon icon) {
			Rect r = new Rect(0, 0, 100, 100);
			// draw the map area
			Graphics g = icon.getImage().getGraphics();
			if (g instanceof Graphics2D) {
				((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g.drawRenderedImage(map, null);
			}
			// get the image size
			g.drawImage(icon.