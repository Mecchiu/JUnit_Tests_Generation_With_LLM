// CarRaceCollisionTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains one unit test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {
@Test
		void carRaceCollision() {
            CarRaceCollision obj = new CarRaceCollision();
            obj.carRaceCollision(4);
            obj.carRaceCollision((4 * 10));
            obj.carRaceCollision(((4 * 10) + 1) / 2);
            obj.carRaceCollision(3 * 3);
            assertEquals(6, obj.carRaceCollision(2));
            assertEquals(2, obj.carRaceCollision(3));
            obj.carRaceCollision(2 * 2);
            assertEquals(2, obj.carRaceCollision(4));
            assertEquals(3, obj.carRaceCollision(-10));
            assertEquals(4, obj.carRaceCollision(-1));
        }
}