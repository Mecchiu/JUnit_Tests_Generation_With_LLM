// GetClosestVowelTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
    
    @Test
    void testGetClosestVowelWithEmptyString() {
        String result = GetClosestVowel.getClosestVowel("");
        assertEquals("", result);
    }
    
    @Test
    void testGetClosestVowelWithNoVowels() {
        String result = GetClosestVowel.getClosestVowel("xyz");
        assertEquals("", result);
    }
    
    @Test
    void testGetClosestVowelWithOneVowel() {
        String result = GetClosestVowel.getClosestVowel("hello");
        assertEquals("e", result);
    }
    
    @Test
    void testGetClosestVowelWithTwoVowels() {
        String result = GetClosestVowel.getClosestVowel("world");
        assertEquals("o", result);
    }
    
    @Test
    void testGetClosestVowelWithThreeVowels() {
        String result = GetClosestVowel.getClosestVowel("apple");
        assertEquals("e", result);
    }
    
    @Test
    void testGetClosestVowelWithFourVowels() {
        String result = GetClosestVowel.getClosestVowel("banana");
        assertEquals("a", result);
    }
    
    @Test
    void testGetClosestVowelWithFiveVowels() {
        String result = GetClosestVowel.getClosestVowel("grapefruit");
        assertEquals("e", result);
    }
    
    @Test
    void testGetClosestVowelWithUpperCaseVowels() {
        String result = GetClosestVowel.getClosestVowel("HELLO");
        assertEquals("E", result);
    }
    
    @Test
    void testGetClosestVowelWithMixedCaseVowels() {
        String result = GetClosestVowel.getClosestVowel("HeLLo");
        assertEquals("E", result);
    }
    
    @Test
    void testGetClosestVowelWithVowelsAtBeginningAndEnd() {
        String result = GetClosestVowel.getClosestVowel("applepie");
        assertEquals("e", result);
    }
}