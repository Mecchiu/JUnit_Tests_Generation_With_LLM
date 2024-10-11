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
	* <li>Total Range: 255.255.255.254 - 255.255.255.255</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.255</li>
	* <li>Total usable IP Addresses : 2</li>
	* <li>Subnet: 255.255.255.254</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11111110</li>
	* <li>Broadcast Address: 255.255.255.255</li>
	* <li>Prefix: 31</li>
	* <li>Netmask: 255.255.255.254</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11111110</li>
	* </ul>
	*/
	@Test
	void testIPCalculate2() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11111110";
		String expected = "Total Range: 255.255.255.254 - 255.255.255.255\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.255\n" +
						  "\n" +
						  "Total usable IP Addresses : 2\n" +
						  "Subnet: 255.255.255.254\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11111110\n" +
						  "Broadcast Address: 255.255.255.255\n" +
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
	* <li>Total Range: 255.255.255.252 - 255.255.255.255</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.255</li>
	* <li>Total usable IP Addresses : 2</li>
	* <li>Subnet: 255.255.255.252</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11111100</li>
	* <li>Broadcast Address: 255.255.255.255</li>
	* <li>Prefix: 30</li>
	* <li>Netmask: 255.255.255.252</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11111100</li>
	* </ul>
	*/
	@Test
	void testIPCalculate3() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11111100";
		String expected = "Total Range: 255.255.255.252 - 255.255.255.255\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.255\n" +
						  "\n" +
						  "Total usable IP Addresses : 2\n" +
						  "Subnet: 255.255.255.252\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11111100\n" +
						  "Broadcast Address: 255.255.255.255\n" +
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
	* <li>IP: 11111111.11111111.11111111.11111111</li>
	* <li>IPPrefix: 11111111.11111111.11111111.11111000</li>
	* </ul>
	* The expected output is:
	* <ul>
	* <li>Total Range: 255.255.255.248 - 255.255.255.255</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.255</li>
	* <li>Total usable IP Addresses : 2</li>
	* <li>Subnet: 255.255.255.248</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11111000</li>
	* <li>Broadcast Address: 255.255.255.255</li>
	* <li>Prefix: 29</li>
	* <li>Netmask: 255.255.255.248</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11111000</li>
	* </ul>
	*/
	@Test
	void testIPCalculate4() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11111000";
		String expected = "Total Range: 255.255.255.248 - 255.255.255.255\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.255\n" +
						  "\n" +
						  "Total usable IP Addresses : 2\n" +
						  "Subnet: 255.255.255.248\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11111000\n" +
						  "Broadcast Address: 255.255.255.255\n" +
						  "Prefix: 29\n" +
						  "Netmask: 255.255.255.248\n" +
						  "Binary Netmask: 11111111.11111111.11111111.11111000";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following input:
	* <ul>
	* <li>IP: 11111111.11111111.11111111.11111111</li>
	* <li>IPPrefix: 11111111.11111111.11111111.11110000</li>
	* </ul>
	* The expected output is:
	* <ul>
	* <li>Total Range: 255.255.255.240 - 255.255.255.255</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.255</li>
	* <li>Total usable IP Addresses : 2</li>
	* <li>Subnet: 255.255.255.240</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11110000</li>
	* <li>Broadcast Address: 255.255.255.255</li>
	* <li>Prefix: 28</li>
	* <li>Netmask: 255.255.255.240</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11110000</li>
	* </ul>
	*/
	@Test
	void testIPCalculate5() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11110000";
		String expected = "Total Range: 255.255.255.240 - 255.255.255.255\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.255\n" +
						  "\n" +
						  "Total usable IP Addresses : 2\n" +
						  "Subnet: 255.255.255.240\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11110000\n" +
						  "Broadcast Address: 255.255.255.255\n" +
						  "Prefix: 28\n" +
						  "Netmask: 255.255.255.240\n" +
						  "Binary Netmask: 11111111.11111111.11111111.11110000";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following input:
	* <ul>
	* <li>IP: 11111111.11111111.11111111.11111111</li>
	* <li>IPPrefix: 11111111.11111111.11111111.11100000</li>
	* </ul>
	* The expected output is:
	* <ul>
	* <li>Total Range: 255.255.255.224 - 255.255.255.255</li>
	* <li>Usable Range: 255.255.255.254 - 255.255.255.255</li>
	* <li>Total usable IP Addresses : 2</li>
	* <li>Subnet: 255.255.255.224</li>
	* <li>Binary Subnet: 11111111.11111111.11111111.11100000</li>
	* <li>Broadcast Address: 255.255.255.255</li>
	* <li>Prefix: 27</li>
	* <li>Netmask: 255.255.255.224</li>
	* <li>Binary Netmask: 11111111.11111111.11111111.11100000</li>
	* </ul>
	*/
	@Test
	void testIPCalculate6() {
		String IP = "11111111.11111111.11111111.11111111";
		String IPPrefix = "11111111.11111111.11111111.11100000";
		String expected = "Total Range: 255.255.255.224 - 255.255.255.255\n" +
						  "Usable Range: 255.255.255.254 - 255.255.255.255\n" +
						  "\n" +
						  "Total usable IP Addresses : 2\n" +
						  "Subnet: 255.255.255.224\n" +
						  "Binary Subnet: 11111111.11111111.11111111.11100000\n" +
						  "Broadcast Address: 255.255.255.255\n" +
						  "Prefix: 27\n" +
						  "Netmask: 255.255.255.224\n" +
						  "Binary Netmask: 11111111.11111111.11111111.11100000";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following input:
	* <ul>
	* <li>IP: 11111111.11111111.11111111.11111111</li>
	* <li>IPPrefix: 11111111.11111111.11111111.11000000</li>
	* </ul>