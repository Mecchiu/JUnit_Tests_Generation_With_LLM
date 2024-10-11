Here's the source code for the test class:

```
// DateTools_5Test.java
package org.heal.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link DateTools}.
 * It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
 */
class DateTools_5Test {

    @Test
    void testValidDate() {
        assertTrue(DateTools.isValidDate("2021-01-01", "yyyy-MM-dd"));
    }

    @Test
    void testInvalidDate() {
        assertFalse(DateTools.isValidDate("2021-02-29", "yyyy-MM-dd"));
    }

    @Test
    void testInvalidFormat() {
        assertFalse(DateTools.isValidDate("01/01/2021", "yyyy-MM-dd"));
    }

    @Test
    void testNullDate() {
        assertFalse(DateTools.isValidDate(null, "yyyy-MM-dd"));
    }

    @Test
    void testEmptyDate() {
        assertFalse(DateTools.isValidDate("", "yyyy-MM-dd"));
    }

    @Test
    void testInvalidMonth() {
        assertFalse(DateTools.isValidDate("2021-13-01", "yyyy-MM-dd"));
    }

    @Test
    void testInvalidDay() {
        assertFalse(DateTools.isValidDate("2021-02-31", "yyyy-MM-dd"));
    }

    @Test
    void testInvalidYear() {
        assertFalse(DateTools.isValidDate("10000-01-01", "yyyy-MM-dd"));
    }

    @Test
    void testInvalidDateFormat() {
        assertFalse(DateTools.isValidDate("2021-01-01", "MM/dd/yyyy"));
    }

    @Test
    void testValidDateFormat() {
        assertTrue(DateTools.isValidDate("01/01/2021", "MM/dd/yyyy"));
    }
}
```

This test class contains ten unit test cases for the `isValidDate` method of the `DateTools` class. The test cases cover various scenarios such as valid and invalid dates, null and empty input, invalid date formats, and invalid date components (month, day, and year). The `assertTrue` and `assertFalse` methods are used to assert the expected results of the method under test.