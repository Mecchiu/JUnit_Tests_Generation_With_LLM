// BinaryCalculateTest.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculateTest {

	/**
	* Test case 1:
	* Input: num1 = "11", num2 = "1"
	* Expected output: "100"
	*/
	@Test
	void testAddBinary1() {
		String num1 = "11";
		String num2 = "1";
		String expected = "100";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2:
	* Input: num1 = "1010", num2 = "1011"
	* Expected output: "10101"
	*/
	@Test
	void testAddBinary2() {
		String num1 = "1010";
		String num2 = "1011";
		String expected = "10101";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3:
	* Input: num1 = "0", num2 = "0"
	* Expected output: "0"
	*/
	@Test
	void testAddBinary3() {
		String num1 = "0";
		String num2 = "0";
		String expected = "0";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4:
	* Input: num1 = "1", num2 = "0"
	* Expected output: "1"
	*/
	@Test
	void testAddBinary4() {
		String num1 = "1";
		String num2 = "0";
		String expected = "1";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5:
	* Input: num1 = "0", num2 = "1"
	* Expected output: "1"
	*/
	@Test
	void testAddBinary5() {
		String num1 = "0";
		String num2 = "1";
		String expected = "1";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6:
	* Input: num1 = "1111", num2 = "1111"
	* Expected output: "11110"
	*/
	@Test
	void testAddBinary6() {
		String num1 = "1111";
		String num2 = "1111";
		String expected = "11110";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7:
	* Input: num1 = "1111", num2 = "0"
	* Expected output: "1111"
	*/
	@Test
	void testAddBinary7() {
		String num1 = "1111";
		String num2 = "0";
		String expected = "1111";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8:
	* Input: num1 = "0", num2 = "1111"
	* Expected output: "1111"
	*/
	@Test
	void testAddBinary8() {
		String num1 = "0";
		String num2 = "1111";
		String expected = "1111";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9:
	* Input: num1 = "1111", num2 = "1"
	* Expected output: "10000"
	*/
	@Test
	void testAddBinary9() {
		String num1 = "1111";
		String num2 = "1";
		String expected = "10000";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10:
	* Input: num1 = "1", num2 = "1111"
	* Expected output: "10000"
	*/
	@Test
	void testAddBinary10() {
		String num1 = "1";
		String num2 = "1111";
		String expected = "10000";
		String actual = BinaryCalculate.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
}