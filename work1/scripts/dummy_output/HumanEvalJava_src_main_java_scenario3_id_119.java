// MatchParensTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
			@Test
			void test1() {
				List<String> lst = List.of("()(", ")");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			@Test
			void test2() {
				List<String> lst = List.of(")", ")");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			@Test
			void test3() {
				List<String> lst = List.of("(()(())", "())())");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			@Test
			void test4() {
				List<String> lst = List.of("())", "(()()(");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			@Test
			void test5() {
				List<String> lst = List.of("(())))", "(()())((");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			@Test
			void test6() {
				List<String> lst = List.of("()", "())");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			@Test
			void test7() {
				List<String> lst = List.of("(()(", "()))()");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			@Test
			void test8() {
				List<String> lst = List.of("((((", "((())");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			@Test
			void test9() {
				List<String> lst = List.of(")(()", "(()(");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			@Test
			void test10() {
				List<String> lst = List.of(")(", ")(");
				assertEquals("No", MatchParens.matchParens(lst));
			}

			@Test
			void test11() {
				List<String> lst = List.of("(", ")");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}

			@Test
			void test12() {
				List<String> lst = List.of(")", "(");
				assertEquals("Yes", MatchParens.matchParens(lst));
			}
}