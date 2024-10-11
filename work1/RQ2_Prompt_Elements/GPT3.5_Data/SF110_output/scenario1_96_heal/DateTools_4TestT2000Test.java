Here's the source code for the test class:

```
// DateTools_4Test.java
package org.heal.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTools_4Test {

    @Test
    void testValidDateFormats() {
        assertTrue(DateTools.isValidDate("2021-01-01"));
        assertTrue(DateTools.isValidDate("01/01/2021"));
        assertTrue(DateTools.isValidDate("01-01-2021"));
        assertTrue(DateTools.isValidDate("2021/01/01"));
        assertTrue(DateTools.isValidDate("2021.01.01"));
    }

    @Test
    void testInvalidDateFormats() {
        assertFalse(DateTools.isValidDate("2021-13-01"));
        assertFalse(DateTools.isValidDate("01/13/2021"));
        assertFalse(DateTools.isValidDate("01-01-2021 12:00:00"));
        assertFalse(DateTools.isValidDate("2021/01/01 12:00:00"));
        assertFalse(DateTools.isValidDate("2021.01.01 12:00:00"));
    }
}
```

This test class contains two test methods: `testValidDateFormats()` and `testInvalidDateFormats()`. The first method tests five valid date formats, while the second method tests five invalid date formats. The `assertTrue()` and `assertFalse()` methods are used to check if the `isValidDate()` method returns the expected result for each input.