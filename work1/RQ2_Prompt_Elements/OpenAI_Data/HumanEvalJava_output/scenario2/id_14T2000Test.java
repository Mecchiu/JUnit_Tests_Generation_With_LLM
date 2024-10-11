// AllPrefixesTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {
	// Test case 1: Empty string
    @Test
    void testAllPrefixesEmptyString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("");
        assertEquals(expected, AllPrefixes.allPrefixes(""));
    }

    // Test case 2: String with one character
    @Test
    void testAllPrefixesOneCharacter() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        assertEquals(expected, AllPrefixes.allPrefixes("a"));
    }

    // Test case 3: String with two characters
    @Test
    void testAllPrefixesTwoCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        assertEquals(expected, AllPrefixes.allPrefixes("ab"));
    }

    // Test case 4: String with three characters
    @Test
    void testAllPrefixesThreeCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        assertEquals(expected, AllPrefixes.allPrefixes("abc"));
    }

    // Test case 5: String with four characters
    @Test
    void testAllPrefixesFourCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        assertEquals(expected, AllPrefixes.allPrefixes("abcd"));
    }

    // Test case 6: String with five characters
    @Test
    void testAllPrefixesFiveCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        assertEquals(expected, AllPrefixes.allPrefixes("abcde"));
    }

    // Test case 7: String with six characters
    @Test
    void testAllPrefixesSixCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        assertEquals(expected, AllPrefixes.allPrefixes("abcdef"));
    }

    // Test case 8: String with seven characters
    @Test
    void testAllPrefixesSevenCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        expected.add("abcdefg");
        assertEquals(expected, AllPrefixes.allPrefixes("abcdefg"));
    }

    // Test case 9: String with eight characters
    @Test
    void testAllPrefixesEightCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        expected.add("abcdefg");
        expected.add("abcdefgh");
        assertEquals(expected, AllPrefixes.allPrefixes("abcdefgh"));
    }

    // Test case 10: String with nine characters
    @Test
    void testAllPrefixesNineCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        expected.add("abcdefg");
        expected.add("abcdefgh");
        expected.add("abcdefghi");
        assertEquals(expected, AllPrefixes.allPrefixes("abcdefghi"));
    }
}
