// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArrayTest {
		
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an empty array.
	 */
	@Test
	void testLeftEmpty() {
		ExtBoolArray array = new ExtBoolArray();
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only one element.
	 */
	@Test
	void testLeftOneElement2() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true};
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements2() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements3() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only two elements.
	 */
	@Test
	void testLeftTwoElements4() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true};
		assertEquals(0, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, false, false};
		assertEquals(3, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements2() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, false, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements3() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, true, false};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements4() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, false, true};
		assertEquals(2, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements5() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true, false};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements6() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, false, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements7() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {false, true, true};
		assertEquals(1, array.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}.
	 * It tests the method with an array containing only three elements.
	 */
	@Test
	void testLeftThreeElements8() {
		ExtBoolArray array = new ExtBoolArray();
		array.werte = new boolean[] {true, true, true};
		assertEquals(0, array.left());
	}
}