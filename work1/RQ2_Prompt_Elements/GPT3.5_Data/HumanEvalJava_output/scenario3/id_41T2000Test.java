// CarRaceCollision.java
package scenario3;

class CarRaceCollision {

    /**
     * * Imagine a road that's a perfectly straight infinitely long line.
     * n cars are driving left to right;  simultaneously, a different set of n cars
     * are driving right to left.   The two sets of cars start out being very far from
     * each other.  All cars move in the same speed.  Two cars are said to collide
     * when a car that's moving left to right hits a car that's moving right to left.
     * However, the cars are infinitely sturdy and strong; as a result, they continue moving
     * in their trajectory as if they did not collide.
     * This function outputs the number of such collisions.
     *
     * > carRaceCollision(2)
     * 4
     * > carRaceCollision(3)
     * 9
     * > carRaceCollision(4)
     * 16
     * > carRaceCollision(8)
     * 64
     * > carRaceCollision(10)
     * 100
     */
    public static int carRaceCollision(int n) {
        return n * n;
    }
}

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
    void testCarRaceCollisionWithTwoCars() {
        assertEquals(4, CarRaceCollision.carRaceCollision(2));
    }

    @Test
    void testCarRaceCollisionWithThreeCars() {
        assertEquals(9, CarRaceCollision.carRaceCollision(3));
    }

    @Test
    void testCarRaceCollisionWithFourCars() {
        assertEquals(16, CarRaceCollision.carRaceCollision(4));
    }

    @Test
    void testCarRaceCollisionWithFiveCars() {
        assertEquals(25, CarRaceCollision.carRaceCollision(5));
    }

    @Test
    void testCarRaceCollisionWithSixCars() {
        assertEquals(36, CarRaceCollision.carRaceCollision(6));
    }

    @Test
    void testCarRaceCollisionWithSevenCars() {
        assertEquals(49, CarRaceCollision.carRaceCollision(7));
    }

    @Test
    void testCarRaceCollisionWithEightCars() {
        assertEquals(64, CarRaceCollision.carRaceCollision(8));
    }

    @Test
    void testCarRaceCollisionWithNineCars() {
        assertEquals(81, CarRaceCollision.carRaceCollision(9));
    }

    @Test
    void testCarRaceCollisionWithTenCars() {
        assertEquals(100, CarRaceCollision.carRaceCollision(10));
    }

    @Test
    void testCarRaceCollisionWithZeroCars() {
        assertEquals(0, CarRaceCollision.carRaceCollision(0));
    }
}