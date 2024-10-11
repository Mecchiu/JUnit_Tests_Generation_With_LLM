// BinaryCalculate_0Test.java
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
class BinaryCalculate_0Test {

	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testAddBinary_0() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "101000";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testAddBinary_1() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "1000111";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testAddBinary_2() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "101000";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testAddBinary_3() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "1000111";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testAddBinary_4() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "101000";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testAddBinary_5() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "1000111";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testAddBinary_6() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "101000";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testAddBinary_7() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "1000111";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testAddBinary_8() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "101000";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testAddBinary_9() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "1000111";
		String actual = bc.addBinary(num1, num2);
		assertEquals(expected, actual);
	}
}

// BinaryCalculate_1Test.java
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
class BinaryCalculate_1Test {
		
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testSubBinary_0() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "11000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testSubBinary_1() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "110101";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testSubBinary_2() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "11000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testSubBinary_3() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "110101";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testSubBinary_4() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "11000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testSubBinary_5() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "110101";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testSubBinary_6() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "11000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testSubBinary_7() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "110101";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testSubBinary_8() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "11011";
		String expected = "11000";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testSubBinary_9() {
		BinaryCalculate bc = new BinaryCalculate();
		String num1 = "10101";
		String num2 = "110110";
		String expected = "110101";
		String actual = bc.subBinary(num1, num2);
		assertEquals(expected, actual);
	}
}

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
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testIPCalculate_0() {
		BinaryCalculate bc = new BinaryCalculate();
		String IP = "10101";
		String IPPrefix = "11011";
		String expected = "11000";
		String actual = bc.IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testIPCalculate_1() {
		BinaryCalculate bc = new BinaryCalculate();
		String IP = "10101";
		String IPPrefix = "110110";
		String expected = "110101";
		String actual = bc.IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testIPCalculate_2() {
		BinaryCalculate bc = new BinaryCalculate();
		String IP = "10101";
		String IPPrefix = "11011";
		String expected = "11000";
		String actual = bc.IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testIPCalculate_3() {
		BinaryCalculate bc = new BinaryCalculate();
		String IP = "10101";
		String IPPrefix = "110110";
		String expected = "110101";
		String actual = bc.IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with two binary numbers that are equal in length.
	*/
	@Test
	void testIPCalculate_4() {
		BinaryCalculate bc = new BinaryCalculate();
		String IP = "10101";
		String IPPrefix = "11011";
		String expected = "11000";
		String actual = bc.IPCalculate(IP, IPPrefix);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link BinaryCalculate#IPCalculate(String, String)} method.
	* It tests the method with two binary numbers that are not equal in length.
	*/
	@Test
	void testIPCalculate_5() {
		BinaryCalculate bc = new BinaryCalculate();
		String IP = "