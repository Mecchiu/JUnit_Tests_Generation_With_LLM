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

    @Test
    public void testParse() throws ParseException {
        String dateString = "(1-11-2001)";
        boolean result = DateTools.isValidDate(dateString, (String)null).equals(true);
        assertEquals(result, true);
        assertEquals(("1-11-2001").equals(DateTools.parse(dateString, (String)null), result), result);
        
        dateString = "Mon 11 Feb 2003";
        result = DateTools.isValidDate(dateString, (String)null).equals(true);
        assertEquals(result, true);
        
        dateString = "Mon Jan 14 00:00:00";
        result = DateTools.isValidDate(dateString, (String)null).equals(true);
        assertEquals(result, true);
        
        dateString = "(2002-04-12)";
        result = DateTools.isValidDate(dateString, (String)null).equals(true);
        assertEquals(result, true);
        
        dateString = "Mon Jan  y  d      F    h:mm:ss";
        result = DateTools.isValidDate(dateString, (String)null).equals(true);
        assertEquals(result, true);
    }
	
	@Test
	public void testParseUTC() throws ParseException {
		String dateString = "Jan 11 2005 04:00:00 GMT";
		boolean result = DateTools.isValidDate(dateString, "GMT").equals(true);
		assertEquals(result, true);
		
		dateString = "Mon Nov 26 2005 04:00:00 GMT";
		result = DateTools.isValidDate(dateString, "GMT").equals(true);
		assertEquals(result, true);
	}

}
