// BinaryCalculate_2Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
*/
class BinaryCalculate_2Test {
		
		int a, b;
	// Constructor for BinaryCalculate_2Test.java 
		public BinaryCalculate_2Test() {}

	/**
	 * Test method for {@link ipac.BinaryCalculate#IPCalculate(String, String)}.
	 */
	@Test
    public void testIPCalculate_1() {
		BinaryCalculate b = new BinaryCalculate();

		b.calculate(null, "8");
		b.calculate(null, "8");

		assertEquals("7ffffffffffffffffffffffffffffffff", b.IP);
		assertEquals("7ffffffffffffffffffffffffffffffff", b.IP);
		assertNotEquals(b.IP, "7ffffffffffffffffffffffffffffffff");
		assertNotEquals(b.IP, "00000000");
	}

	/**
	* Test method for {@link ipac.BinaryCalculate#calculate(String, String)}.
	 */
	@Test
    public void testIPCalculate_2() {
		BinaryCalculate b = new BinaryCalculate();

		b.calculate("1.2.3.4", "1");
		b.calculate("1.0.1.0", "1.3");

		assertEquals("1a0100002000000", b.IP);
		assertEquals("1a802000000", b.IP);
		assertEquals("1d000003000000", b.IP);
		assertEquals("1b000003000000", b.IP);
	}

	/**
	* Test method for {@link ipac.BinaryCalculate#convert(String)}.
	 */
	@Test
    public void testConvert_1() {
		BinaryCalculate b = new BinaryCalculate();

		b.convert("ffffffffffffffffffffffffffffffff");
		b.convert("1.2.3.4");
		b.convert("1.0.1.0");

		assertEquals("1a01000020000000000000000000000000000000000", b.IP);
		assertEquals("1a802000000000000000000000000000000000000000000", b.IP);
		assertEquals("1d0000030000000000000000000000", b.IP);
		assertEquals("1b000003000000", b.IP);
	}
}