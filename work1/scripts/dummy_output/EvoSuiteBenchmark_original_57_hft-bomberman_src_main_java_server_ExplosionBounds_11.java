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
		 * Test the method {@link ExplosionBounds#contain(Point)}
		 * for the constructor.
		 */
		@Test
		public void constructorContain( ) {
			new ExplosionBounds(300, 200, 300, 200);
		}

		/**
		* Test the method {@link ExplosionBounds#contain(Point)}
		* for the assignation.
		*/
		@Test
		public void assignment( ) {
			ExplosionBounds b = new ExplosionBounds(300, 200, 300, 200);
			b[0] = 120;
			b[4] = 70;
			b[23] = 30;
			b[13] = 10;
			b[12] = 20;
			b[8] = 90;
			// This will fail when the constructor throws.
			new ExplosionBounds(300, 200, 300, 200);
		}
}