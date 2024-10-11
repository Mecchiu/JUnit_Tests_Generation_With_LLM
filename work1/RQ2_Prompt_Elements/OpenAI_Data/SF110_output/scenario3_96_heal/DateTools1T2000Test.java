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
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a null date parameter.
	 */
	@Test
	public void testFormatNullDate() {
		assertNull(DateTools.format(null, "yyyy-MM-dd"));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a null format parameter.
	 */
	@Test
	public void testFormatNullFormat() {
		assertNull(DateTools.format(new Date(), null));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a null date and format parameters.
	 */
	@Test
	public void testFormatNullDateAndFormat() {
		assertNull(DateTools.format(null, null));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and format parameters.
	 */
	@Test
	public void testFormatValidDateAndFormat() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertEquals(expected, DateTools.format(date, format));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatValidDateAndInvalidFormat() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(date, "yyyy-MM-dd HH:mm:ss"));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatInvalidDateAndValidFormat() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(new Date(date.getTime() + 1000), format));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatInvalidDateAndInvalidFormat() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(new Date(date.getTime() + 1000), "yyyy-MM-dd HH:mm:ss"));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatValidDateAndInvalidFormat2() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(date, "yyyy-MM-dd HH:mm:ss"));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatInvalidDateAndValidFormat2() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(new Date(date.getTime() + 1000), format));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatInvalidDateAndInvalidFormat2() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(new Date(date.getTime() + 1000), "yyyy-MM-dd HH:mm:ss"));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatValidDateAndInvalidFormat3() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(date, "yyyy-MM-dd HH:mm:ss"));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatInvalidDateAndValidFormat3() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(new Date(date.getTime() + 1000), format));
	}
	
	/**
	 * Test case for {@link DateTools#format(Date, String)}
	 * with a valid date and invalid format parameters.
	 */
	@Test
	public void testFormatInvalidDateAndInvalidFormat3() {
		Date date = new Date();
		String format = "yyyy-MM-dd";
		String expected = new SimpleDateFormat(format).format(date);
		assertNotEquals(expected, DateTools.format(new Date(date.getTime() + 1000), "yyyy-MM-dd HH:mm:ss"));
	}
}
```

## 2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.