// DateToolsTest.java
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
class DateToolsTest {

		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void testIsValidDateValid() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with an invalid date.
		 */
		@Test
		public void testIsValidDateInvalid() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yy";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void testIsValidDateValid2() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with an invalid date.
		 */
		@Test
		public void testIsValidDateInvalid2() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yy";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void testIsValidDateValid3() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with an invalid date.
		 */
		@Test
		public void testIsValidDateInvalid3() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yy";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void testIsValidDateValid4() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with an invalid date.
		 */
		@Test
		public void testIsValidDateInvalid4() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yy";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void testIsValidDateValid5() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with an invalid date.
		 */
		@Test
		public void testIsValidDateInvalid5() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yy";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void testIsValidDateValid6() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with an invalid date.
		 */
		@Test
		public void testIsValidDateInvalid6() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yy";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void testIsValidDateValid7() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yyyy";
				boolean expected = true;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with an invalid date.
		 */
		@Test
		public void testIsValidDateInvalid7() {
				String dateString = "01/01/2000";
				String format = "MM/dd/yy";
				boolean expected = false;
				boolean actual = DateTools.isValidDate(dateString, format);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link DateTools#isValidDate(String, String)}
		 * with a valid date.
		 */
		@Test
		public void test