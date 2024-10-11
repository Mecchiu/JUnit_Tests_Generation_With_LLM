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
		
    private final Logger logger = Logger.getLogger( MapPreviewTest.class );
    
	// default constructor
	public MapPreviewTest() {
	}

        public void validateMap(ImageIcon icon1, String mapName1) {
            ImageIcon icon2;
            BufferedImage map;

            logger.info(mapName2(mapName1));
            // check if map is loaded
            try {
                map = IOFactory.getLoadImage(mapName1);
            }
            catch (IOException e) {
                logger.error(e);
                return;
            }

            if (icon1 == null) {
                icon2 = new ImageIcon();
            }
            else if (icon2 == null) {
                return;
            }
            else {
                 icon2.setImage(icon1.getImage());
            }
            if (!icon1.equals( icon2 )) {
                logger.info("Map : " + mapName1 + "is not the same as : " + icon1.getImageName() );
                assertTrue( icon1.equals(icon2) );
            }
        }

	public Vector<ImageIcon> getMapTestVector() {

        Vector<ImageIcon> testVector = new Vector<>();
		ImageIcon testIcon;
		BufferedImage img;

		try {
			logger.info(mapFile);

			// load map
			map = IOFactory.getLoadImage(mapFile);

			// check if map is loaded
			try {
				img = IOFactory.getLoadImage(mapFile + "_" + mapImageSet + ".png");

			}
			catch (IOException e) {

			}

			if (map == null) {
				return testVector;
			}

			if (img.getWidth()!= mapArea.x * Constants.TILE_BORDER) {
				// not loaded before
				return testVector;
			}
			testIcon = new ImageIcon();
			testIcon.setImage(img);

			testVector.add(testIcon);

			Iterator<Tile> it = tileIterator(map);
			while (it.hasNext()) {
				Tile t = it.next();
				ImageIcon i = new ImageIcon();
				i.setImage(t.getIcon());
				testVector.add(i);
				logger.info("TestTile:  " + mapFile + "_" + mapImageSet + " - Tile: " + t.x + "," + t.y + " - " + t.color +" -> " + i.getIcon());
			}
		}
		catch (Exception ex) {
			logger.error( ex);
		}

		return testVector;
	}

	@Test
	public void testImageSet() {
		Tile w = new Tile();

		String mapFile = mapFile + "_" + mapImageSet + ".png";

		// Load the map using Tile.load(ImageFile) to get the tile icon.
		logger.info("Loading map: " + mapFile);
		TileIconLoader tl = new TileIconLoader();
		tl.setTileImageSet(mapFile);
		Tile t = tl.loadImage(mapFile);
		logger.info("Returned tile: " + t.tileIcon.getIconName());

		Point p = t.center;
		TileImageIcon it = new TileImageIcon();
		it.setImage(t.tileIcon.getImage());
		
		// set background color
		int i = t.color;
		int f = iT.COLOR_TILE_STONE;
		logger.info("Color: " + i + " with f = " + f);
		t.tileIcon.setColor(i, f);
		
		
		// set origin of tile border
		p.x = t.borderLeft + t.tileIcon.getWidth() / 2;
		p.y = t.borderTop + t.tileIcon.getHeight() / 2;
		logger.info("Tile border x = " + p.x + ", y = " + p.y);

		t.tileToMap(p);

		// validate
		validateMap(it, mapFile);

                validateMap(t.tileIcon.getImage(), mapFile);

		validateMap(t.tileIcon.getImage2(), mapFile);

	}

	private int mapFile(String mapFileName) {
        return "-".equals(mapFileName)? 0 : Integer.parseInt(mapFile);
	}

	private String mapFile(String mapFileName) {
        return "-".equals(mapFileName)? "" : mapFile;
	}

	private String mapImageSet(String mapPath) {
        return mapPath.endsWith(".png")? "" : mapPath;