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
	 * @throws ParseException If the specified parameter can not be parsed
	 * 			to a {@link Date}.
	*/
	@Test
	void parse() {
		final String badDateString = "not a date";

		try {
			parse(badDateString);

			fail();
		} catch (ParseException ex) {
			assertNotNull(ex);
			assertEquals(ParseException.UNKNOWN_DATE_FORMAT.getCode(),ex.getErrorCode());
		}
	}

	/**
	* @throws ParseException If the specified parameter can not be parsed
	* 			to a {@link Date}.
	*/
	@Test
    public void parseLong() {
		final String badDateString = "not a long date";

		try {
			parseLong(badDateString);

			fail();
		} catch (ParseException ex) {
			assertNotNull(ex);
			assertEquals(ParseException.UNKNOWN_DATE_FORMAT.getCode(),ex.getErrorCode());
		}
	}

	/**
	 * @throws ParseException If the specified parameter can not be parsed
	 * 			to a {@link Date}.
	*/
	@Test
	void parseString() {
		final String badDateString = "not a long date";

		try {
			parse(badDateString);

			fail();
		} catch (ParseException ex) {
			assertNotNull(ex);
			assertEquals(ParseException.UNKNOWN_DATE_FORMAT.getCode(),ex.getErrorCode());
		}
	}

	/**
	 * @throws ParseException If the specified parameter can not be parsed
	 * 			to a {@link Date}.
	*/
	@Test
	void parse2() {
		final String badDateString = "not a long date";

		try {
			parse(badDateString, DEFAULT_DATE_FORMAT);

			fail();
		} catch (ParseException ex) {
			assertNotNull(ex);
			assertEquals(ParseException.UNKNOWN_DATE_FORMAT.getCode(),ex.getErrorCode());
		}
	}

	/**
	 * @throws ParseException If the specified parameter can not be parsed
	 * 			to a {@link Date}.
	*/
	@Test
	void parse2String() {
		final String badDateString = "not a long date";

		try {
			parse(badDateString, DEFAULT_DATE_FORMAT, "yyyy-MM-dd");

			fail();
		} catch (ParseException ex) {
			assertNotNull(ex);
			assertEquals(ParseException.UNKNOWN_DATE_FORMAT.getCode(),ex.getErrorCode());
		}
	}
}