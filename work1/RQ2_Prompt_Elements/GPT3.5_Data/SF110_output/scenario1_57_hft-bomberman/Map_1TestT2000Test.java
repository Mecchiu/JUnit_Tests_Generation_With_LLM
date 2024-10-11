// Here's an example implementation of the Map_1Test class with ten unit test cases for the getTile method:

package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Map_1Test {

    @Test
    void testGetTile() {
        Map map = new Map();
        Tile tile = new Tile(TileType.EMPTY, new Point(0, 0));
        map.MapGrid[0][0] = tile;

        // Test getting a tile within the bounds of the map
        assertEquals(tile, map.getTile(0, 0));

        // Test getting a tile outside the bounds of the map
        assertNull(map.getTile(-1, -1));

        // Test getting a tile on the edge of the map
        assertEquals(tile, map.getTile(Constants.TILE_BORDER - 1, Constants.TILE_BORDER - 1));

        // Test getting a tile on the opposite edge of the map
        assertNull(map.getTile(Constants.TILE_BORDER * Constants.MAP_WIDTH, Constants.TILE_BORDER * Constants.MAP_HEIGHT));

        // Test getting a tile in the middle of the map
        Tile middleTile = new Tile(TileType.EMPTY, new Point(Constants.TILE_BORDER * Constants.MAP_WIDTH / 2, Constants.TILE_BORDER * Constants.MAP_HEIGHT / 2));
        map.MapGrid[Constants.MAP_WIDTH / 2][Constants.MAP_HEIGHT / 2] = middleTile;
        assertEquals(middleTile, map.getTile(Constants.TILE_BORDER * Constants.MAP_WIDTH / 2, Constants.TILE_BORDER * Constants.MAP_HEIGHT / 2));

        // Test getting a tile with non-zero coordinates
        Tile nonZeroTile = new Tile(TileType.EMPTY, new Point(Constants.TILE_BORDER, Constants.TILE_BORDER));
        map.MapGrid[1][1] = nonZeroTile;
        assertEquals(nonZeroTile, map.getTile(Constants.TILE_BORDER * 2, Constants.TILE_BORDER * 2));

        // Test getting a tile with negative x-coordinate
        assertNull(map.getTile(-Constants.TILE_BORDER, Constants.TILE_BORDER));

        // Test getting a tile with negative y-coordinate
        assertNull(map.getTile(Constants.TILE_BORDER, -Constants.TILE_BORDER));

        // Test getting a tile with x-coordinate greater than the map width
        assertNull(map.getTile(Constants.TILE_BORDER * (Constants.MAP_WIDTH + 1), Constants.TILE_BORDER));

        // Test getting a tile with y-coordinate greater than the map height
        assertNull(map.getTile(Constants.TILE_BORDER, Constants.TILE_BORDER * (Constants.MAP_HEIGHT + 1)));
    }
}