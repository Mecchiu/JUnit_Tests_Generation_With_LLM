// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplosionBounds}.
* It contains one unit test case for the {@link ExplosionBounds#contain(Point)} method.
*/
class ExplosionBoundsTest {

    /**
     * Test method for
     * {@link ExplosionBounds#contain(Point)}.
     * @throws Exception
     */
	@Test
	public void testGetUp() throws Exception {
		for(int direction=0; direction<4; direction++) {
            assertNotNull(
                    "Expected new object to be returned."
                    " Direction: " + direction
                   , new ExplosionBounds(
                                      (direction-up)&0xFF
                   , (direction-up)&0xFF
                   , (direction-up)&0xFF
                   , (direction-up)&0xFF
                    )
            );
            Point expected = new Point(0, 0);
            assertTrue("Object not returned."
                    + " Direction: " + direction
                   , new ExplosionBounds(
                            expected.x, expected.y,
                                (expected.x+expected.x+expected.x)/4
                   ,  (expected.y+expected.y+expected.y)/4
                    )
                   .contain(expected));
			
		}
	}
	
    /**
     * Test method for
     * {@link ExplosionBounds#contain(Point)}.
     * @throws Exception
     */
	@Test
	public void testGetDown() throws Exception {
		for(int direction=0; direction<4; direction++) {
            assertNotNull(
                    "Expected new object to be returned."
                    " Direction: " + direction
                   , new ExplosionBounds(
                                      (direction-down)&0xFF
                   , (direction-down)&0xFF
                   , (direction-down)&0xFF
                   , (direction-down)&0xFF
                    )
            );
            assertTrue("Object not returned."
                    + " Direction:" + direction
                   , new ExplosionBounds(
                                    (direction-down)&0xFF
                   , (direction-down)&0xFF
                   , (direction-down)&0xFF
                   , (direction-down)&0xFF
                    )
                   .contain(new Point((expected))));
			
		}
	}
	
    /**
     * Test method for
     * {@link ExplosionBounds#contain(Point)}.
     * @throws Exception
     */
	@Test
	public void testGetRight() throws Exception {
		for(int direction=0; direction<4; direction++) {
            assertNotNull(
                    "Expected new object to be returned."
                    " Direction: " + direction
                   , new ExplosionBounds(
                                      (direction-right)&0xFF
                   , (direction-right)&0xFF
                   , (direction-right)&0xFF
                   , (direction-right)&0xFF
                    )
                    );
            assertTrue("Object not returned."
                    + " Direction:" + direction
                   , new ExplosionBounds(
                                    (direction-right)&0xFF
                   , (direction-right)&0xFF
                   , (direction-right)&0xFF
                   , (direction-right)&0xFF
                    )
                   .contain(new Point((expected))));
			
		}
	}

    /**
     * Test method for
     * {@link ExplosionBounds#contain(Point)}.
     * @throws Exception
     */
	@Test
	public void testGetLeft() throws Exception {
		for(int direction=0; direction<4; direction++) {
            assertNotNull(
                    "Expected new object to be returned."
                    " Direction: " + direction
                   , new ExplosionBounds(
                                      (direction-left)&0xFF
                   , (direction-left)&0xFF
                   , (direction-left)&0xFF
                   , (direction-left)&0xFF
                    )
                    );
            Point expected = new Point(0, 0);
            assertTrue("Object not returned."
                    + " Direction: " + direction
                   , new ExplosionBounds(
                            expected.x, expected.y,
                                (expected.x+expected.x+expected.x)/4
                   , (expected.y+expected.y+expected.y)/4
                    )
                   .contain(expected));
			
		}
	}
	
}
