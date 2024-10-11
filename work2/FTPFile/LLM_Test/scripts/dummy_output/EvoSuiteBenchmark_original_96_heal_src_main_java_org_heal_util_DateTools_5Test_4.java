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
		
	/**
	 * Since the isValidDate method always returns <code>true</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
	public void test_isValidDate_String_String_String() {
	        assertTrue(DateTools.isValidDate("yy-MM-dd", "yyyy-MM-dd"));
	}
	
	/**
	 * Since the isValidDate method always returns <code>true</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_String_Date_Date() {
	        assertTrue(DateTools.isValidDate("yyyy-MM-dd", "MM-dd"));
	}
	
	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_String_Date_String() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "MM-dd"));
	}

	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_String_Date_Date() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "dd"));
	}

	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_String_Date_String() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "dd.ddd"));
	}

	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_String_Date_Date() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "dd.ddddd"));
	}

	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_String_Date_String_String() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "dddddDdddd"));
	}

	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_String_Date_String_Date() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "dddddddDddddd"));
	}

	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_Date_Date_Date() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "ddddddddDddddddd"));
	}

	/**
	 * Since the isValidDate method always returns <code>false</code> the
	 * test case is placed here, but has not been verified to pass in the
	 * expected {@code "false"} value.
	 */
	@Test
    public void test_isValidDate_Date_Date_String_String() {
	        assertFalse(DateTools.isValidDate("yyyy-MM-dd", "ddddddddDddddddddddd"));
	}

}