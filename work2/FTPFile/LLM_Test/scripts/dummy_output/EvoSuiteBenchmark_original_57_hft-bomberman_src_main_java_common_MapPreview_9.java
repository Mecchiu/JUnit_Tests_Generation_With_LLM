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
		
    private String imageDir = null;

    private MapPreviewTest() {
    }

    /**
     * test method for {@link MapPreview#getMapPreview(int)}
     */
    @Test
    void testGetMapPreview_ResizedFile() {
    	logger.info("testGetMapPreview_ResizedFile");
    	MapPreviewTest.imageDir = "Test ImageDir";
    	mapPreviewIcon = new ImageIcon("src/test/resources/MapPreviewTestS/testResize_mapfile.png");
    	mapPreview = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
    	mapMap = new Map(new AffineTransform(1, 2, 0, 1, 0, 0));
    	System.setProperty("org.apache.log4j.Category", "DEBUG");
    	int width = 100;
    	int height = 100;
    	
        mapPreview = scale(mapPreview, width);
        mapPreview = scale(mapPreview, height);

        File f = new File(mapDir, imageDir);
        int w = f.length();
        int h = w / width;

        System.setProperty("org.apache.log4j.Category", "DEBUG");
        BufferedImage mapped = ImageIO.read(new File(f.getCanonicalPath()));
        //logger.info(mapArea.x + "-" + mapArea.y + " " + width + "x" + height);
        assertEquals(width, mapped.getWidth());
        assertEquals(height, mapped.getHeight());

        mapped = (BufferedImage)AffineTransformOp.getRotatedInstance(mapped);

        logger.debug("before mapWidth=" + width
                                + ", before height = " + height
                                + ", after mapWidth = " + mapped.getWidth()
                                + ", after height = " + mapped.getHeight());

        Point center = new Point(1, 1);
        AffineTransform m = AffineTransform.getScaleInstance(1, 1);
        AffineTransformOp afop = new AffineTransformOp(m,AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        mapped = afop.filter(mapped, new AffineTransform(center.x, center.y,  1., 0., 1., 0.));
        mapped = afop.filter(mapped, AffineTransformOp.getTranslateInstance(center.x+0.1, center.y).createTransformedShape(mapped));
        logger.debug("after the center change after mapWidth = " + mapImageSet);
        assertTrue(mapped.getBounds()!= null);
        assertEquals(width, mapped.getWidth());
        assertEquals(height, mapped.getHeight());

        mapped = (BufferedImage)AffineTransformOp.getRotatedInstance(mapped);

        Logger.getRootLogger().info("After the corner change before the map was resized");
        System.setProperty("org.apache.log4j.Category", "DEBUG");
        mapped = ImageUtils.getImage(imageDir + File.separator + "MapTestS.png");
        BufferedImage outmapped = scale(mapped, width);

        Assert.assertNotNull(outmapped);
        assertTrue(outmapped.getWidth() == width);
        assertTrue(outmapped.getHeight() == height);
        /*

        System.out.println("outmappedWidth = " + outmapped.getWidth());
        System.out.println("outmappedHeight = " + outmapped.getHeight());

        point = new Point(3,3);
        mapArea = point.toString();

        logger.debug("after the corner change after the map was resized into a different size");

        outmapped = ImageUtils.getImage(imageDir + File.separator + "MyImage.png");
        BufferedImage outmapped2 = scale(outmapped, width);

        Assert.assertNotNull(outmapped2);
        assertTrue(outmapped2.getWidth() == outmapped.getWidth());
        assertTrue(outmapped2.getHeight() == outmapped.getHeight());
        */
    }

	@Test
	public void testGetImageMap() {
		logger.info("testGetImageMap");
		mapFile = "src/test/resources/MapPreviewTestS/testResize_mapfile";
		String mapImageSet = "MyMap";
}
}