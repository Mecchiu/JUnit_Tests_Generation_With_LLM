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

		private static final Logger logger = Logger.getLogger(MapPreviewTest.class);
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is empty.
		*/
		@Test
		void testGetMapPreviewEmptyMap() {
				Map map = new Map();
				MapPreview mapPreview = new MapPreview(map);
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty.
		*/
		@Test
		void testGetMapPreviewNotEmptyMap() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSet() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet("desert");
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set to null.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSetNull() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet(null);
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set to an empty string.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSetEmptyString() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet("");
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set to a non-existing image set.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSetNonExisting() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet("nonExisting");
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set to a non-existing image set.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSetNonExisting2() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet("nonExisting2");
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set to a non-existing image set.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSetNonExisting3() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet("nonExisting3");
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set to a non-existing image set.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSetNonExisting4() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet("nonExisting4");
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.getIconHeight(), 150);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map is not empty and the map image set is set to a non-existing image set.
		*/
		@Test
		void testGetMapPreviewNotEmptyMapImageSetNonExisting5() {
				Map map = new Map();
				map.setMapSize(new Point(10, 10));
				map.setMapArea(new Point(10, 10));
				map.setMapFile("testMap.map");
				map.setMapImageSet("desert");
				map.setMapName("testMap");
				map.setMapTiles(new Vector<Vector<Tile>>());
				for (int i = 0; i < 10; i++) {
						Vector<Tile> row = new Vector<Tile>();
						for (int j = 0; j < 10; j++) {
								Tile tile = new Tile();
								tile.setTileType(TileType.WALL);
								row.add(tile);
						}
						map.getMapTiles().add(row);
				}
				MapPreview mapPreview = new MapPreview(map);
				mapPreview.setImageSet("nonExisting5");
				ImageIcon mapPreviewIcon = mapPreview.getMapPreview(150);
				assertEquals(mapPreviewIcon.getIconWidth(), 150);
				assertEquals(mapPreviewIcon.get