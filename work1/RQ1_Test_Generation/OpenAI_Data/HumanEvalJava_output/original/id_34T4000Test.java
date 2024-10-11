// UniqueTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

	@Test
	void testUnique() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique3() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique4() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique5() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique6() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique7() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique8() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique9() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique10() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(9);
		expected.add(123);
		assertEquals(expected, Unique.unique(l));
	}
}