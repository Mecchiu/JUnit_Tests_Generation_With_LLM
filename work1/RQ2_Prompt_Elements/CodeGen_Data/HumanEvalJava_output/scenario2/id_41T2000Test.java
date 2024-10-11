// CarRaceCollisionTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains one unit test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {
private static final Car race = new Car(0, 0, 2);

		@Test
    public void example_noCollision() {
        assertEquals(0, carRaceCollision(1));
    }

    @Test
    public void example_oneCollision() {
        assertEquals(1, carRaceCollision(2));
    }
}

// End of Test.java