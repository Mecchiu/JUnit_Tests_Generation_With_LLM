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
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(1, 0, 'b');
		ct.setCharAt(2, 0, 'c');
		ct.setCharAt(3, 0, 'd');
		ct.setCharAt(4, 0, 'e');
		assertEquals("abcde", wp.textAt(ct));
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
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(0, 1, 'b');
		ct.setCharAt(0, 2, 'c');
		ct.setCharAt(0, 3, 'd');
		ct.setCharAt(0, 4, 'e');
		assertEquals("abcde", wp.textAt(ct));
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
 * The table is represented as a two-dimensional array of characters.
 * The table is used to store the characters of the scheme.
 */
public class CharTable {

    /**
     * Returns the character at the specified position.
     *
     * @param x the x coordinate of the position.
     * @param y the y coordinate of the position.
     * @return the character at the specified position.
     */
    public char charAt(int x, int y);

    /**
     * Sets the character at the specified position.
     *
     * @param x the x coordinate of the position.
     * @param y the y coordinate of the position.
     * @param c the character to be set at the specified position.
     */
    public void setCharAt(int x, int y, char c);

    /**
     * Returns the text at the specified position.
     *
     * @param wp the word position at which the text must be read.
     * @return the text at the specified position.
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
		WordPosition wp = new HWordPosition(0, 0, 5);
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(1, 0, 'b');
		ct.setCharAt(2, 0, 'c');
		ct.setCharAt(3, 0, 'd');
		ct.setCharAt(4, 0, 'e');
		assertEquals("abcde", ct.textAt(wp));
	}
}

// Scheme.java
package glengineer;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;

/**
 * Represents a scheme.
 *
 * The scheme is represented as a two-dimensional array of blocks.
 * The scheme is used to store the blocks of the scheme.
 */
public class Scheme {

    /**
     * Returns the block at the specified position.
     *
     * @param x the x coordinate of the position.
     * @param y the y coordinate of the position.
     * @return the block at the specified position.
     */
    public Block blockAt(int x, int y);

    /**
     * Sets the block at the specified position.
     *
     * @param x the x coordinate of the position.
     * @param y the y coordinate of the position.
     * @param b the block to be set at the specified position.
     */
    public void setBlockAt(int x, int y, Block b);

    /**
     * Returns the char table of the scheme.
     *
     * @return the char table of the scheme.
     */
    public CharTable charTable();

    /**
     * Returns the text at the specified position.
     *
     * @param wp the word position at which the text must be read.
     * @return the text at the specified position.
     */
    public String textAt(WordPosition wp);
}

// SchemeTest.java
package glengineer;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Scheme}.
* It contains ten unit test cases for the {@link Scheme#textAt(WordPosition)} method.
*/
class SchemeTest {
		
	@Test
	void testTextAt() {
		Scheme s = new Scheme(10, 10);
		WordPosition wp = new HWordPosition(0, 0, 5);
		s.setBlockAt(0, 0, new Block('a'));
		s.setBlockAt(1, 0, new Block('b'));
		s.setBlockAt(2, 0, new Block('c'));
		s.setBlockAt(3, 0, new Block('d'));
		s.setBlockAt(4, 0, new Block('e'));
		assertEquals("abcde", s.textAt(wp));
	}
}