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
		
	private String YEAR_STRING = "yyyy";
	private SimpleDateFormat YEAR_FMT = new SimpleDateFormat("yyyy");
	private String MONTH_STRING = "MM";
	private  SimpleDateFormat monthFmt = new SimpleDateFormat("MM");
	private String HOUR_STRING = "HH";
	private   SimpleDateFormat hourFmt = new SimpleDateFormat("HH");
	
	/**
	 * Tests the given date with the formats specified in the {@link DateTools class}.
	*/
	@Test
	public void test_format() {
		Date testDate = parse("2006-03-01");
		String resultDateString = format(testDate);
		String expectedDateString = YEAR_FMT.format(testDate);
		assertEquals(expectedDateString, resultDateString);
		
		testDate = parse("20000-07-25");
		resultDateString = format(testDate);
		expectedDateString = MONTH_FMT.format(testDate);
		assertEquals(expectedDateString, resultDateString);
	}
		
	@Test
	public void test_isValidDate_string() {
		assertTrue(isValidDate("2005-03-31"));
		assertTrue(isValidDate("2005-03-31 "));
		assertTrue(isValidDate("2005-03-31T23:59:59.999"));
		assertTrue(isValidDate("2005-03-31T23:59:59.999000"));
		assertTrue(isValidDate("2005-03-31T59:59:59.999"));
		assertTrue(isValidDate("2005-03-31T60:59:59.999:59.999"));
	}
	@Test
	public void test_format_year() {
		parse("2004-05-05");
		Date date = parse("2003-07-15");
		assertEquals("2003-07-15", YEAR_FMT.format(date));
	}
	@Test
	public void test_format_month() {
		parse("2004-05-07");
		Date date = parse("2004-07-15");
		assertEquals("2004-07-15", monthFmt.format(date));
	}
	@Test
	public void test_format_hour() {
		parse("2002-05-05");
		Date date = parse("2002-05-15");
		assertEquals("2002-05-15", hourFmt.format(date));
		
	}
	
	@Test
	public void test_isValidDate_string_1() {
		parse("2005-03-31");
		parse("2006-03-31");
		parse("20000-07-25");
		parse("20000-07-25T23:59:59.999");
		parse("2005-03-31T23:59:59.999");
		parse("2005-03-31T59:59:59.999");
		parse("2005-03-31T60:59:59.999:59.999");
	}
	
	@Test(expected=ParseException.class)
	public void test_parse_illegal_format() throws ParseException {
		parse("123456-07-15");
	}
	/**
	 * Example of one day's date.
	 * @author m.heaton@epichub.com
	 */
	private class TestDate extends SimpleDateFormat implements Date {

		public TestDate(String pattern) {
			super(pattern);
		}

		public TestDate() {
			super("yyyy-MM-dd");
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException();
		}

		@Override
		public boolean equals(Object other) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int hashCode() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void setTime(Date newTime) {
			throw new UnsupportedOperationException();
		}

		@Override
		public String toString() {
			throw new UnsupportedOperationException();
		}

	}

	private Date parse(String dateString) {
		Date parsed = null;
		try {
			return SimpleDateFormat.getInstance(YEAR_STRING).parse(dateString);
		} catch (ParseException e) {
			parsed = new TestDate(YEAR_STRING);
		}
		return parsed;
	}

}