Here's a possible implementation of the test class:

```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Base64Coder_3Test {

    @Test
    void testDecodeStringEmpty() {
        assertEquals("", Base64Coder.decodeString(""));
    }

    @Test
    void testDecodeStringSingleChar() {
        assertEquals("A", Base64Coder.decodeString("QQ=="));
    }

    @Test
    void testDecodeStringMultipleChars() {
        assertEquals("Hello, world!", Base64Coder.decodeString("SGVsbG8sIHdvcmxkIQ=="));
    }

    @Test
    void testDecodeStringInvalidChar() {
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("SGVsbG8sIHdvcmxkI!"));
    }

    @Test
    void testDecodeStringInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("SGVsbG8sIHdvcmxk"));
    }

    @Test
    void testDecodeStringPadding() {
        assertEquals("Hello, world!", Base64Coder.decodeString("SGVsbG8sIHdvcmxkIQ=="));
    }

    @Test
    void testDecodeStringPaddingOneChar() {
        assertEquals("Hello, worl", Base64Coder.decodeString("SGVsbG8sIHdvcmw="));
    }

    @Test
    void testDecodeStringPaddingTwoChars() {
        assertEquals("Hello, wor", Base64Coder.decodeString("SGVsbG8sIHdvcmw=="));
    }

    @Test
    void testDecodeStringPaddingThreeChars() {
        assertEquals("Hello, wo", Base64Coder.decodeString("SGVsbG8sIHdvcm8="));
    }

    @Test
    void testDecodeStringPaddingFourChars() {
        assertEquals("Hello, w", Base64Coder.decodeString("SGVsbG8sIHdvcmc="));
    }
}
```

This test class contains ten test cases for the `decodeString` method of the `Base64Coder` class. The test cases cover different scenarios, such as empty input, single and multiple characters, invalid characters, invalid length, and different padding lengths. The `assertEquals` method is used to compare the expected and actual results, while the `assertThrows` method is used to check that the method throws an exception when the input is invalid.