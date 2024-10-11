// DateToolsTest.java
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
class DateToolsTest {

		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns true for a valid date.
		*/
		@Test
		void testIsValidDate_ValidDate() {
				assertTrue(DateTools.isValidDate("01/01/2000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for an invalid date.
		*/
		@Test
		void testIsValidDate_InvalidDate() {
				assertFalse(DateTools.isValidDate("01/01/20000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a null date.
		*/
		@Test
		void testIsValidDate_NullDate() {
				assertFalse(DateTools.isValidDate(null));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for an empty date.
		*/
		@Test
		void testIsValidDate_EmptyDate() {
				assertFalse(DateTools.isValidDate(""));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a date with invalid month.
		*/
		@Test
		void testIsValidDate_InvalidMonth() {
				assertFalse(DateTools.isValidDate("13/01/2000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a date with invalid day.
		*/
		@Test
		void testIsValidDate_InvalidDay() {
				assertFalse(DateTools.isValidDate("01/32/2000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a date with invalid year.
		*/
		@Test
		void testIsValidDate_InvalidYear() {
				assertFalse(DateTools.isValidDate("01/01/20000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a date with invalid month and day.
		*/
		@Test
		void testIsValidDate_InvalidMonthAndDay() {
				assertFalse(DateTools.isValidDate("13/32/2000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a date with invalid month and year.
		*/
		@Test
		void testIsValidDate_InvalidMonthAndYear() {
				assertFalse(DateTools.isValidDate("13/01/20000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a date with invalid day and year.
		*/
		@Test
		void testIsValidDate_InvalidDayAndYear() {
				assertFalse(DateTools.isValidDate("01/32/20000"));
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* This test case checks if the method returns false for a date with invalid month, day and year.
		*/
		@Test
		void testIsValidDate_InvalidMonthDayAndYear() {
				assertFalse(DateTools.isValidDate("13/32/20000"));
		}
}