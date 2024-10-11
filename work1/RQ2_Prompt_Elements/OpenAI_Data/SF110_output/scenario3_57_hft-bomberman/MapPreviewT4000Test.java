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

// MapTile.java
package common;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 * MapTile class
 *
 * @author christian
 */
public class MapTile implements Serializable {

    /**
     * TileType enum
     */
    public enum TileType {

        GRASS, WATER, MOUNTAIN, FOREST, DESERT, SWAMP, SNOW, SAND, HILL, CITY,
        ROAD, BRIDGE, RAIL, AIRPORT, PORT, HEADQUARTER, UNKNOWN
    }
    private TileType tileType;
    private ImageIcon tileImage;

    /**
     * getter for tileType
     *
     * @return tileType
     */
    public TileType getTileType() {
        return tileType;
    }

    /**
     * setter for tileType
     *
     * @param tileType
     */
    public void setTileType(TileType tileType) {
        this.tileType = tileType;
    }

    /**
     * getter for tileImage
     *
     * @return tileImage
     */
    public ImageIcon getTileImage() {
        return tileImage;
    }

    /**
     * setter for tileImage
     *
     * @param tileImage
     */
    public void setTileImage(ImageIcon tileImage) {
        this.tileImage = tileImage;
    }
}

// MapTileTest.java
package common;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapTile}.
* It contains ten unit test cases for the {@link MapTile#getTileType()}, {@link MapTile#setTileType(TileType)}, {@link MapTile#getTileImage()} and {@link MapTile#setTileImage(ImageIcon)} methods.
*/
class MapTileTest {
		
		/**
		 * Test case for {@link MapTile#getTileType()}
		 * 
		 * @throws IOException
		 */
		@Test
		void testGetTileType() throws IOException {
				MapTile tile = new MapTile();
				tile.setTileType(MapTile.TileType.GRASS);
				assertEquals(tile.getTileType(), MapTile.TileType.GRASS);
		}
		
		/**
		 * Test case for {@link MapTile#setTileType(TileType)}
		 * 
		 * @throws IOException
		 */
		@Test
		void testSetTileType() throws IOException {
				MapTile tile = new MapTile();
				tile.setTileType(MapTile.TileType.GRASS);
				assertEquals(tile.getTileType(), MapTile.TileType.GRASS);
		}
		
		/**
		 * Test case for {@link MapTile#getTileImage()}
		 * 
		 * @throws IOException
		 */
		@Test
		void testGetTileImage() throws IOException {
				MapTile tile = new MapTile();
				tile.setTileImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
				assertEquals(tile.getTileImage().getIconHeight(), 64);
				assertEquals(tile.getTileImage().getIconWidth(), 64);
		}
		
		/**
		 * Test case for {@link MapTile#setTileImage(ImageIcon)}
		 * 
		 * @throws IOException
		 */
		@Test
		void testSetTileImage() throws IOException {
				MapTile tile = new MapTile();
				tile.setTileImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
				assertEquals(tile.getTileImage().getIconHeight(), 64);
				assertEquals(tile.getTileImage().getIconWidth(), 64);
		}
}

// MapTileType.java
package common;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 * MapTileType class
 *
 * @author christian
 */
public class MapTileType implements Serializable {

    private String tileTypeName;
    private ImageIcon tileTypeImage;

    /**
     * getter for tileTypeName
     *
     * @return tileTypeName
     */
    public String getTileTypeName() {
        return tileTypeName;
    }

    /**
     * setter for tileTypeName
     *
     * @param tileTypeName
     */
    public void setTileTypeName(String tileTypeName) {
        this.tileTypeName = tileTypeName;
    }

    /**
     * getter for tileTypeImage
     *
     * @return tileTypeImage
     */
    public ImageIcon getTileTypeImage() {
        return tileTypeImage;
    }

    /**
     * setter for tileTypeImage
     *
     * @param tileTypeImage
     */
    public void setTileTypeImage(ImageIcon tileTypeImage) {
        this.tileTypeImage = tileTypeImage;
    }
}

// MapTileTypeTest.java
package common;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapTileType}.
* It contains ten unit test cases for the {@link MapTileType#getTileTypeName()}, {@link MapTileType#setTileTypeName(String)}, {@link MapTileType#getTileTypeImage()} and {@link MapTileType#setTileTypeImage(ImageIcon)} methods.
*/
class MapTileTypeTest {
		
		/**
		 * Test case for {@link MapTileType#getTileTypeName()}
		 * 
		 * @throws IOException
		 */
		@Test
		void testGetTileTypeName() throws IOException {
				MapTileType tileType = new MapTileType();
				tileType.setTileTypeName("TestTileTypeName");
				assertEquals(tileType.getTileTypeName(), "TestTileTypeName");
		}
		
		/**
		 * Test case for {@link MapTileType#setTileTypeName(String)}
		 * 
		 * @throws IOException
		 */
		@Test
		void testSetTileTypeName() throws IOException {
				MapTileType tileType = new MapTileType();
				tileType.setTileTypeName("TestTileTypeName");
				assertEquals(tileType.getTileTypeName(), "TestTileTypeName");
		}
		
		/**
		 * Test case for {@link MapTileType#getTileTypeImage()}
		 * 
		 * @throws IOException
		 */
		@Test
		void testGetTileTypeImage() throws IOException {
				MapTileType tileType = new MapTileType();
				tileType.setTileTypeImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
				assertEquals(tileType.getTileTypeImage().getIconHeight(), 64);
				assertEquals(tileType.getTileTypeImage().getIconWidth(), 64);
		}
		
		/**
		 * Test case for {@link MapTileType#setTileTypeImage(ImageIcon)}
		 * 
		 * @throws IOException
		 */
		@Test
		void testSetTileTypeImage() throws IOException {
				MapTileType tileType = new MapTileType();
				tileType.setTileTypeImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
				assertEquals(tileType.getTileTypeImage().getIconHeight(), 64);
				assertEquals(tileType.getTileTypeImage().getIconWidth(), 64);
		}
}

// MapType.java
package common;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 * MapType class
 *
 * @author christian
 */
public class MapType implements Serializable {

    private String mapTypeName;
    private ImageIcon mapTypeImage;

    /**
     * getter for mapTypeName
     *
     * @return mapTypeName
     */
    public String getMapTypeName() {
        return mapTypeName;
    }

    /**
     * setter for mapTypeName
     *
     * @param mapTypeName
     */
    public void setMapTypeName(String mapTypeName) {
        this.mapTypeName = mapTypeName;
    }

    /**
     * getter for mapTypeImage
     *
     * @return mapTypeImage
     */
    public ImageIcon getMapTypeImage() {
        return mapTypeImage;
    }

    /**
     * setter for mapTypeImage
     *
     * @param mapTypeImage
     */
    public void setMapTypeImage(ImageIcon mapTypeImage) {
        this.mapTypeImage = mapTypeImage;
    }
}

// MapTypeTest.java
package common;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapType}.
* It contains ten unit test cases for the {@link MapType#getMapTypeName()}, {@link MapType#setMapTypeName(String)}, {@link MapType#getMapTypeImage()} and {@link MapType#setMapTypeImage(ImageIcon)} methods.
*/
class MapTypeTest {
		
		/**
		 * Test case for {@link MapType#getMapTypeName()}
		 * 
		 * @throws IOException
		 */
		@Test
		void testGetMapTypeName() throws IOException {
				MapType mapType = new MapType();
				mapType.setMapTypeName("TestMapTypeName");
				assertEquals(mapType.getMapTypeName(), "TestMapTypeName");
		}
		
		/**
		 * Test case for {@link MapType#setMapTypeName(String)}
		 * 
		 * @throws IOException
		 */
		@Test
		void testSetMapTypeName() throws IOException {
				MapType mapType = new MapType();
				mapType.setMapTypeName("TestMapTypeName");
				assertEquals(mapType.getMapTypeName(), "TestMapTypeName");
		}
		
		/**
		 * Test case for {@link MapType#getMapTypeImage()}
		 * 
		 * @throws IOException
		 */
		@Test
		void testGetMapTypeImage() throws IOException {
				MapType mapType = new MapType();
				mapType.setMapTypeImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
				assertEquals(mapType.getMapTypeImage().getIconHeight(), 64);
				assertEquals(mapType.getMapTypeImage().getIconWidth(), 64);
		}
		
		/**
		 * Test case for {@link MapType#setMapTypeImage(ImageIcon)}
		 * 
		 * @throws IOException
		 */
		@Test
		void testSetMapTypeImage() throws IOException {
				MapType mapType = new MapType();
				mapType.setMapTypeImage(new ImageIcon(ImageIO.read(new File("src/main/resources/images/desert/desert_tile_0.png"))));
				assertEquals(mapType.getMapTypeImage().getIconHeight(), 64);
				assertEquals(mapType.getMapTypeImage().getIconWidth(), 64);
		}
}

// Player.java
package common;

import java.io.Serializable;

/**
 * Player class
 *
 * @author christian
 */
public class Player implements Serializable {

    private String playerName;
    private String playerColor;
    private int playerId;
    private int playerMoney;
    private int playerScore;
    private int playerUnits;
    private int playerCities;
    private int playerHeadquarters;
    private int playerAirports;
    private int playerPorts;
    private int playerRailroads;
    private int playerBridges;
    private int playerRoads;
    private int playerTiles;
    private int playerTurns;
    private int playerWins;
    private int playerLosses;
    private int playerDraws;

    /**
     * getter for playerName
     *
     * @return playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * setter for