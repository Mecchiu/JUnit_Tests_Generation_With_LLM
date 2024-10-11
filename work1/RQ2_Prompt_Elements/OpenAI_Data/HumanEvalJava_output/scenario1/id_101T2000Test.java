// WordsStringTest.java
package scenario1;

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
        String s = "";
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 2: String with one word
    @Test
    void testWordsString2() {
        String s = "Hello";
        List<Object> expected = Arrays.asList("Hello");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 3: String with two words
    @Test
    void testWordsString3() {
        String s = "Hello,World";
        List<Object> expected = Arrays.asList("Hello", "World");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 4: String with multiple words
    @Test
    void testWordsString4() {
        String s = "Hello,World,Java";
        List<Object> expected = Arrays.asList("Hello", "World", "Java");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 5: String with multiple words and spaces
    @Test
    void testWordsString5() {
        String s = "Hello, World, Java";
        List<Object> expected = Arrays.asList("Hello", "World", "Java");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 6: String with multiple words and commas
    @Test
    void testWordsString6() {
        String s = "Hello,World,Java,";
        List<Object> expected = Arrays.asList("Hello", "World", "Java");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 7: String with multiple words and spaces and commas
    @Test
    void testWordsString7() {
        String s = "Hello, World, Java, ";
        List<Object> expected = Arrays.asList("Hello", "World", "Java");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 8: String with multiple words and spaces and commas
    @Test
    void testWordsString8() {
        String s = "Hello, World, Java, ,";
        List<Object> expected = Arrays.asList("Hello", "World", "Java");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 9: String with multiple words and spaces and commas
    @Test
    void testWordsString9() {
        String s = "Hello, World, Java, , ,";
        List<Object> expected = Arrays.asList("Hello", "World", "Java");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
			// Test case 10: String with multiple words and spaces and commas
    @Test
    void testWordsString10() {
        String s = "Hello, World, Java, , , ,";
        List<Object> expected = Arrays.asList("Hello", "World", "Java");
        List<Object> actual = WordsString.wordsString(s);
        assertEquals(expected, actual);
    }
}
