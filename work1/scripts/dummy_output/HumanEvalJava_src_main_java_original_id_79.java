// DecimalToBinaryTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* It checks if the method returns the correct binary representation of the given decimal number.
			*/
			@Test
			void testDecimalToBinary() {
						assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
						assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
						assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
						assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
						assertEquals("db11111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE));
						assertEquals("db11111111111111111111111111111110db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE - 1));
						assertEquals("db11111111111111111111111111111101db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE - 2));
						assertEquals("db11111111111111111111111111111100db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE - 3));
						assertEquals("db11111111111111111111111111111011db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE - 4));
						assertEquals("db11111111111111111111111111111010db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE - 5));
			}
}