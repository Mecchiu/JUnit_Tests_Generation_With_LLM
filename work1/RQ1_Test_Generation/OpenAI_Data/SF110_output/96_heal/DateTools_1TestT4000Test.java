// DateTools_1Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {

		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = null</li>
		* <li>format = "yyyy-MM-dd"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = null</li>
		* </ul>
		*/
		@Test
		void testCase1() {
				Date date = null;
				String format = "yyyy-MM-dd";
				String result = DateTools.format(date, format);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "yyyy-MM-dd"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "1970-01-01"</li>
		* </ul>
		*/
		@Test
		void testCase2() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd";
				String result = DateTools.format(date, format);
				assertEquals("1970-01-01", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "yyyy-MM-dd HH:mm:ss"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "1970-01-01 00:00:00"</li>
		* </ul>
		*/
		@Test
		void testCase3() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd HH:mm:ss";
				String result = DateTools.format(date, format);
				assertEquals("1970-01-01 00:00:00", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "MM/dd/yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "01/01/1970"</li>
		* </ul>
		*/
		@Test
		void testCase4() {
				Date date = new Date(0);
				String format = "MM/dd/yyyy";
				String result = DateTools.format(date, format);
				assertEquals("01/01/1970", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "MM-dd-yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "01-01-1970"</li>
		* </ul>
		*/
		@Test
		void testCase5() {
				Date date = new Date(0);
				String format = "MM-dd-yyyy";
				String result = DateTools.format(date, format);
				assertEquals("01-01-1970", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "1970"</li>
		* </ul>
		*/
		@Test
		void testCase6() {
				Date date = new Date(0);
				String format = "yyyy";
				String result = DateTools.format(date, format);
				assertEquals("1970", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "yyyy-MM-dd"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "1970-01-01"</li>
		* </ul>
		*/
		@Test
		void testCase7() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd";
				String result = DateTools.format(date, format);
				assertEquals("1970-01-01", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "yyyy-MM-dd HH:mm:ss"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "1970-01-01 00:00:00"</li>
		* </ul>
		*/
		@Test
		void testCase8() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd HH:mm:ss";
				String result = DateTools.format(date, format);
				assertEquals("1970-01-01 00:00:00", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "MM/dd/yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "01/01/1970"</li>
		* </ul>
		*/
		@Test
		void testCase9() {
				Date date = new Date(0);
				String format = "MM/dd/yyyy";
				String result = DateTools.format(date, format);
				assertEquals("01/01/1970", result);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date = new Date(0)</li>
		* <li>format = "MM-dd-yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = "01-01-1970"</li>
		* </ul>
		*/
		@Test
		void testCase10() {
				Date date = new Date(0);
				String format = "MM-dd-yyyy";
				String result = DateTools.format(date, format);
				assertEquals("01-01-1970", result);
		}
}

// DateTools_2Test.java
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
class DateTools_2Test {
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = null</li>
		* <li>format = "yyyy-MM-dd"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = null</li>
		* </ul>
		*/
		@Test
		void testCase1() {
				String dateString = null;
				String format = "yyyy-MM-dd";
				Date result = DateTools.parse(dateString, format);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = "1970-01-01"</li>
		* <li>format = "yyyy-MM-dd"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = new Date(0)</li>
		* </ul>
		*/
		@Test
		void testCase2() {
				String dateString = "1970-01-01";
				String format = "yyyy-MM-dd";
				Date result = DateTools.parse(dateString, format);
				assertEquals(new Date(0), result);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = "1970-01-01 00:00:00"</li>
		* <li>format = "yyyy-MM-dd HH:mm:ss"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = new Date(0)</li>
		* </ul>
		*/
		@Test
		void testCase3() {
				String dateString = "1970-01-01 00:00:00";
				String format = "yyyy-MM-dd HH:mm:ss";
				Date result = DateTools.parse(dateString, format);
				assertEquals(new Date(0), result);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = "01/01/1970"</li>
		* <li>format = "MM/dd/yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = new Date(0)</li>
		* </ul>
		*/
		@Test
		void testCase4() {
				String dateString = "01/01/1970";
				String format = "MM/dd/yyyy";
				Date result = DateTools.parse(dateString, format);
				assertEquals(new Date(0), result);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = "01-01-1970"</li>
		* <li>format = "MM-dd-yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = new Date(0)</li>
		* </ul>
		*/
		@Test
		void testCase5() {
				String dateString = "01-01-1970";
				String format = "MM-dd-yyyy";
				Date result = DateTools.parse(dateString, format);
				assertEquals(new Date(0), result);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = "1970"</li>
		* <li>format = "yyyy"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = new Date(0)</li>
		* </ul>
		*/
		@Test
		void testCase6() {
				String dateString = "1970";
				String format = "yyyy";
				Date result = DateTools.parse(dateString, format);
				assertEquals(new Date(0), result);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = "1970-01-01"</li>
		* <li>format = "yyyy-MM-dd"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = new Date(0)</li>
		* </ul>
		*/
		@Test
		void testCase7() {
				String dateString = "1970-01-01";
				String format = "yyyy-MM-dd";
				Date result = DateTools.parse(dateString, format);
				assertEquals(new Date(0), result);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>dateString = "1970-01-01 00:00:00"</li>
		* <li>format = "yyyy-MM-dd HH:mm:ss"</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>return value = new Date(0)</li>
		* </ul>
		*/
		@Test
		void testCase8() {
				String dateString = "1970-01-01 00:00