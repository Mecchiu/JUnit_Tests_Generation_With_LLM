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
     * Test of isValidDate method, of class DateTools.
     * The test method is supposed to return {@link Boolean#TRUE}
     * if the given {@link Date} and the given {@link String}
     * are valid dates, else returns {@link Boolean#FALSE}
     * @throws ParseException
     */
    @Test
    public void isValidDate_1() throws ParseException {
        BOOLEAN = true;
        date("2002-11-29");
        boolean b = date("2002-11-29").isValid();
        assertTrue("isValidDate(\"2002-11-29\" " + datePattern("2002-11-29"), datePattern("2002-11-29"));
    }


    /**
     * Test of isValidDate method, of class DateTools.
     * The test method is supposed to return {@link Boolean#FALSE}
     * if the given {@link Date} and the given {@link String}
     * are not valid dates, else returns {@link Boolean#TRUE}
     * @throws ParseException
     */
    @Test
    public void isValidDate_2() throws ParseException {
        BOOLEAN = false;
        date("2002-11-29");
        boolean b = date("2002-11-29").isValid();
        assertTrue("isValidDate(\"2002-11-29\" " + datePattern("2002-11-29"), datePattern("2002-11-29"));
    }



    /**
	 * @param dateString The {@link Date}
	 * @param format The format string to use when parsing
     * 			the {@link Date}
	 * @return A {@link Date} or <code>null</code> if the {@link Date} cannot
     * 			be parsed into the format given
	 */
	public static Date date(String dateString, String format) {
		String s = dateString;
        if (format == null){
        	s = SimpleDateFormat.getDateInstance(SimpleDateFormat.DEFAULT).format(date(true, s));
        } else {
        	s = SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG).format(date(true, s));
        }

        assertNotNull(s);
		return s;
    }

	private static String datePattern(String str) {
		return "\\" + datePattern(str, null);
	}

	private static String datePattern(String str, String pat) {
		if (pat == null){
			return str;
		}
		if (str.toLowerCase().startsWith(pat.toLowerCase() + " ")){
			return str.substring(pat.length() + 1);
		}

		return "";
	}

	private static boolean bool(String s) {
		return!!(s.length() >= 1 && '1' <= s.charAt(0)) &&
			s.length() <= 1 && s.charAt(s.length() - 1) == 'y';
	}
}
