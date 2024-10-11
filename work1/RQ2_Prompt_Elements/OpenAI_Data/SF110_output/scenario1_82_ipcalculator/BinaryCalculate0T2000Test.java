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
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the first number is null.
	*/
	@Test
	void testAddBinary_1() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = null;
		String num2 = "101";
		String expected = "101";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the second number is null.
	*/
	@Test
	void testAddBinary_2() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "101";
		String num2 = null;
		String expected = "101";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are null.
	*/
	@Test
	void testAddBinary_3() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = null;
		String num2 = null;
		String expected = "";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are empty.
	*/
	@Test
	void testAddBinary_4() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "";
		String num2 = "";
		String expected = "";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the first number is empty.
	*/
	@Test
	void testAddBinary_5() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "";
		String num2 = "101";
		String expected = "101";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the second number is empty.
	*/
	@Test
	void testAddBinary_6() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "101";
		String num2 = "";
		String expected = "101";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the first number is longer than the second number.
	*/
	@Test
	void testAddBinary_7() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "101";
		String expected = "10110";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the second number is longer than the first number.
	*/
	@Test
	void testAddBinary_8() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "101";
		String num2 = "10101";
		String expected = "10110";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the two numbers are the same length.
	*/
	@Test
	void testAddBinary_9() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "10101";
		String expected = "101010";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the two numbers are the same length and the sum is longer than the two numbers.
	*/
	@Test
	void testAddBinary_10() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "10111";
		String expected = "101010";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
}