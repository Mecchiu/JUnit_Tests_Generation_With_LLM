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
private final String formatDate
			= "";     // this format is not yet specified

		@junit.jupiter.BeforeAll
	    //@before:
		//@param: format {@value} is not yet specified
		public void setFormatter(String format) {
			if (!formatNullValid) {
				this.format = format;
				getTimeDateStr();
			} else {
				// if you don't make any changes, 
				// then this should be executed before the junit tests!
				// set the DateTools constants
		        //getTimeDate();
			}
	    }

		@Test
		public void getTimeDate() {
			assertNotSame(getTimeDateStr(), getTimeDateStr());
			assertSame(formatDate, this.format);
		}

		@Test
		public void testFormat() throws ParseException {
			//System.setProperty("date.locale.format.default", formatDate);
			assertEquals(formatDate, this.format);
			final Date d = dateConvert(this.format, DEFAULT_DATE_FORMAT);
			assertSame(DateTools.format(d), dateConvert(this.format));
		}

		@Test
			void dateConvertDateFromString() throws ParseException {
			final Date d = dateConvert(this.format, "yyyy-MM-dd");
				assertTrue(d instanceof Date);
			assertEquals(d, dateConvert(this.format));
			}

		@Test
			void dateConvertDateFromClass() throws ParseException {
			final Date d = dateConvert(this.format, DateTools.class);
				assertTrue(d instanceof Date);
			assertEquals(d, dateConvert(this.format));
			}
}

// DateTools_1Test.java
