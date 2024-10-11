// VWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#textAt(CharTable)} method.
*/
class VWordPositionTest {
		
	/**
	 * Test case 1.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt1() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(0, 0, 2);
		assertEquals("ADG", pos.textAt(ct));
	}
	
	/**
	 * Test case 2.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt2() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(1, 0, 2);
		assertEquals("BEH", pos.textAt(ct));
	}
	
	/**
	 * Test case 3.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt3() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(2, 0, 2);
		assertEquals("CFI", pos.textAt(ct));
	}
	
	/**
	 * Test case 4.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt4() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(0, 1, 2);
		assertEquals("AEH", pos.textAt(ct));
	}
	
	/**
	 * Test case 5.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt5() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(1, 1, 2);
		assertEquals("BF", pos.textAt(ct));
	}
	
	/**
	 * Test case 6.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt6() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(2, 1, 2);
		assertEquals("CG", pos.textAt(ct));
	}
	
	/**
	 * Test case 7.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt7() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(0, 2, 2);
		assertEquals("AFI", pos.textAt(ct));
	}
	
	/**
	 * Test case 8.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt8() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(1, 2, 2);
		assertEquals("BGI", pos.textAt(ct));
	}
	
	/**
	 * Test case 9.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt9() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(2, 2, 2);
		assertEquals("CH", pos.textAt(ct));
	}
	
	/**
	 * Test case 10.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt10() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(0, 0, 1);
		assertEquals("A", pos.textAt(ct));
	}
}