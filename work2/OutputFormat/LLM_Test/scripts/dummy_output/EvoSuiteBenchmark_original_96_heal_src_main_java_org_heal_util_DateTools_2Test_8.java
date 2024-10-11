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
		 * @throws ParseException
		 */
		@Test
		void Test_format() throws ParseException {
			DateTools.format("2011-01-01", "dd/mm/yyyy");
			DateTools.format("2011-01-01T0:1:2", "dd-mm-yyyyT00:00:01");
		}
}