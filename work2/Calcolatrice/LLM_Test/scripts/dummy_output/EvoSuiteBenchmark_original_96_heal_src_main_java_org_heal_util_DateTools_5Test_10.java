// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_5Test {
		/**
		* Generate <code>isValidDate(String)</code> with default <code>format</code>
		* specified. Checks to see if a {@link Date} is valid using
		* {{@link SimpleDateFormat#isValid(Date) isValid}}
		* <p>
		* Expected results:
		* <ul>
		* <li>{@link DateTools_5Test#isValidDate(String, String) valid}
		* and returns <code>true</code></li>
		* <li>{@link DateTools_5Test#isValidDate(String, String) valid}
		* and returns <code>false</code></li>
		* <li>[invalid date format]</li>
		* <li>(ParseException)</li>
		* <li>(ParseException) (2, 3) and returns <code>false</code></li>
		* </ul>
		* @throws ParseException Throws the {@link ParseException}.
		* @see SimpleDateFormat
		*/
		@Test
		public void test_validation_WithDefault_isValidDate() throws ParseException {
			assertFalse(DateTools_5Test.isValidDate("Invalid", DEFAULT_DATE_FORMAT));
			assertFalse(DateTools_5Test.isValidDate("Valid", DEFAULT_DATE_FORMAT));
		}

		/**
		* Generate <code>isValidDate(String,String)</code> with custom format specified to use the default
		* <code>format</code> specified.
		* Tests using the default format. Checks to see if a {@link Date} is valid using
        * {@link SimpleDateFormat#isValid(Date) isValid}
        * The format string is simply the expected one.
		* <p>
		* Expected results:
		* <ul>
		* <li>{@link DateTools_5Test#isValidDate(String, String) valid}
		* and returns <code>true</code> (as expected)</li>
		* <li>{@link DateTools_5Test#isValidDate(String, String) valid}
		* and returns <code>false</code></li>
		* </ul>
		* @throws ParseException Throws the {@link ParseException}.
		* @see SimpleDateFormat
		*/
		@Test
		public void test_validation_WithCustomFormat_isValidDate() throws ParseException {
			assertFalse(DateTools_5Test.isValidDate("Invalid","yyyy-MM-dd HH:mm:ss", DEFAULT_DATE_FORMAT));
			assertFalse(DateTools_5Test.isValidDate("Valid","yyyy-MM-dd HH:mm:ss", DEFAULT_DATE_FORMAT));
		}
}