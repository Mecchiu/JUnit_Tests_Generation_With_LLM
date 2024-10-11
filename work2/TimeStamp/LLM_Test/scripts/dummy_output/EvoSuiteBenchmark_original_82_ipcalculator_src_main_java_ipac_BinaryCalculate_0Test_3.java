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
		BinaryCalculate_0Test() {};

		// Test case initialization
		@Test
		public void test() {
			BinaryCalculate bc = new BinaryCalculate();
		}

		// Test case: Binary IP calculation
		@Test
		public void testBinaryIP_1() {
			int lengthOfIPAddress = 16;

			String result = bc.addBinary("1.1.1.1", "255.255.255.255");
			checkIPType(lengthOfIPAddress);
			assertTrue(result.endsWith("0.0.0.0"));
		}

		// Test case: Binary IPv6 calculation
		@Test
		public void testBinaryIPv6_3() {
			int lengthOfIPAddress = 25;

			String result = bc.addBinary("0a0f:0:0:0:0:0:0:0:0:1", "ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff");
			checkIPType(lengthOfIPAddress);
			assertTrue(result.length() == 16);

			//IPv6 with less than four octets should work correctly
			String IPv6zero = "::ffff::";
			String resultIPv6zero = bc.addBinary(IPv6zero, "ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff");
			assertTrue(resultIPv6zero.length() == 30);
		}

		// Test case: IPv4 address calculations
		@Test
		public void testIPAddressCalculation_2() {
			int lengthOfIPAddress = 21;

			String result = bc.addBinary("1.1.1.1", "255.255.255.255");
			assertTrue(result.startsWith("0.0.0."));
		}

		// Test case: IPv6 address calculation
		@Test
		public void testIPv6AddressCalculation_4() {
			int lengthOfIPAddress;

			//ipv6 with no addresses beyond 255.255.255.255
			int IPv6zero = 0;
			lengthOfIPAddress = lengthOfIPAddress = IPRangeAddress.count(IPv6zero, '.');
			String result = bc.addBinary(IPv6zero, "ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff");
			assertTrue(result.length() == 4);   // TODO: add IPv6Zero field

			//ipv6 with less than four octets should work correctly
}
}