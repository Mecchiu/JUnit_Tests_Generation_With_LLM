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
		
	@Test
	void isValidDateReturnsTrue_whenIsValidDateWithFormat();
	
	@Test
	void isValidDateReturnsTrue_whenIsValidDateWithNoFormat();
	
	@Test
	void isValidDateReturnsFalse_whenIsValidDateWithInvalidFormat();

		
	@Test
	void isValidDateReturnsFalse_whenIsValidDateWithDifferentFormat();
	
	@Test
	void isValidDateReturnsFalse_whenIsValidDateWithSpecifiedFormat();

}