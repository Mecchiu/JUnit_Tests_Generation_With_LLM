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
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(0, 0, 2);
		assertEquals("adg", pos.textAt(ct));
	}
	
	/**
	 * Test case 2.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt2() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(1, 0, 2);
		assertEquals("beh", pos.textAt(ct));
	}
	
	/**
	 * Test case 3.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt3() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(2, 0, 2);
		assertEquals("cfi", pos.textAt(ct));
	}
	
	/**
	 * Test case 4.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt4() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(0, 1, 2);
		assertEquals("be", pos.textAt(ct));
	}
	
	/**
	 * Test case 5.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt5() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(1, 1, 2);
		assertEquals("cf", pos.textAt(ct));
	}
	
	/**
	 * Test case 6.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt6() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(2, 1, 2);
		assertEquals("ch", pos.textAt(ct));
	}
	
	/**
	 * Test case 7.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt7() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(0, 2, 2);
		assertEquals("bf", pos.textAt(ct));
	}
	
	/**
	 * Test case 8.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt8() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(1, 2, 2);
		assertEquals("cg", pos.textAt(ct));
	}
	
	/**
	 * Test case 9.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt9() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(2, 2, 2);
		assertEquals("ci", pos.textAt(ct));
	}
	
	/**
	 * Test case 10.
	 * The text at the position is read from the char table.
	 */
	@Test
	void testTextAt10() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('a'), new Block('b'), new Block('c') },
			{ new Block('d'), new Block('e'), new Block('f') },
			{ new Block('g'), new Block('h'), new Block('i') }
		});
		VWordPosition pos = new VWordPosition(0, 0, 1);
		assertEquals("a", pos.textAt(ct));
	}
}

// WordPosition.java
package glengineer.positions;

/**
 * Encapsulates the position (start and end coordinates)
 * of a word lying on the scheme.
 */
public abstract class WordPosition {

    /**
     * The start column of the word.
     */
    public final int startCol;

    /**
     * The start row of the word.
     */
    public final int startRow;

    /**
     * The end column of the word.
     */
    public final int endCol;

    /**
     * The end row of the word.
     */
    public final int endRow;

    /**
     * Constructs a new word position.
     *
     * @param startCol the start column of the word.
     * @param startRow the start row of the word.
     * @param endCol the end column of the word.
     * @param endRow the end row of the word.
     */
    public WordPosition(int startCol, int startRow, int endCol, int endRow) {
        this.startCol = startCol;
        this.startRow = startRow;
        this.endCol = endCol;
        this.endRow = endRow;
    }

    /**
     * Returns the text at this position on the specified char table.
     *
     * The call is dispatched back to the specified char table
     * informing it about the concrete word position type.
     *