// ReverseDeleteTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {
			/**
			* Test case for the {@link ReverseDelete#reverseDelete(String, String)} method.
			* It checks if the result string is palindrome.
			*/
			@Test
			void testReverseDelete() {
				List<Object> result = ReverseDelete.reverseDelete("abcde", "ae");
				assertEquals(Arrays.asList("bcd", false), result);
				result = ReverseDelete.reverseDelete("abcdef", "b");
				assertEquals(Arrays.asList("acdef", false), result);
				result = ReverseDelete.reverseDelete("abcdedcba", "ab");
				assertEquals(Arrays.asList("cdedc", true), result);
				result = ReverseDelete.reverseDelete("dwik", "w");
				assertEquals(Arrays.asList("dik", false), result);
				result = ReverseDelete.reverseDelete("a", "a");
				assertEquals(Arrays.asList("", true), result);
				result = ReverseDelete.reverseDelete("abcdedcba", "");
				assertEquals(Arrays.asList("abcdedcba", true), result);
				result = ReverseDelete.reverseDelete("abcdedcba", "v");
				assertEquals(Arrays.asList("abcdedcba", true), result);
				result = ReverseDelete.reverseDelete("vabba", "v");
				assertEquals(Arrays.asList("abba", true), result);
				result = ReverseDelete.reverseDelete("mamma", "mia");
				assertEquals(Arrays.asList("", true), result);
			}
}