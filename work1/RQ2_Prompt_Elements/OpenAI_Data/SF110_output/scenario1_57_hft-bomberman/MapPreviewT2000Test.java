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
		
		private static final String MAP_FILE = "testmap";
		private static final String MAP_IMAGE_SET = "desert";
		private static final Point MAP_AREA = new Point(10, 10);
		private static final Point MAP_START_POSITION = new Point(5, 5);
		private static final Point MAP_END_POSITION = new Point(5, 5);
		private static final Vector<Point> MAP_START_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_END_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_WALL_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_STONE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_WATER_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_ICE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FOREST_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SAND_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_MUD_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_RUBBLE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_MAGMA_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_LAVA_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SWAMP_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_MINE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_BASE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FLAG_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_TOWER_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_BRIDGE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_BUILDING_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FACTORY_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_LABORATORY_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_HOSPITAL_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_POWERPLANT_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_RADAR_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SILO_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_STORAGE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_REPAIR_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_RESEARCH_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_MINEFIELD_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_ROAD_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_RIVER_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_CRATER_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_ROCK_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_TREE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_BUSH_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_GRASS_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_HOUSE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FENCE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_DECORATION_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_WRECK_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_RUIN_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_GRAVE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FLAGPOLE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_LAMP_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SIGN_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_CROSS_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_STATUE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FOUNTAIN_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_PALM_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_CACTUS_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_DEADTREE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_STUMP_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_ROCKPILE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_BOULDER_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_ANTHILL_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SPIDERWEB_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FIRE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SMOKE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_EXPLOSION_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SPARK_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_FLAME_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_STEAM_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_BUBBLE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_SPLASH_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_CORPSE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_BLOOD_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OIL_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OILFIRE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OILSLICK_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OILSPILL_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OILPUDDLE_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OILDROP_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OILSPLASH_POSITIONS = new Vector<Point>();
		private static final Vector<Point> MAP_OIL