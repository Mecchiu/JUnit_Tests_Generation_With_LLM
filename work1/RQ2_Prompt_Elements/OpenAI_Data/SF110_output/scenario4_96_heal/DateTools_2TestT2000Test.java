// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {

	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString() {
		String dateString = "2010-01-01";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_2() {
		String dateString = "2010-01-01 00:00:00";
		Date expected = new Date(110, 0, 1, 0, 0, 0);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_3() {
		String dateString = "01/01/2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_4() {
		String dateString = "01-01-2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_5() {
		String dateString = "2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_6() {
		String dateString = "2010-01-01";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString, "yyyy-MM-dd");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_7() {
		String dateString = "2010-01-01 00:00:00";
		Date expected = new Date(110, 0, 1, 0, 0, 0);
		Date actual = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_8() {
		String dateString = "01/01/2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString, "MM/dd/yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_9() {
		String dateString = "01-01-2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString, "MM-dd-yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testParse_ValidDateString_10() {
		String dateString = "2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString, "yyyy");
		assertEquals(expected, actual);
	}
}

// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_3Test {
		
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testIsValidDate_ValidDateString() {
		String dateString = "2010-01-01";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testIsValidDate_ValidDateString_2() {
		String dateString = "2010-01-01 00:00:00";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testIsValidDate_ValidDateString_3() {
		String dateString = "01/01/2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testIsValidDate_ValidDateString_4() {
		String dateString = "01-01-2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testIsValidDate_ValidDateString_5() {
		String dateString = "2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case tests the method with a valid date string.
	*/
	@Test
	void testIsValidDate_ValidDateString_6() {
		String dateString = "2010-01-01";
		