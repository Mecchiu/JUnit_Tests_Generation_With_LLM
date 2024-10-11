// Map_2Test.java
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
* It contains one unit test case for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {
		/**
		 * Unit test case for the {@link Map#getAreaByStartPoint(int)} method.
		*/
	@Test
    public void getArea_1(){
                Map grid = new Map_2Test();
                Point point_1 = grid.getAreaByStartPoint(1);
                assertNotNull("Returned area points is null", point_1);
                assertEquals("Returned area point is correct", new Point(2, 3), point_1);
           }
        
        /**
        * Unit test case for the {@link Map#getAreaByStartPoint(int)} method when start point is
        * null.
        */
    @Test
    public void getArea_2(){
                Map grid = new Map_2Test();
}
}