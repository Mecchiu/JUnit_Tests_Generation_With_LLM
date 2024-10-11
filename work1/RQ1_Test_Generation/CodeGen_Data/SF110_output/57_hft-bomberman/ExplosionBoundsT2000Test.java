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
private ExplosionBounds testObj;
		
		public ExplosionBoundsTest() {
			super();
		}

		/**
		 * Creates new ExplosionBoundsTest object.
		 *
		 * @return created new Test object.
		 */
		public static ExplosionBoundsTest newTest() {
			return new ExplosionBoundsTest();
		}
		
		/**
		 * Performs the test for {@link ExplosionBounds#contain(Point)} method.
		 */
		@Test
		public void testContainWithMinAndMax() {
   				this.testObj = ExplosionBounds.newTest();
			assertEquals(true, ExplosionBounds.contain(new Point(0,0)));
			
			assertEquals(true, ExplosionBounds.contain(new Point(1,1)));
			assertEquals(true, ExplosionBounds.contain(new Point(2,1)));
			assertEquals(true, ExplosionBounds.contain(new Point(1,0)));
			assertEquals(true, ExplosionBounds.contain(new Point(0,0)));
			
			assertEquals(false, ExplosionBounds.contain(new Point(0,0)));
			assertEquals(false, ExplosionBounds.contain(new Point(1,1)));
			assertEquals(false, ExplosionBounds.contain(new Point(2,1)));
			assertEquals(false, ExplosionBounds.contain(new Point(1,0)));
	        	assertEquals(false, ExplosionBounds.contain(new Point(0,0)));
		}
}