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
		
	private final DateTools dateTools = new DateTools();

	/**
	* Tests the parsing of a date string where a date string of
	* the {@link SimpleDateFormat simple date format} can be parsed as a
	* {@link Date} using the {@link #DEFAULT_DATE_FORMAT} default format.
	*/
	@Test
	void parseAsDateStrings_simpleDefault() {
		String dateString = "2020-04-01";
		Date date = dateTools.parse(dateString, DEFAULT_DATE_FORMAT);
		assertNotNull(dateString, date);
		assertEquals(date.getTime(), dateString);
		assertTrue(DateTools.isValidDayDate(dateString), dateString);
	}
	
	/**
	* Tests the parsing of a date string where a date string of
	* the {@link SimpleDateFormat simple date format} can be parsed
	* as a {@link Date} using the given format.
	*/
	@Test
	void parseAsDateStrings_format() {
		String dateString = "2020-04-01";
		Date date = dateTools.parse(dateString, format);
		assertNotNull(dateString, date);
		assertTrue(DateTools.isValidDayDate(dateString), dateString);
	}
	
	/**
	* Tests the parsing of a date string where a date string of
	* the {@link SimpleDateFormat simple date format} can be parsed
	* as a {@link Date} using the default {@link #DEFAULT_DATE_FORMAT} format.
	*/
	@Test
	void parseAsDateStrings_default() {
		String dateString = "2020-04-01";
		Date date = dateTools.parse(dateString, DEFAULT_DATE_FORMAT);
		assertNotNull(dateString, date);
		assertEquals(date.getTime(), dateString);
		assertTrue(DateTools.isValidDayDate(dateString), dateString);
	}
	
	/**
	* Tests if the given {@link Date} is parsed the format
	* specified using the {@link SimpleDateFormat} {@link SimpleDateFormat} constructor.
	*/
	@Test
	void parseAsDateStrings_format_parse() {
		String dateString = "2020-04-01";
		Date date = dateTools.parse(dateString, format);
		assertNotNull(dateString, date);
		assertTrue(DateTools.isValidDayDate(dateString), dateString);
	}

	/**
	* Tests if the default {@link SimpleDateFormat} {@link SimpleDateFormat}
	* constructor throws an exception due to no {@link SimpleDateFormat}
	* constructor parameter.
	*/
	@Test
	void parseAsDateStrings_badConstructor() {
		try {
			String dateString = "2020-2004";
			throw new RuntimeException("Expected exception due to no parameter!");
		} catch(Exception ignore) {
		}
	}
	
	/**
	* Tests if {@link SimpleDateFormat} {@link SimpleDateFormat} does
	* not throw an exception, when the specified
	* {@link Date#parse(String) specified} field is null.
	*/
	@Test
	void parseAsDateStrings_withSpecifiedDate() {
		Date date = null;
		try {
			stringToDate("2020-2004");
			fail(ParseException.class.getName() + " for invalid date");
		} catch (ParseException ignore) {
		}
	}
	
	/**
	* Tests if formatting as default String will cause exception
	* if the specified {@link Date#parse(String) specified} field
	* is null. However the formatting of the given Date does not
	* affect the formatting of the String result.
	*/
	@Test
	void parseAsDateStrings_withSpecifiedFormat() {
		String dateString = "2020-2004";
		try {
			makeDate("2014", dateString);
			fail(ParseException.class.getName() + " for invalid date");
		} catch (ParseException ignore) {
		}
	}
	
	/**
	* Tests if formatting as specified format will cause exception
	* if the specified {@link Date#parse(String) specified} field
	* is null. However formatting of the given Date does not affect
	* the formatting of the String result.
	*/
	@Test
	void parseAsDateStrings_withSpecifiedFormat() {
}
}