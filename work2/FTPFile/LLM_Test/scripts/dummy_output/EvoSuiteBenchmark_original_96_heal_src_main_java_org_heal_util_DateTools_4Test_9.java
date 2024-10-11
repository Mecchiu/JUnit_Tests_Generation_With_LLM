// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {
		/**
		 * Tests for {@link DateTools#isValidDate(String)}.
		 */
		@Test
		public void testIsValidDate() {
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				df.setLenient(true);

				assertTrue(DateTools.isValidDate("12-02-2009"));
		}

		/**
		 * Tests for {@link DateTools#parse(String)}.
		 */
		@Test
		public void testParse() {
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				df.setParseIntegerOnly(true);

				date = df.parse("12-02-2009");
				assertEquals("12-02-2009", format(date));

				date = df.parse("12-02");
				assertEquals("12-02", format(date));

				date = df.parse("12\n2");
				assertEquals("12\n23", format(date));


				date = df.parse("12-02-2009\r\n");
				assertEquals("12-02-2923", format(date));

		}

		/**
		 * Tests for {@link DateTools#parse(String, String)}.
		 */
		@Test
		public void testParse_format() throws ParseException {
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
				df.setParseIntegerOnly(true);

				date = df.parse("2012-02-29T23:20");
				assertEquals("2012-02-29T23:20:00", format(date));
				
		}

		/**
		 * Tests for {@link DateTools#parse(String, String, String, boolean)}.
		 */
		@Test
		public void testParse_2Dates() throws ParseException {
				Date d1 = new Date(0L);
				Date d2 = new Date(0L);

				// DateTools.parse("0-08-2008", "%p");
				
				date = DateTools.parse("0-08-2008", null);
			date = DateTools.parse("08-08-2008", "dd MMMM");
				date = new Date(0l);

				// DateTools.parse("8+08-2008", "%p");
				
				date = DateTools.parse("8+08-2008", null);
			date = new Date(0l);

			date = DateTools.parse("07-2008", "dd MMMM");

			date = DateTools.parse("08-2008", null);
			date = new Date(0l);

			date = DateTools.parse("30-08-2008", "dd MMMM");
			date = new Date(0l);

			date = DateTools.parse("30-05-2007", "dd MMM");
			date = new Date(0l);

		}

		/**
		 * Tests for {@link DateTools#parse(String, String, String, boolean)}
		 */
		@Test
		public void testParse_fancy() throws ParseException {
				String df1 = "20120622 0130");
				String df2 = "20120622T2323";
				String df3 = "20120622-1030";
				String df4 = "%p";
				date = null;

				// DateTools.parse("0+08-2008", "%%P");
				
				date = new Date(new Date().getTime() + 1000000L);
			date = new Date(date.getTime() + 1000000l);
			date = DateTools.parse("08-08-2007", null).getTime();
			date = DateTools.parse(df1, null).getTime();

		}
}