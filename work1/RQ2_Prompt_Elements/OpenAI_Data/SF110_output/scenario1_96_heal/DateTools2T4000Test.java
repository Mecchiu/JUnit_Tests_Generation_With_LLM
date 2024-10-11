// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String)} method.
*/
class DateToolsTest {

		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is null.
		*/
		@Test
		void testParse_null() {
				Date date = DateTools.parse(null);
				assertNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is empty.
		*/
		@Test
		void testParse_empty() {
				Date date = DateTools.parse("");
				assertNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is not a valid date.
		*/
		@Test
		void testParse_invalid() {
				Date date = DateTools.parse("abc");
				assertNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid() {
				Date date = DateTools.parse("2019-01-01");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid2() {
				Date date = DateTools.parse("2019-01-01 00:00:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid3() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid4() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid5() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid6() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid7() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid8() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid9() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid10() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid11() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid12() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid13() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid14() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid15() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid16() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid17() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid18() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid19() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid20() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid21() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid22() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid23() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid24() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid25() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid26() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid27() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid28() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid29() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid30() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid31() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid32() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid33() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+08:00");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* It tests the case when the input date string is a valid date.
		*/
		@Test
		void testParse_valid34() {
				Date date = DateTools.parse("2019-01-01 00:00:00.000+0800");
				assertNotNull(date);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method