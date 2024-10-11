Here's the source code for the CountDistinctCharactersTest class:

```
class CountDistinctCharactersTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaa"));
    }

    @Test
    void testAllDifferentCharacters() {
        assertEquals(26, CountDistinctCharacters.countDistinctCharacters("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void testMixedCase() {
        assertEquals(26, CountDistinctCharacters.countDistinctCharacters("aBcDeFgHiJkLmNoPqRsTuVwXyZ"));
    }

    @Test
    void testWithSpaces() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("hello world"));
    }

    @Test
    void testWithNumbers() {
        assertEquals(10, CountDistinctCharacters.countDistinctCharacters("1234567890"));
    }

    @Test
    void testWithSpecialCharacters() {
        assertEquals(7, CountDistinctCharacters.countDistinctCharacters("!@#$%^&*()"));
    }

    @Test
    void testWithMixedCharacters() {
        assertEquals(12, CountDistinctCharacters.countDistinctCharacters("Hello, World!"));
    }

    @Test
    void testWithUnicodeCharacters() {
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("こんにちは世界"));
    }
}
```

This test class contains ten unit test cases for the `countDistinctCharacters` method of the `CountDistinctCharacters` class. Each test case tests a different scenario, such as an empty string, a string with all the same characters, a string with mixed case, a string with spaces, a string with numbers, a string with special characters, a string with mixed characters, and a string with Unicode characters. The `assertEquals` method is used to compare the expected result with the actual result of the method call.