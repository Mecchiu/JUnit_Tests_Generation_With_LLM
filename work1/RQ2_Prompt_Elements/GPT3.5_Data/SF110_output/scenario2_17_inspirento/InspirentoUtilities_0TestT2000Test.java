// Test case for InspirentoUtilities.tokenize() method
class InspirentoUtilities_0Test {

    @Test
    void testTokenizeWithEmptyString() {
        String input = "";
        String[] expectedOutput = {};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithSingleWord() {
        String input = "hello";
        String[] expectedOutput = {"hello"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithMultipleWords() {
        String input = "hello world";
        String[] expectedOutput = {"hello", "world"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithExtraSpaces() {
        String input = "  hello   world  ";
        String[] expectedOutput = {"hello", "world"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithTabDelimiter() {
        String input = "hello\tworld";
        String[] expectedOutput = {"hello", "world"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithNewlineDelimiter() {
        String input = "hello\nworld";
        String[] expectedOutput = {"hello", "world"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithMixedDelimiters() {
        String input = "hello\tworld\nhow are you?";
        String[] expectedOutput = {"hello", "world", "how", "are", "you?"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithNullInput() {
        String input = null;
        assertThrows(NullPointerException.class, () -> InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithEmptyToken() {
        String input = "hello  world";
        String[] expectedOutput = {"hello", "world"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }

    @Test
    void testTokenizeWithLeadingAndTrailingSpaces() {
        String input = "  hello world  ";
        String[] expectedOutput = {"hello", "world"};
        assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
    }
}