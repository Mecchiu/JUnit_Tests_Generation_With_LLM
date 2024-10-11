// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {
public static final String DEFAULT_DATE_FORMAT = new String("yyyy-MM-dd");
		public static final String LONG_DATE_FORMAT = new String("yyyy-MM-dd HH:mm:ss");
	    			public static final String TEST_DATE = "1998-10-10 00:00:00";

	    public static final String TEST_DATE_FORMAT1 = new String("yyyy-MM-dd HH:mm:ss");
	    public static final String TEST_DATE_FORMAT2 = new String("yyyy-MM-dd HH:mm:ss");
	    public static final String TEST_DATE_FORMAT3 = new String("yyyy-MM-dd HH:mm:ss.SSS");
	    public static final String TEST_DATE_FORMAT4 = new String("EEEE, MMMM dd yyyy HH:mm:ss");
	    public static final String[] POSSIBLE_DATE_FORMATS = new String[] { DEFAULT_DATE_FORMAT, LONG_DATE_FORMAT, "MM/dd/yyyy",
			"MM-dd-yyyy", "yyyy"
	    };

	@Test
	public void test() throws ParseException {

		assertEquals(DEFAULT_DATE_FORMAT, DateTools.DEFAULT_DATE_FORMAT);
		assertEquals(Long.valueOf((long)DEFAULT_DATE_FORMAT.length()), DateTools.DEFAULT_LONG_DATE_FORMAT.length());

		assertEquals(TEST_DATE_FORMAT1, DateTools.parse(TEST_DATE, DEFAULT_DATE_FORMAT));
		assertEquals(TEST_DATE_FORMAT2, DateTools.parse(TEST_DATE, DEFAULT_DATE_FORMAT));
		assertEquals(TEST_DATE_FORMAT3, DateTools.parse(TEST_DATE_FORMAT4, DEFAULT_DATE_FORMAT));
		assertEquals(TEST_DATE_FORMAT4, DateTools.parse(TEST_DATE_FORMAT1, DEFAULT_DATE_FORMAT));
		assertFalse(DateTools.isValidDate(TEST_DATE_FORMAT4, DEFAULT_DATE_FORMAT));

		assertEquals(TEST_DATE_FORMAT1.length(), DateTools.DEFAULT_LONG_DATE_FORMAT.length());
		for (String possibleFormat : POSSIBLE_DATE_FORMATS) {
			try {
				DateTools.parse(TEST_DATE_FORMAT1, possibleFormat);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | ParseException e) {
				e.printStackTrace();
				assertTrue(e.getMessage().contains("Unknown date format: "), e.getMessage());
			}
		}
	}

	public static final String TEST_DATE = new SimpleDateFormat(DEFAULT_DATE_FORMAT).format(new Date());

}
