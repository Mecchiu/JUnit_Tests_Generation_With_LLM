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
		
	@Test
    public void testValidDate() {
		DateTools_3Test.assertValidDate(true, "dd/MM/yyyy HH:mm:ss", new String[] {DEFAULT_DATE_FORMAT}, longDateParsing, longDateParsing, longDateParsing, parseDateString, parseDateString, parseDateString);
	}

	@Test
    public void testValidDateLongFormat() {
		//String dateString = "dd/MM/yyyy HH:mm:ss";
		String dateString = "dd/MM/yyy yyyy HH:mm:ss";
        DateTools_3Test.assertValidDate(true, dateString, new String[] {DEFAULT_DATE_FORMAT}, longDateParsing, longDateParsing, longDateParsing, parseDateString, parseDateString, parseDateString);
	}

	@Test
    public void testValidDateLlongFormat() {
        //String dateString = "DD/MM/yyy yyyy L";
		String dateString = "dd/MM/yyy";
        DateTools_3Test.assertValidDate(false, dateString, new String[] {DEFAULT_DATE_FORMAT}, longDateParsing, longDateParsing, longDateParsing, parseDateString, parseDateString, parseDateString);
	}

	@Test
    public void testInvalidDate() {
		//String dateString = "dd/MM/yyy hH:mm:ss";
		String dateString = "yyyyy";
		DateTools_3Test.assertInvalidDate(true, dateString, new String[] {DEFAULT_DATE_FORMAT}, longDateParsing, longDateParsing, longDateParsing, parseDateString, parseDateString, parseDateString);
	}

	@Test
    public void testInvalidDateWithFormat() {
		//String dateString = "dd/MM/yyyy HH:mm:ss Z";
		String dateString = "yyyy";
		DateTools_3Test.assertInvalidDate(true, dateString, new String[] {DEFAULT_DATE_FORMAT}, longDateParsing, longDateParsing, longDateParsing, parseDateString, parseDateString, parseDateString);
	}

	@Test
    public void testInvalidDateFormat() {
		//String dateString = "yyyyDD/MM/yyy";
		String dateString = "yyyy/MM/dd";
		DateTools_3Test.assertInvalidDate(true, dateString, new String[] {DEFAULT_DATE_FORMAT}, longDateParsing,
				longDateParsing, maxDateLength, parseDateString, parseDateString, parseDateString);
	}
}/* -- end class -- */