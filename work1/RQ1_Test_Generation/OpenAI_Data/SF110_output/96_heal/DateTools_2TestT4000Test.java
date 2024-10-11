// DateTools_2Test.java
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
class DateTools_2Test {

		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_1() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_2() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_3() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("01/01/1970");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_4() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("01-01-1970");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_5() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_6() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_7() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_8() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_9() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_10() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
}

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
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_1() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01", "yyyy-MM-dd");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_2() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_3() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("01/01/1970", "MM/dd/yyyy");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_4() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("01-01-1970", "MM-dd-yyyy");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_5() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970", "yyyy");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_6() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_7() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_8() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_9() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#parse(String, String)} method.
		* The test case is successful if the method returns a {@link Date} object
		* that is equal to the expected {@link Date} object.
		*/
		@Test
		void testParse_10() {
				Date expected = new Date(0);
				Date actual = DateTools.parse("1970-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
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
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_1() {
				boolean expected = true;
				boolean actual = DateTools.isValidDate("1970-01-01");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_2() {
				boolean expected = true;
				boolean actual = DateTools.isValidDate("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_3() {
				boolean expected = true;
				boolean actual = DateTools.isValidDate("01/01/1970");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_4() {
				boolean expected = true;
				boolean actual = DateTools.isValidDate("01-01-1970");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_5() {
				boolean expected = true;
				boolean actual = DateTools.isValidDate("1970");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_6() {
				boolean expected = true;
				boolean actual = DateTools.isValidDate("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_7() {
				boolean expected = true;
				boolean actual = DateTools.isValidDate("1970-01-01 00:00:00");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link DateTools#isValidDate(String)} method.
		* The test case is successful if the method returns <code>true</code>.
		*/
		@Test
		void testIsValidDate_8() {
				boolean expected = true;
