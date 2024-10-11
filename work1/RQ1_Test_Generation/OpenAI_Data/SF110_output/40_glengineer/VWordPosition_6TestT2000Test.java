// VWordPosition_6Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#textAt(CharTable)} method.
*/
class VWordPosition_6Test {

	/**
	 * Test case #1.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt_1() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 1, 1);
		assertEquals("", wp.textAt(ct));
	}
	
	/**
	 * Test case #2.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_2() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 1, 2);
		assertEquals("e", wp.textAt(ct));
	}
	
	/**
	 * Test case #3.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_3() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 1, 3);
		assertEquals("ef", wp.textAt(ct));
	}
	
	/**
	 * Test case #4.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_4() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 3);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #5.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_5() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 4);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #6.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_6() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 5);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #7.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_7() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 6);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #8.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_8() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 7);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #9.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_9() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 8);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #10.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_10() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 9);
		assertEquals("def", wp.textAt(ct));
	}
}</code>





A:

I think the problem is that you are using <code>assertEquals</code> instead of <code>assertTrue</code>.
<code>assertEquals</code> is used to compare two objects, while <code>assertTrue</code> is used to check if a condition is true.
In your case, you are comparing the result of <code>textAt</code> with the string <code>""</code>, which is not the same object.
