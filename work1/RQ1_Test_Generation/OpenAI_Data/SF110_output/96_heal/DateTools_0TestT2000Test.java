// DateTools_0Test.java
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
class DateTools_0Test {

	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: null.
	* Expected result: null.
	*/
	@Test
	void testFormat_0() {
		Date date = null;
		String result = DateTools.format(date);
		assertNull(result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(0).
	* Expected result: "1970-01-01".
	*/
	@Test
	void testFormat_1() {
		Date date = new Date(0);
		String result = DateTools.format(date);
		assertEquals("1970-01-01", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(1).
	* Expected result: "1970-01-01".
	*/
	@Test
	void testFormat_2() {
		Date date = new Date(1);
		String result = DateTools.format(date);
		assertEquals("1970-01-01", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(86400000).
	* Expected result: "1970-01-02".
	*/
	@Test
	void testFormat_3() {
		Date date = new Date(86400000);
		String result = DateTools.format(date);
		assertEquals("1970-01-02", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(86400001).
	* Expected result: "1970-01-02".
	*/
	@Test
	void testFormat_4() {
		Date date = new Date(86400001);
		String result = DateTools.format(date);
		assertEquals("1970-01-02", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(86400000 * 2).
	* Expected result: "1970-01-03".
	*/
	@Test
	void testFormat_5() {
		Date date = new Date(86400000 * 2);
		String result = DateTools.format(date);
		assertEquals("1970-01-03", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(86400000 * 2 + 1).
	* Expected result: "1970-01-03".
	*/
	@Test
	void testFormat_6() {
		Date date = new Date(86400000 * 2 + 1);
		String result = DateTools.format(date);
		assertEquals("1970-01-03", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(86400000 * 365).
	* Expected result: "1971-01-01".
	*/
	@Test
	void testFormat_7() {
		Date date = new Date(86400000 * 365);
		String result = DateTools.format(date);
		assertEquals("1971-01-01", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(86400000 * 365 + 1).
	* Expected result: "1971-01-01".
	*/
	@Test
	void testFormat_8() {
		Date date = new Date(86400000 * 365 + 1);
		String result = DateTools.format(date);
		assertEquals("1971-01-01", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date)} method.
	* Test data: new Date(86400000 * 365 * 2).
	* Expected result: "1972-01-01".
	*/
	@Test
	void testFormat_9() {
		Date date = new Date(86400000 * 365 * 2);
		String result = DateTools.format(date);
		assertEquals("1972-01-01", result);
	}
	
}

// DateTools_1Test.java
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
class DateTools_1Test {
		
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null, "yyyy-MM-dd".
	* Expected result: null.
	*/
	@Test
	void testFormat_0() {
		Date date = null;
		String format = "yyyy-MM-dd";
		String result = DateTools.format(date, format);
		assertNull(result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: new Date(0), "yyyy-MM-dd".
	* Expected result: "1970-01-01".
	*/
	@Test
	void testFormat_1() {
		Date date = new Date(0);
		String format = "yyyy-MM-dd";
		String result = DateTools.format(date, format);
		assertEquals("1970-01-01", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: new Date(1), "yyyy-MM-dd".
	* Expected result: "1970-01-01".
	*/
	@Test
	void testFormat_2() {
		Date date = new Date(1);
		String format = "yyyy-MM-dd";
		String result = DateTools.format(date, format);
		assertEquals("1970-01-01", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: new Date(86400000), "yyyy-MM-dd".
	* Expected result: "1970-01-02".
	*/
	@Test
	void testFormat_3() {
		Date date = new Date(86400000);
		String format = "yyyy-MM-dd";
		String result = DateTools.format(date, format);
		assertEquals("1970-01-02", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: new Date(86400001), "yyyy-MM-dd".
	* Expected result: "1970-01-02".
	*/
	@Test
	void testFormat_4() {
		Date date = new Date(86400001);
		String format = "yyyy-MM-dd";
		String result = DateTools.format(date, format);
		assertEquals("1970-01-02", result);
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: new Date(86400000 * 2), "yyyy-MM-dd".
	* Expected result: "1970-01-03".
	*/
	@Test
	void testFormat_5() {
		Date date = new Date(86400000 * 2);
		String format = "yyyy-MM-dd";
		String result = DateTools.format(date, format);
		assertEquals("1970-01-