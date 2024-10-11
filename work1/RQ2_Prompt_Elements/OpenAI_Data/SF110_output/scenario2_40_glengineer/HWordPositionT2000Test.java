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
	 * The text at the position is "ABC".
	 */
	@Test
	void testTextAt1() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 2);
		assertEquals("ABC", p.textAt(ct));
	}

	/**
	 * Test case 2.
	 * The text at the position is "DEF".
	 */
	@Test
	void testTextAt2() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(1, 0, 2);
		assertEquals("DEF", p.textAt(ct));
	}

	/**
	 * Test case 3.
	 * The text at the position is "GHI".
	 */
	@Test
	void testTextAt3() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(2, 0, 2);
		assertEquals("GHI", p.textAt(ct));
	}

	/**
	 * Test case 4.
	 * The text at the position is "ABCDEFGHI".
	 */
	@Test
	void testTextAt4() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 8);
		assertEquals("ABCDEFGHI", p.textAt(ct));
	}

	/**
	 * Test case 5.
	 * The text at the position is "ABCDEFGHI".
	 */
	@Test
	void testTextAt5() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 9);
		assertEquals("ABCDEFGHI", p.textAt(ct));
	}

	/**
	 * Test case 6.
	 * The text at the position is "ABCDEFGHI".
	 */
	@Test
	void testTextAt6() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 10);
		assertEquals("ABCDEFGHI", p.textAt(ct));
	}

	/**
	 * Test case 7.
	 * The text at the position is "ABCDEFGHI".
	 */
	@Test
	void testTextAt7() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 11);
		assertEquals("ABCDEFGHI", p.textAt(ct));
	}

	/**
	 * Test case 8.
	 * The text at the position is "ABCDEFGHI".
	 */
	@Test
	void testTextAt8() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 12);
		assertEquals("ABCDEFGHI", p.textAt(ct));
	}

	/**
	 * Test case 9.
	 * The text at the position is "ABCDEFGHI".
	 */
	@Test
	void testTextAt9() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 13);
		assertEquals("ABCDEFGHI", p.textAt(ct));
	}

	/**
	 * Test case 10.
	 * The text at the position is "ABCDEFGHI".
	 */
	@Test
	void testTextAt10() {
		CharTable ct = new CharTable(new Block[][] {
			{ new Block('A'), new Block('B'), new Block('C') },
			{ new Block('D'), new Block('E'), new Block('F') },
			{ new Block('G'), new Block('H'), new Block('I') }
		});
		HWordPosition p = new HWordPosition(0, 0, 14);
		assertEquals("ABCDEFGHI", p.textAt(ct));
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
	 * The text at the position is "ADG".
	 */
