// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_5Test {
/**
		 * Test the {@code isValidDate()} method.
		*/
		@Test
		public void testIsValidDate() {
			// Given
			String dateString = "10/03/2015";
			String format = "yyyy-MM-dd";
			
			// When
      assertTrue(DateTools.isValidDate(dateString, format));

			// Then
			assertFalse(DateTools.isValidDate(dateString, format));
			dateString = "10/03/2020";
			assertFalse(DateTools.isValidDate(dateString, format));
			dateString = "10/03/2015 00:00:00";
      assertTrue(DateTools.isValidDate(dateString, format));
	}
}
