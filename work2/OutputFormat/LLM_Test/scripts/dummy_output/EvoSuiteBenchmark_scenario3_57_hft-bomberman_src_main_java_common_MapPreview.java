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
				map.setMapImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
				map.setMapTiles(new Vector<Vector<MapTile>>());
				for (int i = 0; i < 10; i++) {
						Vector<MapTile> row = new Vector<MapTile>();
						for (int j = 0; j < 10; j++) {
								MapTile tile = new MapTile();
								tile.setTileType(MapTile.TileType.GRASS);
								tile.setTileImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mp = new MapPreview(map);
				mp.setImageSet("desert");
				ImageIcon ii = mp.getMapPreview(150);
				assertEquals(ii.getIconHeight(), 150);
				assertEquals(ii.getIconWidth(), 150);
		}
}