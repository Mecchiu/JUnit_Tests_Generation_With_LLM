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
		
    /**
     * Test of drawTile method, of class {@link MapPreview}.
     */
    @Test
    public void test_drawTile() throws IOException {
        int originalWidth = 160;
        int originalHeight = 160;
		String targetDir = TestFileUtilities.createTempDirectoryAndClose();
		File file = TestFileUtilities.createTempFile(targetDir, "test");
        int targetWidth = file.exists()? (int) file.length() : 0;
        int targetHeight = file.exists()? (int) file.length() : 0;
        boolean mapOpen = false;
        if (mapOpen) {
            logger.info("Closing mapImage for test");
            getMapImageSet().setLevel(Color.black);
            file.delete();
        }
        int originalTileWidth = MapPreview.TILE_IMAGE_WIDTH;
        int originalTileHeight = MapPreview.TILE_IMAGE_HEIGHT;
        int tileWidth = originalWidth / originalTileHeight;
        int tileHeight = originalHeight / originalTileWidth;

        ImageIcon ic = null;
		AffineTransform affine = new AffineTransform();

        logger.info("Creating image");
        
        File mapImage = new File(targetDir + File.separator + "test.map");

        BufferedImage mapFile = null;
		try {
            mapFile = ImageIO.read(mapImage);
			AffineTransformOp affineOp = new  AffineTransformOp(affine);
			affineOp.setTransform(AffineTransform.getScaleInstance(tileWidth, tileHeight), AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
			ic = new ImageIcon(affineOp.filter(mapFile, null));
			
        }
        catch(Exception e) {
        	// if ImageIO throws an exception we don't need to close mapImage, we just need to close it
        	logger.error("Error with loading test image image", e);
        }

		if (ic!= null) {
			logger.info("Created image");			
			ic.setImage(mapFile);
			mapPreviewIcon = ic;
		}
		else {
            ic = new ImageIcon("ImageIO-Test-1.png");
            logger.info("Unable to create ImageIcon, image from TestImageUtilities Class.");
			
		}
        mapPreview = scale(ic.getImage(), originalWidth, originalHeight);
                
        BufferedImage TILE_WALL_IMAGE  = ImageLoading.loadImageFromFile(targetDir + File.separator
			+ mapFile.getName(), null);
        BufferedImage TILE_STONE_IMAGE  = new BufferedImage(TILE_WALL_IMAGE.getWidth(), TILE_WALL_IMAGE.getHeight(), BufferedImage.TYPE_INT_RGB);
        AffineTransformOp opacity = new  AffineTransformOp(AffineTransformOp.TYPE_ADD);
        opacity.transform(TILE_STONE_IMAGE.getGraphics());

        int widthTiles = TILE_WALL_IMAGE.getWidth();
        int heightTiles = TILE_WALL_IMAGE.getHeight();

        imageOverlap(TILE_WALL_IMAGE, TILE_STONE_IMAGE, widthTiles,heightTiles, tileWidth + 1, tileHeight + 1);

        imageColorize(TILE_WALL_IMAGE, TILE_WALL_IMAGE.getRaster(), Color.WHITE);
        imageColorize(TILE_STONE_IMAGE, TILE_STONE_IMAGE.getRaster(), Color.BLACK);

        assertNotNull("Image opened correctly for test", mapPreviewIcon);
        assertEquals("Wrong size returned for test map: " + mapFile.getAbsolutePath(), mapFile.getWidth(), mapPreview.getWidth());
        assertEquals("Wrong size returned for test map: " + mapFile.getAbsolutePath(), mapFile.getHeight(), mapPreview.getHeight());
        assertEquals("Wrong map preview w/o a zoom level", originalWidth, mapPreview.getWidth());
        assertEquals("Wrong map preview hic without zoom level", originalHeight, mapPreview.getHeight());
        logger.info("TEST OK");      
    }

    /**
     * Returns a String array with name(s) of all image directories found
     * in class path
     *
     * @return String array with name(s) of all image directories found
     */
}