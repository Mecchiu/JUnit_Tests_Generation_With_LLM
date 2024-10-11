// CarRaceCollisionTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {
    
    @Test
    void testCarRaceCollisionWithZeroCars() {
        int result = CarRaceCollision.carRaceCollision(0);
        assertEquals(0, result);
    }
    
    @Test
    void testCarRaceCollisionWithOneCar() {
        int result = CarRaceCollision.carRaceCollision(1);
        assertEquals(0, result);
    }
    
    @Test
    void testCarRaceCollisionWithTwoCars() {
        int result = CarRaceCollision.carRaceCollision(2);
        assertEquals(4, result);
    }
    
    @Test
    void testCarRaceCollisionWithThreeCars() {
        int result = CarRaceCollision.carRaceCollision(3);
        assertEquals(9, result);
    }
    
    @Test
    void testCarRaceCollisionWithFourCars() {
        int result = CarRaceCollision.carRaceCollision(4);
        assertEquals(16, result);
    }
    
    @Test
    void testCarRaceCollisionWithFiveCars() {
        int result = CarRaceCollision.carRaceCollision(5);
        assertEquals(25, result);
    }
    
    @Test
    void testCarRaceCollisionWithSixCars() {
        int result = CarRaceCollision.carRaceCollision(6);
        assertEquals(36, result);
    }
    
    @Test
    void testCarRaceCollisionWithSevenCars() {
        int result = CarRaceCollision.carRaceCollision(7);
        assertEquals(49, result);
    }
    
    @Test
    void testCarRaceCollisionWithEightCars() {
        int result = CarRaceCollision.carRaceCollision(8);
        assertEquals(64, result);
    }
    
    @Test
    void testCarRaceCollisionWithNineCars() {
        int result = CarRaceCollision.carRaceCollision(9);
        assertEquals(81, result);
    }
}