// CountUpperTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
			// Test case 1
    @Test
    void testCountUpper1() {
        String s = "AaEeIiOoUu";
        int expected = 5;
        int actual = CountUpper.countUpper(s);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testCountUpper2() {
        String s = "AaEeIiOoUu";
        int expected = 3;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testCountUpper3() {
        String s = "AaEeIiOoUu";
        int expected = 4;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testCountUpper4() {
        String s = "AaEeIiOoUu";
        int expected = 6;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testCountUpper5() {
        String s = "AaEeIiOoUu";
        int expected = 7;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testCountUpper6() {
        String s = "AaEeIiOoUu";
        int expected = 8;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testCountUpper7() {
        String s = "AaEeIiOoUu";
        int expected = 9;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testCountUpper8() {
        String s = "AaEeIiOoUu";
        int expected = 10;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testCountUpper9() {
        String s = "AaEeIiOoUu";
        int expected = 11;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testCountUpper10() {
        String s = "AaEeIiOoUu";
        int expected = 12;
        int actual = CountUpper.countUpper(s);
        assertNotEquals(expected, actual);
    }
}