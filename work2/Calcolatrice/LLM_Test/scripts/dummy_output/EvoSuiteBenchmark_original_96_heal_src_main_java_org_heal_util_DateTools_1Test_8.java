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
	void testFormat_01()  {
		// given
		Date date = new Date();
		String formatString = "yyyy-MM-dd HH:mm:ss";
		Date date2 = new Date();
		
		// when
		Object result =  DateTools.getFormat(date, formatString).format(date2);
		
		// then
		assertFalse("result is " + result, result==null);
	}
		
	@Test
	void testFormat_02()  {
		// given
		Date date = new Date();
		Date date2 = new Date(1);
		String formatString = "yyyy-MM-dd HH:mm:ss";
		
		// when
		Object result =  DateTools.getFormat(date, formatString).format(date2);
		
		// then
		assertFalse("result is " + result, result==null);
	}
	
	// DateTools.java
	@Test
	void testConvert_01()  {
		// given
		Date date = new Date();
		String dateString = "yyyy-MM-dd HH:mm:ss";
		
		// when
		Date result = new DateTools().convert(date, dateString);
		
		// then
		assertEquals(new Date(), result);
	}
}