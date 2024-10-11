// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateToolsTest {

	@Test
	void testIsValidDate() {
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
		assertTrue(DateTools.isValidDate("01/01/2000", "MM/dd/yyyy"));
	}
}