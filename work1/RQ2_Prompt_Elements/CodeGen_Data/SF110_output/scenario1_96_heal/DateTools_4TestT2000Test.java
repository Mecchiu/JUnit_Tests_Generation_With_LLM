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
// DateTools.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A general utility class for dealing with dates.
 */
public class DateTools {

    public static boolean isValidDate(String dateString) {
        boolean match = false;
        if (null!= dateString) {
            SimpleDateFormat formatter = new SimpleDateFormat();
            formatter.setLenient(false);
            for (int i = 0; i < POSSIBLE_DATE_FORMATS.length &&!match; ++i) {
                formatter.applyPattern(POSSIBLE_DATE_FORMATS[i]);
                try {
                    formatter.parse(dateString);
                    match = true;
                } catch (ParseException e) {
                    // do nothing
                }
            }
        }
        return match;
    }
}

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
		
	public static final String DATE_PATTERN          = "dd/MM/yyyy";
    public static final String DATE_FORMAT           = "dd/MM/yyyy,M.d.,yyyy";
    private static final SimpleDateFormat SIMPLE_DATE = new SimpleDateFormat(DATE_PATTERN);
	private static final String DATE_PARSE_EXCEPTION   = "The date cannot be parsed";

    @Test
    public void testIsValidDate() {
        assertTrue(DateTools.isValidDate("04/04/2009"));
        try {
            // date parse should always take the year before the day, i.e., 0
            SIMPLE_DATE.parse("19901");
            fail("Should not accept the year before the day");

        } catch (ParseException e) {
            assertTrue(e.getMessage().contains(DATE_PARSE_EXCEPTION));
        }
        
        // make sure the year is set in case the DateFormat in the 
        // exception message doesn't match the Date formatting pattern
        SIMPLE_DATE.setLenient(false);
        assertTrue(DateTools.isValidDate("4/04/2009"));
        assertFalse(DateTools.isValidDate("4/04/2009,13/1/2009"));
    }
	
	@Test
	public void testIsValidDateWithDayString() {
		String dateString = SIMPLE_DATE.format(new Date());

		// create valid date, i.e., 01/04/2009 with days in the pattern
		boolean isValidDate = DateTools.isValidDate(dateString)
				&& dateString.length() == SIMPLE_DATE.format(new Date(dateString.length())).length()
				&& dateString.charAt(SIMPLE_DATE.format(new Date(dateString.length())) + 1) == '.';

		assertTrue(isValidDate);
	}

	@Test
	public void testGetCorrectDateForPattern() throws ParseException {
		assertThrows(NullPointerException.class, () ->
			DateTools.getCorrectDateForPattern(null, DATE_PATTERN));

        SIMPLE_DATE.setLenient(false);
		String dateString = DATE_PATTERN + "d";
		assertThrows(IllegalArgumentException.class, () ->
				DateTools.getCorrectDateForPattern(dateString, DATE_FORMAT));

        SIMPLE_DATE.setLenient(true);
		String dateString2 = DATE_FORMAT + "d";
		isValidDate = DateTools.isValidDate(DateTools_4Test.DATE_PARSE_EXCEPTION);
		assertThrows(ParseException.class, () ->
				DateTools.getCorrectDateFromString(dateString2, DATE_FORMAT));
		SIMPLE_DATE.setLenient(true);
		dateString = DATE_FORMAT + "d";
		isValidDate = DateTools.isValidDate(DateTools_4Test.DATE_PARSE_EXCEPTION);
		assertThrows(ParseException.class, () ->
				DateTools.getCorrectDateFromString(dateString, DATE_PATTERN));
	}

	private static boolean isValidDate(String dateString) {
		try {
			DateTools.SIMPLE_DATE.parse(dateString);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
}
/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
