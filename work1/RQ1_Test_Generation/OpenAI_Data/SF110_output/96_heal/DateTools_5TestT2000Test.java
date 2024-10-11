// DateTools_5Test.java
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
class DateTools_5Test {

		/**
		* Test case 1 for {@link DateTools#isValidDate(String, String)}.
		* The input date is valid and the format is valid.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_1() {
				String date = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link DateTools#isValidDate(String, String)}.
		* The input date is valid and the format is invalid.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_2() {
				String date = "2020-01-01";
				String format = "yyyy-MM-dd HH:mm:ss";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link DateTools#isValidDate(String, String)}.
		* The input date is invalid and the format is valid.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_3() {
				String date = "2020-01-32";
				String format = "yyyy-MM-dd";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link DateTools#isValidDate(String, String)}.
		* The input date is invalid and the format is invalid.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_4() {
				String date = "2020-01-32";
				String format = "yyyy-MM-dd HH:mm:ss";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link DateTools#isValidDate(String, String)}.
		* The input date is null and the format is valid.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_5() {
				String date = null;
				String format = "yyyy-MM-dd";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link DateTools#isValidDate(String, String)}.
		* The input date is null and the format is invalid.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_6() {
				String date = null;
				String format = "yyyy-MM-dd HH:mm:ss";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link DateTools#isValidDate(String, String)}.
		* The input date is valid and the format is null.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_7() {
				String date = "2020-01-01";
				String format = null;
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link DateTools#isValidDate(String, String)}.
		* The input date is invalid and the format is null.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_8() {
				String date = "2020-01-32";
				String format = null;
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link DateTools#isValidDate(String, String)}.
		* The input date is null and the format is null.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_9() {
				String date = null;
				String format = null;
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link DateTools#isValidDate(String, String)}.
		* The input date is empty and the format is empty.
		* The expected result is false.
		*/
		@Test
		void testIsValidDate_10() {
				String date = "";
				String format = "";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(date, format);
				assertEquals(expected, actual);
		}
}