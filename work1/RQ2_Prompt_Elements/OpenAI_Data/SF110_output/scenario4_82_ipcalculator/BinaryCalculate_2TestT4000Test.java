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
	* <li>Usable IP Range: "192.168.1.2 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_1() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111111";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.1\nUsable IP Range: 192.168.1.2 - 192.168.1.254\nTotal IP Addresses: 254";
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
	* <li>Usable IP Range: "192.168.1.3 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_2() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111110";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.2\nUsable IP Range: 192.168.1.3 - 192.168.1.254\nTotal IP Addresses: 254";
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
	* <li>Usable IP Range: "192.168.1.5 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_3() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111100";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.4\nUsable IP Range: 192.168.1.5 - 192.168.1.254\nTotal IP Addresses: 254";
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
	* <li>Usable IP Range: "192.168.1.9 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_4() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.8\nUsable IP Range: 192.168.1.9 - 192.168.1.254\nTotal IP Addresses: 254";
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
	* <li>Usable IP Range: "192.168.1.17 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_5() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11110000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.16\nUsable IP Range: 192.168.1.17 - 192.168.1.254\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.11100000"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.32"</li>
	* <li>Usable IP Range: "192.168.1.33 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_6() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11100000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.32\nUsable IP Range: 192.168.1.33 - 192.168.1.254\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.11000000"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.64"</li>
	* <li>Usable IP Range: "192.168.1.65 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_7() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11000000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.64\nUsable IP Range: 192.168.1.65 - 192.168.1.254\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.10000000"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.128"</li>
	* <li>Usable IP Range: "192.168.1.129 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_8() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.10000000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.128\nUsable IP Range: 192.168.1.129 - 192.168.1.254\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111111.00000000"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.1.254"</li>
	* <li>Usable IP Range: "192.168.2.1 - 192.168.2.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_9() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.00000000";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.254\nUsable IP Range: 192.168.2.1 - 192.168.2.254\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000.10101000.00000001.00000001"</li>
	* <li>IPPrefix: "11111111.11111111.11111110.00000000"</li>
	* </ul>
	* It expects the following results:
	* <ul>
	* <li>IP Range: "192.168.1.1 - 192.168.3.254"</li>
	* <li>Usable IP Range: "192.168.4.1 - 192.168.4.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_10() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111110.00000000";
		String expected = "IP Range: 192.168.1.1 - 192.168.3.254\nUsable IP Range: 192.168.4.1 - 192.168.4.254\nTotal IP Addresses: 254";
		String actual = new BinaryCalculate().IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
}

// BinaryCalculate_3Test.java
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
class BinaryCalculate_3Test {
		
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
	* <li>Usable IP Range: "192.168.1.2 - 192.168.1.254"</li>
	* <li>Total IP Addresses: "254"</li>
	* </ul>
	*/
	@Test
	void testIPCalculate_1() {
		String IP = "11000000.10101000.00000001.00000001";
		String IPPrefix = "11111111.11111111.11111111.11111111";
		String expected = "IP Range: 192.168.1.1 - 192.168.1.1\nUsable IP Range: 192.168.1.2 - 192.168.1.