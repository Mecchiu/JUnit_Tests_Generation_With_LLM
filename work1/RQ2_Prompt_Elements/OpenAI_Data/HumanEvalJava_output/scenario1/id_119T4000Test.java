// MatchParensTest.java
package scenario1;

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
	* Input: ()(), ()()
	* Expected output: Yes
	*/
	@Test
	void test1() {
		List<String> lst = List.of("()", "()");
		assertEquals("Yes", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 2.
	* Input: ()(), (())
	* Expected output: Yes
	*/
	@Test
	void test2() {
		List<String> lst = List.of("()", "(())");
		assertEquals("Yes", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 3.
	* Input: ()(), (()
	* Expected output: No
	*/
	@Test
	void test3() {
		List<String> lst = List.of("()", "(()");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 4.
	* Input: ()(), )()
	* Expected output: No
	*/
	@Test
	void test4() {
		List<String> lst = List.of("()", ")()");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 5.
	* Input: ()(), (()))
	* Expected output: No
	*/
	@Test
	void test5() {
		List<String> lst = List.of("()", "(()))");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 6.
	* Input: ()(), (()()
	* Expected output: No
	*/
	@Test
	void test6() {
		List<String> lst = List.of("()", "(()(");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 7.
	* Input: ()(), (()()
	* Expected output: No
	*/
	@Test
	void test7() {
		List<String> lst = List.of("()", "(()(");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 8.
	* Input: ()(), (()()
	* Expected output: No
	*/
	@Test
	void test8() {
		List<String> lst = List.of("()", "(()(");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 9.
	* Input: ()(), (()()
	* Expected output: No
	*/
	@Test
	void test9() {
		List<String> lst = List.of("()", "(()(");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	/**
	* Test case 10.
	* Input: ()(), (()()
	* Expected output: No
	*/
	@Test
	void test10() {
		List<String> lst = List.of("()", "(()(");
		assertEquals("No", MatchParens.matchParens(lst));
	}
}