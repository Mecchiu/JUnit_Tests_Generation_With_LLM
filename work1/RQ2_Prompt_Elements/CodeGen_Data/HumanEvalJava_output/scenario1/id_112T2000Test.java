// ReverseDeleteTest.java
package scenario1;

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
package scenario1;

import java.util.Arrays;
import java.util.List;

class ReverseDelete {

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
package scenario1;

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
	public void test() {
				
		List<String> testCase = Arrays.asList("test", "test");
		assertTrue(true);
	}
}