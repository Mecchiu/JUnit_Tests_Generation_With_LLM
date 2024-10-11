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
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"</li>
	* <li>IPPrefix: "11111111 11111111 11111111 11111111"</li>
	* </ul>
	* The test case expects the following results:
	* <ul>
	* <li>Results: "192.168.1.1 - 192.168.1.1"</li>
	* </ul>
	*/
	@Test
	void testCase1() {
		String IP = "11000000 10101000 00000001 00000001";
		String IPPrefix = "11111111 11111111 11111111 11111111";
		String expectedResults = "192.168.1.1 - 192.168.1.1";
		String actualResults = BinaryCalculate.IPCalculate(IP, IPPrefix);
		assertEquals(expectedResults, actualResults);
	}
	
	/**
	* Test case 2.
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"</li>
	* <li>IPPrefix: "11111111 11111111 11111111 00000000"</li>
	* </ul>
	* The test case expects the following results:
	* <ul>
	* <li>Results: "192.168.1.1 - 192.168.1.255"</li>
	* </ul>
	*/
	@Test
	void testCase2() {
		String IP = "11000000 10101000 00000001 00000001";
		String IPPrefix = "11111111 11111111 11111111 00000000";
		String expectedResults = "192.168.1.1 - 192.168.1.255";
		String actualResults = BinaryCalculate.IPCalculate(IP, IPPrefix);
		assertEquals(expectedResults, actualResults);
	}
	
	/**
	* Test case 3.
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"</li>
	* <li>IPPrefix: "11111111 11111111 00000000 00000000"</li>
	* </ul>
	* The test case expects the following results:
	* <ul>
	* <li>Results: "192.168.1.1 - 192.168.255.255"</li>
	* </ul>
	*/
	@Test
	void testCase3() {
		String IP = "11000000 10101000 00000001 00000001";
		String IPPrefix = "11111111 11111111 00000000 00000000";
		String expectedResults = "192.168.1.1 - 192.168.255.255";
		String actualResults = BinaryCalculate.IPCalculate(IP, IPPrefix);
		assertEquals(expectedResults, actualResults);
	}
	
	/**
	* Test case 4.
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"</li>
	* <li>IPPrefix: "11111111 00000000 00000000 00000000"</li>
	* </ul>
	* The test case expects the following results:
	* <ul>
	* <li>Results: "192.168.1.1 - 255.255.255.255"</li>
	* </ul>
	*/
	@Test
	void testCase4() {
		String IP = "11000000 10101000 00000001 00000001";
		String IPPrefix = "11111111 00000000 00000000 00000000";
		String expectedResults = "192.168.1.1 - 255.255.255.255";
		String actualResults = BinaryCalculate.IPCalculate(IP, IPPrefix);
		assertEquals(expectedResults, actualResults);
	}
	
	/**
	* Test case 5.
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"</li>
	* <li>IPPrefix: "11111111 11111111 11111111 11111111"</li>
	* </ul>
	* The test case expects the following results:
	* <ul>
	* <li>Results: "192.168.1.1 - 192.168.1.1"</li>
	* </ul>
	*/
	@Test
	void testCase5() {
		String IP = "11000000 10101000 00000001 00000001";
		String IPPrefix = "11111111 11111111 11111111 11111111";
		String expectedResults = "192.168.1.1 - 192.168.1.1";
		String actualResults = BinaryCalculate.IPCalculate(IP, IPPrefix);
		assertEquals(expectedResults, actualResults);
	}
	
	/**
	* Test case 6.
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"</li>
	* <li>IPPrefix: "11111111 11111111 11111111 00000000"</li>
	* </ul>
	* The test case expects the following results:
	* <ul>
	* <li>Results: "192.168.1.1 - 192.168.1.255"</li>
	* </ul>
	*/
	@Test
	void testCase6() {
		String IP = "11000000 10101000 00000001 00000001";
		String IPPrefix = "11111111 11111111 11111111 00000000";
		String expectedResults = "192.168.1.1 - 192.168.1.255";
		String actualResults = BinaryCalculate.IPCalculate(IP, IPPrefix);
		assertEquals(expectedResults, actualResults);
	}
	
	/**
	* Test case 7.
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"</li>
	* <li>IPPrefix: "11111111 11111111 00000000 00000000"</li>
	* </ul>
	* The test case expects the following results:
	* <ul>
	* <li>Results: "192.168.1.1 - 192.168.255.255"</li>
	* </ul>
	*/
	@Test
	void testCase7() {
		String IP = "11000000 10101000 00000001 00000001";
		String IPPrefix = "11111111 11111111 00000000 00000000";
		String expectedResults = "192.168.1.1 - 192.168.255.255";
		String actualResults = BinaryCalculate.IPCalculate(IP, IPPrefix);
		assertEquals(expectedResults, actualResults);
	}
	
	/**
	* Test case 8.
	* The test case tests the {@link BinaryCalculate#IPCalculate(String, String)} method.
	* The test case tests the method with the following parameters:
	* <ul>
	* <li>IP: "11000000 10101000 00000001 00000001"