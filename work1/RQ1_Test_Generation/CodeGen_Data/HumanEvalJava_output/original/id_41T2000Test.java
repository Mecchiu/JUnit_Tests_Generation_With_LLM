// CarRaceCollisionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains one unit test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {

	/**
	 * This test cases shows that
	 * <ol>
	 *   <li>The value of carRaceCollision(4)
	 *   <li>The value of carRaceCollision(7)
	 *   <li>The value of carRaceCollision(3)
	 * </ol>
	*/
	@Test
	public void testTestCase() {
		assertEquals(4, CarRaceCollision.carRaceCollision(4));
		assertEquals(9, CarRaceCollision.carRaceCollision(4));
		assertEquals(16, CarRaceCollision.carRaceCollision(9));
		assertEquals(64, CarRaceCollision.carRaceCollision(16));
		assertEquals(100, CarRaceCollision.carRaceCollision(64));


		
	}// testCase

}
