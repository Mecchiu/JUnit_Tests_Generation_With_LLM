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
     * Tests for the {@link DateTools#parse(String)} method.
     *
	 * @throws ParseException Thrown when the {@link Date} cannot be parsed correctly.
	 * @throws IllegalStateException Thrown when the {@link Date} cannot be parsed due to an unsupported
	 * 		  character.
     */
    @Test
    void test(SimpleDateFormat format) throws ParseException {
	//System.out.println("Test of Parse");
	final String dateStr1 = "1801-05-08";
	final Date start = parse(format.parse(dateStr1));
	final Date d1 = new Date();
	final String d2 = format.format(d1);
        assertEquals("The date '" + d2 + "' cannot be parsed correctly "
		"due to an unsupported character", format.parse(dateStr1), start, null);
    }
}
// DateTools_2Test.java