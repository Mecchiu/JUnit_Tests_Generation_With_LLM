// DateTools_3Test.java
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
class DateTools_3Test {

	/**
	* Test case 1 for {@link DateTools#parse(String, String)}.
	* It tests the case when the dateString parameter is null.
	*/
	@Test
	void testParse_1() {
		String dateString = null;
		String format = "yyyy-MM-dd";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link DateTools#parse(String, String)}.
	* It tests the case when the format parameter is null.
	*/
	@Test
	void testParse_2() {
		String dateString = "2020-01-01";
		String format = null;
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link DateTools#parse(String, String)}.
	* It tests the case when the dateString parameter is empty.
	*/
	@Test
	void testParse_3() {
		String dateString = "";
		String format = "yyyy-MM-dd";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link DateTools#parse(String, String)}.
	* It tests the case when the format parameter is empty.
	*/
	@Test
	void testParse_4() {
		String dateString = "2020-01-01";
		String format = "";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link DateTools#parse(String, String)}.
	* It tests the case when the dateString parameter is not a valid date.
	*/
	@Test
	void testParse_5() {
		String dateString = "2020-01-32";
		String format = "yyyy-MM-dd";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link DateTools#parse(String, String)}.
	* It tests the case when the format parameter is not a valid format.
	*/
	@Test
	void testParse_6() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd HH:mm:ss";
		Date expected = null;
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link DateTools#parse(String, String)}.
	* It tests the case when the dateString parameter is a valid date.
	*/
	@Test
	void testParse_7() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link DateTools#parse(String, String)}.
	* It tests the case when the format parameter is a valid format.
	*/
	@Test
	void testParse_8() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link DateTools#parse(String, String)}.
	* It tests the case when the dateString parameter is a valid date and the format parameter is a valid format.
	*/
	@Test
	void testParse_9() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link DateTools#parse(String, String)}.
	* It tests the case when the dateString parameter is a valid date and the format parameter is a valid format.
	*/
	@Test
	void testParse_10() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		Date expected = null;
		try {
			expected = new SimpleDateFormat(format).parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date actual = DateTools.parse(dateString, format);
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
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_4Test {
		
	/**
	* Test case 1 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the dateString parameter is null.
	*/
	@Test
	void testIsValidDate_1() {
		String dateString = null;
		String format = "yyyy-MM-dd";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the format parameter is null.
	*/
	@Test
	void testIsValidDate_2() {
		String dateString = "2020-01-01";
		String format = null;
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the dateString parameter is empty.
	*/
	@Test
	void testIsValidDate_3() {
		String dateString = "";
		String format = "yyyy-MM-dd";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the format parameter is empty.
	*/
	@Test
	void testIsValidDate_4() {
		String dateString = "2020-01-01";
		String format = "";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the dateString parameter is not a valid date.
	*/
	@Test
	void testIsValidDate_5() {
		String dateString = "2020-01-32";
		String format = "yyyy-MM-dd";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the format parameter is not a valid format.
	*/
	@Test
	void testIsValidDate_6() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd HH:mm:ss";
		boolean expected = false;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the dateString parameter is a valid date.
	*/
	@Test
	void testIsValidDate_7() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the format parameter is a valid format.
	*/
	@Test
	void testIsValidDate_8() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the dateString parameter is a valid date and the format parameter is a valid format.
	*/
	@Test
	void testIsValidDate_9() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link DateTools#isValidDate(String, String)}.
	* It tests the case when the dateString parameter is a valid date and the format parameter is a valid format.
	*/
	@Test
	void testIsValidDate_10() {
		String dateString = "2020-01-01";
		String format = "yyyy-MM-dd";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
}

// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_5Test {
		
	/**
	* Test case 1 for {@link DateTools#format(Date, String)}.
	* It tests the case when the date parameter is null.
	*/
	@Test
	void testFormat_1() {
		Date date = null;
		String format = "yyyy-MM-dd";
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link DateTools#format(Date, String)}.
	* It tests the case when the format parameter is null.
	*/
	@Test
	void testFormat_2() {
		Date date = new Date();
		String format = null;
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link DateTools#format(Date, String)}.
	* It tests the case when the date parameter is empty.
	*/
	@Test
	void testFormat_3() {
		Date date = new Date();
		String format = "";
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link DateTools#format(Date, String)}.
	* It tests the case when the format parameter is empty.
	*/
	@Test
	void testFormat_4() {
		Date date = new Date();
		String format = "";
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link DateTools#format(Date, String)}.
	* It tests the case when the date parameter is not a valid date.
	*/
	@Test
	void testFormat_5() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss";
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link DateTools#format(Date, String)}.
	* It tests the case when the format parameter is not a valid format.
	*/
	@Test
	void testFormat_6() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss";
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link DateTools#format(Date, String)}.
	* It tests the case when the date parameter is a valid date.
	*/
	@Test
	void testFormat_7() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link DateTools#format(Date, String)}.
	* It tests the case when the format parameter is a valid format.
	*/
	@Test
	void testFormat_8() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link DateTools#format(Date, String)}.
	* It tests the case when the date parameter is a valid date and the format parameter is a valid format.
	