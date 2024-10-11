// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String)} method.
*/
class DateToolsTest {

	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is null.
	 */
	@Test
	void testParseNull() {
		assertNull(DateTools.parse(null));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is empty.
	 */
	@Test
	void testParseEmpty() {
		assertNull(DateTools.parse(""));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is not a valid date.
	 */
	@Test
	void testParseInvalid() {
		assertNull(DateTools.parse("abc"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid2() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid3() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid4() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid5() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid6() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid7() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid8() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid9() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
	
	/**
	 * Test case for {@link DateTools#parse(String)} method.
	 * It tests the case when the input date string is a valid date.
	 */
	@Test
	void testParseValid10() {
		assertNotNull(DateTools.parse("01/01/2000"));
	}
}