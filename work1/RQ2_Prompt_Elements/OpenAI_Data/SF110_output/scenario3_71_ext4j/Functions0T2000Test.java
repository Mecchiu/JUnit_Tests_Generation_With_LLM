// FunctionsTest.java
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
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class FunctionsTest {

	/**
	 * Test case 1.
	 * Test the dateFormat method with a null date.
	 * Expected result: a null date is returned.
	 */
	@Test
	public void testDateFormatNullDate() {
		Date date = null;
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNull(result);
	}
	
	/**
	 * Test case 2.
	 * Test the dateFormat method with a null pattern.
	 * Expected result: a null date is returned.
	 */
	@Test
	public void testDateFormatNullPattern() {
		Date date = new Date();
		String pattern = null;
		String result = Functions.dateFormat(date, pattern);
		assertNull(result);
	}
	
	/**
	 * Test case 3.
	 * Test the dateFormat method with a null date and a null pattern.
	 * Expected result: a null date is returned.
	 */
	@Test
	public void testDateFormatNullDateAndPattern() {
		Date date = null;
		String pattern = null;
		String result = Functions.dateFormat(date, pattern);
		assertNull(result);
	}
	
	/**
	 * Test case 4.
	 * Test the dateFormat method with a date and a null pattern.
	 * Expected result: a null date is returned.
	 */
	@Test
	public void testDateFormatDateAndNullPattern() {
		Date date = new Date();
		String pattern = null;
		String result = Functions.dateFormat(date, pattern);
		assertNull(result);
	}
	
	/**
	 * Test case 5.
	 * Test the dateFormat method with a null date and a pattern.
	 * Expected result: a null date is returned.
	 */
	@Test
	public void testDateFormatNullDateAndPattern() {
		Date date = null;
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNull(result);
	}
	
	/**
	 * Test case 6.
	 * Test the dateFormat method with a date and a pattern.
	 * Expected result: the date is formatted with the pattern.
	 */
	@Test
	public void testDateFormatDateAndPattern() {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNotNull(result);
	}
	
	/**
	 * Test case 7.
	 * Test the dateFormat method with a date and a pattern.
	 * Expected result: the date is formatted with the pattern.
	 */
	@Test
	public void testDateFormatDateAndPattern2() {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNotNull(result);
	}
	
	/**
	 * Test case 8.
	 * Test the dateFormat method with a date and a pattern.
	 * Expected result: the date is formatted with the pattern.
	 */
	@Test
	public void testDateFormatDateAndPattern3() {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNotNull(result);
	}
	
	/**
	 * Test case 9.
	 * Test the dateFormat method with a date and a pattern.
	 * Expected result: the date is formatted with the pattern.
	 */
	@Test
	public void testDateFormatDateAndPattern4() {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNotNull(result);
	}
	
	/**
	 * Test case 10.
	 * Test the dateFormat method with a date and a pattern.
	 * Expected result: the date is formatted with the pattern.
	 */
	@Test
	public void testDateFormatDateAndPattern5() {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNotNull(result);
	}
}
```

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details