import org.junit.jupiter.api.DisplayName;

class StringToMd5Test {

    @Test
    @DisplayName("Test empty string")
    void testEmptyString() {
        assertNull(StringToMd5.stringToMd5(""));
    }

    @Test
    @DisplayName("Test string with one character")
    void testOneCharacterString() {
        assertEquals("b026324c6904b2a9cb4b88d6d61c81d1", StringToMd5.stringToMd5("a"));
    }

    @Test
    @DisplayName("Test string with multiple characters")
    void testMultipleCharacterString() {
        assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", StringToMd5.stringToMd5("hello world"));
    }

    @Test
    @DisplayName("Test string with special characters")
    void testSpecialCharacterString() {
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", StringToMd5.stringToMd5("!@#$%^&*()"));
    }

    @Test
    @DisplayName("Test string with numbers")
    void testNumberString() {
        assertEquals("098f6bcd4621d373cade4e832627b4f6", StringToMd5.stringToMd5("1234567890"));
    }

    @Test
    @DisplayName("Test string with uppercase letters")
    void testUppercaseString() {
        assertEquals("1bc29b36f623ba82aaf6724fd3b16718", StringToMd5.stringToMd5("HELLO WORLD"));
    }

    @Test
    @DisplayName("Test string with lowercase letters")
    void testLowercaseString() {
        assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", StringToMd5.stringToMd5("hello world"));
    }

    @Test
    @DisplayName("Test string with mixed case letters")
    void testMixedCaseString() {
        assertEquals("1bc29b36f623ba82aaf6724fd3b16718", StringToMd5.stringToMd5("Hello World"));
    }

    @Test
    @DisplayName("Test string with leading and trailing spaces")
    void testStringWithSpaces() {
        assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", StringToMd5.stringToMd5("  hello world  "));
    }

    @Test
    @DisplayName("Test string with newline characters")
    void testStringWithNewlines() {
        assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", StringToMd5.stringToMd5("hello\nworld"));
    }

    @Test
    @DisplayName("Test string with tab characters")
    void testStringWithTabs() {
        assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", StringToMd5.stringToMd5("hello\tworld"));
    }
}