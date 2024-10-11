// BinaryCalculateTest.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculateTest {

	/**
	* Test case 1 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is greater than the second binary number.
	*/
	@Test
	public void testSubBinary1() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "101";
		String num2 = "10";
		String expected = "11";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is less than the second binary number.
	*/
	@Test
	public void testSubBinary2() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10";
		String num2 = "101";
		String expected = "11";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is equal to the second binary number.
	*/
	@Test
	public void testSubBinary3() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "101";
		String num2 = "101";
		String expected = "0";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is greater than the second binary number and
	* the second binary number has more digits than the first binary number.
	*/
	@Test
	public void testSubBinary4() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "101";
		String num2 = "1010";
		String expected = "11";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is less than the second binary number and
	* the first binary number has more digits than the second binary number.
	*/
	@Test
	public void testSubBinary5() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "1010";
		String num2 = "101";
		String expected = "11";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is greater than the second binary number and
	* the second binary number has less digits than the first binary number.
	*/
	@Test
	public void testSubBinary6() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "1010";
		String num2 = "10";
		String expected = "1000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is less than the second binary number and
	* the first binary number has less digits than the second binary number.
	*/
	@Test
	public void testSubBinary7() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10";
		String num2 = "1010";
		String expected = "1000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is greater than the second binary number and
	* the second binary number has more digits than the first binary number.
	*/
	@Test
	public void testSubBinary8() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "1010";
		String num2 = "101";
		String expected = "11";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is less than the second binary number and
	* the first binary number has more digits than the second binary number.
	*/
	@Test
	public void testSubBinary9() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "101";
		String num2 = "1010";
		String expected = "11";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link BinaryCalculate#subBinary(String, String)}.
	* It tests the case when the first binary number is greater than the second binary number and
	* the second binary number has less digits than the first binary number.
	*/
	@Test
	public void testSubBinary10() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "1010";
		String num2 = "10";
		String expected = "1000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
}