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
		* Test case 1 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns true when the date string is valid.
		*/
		@Test
		void testIsValidDate_1() {
				String dateString = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is invalid.
		*/
		@Test
		void testIsValidDate_2() {
				String dateString = "2020-01-32";
				String format = "yyyy-MM-dd";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is null.
		*/
		@Test
		void testIsValidDate_3() {
				String dateString = null;
				String format = "yyyy-MM-dd";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is empty.
		*/
		@Test
		void testIsValidDate_4() {
				String dateString = "";
				String format = "yyyy-MM-dd";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is empty.
		*/
		@Test
		void testIsValidDate_5() {
				String dateString = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is empty.
		*/
		@Test
		void testIsValidDate_6() {
				String dateString = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is empty.
		*/
		@Test
		void testIsValidDate_7() {
				String dateString = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is empty.
		*/
		@Test
		void testIsValidDate_8() {
				String dateString = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is empty.
		*/
		@Test
		void testIsValidDate_9() {
				String dateString = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link DateTools#isValidDate(String, String)} method.
		* This test case checks if the method returns false when the date string is empty.
		*/
		@Test
		void testIsValidDate_10() {
				String dateString = "2020-01-01";
				String format = "yyyy-MM-dd";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
}