// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {
		
	/**
	* The constructor for the class.
	*/
	public DateTools_4Test() {
	}
	
	/**
	* Verifies the behaviour of @see isValidDate(String, String).
	* @throws ParseException On parsing failures.
	*/
	@Test
	public void unitTest() throws ParseException {
		
		String dateString = "2012-12-09";
		String format = "yyyy-MM-dd";
		
		Date date = parse(dateString);
		assertNotNull("date could not be null", date);
		
		boolean valid = DateTools.isValidDate(dateString, format);
		assertTrue("'date String' does not represent a valid date.", valid);
	}
}