// DecimalToBinaryTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
	// Test case 1: Test with a positive integer
    @Test
    void testDecimalToBinary1() {
        assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
    }

    // Test case 2: Test with a negative integer
    @Test
    void testDecimalToBinary2() {
        assertEquals("db-110db", DecimalToBinary.decimalToBinary(-6));
    }

    // Test case 3: Test with zero
    @Test
    void testDecimalToBinary3() {
        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
    }

    // Test case 4: Test with a large positive integer
    @Test
    void testDecimalToBinary4() {
        assertEquals("db1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE));
    }

    // Test case 5: Test with a large negative integer
    @Test
    void testDecimalToBinary5() {
        assertEquals("db-1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Integer.MIN_VALUE));
    }

    // Test case 6: Test with a positive decimal
    @Test
    void testDecimalToBinary6() {
        assertEquals("db1010.1db", DecimalToBinary.decimalToBinary(10.5));
    }

    // Test case 7: Test with a negative decimal
    @Test
    void testDecimalToBinary7() {
        assertEquals("db-1010.1db", DecimalToBinary.decimalToBinary(-10.5));
    }

    // Test case 8: Test with a large positive decimal
    @Test
    void testDecimalToBinary8() {
        assertEquals("db1111111111111111111111111111111.1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Float.MAX_VALUE));
    }

    // Test case 9: Test with a large negative decimal
    @Test
    void testDecimalToBinary9() {
        assertEquals("db-1111111111111111111111111111111.1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Float.MIN_VALUE));
    }

    // Test case 10: Test with a non-numeric input
    @Test
    void testDecimalToBinary10() {
        assertEquals("dbNaNdb", DecimalToBinary.decimalToBinary(Double.NaN));
    }
}
