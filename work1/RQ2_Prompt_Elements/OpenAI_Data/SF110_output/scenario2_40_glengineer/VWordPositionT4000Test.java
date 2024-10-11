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
     * @param ct the char table from which the text must be read.
     * @return the text at this position on the specified char table.
     */
    public abstract String textAt(CharTable ct);
}

// WordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordPosition}.
* It contains ten unit test cases for the {@link WordPosition#textAt(CharTable)} method.
*/
class WordPositionTest {
		
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
		WordPosition pos = new HWordPosition(0, 0, 2);
		assertEquals("ABC", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(1, 0, 2);
		assertEquals("DEF", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(2, 0, 2);
		assertEquals("GHI", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(0, 1, 2);
		assertEquals("ADG", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(1, 1, 2);
		assertEquals("BEH", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(2, 1, 2);
		assertEquals("CFI", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(0, 2, 2);
		assertEquals("AEI", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(1, 2, 2);
		assertEquals("BFI", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(2, 2, 2);
		assertEquals("CHI", pos.textAt(ct));
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
		WordPosition pos = new HWordPosition(0, 0, 1);
		assertEquals("A", pos.textAt(ct));
	}
}

// WordSearch.java
package glengineer;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Encapsulates the word search scheme.
 */
public class WordSearch {

    /**
     * The char table of the word search scheme.
     */
    private final CharTable charTable;

    /**
     * The list of words to be found on the scheme.
     */
