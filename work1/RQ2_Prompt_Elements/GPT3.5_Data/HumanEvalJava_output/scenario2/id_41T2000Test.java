// CarRaceCollisionTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CarRaceCollision}.
 * It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
 */
class CarRaceCollisionTest {

    @Test
    void testNoCars() {
        int result = CarRaceCollision.carRaceCollision(0);
        assertEquals(0, result);
    }

    @Test
    void testOneCar() {
        int result = CarRaceCollision.carRaceCollision(1);
        assertEquals(0, result);
    }

    @Test
    void testTwoCars() {
        int result = CarRaceCollision.carRaceCollision(2);
        assertEquals(1, result);
    }

    @Test
    void testThreeCars() {
        int result = CarRaceCollision.carRaceCollision(3);
        assertEquals(3, result);
    }

    @Test
    void testFourCars() {
        int result = CarRaceCollision.carRaceCollision(4);
        assertEquals(6, result);
    }

    @Test
    void testFiveCars() {
        int result = CarRaceCollision.carRaceCollision(5);
        assertEquals(10, result);
    }

    @Test
    void testSixCars() {
        int result = CarRaceCollision.carRaceCollision(6);
        assertEquals(15, result);
    }

    @Test
    void testSevenCars() {
        int result = CarRaceCollision.carRaceCollision(7);
        assertEquals(21, result);
    }

    @Test
    void testEightCars() {
        int result = CarRaceCollision.carRaceCollision(8);
        assertEquals(28, result);
    }

    @Test
    void testNineCars() {
        int result = CarRaceCollision.carRaceCollision(9);
        assertEquals(36, result);
    }
}