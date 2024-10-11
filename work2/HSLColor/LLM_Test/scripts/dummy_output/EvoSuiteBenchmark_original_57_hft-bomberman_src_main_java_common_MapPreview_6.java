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
		class TestTmpImage extends ImageIcon implements ImageIcon {
			private File file;

			TestTmpImage(File file) {
				this.file = file;
			}

			public Image getImage() {
				return getImage(getWidth(), getHeight());
			}

			public String getToolTipText() {
				return "ToolTipText";
			}

			public ImageIcon getSmallIcon() {
				return null;
			}

			public String toString() {
				return (new File(file.getAbsolutePath())).getName();
			}

			public Point getToolTipPoint(Point p) {
				return (p);
			}
		}

	private TestTmpImage tmp = new TestTmpImage("src/test/resources/image/tile.png");
	private TestTmpImage tmpWalled = new TestTmpImage("src/test/resources/image/tile.png");
	//private TestTmpImage tmpStone = new TestTmpImage("src/test/resources/image/tile.png");

	/**
* tests for the {@link MapPreview#getMapPreview(int)} method
*
* @throws Exception
*/
@Test
public void testLoadImage()
        throws Exception {
        String mapImageSet = "src/test/resources/map/";
		File data = new File(mapImageSet + "test-data/**");
		File dataWalled = new File(mapImageSet + "test-data/2**");
		File dataWalledWalled = new File(mapImageSet + "test-data/2**");
		File dataStone = new File(mapImageSet + "test-data/3**");
        try {
            Image iconWald = ImageIO.read(dataWalled.toURI().toURL());
            Image iconStone = ImageIO.read(dataStone.toURI().toURL());
            ImageIcon iconWalled = ImageIO.read(dataWalled.toURI().toURL());
            //ImageIcon iconStone = ImageIO.read(dataStone.toURI().toURL());
            //ImageIcon iconWalled = ImageIO.read(dataWalledToFile.toURI().toURL());
            ImageIcon iconStoneWalled = ImageIO.read(dataStoneToFile.toURI().toURL());

        } catch (Exception e) {
            logger.error(e);
            assertTrue(false);
            return;
        }
        MapPreview mapPreview;
        mapPreview = new MapPreview(mapMap = new Map(150, 150, mapImageSet + "desert", mapImageSet));
        mapPreview.setSmallIcon(tmp);
        mapPreview.addToMapMap(50.50f, 50.50f, 0.05f, Color.GRAY);
        assertEquals(tmp, tmp.getSmallIcon());

        mapPreview = new MapPreview(mapMap = new Map(150, 150, mapImageSet + "desert", mapImageSet));
        mapPreview.setSmallIcon(tmpWalled);
        mapPreview.addToMapMap(50.50f, 50.50f, 0.05f, Color.GRAY);
        assertEquals(tmpWalled, tmpWalled.getSmallIcon());

        mapPreview = new MapPreview(mapMap = new Map(150, 150, mapImageSet + "desert", mapImageSet));
        mapPreview.setSmallIcon(tmpWalledWalled);
        mapPreview.addToMapMap(50.50f, 50.50f, 0.05f, Color.RED);
        assertEquals(tmpWalled, tmpWalledWalled.getSmallIcon());

        mapPreview = new MapPreview(mapMap = new Map(150, 150, mapImageSet + "desert", mapImageSet));
        mapPreview.setSmallIcon(tmpStone);
        mapPreview.addToMapMap(50.50f, 50.50f, 0.05f, Color.BLUE);
        System.out.println(tmpStone);
        assertEquals(tmpStone, tmpStone.getSmallIcon());

        mapPreview = new MapPreview(mapMap = new Map(150, 150, mapImageSet + "desert", mapImageSet));
        mapPreview.setSmallIcon(tmpStoneWalled);
        mapPreview.addToMapMap(50.50f, 50.50f, 0.05f, Color.BLUE);
        System.out.println(tmpStoneWalled);
        assertEquals(tmpStone, tmpStone.getSmallIcon());
}
}