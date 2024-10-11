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
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* </ul>
	* The expected result is "0".
	*/
	@Test
	void testSubBinary_1() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111111111111";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("0", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111111111110"</li>
	* </ul>
	* The expected result is "1".
	*/
	@Test
	void testSubBinary_2() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111111111110";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("1", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111111111101"</li>
	* </ul>
	* The expected result is "10".
	*/
	@Test
	void testSubBinary_3() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111111111101";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("10", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111111111011"</li>
	* </ul>
	* The expected result is "100".
	*/
	@Test
	void testSubBinary_4() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111111111011";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("100", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111111110111"</li>
	* </ul>
	* The expected result is "1000".
	*/
	@Test
	void testSubBinary_5() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111111110111";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("1000", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111111101111"</li>
	* </ul>
	* The expected result is "10000".
	*/
	@Test
	void testSubBinary_6() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111111101111";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("10000", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111111011111"</li>
	* </ul>
	* The expected result is "100000".
	*/
	@Test
	void testSubBinary_7() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111111011111";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("100000", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111110111111"</li>
	* </ul>
	* The expected result is "1000000".
	*/
	@Test
	void testSubBinary_8() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111110111111";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("1000000", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111101111111"</li>
	* </ul>
	* The expected result is "10000000".
	*/
	@Test
	void testSubBinary_9() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111101111111";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("10000000", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1111111111111111111111111111111111111111111111111111111111111111"</li>
	* <li>num2 = "1111111111111111111111111111111111111111111111111111111011111111"</li>
	* </ul>
	* The expected result is "100000000".
	*/
	@Test
	void testSubBinary_10() {
		String num1 = "1111111111111111111111111111111111111111111111111111111111111111";
		String num2 = "1111111111111111111111111111111111111111111111111111111011111111";
		String result = new BinaryCalculate().subBinary(num1, num2);
		assertEquals("100000000", result);
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
* It contains ten unit test cases for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_2Test {
		
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "0"</li>
	* <li>num2 = "0"</li>
	* </ul>
	* The expected result is "0".
	*/
	@Test
	void testAddBinary_1() {
		String num1 = "0";
		String num2 = "0";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("0", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "0"</li>
	* <li>num2 = "1"</li>
	* </ul>
	* The expected result is "1".
	*/
	@Test
	void testAddBinary_2() {
		String num1 = "0";
		String num2 = "1";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("1", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1"</li>
	* <li>num2 = "0"</li>
	* </ul>
	* The expected result is "1".
	*/
	@Test
	void testAddBinary_3() {
		String num1 = "1";
		String num2 = "0";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("1", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "1"</li>
	* <li>num2 = "1"</li>
	* </ul>
	* The expected result is "10".
	*/
	@Test
	void testAddBinary_4() {
		String num1 = "1";
		String num2 = "1";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("10", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "10"</li>
	* <li>num2 = "0"</li>
	* </ul>
	* The expected result is "10".
	*/
	@Test
	void testAddBinary_5() {
		String num1 = "10";
		String num2 = "0";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("10", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "10"</li>
	* <li>num2 = "1"</li>
	* </ul>
	* The expected result is "11".
	*/
	@Test
	void testAddBinary_6() {
		String num1 = "10";
		String num2 = "1";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("11", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "10"</li>
	* <li>num2 = "10"</li>
	* </ul>
	* The expected result is "100".
	*/
	@Test
	void testAddBinary_7() {
		String num1 = "10";
		String num2 = "10";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("100", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "100"</li>
	* <li>num2 = "0"</li>
	* </ul>
	* The expected result is "100".
	*/
	@Test
	void testAddBinary_8() {
		String num1 = "100";
		String num2 = "0";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("100", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "100"</li>
	* <li>num2 = "1"</li>
	* </ul>
	* The expected result is "101".
	*/
	@Test
	void testAddBinary_9() {
		String num1 = "100";
		String num2 = "1";
		String result = new BinaryCalculate().addBinary(num1, num2);
		assertEquals("101", result);
	}
	
	/**
	* Test case for {@link BinaryCalculate#addBinary(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>num1 = "100"</li>
	* <li>num2 = "10