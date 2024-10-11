// HowManyTimes.java
package scenario1;

class HowManyTimes {

    public static int howManyTimes(String string, String substring) {
        int count = 0;
        int index = 0;
        while (index < string.length()) {
            index = string.indexOf(substring, index);
            if (index == -1) {
                break;
            }
            count++;
            index++;
        }
        return count;
    }
}

// HowManyTimesTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
    
    @Test
    void testEmptyString() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
    }
    
    @Test
    void testEmptySubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("abc", ""));
    }
    
    @Test
    void testSubstringNotFound() {
        assertEquals(0, HowManyTimes.howManyTimes("abc", "d"));
    }
    
    @Test
    void testSubstringFoundOnce() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "a"));
    }
    
    @Test
    void testSubstringFoundMultipleTimes() {
        assertEquals(3, HowManyTimes.howManyTimes("abcaaaabc", "a"));
    }
    
    @Test
    void testSubstringAtBeginning() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "a"));
    }
    
    @Test
    void testSubstringAtEnd() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "c"));
    }
    
    @Test
    void testSubstringSameAsInputString() {
        assertEquals(1, HowManyTimes.howManyTimes("abc", "abc"));
    }
    
    @Test
    void testSubstringSameAsInputStringMultipleTimes() {
        assertEquals(2, HowManyTimes.howManyTimes("abcabc", "abc"));
    }
    
    @Test
    void testSubstringOverlapping() {
        assertEquals(2, HowManyTimes.howManyTimes("ababab", "aba"));
    }
}