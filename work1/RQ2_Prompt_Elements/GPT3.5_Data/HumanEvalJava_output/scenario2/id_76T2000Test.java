Here's the code for the test class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSimplePowerTest {

    @Test
    void testIsSimplePower() {
        assertTrue(IsSimplePower.isSimplePower(1, 2));
        assertFalse(IsSimplePower.isSimplePower(2, 1));
        assertTrue(IsSimplePower.isSimplePower(16, 2));
        assertTrue(IsSimplePower.isSimplePower(27, 3));
        assertFalse(IsSimplePower.isSimplePower(15, 3));
        assertFalse(IsSimplePower.isSimplePower(10, 2));
        assertTrue(IsSimplePower.isSimplePower(1, 1));
        assertFalse(IsSimplePower.isSimplePower(0, 2));
        assertFalse(IsSimplePower.isSimplePower(2, 0));
        assertTrue(IsSimplePower.isSimplePower(1, 0));
    }
}
```

This test class contains ten unit test cases for the `isSimplePower` method of the `IsSimplePower` class. The `@Test` annotation is used to mark each test method. The `assertTrue` and `assertFalse` methods are used to check the expected result of each test case.