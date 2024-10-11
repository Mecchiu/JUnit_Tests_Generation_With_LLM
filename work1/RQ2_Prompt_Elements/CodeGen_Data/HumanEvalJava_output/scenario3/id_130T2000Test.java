// TriTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains one unit test case for the {@link Tri#tri(int)} method.
*/
class TriTest {

	/**
	 * Test for {@link Tri#tri(int)}.
	*/
	@Test
	void testTr1() {
		List<Number> t = Tri.tr(10);
		assertEquals(10,t.size());
		assertArrayEquals(new Number[][]{{Number.valueOf(11),Number.valueOf(11)},
				{Number.valueOf(11),Number.valueOf(11)},
				{Number.valueOf(0),Number.valueOf(11)}}}
		, t);
	}

	/**
	 * Test for {@link Tri#tri(int)}.
	*/
	@Test
	void testTr0() {
		List<Number> t = Tri.tr(0);
		assertEquals(0,t.size());
		assertArrayEquals(new Number[][]{{Number.valueOf(0),Number.valueOf(0)},
				{Number.valueOf(0),Number.valueOf(0)},
				{Number.valueOf(0),Number.valueOf(0)}}}
		, t);
	}

	/**
	 * Test for {@link Tri#tri(int)}.
	*/
	@Test
	void testTr2() {
		List<Number> t = Tri.tr(26);
		assertEquals(26,t.size());
		assertArrayEquals(new Number[][]{{Number.valueOf(22),Number.valueOf(11)},
				{Number.valueOf(11),Number.valueOf(11)},
				{Number.valueOf(11),Number.valueOf(11)}}}
		, t);
	}

	/**
	 * Test for {@link Tri#tri(int)}.
	*/
	@Test
	void testTr4() {
		List<Number> t = Tri.tr(100);
		assertEquals(100,t.size());
		assertArrayEquals(new Number[][]{{Number.valueOf(9),Number.valueOf(2)},
				{Number.valueOf(2),Number.valueOf(11)},{Number.valueOf(8),Number.valueOf(60)},
				{Number.valueOf(0),Number.valueOf(11)}}}
		, t);
	}

}