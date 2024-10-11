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
	 * Constructor for MapPreviewTest.java
	 */
	MapPreviewTest() {
	}

	/**
	 * @test {@link MapPreview#getMapPreview(int)}
     */
    @Test
    public void test01_() {

        // create an empty map, to create one tile with the mapPreview
        try {
            BufferedImage g = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            Tile tile = new Tile();
            tile.setImage(g);
            tile.setData(1);
            Vector<Tile> data = new Vector<Tile>();
            data.add(tile);

            int position = 3;  // create only tile with a middle position, 
                    // (by default we want to be at top left of tile)

            // prepare to draw tile and the map
            ImageTileMap mapTilemap = new ImageTileMap();

            int w = 15;
            int h = 15;

            // Draw tile to map (with no data)
            // tile.setTileData();

            // set map size
            tile.setSize(w, h);

            // set tile position to middle
            // position = 2;
            // test if get map preview works
            assertEquals("tile preview for map", g, mapTilemap.getTilePreview(position));
        } catch (Exception e) {
            fail();
        }
        // test if get map preview works
        assertEquals("tile preview for map", 0, mapTilemap.getTilePreview(2).getImage().getWidth());
        assertEquals("tile preview for map", 0, mapTilemap.getTilePreview(2).getImage().getHeight());
    }
}