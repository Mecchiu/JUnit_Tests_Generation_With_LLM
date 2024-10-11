// CarRaceCollisionTest.java
package original;


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
				assertEquals(144, CarRaceCollision.carRaceCollision(12));
				assertEquals(196, CarRaceCollision.carRaceCollision(14));
				assertEquals(256, CarRaceCollision.carRaceCollision(16));
				assertEquals(324, CarRaceCollision.carRaceCollision(18));
				assertEquals(400, CarRaceCollision.carRaceCollision(20));
			}
}
