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
			void testCase1() {
				List<Object> result = ReverseDelete.reverseDelete("abcde", "ae");
				assertEquals("bcd", result.get(0));
				assertEquals(false, result.get(1));
			}

			@Test
			void testCase2() {
				List<Object> result = ReverseDelete.reverseDelete("abcdef", "b");
				assertEquals("acdef", result.get(0));
				assertEquals(false, result.get(1));
			}

			@Test
			void testCase3() {
				List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "ab");
				assertEquals("cdedc", result.get(0));
				assertEquals(true, result.get(1));
			}

			@Test
			void testCase4() {
				List<Object> result = ReverseDelete.reverseDelete("dwik", "w");
				assertEquals("dik", result.get(0));
				assertEquals(false, result.get(1));
			}

			@Test
			void testCase5() {
				List<Object> result = ReverseDelete.reverseDelete("a", "a");
				assertEquals("", result.get(0));
				assertEquals(true, result.get(1));
			}

			@Test
			void testCase6() {
				List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "");
				assertEquals("abcdedcba", result.get(0));
				assertEquals(true, result.get(1));
			}

			@Test
			void testCase7() {
				List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "v");
				assertEquals("abcdedcba", result.get(0));
				assertEquals(true, result.get(1));
			}

			@Test
			void testCase8() {
				List<Object> result = ReverseDelete.reverseDelete("vabba", "v");
				assertEquals("abba", result.get(0));
				assertEquals(true, result.get(1));
			}

			@Test
			void testCase9() {
				List<Object> result = ReverseDelete.reverseDelete("mamma", "mia");
				assertEquals("", result.get(0));
				assertEquals(true, result.get(1));
			}

			@Test
			void testCase10() {
				List<Object> result = ReverseDelete.reverseDelete("mamma", "m");
				assertEquals("a", result.get(0));
				assertEquals(false, result.get(1));
			}
}