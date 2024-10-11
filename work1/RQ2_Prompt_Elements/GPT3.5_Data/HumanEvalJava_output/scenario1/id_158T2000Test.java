import java.util.ArrayList;
import java.util.Arrays;

class FindMaxTest {

    @Test
    void testFindMaxWithNullList() {
        assertNull(FindMax.findMax(null));
    }

    @Test
    void testFindMaxWithEmptyList() {
        assertNull(FindMax.findMax(new ArrayList<>()));
    }

    @Test
    void testFindMaxWithOneWord() {
        assertEquals("hello", FindMax.findMax(Arrays.asList("hello")));
    }

    @Test
    void testFindMaxWithTwoWords() {
        assertEquals("world", FindMax.findMax(Arrays.asList("hello", "world")));
    }

    @Test
    void testFindMaxWithWordsOfSameLengthAndUniqueChars() {
        assertEquals("world", FindMax.findMax(Arrays.asList("hello", "world", "java")));
    }

    @Test
    void testFindMaxWithWordsOfSameLengthAndSameChars() {
        assertEquals("hello", FindMax.findMax(Arrays.asList("hello", "jello", "mello")));
    }

    @Test
    void testFindMaxWithWordsOfDifferentLengthAndUniqueChars() {
        assertEquals("programming", FindMax.findMax(Arrays.asList("hello", "world", "java", "programming")));
    }

    @Test
    void testFindMaxWithWordsOfDifferentLengthAndSameChars() {
        assertEquals("hello", FindMax.findMax(Arrays.asList("hello", "jello", "mello", "yellow")));
    }

    @Test
    void testFindMaxWithWordsContainingSpaces() {
        assertEquals("hello world", FindMax.findMax(Arrays.asList("hello world", "world hello")));
    }

    @Test
    void testFindMaxWithWordsContainingSpecialCharacters() {
        assertEquals("hello-world", FindMax.findMax(Arrays.asList("hello-world", "world-hello")));
    }
}