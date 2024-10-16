// BinaryCalculateTest.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#IPCalculate(String, String)} method.
*/
class BinaryCalculateTest {
		
		/**
		* Test case 1.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "24"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.255\nUsable Range: 192.168.1.1 - 192.168.1.254\n\nTotal usable IP Addresses : 254\nSubnet: 192.168.1.1\nBinary Subnet: 11000000.10101000.00000001.00000001\nBroadcast Address: 192.168.1.255\nPrefix: 24\nNetmask: 255.255.255.0\nBinary Netmask: 11111111.11111111.11111111.00000000"
		*/
		@Test
		void testIPCalculate1() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "24");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.255\nUsable Range: 192.168.1.1 - 192.168.1.254\n\nTotal usable IP Addresses : 254\nSubnet: 192.168.1.1\nBinary Subnet: 11000000.10101000.00000001.00000001\nBroadcast Address: 192.168.1.255\nPrefix: 24\nNetmask: 255.255.255.0\nBinary Netmask: 11111111.11111111.11111111.00000000", output);
		}
		
		/**
		* Test case 2.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "25"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.127\nUsable Range: 192.168.1.1 - 192.168.1.126\n\nTotal usable IP Addresses : 126\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.127\nPrefix: 25\nNetmask: 255.255.255.128\nBinary Netmask: 11111111.11111111.11111111.10000000"
		*/
		@Test
		void testIPCalculate2() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "25");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.127\nUsable Range: 192.168.1.1 - 192.168.1.126\n\nTotal usable IP Addresses : 126\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.127\nPrefix: 25\nNetmask: 255.255.255.128\nBinary Netmask: 11111111.11111111.11111111.10000000", output);
		}
		
		/**
		* Test case 3.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "26"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.63\nUsable Range: 192.168.1.1 - 192.168.1.62\n\nTotal usable IP Addresses : 62\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.63\nPrefix: 26\nNetmask: 255.255.255.192\nBinary Netmask: 11111111.11111111.11111111.11000000"
		*/
		@Test
		void testIPCalculate3() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "26");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.63\nUsable Range: 192.168.1.1 - 192.168.1.62\n\nTotal usable IP Addresses : 62\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.63\nPrefix: 26\nNetmask: 255.255.255.192\nBinary Netmask: 11111111.11111111.11111111.11000000", output);
		}
		
		/**
		* Test case 4.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "27"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.31\nUsable Range: 192.168.1.1 - 192.168.1.30\n\nTotal usable IP Addresses : 30\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.31\nPrefix: 27\nNetmask: 255.255.255.224\nBinary Netmask: 11111111.11111111.11111111.11100000"
		*/
		@Test
		void testIPCalculate4() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "27");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.31\nUsable Range: 192.168.1.1 - 192.168.1.30\n\nTotal usable IP Addresses : 30\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.31\nPrefix: 27\nNetmask: 255.255.255.224\nBinary Netmask: 11111111.11111111.11111111.11100000", output);
		}
		
		/**
		* Test case 5.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "28"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.15\nUsable Range: 192.168.1.1 - 192.168.1.14\n\nTotal usable IP Addresses : 14\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.15\nPrefix: 28\nNetmask: 255.255.255.240\nBinary Netmask: 11111111.11111111.11111111.11110000"
		*/
		@Test
		void testIPCalculate5() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "28");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.15\nUsable Range: 192.168.1.1 - 192.168.1.14\n\nTotal usable IP Addresses : 14\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.15\nPrefix: 28\nNetmask: 255.255.255.240\nBinary Netmask: 11111111.11111111.11111111.11110000", output);
		}
		
		/**
		* Test case 6.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "29"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.7\nUsable Range: 192.168.1.1 - 192.168.1.6\n\nTotal usable IP Addresses : 6\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.7\nPrefix: 29\nNetmask: 255.255.255.248\nBinary Netmask: 11111111.11111111.11111111.11111000"
		*/
		@Test
		void testIPCalculate6() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "29");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.7\nUsable Range: 192.168.1.1 - 192.168.1.6\n\nTotal usable IP Addresses : 6\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.7\nPrefix: 29\nNetmask: 255.255.255.248\nBinary Netmask: 11111111.11111111.11111111.11111000", output);
		}
		
		/**
		* Test case 7.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "30"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.3\nUsable Range: 192.168.1.1 - 192.168.1.2\n\nTotal usable IP Addresses : 2\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.3\nPrefix: 30\nNetmask: 255.255.255.252\nBinary Netmask: 11111111.11111111.11111111.11111100"
		*/
		@Test
		void testIPCalculate7() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "30");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.3\nUsable Range: 192.168.1.1 - 192.168.1.2\n\nTotal usable IP Addresses : 2\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.3\nPrefix: 30\nNetmask: 255.255.255.252\nBinary Netmask: 11111111.11111111.11111111.11111100", output);
		}
		
		/**
		* Test case 8.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "31"
		* Expected output: "Total Range: 192.168.1.0 - 192.168.1.1\nUsable Range: 192.168.1.1 - 192.168.1.0\n\nTotal usable IP Addresses : 0\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.1\nPrefix: 31\nNetmask: 255.255.255.254\nBinary Netmask: 11111111.11111111.11111111.11111110"
		*/
		@Test
		void testIPCalculate8() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "31");
				assertEquals("Total Range: 192.168.1.0 - 192.168.1.1\nUsable Range: 192.168.1.1 - 192.168.1.0\n\nTotal usable IP Addresses : 0\nSubnet: 192.168.1.0\nBinary Subnet: 11000000.10101000.00000001.00000000\nBroadcast Address: 192.168.1.1\nPrefix: 31\nNetmask: 255.255.255.254\nBinary Netmask: 11111111.11111111.11111111.11111110", output);
		}
		
		/**
		* Test case 9.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "32"
		* Expected output: "Total Range: 192.168.1.1 - 192.168.1.1\nUsable Range: 192.168.1.1 - 192.168.1.1\n\nTotal usable IP Addresses : 1\nSubnet: 192.168.1.1\nBinary Subnet: 11000000.10101000.00000001.00000001\nBroadcast Address: 192.168.1.1\nPrefix: 32\nNetmask: 255.255.255.255\nBinary Netmask: 11111111.11111111.11111111.11111111"
		*/
		@Test
		void testIPCalculate9() {
				BinaryCalculate bc = new BinaryCalculate();
				String output = bc.IPCalculate("192.168.1.1", "32");
				assertEquals("Total Range: 192.168.1.1 - 192.168.1.1\nUsable Range: 192.168.1.1 - 192.168.1.1\n\nTotal usable IP Addresses : 1\nSubnet: 192.168.1.1\nBinary Subnet: 11000000.10101000.00000001.00000001\nBroadcast Address: 192.168.1.1\nPrefix: 32\nNetmask: 255.255.255.255\nBinary Netmask: 11111111.11111111.11111111.11111111", output);
		}
		
		/**
		* Test case 10.
		* Test the {@link BinaryCalculate#IPCalculate(String, String)} method.
		* Input: IP = "192.168.1.1", IPPrefix = "33"
		* Expected output: "Total Range: 192.168.1.1 - 192.168.1.1\nUsable Range: 192.168.1.1 - 192.168.1.1\n\nTotal usable IP Addresses : 1\nSubnet: 192.168.1.1\nBinary Subnet: 11000000.10101000.00000001.00000001\nBroadcast Address: 192.168.1.1\nPrefix: 32\nNetmask: 255.255.255.255\nBinary Netmask: 11111111.11111111.11111111.11111111"
		*/
		@Test
		void testIPCalculate10() {
				BinaryCalculate bc = new BinaryCalculate();
}
}