// CountDistinctCharactersTest.java
package scenario1;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
			// Test case 1: Test with an empty string
    @Test
    void testCountDistinctCharactersWithEmptyString() {
        int result = CountDistinctCharacters.countDistinctCharacters("");
        assertEquals(0, result);
    }

    // Test case 2: Test with a string containing only one character
    @Test
    void testCountDistinctCharactersWithOneCharacter() {
        int result = CountDistinctCharacters.countDistinctCharacters("a");
        assertEquals(1, result);
    }

    // Test case 3: Test with a string containing only one character (uppercase)
    @Test
    void testCountDistinctCharactersWithOneCharacterUpperCase() {
        int result = CountDistinctCharacters.countDistinctCharacters("A");
        assertEquals(1, result);
    }

    // Test case 4: Test with a string containing only one character (special character)
    @Test
    void testCountDistinctCharactersWithOneCharacterSpecialCharacter() {
        int result = CountDistinctCharacters.countDistinctCharacters("!");
        assertEquals(1, result);
    }

    // Test case 5: Test with a string containing only one character (digit)
    @Test
    void testCountDistinctCharactersWithOneCharacterDigit() {
        int result = CountDistinctCharacters.countDistinctCharacters("1");
        assertEquals(1, result);
    }

    // Test case 6: Test with a string containing only one character (space)
    @Test
    void testCountDistinctCharactersWithOneCharacterSpace() {
        int result = CountDistinctCharacters.countDistinctCharacters(" ");
        assertEquals(1, result);
    }

    // Test case 7: Test with a string containing only one character (tab)
    @Test
    void testCountDistinctCharactersWithOneCharacterTab() {
        int result = CountDistinctCharacters.countDistinctCharacters("\t");
        assertEquals(1, result);
    }

    // Test case 8: Test with a string containing only one character (newline)
    @Test
    void testCountDistinctCharactersWithOneCharacterNewline() {
        int result = CountDistinctCharacters.countDistinctCharacters("\n");
        assertEquals(1, result);
    }

    // Test case 9: Test with a string containing only one character (carriage return)
    @Test
    void testCountDistinctCharactersWithOneCharacterCarriageReturn() {
        int result = CountDistinctCharacters.countDistinctCharacters("\r");
        assertEquals(1, result);
    }

    // Test case 10: Test with a string containing only one character (whitespace)
    @Test
    void testCountDistinctCharactersWithOneCharacterWhitespace() {
        int result = CountDistinctCharacters.countDistinctCharacters(" \t\n\r");
        assertEquals(1, result);
    }
}