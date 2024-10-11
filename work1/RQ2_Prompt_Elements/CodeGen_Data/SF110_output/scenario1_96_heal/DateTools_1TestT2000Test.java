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
private Date Tools;

		public DateTools_1Test() {
			Tools = new Date();
		}

		public void dateAndFormat() {
			Date newDate = new Date();
			DateTools.format(newDate, new SimpleDateFormat("yyyy-MM-dd"));
			assertEquals("2002-11-07", Tools.toString());
		}

		@Test
		void dateFormat() {
			String dateString = "2002-10-11";
			DateTools.format(Tools.getTime(), dateString);
			//if (false) {
				//assertEquals(dateString, Tools.toString());
			//}
		}

		public void DateTools_2Test() {
			System.out.println("dateTools_2Test");
			DateTools.dateAndFormat();
			Date tmp = null;
			DateTools.dateAndFormat();
			assertEquals(Tools.getTime(), tmp.getTime());
		}
}
//DateTools_1Test.java