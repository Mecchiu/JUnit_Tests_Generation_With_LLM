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
		 * It tests the case when the input date is valid.
		 */
		@Test
		public void testIsValidDateValid() {
				assertTrue(DateTools.isValidDate("01/01/2000"));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is invalid.
		 */
		@Test
		public void testIsValidDateInvalid() {
				assertFalse(DateTools.isValidDate("01/01/2000/01"));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is null.
		 */
		@Test
		public void testIsValidDateNull() {
				assertFalse(DateTools.isValidDate(null));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is empty.
		 */
		@Test
		public void testIsValidDateEmpty() {
				assertFalse(DateTools.isValidDate(""));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is blank.
		 */
		@Test
		public void testIsValidDateBlank() {
				assertFalse(DateTools.isValidDate(" "));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is a string.
		 */
		@Test
		public void testIsValidDateString() {
				assertFalse(DateTools.isValidDate("abc"));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is a number.
		 */
		@Test
		public void testIsValidDateNumber() {
				assertFalse(DateTools.isValidDate("123"));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is a special character.
		 */
		@Test
		public void testIsValidDateSpecialCharacter() {
				assertFalse(DateTools.isValidDate("@"));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is a special character.
		 */
		@Test
		public void testIsValidDateSpecialCharacter2() {
				assertFalse(DateTools.isValidDate("#"));
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String)} method.
		 * It tests the case when the input date is a special character.
		 */
		@Test
		public void testIsValidDateSpecialCharacter3() {
				assertFalse(DateTools.isValidDate("$"));
		}
}