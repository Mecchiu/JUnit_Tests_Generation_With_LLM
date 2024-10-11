// MatchParensTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
			/**
			* Test case 1: matchParens(['()(', ')']) == 'Yes'
			*/
			@Test
			void test1() {
				List<String> lst = List.of("()(", ")");
				String expected = "Yes";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: matchParens([')', ')']) == 'No'
			*/
			@Test
			void test2() {
				List<String> lst = List.of(")", ")");
				String expected = "No";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: matchParens(['(()(())', '())())']) == 'No'
			*/
			@Test
			void test3() {
				List<String> lst = List.of("(()(())", "())())");
				String expected = "No";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: matchParens([')())', '(()()(']) == 'Yes'
			*/
			@Test
			void test4() {
				List<String> lst = List.of(")())", "(()()(");
				String expected = "Yes";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: matchParens(['(())))', '(()())((']) == 'Yes'
			*/
			@Test
			void test5() {
				List<String> lst = List.of("(())))", "(()())((");
				String expected = "Yes";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: matchParens(['()', '())']) == 'No'
			*/
			@Test
			void test6() {
				List<String> lst = List.of("()", "())");
				String expected = "No";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: matchParens(['(()(', '()))()']) == 'Yes'
			*/
			@Test
			void test7() {
				List<String> lst = List.of("(()(", "()))()");
				String expected = "Yes";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: matchParens(['((((', '((())']) == 'No'
			*/
			@Test
			void test8() {
				List<String> lst = List.of("((((", "((())");
				String expected = "No";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: matchParens([')(()', '(()(']) == 'No'
			*/
			@Test
			void test9() {
				List<String> lst = List.of(")(()", "(()(");
				String expected = "No";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: matchParens([')(', ')(']) == 'No'
			*/
			@Test
			void test10() {
				List<String> lst = List.of(")(", ")(");
				String expected = "No";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 11: matchParens(['(', ')']) == 'Yes'
			*/
			@Test
			void test11() {
				List<String> lst = List.of("(", ")");
				String expected = "Yes";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case 12: matchParens([')', '(']) == 'Yes'
			*/
			@Test
			void test12() {
				List<String> lst = List.of(")", "(");
				String expected = "Yes";
				String actual = MatchParens.matchParens(lst);
				assertEquals(expected, actual);
			}
}