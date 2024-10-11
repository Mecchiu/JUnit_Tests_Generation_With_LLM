// FizzBuzzTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FizzBuzz}.
 * It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
 */
class FizzBuzzTest {

    @Test
    void testFizzBuzzWithZero() {
        assertEquals(0, FizzBuzz.fizzBuzz(0));
    }

    @Test
    void testFizzBuzzWithOne() {
        assertEquals(0, FizzBuzz.fizzBuzz(1));
    }

    @Test
    void testFizzBuzzWithEleven() {
        assertEquals(1, FizzBuzz.fizzBuzz(11));
    }

    @Test
    void testFizzBuzzWithThirteen() {
        assertEquals(1, FizzBuzz.fizzBuzz(13));
    }

    @Test
    void testFizzBuzzWithFourteen() {
        assertEquals(2, FizzBuzz.fizzBuzz(14));
    }

    @Test
    void testFizzBuzzWithTwentyTwo() {
        assertEquals(2, FizzBuzz.fizzBuzz(22));
    }

    @Test
    void testFizzBuzzWithTwentyThree() {
        assertEquals(3, FizzBuzz.fizzBuzz(23));
    }

    @Test
    void testFizzBuzzWithTwentyFour() {
        assertEquals(3, FizzBuzz.fizzBuzz(24));
    }

    @Test
    void testFizzBuzzWithHundred() {
        assertEquals(15, FizzBuzz.fizzBuzz(100));
    }

    @Test
    void testFizzBuzzWithThousand() {
        assertEquals(150, FizzBuzz.fizzBuzz(1000));
    }
}