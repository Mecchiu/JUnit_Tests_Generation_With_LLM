// GetClosestVowelTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GetClosestVowel}.
 * It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
 */
class GetClosestVowelTest {

    @Test
    void testGetClosestVowel1() {
        String word = "hello";
        String expected = "e";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel2() {
        String word = "world";
        String expected = "o";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel3() {
        String word = "apple";
        String expected = "";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel4() {
        String word = "banana";
        String expected = "a";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel5() {
        String word = "computer";
        String expected = "u";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel6() {
        String word = "programming";
        String expected = "a";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel7() {
        String word = "Java";
        String expected = "";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel8() {
        String word = "Python";
        String expected = "o";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel9() {
        String word = "Ruby";
        String expected = "";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    @Test
    void testGetClosestVowel10() {
        String word = "JavaScript";
        String expected = "a";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }
}