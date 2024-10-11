// FizzBuzzTest.java
package scenario2;


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
        int n = 1;
        int expected = 0;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testFizzBuzz2() {
        int n = 7;
        int expected = 0;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testFizzBuzz3() {
        int n = 11;
        int expected = 1;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testFizzBuzz4() {
        int n = 13;
        int expected = 1;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testFizzBuzz5() {
        int n = 14;
        int expected = 1;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testFizzBuzz6() {
        int n = 77;
        int expected = 2;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testFizzBuzz7() {
        int n = 100;
        int expected = 1;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testFizzBuzz8() {
        int n = 110;
        int expected = 2;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testFizzBuzz9() {
        int n = 130;
        int expected = 2;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testFizzBuzz10() {
        int n = 131;
        int expected = 2;
        int actual = FizzBuzz.fizzBuzz(n);
        assertEquals(expected, actual);
    }
}