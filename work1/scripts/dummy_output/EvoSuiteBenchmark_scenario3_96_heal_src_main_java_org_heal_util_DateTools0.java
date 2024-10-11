// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateToolsTest {
		
	/**
	 * Test case for {@link DateTools#format(Date)}
	 * with a null parameter.
	 */
	@Test
	public void testFormatNull() {
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(null);
		});
	}
	
	/**
	 * Test case for {@link DateTools#format(Date)}
	 * with a valid parameter.
	 */
	@Test
	public void testFormatValid() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("01/01/2000");
		assertEquals("01/01/2000", DateTools.format(date));
	}
}