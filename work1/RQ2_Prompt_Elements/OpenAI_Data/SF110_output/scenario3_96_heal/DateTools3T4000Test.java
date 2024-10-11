// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateToolsTest {

	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testParseValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testParseInvalidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and invalid format.
	 */
	@Test
	public void testParseValidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and invalid format.
	 */
	@Test
	public void testParseInvalidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and null format.
	 */
	@Test
	public void testParseValidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and null format.
	 */
	@Test
	public void testParseInvalidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and empty format.
	 */
	@Test
	public void testParseValidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and empty format.
	 */
	@Test
	public void testParseInvalidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and blank format.
	 */
	@Test
	public void testParseValidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and blank format.
	 */
	@Test
	public void testParseInvalidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
}
```

## Exercise 2

### Question 1

```java
// DateTools.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A general utility class for dealing with dates.
 */
public class DateTools {

    /**
     * @param dateString A String to parse into a {@link Date} object.
     * @param format A format to use to parse the date parameter with.
     * @return A {@link Date} representation of the String when possible,
     * 		or <code>null</code> if the date cannot be parsed with the
     * 		given format.
     */
    public static Date parse(String dateString, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }
}

// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateToolsTest {
		
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testParseValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testParseInvalidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and invalid format.
	 */
	@Test
	public void testParseValidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and invalid format.
	 */
	@Test
	public void testParseInvalidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and null format.
	 */
	@Test
	public void testParseValidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and null format.
	 */
	@Test
	public void testParseInvalidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and empty format.
	 */
	@Test
	public void testParseValidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and empty format.
	 */
	@Test
	public void testParseInvalidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and blank format.
	 */
	@Test
	public void testParseValidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and blank format.
	 */
	@Test
	public void testParseInvalidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
}
```

### Question 2

```java
// DateTools.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A general utility class for dealing with dates.
 */
public class DateTools {

    /**
     * @param dateString A String to parse into a {@link Date} object.
     * @param format A format to use to parse the date parameter with.
     * @return A {@link Date} representation of the String when possible,
     * 		or <code>null</code> if the date cannot be parsed with the
     * 		given format.
     */
    public static Date parse(String dateString, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }
}

// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateToolsTest {
		
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testParseValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testParseInvalidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and invalid format.
	 */
	@Test
	public void testParseValidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and invalid format.
	 */
	@Test
	public void testParseInvalidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with a valid date and null format.
	 */
	@Test
	public void testParseValidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
		Date actual = DateTools.parse(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#parse(String, String)}
	 * with an invalid date and null format.
	 */
	@Test
	public void testParseInvalidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		Date expected = new Date(2000, 1, 1);
	