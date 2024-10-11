// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateToolsTest {

	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testIsValidDateValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testIsValidDateInvalidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and invalid format.
	 */
	@Test
	public void testIsValidDateValidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and invalid format.
	 */
	@Test
	public void testIsValidDateInvalidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and null format.
	 */
	@Test
	public void testIsValidDateValidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and null format.
	 */
	@Test
	public void testIsValidDateInvalidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and empty format.
	 */
	@Test
	public void testIsValidDateValidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and empty format.
	 */
	@Test
	public void testIsValidDateInvalidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and blank format.
	 */
	@Test
	public void testIsValidDateValidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and blank format.
	 */
	@Test
	public void testIsValidDateInvalidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
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
     * @param dateString A String that may or may not represent a
     * 		{@link Date} that can be parsed with the given format.
     * @param format A format to use to check if the String can
     * 		be parsed into a {@link Date}.
     * @return <code>true</code> if a {@link Date} can be parsed from
     * 		the String in the given format, or <code>false</code>
     * 		otherwise.
     * @see #parse(String dateString, String format)
     */
    public static boolean isValidDate(String dateString, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false);
            sdf.parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * @param dateString A String that represents a {@link Date}
     * 		that can be parsed with the given format.
     * @param format A format to use to parse the String into a
     * 		{@link Date}.
     * @return A {@link Date} parsed from the String in the given
     * 		format.
     * @throws ParseException If the String cannot be parsed into a
     * 		{@link Date} with the given format.
     * @see #isValidDate(String dateString, String format)
     */
    public static Date parse(String dateString, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        return sdf.parse(dateString);
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
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateToolsTest {
		
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testIsValidDateValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testIsValidDateInvalidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and invalid format.
	 */
	@Test
	public void testIsValidDateValidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and invalid format.
	 */
	@Test
	public void testIsValidDateInvalidDateInvalidFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and null format.
	 */
	@Test
	public void testIsValidDateValidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and null format.
	 */
	@Test
	public void testIsValidDateInvalidDateNullFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and empty format.
	 */
	@Test
	public void testIsValidDateValidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and empty format.
	 */
	@Test
	public void testIsValidDateInvalidDateEmptyFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and blank format.
	 */
	@Test
	public void testIsValidDateValidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and blank format.
	 */
	@Test
	public void testIsValidDateInvalidDateBlankFormat() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
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
     * @param dateString A String that may or may not represent a
     * 		{@link Date} that can be parsed with the given format.
     * @param format A format to use to check if the String can
     * 		be parsed into a {@link Date}.
     * @return <code>true</code> if a {@link Date} can be parsed from
     * 		the String in the given format, or <code>false</code>
     * 		otherwise.
     * @see #parse(String dateString, String format)
     */
    public static boolean isValidDate(String dateString, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false);
            sdf.parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * @param dateString A String that represents a {@link Date}
     * 		that can be parsed with the given format.
     * @param format A format to use to parse the String into a
     * 		{@link Date}.
     * @return A {@link Date} parsed from the String in the given
     * 		format.
     * @throws ParseException If the String cannot be parsed into a
     * 		{@link Date} with the given format.
     * @see #isValidDate(String dateString, String format)
     */
    public static Date parse(String dateString, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        return sdf.parse(dateString);
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
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateToolsTest {
		
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with a valid date and format.
	 */
	@Test
	public void testIsValidDateValidDate() {
		String dateString = "01/01/2000";
		String format = "MM/dd/yyyy";
		boolean expected = true;
		boolean actual = DateTools.isValidDate(dateString, format);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DateTools#isValidDate(String, String)}
	 * with an invalid date and valid format.
	 */
	@Test
	public void testIsValidDateInvalidDate() {
		String dateString = "01/01/2000";