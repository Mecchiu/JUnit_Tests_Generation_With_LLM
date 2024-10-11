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
		public void parse(String dateString) throws ParseException {
			// assert timezone!= null;
			assertNotNull(dateString);
			assertTrue(!dateString.isEmpty());
			String format = getFormat(dateString);
			String actualDate =  DateTools.parse(dateString, format);
			Date expected = null;
			if (format!= null) {
				SimpleDateFormat simpleDateFormat 
					= new SimpleDateFormat(format);
				String dateString1 = simpleDateFormat.format(new Date());
				actualDate = DateTools.parse(dateString1);
				assertNotNull(actualDate);
			}
			assertEquals(actualDate, expected);
		}
		
		public static String getFormat(String dateString) {
			String dateTimeFormats[] = POSSIBLE_DATE_FORMATS;
			String dateStringTmp = null;
			for (int i=0; i < dateTimeFormats.length; i++)
			{
				dateStringTmp = dateString + dateTimeFormats[i];
				if (dateStringTmp.equals(dateString))
					return dateTimeFormats[i];
			}
			return null;
		}
		
		public static Date parse(String data) throws ParseException {
			String dateTimeFormats[] = POSSIBLE_DATE_FORMATS;
			return new SimpleDateFormat(dateTimeFormats[0]).parse(data);
		}
		
		public static String toString(Date data) {
			SimpleDateFormat sdf = DateTools.dateTimeFormat(data);
			return sdf.format(data);
		}
		
		@Test
		public void testValidDate1() throws ParseException {
			// date is string
			Date date = parse("2014-10-16"); 
			assertNotNull(date);
		}
		
		@Test
		public void testValidDate2() throws ParseException {
			// date is String
			Date date = parse("2013-10-16");
			assertNotNull(date);
		}

		// @Test 
		// public void testInvalidDate1() throws ParseException {
		// assert false;
		// }
		
		
		// @Test
		// public void testInvalidDate2() throws ParseException {
		// assert false;
		// }
		
}