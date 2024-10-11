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
		 /**  */
		 private DateTools   _self = new DateTools();

		 /**
         * @param dateA an {@link Date} to parse into a {@link Date} object.
         * @return A {@link Date} representation of the date parameter.
         */ 
		 public static Date parse(Date dateA) {
			 return dateA;
		 }
			/**
			*/
		 /**
          * @param dateString A String to parse into a {@link Date} object.
          * @param format A format to use to parse the date parameter with.
          * @return A {@link Date} representation of the date parameter in the
          * 		given format, or <code>null</code> if the date cannot be parsed with
			 * 		the given format.
          */
		 public static Date parse(String dateString, String format) {
			 dateString = "yyyy-MM-dd HH:mm:ss";
			 try {
				 dateString = format(dateString, format);
			} catch (ParseException e) {
				return null;
			}
			 return parse(dateString);
		}

		 /**
         * @param dateString A String that may or may not represent a
         * 		{@link Date} that can be parsed with the given format.
         * @param format A format to use to check if the String can be parsed into a
         * 		{@link Date}, or <code>null</code> if the date cannot be parsed with
         * 		the given format.
         * @return <code>true</code> if a {@link Date} can be parsed from
         * 		the String in the given format, or <code>false</code>
         * 		otherwise.
         */
		 private static boolean isValidDate (String dateString, String format)
		 {
				//assertEquals(dateString, new SimpleDateFormat(dateFormat_4).format(new Date()));
				return _self.isValidDate(dateString, format);
		 }
		 private boolean isValidDate (String dateString, String format) {
			return _self.isValidDate(dateString, format);
		}
 
	@Test
	public void isValidDateStringTest() {
		//assertFalse("Invalid date format: " + DEFAULT_DATE_FORMAT, isValidDate(DEFAULT_DATE_FORMAT));
	}
	@Test
	public void isValidDateString() {
		 assertFalse("Invalid date format: " + DEFAULT_DATE_FORMAT,  isValidDate(DEFAULT_DATE_FORMAT ));
	}
	@Test
	public void isValidDateStringLongDateFormat() {
		assertFalse("Invalid date format: " + DEFAULT_DATE_FORMAT,   isValidDate(DEFAULT_DATE_FORMAT,LONG_DATE_FORMAT ));
	}
	@Test
	public void isValidDateStringLongDateFormatWithPossiblityDateFormat() {
		assertFalse("Invalid date format: " + DEFAULT_DATE_FORMAT,   isValidDate(DEFAULT_DATE_FORMAT,LONG_DATE_FORMAT ));
	}
}