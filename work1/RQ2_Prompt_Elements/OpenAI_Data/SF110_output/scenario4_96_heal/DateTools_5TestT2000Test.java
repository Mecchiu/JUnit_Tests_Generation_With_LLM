// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_5Test {

	/**
	* Test case 1 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 1 is to test the method with a valid date string and a valid format.
	* The expected result is true.
	*/
	@Test
	void testIsValidDate_1() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 2 is to test the method with a valid date string and an invalid format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_2() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd HH:mm:ss";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 3 is to test the method with an invalid date string and a valid format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_3() {
		String dateString = "2020-01-01 00:00:00";
		String format = "yyyy-MM-dd";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 4 is to test the method with an invalid date string and an invalid format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_4() {
		String dateString = "2020-01-01 00:00:00";
		String format = "yyyy-MM-dd HH:mm:ss";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 5 is to test the method with a null date string and a valid format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_5() {
		String dateString = null;
		String format = "yyyy-MM-dd";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 6 is to test the method with a null date string and an invalid format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_6() {
		String dateString = null;
		String format = "yyyy-MM-dd HH:mm:ss";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 7 is to test the method with a valid date string and a null format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_7() {
		String dateString = "2020-01-01";
		String format = null;
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 8 is to test the method with an invalid date string and a null format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_8() {
		String dateString = "2020-01-01 00:00:00";
		String format = null;
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 9 is to test the method with a null date string and a null format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_9() {
		String dateString = null;
		String format = null;
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for method {@link DateTools#isValidDate(String, String)}.
	* Test case 10 is to test the method with an empty date string and a valid format.
	* The expected result is false.
	*/
	@Test
	void testIsValidDate_10() {
		String dateString = "";
		String format = "yyyy-MM-dd";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
}

// DateTools_6Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_6Test {
		
	/**
	* Test case 1 for method {@link DateTools#parse(String, String)}.
	* Test case 1 is to test the method with a valid date string and a valid format.
	* The expected result is a date object.
	*/
	@Test
	void testParse_1() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = new Date(2020-1900, 0, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for method {@link DateTools#parse(String, String)}.
	* Test case 2 is to test the method with a valid date string and an invalid format.
	* The expected result is null.
	*/
	@Test
	void testParse_2() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd HH:mm:ss";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for method {@link DateTools#parse(String, String)}.
	* Test case 3 is to test the method with an invalid date string and a valid format.
	* The expected result is null.
	*/
	@Test
	void testParse_3() {
		String dateString = "2020-01-01 00:00:00";
		String format = "yyyy-MM-dd";
		Date expected = null;
		Date actual = DateTools.parse(