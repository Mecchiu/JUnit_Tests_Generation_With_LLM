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
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_1() {
		Date date = null;
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_2() {
		Date date = new Date();
		String format = null;
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_3() {
		Date date = null;
		String format = null;
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_4() {
		Date date = new Date();
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_5() {
		Date date = new Date();
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_6() {
		Date date = new Date();
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_7() {
		Date date = new Date();
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_8() {
		Date date = new Date();
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_9() {
		Date date = new Date();
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#format(Date, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testFormat_10() {
		Date date = new Date();
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(date, format);
		});
	}
}

// DateTools_2Test.java
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
class DateTools_2Test {
		
	/**
	* Test case for {@link DateTools#parse(String, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testParse_1() {
		String dateString = null;
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.parse(dateString, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#parse(String, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testParse_2() {
		String dateString = "";
		String format = null;
		assertThrows(NullPointerException.class, () -> {
			DateTools.parse(dateString, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#parse(String, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testParse_3() {
		String dateString = null;
		String format = null;
		assertThrows(NullPointerException.class, () -> {
			DateTools.parse(dateString, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#parse(String, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testParse_4() {
		String dateString = "";
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.parse(dateString, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#parse(String, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testParse_5() {
		String dateString = "";
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.parse(dateString, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#parse(String, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testParse_6() {
		String dateString = "";
		String format = "";
		assertThrows(NullPointerException.class, () -> {
			DateTools.parse(dateString, format);
		});
	}
	
	/**
	* Test case for {@link DateTools#parse(String,