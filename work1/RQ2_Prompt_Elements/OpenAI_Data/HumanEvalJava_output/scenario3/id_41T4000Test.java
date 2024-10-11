// CarRaceCollisionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {

	@Test
	void testCarRaceCollision() {
		assertEquals(4, CarRaceCollision.carRaceCollision(2));
		assertEquals(9, CarRaceCollision.carRaceCollision(3));
		assertEquals(16, CarRaceCollision.carRaceCollision(4));
		assertEquals(64, CarRaceCollision.carRaceCollision(8));
		assertEquals(100, CarRaceCollision.carRaceCollision(10));
	}
}