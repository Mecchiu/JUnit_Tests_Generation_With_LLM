// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {

		/**
		* Test case 1 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_1() {
				String dateString = "2000-01-01";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_2() {
				String dateString = "2000-01-01 00:00:00";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_3() {
				String dateString = "2000-01-01 00:00:00.0";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_4() {
				String dateString = "2000-01-01 00:00:00.00";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_5() {
				String dateString = "2000-01-01 00:00:00.000";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_6() {
				String dateString = "2000-01-01 00:00:00.0000";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_7() {
				String dateString = "2000-01-01 00:00:00.00000";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_8() {
				String dateString = "2000-01-01 00:00:00.000000";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_9() {
				String dateString = "2000-01-01 00:00:00.0000000";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_10() {
				String dateString = "2000-01-01 00:00:00.00000000";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
}

// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {
		
		/**
		* Test case 1 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_1() {
				String dateString = "2000-01-01";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_2() {
				String dateString = "2000-01-01 00:00:00";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@Test
		void testIsValidDate_3() {
				String dateString = "2000-01-01 00:00:00.0";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link DateTools#isValidDate(String)}.
		* The input is a valid date string.
		* The expected result is true.
		*/
		@