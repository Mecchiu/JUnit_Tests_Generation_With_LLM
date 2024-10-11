// SameCharsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains one unit test case for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {
/**
		* Method of {@link SameCharsTest#assertSameChars(String, String, boolean)}.
		* Assert that two strings have the same characters.
		*/
    @Test
    void sameChars() {
        assertFalse(sameChars("abcd", "dddddddabce"));
        assertFalse(sameChars("abcd", "ddddddd"));
        assertFalse(sameChars("abcd", "d"));
        assertFalse(sameChars("abcd", "dddddddabc"));
        assertTrue(!sameChars("abcd", "dddddddabce"));
        assertTrue(!sameChars("abcd", "dddddd"));
        assertTrue(!sameChars("abcd", "d"));
        assertTrue(sameChars("abcd", "dddddddd"));
        assertTrue(!sameChars("abcd", "ddddddddd"));
        assertFalse(sameChars("abcd", "abdddd"));
        assertFalse(sameChars("abcd", "abdddddd"));
        assertFalse(sameChars("abcd", "dddddddddd"));
    }
	/**
	* Method of {@link SameCharsTest#assertSameChars(String, String, String)}.
	* Assert that two strings have the same text.
	*/
    @Test
    void sameCharsString() {
     assertFalse(sameChars("abcd", "dddddddabce"));
     assertFalse(sameChars("abcd", "ddddddd"));
     assertFalse(sameChars("abcd", "d"));
     assertTrue(sameChars("abcd", "dddddddabc"));
     assertFalse(sameChars("abcd", "ddddddddd"));
     assertTrue(!sameChars("abcd", "ddddddddd"));
     assertTrue(!sameChars("abcd", "abdddddd"));
     assertTrue(sameChars("abcd", "abddddddd"));
     assertTrue(sameChars("abcd", "dddddddddd"));
     assertFalse(sameChars("abcd", "abdddddddddd"));
     assertFalse(sameChars("abcd", "abddddd"));
     assertFalse(sameChars("abcd", "dddddd"));
     assertTrue(!sameChars("abcd", "d"));
     assertTrue(!sameChars("abcd", "dddddddd"));
     assertTrue(sameChars("abcd", "abdddddddd"));
     }

}

