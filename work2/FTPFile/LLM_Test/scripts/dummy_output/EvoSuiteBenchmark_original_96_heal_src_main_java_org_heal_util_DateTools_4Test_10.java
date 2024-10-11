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
	void test1() {
		if (isValidDate("")) {
			return;
		}
		// System.out.println("test1");
                Date now = new Date();
                String formatted = new SimpleDateFormat(DEFAULT_DATE_FORMAT).format(now);

                assertTrue(isValidDate(formatted));
                // System.out.println("formatted=" + formatted);
		}
}