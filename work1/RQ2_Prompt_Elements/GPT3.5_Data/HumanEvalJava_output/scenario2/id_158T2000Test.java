import java.util.Arrays;
import java.util.List;

class FindMaxTest {

    @Test
    void testFindMaxWithNullList() {
        assertNull(FindMax.findMax(null));
    }

    @Test
    void testFindMaxWithEmptyList() {
        assertNull(FindMax.findMax(Arrays.asList()));
    }

    @Test
    void testFindMaxWithOneWord() {
        List<String> words = Arrays.asList("hello");
        assertEquals("hello", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWords() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        assertEquals("programming", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndSameUniqueChars() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "python");
        assertEquals("programming", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndSameUniqueCharsAndSameLexOrder() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "python", "pear");
        assertEquals("pear", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndSameUniqueCharsAndDifferentLexOrder() {
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "pear", "python");
        assertEquals("pear", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndAllSameUniqueChars() {
        List<String> words = Arrays.asList("abc", "def", "ghi", "jkl");
        assertEquals("abc", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndAllDifferentUniqueChars() {
        List<String> words = Arrays.asList("a", "bc", "def", "ghij");
        assertEquals("ghij", FindMax.findMax(words));
    }

    @Test
    void testFindMaxWithMultipleWordsAndEmptyString() {
        List<String> words = Arrays.asList("hello", "", "world", "java", "programming");
        assertEquals("programming", FindMax.findMax(words));
    }
}