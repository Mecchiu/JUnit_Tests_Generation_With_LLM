// GetClosestVowelTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
	// Test case 1: word = "apple"
    @Test
    void testGetClosestVowel1() {
        String word = "apple";
        String expected = "e";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 2: word = "banana"
    @Test
    void testGetClosestVowel2() {
        String word = "banana";
        String expected = "a";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 3: word = "cherry"
    @Test
    void testGetClosestVowel3() {
        String word = "cherry";
        String expected = "e";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 4: word = "durian"
    @Test
    void testGetClosestVowel4() {
        String word = "durian";
        String expected = "u";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 5: word = "eggplant"
    @Test
    void testGetClosestVowel5() {
        String word = "eggplant";
        String expected = "a";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 6: word = "fig"
    @Test
    void testGetClosestVowel6() {
        String word = "fig";
        String expected = "i";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 7: word = "grape"
    @Test
    void testGetClosestVowel7() {
        String word = "grape";
        String expected = "a";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 8: word = "honeydew"
    @Test
    void testGetClosestVowel8() {
        String word = "honeydew";
        String expected = "e";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 9: word = "ice cream"
    @Test
    void testGetClosestVowel9() {
        String word = "ice cream";
        String expected = "e";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }

    // Test case 10: word = "jujube"
    @Test
    void testGetClosestVowel10() {
        String word = "jujube";
        String expected = "u";
        String actual = GetClosestVowel.getClosestVowel(word);
        assertEquals(expected, actual);
    }
}
