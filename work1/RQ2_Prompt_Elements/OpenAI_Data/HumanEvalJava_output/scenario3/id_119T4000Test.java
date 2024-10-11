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
	void testMatchParens1() {
		List<String> lst = List.of("()(", ")");
		assertEquals("Yes", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens2() {
		List<String> lst = List.of(")", ")");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens3() {
		List<String> lst = List.of("(()(())", "())())");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens4() {
		List<String> lst = List.of(")())", "(()()(");
		assertEquals("Yes", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens5() {
		List<String> lst = List.of("(())))", "(()())((");
		assertEquals("Yes", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens6() {
		List<String> lst = List.of("()", "())");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens7() {
		List<String> lst = List.of("(()(", "()))()");
		assertEquals("Yes", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens8() {
		List<String> lst = List.of("((((", "((())");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens9() {
		List<String> lst = List.of(")(()", "(()(");
		assertEquals("No", MatchParens.matchParens(lst));
	}
	
	@Test
	void testMatchParens10() {
		List<String> lst = List.of(")(", ")(");
		assertEquals("No", MatchParens.matchParens(lst));
	}
}