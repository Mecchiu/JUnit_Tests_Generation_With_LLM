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
	void testAddBinary_FirstNumberNull() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("0", bc.addBinary(null, "0"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the second number is null.
	*/
	@Test
	void testAddBinary_SecondNumberNull() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("0", bc.addBinary("0", null));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are null.
	*/
	@Test
	void testAddBinary_BothNumbersNull() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("0", bc.addBinary(null, null));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the first number is empty.
	*/
	@Test
	void testAddBinary_FirstNumberEmpty() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("0", bc.addBinary("", "0"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the second number is empty.
	*/
	@Test
	void testAddBinary_SecondNumberEmpty() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("0", bc.addBinary("0", ""));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are empty.
	*/
	@Test
	void testAddBinary_BothNumbersEmpty() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("0", bc.addBinary("", ""));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the first number is zero.
	*/
	@Test
	void testAddBinary_FirstNumberZero() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("1", bc.addBinary("0", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when the second number is zero.
	*/
	@Test
	void testAddBinary_SecondNumberZero() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("1", bc.addBinary("1", "0"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are zero.
	*/
	@Test
	void testAddBinary_BothNumbersZero() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("0", bc.addBinary("0", "0"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "01"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("01", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("01", "01"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("001", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("001", "001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "0001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("0001", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("0001", "0001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "00001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("00001", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("00001", "00001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "000001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("000001", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("000001", "000001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "0000001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("0000001", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("0000001", "0000001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "00000001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("00000001", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("00000001", "00000001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_SecondNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("1", "000000001"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_FirstNumberLonger() {
		BinaryCalculate bc = new BinaryCalculate();
		assertEquals("10", bc.addBinary("000000001", "1"));
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the case when both numbers are one.
	*/
	@Test
	void testAddBinary_BothNumbersOne_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger_BothNumbersLonger() {
		BinaryCalculate bc = new BinaryCalculate();
	