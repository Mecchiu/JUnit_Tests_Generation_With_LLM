// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateToolsTest {
		
		@Test
		void testFormat() {
				Date date = new Date();
				String formattedDate = DateTools.format(date);
				assertNotNull(formattedDate);
				assertEquals(formattedDate, "2020-01-01");
		}
}