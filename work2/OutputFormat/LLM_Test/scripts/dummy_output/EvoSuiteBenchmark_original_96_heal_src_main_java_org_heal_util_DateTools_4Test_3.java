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
		
	@Test
	public void testIsValidDateStringFormat() {
	    assertFalse(isValidDate("-1-20-20").equals(new Date()));
	    
	    assertTrue(isValidDate("2004-2-20").equals(new Date()));
	    assertFalse(isValidDate("2004-2-20-0").equals(new Date()));
	}

	@Test
	public void testIsValidDateFormat() {
		assertTrue(isValidDate(DEFAULT_DATE_FORMAT).equals(new Date()));
		SimpleDateFormat dateFormatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		assertFalse(isValidDate(
				DEFAULT_DATE_FORMAT).equals(new Date(dateFormatter.parse(DEFAULT_DATE_FORMAT).getTime())));
	}

	@Test
	public void testParse() {
	    assertNull(parse("", DEFAULT_DATE_FORMAT));
		assertNull(parse("", ""));
		assertNull(parse("", "a"));
		assertNull(parse("2004-1-1", DEFAULT_DATE_FORMAT));
		
		assertNotNull(parse("12:12:12", "yyyy-MM-dd HH:mm:ss Z"));
	}

	@Test
	void testParsingError() {
		assertNull(parse("2004-2-2", "YYYYMMD"));
	}
	
	@Test
	void testDefaultDateFormat() {
	    assertNotNull(parse(DEFAULT_DATE_FORMAT, DEFAULT_DATE_FORMAT));
	}
	
	@Test
	void testLongDateFormat() {
	    assertNull(parse("2002-01-01", "yyyy-MM-dd HH:mm:ss Z"));
	}
	
	@Test
	void convertToDate_isValidDate() {
		Date date = parse("-1-20-20", "-1-20-20");
		assertTrue(isValidDate(date).equals(date));
	}
	
	@Test
	@Deprecated
	void convertToDate_isValidDateFormat() {
		Date date = parse("2010-01-01", "yyyy-MM-dd HH:mm:ss Z");
		assertTrue(isValidDate(date).equals(date));
	}
	
	@Test
	@Deprecated
	void convertToDate_isValidDateFormatWithParsingError() {
		Date date = parse("2000-01-01", "yyyy-MM-dd HH:mm:ss Z");
		assertFalse(isValidDate(date).equals(date));
	}
}