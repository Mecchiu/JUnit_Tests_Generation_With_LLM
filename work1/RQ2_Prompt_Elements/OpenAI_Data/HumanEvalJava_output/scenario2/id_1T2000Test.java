// SeparateParenGroupsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {
	@Test
			void testSeparateParenGroups1() {
				String input = "((()))";
				List<String> expected = new ArrayList<>();
				expected.add("((()))");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups2() {
				String input = "()()()";
				List<String> expected = new ArrayList<>();
				expected.add("()()()");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups3() {
				String input = "((()()))";
				List<String> expected = new ArrayList<>();
				expected.add("((()()))");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups4() {
				String input = "((()())())";
				List<String> expected = new ArrayList<>();
				expected.add("((()())())");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups5() {
				String input = "((()())())()";
				List<String> expected = new ArrayList<>();
				expected.add("((()())())()");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups6() {
				String input = "((()())())()()";
				List<String> expected = new ArrayList<>();
				expected.add("((()())())()()");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups7() {
				String input = "((()())())()()()";
				List<String> expected = new ArrayList<>();
				expected.add("((()())())()()()");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups8() {
				String input = "((()())())()()()()";
				List<String> expected = new ArrayList<>();
				expected.add("((()())())()()()()");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups9() {
				String input = "((()())())()()()()()";
				List<String> expected = new ArrayList<>();
				expected.add("((()())())()()()()()");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}

			@Test
			void testSeparateParenGroups10() {
				String input = "((()())())()()()()()()";
				List<String> expected = new ArrayList<>();
				expected.add("((()())())()()()()()()");
				List<String> actual = SeparateParenGroups.separateParenGroups(input);
				assertEquals(expected, actual);
			}
}
