// DateToolsTest.java
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
class DateToolsTest {
		
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testIsValidDateValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testIsValidDateInvalidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and invalid format.
	 */
	@Test
	public void testIsValidDateValidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and invalid format.
	 */
	@Test
	public void testIsValidDateInvalidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and null format.
	 */
	@Test
	public void testIsValidDateValidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and null format.
	 */
	@Test
	public void testIsValidDateInvalidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and empty format.
	 */
	@Test
	public void testIsValidDateValidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and empty format.
	 */
	@Test
	public void testIsValidDateInvalidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and blank format.
	 */
	@Test
	public void testIsValidDateValidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and blank format.
	 */
	@Test
	public void testIsValidDateInvalidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
}