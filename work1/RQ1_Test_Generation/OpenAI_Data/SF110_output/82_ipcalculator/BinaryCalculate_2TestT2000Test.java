// BinaryCalculate_2Test.java
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
class BinaryCalculate_2Test {

		/**
		* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
		* It tests the method with the following input:
		* <ul>
		* <li>IP: "11000000.10101000.00000001.00000001"</li>
		* <li>IPPrefix: "11111111.11111111.11111111.11111111"</li>
		* </ul>
		* It expects the following output:
		* <ul>
		* <li>Total Range: 192.168.1.1 -- 192.168.1.1</li>
		* <li>Usable Range: 192.168.1.2 -- 192.168.1.254</li>
		* <li>Total usable IP Addresses : 253</li>
		* <li>Subnet: 192.168.1.0</li>
		* <li>Binary Subnet: 11000000.10101000.00000001.00000000</li>
		* <li>Broadcast Address: 192.168.1.255</li>
		* <li>Prefix: /24</li>
		* <li>Netmask: 255.255.255.0</li>
		* <li>Binary Netmask: 11111111.11111111.11111111.00000000</li>
		* </ul>
		*/
		@Test
		void testIPCalculate_1() {
				String IP = "11000000.10101000.00000001.00000001";
				String IPPrefix = "11111111.11111111.11111111.11111111";
				String expected = "Total Range: 192.168.1.1 -- 192.168.1.1\n" +
													"Usable Range: 192.168.1.2 -- 192.168.1.254\n" +
													"\n" +
													"Total usable IP Addresses : 253\n" +
													"Subnet: 192.168.1.0\n" +
													"Binary Subnet: 11000000.10101000.00000001.00000000\n" +
													"Broadcast Address: 192.168.1.255\n" +
													"Prefix: /24\n" +
													"Netmask: 255.255.255.0\n" +
													"Binary Netmask: 11111111.11111111.11111111.00000000";
				String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
		* It tests the method with the following input:
		* <ul>
		* <li>IP: "11000000.10101000.00000001.00000001"</li>
		* <li>IPPrefix: "11111111.11111111.11111111.11111111"</li>
		* </ul>
		* It expects the following output:
		* <ul>
		* <li>Total Range: 192.168.1.1 -- 192.168.1.1</li>
		* <li>Usable Range: 192.168.1.2 -- 192.168.1.254</li>
		* <li>Total usable IP Addresses : 253</li>
		* <li>Subnet: 192.168.1.0</li>
		* <li>Binary Subnet: 11000000.10101000.00000001.00000000</li>
		* <li>Broadcast Address: 192.168.1.255</li>
		* <li>Prefix: /24</li>
		* <li>Netmask: 255.255.255.0</li>
		* <li>Binary Netmask: 11111111.11111111.11111111.00000000</li>
		* </ul>
		*/
		@Test
		void testIPCalculate_2() {
				String IP = "11000000.10101000.00000001.00000001";
				String IPPrefix = "11111111.11111111.11111111.11111111";
				String expected = "Total Range: 192.168.1.1 -- 192.168.1.1\n" +
													"Usable Range: 192.168.1.2 -- 192.168.1.254\n" +
													"\n" +
													"Total usable IP Addresses : 253\n" +
													"Subnet: 192.168.1.0\n" +
													"Binary Subnet: 11000000.10101000.00000001.00000000\n" +
													"Broadcast Address: 192.168.1.255\n" +
													"Prefix: /24\n" +
													"Netmask: 255.255.255.0\n" +
													"Binary Netmask: 11111111.11111111.11111111.00000000";
				String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
		* It tests the method with the following input:
		* <ul>
		* <li>IP: "11000000.10101000.00000001.00000001"</li>
		* <li>IPPrefix: "11111111.11111111.11111111.11111111"</li>
		* </ul>
		* It expects the following output:
		* <ul>
		* <li>Total Range: 192.168.1.1 -- 192.168.1.1</li>
		* <li>Usable Range: 192.168.1.2 -- 192.168.1.254</li>
		* <li>Total usable IP Addresses : 253</li>
		* <li>Subnet: 192.168.1.0</li>
		* <li>Binary Subnet: 11000000.10101000.00000001.00000000</li>
		* <li>Broadcast Address: 192.168.1.255</li>
		* <li>Prefix: /24</li>
		* <li>Netmask: 255.255.255.0</li>
		* <li>Binary Netmask: 11111111.11111111.11111111.00000000</li>
		* </ul>
		*/
		@Test
		void testIPCalculate_3() {
				String IP = "11000000.10101000.00000001.00000001";
				String IPPrefix = "11111111.11111111.11111111.11111111";
				String expected = "Total Range: 192.168.1.1 -- 192.168.1.1\n" +
													"Usable Range: 192.168.1.2 -- 192.168.1.254\n" +
													"\n" +
													"Total usable IP Addresses : 253\n" +
