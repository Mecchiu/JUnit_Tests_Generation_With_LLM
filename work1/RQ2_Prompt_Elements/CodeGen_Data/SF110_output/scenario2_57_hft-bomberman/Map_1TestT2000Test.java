// Map_1Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {
/**
		* Method for assert
		*
		* @throws NoSuchElementException
		* @throws NullPointerException
		* @throws IllegalArgumentException
		*/
    @Test
    public void assertGetTile() throws NoSuchElementException, NullPointerException {
        // Vector<Tile>
        Vector<Tile> v = new Vector();
        // Point
        Vector<Object> vX = new Vector();
        VectorialIterator <Tile, Object> vx = (VectorialIterator <Tile, Object>) MapGrid[1][2];

    }

		/**
		* Unit test for getTile() method.
		*/
    @Test
    public void getTile() throws Exception {
        assertEquals(Tile.tileData[1][2][1], getTile(200, 300));
        assertEquals(Tile.tileData[1][2][0], getTile(200, 300));
        assertEquals(Tile.TILE_X_OVER_ALL, getTile(200));
        assertEquals(Tile.TILE_Y_OVER_ALL, getTile(300));
    }

    /**
		* Unit test for Iterator
		*
		*/
    @Test
    public void iterator() throws Exception {
        Vector<Tile> v = new Vector();
        int h = 200;
        int w = 300;
        int t = 0;
        Tile t1 = null;
        Tile t2 = null;

        // Iterate over vertical tiles
        Point p1 = new Point(h, h+1);
        Point p2 = new Point(h, h+2);
        int r = 5;

        for (Iterator it = MapGrid[h][t].iterator(); it.hasNext();) {
            v.add((Tile) it.next());
        }

        for (int i = 0; v.size() > i; i++) {
            Tile tile = (Tile) v.get(i);
            Iterator<Tile> it1 = tile.iterator();

            // iterator over horizontal tiles
            for (int q = 0; q < r and tile.getx() <= w; q++) {
                p1.x = q;
                p2.x = q;
                t = tile.getx();
                Tile t1 = new Tile();

                for (;it1.hasNext();) {
                    t1 = (Tile) it1.next();
                    if (p2.x <= t1.getx() and t1.getx() <= p1.x and p2.y <= t1.gety() and t1.gety() <= p1.y) {
                        break;
                    }
                }

                if (t1 == null) {
                    it1 = tile.iterator();
                }

                t2 = (Tile) it1.next();

                // get tile object at this point
                t2 = (Tile) MapGrid[t1.gety()][t1.getx()];

                // if the tile is not null, see if it was found
                if (t2!= null) {
                    Tile t = new Tile();
                    Tile t1;
                    try {
                        t1 = (Tile) t2;
                    } catch (ClassCastException e) {
                        throw new UnsupportedOperationException("Unsupported tile class.");
                    }
                    boolean exist = false;

                    // iterate over tile and find the tile with highest x position to be found
                    for (t1 = 0; t1 < tile.getx(); t1++) {
                        Map m = MapMap[t1];
                        if (exist!= m.getTile(t1, t2)!= null) {
                            exist = true;
                        }
                    }

                    // if not found, test failed
                    if (!exist) {
                        System.out.println("Tile not found. " + tile + " " + t1 + " " + t1.getx() + " " + t1.gety());
                        return;
                    }
                } else {
                    System.out.println("Tile is null:" + t1);
                }
            }
        }
    }

        /**
		* Unit test for Iterator
		*
		* @throws UnsupportedOperationException
		*/
    @Test(expected = UnsupportedOperationException.class)
    public void iterator_1() throws UnsupportedOperationException {
        Iterator<Tile> it = Map.getTile(200, 300).iterator();
        it.next();
        it.remove();
    }

    /**
     * Unit test for setTile() method
     */
    @Test(expected = UnsupportedOperationException.class)
    public void setTile() throws UnsupportedOperationException {
        VectorialIterator <Tile, String> vi = (VectorialIterator <Tile,?>) MapGrid[10][5];

    }
}
