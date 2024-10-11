// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {
		
    /**
     * Unit test of {@link DateTools#format(Date, String)}.
     */
    @Test
    public void format_formats_possible_Dates() {
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		String dateStr = sdf.format(new Date());
		assertNotNull("No format was set", DateTools.format(new Date(), "\t"));
		assertEquals("Formatted date should be the same as DateTools.DEFAULT_DATE_FORMAT", DEFAULT_DATE_FORMAT, dateStr);
    }
			
    /**
     * Unit test of {@link DateTools#parse(String, String)}.
     */
    @Test
    public void parse_parses_correctly() throws ParseException {
		Date date = DateTools.parse(":00:00", "yyyy-MM-dd HH:mm:ss");
		assertEquals("Date parsed correctly", new Date(0, 0, 0, 0, 0, 0), date);
		date = DateTools.parse(":00:00", "dd/MM/yyyy HH:mm:ss");
		assertEquals("Date parsed correctly", new Date(0, 0, 0, 0, 0, 0), date);
		date = DateTools.parse(":00:00", "dd-MMM-yyyy HH:mm:ss");
		assertEquals("Date parsed correctly", new Date(0, 0, 0, 0, 0, 0), date);

		try {
			DateTools.parse("");
			fail("null pointer type exception expected");
		} catch (ParseException e) {
    		// success
		}

		try {
			DateTools.parse("::00");
			fail("unsupported null time type exception expected");
		} catch (ParseException e) {
    		// success
		}

		try {
			DateTools.parse(":", "dd/MM/yyyy HH:mm:ss");
			fail("illegal format type exception expected");
		} catch (ParseException e) {
    		// success
		}

		try {
			DateTools.parse(":dd/MM/yyyy HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
			fail("non-compliant format type exception expected");
		} catch (ParseException e) {
    		// success
		}

		try {
			DateTools.parse(":yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
			fail("date type not supported according to format:"+sdf.toPattern().replaceAll("T", "?"));
		} catch (ParseException e) {
    		// success
		}
    }
}