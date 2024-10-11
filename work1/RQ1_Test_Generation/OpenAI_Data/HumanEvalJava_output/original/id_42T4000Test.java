// IncrListTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {

	@Test
	void testIncrList_1() {
		List<Object> l = new ArrayList<Object>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(4);
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_2() {
		List<Object> l = new ArrayList<Object>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Object> expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(4);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		expected.add(10);
		expected.add(1);
		expected.add(124);
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_3() {
		List<Object> l = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_4() {
		List<Object> l = new ArrayList<Object>();
		l.add(3);
		l.add(2);
		l.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(3);
		expected.add(2);
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_5() {
		List<Object> l = new ArrayList<Object>();
		l.add(5);
		l.add(2);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Object> expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(3);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		expected.add(10);
		expected.add(1);
		expected.add(124);
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_6() {
		List<Object> l = new ArrayList<Object>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(4);
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_7() {
		List<Object> l = new ArrayList<Object>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Object> expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(4);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		expected.add(10);
		expected.add(1);
		expected.add(124);
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_8() {
		List<Object> l = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_9() {
		List<Object> l = new ArrayList<Object>();
		l.add(3);
		l.add(2);
		l.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(3);
		expected.add(2);
		assertEquals(expected, IncrList.incrList(l));
	}
	
	@Test
	void testIncrList_10() {
		List<Object> l = new ArrayList<Object>();
		l.add(5);
		l.add(2);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		List<Object> expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(3);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		expected.add(10);
		expected.add(1);
		expected.add(124);
		assertEquals(expected, IncrList.incrList(l));
	}
}