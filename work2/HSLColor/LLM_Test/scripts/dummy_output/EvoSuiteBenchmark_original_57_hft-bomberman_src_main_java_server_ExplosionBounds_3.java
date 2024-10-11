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
	 * Creates an array of Explosions for testing.
	 * It fills the array with the three objects defined in the {@link ExplosionBounds} class.
	 *
	 * @return The test array.
	 */
	public ExplosionBounds[] createTestArray() {
		ExplosionBounds[] result = {
				new ExplosionBounds(15, 12, 9, 6),
				new ExplosionBounds(11, 10, 6, 5),
				new ExplosionBounds(15, 12, 9, 0),
				new ExplosionBounds(11, 10, 6, 3),
		};
		return result;
	}

	@Test
	public void testCreateArray() {
		ExplosionBounds[] array = createTestArray();
		assertTrue(array.length == 12);
	}
    
}