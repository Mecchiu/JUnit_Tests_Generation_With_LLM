// IntToMiniRomanTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {
    
    @Test
    void testIntToMiniRomanWithZero() {
        assertEquals("", IntToMiniRoman.intToMiniRoman(0));
    }
    
    @Test
    void testIntToMiniRomanWithOne() {
        assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
    }
    
    @Test
    void testIntToMiniRomanWithFour() {
        assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
    }
    
    @Test
    void testIntToMiniRomanWithNine() {
        assertEquals("ix", IntToMiniRoman.intToMiniRoman(9));
    }
    
    @Test
    void testIntToMiniRomanWithTen() {
        assertEquals("x", IntToMiniRoman.intToMiniRoman(10));
    }
    
    @Test
    void testIntToMiniRomanWithForty() {
        assertEquals("xl", IntToMiniRoman.intToMiniRoman(40));
    }
    
    @Test
    void testIntToMiniRomanWithFifty() {
        assertEquals("l", IntToMiniRoman.intToMiniRoman(50));
    }
    
    @Test
    void testIntToMiniRomanWithNinety() {
        assertEquals("xc", IntToMiniRoman.intToMiniRoman(90));
    }
    
    @Test
    void testIntToMiniRomanWithOneHundred() {
        assertEquals("c", IntToMiniRoman.intToMiniRoman(100));
    }
    
    @Test
    void testIntToMiniRomanWithFourHundred() {
        assertEquals("cd", IntToMiniRoman.intToMiniRoman(400));
    }
    
    @Test
    void testIntToMiniRomanWithFiveHundred() {
        assertEquals("d", IntToMiniRoman.intToMiniRoman(500));
    }
    
    @Test
    void testIntToMiniRomanWithNineHundred() {
        assertEquals("cm", IntToMiniRoman.intToMiniRoman(900));
    }
    
    @Test
    void testIntToMiniRomanWithOneThousand() {
        assertEquals("m", IntToMiniRoman.intToMiniRoman(1000));
    }
}