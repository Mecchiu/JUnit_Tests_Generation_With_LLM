```java
class SplitWordsTest {

    @Test
    void testSplitWordsWithWhitespace() {
        assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello world!"));
    }

    @Test
    void testSplitWordsWithComma() {
        assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello,world!"));
    }

    @Test
    void testSplitWordsWithCommaAndSpace() {
        assertEquals(Arrays.asList("Hello", "world,!"), SplitWords.splitWords("Hello world,!"));
    }

    @Test
    void testSplitWordsWithMultipleCommas() {
        assertEquals(Arrays.asList("Hello,Hello,world", "!"), SplitWords.splitWords("Hello,Hello,world !"));
    }

    @Test
    void testSplitWordsWithLowerCaseLetters() {
        assertEquals(3, SplitWords.splitWords("abcdef"));
    }

    @Test
    void testSplitWordsWithOddLowerCaseLetters() {
        assertEquals(2, SplitWords.splitWords("aaabb"));
    }

    @Test
    void testSplitWordsWithMixedCaseLetters() {
        assertEquals(1, SplitWords.splitWords("aaaBb"));
    }

    @Test
    void testSplitWordsWithEmptyString() {
        assertEquals(0, SplitWords.splitWords(""));
    }

    @Test
    void testSplitWordsWithNoWhitespaceOrComma() {
        assertEquals(4, SplitWords.splitWords("HelloWorld!"));
    }
}
```
