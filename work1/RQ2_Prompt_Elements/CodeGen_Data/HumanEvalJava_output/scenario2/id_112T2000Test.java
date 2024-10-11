// ReverseDeleteTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains one unit test case for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {
// ReverseDelete.java
package scenario2;

import java.util.Arrays;
import java.util.List;

class ReverseDelete {

    /**
     * Task
     * We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
     * then check if the result string is palindrome.
     * A string is called palindrome if it reads the same backward as forward.
     * You should return a tuple containing the result string and True/False for the check.
     */
    public static List<Object> reverseDelete(String s, String c) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (c.indexOf(s.charAt(i)) == -1) {
                result += s.charAt(i);
            }
        }
        boolean isPalindrome = true;
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i)!= result.charAt(result.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        return Arrays.asList(result, isPalindrome);
    }
}

// ReverseDeleteTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains one unit test case for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {
		
	@Test
	void test() {
		final String s = "s";
		final String c = "c";
		final boolean[] isPalindrome = {false, false, true};
		final List<Obj> result = reverseDelete(s, c);
        assertTrue(result.size() == 2);
        final Obj c3 = result.get(1);
        assertTrue(isPalindrome[0]);
    }
		
}

// reverseDeleteTest.java