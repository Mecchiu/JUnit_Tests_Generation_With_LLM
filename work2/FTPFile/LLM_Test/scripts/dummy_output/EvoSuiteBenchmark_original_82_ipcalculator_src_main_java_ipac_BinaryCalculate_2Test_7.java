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
		BigInteger startIP = BigInteger.ONE;
		BigInteger endIP = null;
		String currentIP = "";
		String IPRangeAddress = "";
		String usableRange = "";
		int semiCol = 0;

		BigInteger IPAddressForTest;

		/**
    * Tests the method {@link BinaryCalculate#calculate(String, String)}.
    */
    @Test
    void testCalculate() {
		// Test for a successful calculation of an address
		startIP = BigInteger.ONE;
		calculate(IPRangeAddress, IPAddressForTest);
		assertEquals(IPRangeAddress, currentIP);
		calculate("FFFF:ffff:ffff:ffff:ffff:ffff:ffff:ffff", IPRangeAddress);
		assertEquals("ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff", currentIP);

		// Test for a unsuccessful calculation of an address
		IPAddressForTest = new BigInteger("FFFF");
		IPRangeAddress = "" + 0xffff;
		try {
			calculate(IPRangeAddress, IPRangeAddress);
			fail();
		}
		catch(NumberFormatException e) {}
		try {
			currentIP = "";
			calculate(IPRangeAddress, currentIP);
			fail();
		}
		catch(NumberFormatException e) {}
	}

	/**
    * Tests the method {@link BinaryCalculate#calculate(String, String)}.
    */
    @Test
    void testReassemblerCalc() {
}
}