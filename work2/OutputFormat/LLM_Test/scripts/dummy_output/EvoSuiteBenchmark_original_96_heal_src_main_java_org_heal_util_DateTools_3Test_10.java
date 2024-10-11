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
	 * Test method for {@link DateTools#parse(String,String)}.
	 */
	@Test
	void testParse() {
		assertEquals(DateTools.parse(null, null), null);
		assertEquals(DateTools.parse("12/07/2013", "yyyy-MM-dd"), new Date(2014, 7, 12));
		assertEquals(DateTools.parse("05/01/2013", "yyyy-MM-dd"), new Date(2013, 1, 1));
		assertEquals(DateTools.parse("05/02/2013", "yyyy-MM-dd"), new Date(2013, 2, 1));
		assertEquals(DateTools.parse("07/01/2013", "yyyy-MM-dd"), new Date(2013, 7, 1));
		assertEquals(DateTools.parse("07/06/2013", "yyyy-MM-dd"), new Date(2013, 6, 1));
		assertEquals(DateTools.parse("06/07/2013", "yyyy-MM-dd"), new Date(2013, 6, 7));
		assertEquals(DateTools.parse("06/04/2013", "yyyy-MM-dd"), new Date(2013, 4, 1));
		assertEquals(DateTools.parse("06/02/2013", "yyyy-MM-dd"), new Date(2013, 2, 1));
		assertEquals(DateTools.parse("09/02/2013", "yyyy-MM-dd"), new Date(2013, 11, 1));
		assertEquals(DateTools.parse("09/01/2013", "yyyy-MM-dd"), new Date(2013, 10, 1));
		assertEquals(DateTools.parse("09/01/2013", "yyyy-MM-dd"), new Date(2013, 9, 1));
		
		assertEquals(DateTools.parse("07/04/2013", "yyyy-MM-dd HH:mm:ss"), new Date(2013, 4, 1, 7, 00, 00));
		assertEquals(DateTools.parse("06/04/2013", "yyyy-MM-dd HH:mm:ss"), new Date(2013, 6, 1, 7, 00, 00));
		
		assertEquals(DateTools.parse("07/04/2013", "yyyy-MM-dd HH:mm:ss.MMMdd"), new Date(2013, 4, 1, 7, 00, 00));
		assertEquals(DateTools.parse("06/04/2013", "yyyy-MM-dd HH:mm:ss.MMMdd"), new Date(2013, 6, 1, 7, 00, 00));
	}

	/**
	 * Test method for {@link DateTools#parse(String,String,DateFormat)}.
	 */
	@Test
	void testParse_1() {
		assertThrows(IllegalArgumentException.class, () -> {
			assertThrows(NullPointerException.class,
					() -> {
						DateTools.parse(null, "yyyy-MM-dd HH:mm:ss", null);
					});
		});
	}
	/**
	 * Test method for {@link DateTools#parse(String,String,DateFormat)}.
	 */
	@Test
	void testParse_2() {
		assertAllFail(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.yyyy"));
		assertAllFail(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.yyyy"), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.xxx"));
	}
	/**
	 * Test method for {@link DateTools#parse(String,String,String)}.
	 */
	@Test
	void testParse_3() {
		Date date = parse("07/06/2014", "yyyy-MM-dd HH:mm:ss");
		assertEquals(DateTools.parse("07/06/2014", "yyyy-MM-dd HH:mm:ss"), date);
		date = null;
		assertNull(DateTools.parse("07/06/2014", "yyyy-MM-dd HH:mm:ss.yyyy"));
		assertNull(DateTools.parse("07/06/2014", "yyyy-MM-dd HH:mm:ss.xxx"));
	}
}