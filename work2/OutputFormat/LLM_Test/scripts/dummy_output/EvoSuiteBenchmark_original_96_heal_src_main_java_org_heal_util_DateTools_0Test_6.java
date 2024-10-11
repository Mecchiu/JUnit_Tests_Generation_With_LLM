// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {
		@Test (expected = ParseException.class)
		public void testFormat_S() throws ParseException {
			DateTools.format(new DateUtils().parse("12-12-2000", "d.m.Y"));
		}

		@Test
		public void testIsValidDate_S() throws ParseException {
			assertTrue(DateTools.isValidDate("12.12.2000", "d.m.Y"));
		}

		@Test
		public void testIsValidDate_E() throws ParseException
		{
			assertFalse(DateTools.isValidDate(null, "d.m.Y"));
		}

		@Test (expected = ParseException.class)
		public void testParse_D() throws ParseException
		{
			DateUtils.parse("12.12.2000", "d.m.Y");
		}

		@Test (expected = ParseException.class)
		public void testParse_E() throws ParseException
		{
			DateUtils.parse("12.10.2000", "d.m.Y");
		}

		@Test (expected = ParseException.class)
		public void testParse_F() throws ParseException
		{
			DateUtils.parse("12.18.2000", "d.m.Y");
		}
}