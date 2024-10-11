// PluckTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

	@Test
	void testPluck1() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck2() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck3() {
		List<Object> arr = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck4() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(5);
		arr.add(0);
		arr.add(3);
		arr.add(0);
		arr.add(4);
		arr.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck5() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(0);
		arr.add(5);
		arr.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(3);
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck6() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(5);
		arr.add(4);
		arr.add(8);
		arr.add(4);
		arr.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck7() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(7);
		arr.add(6);
		arr.add(7);
		arr.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(6);
		expected.add(1);
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck8() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(7);
		arr.add(9);
		arr.add(7);
		arr.add(1);
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck9() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(0);
		arr.add(5);
		arr.add(3);
		arr.add(0);
		arr.add(4);
		arr.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(3);
		assertEquals(expected, Pluck.pluck(arr));
	}
	
	@Test
	void testPluck10() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(5);
		arr.add(4);
		arr.add(8);
		arr.add(4);
		arr.add(8);
		arr.add(0);
		arr.add(4);
		arr.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		expected.add(5);
		assertEquals(expected, Pluck.pluck(arr));
	}
}