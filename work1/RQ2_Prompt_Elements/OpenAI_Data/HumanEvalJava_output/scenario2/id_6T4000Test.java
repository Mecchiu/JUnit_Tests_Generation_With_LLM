// ParseNestedParensTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains ten unit test cases for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {

	@Test
	void testParseNestedParens() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens5() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens6() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens7() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens8() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens9() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
	
	@Test
	void testParseNestedParens10() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseNestedParens.parseNestedParens("( ( ) ) ( ( ( ) ) ) ( ( ( ( ) ) ) ) ( ( ( ) ) ) ( ) ( ) ( ) ( ) ( )"));
	}
}