// Here's the source code for DecimalToBinaryTest.java

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link DecimalToBinary}.
 * It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
 */
class DecimalToBinaryTest {

    @Test
    void testDecimalToBinaryWithZero() {
        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
    }

    @Test
    void testDecimalToBinaryWithOne() {
        assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
    }

    @Test
    void testDecimalToBinaryWithTwo() {
        assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
    }

    @Test
    void testDecimalToBinaryWithThree() {
        assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
    }

    @Test
    void testDecimalToBinaryWithTen() {
        assertEquals("db1010db", DecimalToBinary.decimalToBinary(10));
    }

    @Test
    void testDecimalToBinaryWithFifteen() {
        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
    }

    @Test
    void testDecimalToBinaryWithSixtyNine() {
        assertEquals("db1000101db", DecimalToBinary.decimalToBinary(69));
    }

    @Test
    void testDecimalToBinaryWithOneHundred() {
        assertEquals("db1100100db", DecimalToBinary.decimalToBinary(100));
    }

    @Test
    void testDecimalToBinaryWithNegativeNumber() {
        assertEquals("db-101db", DecimalToBinary.decimalToBinary(-5));
    }

    @Test
    void testDecimalToBinaryWithMaxValue() {
        assertEquals("db1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE));
    }
}