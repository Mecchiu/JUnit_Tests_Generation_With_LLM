// BinaryCalculate_0Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_0Test {
		BinaryCalculate_0Test() { };
	
	/**
	* Test method for
	* {@link ipac.BinaryCalculate#BinaryCalculate(String, int)}.
	* @throws java.lang.Exception if any.
	*/
	@Test
	public void testBinaryCalculate() throws Exception {
		BinaryCalculate calcul = new BinaryCalculate();

		calcul.addBinary("1234576", "5455");
		String ip = calcul.getIP();
		assertEquals("1234576", ip);

		calcul = new BinaryCalculate();

		IPRange totalIPAddresses = new IPRange(0, 1000);

		String resultIP = IPCalculate(null, 10);

		if (!resultIP.equals("")) {
			IPRange ipr = new IPRange(0, resultIP.split("-"));

			assertEquals(totalIPAddresses.ipAddress, getBinaryIP(ipr.IPAddress));

			calcul = new BinaryCalculate();
			calcul.calculate(ipr.subnet, 0, 10);

			resultIP = IPCalculate(ipr.IPAddress, totalIPAddresses.prefix);

			if (!resultIP.equals("")) {
				IPRange ipr2 = new IPRange(0, resultIP.split("-"));

				ipr2.setNumIP(2);

				if (!ipr.equals(ipr2)) {
					assertEquals(totalIPAddresses.IPAddress,
					calcul.getIP());
					assertEquals(totalIPAddresses.prefix, calculateIPAddress(ipr.IPAddress));
					assertEquals(totalIPAddresses.numIP, calculateIPNumber(ipr.IPAddress));

					assertEquals(ipr2.getNumIP(), calculateIPNumber(ipr.IPAddress));
					assertEquals(ipr2.subnet, calculateIPAddress(ipr.subnet));
					assertEquals(ipr2.prefix, calculateIPAddress(ipr.prefix));
				}
			} else {
				assertTrue(ipr.isIPv6);
				assertTrue(ipr.isIPv4);
				assertTrue(calcul.isIPv6(totalIPAddresses.ipAddress));
				assertTrue(calcul.isIPv4(totalIPAddresses.ipAddress));
			}
		}
	}

}