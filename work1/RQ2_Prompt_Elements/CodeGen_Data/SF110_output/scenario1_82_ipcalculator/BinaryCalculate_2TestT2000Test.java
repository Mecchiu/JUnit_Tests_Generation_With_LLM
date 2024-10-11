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

		private final static String IP_1 = "192.0.2.1";
		private final static String IP_2 = "10.0.0.1";
		private final static String IP_3 = "10.0.1.4";
		private final static String IP_4 = "10.0.1.11";
		
		/**
		* Getters
		*/
		
				// Getter for IP_1
		public final String getIP_1() {
			return IP_1;
		};
				// Getter for IP_2
		public final String getIP_2() {
			return IP_2;
		};
				// Getter for IP_3
		public final String getIP_3() {
			return IP_3;
		};
				// Getter for IP_4
		public final String getIP_4() {
			return IP_4;
		};
				// Getter for netmask
		public final String getNetmask(String key) {
			return convert(Netmask);
		};
				// Getter for subnet
		public final String getSubnet(String key) {
			return convert(Subnet);
		};
				// Getter for current IP (from network)
		public final String getCurrentIP() {
			return convert(CurrentIP);
		};
				// Binary Subnet
		public final String getBinarySubnet() {
			return convert(BinarySubnet);
		};
				// Getter for previous IP (to network)
		public final String getPreviousIP() {
			return convert(PreviousIP);
		};
				// Getter for current IP Prefix
		public final String getCurrentIPPrefix() {
			return convert(CurrentIPPrefix);
		};
		// Binary IP Subnet
		public final String getBinaryIP(String key) {
			return convert(BinaryIP);
		};
		
		// Getters for binary IPv4 address
		private final String convert(String addr) {
			return ipToLongBinaryAddress(addr);
		}
				// Getter for binary IPv4 address in long
		private final String ipToLongBinaryAddress(String val) {
			byte[] bin = binLongAddressToByteArray(Long.parseLong(val));
			return Long.toHexString(bin[0] & 0xFF) + Long.toString(bin[1] & 0xFF, (char) ('0' + (bin[1] >>> 4))).toLowerCase();
			// Return binary IP address
		};
				private final String getBinaryIP(String key) {
			// Get IP Subnet
			return binIPAddressToByteAddress(ipToLongBinaryAddress(getSubnet(key)));
		}
				// Getter for bin IP address in long
		private final String binIPAddressToByteAddress(String ip) {
			byte[] bin = byteToIPAddress(ip);
			return new String(bin[0] & 0xFF, (char) ('0' + (bin[1] >>> 4)));
		}
				
		// Test cases
		@Test
		public void test_ipCalculate_IP() {
			String outputText = IPCalculate_1(IP_1);
			outputText += "\n\n";
			outputText += "IP_1 : " + convert(IP_1) + "\n";
			outputText += "IP_2 : " + convert(IP_2) + "\n";
			outputText += "Current IP Prefix : " + convert(CurrentIPPrefix) + "\n";
			outputText += "Previous IP Prefix : " + convert(PreviousIPPrefix) + "\n";
			outputText += "Current IP Address : " + convert(CurrentIP) + "\n";
			outputText += "BinaryIP Address : " + convert(BinaryIP) + "\n";
			outputText += "Current IP Subnet Prefix : " + convert(CurrentIPSubnetPrefix) + "\n";
			outputText += "Previous IP Subnet Prefix : " + convert(PreviousIPSubnetPrefix) + "\n";
			outputText += "BinarySubnet : " + convert(BinarySubnet) + "\n";
			outputText += "Current IP Network mask : " + convert(CurrentIPNetworkMask) + "\n";
			outputText += "Previous IP Network mask : " + convert(PreviousIPNetworkMask) + "\n";
			outputText += "Current IP Broadcast Address : " + convert(CurrentIPBroadcastAddress) + "\n";
			outputText += "Previous IP Broadcast Address : " + convert(PreviousIPBroadcastAddress) + "\n";
			assertEquals("Calculated IP Address incorrect",
			            IPAddress.calculateIP(IP_1, IP_4, 2, "192.0.2.1"),
			           IPAddress.calculateIP(IP_1, IP_4, 3, "10.0.0.1"));
			assertEquals("Calculated IP Prefix incorrect",
			            longBinaryIPAddressToLong(IP_1, 10),
			           longBinaryIPAddressToLong(IP_2, 10));
				assertEquals("Calculated Current IP Prefix incorrect",
					        convert(CurrentIPPrefix),
					     getBinaryIP(CurrentIPPrefix));
				assertEquals("Calculated Previous IP Prefix incorrect",
					        convert(PreviousIPPrefix),
					     getBinaryIP(PreviousIPPrefix));
				assertEquals("Calculated Current IP Subnet Prefix incorrect",
					        convert(CurrentIPSubnetPrefix),
					     getBinarySubnet(CurrentIPSubnetPrefix));
				assertEquals("Calculated Previous IP Subnet Prefix incorrect",
					        convert(PreviousIPSubnetPrefix),
					     getBinarySubnet(PreviousIPSubnetPrefix));
			}
				
		}
		
		@Test
		public void test_ipCalculate_IP_3() {
			// Run before each test
			return;
		}
		
		@Test
		public void test_ipCalculate_IP_4() {
			// Run after each test
			return;
		}
}