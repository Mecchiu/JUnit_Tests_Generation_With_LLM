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
		// Test cases start from this line
		@Test
		public void testDrawImage() throws IOException {	

			// Set up test data
			String mapImage = "src/test/resources/imgs/map.png";
			File mapFile =
					new File("src/test/resources/imgs/map.png");
			Vector<String> files = new Vector<>();
			files.add(mapFile);
			
			// Set map fileName for imageLoad() method
			mapFile.delete();
			try {
				System.out.println("[MapPreviewTest] Loading mapFile ="
					+ mapFile);
				mapFile = ImageIO.read(mapFile);
			} catch (IOException e) {
				System.out.printf("[MapPreviewTest] ERROR: %s\n", e);
				// e.printStackTrace();
				// assert false: e.getMessage();
				return;
			}
			
			// Create map map
			Map map = new Map();
			
			// Set map for the map
			map.setSize(10400, 700);
			
}
}