// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {
		
	@Test
	void constructor_shouldAcceptInputOnlyDateAsLong_nullFormat() {
		assertFalse(DateTools.parse("2010 12 12 12", null).isValid() );
	}
	
	@Test
	void constructor_shouldAcceptInputOnlyDateAsString_nullFormat() {
		assertFalse(DateTools.parse("2010 12 12 12", null).isValid() );
	}
	
	@Test
	void constructor_shouldAcceptInputAndMatchOutput_nullFormat() {
		assertTrue(DateTools.parse("2010 12 12 12", null).isValid() );
	}
	
	@SuppressWarnings("serial")
	@Test
	void constructor_shouldAcceptInputAndMatchOutput() {
		SimpleDateFormat longFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		assertFalse(DateTools.parse("2010 12 12 12 12:12:01", longFormatter).isValid() );
		assertFalse(DateTools.parse("2010 12 12 12 12:10", longFormatter).isValid() );
		assertTrue(DateTools.parse("2010 12 12 12 12:10:00", longFormatter).isValid() );
		new DateParser_4().parseDate(longFormatter);
	}
	
}

// DateParser_4Test.java
// class DateParser_4Test {
// 
// 	private DateParser_4 parser = new DateParser_4();
// 	
// 	@Test
// 	void parse_date_shouldAcceptOnlyLongOutput() throws ParseException {
// 		String dateString = "2010 12 12 12 12:12:01";
// 		String result = parser.parseDate(dateString);
// 		assertEquals(result.getClass(), Long.class);
// 		assertEquals(DateTools.format(result), dateString);
// 	}
// 
// }