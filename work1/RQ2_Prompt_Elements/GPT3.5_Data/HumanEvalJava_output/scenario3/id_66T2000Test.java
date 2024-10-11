// Digitsum.java
package scenario3;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * > digitSum("")
     * 0
     * > digitSum("abAB")
     * 131
     * > digitSum("abcCd")
     * 67
     * > digitSum("helloE")
     * 69
     * > digitSum("woArBld")
     * 131
     * > digitSum("aAaaaXa")
     * 153
     * > digitSum(" How are yOu?")
     * 151
     * > digitSum("You arE Very Smart")
     * 327
     */
    public static int digitSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                sum += (int) c;
            }
        }
        return sum;
    }
}

// DigitsumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
    @Test
    void testEmptyString() {
        assertEquals(0, Digitsum.digitSum(""));
    }

    @Test
    void testLowerCaseOnly() {
        assertEquals(0, Digitsum.digitSum("abcde"));
    }

    @Test
    void testUpperCaseOnly() {
        assertEquals(327, Digitsum.digitSum("YOU ARE VERY SMART"));
    }

    @Test
    void testMixedCase() {
        assertEquals(151, Digitsum.digitSum(" How are yOu?"));
    }

    @Test
    void testAllUpperCase() {
        assertEquals(131, Digitsum.digitSum("ABCD"));
    }

    @Test
    void testAllLowerCase() {
        assertEquals(0, Digitsum.digitSum("abcd"));
    }

    @Test
    void testMixedCaseWithNumbers() {
        assertEquals(153, Digitsum.digitSum("aAaaaXa"));
    }

    @Test
    void testMixedCaseWithSpecialCharacters() {
        assertEquals(67, Digitsum.digitSum("abcCd"));
    }

    @Test
    void testMixedCaseWithSpaces() {
        assertEquals(131, Digitsum.digitSum("woArBld"));
    }

    @Test
    void testMixedCaseWithSpacesAndNumbers() {
        assertEquals(131, Digitsum.digitSum("woArBld123"));
    }
}