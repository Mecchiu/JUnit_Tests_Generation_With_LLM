// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {
		// The following two method tests are to handle the case where
		// either the string or the format is null.
		
		/**
		 * @see NumberTools#parse(String, String)
		 */
		@Test
		public void testParse_String_null() {
			assertNull(NumberTools.parse(null, null));
		}

		/**
		 * @see NumberTools#parse(String, String)
		 */
		@Test
		public void testParse_String_empty() {
			assertNull(NumberTools.parse(null, ""));
		}

		/**
		 * @see DateTools#format(Date)
		 */
		@Test
		public void testFormat_date() {
			assertEquals(DEFAULT_DATE_FORMAT, DateTools.formatDate((Date)null));
			assertEquals(LONG_DATE_FORMAT, DateTools.formatDate((Date)null));
			assertEquals(LONG_DATE_FORMAT, DateTools.formatDate(new Date((long)null)));
		}

		/**
		 * @see DateTools#format(Date)
		 */
		@Test
		public void testFormat_date_with_unknown_date() {
			Date unknown = new Date();
			assertEquals(DEFAULT_DATE_FORMAT + " unknown date", DateTools.formatDate(unknown));
		}

		// DateTools_1Test.java
		interface Test {
			String format(Date date);

			String parse(String dateString, String format);

			String parse(String dateString, Date date);
		}

		private static final Test __unknown = new Test(){
			@Override
			public String format(Date date) {
				throw new IllegalStateException("Not supported yet."); //$NON-NLS-1$
			}
		
			@Override
			public String parse(String dateString, String format) {
				ParseException e = new ParseException("Not supported yet."); //$NON-NLS-1$
				return null;
			}
		};

		/**
		 * @see com.puppycrawl.tools.checkstyle.DateTools_0Test#testParse_String_null()
		 */
		@Test
		public void testParse_String_null() {
			String s = __unknown.format(null);
			assertEquals(PARSE_FAILURE_MESSAGE, s, __unknown.parse("", null));
		}

		/**
		 * @see com.puppycrawl.tools.checkstyle.DateTools_0Test#testParse_String_empty()
		 */
		@Test
		public void testParse_String_empty() {
			String dateString = __unknown.format("");
			String result = __unknown.parse(dateString, null);
			assertEquals(PARSE_SUCCESS_MESSAGE, result, __unknown.format("")); // should be ignored
		}

		/**
		 * @see com.puppycrawl.tools.checkstyle.DateTools_0Test#testParse_String_with_unknown_date()
		 */
		@Test
		public void testParse_String_with_unknown_date() {
			String dateString = __unknown.format("unknown date");
			String result = __unknown.parse(dateString, null);
			assertEquals(ERROR_MESSAGE, result, dateString); // should be ignored
		}

		/**
		 * @see com.puppycrawl.tools.checkstyle.DateTools_0Test#testParse_String_with_unknown_date()
		 */
		@Test
		public void testParse_String_with_unknown_date() {
			String dateString = __unknown.format("unknown date");
			Date date = new Date(0);
			try {
				String result = __unknown.parse(dateString, dateString);
				fail("Should throw IllegalStateException"); //$NON-NLS-1$
			}
			catch (ParseException pe) {
				// Expected.
			}
		}

		public class DateTools {
			@Test
			public void testParse_date(){
				assertEquals(DEFAULT_DATE_FORMAT, DateTools.formatDate((Date)null));
				assertEquals(LONG_DATE_FORMAT, DateTools.formatDate((Date)null));
				assertEquals(LONG_DATE_FORMAT, DateTools.formatDate(new Date((long)null)));
			}

			@Test
			public void testParse_date_with_unknown_date() {
				Date unknown = new Date();
				assertEquals(DEFAULT_DATE_FORMAT + " unknown date", DateTools.formatDate(unknown));
			}
}
}