Here's an example implementation of the test class for the `Wildcard` class:

```
package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WildcardTest {

    @Test
    void testMatchWildcard() {
        // Test exact match
        assertEquals("", Wildcard.matchWildcard("file.txt", "file.txt"));

        // Test simple wildcard match
        assertEquals("", Wildcard.matchWildcard("*.txt", "file.txt"));

        // Test multiple simple patterns
        assertEquals("", Wildcard.matchWildcard("file.txt;*.txt", "file.txt"));

        // Test no match
        assertNull(Wildcard.matchWildcard("file.txt", "file.xml"));

        // Test wildcard match with prefix
        assertEquals("file", Wildcard.matchWildcard("file*.txt", "file123.txt"));

        // Test wildcard match with suffix
        assertEquals(".txt", Wildcard.matchWildcard("*file.txt", "123file.txt"));

        // Test wildcard match with prefix and suffix
        assertEquals("123", Wildcard.matchWildcard("file*123.txt", "file123.txt"));

        // Test wildcard match with multiple stars
        assertEquals("123", Wildcard.matchWildcard("file*123*.txt", "file123abc123.txt"));

        // Test wildcard match with empty string
        assertEquals("", Wildcard.matchWildcard("*.txt", ".txt"));

        // Test wildcard match with multiple patterns and no match
        assertNull(Wildcard.matchWildcard("file.txt;*.xml", "file.jpg"));
    }
}
```

This test class contains ten test cases that cover different scenarios for the `matchWildcard` method. The `@Test` annotation is used to mark each test method, and the `assertEquals` and `assertNull` methods are used to check the expected results.