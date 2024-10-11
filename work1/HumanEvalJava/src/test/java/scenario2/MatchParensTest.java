// MatchParensTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
			/**
			* Test case 1: Both strings are empty.
			* Expected result: Yes
			*/
			@Test
			void test1() {
				List<String> lst = List.of("", "");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			/**
			* Test case 2: Both strings are the same.
			* Expected result: Yes
			*/
			@Test
			void test2() {
				List<String> lst = List.of("()", "()");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			/**
			* Test case 3: Both strings are different.
			* Expected result: Yes
			*/
			@Test
			void test3() {
				List<String> lst = List.of("()", ")(");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			/**
			* Test case 4: One string is empty.
			* Expected result: No
			*/
			@Test
			void test4() {
				List<String> lst = List.of("()", "");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			/**
			* Test case 5: One string is empty.
			* Expected result: No
			*/
			@Test
			void test5() {
				List<String> lst = List.of("", "()");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			/**
			* Test case 6: One string is empty.
			* Expected result: No
			*/
			@Test
			void test6() {
				List<String> lst = List.of("(", ")");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			/**
			* Test case 7: One string is empty.
			* Expected result: No
			*/
			@Test
			void test7() {
				List<String> lst = List.of("(", "()");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			/**
			* Test case 8: One string is empty.
			* Expected result: No
			*/
			@Test
			void test8() {
				List<String> lst = List.of("()", "(");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			/**
			* Test case 9: One string is empty.
			* Expected result: No
			*/
			@Test
			void test9() {
				List<String> lst = List.of("()", "()");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			/**
			* Test case 10: One string is empty.
			* Expected result: No
			*/
			@Test
			void test10() {
				List<String> lst = List.of("()", "())");
				assertEquals("No", MatchParens.matchParens(lst));
			}
}