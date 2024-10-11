import java.util.ArrayList;
import java.util.Arrays;

class AllPrefixesTest {

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string is empty.
     */
    @Test
    void testAllPrefixesEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = AllPrefixes.allPrefixes("");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has only one character.
     */
    @Test
    void testAllPrefixesSingleCharacter() {
        List<Object> expected = Arrays.asList("a");
        List<Object> actual = AllPrefixes.allPrefixes("a");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has multiple characters.
     */
    @Test
    void testAllPrefixesMultipleCharacters() {
        List<Object> expected = Arrays.asList("a", "ab", "abc");
        List<Object> actual = AllPrefixes.allPrefixes("abc");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has all characters same.
     */
    @Test
    void testAllPrefixesAllSameCharacters() {
        List<Object> expected = Arrays.asList("W", "WW", "WWW");
        List<Object> actual = AllPrefixes.allPrefixes("WWW");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has all characters different.
     */
    @Test
    void testAllPrefixesAllDifferentCharacters() {
        List<Object> expected = Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh");
        List<Object> actual = AllPrefixes.allPrefixes("asdfgh");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has spaces.
     */
    @Test
    void testAllPrefixesStringWithSpaces() {
        List<Object> expected = Arrays.asList("a", "ab", "abc", "a b", "a bc", "a bcd");
        List<Object> actual = AllPrefixes.allPrefixes("a bcd");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has special characters.
     */
    @Test
    void testAllPrefixesStringWithSpecialCharacters() {
        List<Object> expected = Arrays.asList("a", "ab", "abc", "a@", "a@#", "a@#4");
        List<Object> actual = AllPrefixes.allPrefixes("a@#4");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has numbers.
     */
    @Test
    void testAllPrefixesStringWithNumbers() {
        List<Object> expected = Arrays.asList("1", "12", "123", "1234");
        List<Object> actual = AllPrefixes.allPrefixes("1234");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string has mixed characters.
     */
    @Test
    void testAllPrefixesStringWithMixedCharacters() {
        List<Object> expected = Arrays.asList("a", "ab", "abc", "a1", "a1@", "a1@#");
        List<Object> actual = AllPrefixes.allPrefixes("a1@#");
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link AllPrefixes#allPrefixes(String)}.
     * Test case when input string is null.
     */
    @Test
    void testAllPrefixesNullString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = AllPrefixes.allPrefixes(null);
        assertEquals(expected, actual);
    }
}