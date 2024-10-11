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
		* <li>date: null</li>
		* <li>format: "yyyy-MM-dd"</li>
		* </ul>
		* Expected result: null
		*/
		@Test
		public void testCase1() {
				Date date = null;
				String format = "yyyy-MM-dd";
				String expected = null;
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "yyyy-MM-dd"</li>
		* </ul>
		* Expected result: "1970-01-01"
		*/
		@Test
		public void testCase2() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd";
				String expected = "1970-01-01";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "yyyy-MM-dd HH:mm:ss"</li>
		* </ul>
		* Expected result: "1970-01-01 00:00:00"
		*/
		@Test
		public void testCase3() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd HH:mm:ss";
				String expected = "1970-01-01 00:00:00";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "MM/dd/yyyy"</li>
		* </ul>
		* Expected result: "01/01/1970"
		*/
		@Test
		public void testCase4() {
				Date date = new Date(0);
				String format = "MM/dd/yyyy";
				String expected = "01/01/1970";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "MM-dd-yyyy"</li>
		* </ul>
		* Expected result: "01-01-1970"
		*/
		@Test
		public void testCase5() {
				Date date = new Date(0);
				String format = "MM-dd-yyyy";
				String expected = "01-01-1970";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "yyyy"</li>
		* </ul>
		* Expected result: "1970"
		*/
		@Test
		public void testCase6() {
				Date date = new Date(0);
				String format = "yyyy";
				String expected = "1970";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "yyyy-MM-dd"</li>
		* </ul>
		* Expected result: "1970-01-01"
		*/
		@Test
		public void testCase7() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd";
				String expected = "1970-01-01";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "yyyy-MM-dd HH:mm:ss"</li>
		* </ul>
		* Expected result: "1970-01-01 00:00:00"
		*/
		@Test
		public void testCase8() {
				Date date = new Date(0);
				String format = "yyyy-MM-dd HH:mm:ss";
				String expected = "1970-01-01 00:00:00";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "MM/dd/yyyy"</li>
		* </ul>
		* Expected result: "01/01/1970"
		*/
		@Test
		public void testCase9() {
				Date date = new Date(0);
				String format = "MM/dd/yyyy";
				String expected = "01/01/1970";
				String actual = DateTools.format(date, format);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#format(Date, String)} method.
		* Test case for the following input:
		* <ul>
		* <li>date: "Thu Jan 01 00:00:00 CST 1970"</li>
		* <li>format: "MM-dd-yyyy"</li>
		* </ul>
		* Expected result: "01-01-1970"
		*/
		@Test
	