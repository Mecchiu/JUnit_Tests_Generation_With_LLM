// Functions_2Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains one unit test case for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class Functions_2Test {
private final static String DATE_ONE_STRING = "'2000-03-25'";
		private final static String DATE_TEN_MINS1 = "2000-03-28 10:00";
		private final static String DATE_TEN_MINS2 = "2000-03-28 20:00";
		private final static String DATE_TEN_MINS3 = "2000-03-28 15:00";
		private final static Map<String, Map<String, String>> MESSAGE_MAP = new HashMap<>();
		{
				MESSAGE_MAP.put("DATE_ONE", "DATE_ONE_STRING");
				MESSAGE_MAP.put("DATE_TEN", "DATE_TEN_MINS1");
				MESSAGE_MAP.put("DATE_TEN_MINS2", "DATE_TEN_MINS2");
				MESSAGE_MAP.put("DATE_TEN_MINS3", "DATE_TEN_MINS3");
		}

		/**
		 * Test the dateToMilliseconds method.
		 */
		@Test
		void testDateToMilliseconds() {
				String tag = "DATE_TO_MILLISECONDS";
			SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy");
				assertEquals(0, Functions.dateToMilliseconds(null), 0.0);
				assertEquals(0, Functions.dateToMilliseconds(new Date()), 0.0);
				assertEquals(0, Functions.dateToMilliseconds(DATE_ONE_STRING), 0.0);
				assertEquals(0.0, Functions.dateToMilliseconds(DATE_TEN_MINS1), 0.0);
				assertEquals(0.0, Functions.dateToMilliseconds(DATE_TEN_MINS2), 0.0);
				assertEquals(0.0, Functions.dateToMilliseconds(DATE_TEN_MINS3), 0.0);

				Map<String, String> message = MESSAGE_MAP.get("DATE_ONE_STRING");
				assertEquals("", Functions.dateToMilliseconds(message == null? null : new Date()));
				message = MESSAGE_MAP.get("DATE_TEN_MINS1");
				assertEquals(0, Functions.dateToMilliseconds(message == null? null : new Date()), 0.0);
				message = MESSAGE_MAP.get("DATE_TEN_MINS2");
				assertEquals(0.0, Functions.dateToMilliseconds(message == null? null : new Date()), 0.0);
				message = MESSAGE_MAP.get("DATE_TEN_MINS3");
				assertEquals(0.0, Functions.dateToMilliseconds(message == null? null : new Date()), 0.0);
		}

		/**
		 * Generate an error message for test purposes.
		 */
		protected String generateMessage(int pErrorCode) {
			return "Illegal date value";
		}

}

// Functions.java
