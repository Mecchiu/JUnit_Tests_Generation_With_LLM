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
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.11111111"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.1"</li>
	* <li>Usable Range: "192.168.1.2 - 192.168.1.254"</li>
	* <li>Broadcast Address: "192.168.1.255"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_1() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111111";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.1\nUsable Range: 192.168.1.2 - 192.168.1.254\nBroadcast Address: 192.168.1.255\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.11111110"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.2"</li>
	* <li>Usable Range: "192.168.1.3 - 192.168.1.254"</li>
	* <li>Broadcast Address: "192.168.1.255"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_2() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111110";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.2\nUsable Range: 192.168.1.3 - 192.168.1.254\nBroadcast Address: 192.168.1.255\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.11111100"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.4"</li>
	* <li>Usable Range: "192.168.1.5 - 192.168.1.254"</li>
	* <li>Broadcast Address: "192.168.1.255"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_3() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111100";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.4\nUsable Range: 192.168.1.5 - 192.168.1.254\nBroadcast Address: 192.168.1.255\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.11111000"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.8"</li>
	* <li>Usable Range: "192.168.1.9 - 192.168.1.254"</li>
	* <li>Broadcast Address: "192.168.1.255"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_4() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.8\nUsable Range: 192.168.1.9 - 192.168.1.254\nBroadcast Address: 192.168.1.255\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.11110000"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.16"</li>
	* <li>Usable Range: "192.168.1.17 - 192.168.1.254"</li>
	* <li>Broadcast Address: "192.168.1.255"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_5() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11110000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.16\nUsable Range: 192.168.1.17 - 192.168.1.254\nBroadcast Address: 192.168.1.255\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP