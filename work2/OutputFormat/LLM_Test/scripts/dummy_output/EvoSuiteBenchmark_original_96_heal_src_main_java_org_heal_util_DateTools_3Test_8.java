// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {
		/**
		 * Test {@link DateTools#parse(String, String)}.
		 */
		@Test
		public void testParse() {
			
			assertIsValid(
					new SimpleDateFormat("yyyy-MM-dd").parse("2000-11-31"));
				
			assertIsValid(
					new SimpleDateFormat("yyyy-MM-dd").parse("2000-6-31"));
				
			try {
				SimpleDateFormat format = new SimpleDateFormat();
				format.format("2006");
				fail("Should throw IllegalArgumentException!");
			} catch (ParseException e) {
			}
			
			try {
				SimpleDateFormat format = new SimpleDateFormat();
				format.parse("2006");
				fail("Should throw ParseException!");
			} catch (java.text.ParseException e) {
			}
    	}
		
		private static boolean isValid(Date date) {
			return date!= null;
		}
		
		private static Date parse(String dateString, String format) {
			return new SimpleDateFormat(format).parse(dateString);
		}
		
		private static void assertIsValid(Date date) {
			assertNotNull(date);
			assertTrue(isValid(date));
        }
        
        /**
         * Test {@link DateTools#parse(String, String)} with various date representations.
         * The date is parsed as a <U>regular </</U> datetime using various date formats.
         * The resulting date is compared to an <U>expectant</U> date object.
         */
        @Test
        public void testParse_format(){
            int[] formats = new int[] { 2, 7, 1, 3 };
            for (int i = 0; i < formats.length; i++) {
                String format = formats[i];
                String dateString = String.format(DEFAULT_DATE_FORMAT, Long.valueOf(i));
                String date = parse(dateString, format);
                assertIsValid(parse(dateString, format));
                date = parse(dateString, format);
                assertIsValid(parse(dateString, format));
                date = parse(dateString, format*-1, format*'T'/*, format*'T'*/);
                assertIsValid(parse(dateString, format));
            }
        }
        
        @Test
        public void testGetFormat(){
            assertEquals(DEFAULT_DATE_FORMAT, DateTools.getFormat(DEFAULT_DATE_FORMAT));
                
        }
        
}