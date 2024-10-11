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
		/**
		 * Test the {@link DateTools#parse(String)}.
		 */
	@Test
	void testParse_validString() {
		String dateString = "2014-08-08 Tue 9:04,345";

		try {
			Date date = parse("" + dateString);

			assertEquals(dateString, date.toString());
		} catch (ParseException e) {
			fail("There was an unexpected exception parsing the String!");
		}
	}

		/**
		 * Test the {@link DateTools#parse(String)}.
		 */
	@Test
    void testParse_invalidFormat() throws ParseException {
    	try {
			parse(null, "");
			fail("Unable to parse null as a date.");
		} catch (ParseException e) {
			// success
		}
    }

		/**
		 * Test some basic tests of the {@link DateTools#format(java.util.Date)}.
		 ******* NOTE: this method will be eventually called by every unit test
		 * that uses the same Date parameter during its tests, so this may lead to
		 * failure!!!
		 */
    @Test
    void testFormat_valid() {
    	String date = "2014-08-09 07:34";
    	
    	// check the null value
    	if (date == null) {
    		System.out.println("[DateTools_2Test.testFormat_valid] null value is passed to parse(String dateString) is not a valid Date!");
    		return;
    	}
    	// check if dateString doesn't contain '-'
    	if (!isValidDate(date + "-")) {
    		System.out.println("[DateTools_2Test.testFormat_valid] invalid dateString has no '-'!");
    		return;
    	}
    	
    	// check for a valid string
    	SimpleDateFormat sdf = new SimpleDateFormat(LONG_DATE_FORMAT);
    	Date f = parse(date);
    	
    	// check the format
    	assertEquals("format was determined to be the same, but the last format position does not match the specified one", LONG_DATE_FORMAT, sdf.format(f));
    }

	@Test
    void testFormat_invalid() {
	    String date = "2014-08-09 07:34";
	    
	    // check the null value
	    if (date == null) {
	    	System.out.println("[DateTools_2Test.testFormat_invalid] null value passed to parse(String dateString) is not a valid Date!");
	    	return;
	    }
	    
	    // check if dateString doesn't contain '-'
	    if (isValidDate(date + "-")) {
	    	System.out.println("[DateTools_2Test.testFormat_invalid] invalid dateString has no '-'!");
	    	return;
	    }
	    
	    // check a valid string
	    try {
	    	parse(date);
	    	fail("No exception thrown as dateString is valid, but a dateString containing '-'!");
	    } catch (ParseException e) {
	    	// success
	    }
	}
	
	/**
	 * Test some basic tests of the {@link DateTools#toString(Date)} and
	 * {@link DateTools#fromString(java.lang.String)}.
	 ******* NOTE: this method will be eventually called by every unit test
	 * that uses the same Date parameter during its tests, so this may lead to
	 * failure!!!
	 */
	@Test
    void testToString_valid() {
	    String date = "2014-08-09 09:34";
	    
	    // check the null value
	    if (date == null) {
	    	System.out.println("[DateTools_2Test.testToString_valid] null value is passed to parse(String dateString) is not a valid Date!");
	    	return;
	    }
	    
	    // check if dateString doesn't contain '-'
	    if (isValidDate(date + "-")) {
	    	System.out.println("[DateTools_2Test.testToString_valid] invalid dateString has no '-'!");
	    	return;
	    }
	    System.out.println(toString(parse("" + date)));
    }

	@Test
    void testToString_invalid() {
	    String date = "2014-08-09 09:34";
	    
	    // check the null value
}
}