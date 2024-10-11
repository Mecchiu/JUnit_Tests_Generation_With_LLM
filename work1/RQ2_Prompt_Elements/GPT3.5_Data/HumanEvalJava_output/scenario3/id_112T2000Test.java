// ReverseDelete.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class ReverseDelete {

    /**
     * Task
     * We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
     * then check if the result string is palindrome.
     * A string is called palindrome if it reads the same backward as forward.
     * You should return a tuple containing the result string and True/False for the check.
     * Example
     * For s = "abcde", c = "ae", the result should be ('bcd',False)
     * For s = "abcdef", c = "b"  the result should be ('acdef',False)
     * For s = "abcdedcba", c = "ab", the result should be ('cdedc',True)
     *
     * > reverseDelete("abcde", "ae")
     * ["bcd", false]
     * > reverseDelete("abcdef", "b")
     * ["acdef", false]
     * > reverseDelete("abcdedcba", "ab")
     * ["cdedc", true]
     * > reverseDelete("dwik", "w")
     * ["dik", false]
     * > reverseDelete("a", "a")
     * ["", true]
     * > reverseDelete("abcdedcba", "")
     * ["abcdedcba", true]
     * > reverseDelete("abcdedcba", "v")
     * ["abcdedcba", true]
     * > reverseDelete("vabba", "v")
     * ["abba", true]
     * > reverseDelete("mamma", "mia")
     * ["", true]
     */
    public static List<Object> reverseDelete(String s, String c) {
        List<Object> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (c.indexOf(s.charAt(i)) == -1) {
                sb.append(s.charAt(i));
            }
        }
        String newString = sb.toString();
        boolean isPalindrome = true;
        for (int i = 0; i < newString.length() / 2; i++) {
            if (newString.charAt(i) != newString.charAt(newString.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        result.add(newString);
        result.add(isPalindrome);
        return result;
    }
}

// ReverseDeleteTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {
    @Test
    void test1() {
        List<Object> result = ReverseDelete.reverseDelete("abcde", "ae");
        assertEquals("bcd", result.get(0));
        assertFalse((boolean) result.get(1));
    }

    @Test
    void test2() {
        List<Object> result = ReverseDelete.reverseDelete("abcdef", "b");
        assertEquals("acdef", result.get(0));
        assertFalse((boolean) result.get(1));
    }

    @Test
    void test3() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "ab");
        assertEquals("cdedc", result.get(0));
        assertTrue((boolean) result.get(1));
    }

    @Test
    void test4() {
        List<Object> result = ReverseDelete.reverseDelete("dwik", "w");
        assertEquals("dik", result.get(0));
        assertFalse((boolean) result.get(1));
    }

    @Test
    void test5() {
        List<Object> result = ReverseDelete.reverseDelete("a", "a");
        assertEquals("", result.get(0));
        assertTrue((boolean) result.get(1));
    }

    @Test
    void test6() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "");
        assertEquals("abcdedcba", result.get(0));
        assertTrue((boolean) result.get(1));
    }

    @Test
    void test7() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "v");
        assertEquals("abcdedcba", result.get(0));
        assertTrue((boolean) result.get(1));
    }

    @Test
    void test8() {
        List<Object> result = ReverseDelete.reverseDelete("vabba", "v");
        assertEquals("abba", result.get(0));
        assertTrue((boolean) result.get(1));
    }

    @Test
    void test9() {
        List<Object> result = ReverseDelete.reverseDelete("mamma", "mia");
        assertEquals("", result.get(0));
        assertTrue((boolean) result.get(1));
    }

    @Test
    void test10() {
        List<Object> result = ReverseDelete.reverseDelete("", "");
        assertEquals("", result.get(0));
        assertTrue((boolean) result.get(1));
    }
}