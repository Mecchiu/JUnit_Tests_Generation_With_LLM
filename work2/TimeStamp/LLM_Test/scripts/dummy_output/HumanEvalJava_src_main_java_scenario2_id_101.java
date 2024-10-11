// WordsStringTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
			// Test case 1: Empty string
    @Test
    void testWordsString1() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = WordsString.wordsString("");
        assertEquals(expected, actual);
    }

    // Test case 2: String with one word
    @Test
    void testWordsString2() {
        List<Object> expected = Arrays.asList("Hello");
        List<Object> actual = WordsString.wordsString("Hello");
        assertEquals(expected, actual);
    }

    // Test case 3: String with two words separated by a comma
    @Test
    void testWordsString3() {
        List<Object> expected = Arrays.asList("Hello", "World");
        List<Object> actual = WordsString.wordsString("Hello,World");
        assertEquals(expected, actual);
    }

    // Test case 4: String with two words separated by a space
    @Test
    void testWordsString4() {
        List<Object> expected = Arrays.asList("Hello", "World");
        List<Object> actual = WordsString.wordsString("Hello World");
        assertEquals(expected, actual);
    }

    // Test case 5: String with multiple words separated by a comma
    @Test
    void testWordsString5() {
        List<Object> expected = Arrays.asList("Hello", "World", "Java", "Programming");
        List<Object> actual = WordsString.wordsString("Hello,World,Java,Programming");
        assertEquals(expected, actual);
    }

    // Test case 6: String with multiple words separated by a space
    @Test
    void testWordsString6() {
        List<Object> expected = Arrays.asList("Hello", "World", "Java", "Programming");
        List<Object> actual = WordsString.wordsString("Hello World Java Programming");
        assertEquals(expected, actual);
    }

    // Test case 7: String with multiple words separated by a comma and a space
    @Test
    void testWordsString7() {
        List<Object> expected = Arrays.asList("Hello", "World", "Java", "Programming");
        List<Object> actual = WordsString.wordsString("Hello, World, Java, Programming");
        assertEquals(expected, actual);
    }

    // Test case 8: String with multiple words separated by multiple commas and spaces
    @Test
    void testWordsString8() {
        List<Object> expected = Arrays.asList("Hello", "World", "Java", "Programming");
        List<Object> actual = WordsString.wordsString("Hello,  World,  Java,  Programming");
        assertEquals(expected, actual);
    }

    // Test case 9: String with multiple words separated by multiple commas and spaces
    @Test
    void testWordsString9() {
        List<Object> expected = Arrays.asList("Hello", "World", "Java", "Programming");
        List<Object> actual = WordsString.wordsString("Hello,  World,  Java,  Programming");
        assertEquals(expected, actual);
    }

    // Test case 10: String with multiple words separated by multiple commas and spaces
    @Test
    void testWordsString10() {
        List<Object> expected = Arrays.asList("Hello", "World", "Java", "Programming");
        List<Object> actual = WordsString.wordsString("Hello,  World,  Java,  Programming");
        assertEquals(expected, actual);
    }
}