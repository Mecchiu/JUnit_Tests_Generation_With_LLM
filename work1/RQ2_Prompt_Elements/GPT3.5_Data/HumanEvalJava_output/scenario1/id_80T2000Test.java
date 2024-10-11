// Here's the source code for the IsHappyTest class:

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsHappy}.
 * It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
 */
class IsHappyTest {

    @Test
    void testIsHappyWithEmptyString() {
        assertFalse(IsHappy.isHappy(""));
    }

    @Test
    void testIsHappyWithOneCharacterString() {
        assertFalse(IsHappy.isHappy("a"));
    }

    @Test
    void testIsHappyWithTwoCharacterString() {
        assertFalse(IsHappy.isHappy("ab"));
    }

    @Test
    void testIsHappyWithThreeCharacterString() {
        assertFalse(IsHappy.isHappy("aba"));
        assertFalse(IsHappy.isHappy("abb"));
        assertFalse(IsHappy.isHappy("baa"));
    }

    @Test
    void testIsHappyWithFourCharacterString() {
        assertTrue(IsHappy.isHappy("abcd"));
        assertFalse(IsHappy.isHappy("abca"));
        assertFalse(IsHappy.isHappy("abbc"));
        assertFalse(IsHappy.isHappy("abcc"));
        assertFalse(IsHappy.isHappy("acbc"));
        assertFalse(IsHappy.isHappy("accc"));
        assertFalse(IsHappy.isHappy("baaa"));
        assertFalse(IsHappy.isHappy("babc"));
        assertFalse(IsHappy.isHappy("bacc"));
        assertFalse(IsHappy.isHappy("bbcc"));
    }

    @Test
    void testIsHappyWithFiveCharacterString() {
        assertTrue(IsHappy.isHappy("abcde"));
        assertFalse(IsHappy.isHappy("abcda"));
        assertFalse(IsHappy.isHappy("abcdb"));
        assertFalse(IsHappy.isHappy("abced"));
        assertFalse(IsHappy.isHappy("abcee"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
        assertFalse(IsHappy.isHappy("abcec"));
        assertFalse(IsHappy.isHappy("abcfb"));
        assertFalse(IsHappy.isHappy("abccf"));
        assertFalse(IsHappy.isHappy("abccd"));
        assertFalse(IsHappy.isHappy("abccb"));
        assertFalse(IsHappy.isHappy("abccc"));
        assertFalse(IsHappy.isHappy("abcdc"));
        assertFalse(IsHappy.isHappy("abceb"));
       