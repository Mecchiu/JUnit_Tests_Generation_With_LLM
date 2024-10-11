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

	@Test
	void testTextAt() {
		CharTable ct = new CharTable(10, 10);
		HWordPosition wp = new HWordPosition(0, 0, 5);
		ct.setBlock(0, 0, new Block('A'));
		ct.setBlock(1, 0, new Block('B'));
		ct.setBlock(2, 0, new Block('C'));
		ct.setBlock(3, 0, new Block('D'));
		ct.setBlock(4, 0, new Block('E'));
		assertEquals("ABCDE", wp.textAt(ct));
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
    public String textAt(CharTable ct);
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
		
	@Test
	void testTextAt() {
		CharTable ct = new CharTable(10, 10);
		VWordPosition wp = new VWordPosition(0, 0, 5);
		ct.setBlock(0, 0, new Block('A'));
		ct.setBlock(0, 1, new Block('B'));
		ct.setBlock(0, 2, new Block('C'));
		ct.setBlock(0, 3, new Block('D'));
		ct.setBlock(0, 4, new Block('E'));
		assertEquals("ABCDE", wp.textAt(ct));
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
     * Returns the text at the specified position on this char table.
     *
     * The call is dispatched to the specified word position
     * informing it about the concrete char table type.
     *
     * @param wp the word position at which the text must be read.
     * @return the text at the specified position on this char table.
     */
    public String textAt(WordPosition wp);
}

// CharTableTest.java
package glengineer.blocks;

import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CharTable}.
* It contains ten unit test cases for the {@link CharTable#textAt(WordPosition)} method.
*/
class CharTableTest {
		
	@Test
	void testTextAt() {
		CharTable ct = new CharTable(10, 10);
		HWordPosition wp = new HWordPosition(0, 0, 5);
		ct.setBlock(0, 0, new Block('A'));
		ct.setBlock(1, 0, new Block('B'));
		ct.setBlock(2, 0, new Block('C'));
		ct.setBlock(3, 0, new Block('D'));
		ct.setBlock(4, 0, new Block('E'));
		assertEquals("ABCDE", ct.textAt(wp));
		VWordPosition wp2 = new VWordPosition(0, 0, 5);
		ct.setBlock(0, 0, new Block('A'));
		ct.setBlock(0, 1, new Block('B'));
		ct.setBlock(0, 2, new Block('C'));
		ct.setBlock(0, 3, new Block('D'));
		ct.setBlock(0, 4, new Block('E'));
		assertEquals("ABCDE", ct.textAt(wp2));
	}
}

// WordPosition.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;

/**
 * Encapsulates the position (start and end coordinates)
 * of a word lying on the scheme.
 */
public abstract class WordPosition {

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
		
	@Test
	void testTextAt() {
		CharTable ct = new CharTable(10, 10);
		HWordPosition wp = new HWordPosition(0, 0, 5);
		ct.setBlock(0, 0, new Block('A'));
		ct.setBlock(1, 0, new Block('B'));
		ct.setBlock(2, 0, new Block('C'));
		ct.setBlock(3, 0, new Block('D'));
		ct.setBlock(4, 0, new Block('E'));
		assertEquals("ABCDE", wp.textAt(ct));
		VWordPosition wp2 = new VWordPosition(0, 0, 5);
		ct.setBlock(0, 0, new Block('A'));
		ct.setBlock(0, 1, new Block('B'));
		ct.setBlock(0, 2, new Block('C'));
		ct.setBlock(0, 3, new Block('D'));
		ct.setBlock(0, 4, new Block('E'));
		assertEquals("ABCDE", wp2.textAt(ct));
	}
}