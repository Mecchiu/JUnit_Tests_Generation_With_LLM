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
	void testFormatString_String() throws ParseException {
		assertEquals("01-01-2014", parse("01-01-2014").format());
		assertEquals("2013-01-01 00:00", parse("2013-01-01 00:00").format());
		assertEquals("2013  -01  07 10     2014   ", parse("2013  -01  10   -07 10  2014   ").format());
	}

	@Test
	void testFormatString_Date() throws ParseException {
		assertEquals("20141010", parse("20141010").format());
		assertEquals("20151011", parse("20151011").format());

		assertEquals("20141010 00:00", parse("20141010 00:00").format());
		assertEquals("20151011 12:00", parse("20151011 12:00").format());
		
		assertEquals("20141010", parse("01 Jan 2014 00:00:00").format());
		assertEquals("20151011", parse("01 Jan 2014 00:00:0").format());
		assertEquals("20141010", parse("01 Jan 2014 10:00:00").format());
	}
	
	@Test
	void testParse() throws ParseException {
		assertNotNull(DateTools.parse(null));
		assertNull(DateTools.parse(""));
		assertNull(DateTools.parse(" "));
		
		assertNotNull(DateTools.parse("01-01-2014", DEFAULT_DATE_FORMAT));
		assertNotNull(DateTools.parse("2013-01-01 00:00", DEFAULT_DATE_FORMAT));
		assertNotNull(DateTools.parse("2013-01-01 00:00 10:00", DEFAULT_DATE_FORMAT));
		assertNotNull(DateTools.parse("20151011 10:00", DEFAULT_DATE_FORMAT));
		//
		assertNotNull(DateTools.parse("01 Jan 2014 10:00", DEFAULT_DATE_FORMAT));
		assertNotNull(DateTools.parse("01 Jan 2014 0:00 10:00", DEFAULT_DATE_FORMAT));
		assertNotNull(DateTools.parse("01 Jan 2014 00:00 10:00", DEFAULT_DATE_FORMAT));
		assertNotNull(DateTools.parse("20151011 10:00 10:00", DEFAULT_DATE_FORMAT));
		assertNotNull(DateTools.parse("20141010 10 10:00", DEFAULT_DATE_FORMAT));
	}


	@Test
	void testIsValidDate_Date() throws ParseException {
		assertFalse(DateTools.isValidDate(null));
		assertFalse(DateTools.isValidDate(""));
		assertTrue(DateTools.isValidDate("01 Jan 2014 00:00:00"));
		assertTrue(DateTools.isValidDate("20151011"));
		assertFalse(DateTools.isValidDate("01 Jan 2014 10:00:00"));
		assertFalse(DateTools.isValidDate("20111010"));
		assertTrue(DateTools.isValidDate("20141010"));
		assertFalse(DateTools.isValidDate("2001-07-30"));
	}

	@Test
	void testCompare_String() throws ParseException {
		assertTrue(DateTools.compare(null, null) == 0);
		assertTrue(DateTools.compare("", "") == 0);
		assertTrue(DateTools.compare("01-01-2014", "01 Jan 2014 00:00:00") == 0);
		assertTrue(DateTools.compare("01-01-2014", "01 Jan 2014 00:00:0") == 0);
		assertTrue(DateTools.compare("20111010", "20111010"));
		assertTrue(DateTools.compare("01 Jan 2014 00:00:00", "01 Jan 2014 00:00:00") == 0);
		assertTrue(DateTools.compare("20111010", "01 Jan 2014 00:00:0"));
		assertTrue(DateTools.compare("01 Jan 2014 10:00:00", "01 Jan 2014 10:00:00"));
		assertTrue(DateTools.compare("01 Jan 2014 10:00:0", "01 Jan 2014 10:00:0"));
		assertTrue(DateTools.compare("20141010", "20141010"));
		assertTrue(DateTools.compare("01 Jan 2014 00:00:00", "01 Jan 2014 00:00:00"));
		assertTrue(DateTools.compare("20111010", "01 Jan 2014 00:00:0"));
		assertTrue(DateTools.compare("20141010", "01 Jan 2014 10:00:00"));
}
}