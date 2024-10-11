Here's the complete code for the `ChangeBaseTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ChangeBase}.
 * It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
 */
class ChangeBaseTest {

    @Test
    void testChangeBaseBinary() {
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("11111111", ChangeBase.changeBase(255, 2));
        assertEquals("10000000000", ChangeBase.changeBase(1024, 2));
    }

    @Test
    void testChangeBaseOctal() {
        assertEquals("12", ChangeBase.changeBase(10, 8));
        assertEquals("377", ChangeBase.changeBase(255, 8));
        assertEquals("2000", ChangeBase.changeBase(1024, 8));
    }

    @Test
    void testChangeBaseHexadecimal() {
        assertEquals("A", ChangeBase.changeBase(10, 16));
        assertEquals("FF", ChangeBase.changeBase(255, 16));
        assertEquals("400", ChangeBase.changeBase(1024, 16));
    }

    @Test
    void testChangeBaseDecimal() {
        assertEquals("10", ChangeBase.changeBase(10, 10));
        assertEquals("255", ChangeBase.changeBase(255, 10));
        assertEquals("1024", ChangeBase.changeBase(1024, 10));
    }

    @Test
    void testChangeBaseInvalidBase() {
        assertThrows(IllegalArgumentException.class, () -> ChangeBase.changeBase(10, 1));
        assertThrows(IllegalArgumentException.class, () -> ChangeBase.changeBase(10, 17));
    }

    @Test
    void testChangeBaseNegativeNumber() {
        assertEquals("-1010", ChangeBase.changeBase(-10, 2));
        assertEquals("-12", ChangeBase.changeBase(-10, 8));
        assertEquals("-A", ChangeBase.changeBase(-10, 16));
        assertEquals("-10", ChangeBase.changeBase(-10, 10));
    }

    @Test
    void testChangeBaseZero() {
        assertEquals("0", ChangeBase.changeBase(0, 2));
        assertEquals("0", ChangeBase.changeBase(0, 8));
        assertEquals("0", ChangeBase.changeBase(0, 16));
        assertEquals("0", ChangeBase.changeBase(0, 10));
    }
}
```

This class contains ten unit test cases for the `changeBase` method of the `ChangeBase` class. The test cases cover different scenarios, such as converting numbers to binary, octal, hexadecimal, and decimal bases, handling invalid bases, negative numbers, and zero. The `assertEquals` method is used to compare the expected result with the actual result returned by the `changeBase` method. The `assertThrows` method is used to test that an `IllegalArgumentException` is thrown when an invalid base is passed as a parameter.