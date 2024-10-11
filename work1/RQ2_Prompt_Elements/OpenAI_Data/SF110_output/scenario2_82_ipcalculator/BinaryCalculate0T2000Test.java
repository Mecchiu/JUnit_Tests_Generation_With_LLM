// BinaryCalculateTest.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculateTest {

	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the addition of two binary numbers.
	*/
	@Test
	void testAddBinary() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("11", bc.addBinary("10", "1"));
		assertEquals("101", bc.addBinary("10", "11"));
		assertEquals("1010", bc.addBinary("101", "11"));
		assertEquals("10101", bc.addBinary("101", "101"));
		assertEquals("10101", bc.addBinary("1010", "11"));
		assertEquals("101010", bc.addBinary("1010", "101"));
		assertEquals("101010", bc.addBinary("10101", "11"));
		assertEquals("1010101", bc.addBinary("10101", "101"));
		assertEquals("10101010", bc.addBinary("10101", "1011"));
		assertEquals("101010101", bc.addBinary("10101", "10101"));
	}
}