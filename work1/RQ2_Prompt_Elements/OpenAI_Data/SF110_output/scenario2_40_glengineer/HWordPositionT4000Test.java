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

// VWordPosition.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;

/**
 * Encapsulates the position (start and end coordinates)
 * of a word lying vertically on the scheme.
 */
public class VWordPosition extends WordPosition {

    /**
     * Returns the text at this position on the specified char table.
     *
     * The call is dispatched back to the specified char table
     * informing it about the concrete word position type.
     *
     * @param ct the char table from which the text must be read.
     * @return the text at this position on the specified char table.
     */
    public String textAt(CharTable ct) {
        return ct.textAt(this);
    }
}

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
	 * The text at the position is empty.
	 */
	@Test
	void testTextAt1() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		VWordPosition pos = new VWordPosition(0, 0, 0);
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
		VWordPosition pos = new VWordPosition(0, 0, 2);
		assertEquals("AD", pos.textAt(ct));
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
		VWordPosition pos = new VWordPosition(1, 0, 2);
		assertEquals("AE", pos.textAt(ct));
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
		VWordPosition pos = new VWordPosition(2, 0, 2);
		assertEquals("AF", pos.textAt(ct));
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
		VWordPosition pos = new VWordPosition(0, 1, 2);
		assertEquals("BD", pos.textAt(ct));
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
		VWordPosition pos = new VWordPosition(1, 1, 2);
		assertEquals("BE", pos.textAt(ct));
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
		VWordPosition pos = new VWordPosition(2, 1, 2);
		assertEquals("BF", pos.textAt(ct));
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
		VWordPosition pos = new VWordPosition(0, 2, 2);
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
		VWordPosition pos = new VWordPosition(1, 2, 2);
		assertEquals("CE", pos.textAt(ct));
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
		VWordPosition pos = new VWordPosition(2, 2, 2);
		assertEquals("CF", pos.textAt(ct));
	}
}

// CharTable.java
package glengineer.blocks;

import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;

/**
 * Represents a table of characters.
 *
 * The table is represented as a two-dimensional array of blocks.
 * Each block contains a character.
 */
public class CharTable {

    /**
     * The two-dimensional array of blocks.
     */
    private Block[][] blocks;

    /**
     * Constructs a char table from the specified two-dimensional array of blocks.
     *
     * @param blocks the two-dimensional array of blocks.
     */
    public CharTable(Block[][] blocks) {
        this.blocks = blocks;
    }

    /**
     * Returns the text at the specified position on this char table.
     *
     * The call is dispatched to the specified word position
     * informing it about the concrete char table type.
     *
     * @param pos the position at which the text must be read.
     * @return the text at the specified position on this char table.
     */
    public String textAt(WordPosition pos) {
        return pos.textAt(this);
    }

    /**
     * Returns the text at the specified horizontal position on this char table.
     *
     * @param pos the horizontal position at which the text must be read.
     * @return the text at the specified horizontal position on this char table.
     */
    public String textAt(HWordPosition pos) {
        StringBuilder sb = new StringBuilder();
        for (int i = pos.getStart(); i <= pos.getEnd(); i++) {
            sb.append(blocks[pos.getRow()][i].getChar());
        }
        return sb.toString();
    }

    /**
     * Returns the text at the specified vertical position on this char table.
     *
     *