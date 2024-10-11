// FactorizeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {

	@Test
	void testFactorize2() {
		List<Integer> expected = List.of(2);
		List<Integer> actual = Factorize.factorize(2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize4() {
		List<Integer> expected = List.of(2, 2);
		List<Integer> actual = Factorize.factorize(4);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize8() {
		List<Integer> expected = List.of(2, 2, 2);
		List<Integer> actual = Factorize.factorize(8);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize25() {
		List<Integer> expected = List.of(5, 5);
		List<Integer> actual = Factorize.factorize(25);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize70() {
		List<Integer> expected = List.of(2, 5, 7);
		List<Integer> actual = Factorize.factorize(70);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize57() {
		List<Integer> expected = List.of(3, 19);
		List<Integer> actual = Factorize.factorize(57);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize3249() {
		List<Integer> expected = List.of(3, 3, 19, 19);
		List<Integer> actual = Factorize.factorize(3249);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize185193() {
		List<Integer> expected = List.of(3, 3, 3, 19, 19, 19);
		List<Integer> actual = Factorize.factorize(185193);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize20577() {
		List<Integer> expected = List.of(3, 19, 19, 19);
		List<Integer> actual = Factorize.factorize(20577);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFactorize18() {
		List<Integer> expected = List.of(2, 3, 3);
		List<Integer> actual = Factorize.factorize(18);
		assertEquals(expected, actual);
	}
}