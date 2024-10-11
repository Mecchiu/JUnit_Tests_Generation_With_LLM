// IntToMiniRomanTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {

	@Test
	void testIntToMiniRoman() {
		assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
		assertEquals("ii", IntToMiniRoman.intToMiniRoman(2));
		assertEquals("iii", IntToMiniRoman.intToMiniRoman(3));
		assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
		assertEquals("v", IntToMiniRoman.intToMiniRoman(5));
		assertEquals("vi", IntToMiniRoman.intToMiniRoman(6));
		assertEquals("vii", IntToMiniRoman.intToMiniRoman(7));
		assertEquals("viii", IntToMiniRoman.intToMiniRoman(8));
		assertEquals("ix", IntToMiniRoman.intToMiniRoman(9));
		assertEquals("x", IntToMiniRoman.intToMiniRoman(10));
	}
}

// MiniRomanToInt.java
package scenario2;

class MiniRomanToInt {

    /**
     * Given a string representing a roman numeral, return its integer equivalent.
     * The string is guaranteed to be in lowercase.
     * Restrictions: 1 <= num <= 1000
     */
    public static int miniRomanToInt(String roman) {
        int result = 0;
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// MiniRomanToIntTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MiniRomanToInt}.
* It contains ten unit test cases for the {@link MiniRomanToInt#miniRomanToInt(String)} method.
*/
class MiniRomanToIntTest {
		
	@Test
	void testMiniRomanToInt() {
		assertEquals(1, MiniRomanToInt.miniRomanToInt("i"));
		assertEquals(2, MiniRomanToInt.miniRomanToInt("ii"));
		assertEquals(3, MiniRomanToInt.miniRomanToInt("iii"));
		assertEquals(4, MiniRomanToInt.miniRomanToInt("iv"));
		assertEquals(5, MiniRomanToInt.miniRomanToInt("v"));
		assertEquals(6, MiniRomanToInt.miniRomanToInt("vi"));
		assertEquals(7, MiniRomanToInt.miniRomanToInt("vii"));
		assertEquals(8, MiniRomanToInt.miniRomanToInt("viii"));
		assertEquals(9, MiniRomanToInt.miniRomanToInt("ix"));
		assertEquals(10, MiniRomanToInt.miniRomanToInt("x"));
	}
}

// RomanToInt.java
package scenario2;

class RomanToInt {

    /**
     * Given a string representing a roman numeral, return its integer equivalent.
     * The string is guaranteed to be in uppercase.
     * Restrictions: 1 <= num <= 3999
     */
    public static int romanToInt(String roman) {
        int result = 0;
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// RomanToIntTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RomanToInt}.
* It contains ten unit test cases for the {@link RomanToInt#romanToInt(String)} method.
*/
class RomanToIntTest {
		
	@Test
	void testRomanToInt() {
		assertEquals(1, RomanToInt.romanToInt("I"));
		assertEquals(2, RomanToInt.romanToInt("II"));
		assertEquals(3, RomanToInt.romanToInt("III"));
		assertEquals(4, RomanToInt.romanToInt("IV"));
		assertEquals(5, RomanToInt.romanToInt("V"));
		assertEquals(6, RomanToInt.romanToInt("VI"));
		assertEquals(7, RomanToInt.romanToInt("VII"));
		assertEquals(8, RomanToInt.romanToInt("VIII"));
		assertEquals(9, RomanToInt.romanToInt("IX"));
		assertEquals(10, RomanToInt.romanToInt("X"));
	}
}

// IntToRoman.java
package scenario2;

class IntToRoman {

    /**
     * Given a positive integer, obtain its roman numeral equivalent as a string,
     * and return it in uppercase.
     * Restrictions: 1 <= num <= 3999
     */
    public static String intToRoman(int number) {
        String result = "";
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result += symbols[i];
            }
        }
        return result;
    }
}

// IntToRomanTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToRoman}.
* It contains ten unit test cases for the {@link IntToRoman#intToRoman(int)} method.
*/
class IntToRomanTest {
		
	@Test
	void testIntToRoman() {
		assertEquals("I", IntToRoman.intToRoman(1));
		assertEquals("II", IntToRoman.intToRoman(2));
		assertEquals("III", IntToRoman.intToRoman(3));
		assertEquals("IV", IntToRoman.intToRoman(4));
		assertEquals("V", IntToRoman.intToRoman(5));
		assertEquals("VI", IntToRoman.intToRoman(6));
		assertEquals("VII", IntToRoman.intToRoman(7));
		assertEquals("VIII", IntToRoman.intToRoman(8));
		assertEquals("IX", IntToRoman.intToRoman(9));
		assertEquals("X", IntToRoman.intToRoman(10));
	}
}

// RomanToMiniRoman.java
package scenario2;

class RomanToMiniRoman {

    /**
     * Given a string representing a roman numeral, return its equivalent in lowercase.
     * The string is guaranteed to be in uppercase.
     * Restrictions: 1 <= num <= 3999
     */
    public static String romanToMiniRoman(String roman) {
        return roman.toLowerCase();
    }
}

// RomanToMiniRomanTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RomanToMiniRoman}.
* It contains ten unit test cases for the {@link RomanToMiniRoman#romanToMiniRoman(String)} method.
*/
class RomanToMiniRomanTest {
		
	@Test
	void testRomanToMiniRoman() {
		assertEquals("i", RomanToMiniRoman.romanToMiniRoman("I"));
		assertEquals("ii", RomanToMiniRoman.romanToMiniRoman("II"));
		assertEquals("iii", RomanToMiniRoman.romanToMiniRoman("III"));
		assertEquals("iv", RomanToMiniRoman.romanToMiniRoman("IV"));
		assertEquals("v", RomanToMiniRoman.romanToMiniRoman("V"));
		assertEquals("vi", RomanToMiniRoman.romanToMiniRoman("VI"));
		assertEquals("vii", RomanToMiniRoman.romanToMiniRoman("VII"));
		assertEquals("viii", RomanToMiniRoman.romanToMiniRoman("VIII"));
		assertEquals("ix", RomanToMiniRoman.romanToMiniRoman("IX"));
		assertEquals("x", RomanToMiniRoman.romanToMiniRoman("X"));
	}
}

// MiniRomanToRoman.java
package scenario2;

class MiniRomanToRoman {

    /**
     * Given a string representing a roman numeral, return its equivalent in uppercase.
     * The string is guaranteed to be in lowercase.
     * Restrictions: 1 <= num <= 1000
     */
    public static String miniRomanToRoman(String roman) {
        return roman.toUpperCase();
    }
}

// MiniRomanToRomanTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MiniRomanToRoman}.
* It contains ten unit test cases for the {@link MiniRomanToRoman#miniRomanToRoman(String)} method.
*/
class MiniRomanToRomanTest {
		
	@Test
	void testMiniRomanToRoman() {
		assertEquals("I", MiniRomanToRoman.miniRomanToRoman("i"));
		assertEquals("II", MiniRomanToRoman.miniRomanToRoman("ii"));
		assertEquals("III", MiniRomanToRoman.miniRomanToRoman("iii"));
		assertEquals("IV", MiniRomanToRoman.miniRomanToRoman("iv"));
		assertEquals("V", MiniRomanToRoman.miniRomanToRoman("v"));
		assertEquals("VI", MiniRomanToRoman.miniRomanToRoman("vi"));
		assertEquals("VII", MiniRomanToRoman.miniRomanToRoman("vii"));
		assertEquals("VIII", MiniRomanToRoman.miniRomanToRoman("viii"));
		assertEquals("IX", MiniRomanToRoman.miniRomanToRoman("ix"));
		assertEquals("X", MiniRomanToRoman.miniRomanToRoman("x"));
	}
}

// MiniRomanToInt.java
package scenario2;

class MiniRomanToInt {

    /**
     * Given a string representing a roman numeral, return its integer equivalent.
     * The string is guaranteed to be in lowercase.
     * Restrictions: 1 <= num <= 1000
     */
    public static int miniRomanToInt(String roman) {
        int result = 0;
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// MiniRomanToIntTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MiniRomanToInt}.
* It contains ten unit test cases for the {@link MiniRomanToInt#miniRomanToInt(String)} method.
*/
class MiniRomanToIntTest {
		
	@Test
	void testMiniRomanToInt() {
		assertEquals(1, MiniRomanToInt.miniRomanToInt("i"));
		assertEquals(2, MiniRomanToInt.miniRomanToInt("ii"));
		assertEquals(3, MiniRomanToInt.miniRomanToInt("iii"));
		assertEquals(4, MiniRomanToInt.miniRomanToInt("iv"));
		assertEquals(5, MiniRomanToInt.miniRomanToInt("v"));
		assertEquals(6, MiniRomanToInt.miniRomanToInt("vi"));
		assertEquals(7, MiniRomanToInt.miniRomanToInt("vii"));
		assertEquals(8, MiniRomanToInt.miniRomanToInt("viii"));
		assertEquals(9, MiniRomanToInt.miniRomanToInt("ix"));
		assertEquals(10, MiniRomanToInt.miniRomanToInt("x"));
	}
}

// IntToMiniRoman.java
package scenario2;

class IntToMiniRoman {

    /**
     * * Given a positive integer, obtain its roman numeral equivalent as a string,
     * and return it in lowercase.
     * Restrictions: 1 <= num <= 1000
     */
    public static String intToMiniRoman(int number) {
        String result = "";
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result += symbols[i];
            }
        }
        return result;
    }
}

// IntToMiniRomanTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {
		
	@Test
	void testIntToMiniRoman() {
		assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
		assertEquals("ii", IntToMiniRoman.intToMiniRoman(2));
		assertEquals("iii", IntToMiniRoman.intToMiniRoman(3));
		assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
		assertEquals("v", IntToMiniRoman.intToMiniRoman(5));
		assertEquals("vi", IntToMiniRoman.intToMiniRoman(6));
		assertEquals("vii", IntToMiniRoman.intToMiniRoman(7));
		assertEquals("viii", IntToMiniRoman.intToMiniRoman(8));
		assertEquals("ix", IntToMiniRoman.intToMiniRoman(9));
		assertEquals("x", IntToMiniRoman.intToMiniRoman(10));
	}
