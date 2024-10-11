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
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_1() {
		String dateString = "2010-01-01";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_2() {
		String dateString = "2010-01-01 00:00:00";
		Date expected = new Date(110, 0, 1, 0, 0, 0);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_3() {
		String dateString = "01/01/2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_4() {
		String dateString = "01-01-2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_5() {
		String dateString = "2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_6() {
		String dateString = "2010-01-01";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString, "yyyy-MM-dd");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_7() {
		String dateString = "2010-01-01 00:00:00";
		Date expected = new Date(110, 0, 1, 0, 0, 0);
		Date actual = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_8() {
		String dateString = "01/01/2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString, "MM/dd/yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_9() {
		String dateString = "01-01-2010";
		Date expected = new Date(110, 0, 1);
		Date actual = DateTools.parse(dateString, "MM-dd-yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#parse(String)} method.
	* The test case is successful if the method returns a {@link Date} object
	* that is equal to the expected {@link Date} object.
	*/
	@Test
	void testParse_10() {
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
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_1() {
		String dateString = "2010-01-01";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_2() {
		String dateString = "2010-01-01 00:00:00";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_3() {
		String dateString = "01/01/2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_4() {
		String dateString = "01-01-2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_5() {
		String dateString = "2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_6() {
		String dateString = "2010-01-01";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, "yyyy-MM-dd");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_7() {
		String dateString = "2010-01-01 00:00:00";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, "yyyy-MM-dd HH:mm:ss");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_8() {
		String dateString = "01/01/2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, "MM/dd/yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_9() {
		String dateString = "01-01-2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, "MM-dd-yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)} method.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testIsValidDate_10() {
		String dateString = "2010";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, "yyyy");
		assertEquals(expected, actual);
	}
}

// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateTools_4Test {
		
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* The test case is successful if the method returns a {@link String} object
	* that is equal to the expected {@link String} object.
	*/
	@Test
	void testFormat_1() {
		Date date = new Date(110, 0, 1);
		String expected = "2010-01-01";
		String actual = DateTools.format(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* The test case is successful if the method returns a {@link String} object
	* that is equal to the expected {@link String} object.
	*/
	@Test
	void testFormat_2() {
		Date date = new Date(110, 0, 1, 0, 0, 0);
		String expected = "2010-01-01 00:00:00";
		String actual = DateTools.format(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* The test case is successful if the method returns a {@link String} object
	* that is equal to the expected {@link String} object.
	*/
	@Test
	void testFormat_3() {
		Date date = new Date(110, 0, 1);
		String expected = "2010-01-01";
		String actual = DateTools.format(date, "yyyy-MM-dd");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* The test case is successful if the method returns a {@link String} object
	* that is equal to the expected {@link String} object.
	*/
	@Test
	void testFormat_4() {
		Date date = new Date(110, 0, 1, 0, 0, 0);
		String expected = "2010-01-01 00:00:00";
		String actual = DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* The test case is successful if the method returns a {@link String} object
	* that is equal to the expected {@link String} object.
	*/
	@Test
	void testFormat_5() {
		Date date = new Date(110, 0, 1);
		String expected = "01/01/2010";
		String actual = DateTools.format(date, "MM/dd/yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* The test case is successful if the method returns a {@link String} object
	* that is equal to the expected {@link String} object.
	*/
	@Test
	void testFormat_6() {
		Date date = new Date(110, 0, 1);
		String expected = "01-01-2010";
		String actual = DateTools.format(date, "MM-dd-yyyy");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* The test case is successful if the method returns a {@link String} object
	* that is equal to the expected {@link String} object.
	*/
	@Test
	void testFormat_7() {
		Date date = new Date(110, 0, 1);
		String expected = "2010";
		String actual = DateTools.format(date, "yyyy");
		assertEquals(expected, actual);
	}
}