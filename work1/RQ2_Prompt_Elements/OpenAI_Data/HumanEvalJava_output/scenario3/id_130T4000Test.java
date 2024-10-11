// TriTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {

	@Test
	void testTri3() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0);
		List<Number> actual = Tri.tri(3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri4() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0, 3.0);
		List<Number> actual = Tri.tri(4);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri5() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0, 3.0, 15.0);
		List<Number> actual = Tri.tri(5);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri6() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0);
		List<Number> actual = Tri.tri(6);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri7() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0);
		List<Number> actual = Tri.tri(7);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri8() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0);
		List<Number> actual = Tri.tri(8);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri9() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0);
		List<Number> actual = Tri.tri(9);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri20() {
		List<Number> expected = List.of(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0);
		List<Number> actual = Tri.tri(20);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri0() {
		List<Number> expected = List.of(1);
		List<Number> actual = Tri.tri(0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTri1() {
		List<Number> expected = List.of(1, 3);
		List<Number> actual = Tri.tri(1);
		assertEquals(expected, actual);
	}
}