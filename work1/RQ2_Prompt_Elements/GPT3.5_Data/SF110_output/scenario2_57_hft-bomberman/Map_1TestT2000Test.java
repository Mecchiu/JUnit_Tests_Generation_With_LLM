// Here's an example implementation of the Map_1Test class with ten unit test cases for the getTile() method:

package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Map_1Test {

    @Test
    void testGetTile() {
        Map map = new Map();
        Tile tile = new Tile(TileType.EMPTY, new Point(0, 0));
        map.MapGrid[0][0] = tile;

        // Test getting a tile at (0, 0)
        assertEquals(tile, map.getTile(0, 0));

        // Test getting a tile at (1, 1)
        Tile tile2 = new Tile(TileType.WALL, new Point(1, 1));
        map.MapGrid[1][1] = tile2;
        assertEquals(tile2, map.getTile(10, 10));

        // Test getting a tile at (2, 2)
        Tile tile3 = new Tile(TileType.POWERUP, new Point(2, 2));
        map.MapGrid[2][2] = tile3;
        assertEquals(tile3, map.getTile(20, 20));

        // Test getting a tile at (3, 3)
        Tile tile4 = new Tile(TileType.EMPTY, new Point(3, 3));
        map.MapGrid[3][3] = tile4;
        assertEquals(tile4, map.getTile(30, 30));

        // Test getting a tile at (4, 4)
        Tile tile5 = new Tile(TileType.WALL, new Point(4, 4));
        map.MapGrid[4][4] = tile5;
        assertEquals(tile5, map.getTile(40, 40));

        // Test getting a tile at (5, 5)
        Tile tile6 = new Tile(TileType.POWERUP, new Point(5, 5));
        map.MapGrid[5][5] = tile6;
        assertEquals(tile6, map.getTile(50, 50));

        // Test getting a tile at (6, 6)
        Tile tile7 = new Tile(TileType.EMPTY, new Point(6, 6));
        map.MapGrid[6][6] = tile7;
        assertEquals(tile7, map.getTile(60, 60));

        // Test getting a tile at (7, 7)
        Tile tile8 = new Tile(TileType.WALL, new Point(7, 7));
        map.MapGrid[7][7] = tile8;
        assertEquals(tile8, map.getTile(70, 70));

        // Test getting a tile at (8, 8)
        Tile tile9 = new Tile(TileType.POWERUP, new Point(8, 8));
        map.MapGrid[8][8] = tile9;
        assertEquals(tile9, map.getTile(80, 80));

        // Test getting a tile at (9, 9)
        Tile tile10 = new Tile(TileType.EMPTY, new Point(9, 9));
        map.MapGrid[9][9] = tile10;
        assertEquals(tile10, map.getTile(90, 90));
    }
}