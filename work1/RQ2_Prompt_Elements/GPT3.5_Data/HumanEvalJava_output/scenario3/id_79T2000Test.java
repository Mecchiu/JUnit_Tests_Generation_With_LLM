// DecimalToBinary.java
package scenario3;

class DecimalToBinary {

    /**
     * You will be given a number in decimal form and your task is to convert it to
     * binary format. The function should return a string, with each character representing a binary
     * number. Each character in the string will be '0' or '1'.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     *
     * Examples:
     * - decimalToBinary(15)   # returns "db1111db"
     * - decimalToBinary(32)   # returns "db100000db"
     *
     * > decimalToBinary(0)
     * "db0db"
     * > decimalToBinary(32)
     * "db100000db"
     * > decimalToBinary(103)
     * "db1100111db"
     * > decimalToBinary(15)
     * "db1111db"
     */
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "db0db";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return "db" + binary.toString() + "db";
    }
}

// DecimalToBinaryTest.java
package scenario3;


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
    void testDecimalToBinaryWithPositiveNumber() {
        assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
        assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
    }

    @Test
    void testDecimalToBinaryWithNegativeNumber() {
        assertEquals("db-1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(-1));
        assertEquals("db-100000db", DecimalToBinary.decimalToBinary(-32));
        assertEquals("db-1100111db", DecimalToBinary.decimalToBinary(-103));
        assertEquals("db-1111db", DecimalToBinary.decimalToBinary(-15));
    }
}