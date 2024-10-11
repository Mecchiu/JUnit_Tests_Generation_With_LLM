// BinaryCalculate_1Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculate_1Test {
		BinaryCalculate oSelf;

		/**
		 * Set-up method for the unit-test.
		 */
		@org.junit.Before
		public void setUp() {
			oSelf = new BinaryCalculate();
		}

		/**
		 * Test case for {@link BinaryCalculate#IPcalculate(String, String)}.
		 */
		@Test
		public void testSubBinary() {
			oSelf.subBinary(fullReassembler, DELIMITER);
			assertNotNull("IP calulator shouldn't have failed.", oSelf.oIPCalculator);
			IPAddress oIP = oSelf.oIPCalculator.getIPAddress();
			assertTrue("IP Addresses not converted.", oIP!=null);

			String IPAdress = oSelf.getBinaryIP(oIP);
			assertNotNull("No IP Addresses converted.", oSelf.oIPCalculator.getNetmask());
			String IPPrefix = oSelf.oIPCalculator.getNetmask();
			assertNotNull("No IP Prefix converted.", oSelf.oIPCalculator.getPrefix());
			IP = IPAdress;
			NetworkAddress oNetworkToIPAddress = oSelf.oIPCalculator.getNetworkAddress();
			assertEquals("IP networks match!", oIP,oNetworkToIPAddress.toString());
			assertEquals("Prefix networks match!", oPrefix,oNetworkToIPAddress.getPrefix());
			assertEquals("IP prefixes match!", "255.255.255",oNetworkToIPAddress.getPrefix());
		}

}