// DateToolsTest.java
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
class DateToolsTest {

	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is null.
	 */
	@Test
	public void testFormat_NullDate() {
		Date date = null;
		String format = "yyyy-MM-dd";
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the format parameter is null.
	 */
	@Test
	public void testFormat_NullFormat() {
		Date date = new Date();
		String format = null;
		String expected = null;
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat2() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat3() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat4() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS z";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat5() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS zzzz";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat6() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS zzzz";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat7() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS zzzz";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat8() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS zzzz";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat9() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS zzzz";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)} method.
	 * It tests the case when the date parameter is not null and the format parameter is not null.
	 */
	@Test
	public void testFormat_NotNullDateAndFormat10() {
		Date date = new Date();
		String format = "yyyy-MM-dd HH:mm:ss.SSS zzzz";
		String expected = new SimpleDateFormat(format).format(date);
		String actual = DateTools.format(date, format);
		assertEquals(expected, actual);
	}
}