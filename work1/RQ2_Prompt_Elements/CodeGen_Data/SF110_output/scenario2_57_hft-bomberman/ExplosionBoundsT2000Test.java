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
		 * Tests the containment of a pixel.
		 */
		@Test
		public void containPix_pixels() {
			assertEquals(true, ExplosionBounds.contain(new Point(1, 1)));
		}
		
		/**
		 * Tests the containment of a pixel.
		 */
		@Test
		public void containPix_line() {
			assertEquals(false, ExplosionBounds.contain(new Point(1, 2)));
		}
		
		/**
		* Tests the containment of a pixel along a specific direction.
		*/
		@Test
		public void containPix_direction() {
			assertEquals(true, ExplosionBounds.contain(new Point(1,1), Direction.UP));
			assertEquals(false, ExplosionBounds.contain(new Point(1,2), Direction.UP));
			assertEquals(true, ExplosionBounds.contain(new Point(1,1), Direction.DOWN));
			assertEquals(false, ExplosionBounds.contain(new Point(1,2), Direction.DOWN));
			assertEquals(true, ExplosionBounds.contain(new Point(1,1), Direction.LEFT));
			assertEquals(false, ExplosionBounds.contain(new Point(1,2), Direction.LEFT));
		}
}