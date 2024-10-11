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
		
    /**
     * Test method of {@link DateTools#format(Date, String)}.
    * It should invoke the {@link SimpleDateFormat#format(Date) SimpleDateFormat}
    * method to get a representation of the date parameter.
    * @throws ParseException if the given String cannot be parsed
    */
    @Test
    public void test_formats() throws ParseException  {
        String dateString = "2014-07-11";
        assertDate(
                    dateString,
		new String[] { DateTools.DEFAULT_DATE_FORMAT },
                    "2010-07-11");
        assertDate(
                    dateString,
		new String[] { DateTools.LONG_DATE_FORMAT },
		"2013-11-21");
	
	assertDate(
		new String[] { DEFAULT_DATE_FORMAT, "yyyy-MM-dd" },
		new String[] { "2012-07-11" });
    }

	private void assertDate(String dateString, String[] formats, String pattern) throws ParseException {
        String result = DateTools.format(parse(dateString), formats[0]);
		Date[] converted = DateTools.isValidDate(result, formats[0]);
		assertEquals(format(dateString, formats[1]), converted!= null? result : null);
	}

	private Date date(String string, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = formatter.parse(string);
		}
		catch (ParseException e) {}
		return date;
	}
	
	private boolean isValidDate(String string, String format) {
		String result = DateTools.format(null, format);
		Date date = date(string, format);
		return date!= null && result.equals(format(date, format));
	}

	/**
	 * Test method of {@link DateTools#parse(String, String)}.
	 * 
	 * @throws ParseException if the given String cannot be parsed
	 */
	@Test
	public void test_parse() throws ParseException {
        assertDate("2004-01-29T12:00:00Z", new String[] { "04-01-29T12:00:00" });
        assertDate("2016-12-10", new String[] { "2016-12-10" });
        assertDate("2016-12-10T14:00:23", new String[] { "2016-12-10T14:00:23" });
        assertDate("2016-12-10T14:00:23.", new String[] { "2016-12-10T14:00:23" });
	}
}