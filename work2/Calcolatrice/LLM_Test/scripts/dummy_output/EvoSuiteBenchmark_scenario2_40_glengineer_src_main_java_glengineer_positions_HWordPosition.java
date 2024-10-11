// HWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#textAt(CharTable)} method.
*/
class HWordPositionTest {
		
	/**
	 * Test case 1.
	 * The text at the position is empty.
	 */
	@Test
	void testTextAt1() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(0, 0, 0);
		assertEquals("", pos.textAt(ct));
	}

	/**
	 * Test case 2.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt2() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(0, 0, 2);
		assertEquals("AB", pos.textAt(ct));
	}

	/**
	 * Test case 3.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt3() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(1, 0, 2);
		assertEquals("DE", pos.textAt(ct));
	}

	/**
	 * Test case 4.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt4() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(2, 0, 2);
		assertEquals("GH", pos.textAt(ct));
	}

	/**
	 * Test case 5.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt5() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(0, 1, 2);
		assertEquals("BC", pos.textAt(ct));
	}

	/**
	 * Test case 6.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt6() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(1, 1, 2);
		assertEquals("EF", pos.textAt(ct));
	}

	/**
	 * Test case 7.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt7() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(2, 1, 2);
		assertEquals("HI", pos.textAt(ct));
	}

	/**
	 * Test case 8.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt8() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(0, 2, 2);
		assertEquals("CD", pos.textAt(ct));
	}

	/**
	 * Test case 9.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt9() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(1, 2, 2);
		assertEquals("FG", pos.textAt(ct));
	}

	/**
	 * Test case 10.
	 * The text at the position is not empty.
	 */
	@Test
	void testTextAt10() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition pos = new HWordPosition(2, 2, 2);
		assertEquals("IJ", pos.textAt(ct));
	}
}