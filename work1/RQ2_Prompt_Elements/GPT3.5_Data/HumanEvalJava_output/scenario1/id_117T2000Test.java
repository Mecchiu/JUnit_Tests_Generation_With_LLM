// SelectWordsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

    @Test
    void testSelectWordsWithEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("", 2);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNoWordsWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("hello world", 4);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithOneWordWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        expected.add("world");
        List<Object> actual = SelectWords.selectWords("hello world", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMultipleWordsWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        expected.add("world");
        expected.add("people");
        List<Object> actual = SelectWords.selectWords("hello world how are you people doing today", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithAllWordsWithNConsonants() {
        List<Object> expected = new ArrayList<>();
        expected.add("world");
        expected.add("people");
        expected.add("doing");
        List<Object> actual = SelectWords.selectWords("world people doing", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithOneWordWithNConsonantsCaseInsensitive() {
        List<Object> expected = new ArrayList<>();
        expected.add("WORLD");
        List<Object> actual = SelectWords.selectWords("hello WORLD", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithMultipleWordsWithNConsonantsCaseInsensitive() {
        List<Object> expected = new ArrayList<>();
        expected.add("WORLD");
        expected.add("PEOPLE");
        List<Object> actual = SelectWords.selectWords("hello WORLD how are you PEOPLE doing today", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithAllWordsWithNConsonantsCaseInsensitive() {
        List<Object> expected = new ArrayList<>();
        expected.add("WORLD");
        expected.add("PEOPLE");
        expected.add("DOING");
        List<Object> actual = SelectWords.selectWords("WORLD PEOPLE DOING", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNConsonantsGreaterThanWordLength() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords("hello world", 20);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNConsonantsEqualToWordLength() {
        List<Object> expected = new ArrayList<>();
        expected.add("hello");
        List<Object> actual = SelectWords.selectWords("hello world", 5);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithNConsonantsLessThanWordLength() {
        List<Object> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("world");
        List<Object> actual = SelectWords.selectWords("hello world", 3);
        assertEquals(expected, actual);
    }
}