// Here's an example implementation of the Challenge_1Test class with ten unit test cases for the dice(int) method:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge_1Test {

    @Test
    void testDiceWithZeroSides() {
        assertThrows(IllegalArgumentException.class, () -> Challenge.dice(0));
    }

    @Test
    void testDiceWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> Challenge.dice(-1));
    }

    @Test
    void testDiceWithOneSide() {
        assertEquals(1, Challenge.dice(1));
    }

    @Test
    void testDiceWithTwoSides() {
        int result = Challenge.dice(2);
        assertTrue(result >= 1 && result <= 2);
    }

    @Test
    void testDiceWithSixSides() {
        int result = Challenge.dice(6);
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    void testDiceWithTenSides() {
        int result = Challenge.dice(10);
        assertTrue(result >= 1 && result <= 10);
    }

    @Test
    void testDiceWithTwentySides() {
        int result = Challenge.dice(20);
        assertTrue(result >= 1 && result <= 20);
    }

    @Test
    void testDiceWithHundredSides() {
        int result = Challenge.dice(100);
        assertTrue(result >= 1 && result <= 100);
    }

    @Test
    void testDiceWithThousandSides() {
        int result = Challenge.dice(1000);
        assertTrue(result >= 1 && result <= 1000);
    }

    @Test
    void testDiceWithMillionSides() {
        int result = Challenge.dice(1000000);
        assertTrue(result >= 1 && result <= 1000000);
    }
}