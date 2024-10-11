import org.junit.jupiter.api.DisplayName;

class StringToMd5Test {

    @Test
    @DisplayName("Test empty string")
    void testEmptyString() {
        String result = StringToMd5.stringToMd5("");
        assertNull(result);
    }

    @Test
    @DisplayName("Test lowercase string")
    void testLowercaseString() {
        String result = StringToMd5.stringToMd5("hello world");
        assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", result);
    }

    @Test
    @DisplayName("Test uppercase string")
    void testUppercaseString() {
        String result = StringToMd5.stringToMd5("HELLO WORLD");
        assertEquals("b94d27b9934d3e08a52e52d7da7dabfac484efe37a5380ee9088f7ace2efcde9", result);
    }

    @Test
    @DisplayName("Test mixed case string")
    void testMixedCaseString() {
        String result = StringToMd5.stringToMd5("Hello World");
        assertEquals("b94d27b9934d3e08a52e52d7da7dabfac484efe37a5380ee9088f7ace2efcde9", result);
    }

    @Test
    @DisplayName("Test string with numbers")
    void testStringWithNumbers() {
        String result = StringToMd5.stringToMd5("Hello123World");
        assertEquals("f7c3bc1d808e04732adf679965ccc34ca7ae3441e5cb1b3f163fed1238bb6bb1", result);
    }

    @Test
    @DisplayName("Test string with special characters")
    void testStringWithSpecialCharacters() {
        String result = StringToMd5.stringToMd5("Hello!@#$%^&*()_+World");
        assertEquals("d7d5f1f2c8fbbf7b3c0e7e9d7d9c8c5d", result);
    }

    @Test
    @DisplayName("Test string with leading and trailing spaces")
    void testStringWithLeadingAndTrailingSpaces() {
        String result = StringToMd5.stringToMd5("  Hello World  ");
        assertEquals("b94d27b9934d3e08a52e52d7da7dabfac484efe37a5380ee9088f7ace2efcde9", result);
    }

    @Test
    @DisplayName("Test string with only spaces")
    void testStringWithOnlySpaces() {
        String result = StringToMd5.stringToMd5("     ");
        assertEquals("7215ee9c7d9dc229d2921a40e899ec5f", result);
    }

    @Test
    @DisplayName("Test string with newline characters")
    void testStringWithNewlineCharacters() {
        String result = StringToMd5.stringToMd5("Hello\nWorld");
        assertEquals("6f5902ac237024bdd0c176cb93063dc4", result);
    }

    @Test
    @DisplayName("Test string with carriage return characters")
    void testStringWithCarriageReturnCharacters() {
        String result = StringToMd5.stringToMd5("Hello\rWorld");
        assertEquals("6f5902ac237024bdd0c176cb93063dc4", result);
    }

    @Test
    @DisplayName("Test string with tab characters")
    void testStringWithTabCharacters() {
        String result = StringToMd5.stringToMd5("Hello\tWorld");
        assertEquals("6f5902ac237024bdd0c176cb93063dc4", result);
    }
}