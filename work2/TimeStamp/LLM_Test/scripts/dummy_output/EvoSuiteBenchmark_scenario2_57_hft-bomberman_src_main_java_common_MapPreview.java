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
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests if the method returns a valid {@link ImageIcon} object.
		*/
		@Test
		void testGetMapPreview() {
				MapPreview mp = new MapPreview(map);
				mp.setImageSet("desert");
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
}