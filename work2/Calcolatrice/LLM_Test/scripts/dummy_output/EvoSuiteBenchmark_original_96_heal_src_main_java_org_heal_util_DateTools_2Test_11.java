// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {
		/**
		 * A String to parse into a {@link Date} object.
		 */
		private String dateString = "January 12, 2014";

		/**
		 * A String that may or may not represent a
		 * {@link Date} that can be parsed.
		 */
		private String format = null;

		/**
		 * An object reprearning a date representation.
		 */
		private Date parsed = null;

		/**
		 * Tests the parsing of the given {@link String} with the default
		 * {@link #DEFAULT_DATE_FORMAT}.
		 */
		public void testParse_01() {
				// Method returns a Date
				parsed = DateTools.parse(dateString, DEFAULT_DATE_FORMAT);

		assertNotNull("The parsed Date is null.", parsed);

		assertEquals("The parsed date time value is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getTime());

		assertEquals("The parsed date object is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getClass());

			// test the parsing of the date string without specific date format
			parsed = DateTools.parse(dateString, null);

		assertNotNull("The parsed Date is null.", parsed);

		assertEquals("The parsed date time value is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getTime());

		assertEquals("The parsed date object is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getClass());

				assertTrue("The date string '" + dateString + "' is not parseable.", parsed.parse(dateString)) == true;
		}

				/**
		 * Tests the parsing of the given {@link String} with the specified {@link #format}.
		 */

		public void testParse_02() {
				// method returns a Date
				parsed = DateTools.parse(dateString, format);

		assertNotNull("The parsed Date is null.", parsed);

		assertEquals("The parsed date time value is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getTime());

		assertEquals("The parsed date object is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getClass());

				// test the parsing of the date string without specific format
				parsed = DateTools.parse(dateString, null);

		assertNotNull("The parsed Date is null.", parsed);

		assertEquals("The parsed date time value is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getTime());

		assertEquals("The parsed date object is not equal.", DateTools.DEFAULT_DATE_FORMAT, parsed.getClass());

				assertTrue("The date string '" + dateString + "' is not parseable.", parsed.parse(dateString)) == true;
		}

		/**
		 * Tests the printing of the values of the date parameters.
		 */

		public void testPrint() {
				// method returns a String as a readable text
				String string = "\u2013" + dateString + "\t";

				// method returns a readable format
				formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

				formattedTest.add(string + formatter.format(parsed));
		}

		/**
		 * Tests the printing of the date parameters
		 */

		public void testPrintAll() {

		String string = "\u2013" + dateString + "\t";

		// method returns a String as a readable text
		formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

		formattedTest.add(string);

		}

		private SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

		private String[] formattedTest = new String[] {"01-01", "02-01", "03_01"};

		private static DateTestFormatter formatter;

		// a static initializer of the method.
		static {
			formatter = new DateTestFormatter(formattedTest);
		}
}