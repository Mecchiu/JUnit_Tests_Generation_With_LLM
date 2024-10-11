// CountUpToTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

	@Test
	void testCountUpTo_5() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		assertEquals(expected, CountUpTo.countUpTo(5));
	}
	
	@Test
	void testCountUpTo_6() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		assertEquals(expected, CountUpTo.countUpTo(6));
	}
	
	@Test
	void testCountUpTo_7() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		assertEquals(expected, CountUpTo.countUpTo(7));
	}
	
	@Test
	void testCountUpTo_10() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		assertEquals(expected, CountUpTo.countUpTo(10));
	}
	
	@Test
	void testCountUpTo_0() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, CountUpTo.countUpTo(0));
	}
	
	@Test
	void testCountUpTo_22() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		assertEquals(expected, CountUpTo.countUpTo(22));
	}
	
	@Test
	void testCountUpTo_1() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, CountUpTo.countUpTo(1));
	}
	
	@Test
	void testCountUpTo_18() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		assertEquals(expected, CountUpTo.countUpTo(18));
	}
	
	@Test
	void testCountUpTo_47() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		assertEquals(expected, CountUpTo.countUpTo(47));
	}
	
	@Test
	void testCountUpTo_101() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		assertEquals(expected, CountUpTo.countUpTo(101));
	}
}