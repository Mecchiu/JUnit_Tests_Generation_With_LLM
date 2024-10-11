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
* It contains ten unit test cases for the {@link MapPreview#getMapPreview(int)} method.
*/
class MapPreviewTest {

		/**
		 * Test case for {@link MapPreview#getMapPreview(int)}
		 * 
		 * @throws IOException
		 */
		@Test
		void testGetMapPreview() throws IOException {
				Map map = new Map();
				map.setMapName("TestMap");
				map.setMapDescription("TestMapDescription");
				map.setMapAuthor("TestMapAuthor");
				map.setMapSize(new Point(10, 10));
				map.setMapImageSet("desert");
				map.setMapImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_background.png"))));
				map.setMapBackground(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_background.png"))));
				map.setMapForeground(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_foreground.png"))));
				map.setMapGrid(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_grid.png"))));
				map.setMapGridSize(new Point(32, 32));
				map.setMapGridOffset(new Point(0, 0));
				map.setMapGridColor(Color.BLACK);
				map.setMapGridAlpha(0.5f);
				map.setMapGridVisible(true);
				map.setMapGridSnap(true);
				map.setMapGridSnapTolerance(5);
				map.setMapGridSnapColor(Color.RED);
				map.setMapGridSnapAlpha(0.5f);
				map.setMapGridSnapVisible(true);
				map.setMapGridSnapSize(new Point(32, 32));
				map.setMapGridSnapOffset(new Point(0, 0));
				map.setMapGridSnapRotation(0);
				map.setMapGridSnapFlip(false);
				map.setMapGridSnapMirror(false);
				map.setMapGridSnapProportional(false);
				map.setMapGridSnapKeepRatio(false);
				map.setMapGridSnapKeepRatioMin(0.5f);
				map.setMapGridSnapKeepRatioMax(2.0f);
				map.setMapGridSnapKeepRatioStep(0.1f);
				map.setMapGridSnapKeepRatioLock(false);
				map.setMapGridSnapKeepRatioLockMin(0.5f);
				map.setMapGridSnapKeepRatioLockMax(2.0f);
				map.setMapGridSnapKeepRatioLockStep(0.1f);
				map.setMapGridSnapKeepRatioLockValue(1.0f);
				map.setMapGridSnapKeepRatioLockVisible(true);
				map.setMapGridSnapKeepRatioLockColor(Color.BLUE);
				map.setMapGridSnapKeepRatioLockAlpha(0.5f);
				map.setMapGridSnapKeepRatioLockSize(new Point(32, 32));
				map.setMapGridSnapKeepRatioLockOffset(new Point(0, 0));
				map.setMapGridSnapKeepRatioLockRotation(0);
				map.setMapGridSnapKeepRatioLockFlip(false);
				map.setMapGridSnapKeepRatioLockMirror(false);
				map.setMapGridSnapKeepRatioLockProportional(false);
				map.setMapGridSnapKeepRatioLockKeepRatio(false);
				map.setMapGridSnapKeepRatioLockKeepRatioMin(0.5f);
				map.setMapGridSnapKeepRatioLockKeepRatioMax(2.0f);
				map.setMapGridSnapKeepRatioLockKeepRatioStep(0.1f);
				map.setMapGridSnapKeepRatioLockKeepRatioLock(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockMin(0.5f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockMax(2.0f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockStep(0.1f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockValue(1.0f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockVisible(true);
				map.setMapGridSnapKeepRatioLockKeepRatioLockColor(Color.BLUE);
				map.setMapGridSnapKeepRatioLockKeepRatioLockAlpha(0.5f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockSize(new Point(32, 32));
				map.setMapGridSnapKeepRatioLockKeepRatioLockOffset(new Point(0, 0));
				map.setMapGridSnapKeepRatioLockKeepRatioLockRotation(0);
				map.setMapGridSnapKeepRatioLockKeepRatioLockFlip(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockMirror(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockProportional(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatio(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioMin(0.5f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioMax(2.0f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioStep(0.1f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLock(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockMin(0.5f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockMax(2.0f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockStep(0.1f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockValue(1.0f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockVisible(true);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockColor(Color.BLUE);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockAlpha(0.5f);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockSize(new Point(32, 32));
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockOffset(new Point(0, 0));
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockRotation(0);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockFlip(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockMirror(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockProportional(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockKeepRatio(false);
				map.setMapGridSnapKeepRatioLockKeepRatioLockKeepRatioLockKeepRatioMin(