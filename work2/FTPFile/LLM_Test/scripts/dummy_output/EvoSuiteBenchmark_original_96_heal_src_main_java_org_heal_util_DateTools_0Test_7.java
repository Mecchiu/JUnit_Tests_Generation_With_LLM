// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {
		
	final static Date FORMAT_DATE_1 = new SimpleDateFormat(DEFAULT_DATE_FORMAT).parse("2015-02-23");
	final static Date FORMAT_DATE_2 = new SimpleDateFormat(LONG_DATE_FORMAT).parse("2015-9-21");
	
	final static Date FORMAT_DATE_3 = new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-23");
	final static Date FORMAT_DATE_4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-02-23 16:30:12");
	
	/**
	 * @throws ParseException Test case.
	* It test if a given format can be parsed into a {@link Date} object,
	* correctly.
	*/
	@Test
	public void testParse() throws ParseException {
		assertNotNull("parsing failure.", DateTools.format(FORMAT_DATE_1));
		assertNotNull("wrong format", DateTools.format(FILE_NAME, FORMAT_DATE_2));
		assertNotNull("can parse date", DateTools.parse(FILE_NAME, FORMAT_DATE_2));
		assertEquals("can parse date", FORMAT_DATE_2, DateTools.parse(FILE_NAME, FORMAT_DATE_2));
		
	}
	
	
}