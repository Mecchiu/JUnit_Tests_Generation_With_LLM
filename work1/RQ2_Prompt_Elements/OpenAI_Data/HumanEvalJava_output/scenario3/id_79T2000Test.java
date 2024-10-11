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
			void testDecimalToBinary() {
				assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
				assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
				assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
				assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
				assertEquals("db111111db", DecimalToBinary.decimalToBinary(63));
				assertEquals("db1000000db", DecimalToBinary.decimalToBinary(64));
				assertEquals("db1000001db", DecimalToBinary.decimalToBinary(65));
				assertEquals("db10000000db", DecimalToBinary.decimalToBinary(128));
				assertEquals("db10000001db", DecimalToBinary.decimalToBinary(129));
				assertEquals("db11111111db", DecimalToBinary.decimalToBinary(255));
			}
}
