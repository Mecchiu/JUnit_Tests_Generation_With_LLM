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
	* Test case 1.
	* The input is:
	* <pre>
	* (())
	* ()
	* </pre>
	* The expected output is:
	* <pre>
	* Yes
	* </pre>
	*/
	@Test
	void testCase1() {
		List<String> lst = List.of("(())", "()");
		String expected = "Yes";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input is:
	* <pre>
	* (())
	* (())
	* </pre>
	* The expected output is:
	* <pre>
	* Yes
	* </pre>
	*/
	@Test
	void testCase2() {
		List<String> lst = List.of("(())", "(())");
		String expected = "Yes";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input is:
	* <pre>
	* (())
	* (()
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase3() {
		List<String> lst = List.of("(())", "(()");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input is:
	* <pre>
	* (())
	* )(
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase4() {
		List<String> lst = List.of("(())", ")(");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input is:
	* <pre>
	* (())
	* )()
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase5() {
		List<String> lst = List.of("(())", ")()");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input is:
	* <pre>
	* (())
	* ))(
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase6() {
		List<String> lst = List.of("(())", "))(");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input is:
	* <pre>
	* (())
	* )()(
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase7() {
		List<String> lst = List.of("(())", ")()(");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input is:
	* <pre>
	* (())
	* )())(
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase8() {
		List<String> lst = List.of("(())", ")))(");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input is:
	* <pre>
	* (())
	* )()()
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase9() {
		List<String> lst = List.of("(())", ")()()");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input is:
	* <pre>
	* (())
	* )()()(
	* </pre>
	* The expected output is:
	* <pre>
	* No
	* </pre>
	*/
	@Test
	void testCase10() {
		List<String> lst = List.of("(())", ")()()(");
		String expected = "No";
		String actual = MatchParens.matchParens(lst);
		assertEquals(expected, actual);
	}
}