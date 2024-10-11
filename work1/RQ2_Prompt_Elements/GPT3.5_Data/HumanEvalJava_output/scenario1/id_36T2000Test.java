// FizzBuzzTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
    
    @Test
    void testFizzBuzzWithNegativeNumber() {
        assertEquals(0, FizzBuzz.fizzBuzz(-1));
    }
    
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
    void testFizzBuzzWithSeventeen() {
        assertEquals(1, FizzBuzz.fizzBuzz(17));
    }
    
    @Test
    void testFizzBuzzWithTwentyTwo() {
        assertEquals(0, FizzBuzz.fizzBuzz(22));
    }
    
    @Test
    void testFizzBuzzWithSeventySeven() {
        assertEquals(1, FizzBuzz.fizzBuzz(77));
    }
    
    @Test
    void testFizzBuzzWithOneHundred() {
        assertEquals(1, FizzBuzz.fizzBuzz(100));
    }
    
    @Test
    void testFizzBuzzWithOneHundredAndOne() {
        assertEquals(1, FizzBuzz.fizzBuzz(101));
    }
}