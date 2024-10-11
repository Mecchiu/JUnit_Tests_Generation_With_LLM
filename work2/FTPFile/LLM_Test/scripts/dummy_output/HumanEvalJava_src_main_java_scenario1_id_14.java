// AllPrefixesTest.java
package scenario1;

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
        List<Object> actual = AllPrefixes.allPrefixes("");
        assertEquals(expected, actual);
    }

    // Test case 2: One character string
    @Test
    void testAllPrefixesOneCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        List<Object> actual = AllPrefixes.allPrefixes("a");
        assertEquals(expected, actual);
    }

    // Test case 3: Two character string
    @Test
    void testAllPrefixesTwoCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        List<Object> actual = AllPrefixes.allPrefixes("ab");
        assertEquals(expected, actual);
    }

    // Test case 4: Three character string
    @Test
    void testAllPrefixesThreeCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        List<Object> actual = AllPrefixes.allPrefixes("abc");
        assertEquals(expected, actual);
    }

    // Test case 5: Four character string
    @Test
    void testAllPrefixesFourCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        List<Object> actual = AllPrefixes.allPrefixes("abcd");
        assertEquals(expected, actual);
    }

    // Test case 6: Five character string
    @Test
    void testAllPrefixesFiveCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        List<Object> actual = AllPrefixes.allPrefixes("abcde");
        assertEquals(expected, actual);
    }

    // Test case 7: Six character string
    @Test
    void testAllPrefixesSixCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        List<Object> actual = AllPrefixes.allPrefixes("abcdef");
        assertEquals(expected, actual);
    }

    // Test case 8: Seven character string
    @Test
    void testAllPrefixesSevenCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        expected.add("abcdefg");
        List<Object> actual = AllPrefixes.allPrefixes("abcdefg");
        assertEquals(expected, actual);
    }

    // Test case 9: Eight character string
    @Test
    void testAllPrefixesEightCharacterString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        expected.add("abcdefg");
        expected.add("abcdefgh");
        List<Object> actual = AllPrefixes.allPrefixes("abcdefgh");
        assertEquals(expected, actual);
    }

    // Test case 10: Nine character string
    @Test
    void testAllPrefixesNineCharacterString() {
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
        List<Object> actual = AllPrefixes.allPrefixes("abcdefghi");
        assertEquals(expected, actual);
    }
}