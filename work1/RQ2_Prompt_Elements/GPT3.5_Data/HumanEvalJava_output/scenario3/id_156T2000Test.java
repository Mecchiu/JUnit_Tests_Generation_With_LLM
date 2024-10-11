// IntToMiniRoman.java
package scenario3;

class IntToMiniRoman {

    /**
     * * Given a positive integer, obtain its roman numeral equivalent as a string,
     * and return it in lowercase.
     * Restrictions: 1 <= num <= 1000
     *
     * Examples:
     * >>> intToMiniRoman(19) == 'xix'
     * >>> intToMiniRoman(152) == 'clii'
     * >>> intToMiniRoman(426) == 'cdxxvi'
     *
     * > intToMiniRoman(19)
     * "xix"
     * > intToMiniRoman(152)
     * "clii"
     * > intToMiniRoman(251)
     * "ccli"
     * > intToMiniRoman(426)
     * "cdxxvi"
     * > intToMiniRoman(500)
     * "d"
     * > intToMiniRoman(1)
     * "i"
     * > intToMiniRoman(4)
     * "iv"
     * > intToMiniRoman(43)
     * "xliii"
     * > intToMiniRoman(90)
     * "xc"
     * > intToMiniRoman(94)
     * "xciv"
     * > intToMiniRoman(532)
     * "dxxxii"
     * > intToMiniRoman(900)
     * "cm"
     * > intToMiniRoman(994)
     * "cmxciv"
     * > intToMiniRoman(1000)
     * "m"
     */
    public static String intToMiniRoman(int number) {
        String[] romanNumerals = {"m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(romanNumerals[i]);
                number -= values[i];
            }
        }
        return result.toString();
    }
}

// IntToMiniRomanTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {
    @Test
    void testIntToMiniRoman() {
        assertEquals("xix", IntToMiniRoman.intToMiniRoman(19));
        assertEquals("clii", IntToMiniRoman.intToMiniRoman(152));
        assertEquals("ccli", IntToMiniRoman.intToMiniRoman(251));
        assertEquals("cdxxvi", IntToMiniRoman.intToMiniRoman(426));
        assertEquals("d", IntToMiniRoman.intToMiniRoman(500));
        assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
        assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
        assertEquals("xliii", IntToMiniRoman.intToMiniRoman(43));
        assertEquals("xc", IntToMiniRoman.intToMiniRoman(90));
        assertEquals("xciv", IntToMiniRoman.intToMiniRoman(94));
        assertEquals("dxxxii", IntToMiniRoman.intToMiniRoman(532));
        assertEquals("cm", IntToMiniRoman.intToMiniRoman(900));
        assertEquals("cmxciv", IntToMiniRoman.intToMiniRoman(994));
        assertEquals("m", IntToMiniRoman.intToMiniRoman(1000));
    }
}