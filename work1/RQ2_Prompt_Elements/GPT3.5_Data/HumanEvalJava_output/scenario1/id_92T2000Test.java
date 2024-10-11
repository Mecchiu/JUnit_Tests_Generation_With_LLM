Here's the code for the AnyIntTest class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnyIntTest {

    @Test
    void testAnyIntReturnsTrueWhenXEqualsYPlusZ() {
        assertTrue(AnyInt.anyInt(5, 2, 3));
    }

    @Test
    void testAnyIntReturnsTrueWhenYEqualsXPlusZ() {
        assertTrue(AnyInt.anyInt(2, 5, 3));
    }

    @Test
    void testAnyIntReturnsTrueWhenZEqualsXPlusY() {
        assertTrue(AnyInt.anyInt(2, 3, 5));
    }

    @Test
    void testAnyIntReturnsFalseWhenXIsNotInteger() {
        assertFalse(AnyInt.anyInt(2.5, 3, 5));
    }

    @Test
    void testAnyIntReturnsFalseWhenYIsNotInteger() {
        assertFalse(AnyInt.anyInt(2, 3.5, 5));
    }

    @Test
    void testAnyIntReturnsFalseWhenZIsNotInteger() {
        assertFalse(AnyInt.anyInt(2, 3, 5.5));
    }

    @Test
    void testAnyIntReturnsFalseWhenXIsNull() {
        assertFalse(AnyInt.anyInt(null, 3, 5));
    }

    @Test
    void testAnyIntReturnsFalseWhenYIsNull() {
        assertFalse(AnyInt.anyInt(2, null, 5));
    }

    @Test
    void testAnyIntReturnsFalseWhenZIsNull() {
        assertFalse(AnyInt.anyInt(2, 3, null));
    }

    @Test
    void testAnyIntReturnsFalseWhenNoConditionIsMet() {
        assertFalse(AnyInt.anyInt(2, 3, 4));
    }
}
```

This test class contains ten unit test cases for the `anyInt` method of the `AnyInt` class. The first three test cases check if the method returns true when x equals y plus z, y equals x plus z, and z equals x plus y, respectively. The next three test cases check if the method returns false when x, y, or z is not an integer, respectively. The next three test cases check if the method returns false when x, y, or z is null, respectively. The last test case checks if the method returns false when none of the conditions are met.