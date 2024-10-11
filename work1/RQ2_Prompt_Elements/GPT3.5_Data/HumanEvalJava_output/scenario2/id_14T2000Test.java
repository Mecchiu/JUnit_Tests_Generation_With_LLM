import static org.junit.jupiter.api.Assertions.assertEquals;

class AllPrefixesTest {

    @Test
    void testAllPrefixes() {
        String input = "hello";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("h");
        expectedOutput.add("he");
        expectedOutput.add("hel");
        expectedOutput.add("hell");
        expectedOutput.add("hello");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesEmptyString() {
        String input = "";
        List<String> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesSingleCharacter() {
        String input = "a";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("a");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesRepeatedCharacters() {
        String input = "aaa";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("a");
        expectedOutput.add("aa");
        expectedOutput.add("aaa");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesNumbers() {
        String input = "12345";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("1");
        expectedOutput.add("12");
        expectedOutput.add("123");
        expectedOutput.add("1234");
        expectedOutput.add("12345");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesSpecialCharacters() {
        String input = "!@#$%";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("!");
        expectedOutput.add("!@");
        expectedOutput.add("!@#");
        expectedOutput.add("!@#$");
        expectedOutput.add("!@#$%");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesWhitespace() {
        String input = "   ";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add(" ");
        expectedOutput.add("  ");
        expectedOutput.add("   ");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesMixedCharacters() {
        String input = "a1!b2@c3#";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("a");
        expectedOutput.add("a1");
        expectedOutput.add("a1!");
        expectedOutput.add("a1!b");
        expectedOutput.add("a1!b2");
        expectedOutput.add("a1!b2@");
        expectedOutput.add("a1!b2@c");
        expectedOutput.add("a1!b2@c3");
        expectedOutput.add("a1!b2@c3#");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesNullInput() {
        String input = null;
        List<String> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }

    @Test
    void testAllPrefixesLongInput() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("a");
        expectedOutput.add("ab");
        expectedOutput.add("abc");
        expectedOutput.add("abcd");
        expectedOutput.add("abcde");
        expectedOutput.add("abcdef");
        expectedOutput.add("abcdefg");
        expectedOutput.add("abcdefgh");
        expectedOutput.add("abcdefghi");
        expectedOutput.add("abcdefghij");
        expectedOutput.add("abcdefghijk");
        expectedOutput.add("abcdefghijkl");
        expectedOutput.add("abcdefghijklm");
        expectedOutput.add("abcdefghijklmn");
        expectedOutput.add("abcdefghijklmno");
        expectedOutput.add("abcdefghijklmnop");
        expectedOutput.add("abcdefghijklmnopq");
        expectedOutput.add("abcdefghijklmnopqr");
        expectedOutput.add("abcdefghijklmnopqrs");
        expectedOutput.add("abcdefghijklmnopqrst");
        expectedOutput.add("abcdefghijklmnopqrstu");
        expectedOutput.add("abcdefghijklmnopqrstuv");
        expectedOutput.add("abcdefghijklmnopqrstuvw");
        expectedOutput.add("abcdefghijklmnopqrstuvwx");
        expectedOutput.add("abcdefghijklmnopqrstuvwxy");
        expectedOutput.add("abcdefghijklmnopqrstuvwxyz");
        assertEquals(expectedOutput, AllPrefixes.allPrefixes(input));
    }
}