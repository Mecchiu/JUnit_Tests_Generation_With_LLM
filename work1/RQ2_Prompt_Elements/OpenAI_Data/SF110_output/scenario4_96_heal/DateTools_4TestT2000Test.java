// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {

	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_1() {
		String dateString = "2000-01-01";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_2() {
		String dateString = "2000-01-01 00:00:00";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_3() {
		String dateString = "01/01/2000";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_4() {
		String dateString = "01-01-2000";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_5() {
		String dateString = "2000";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>false</code>
	* when the given String is not a valid date.
	*/
	@Test
	void testIsValidDate_6() {
		String dateString = "2000-01-01 00:00:00.000";
		boolean result = DateTools.isValidDate(dateString);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>false</code>
	* when the given String is not a valid date.
	*/
	@Test
	void testIsValidDate_7() {
		String dateString = "2000-01-01 00:00:00.000";
		boolean result = DateTools.isValidDate(dateString);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>false</code>
	* when the given String is not a valid date.
	*/
	@Test
	void testIsValidDate_8() {
		String dateString = "2000-01-01 00:00:00.000";
		boolean result = DateTools.isValidDate(dateString);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>false</code>
	* when the given String is not a valid date.
	*/
	@Test
	void testIsValidDate_9() {
		String dateString = "2000-01-01 00:00:00.000";
		boolean result = DateTools.isValidDate(dateString);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>false</code>
	* when the given String is not a valid date.
	*/
	@Test
	void testIsValidDate_10() {
		String dateString = "2000-01-01 00:00:00.000";
		boolean result = DateTools.isValidDate(dateString);
		assertFalse(result);
	}
}

// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {
		
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_1() {
		String dateString = "2000-01-01";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_2() {
		String dateString = "2000-01-01 00:00:00";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_3() {
		String dateString = "01/01/2000";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_4() {
		String dateString = "01-01-2000";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>true</code>
	* when the given String is a valid date.
	*/
	@Test
	void testIsValidDate_5() {
		String dateString = "2000";
		boolean result = DateTools.isValidDate(dateString);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DateTools#isValidDate(String)}.
	* The test case is successful if the method returns <code>false</code>
	* when the given String is not a valid date.
	*/
	@Test
	void testIsValidDate_6() {
		String dateString = "2000-01-01 00:00:00.000";
		boolean result = DateTools