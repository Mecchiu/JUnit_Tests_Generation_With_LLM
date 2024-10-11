// ClosestIntegerTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
	// Test case 1: Positive integer
    @Test
    void testClosestInteger1() {
        assertEquals(5, ClosestInteger.closestInteger("5"));
    }

    // Test case 2: Negative integer
    @Test
    void testClosestInteger2() {
        assertEquals(-5, ClosestInteger.closestInteger("-5"));
    }

    // Test case 3: Positive decimal
    @Test
    void testClosestInteger3() {
        assertEquals(5, ClosestInteger.closestInteger("5.3"));
    }

    // Test case 4: Negative decimal
    @Test
    void testClosestInteger4() {
        assertEquals(-5, ClosestInteger.closestInteger("-5.3"));
    }

    // Test case 5: Positive decimal with one decimal place
    @Test
    void testClosestInteger5() {
        assertEquals(5, ClosestInteger.closestInteger("5.1"));
    }

    // Test case 6: Negative decimal with one decimal place
    @Test
    void testClosestInteger6() {
        assertEquals(-5, ClosestInteger.closestInteger("-5.1"));
    }

    // Test case 7: Positive decimal with two decimal places
    @Test
    void testClosestInteger7() {
        assertEquals(5, ClosestInteger.closestInteger("5.01"));
    }

    // Test case 8: Negative decimal with two decimal places
    @Test
    void testClosestInteger8() {
        assertEquals(-5, ClosestInteger.closestInteger("-5.01"));
    }

    // Test case 9: Positive decimal with three decimal places
    @Test
    void testClosestInteger9() {
        assertEquals(5, ClosestInteger.closestInteger("5.001"));
    }

    // Test case 10: Negative decimal with three decimal places
    @Test
    void testClosestInteger10() {
        assertEquals(-5, ClosestInteger.closestInteger("-5.001"));
    }
}
