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

    /**
     * @param dateString A String that may or may not represent a
     * 		{@link Date} that can be parsed.
     * @return <code>true</code> if a {@link Date} can be parsed from
     * 		the String, or <code>false</code> otherwise.
     * @see #parse(String dateString)
     */
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
		boolean isValidDate(String dateString, String errorMessage) {
			ParseException e = null;

			try {
				ParseUtil.parse(dateString, "yyyy-MM-dd HH:mm:ss Z");
			} catch (ParseException e2) {
				e = e2;
			}
			if (e!= null) {
				throw new IllegalArgumentException(
                               "Date error: (" + dateString + ", [" + errorMessage + "])");
			}
			return true;
		}
}

// DateTools_4_Test.java
