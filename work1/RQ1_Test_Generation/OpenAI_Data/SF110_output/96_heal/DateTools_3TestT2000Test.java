// DateTools_3Test.java
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
class DateTools_3Test {

		/**
		* Test case 1 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_1() throws ParseException {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_2() throws ParseException {
				String dateString = "01/01/2000";
				String format = "MM-dd-yyyy";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_3() throws ParseException {
				String dateString = "01/01/2000";
				String format = "yyyy";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_4() throws ParseException {
				String dateString = "01/01/2000";
				String format = "yyyy-MM-dd";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_5() throws ParseException {
				String dateString = "01/01/2000";
				String format = "yyyy-MM-dd HH:mm:ss";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_6() throws ParseException {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_7() throws ParseException {
				String dateString = "01/01/2000";
				String format = "MM-dd-yyyy";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_8() throws ParseException {
				String dateString = "01/01/2000";
				String format = "yyyy";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_9() throws ParseException {
				String dateString = "01/01/2000";
				String format = "yyyy-MM-dd";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link DateTools#parse(String, String)}
		*
		* @throws ParseException
		*/
		@Test
		void testParse_10() throws ParseException {
				String dateString = "01/01/2000";
				String format = "yyyy-MM-dd HH:mm:ss";
				Date expected = new SimpleDateFormat(format).parse(dateString);
				Date actual = DateTools.parse(dateString, format);
				assertEquals(expected, actual);
		}
}