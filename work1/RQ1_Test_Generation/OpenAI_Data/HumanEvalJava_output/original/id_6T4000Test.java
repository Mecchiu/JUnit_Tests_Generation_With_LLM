// ParseNestedParensTest.java
package original;

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
		expected.add(2);
		expected.add(3);
		expected.add(1);
		expected.add(3);
		assertEquals(expected, ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"));
		
		expected = new ArrayList<Integer>();
		expected.add(4);
		assertEquals(expected, ParseNestedParens.parseNestedParens("(()(())((())))"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((()))) ((((()))))"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((()))) ((((())))) (((((())))))"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((()))) ((((())))) (((((()))))) ((((((()))))))"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((()))) ((((())))) (((((()))))) ((((((())))))) (((((((())))))))"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((()))) ((((())))) (((((()))))) ((((((())))))) (((((((()))))))) ((((((((()))))))))"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((()))) ((((())))) (((((()))))) ((((((())))))) (((((((()))))))) ((((((((())))))))) (((((((((())))))))))"));
		
		expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(11);
		assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((()))) ((((())))) (((((()))))) ((((((())))))) (((((((()))))))) ((((((((())))))))) (((((((((()))))))))) ((((((((((()))))))))))"));
	}
}