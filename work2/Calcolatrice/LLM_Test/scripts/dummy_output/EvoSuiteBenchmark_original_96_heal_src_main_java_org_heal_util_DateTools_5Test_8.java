// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_5Test {
		/**
		 * Test cases which should pass, but no result.
		 * The test cases contain String, ParseException and a String
		 * representation of Date.
		 */
	@Test
		public void testsForValidDate() {
		assertTrue(DateTools_5Test.isValidDate(null, null));
		assertTrue(DateTools_5Test.isValidDate(null, "yyyy-MM-dd"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), null));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yyyy-MM-dd"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yyyy-MM"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yyMM"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yy-MM"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yyyy"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "MM"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yyMM"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yyyy-MM-dd"));
		assertTrue(DateTools_5Test.isValidDate(new Date("2013-10-20"), "yyMM-dd-yyyy"));
		assertTrue(DateTools_5Test.isValidDate("123-9-4", "mm-dd"));
	}

	/**
	 * Test cases which test the different ways that one can
	 * parse a date argument.
	 * The test cases contain String argument, a date format in
	 * the first argument and a string to be parsed in the second
	 * argument.
	 */
    @Test
		public void test_Parsing_Same_Parse_Date() throws ParseException {
            // test that parsing a date argument of the same format
            assertNotNull(DateTools_5Test.parse(null, "mm/dd/yyyy"));

            // test that parsing a date of same format but a different date argument
            assertNotNull(DateTools_5Test.parse(null, "mm/dd/yyyy-yyyy"));

            // test that parsing a date argument of an invalid format
            assertNull(DateTools_5Test.parse(null, "mm/dd/yyyy"+"+yyyyYY"));
        }

        
    @Test
        public void test_Parsing_DatesWithDifferentFormat_Different_Date() throws ParseException {
            String inputDate = "2017-2-12 12:08:08";
            Date parsedDate = DateTools.parse(inputDate, "yyyy-MM-dd HH:mm:ss");
            assertNotNull(parsedDate);
            assertNull(DateTools_5Test.parse(inputDate, "yyyy-MM-dd HH:mm:ss"));
            parsedDate = DateTools_5Test.parse(inputDate, "yyyy-MM-dd");
            assertNull(DateTools_5Test.parse(inputDate, "yyyy-MM-dd"));
        }

        /**
		 * Test cases which test if the given date can be parsed to
		 * different formats. A null value is valid.
		 * The test cases contain String, Date, and ParseException.
		 */
    @Test
		public void test_Parsing_Different_Invalid_Date() throws ParseException {
	        // The test cases contain three of the valid date parameters
	        // in every case:
            //   null + null == null
            //   null + dateFormat + null == null
	        // The following two results different date representations
	        // in their same cases.
            // Both should return the same value.
            // There are three different date formats here because they
            // both have different patterns for parsing. Only the first
            // of them has the same pattern and its second has the
            // longer pattern.
            // We must not use "yyyy" in both the date formats of the cases because
            // it may not work correctly when comparing a date with another given date.
            // The second date will be parsed with the dateFormat.
            // The first date will be parsed with the Long Date Format.
            assertNotNull(DateTools_5Test.parse(null, "yyyy-MM-dd"));
            // Should still work when we use only the Long Date Format (e.g., yyyy-MM-dd
}
}