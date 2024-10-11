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
		
  @Test
  void testIsValidDate() {
    assertTrue(DateTools.isValidDate("00/01/20 12:00"));
    assertFalse(DateTools.isValidDate("2000-01-01"));
  }
  
  @Test
  void testParseDateWithDefaultDateFormat() {
    String date = DateTools.format(null, DateTools.DEFAULT_DATE_FORMAT);
    Date date1 = null;
    assertNull(date);
    try {
      date1 = SimpleDateFormat.getDefault().parse(date);
    } catch (ParseException e) {
      fail("DateTools.format(null, ""); should not throw exception");
    }
  }
  
  @Test
  void testParseDateWithLongDateFormat() {
    String date = DateTools.format(null, DateTools.LONG_DATE_FORMAT);
    Date date1 = null;
    assertNull(date);
    try {
      date1 = new SimpleDateFormat(DateTools.LONG_DATE_FORMAT).parse(date);
    } catch (ParseException e) {
      fail("DateTools.format(null, ""); should not throw exception");
    }
  }
  
}