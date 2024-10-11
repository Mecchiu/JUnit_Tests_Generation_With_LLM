// DecimalToBinaryTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains one unit test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {

	@Test
	 void decimalToBinary() {
		assertEquals("db0db", decimalToBinary(0));
		assertEquals("0db", decimalToBinary(1));
		assertEquals("db1db", decimalToBinary(2));
		assertEquals("db2db", decimalToBinary(3));
		assertEquals("db3db", decimalToBinary(4));
		assertEquals("db4db", decimalToBinary(5));
	}
}