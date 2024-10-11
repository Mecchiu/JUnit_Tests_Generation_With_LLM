// FizzBuzzTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
			// Test case 1
    @Test
    void testFizzBuzz1() {
        int result = FizzBuzz.fizzBuzz(1);
        assertEquals(0, result);
    }

    // Test case 2
    @Test
    void testFizzBuzz2() {
        int result = FizzBuzz.fizzBuzz(2);
        assertEquals(0, result);
    }

    // Test case 3
    @Test
    void testFizzBuzz3() {
        int result = FizzBuzz.fizzBuzz(3);
        assertEquals(0, result);
    }

    // Test case 4
    @Test
    void testFizzBuzz4() {
        int result = FizzBuzz.fizzBuzz(4);
        assertEquals(0, result);
    }

    // Test case 5
    @Test
    void testFizzBuzz5() {
        int result = FizzBuzz.fizzBuzz(5);
        assertEquals(0, result);
    }

    // Test case 6
    @Test
    void testFizzBuzz6() {
        int result = FizzBuzz.fizzBuzz(6);
        assertEquals(0, result);
    }

    // Test case 7
    @Test
    void testFizzBuzz7() {
        int result = FizzBuzz.fizzBuzz(7);
        assertEquals(0, result);
    }

    // Test case 8
    @Test
    void testFizzBuzz8() {
        int result = FizzBuzz.fizzBuzz(8);
        assertEquals(0, result);
    }

    // Test case 9
    @Test
    void testFizzBuzz9() {
        int result = FizzBuzz.fizzBuzz(9);
        assertEquals(0, result);
    }

    // Test case 10
    @Test
    void testFizzBuzz10() {
        int result = FizzBuzz.fizzBuzz(10);
        assertEquals(0, result);
    }
}