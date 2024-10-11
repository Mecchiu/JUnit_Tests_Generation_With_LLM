// DecimalToBinaryTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains one unit test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
// You will be given a number in decimal form. The function should return a string, with each character representing a binary
		// number. Each character in the string will be '0' or '1'.
    @Test
    public void decimalToBinary() {
            assertEquals("0db110db", decimalToBinary(15));
            assertEquals("db0db", decimalToBinary(32));
            assertEquals("db100000db", decimalToBinary(103));
            assertEquals("db1100111db", decimalToBinary(15));
            assertEquals("d0d0db", decimalToBinary(32));
            assertEquals("d100000d0db", decimalToBinary(103));
                 assertEquals("d1100111d0db", decimalToBinary(15));
                 assertEquals("d0db0db", decimalToBinary(32));
                 assertEquals("d100000db0db", decimalToBinary(103));
    }
}

