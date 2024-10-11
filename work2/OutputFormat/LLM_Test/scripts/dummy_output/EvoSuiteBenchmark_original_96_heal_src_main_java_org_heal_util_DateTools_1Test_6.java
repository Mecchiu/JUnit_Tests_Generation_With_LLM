// DateTools_1Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {
		
	@Test
	void testCases() {
		// test validations
		boolean valid = DateTools.isValidDate("January", "yyyy-MM-dd");
		assertTrue(valid);
		valid = DateTools.isValidDate( "2011-01-01", "%M");
		assertTrue(valid);
		valid = DateTools.isValidDate("2010-01-01", "%N");
		assertTrue(valid);
		valid = DateTools.isValidDate("2010-01-01", "%Y");
		assertFalse(valid);
		// test invalid cases
		assertFalse(DateTools.isValidDate("2013", "yyyy-MM-dd"));
		assertFalse(DateTools.isValidDate("1-1.0", "xxxx"));
		assertFalse(DateTools.isValidDate("1-2.0", "yyyy-MM-dd"));
		assertFalse(DateTools.isValidDate("2012-06-02", "yyyy-MM-dd"));
		assertFalse(DateTools.isValidDate("2011-02-31", "%Y"));
		assertFalse(DateTools.isValidDate("10.9.11", "%p"));
		assertFalse(DateTools.isValidDate("10.9.10", "%t"));
		assertFalse(DateTools.isValidDate("10.9.11 1234", "%m"));
		assertFalse(DateTools.isValidDate(null, "%D"));
		assertFalse(DateTools.isValidDate(null, "%Dd"));
		assertFalse(DateTools.isValidDate("", "%D"));
		assertFalse(DateTools.isValidDate("   ", "%"));
		assertFalse(DateTools.isValidDate("", "%"));
	}
}

/**
 * A test-case of {@link DateTools}.
 * It contains one unit test case for the {@link DateTools#format(Date, String)} method.
 */
final class DateTools1Test {

    @Test
    void testCases() {
        // test validations
        String expected = "Mon Jan 21 13:00:00 CET 2011";
        boolean valid = DateTools.isValidDate(expected, "%M");
        assertTrue(valid);
        valid = DateTools.isValidDate(expected, "%T");
        assertFalse(valid);
        valid = DateTools.isValidDate(expected, "%s");
        assertTrue(valid);
        valid = DateTools.isValidDate(expected, "%B");
        assertFalse(valid);
        valid = DateTools.isValidDate(expected, "%m");
        assertTrue(valid);
        valid = DateTools.isValidDate(expected, "%Y");
        assertTrue(valid);
        valid = DateTools.isValidDate(expected, "%N");
        assertTrue(valid);
        valid = DateTools.isValidDate(expected, "%y");
        assertFalse(valid);
        valid = DateTools.isValidDate(expected, "%M%");
        assertFalse(valid);
        valid = DateTools.isValidDate(expected, "%My");
        assertTrue(valid);
        valid = DateTools.isValidDate(expected, "%y-");
        assertFalse(valid);
        valid = DateTools.isValidDate(expected, "%y %m");
        assertFalse(valid);
        valid = DateTools.isValidDate(expected, "%Y");
        assertFalse(valid);
		valid = DateTools.isValidDate("2013-11-01", "%d %m");
        assertTrue(valid);
        valid = DateTools.isValidDate("1-1");
        assertTrue(valid);
        valid = DateTools.isValidDate("1-2");
        assertFalse(valid);
		valid = DateTools.isValidDate("1234");
		assertFalse(valid);
		valid = DateTools.isValidDate("10-9");
        assertTrue(valid);
        valid = DateTools.isValidDate("10-10");
        assertFalse(valid);
        valid = DateTools.isValidDate("10: 10: 10");
        assertFalse(valid);
        valid = DateTools.isValidDate("00: 00: 00: 00");
        assertTrue(valid);
        // test invalid cases
        String invalid = "%";
		assertFalse(DateTools.isValidDate(invalid, "%D"));
		try {
			valid = DateTools.isValidDate(invalid, "%Dd");
		} catch (ParseException e) {
			// do nothing
		}
		try {
			valid = DateTools.isValidDate(invalid, "%b");
		} catch (ParseException e) {
			// do nothing
		}
    }
}