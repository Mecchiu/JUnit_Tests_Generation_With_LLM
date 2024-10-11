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
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following input:
	* <ul>
	* <li>IP: 11111111.11111111.11111111.11111111</li>
	* <li>IPPrefix: 11111111.11111111.11111111.11111111</li>
	* </ul>
	* The expected output is:
	* <ul>
	* <li>Total Range: 255.255.255.255 - 255.255.255.255</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.255</li>
	* <li>Total usable IP Addresses : 2</li>
	* <li>Subnet: 255.255.255.255</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11111111</li>
	* <li>Broadcast Address: 255.255.255.255</li>
	* <li>Prefix: 32</li>
	* <li>Netmask: 255.255.255.255</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11111111</li>
	* </ul>
	*/
	@Test
	void testIPCalculate1() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11111111";
		String expected = "Total Range: 255.255.255.255 - 255.255.255.255\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.255\n" +
						  "\n" +
						  "Total usable IP Addresses : 2\n" +
						  "Subnet: 255.255.255.255\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11111111\n" +
						  "Broadcast Address: 255.255.255.255\n" +
						  "Prefix: 32\n" +
						  "Netmask: 255.255.255.255\n" +
						  "Binary Netmask: 11111111.11111111.11111111.11111111";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following input:
	* <ul>
	* <li>IP: 11111111.11111111.11111111.11111111</li>
	* <li>IPPrefix: 11111111.11111111.11111111.11111110</li>
	* </ul>
	* The expected output is:
	* <ul>
	* <li>Total Range: 255.255.255.255 - 255.255.255.254</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.254</li>
	* <li>Total usable IP Addresses : 1</li>
	* <li>Subnet: 255.255.255.255</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11111111</li>
	* <li>Broadcast Address: 255.255.255.254</li>
	* <li>Prefix: 31</li>
	* <li>Netmask: 255.255.255.254</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11111110</li>
	* </ul>
	*/
	@Test
	void testIPCalculate2() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11111110";
		String expected = "Total Range: 255.255.255.255 - 255.255.255.254\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.254\n" +
						  "\n" +
						  "Total usable IP Addresses : 1\n" +
						  "Subnet: 255.255.255.255\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11111111\n" +
						  "Broadcast Address: 255.255.255.254\n" +
						  "Prefix: 31\n" +
						  "Netmask: 255.255.255.254\n" +
						  "Binary Netmask: 11111111.11111111.11111111.11111110";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following input:
	* <ul>
	* <li>IP: 11111111.11111111.11111111.11111111</li>
	* <li>IPPrefix: 11111111.11111111.11111111.11111100</li>
	* </ul>
	* The expected output is:
	* <ul>
	* <li>Total Range: 255.255.255.255 - 255.255.255.252</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.253</li>
	* <li>Total usable IP Addresses : 2</li>
	* <li>Subnet: 255.255.255.255</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11111111</li>
	* <li>Broadcast Address: 255.255.255.252</li>
	* <li>Prefix: 30</li>
	* <li>Netmask: 255.255.255.252</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11111100</li>
	* </ul>
	*/
	@Test
	void testIPCalculate3() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11111100";
		String expected = "Total Range: 255.255.255.255 - 255.255.255.252\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.253\n" +
						  "\n" +
						  "Total usable IP Addresses : 2\n" +
						  "Subnet: 255.255.255.255\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11111111\n" +
						  "Broadcast Address: 255.255.255.252\n" +
						  "Prefix: 30\n" +
						  "Netmask: 255.255.255.252\n" +
						  "Binary Netmask: 11111111.11111111.11111111.11111100";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following input:
	* <ul>
	* <li>