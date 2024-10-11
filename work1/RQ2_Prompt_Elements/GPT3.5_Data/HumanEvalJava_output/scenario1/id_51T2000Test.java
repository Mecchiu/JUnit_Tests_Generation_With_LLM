// RemoveVowelsTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
    
    @Test
    void testRemoveVowels_emptyString() {
        String result = RemoveVowels.removeVowels("");
        assertEquals("", result);
    }
    
    @Test
    void testRemoveVowels_noVowels() {
        String result = RemoveVowels.removeVowels("qwrtypsdfghjklzxcvbnm");
        assertEquals("qwrtypsdfghjklzxcvbnm", result);
    }
    
    @Test
    void testRemoveVowels_onlyVowels() {
        String result = RemoveVowels.removeVowels("aeiouAEIOU");
        assertEquals("", result);
    }
    
    @Test
    void testRemoveVowels_mixedVowelsAndConsonants() {
        String result = RemoveVowels.removeVowels("Hello World!");
        assertEquals("Hll Wrld!", result);
    }
    
    @Test
    void testRemoveVowels_allVowelsAndConsonants() {
        String result = RemoveVowels.removeVowels("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("bcdfghjklmnpqrstvwxyzbcdfghjklmnpqrstvwxyz", result);
    }
    
    @Test
    void testRemoveVowels_onlyOneVowel() {
        String result = RemoveVowels.removeVowels("a");
        assertEquals("", result);
    }
    
    @Test
    void testRemoveVowels_onlyOneConsonant() {
        String result = RemoveVowels.removeVowels("b");
        assertEquals("b", result);
    }
    
    @Test
    void testRemoveVowels_numbersAndSpecialCharacters() {
        String result = RemoveVowels.removeVowels("123!@#$%^&*()");
        assertEquals("123!@#$%^&*()", result);
    }
    
    @Test
    void testRemoveVowels_whitespace() {
        String result = RemoveVowels.removeVowels("   ");
        assertEquals("   ", result);
    }
    
    @Test
    void testRemoveVowels_nullString() {
        assertThrows(NullPointerException.class, () -> {
            RemoveVowels.removeVowels(null);
        });
    }
}