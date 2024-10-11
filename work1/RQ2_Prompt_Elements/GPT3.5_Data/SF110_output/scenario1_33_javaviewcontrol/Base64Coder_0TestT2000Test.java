Here's an example of how you can write unit tests for the `Base64Coder` class:

```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Base64Coder_0Test {

    @Test
    void testEncodeString() {
        String input = "Hello, world!";
        String expectedOutput = "SGVsbG8sIHdvcmxkIQ==";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithNullString() {
        String input = null;
        assertThrows(NullPointerException.class, () -> {
            Base64Coder.encodeString(input);
        });
    }

    @Test
    void testEncodeStringWithLongString() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
        String expectedOutput = "TG9yZW0gaXBzdW0gZG9sb3Igc2l0IGFtZXQsIGNvbnNlY3RldHVyIGFkaXBpc2NpbmcgZWxpdC4gU2VkIG5vbiByaXN1cy4gU3VwcG9ydGVzIHNlZCwgZG9sb3Iu";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithSpecialCharacters() {
        String input = "This is a test with special characters: !@#$%^&*()_+-=[]{}|;':\",./<>?";
        String expectedOutput = "VGhpcyBpcyBhIHRlc3Qgd2l0aCBzcGVjaWFsIGNoYXJhY3RlcnM6ICEhJCVeJiooKV8rKykrXy0tW117e30nfDsnLDoIiwuLz4+Pw==";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithUnicodeCharacters() {
        String input = "こんにちは、世界！";
        String expectedOutput = "44GC44GE44GG44GI44GK44KS44O844K544OI44Oq44O844Kj44K5";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithSingleByteCharacters() {
        String input = "abcde";
        String expectedOutput = "YWJjZGU=";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithTwoByteCharacters() {
        String input = "こんにちは";
        String expectedOutput = "44GC44GE44GG44GI44GK44KS";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithThreeByteCharacters() {
        String input = "👋🌍";
        String expectedOutput = "8J+Yj/CfkI8=";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncodeStringWithMixedCharacters() {
        String input = "Hello, こんにちは、世界！👋🌍";
        String expectedOutput = "SGVsbG8sIPCfj5zjgYvjgYfjgYfjgYvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIHjgIvkuK3lv4bliqDjgIHjgIHjgIH