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
		@Test
		public void test1() {
			try {
				BufferedImage bi1 = LoadImage("1.jpg");
				assertNotNull("Failed to load 1.jpg", bi1);
				System.out.println("1.jpg loaded");
				BufferedImage bi2 = LoadImage("2.jpg");
				assertNotNull("Failed to load 2.jpg", bi2);
				System.out.println("2.jpg loaded");
				BufferedImage bi3 = LoadImage("3.jpg");
				System.out.println("3.jpg loaded");
				assertNotNull("Failed to load 3.jpg", bi3);
				System.out.println("3.jpg loaded");
				BufferedImage bi4 = LoadBinary("4.jpg");
				System.out.println("4.jpg loaded");
				assertNotNull("Failed to load 4.jpg", bi4);
				System.out.println("4.jpg loaded");
				BufferedImage bi5 = LoadBinary("5.jpg");
				System.out.println("5.jpg loaded");
				assertNotNull("Failed to load 5.jpg", bi5);
				System.out.println("4.jpg loaded");
				MapPreview mp1 = new MapPreview(bi1);
				mp1.setImageSet("desert");
				ImageIcon ii1 = mp1.getMapPreview(150);
				assertNotNull("Failed to create preview", ii1);
				System.out.println("1.jpg loaded");
				ImageIcon ii2 = mp1.getMapPreview(150);
				assertNotNull("Failed to find previous image on screen", ii2);
				//
				BufferedImage bi = DrawTest(ii2, 150);
				BufferedImage bi3 = DrawTest(ii1, 150);
				BufferedImage bi4 = DrawTest(ii2, 1000);
				BufferedImage bi5 = DrawTest(ii1, 150);
				//
				assertEquals("Different size of image", bi1.getWidth(), bi2.getWidth());
				assertEquals("Different size of image", bi1.getHeight(), bi2.getHeight());
				TestDrawerTest(bi);
				TestDrawerTest(bi3);
				try {
					TestDrawerTest(bi4);
	                TestDrawerTest(bi5);
				} catch (Exception e) {
					System.err.println("Dummy test failed!");
				}
				System.out.println("TEST PASSED!");
			} catch (IllegalArgumentException e) {
				System.err.println("TEST failed: " + e.getMessage());
			} catch (Exception e) {
				System.err.println("TEST failed: " + e.getMessage());
				//
			}
		}
		private void TestDrawerTest(BufferedImage img1) {
			int pixel1 = img1.getRGB(4, 4);
			ImageIcon ii = DrawTest(img1, 300);
			int pixel2 = DrawTest(ii, 300);
			int pixel3 = DrawTest(ii, 150);

			assertEquals("Different coordinates on screen", pixel1, pixel2);
			assertEquals("Different coordinates on screen", pixel1, pixel3);
		}
}

/**
* Test class of {@link MapPreviewTest}.
* It contains one unit test case for the {@link MapPreviewTest#DrawTest} method.
*/
class DrawTest {
		@Test
		public void test1() {
			try {
				BufferedImage bi1 = LoadSampleImage();
				System.out.println("Sample Image loaded");
				BufferedImage bi2 = DrawTest(bi1, 100);
				int pixel1 = bi2.getRGB(4, 4);
				System.out.println("Sample Image loaded");
				System.out.println("pixel1 = " + pixel1);
				int pixel2 = DrawTest(bi1, 100);
				int pixel3 = DrawTest(bi1, 150);
				System.out.println("pixel1 = pixel2");
				System.out.println("pixel1 = " + pixel2);
				System.out.println("pixel1 = " + pixel3);
			} catch (Exception e) {
				// TODO(user): handle this throwout
				System.err.println("Dummy test failed!");
			}
		}
		private BufferedImage DrawTest(BufferedImage bi1, int targetWidth) {
			MapPreview myMap = new MapPreview(bi1);
			myMap.setImageSet("desert");
}
}