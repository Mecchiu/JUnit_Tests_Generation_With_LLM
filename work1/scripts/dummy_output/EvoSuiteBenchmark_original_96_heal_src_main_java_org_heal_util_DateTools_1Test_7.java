// DateTools_1Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {
		private DateTools_1 testObj = new DateTools_1();

		/**
		 * Tests a null string parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = IllegalArgumentException.class)
		public void test_NULL() throws ParseException {

			//Given
		    testObj.parse("");

		    //Then
		    fail();

		}

		/**
		 * Tests a valid string parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = IllegalArgumentException.class)
		public void test_STRING() throws ParseException {

			//Given
		    testObj.parse("abc123");

		    //Then
		    fail();

		}

		/**
		 * Tests a valid string parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = ParseException.class)
		public void test_STRING_BAD_LEN() throws ParseException {

			//Given
		    String dateString = "abc 123";
		    testObj.parse(dateString);

		    //Then
		    fail();

		}

		/**
		 * Tests a valid date format parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = ParseException.class)
		public void test_DATE_FORMAT() throws ParseException {

			//Given
		    testObj.parse(DEFAULT_DATE_FORMAT);

		    //Then
		    fail();

		}

		/**
		 * Tests a valid date format parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = ParseException.class)
		public void test_DATE_FORMAT_BAD_LEN() throws ParseException {

			//Given
		    String dateString = "1234567";
		    testObj.parse(dateString);

		    //Then
		    fail();

		}

		/**
		 * Tests a valid date format parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = ParseException.class)
		public void test_DATE_FORMAT_DATE_NOT_DEGREES_OCCURRED() throws ParseException {

			//Given
		    SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		    dateFormat.parse(DEFAULT_DATE_FORMAT);

		    //Then
		    fail();

		}

		/**
		 * Tests a valid date format parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = ParseException.class)
		public void test_DATE_FORMAT_INVALID_LEN() throws ParseException {

			//Given
		    String dateString = "2345678";
		    testObj.parse(dateString);

		    //Then
		    fail();

		}

		/**
		 * Tests a valid date format parameter.
		 * @throws ParseException If the string cannot be parsed using the given format.
		 */
		@Test(expected = ParseException.class)
		public void test_DATE_FORMAT_INVALID_OCCURRED() throws ParseException {

			//Given
	    	for (String dateString : POSSIBLE_DATE_FORMATS) {
				String dateFormat = dateString.replace("\"", "");
	            SimpleDateFormat dateFormatObj = new SimpleDateFormat(dateFormat);

	    	    
	            String dateStringInStr = testObj.parse(dateString);
	            boolean dateStringInDate = dateFormatObj.parse(dateStringInStr).getTime()==0;

	            //If
	            if (dateStringInDate) {
	            	System.out.printf("Succeeded: %s\n", dateFormatObj);
	            } else {
			        System.out.printf("Failed: %s\n", dateFormatObj.toString());

	            }

	        }

		    //Then
		    fail();

		}

}