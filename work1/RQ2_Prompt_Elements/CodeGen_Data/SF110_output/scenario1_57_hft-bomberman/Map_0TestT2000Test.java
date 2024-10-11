// Map_0Test.java
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
* It contains one unit test case for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {
public int i = 0;
		public float f = 0f;
		public float g = 0f;
		public boolean bool;
		public char c = 'c';
		public char d = 'd';
		public String s = "s";
		public String t = "t";

        public Map_0Test() {
                super();
        }

        @Test
        public void test(){
                System.out.println(i);
                assertEquals(f, map.getTileByIndex(10, 20).getEnergy(), 10);
                assertEquals(g, map.getTileByIndex(10, 20).getX(), 10);
                assertEquals(i, map.getTileByIndex(10, 20).getY());
        }

        @Test
        public void test(){
                assertEquals(c, getTileByIndex(10, 20).getC());
                assertEquals(d, getTileByIndex(10, 20).getD());
        }

        @Test
        public void testAddTile(){
                assertEquals(c, getTile(10, 20).getC());
                assertEquals(d, getTile(10, 20).getD());
                assertTrue(true);
        }
}

/**
* Test class of {@link MapGrid}.
* It contains two unit test cases.
*/
class Map_01Test {
        public MapGrid m = new MapGrid();

        @Test
        public void testEmptyTile(){
                assertEquals(m.getTile(10, 20).getTilePos(), 0, 1);
                assertEquals(m.getTile(10, 20).getEnergy(), 0, 1);
                assertEquals(m.getTile(10, 20).getEnergy(), 0f, 1);
                assertEquals(m.getTile(10, 20).getEnergy(), 0f, 1);
        }

        @Test
        public void testOneTile(){
                assertEquals(m.getTile(10, 20).getTilePos(), 1);
                assertEquals(m.getTile(10, 20).getTilePos(), 1);
                assertEquals(m.getTile(10, 20).getX(), 10);
        }

        @Test
        public void testTwoTiles(){
                assertEquals(m.getTile(10, 20).getTilePos(), 2);
                assertEquals(m.getTile(10, 20).getTilePos(), 2);
                assertEquals(m.getTile(10, 20).getTilePos(), 2);
        }

}
//  MapGrid.java

