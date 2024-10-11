// DateToolsTest.java
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
class DateToolsTest {

	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testParseValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testParseInvalidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and invalid format.
	 */
	@Test
	public void testParseValidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and invalid format.
	 */
	@Test
	public void testParseInvalidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and null format.
	 */
	@Test
	public void testParseValidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and null format.
	 */
	@Test
	public void testParseInvalidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and empty format.
	 */
	@Test
	public void testParseValidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and empty format.
	 */
	@Test
	public void testParseInvalidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and blank format.
	 */
	@Test
	public void testParseValidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and blank format.
	 */
	@Test
	public void testParseInvalidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and null date.
	 */
	@Test
	public void testParseValidDateNullDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and null date.
	 */
	@Test
	public void testParseInvalidDateNullDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and empty date.
	 */
	@Test
	public void testParseValidDateEmptyDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and empty date.
	 */
	@Test
	public void testParseInvalidDateEmptyDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and blank date.
	 */
	@Test
	public void testParseValidDateBlankDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and blank date.
	 */
	@Test
	public void testParseInvalidDateBlankDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
