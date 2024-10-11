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
		CharTable ct = new CharTable(5, 5);
		ct.setText(0, 0, "abcde");
		ct.setText(0, 1, "fghij");
		ct.setText(0, 2, "klmno");
		ct.setText(0, 3, "pqrst");
		ct.setText(0, 4, "uvwxy");
		
		HWordPosition wp1 = new HWordPosition(0, 0, 0);
		assertEquals("a", wp1.textAt(ct));
		
		HWordPosition wp2 = new HWordPosition(1, 1, 0);
		assertEquals("b", wp2.textAt(ct));
		
		HWordPosition wp3 = new HWordPosition(2, 2, 0);
		assertEquals("c", wp3.textAt(ct));
		
		HWordPosition wp4 = new HWordPosition(3, 3, 0);
		assertEquals("d", wp4.textAt(ct));
		
		HWordPosition wp5 = new HWordPosition(4, 4, 0);
		assertEquals("e", wp5.textAt(ct));
		
		HWordPosition wp6 = new HWordPosition(0, 4, 0);
		assertEquals("abcde", wp6.textAt(ct));
		
		HWordPosition wp7 = new HWordPosition(0, 4, 1);
		assertEquals("fghij", wp7.textAt(ct));
		
		HWordPosition wp8 = new HWordPosition(0, 4, 2);
		assertEquals("klmno", wp8.textAt(ct));
		
		HWordPosition wp9 = new HWordPosition(0, 4, 3);
		assertEquals("pqrst", wp9.textAt(ct));
		
		HWordPosition wp10 = new HWordPosition(0, 4, 4);
		assertEquals("uvwxy", wp10.textAt(ct));
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
     * The horizontal coordinate of the word.
     */
    public final int x;

    /**
     * The vertical coordinate of the word start.
     */
    public final int y1;

    /**
     * The vertical coordinate of the word end + 1.
     */
    public final int y2;

    public VWordPosition(int x, int y1, int y2) {
    }

    public VWordPosition(CharPosition start, int y2) {
    }

    public VWordPosition(int x, CharPosition end) {
    }

    /**
     * The word position is initialized
     * representing the left line of the specified block.
     */
    public VWordPosition(Block block) {
    }

    /**
     * Creates a trivial word position
     * which begins and ends at the specified character position.
     */
    public VWordPosition(CharPosition cp) {
    }

    /**
     * Returns the coordinates of the beginning of this word.
     */
    public CharPosition1 getStart();

    /**
     * Returns the coordinates of the ending of this word (exclusive).
     */
    public CharPosition2 getEnd();

    public int getWidth();

    public boolean equals(WordPosition wp);

    public boolean isTrivial();

    public boolean contains(int x, int y);

    public boolean liesIn(CharTable ct);

    /**
     * Verifies whether this word position intersects the specified char table.
     */
    public boolean intersects(CharTable ct);

    /**
     * Returns the width of the intersection of this line
     * with the specified block
     * or <code>0</code> if they are not intersected.
     */
    public int getLengthInsideOf(Block block);

    public String toString();

    /**
     * Returns the text at this position on the specified char table.
     *
     * The call is dispatched back to the specified char table
     * informing it about the concrete word position type.
     *
     * @param ct	the char table from which the text must be read.
     *
     * @return		the text at this position on the specified char table.
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
		CharTable ct = new CharTable(5, 5);
		ct.setText(0, 0, "abcde");
		ct.setText(1, 0, "fghij");
		ct.setText(2, 0, "klmno");
		ct.setText(3, 0, "pqrst");
		ct.setText(4, 0, "uvwxy");
		
		VWordPosition wp1 = new VWordPosition(0, 0, 0);
		assertEquals("a", wp1.textAt(ct));
		
		VWordPosition wp2 = new VWordPosition(1, 0, 0);
		assertEquals("f", wp2.textAt(ct));
		
		VWordPosition wp3 = new VWordPosition(2, 0, 0);
		assertEquals("k", wp3.textAt(ct));
		
		VWordPosition wp4 = new VWordPosition(3, 0, 0);
		assertEquals("p", wp4.textAt(ct));
		
		VWordPosition wp5 = new VWordPosition(4, 0, 0);
		assertEquals("u", wp5.textAt(ct));
		
		VWordPosition wp6 = new VWordPosition(0, 0, 4);
		assertEquals("afkpu", wp6.textAt(ct));
		
		VWordPosition wp7 = new VWordPosition(1, 0, 4);
		assertEquals("bgqlv", wp7.textAt(ct));
		
		VWordPosition wp8 = new VWordPosition(2, 0, 4);
		assertEquals("chrmw", wp8.textAt(ct));
		
		VWordPosition wp9 = new VWordPosition(3, 0, 4);
		assertEquals("disnx", wp9.textAt(ct));
		
		VWordPosition wp10 = new VWordPosition(4, 0, 4);
		assertEquals("ejtoy", wp10.textAt(ct));
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
     * The width of the word.
     */
    public final int width;

    public WordPosition(int width) {
    }

    /**
     * Returns the coordinates of the beginning of this word.
     */
    public abstract CharPosition1 getStart();

    /**
     * Returns the coordinates of the ending of this word (exclusive).
     */
    public abstract CharPosition2 getEnd();

    public int getWidth();

    public boolean equals(WordPosition wp);

    public boolean isTrivial();

    public boolean contains(int x, int y);

    public boolean liesIn(CharTable ct);

    /**
     * Verifies whether this word position intersects the specified char table.
     */
    public boolean intersects(CharTable ct);

    /**
     * Returns the width of the intersection of this line
     * with the specified block
     * or <code>0</code> if they are not intersected.
     */
    public int getLengthInsideOf(Block block);

    public String toString();

    /**
     * Returns the text at this position on the specified char table.
     *
     * The call is dispatched back to the specified char table
     * informing it about the concrete word position type.
     *
     * @param ct	the char table from which the text must be read.
     *
     * @return		the text at this position on the specified char table.
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
		CharTable ct = new CharTable(5, 5);
		ct.setText(0, 0, "abcde");
		ct.setText(0, 1, "fghij");
		ct.setText(0, 2, "klmno");
		ct.setText(0, 3, "pqrst");
		ct.setText(0, 4, "uvwxy");
		
		HWordPosition wp1 = new HWordPosition(0, 0, 0);
		assertEquals("a", wp1.textAt(ct));
		
		HWordPosition wp2 = new HWordPosition(1, 1, 0);
		assertEquals("b", wp2.textAt(ct));
		
		HWordPosition wp3 = new HWordPosition(2, 2, 0);
		assertEquals("c", wp3.textAt(ct));
		
		HWordPosition wp4 = new HWordPosition(3, 3, 0);
		assertEquals("d", wp4.textAt(ct));
		
		HWordPosition wp5 = new HWordPosition(4, 4, 0);
		assertEquals("e", wp5.textAt(ct));
		
		HWordPosition wp6 = new HWordPosition(0, 4, 0);
		assertEquals("abcde", wp6.textAt(ct));
		
		HWordPosition wp7 = new HWordPosition(0, 4, 1);
		assertEquals("fghij", wp7.textAt(ct));
		
		HWordPosition wp8 = new HWordPosition(0, 4, 2);
		assertEquals("klmno", wp8.textAt(ct));
		
		HWordPosition wp9 = new HWordPosition(0, 4, 3);
		assertEquals("pqrst", wp9.textAt(ct));
		
		HWordPosition wp10 = new HWordPosition(0, 4, 4);
		assertEquals("uvwxy", wp10.textAt(ct));
	}
}

// CharTable.java
package glengineer.blocks;

import glengineer.positions.CharPosition;
import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;

/**
 * Encapsulates a table of characters.
 *
 * The table is represented as a two-dimensional array of characters.
 * The table is mutable.
 */
public class CharTable {

    /**
     * The width of the table.
     */
    public final int width;

    /**
     * The height of the table.
     */
    public final int height;

    /**
     * The two-dimensional array of characters.
     */
    public final char[][] chars;

    /**
     * Creates a new char table of the specified size.
     *
     * @param width		the width of the table.
     * @param height	the height of the table.
     */
    public CharTable(int width, int height) {
    }

    /**
     * Creates a new char table of the specified size
     * and fills it with the specified text.
     *
     * @param width		the width of the table.
     * @param height	the height of the table.
     * @param text		the text to be filled into the table.
     */
    public CharTable(int width, int height, String text) {
    }

    /**
     * Returns the character at the specified position.
     *
     * @param x		the horizontal coordinate of the character.
     * @param y		the vertical coordinate of the character.
     *
     * @return		the character at the specified position.
     */
    public char charAt(int x, int y);

    /**
     * Returns the character at the specified position.
     *
     * @param cp	the position of the character.
     *
     * @return		the character at the specified position.
     */
    public char charAt(CharPosition cp);

    /**
     * Sets the character at the specified position.
     *
     * @param x		the horizontal coordinate of the character.
     * @param y		the vertical coordinate of the character.
     * @param c		the character to be set.
     */
    public void setChar(int x, int y, char c);

    /**
     * Sets the character at the specified position.
     *
     * @param cp	the position of the character.
     * @param c		the character to be set.
     */
    public void setChar(CharPosition cp, char c);

    /**
     * Sets the text at the specified position.
     *
     * @param x		the horizontal coordinate of the text.
     * @param y		the vertical coordinate of the text.
     * @param text	the text to be set.
     */
    public void setText(int x, int y, String text);

    /**
     * Sets the text at the specified position.
     *
     * @param cp	the position of the text.
     * @param text	the text to be set.
     */
    public void setText(CharPosition cp, String text);

    /**
     * Returns the text at the specified position.
     *
     * @param x		the horizontal coordinate of the text.
     * @param y		the vertical coordinate of the text.
     * @param width	the width of the text.
     *
     * @return		the text at the specified position.
     */
    public String textAt(int x, int y, int width);

    /**
     * Returns the text at the specified position.
     *
     * @param cp	the position of the text.
     * @param width	the width of the text.
     *
     * @return		the text at the specified position.
     */
    public String textAt(CharPosition cp, int width);

    /**
     * Returns the text at the specified position.
     *
     * @param wp	the position of the text.
     *
     * @return		the text at the specified position.
     */
    public String textAt(WordPosition wp);

    /**
     * Returns the text at the specified position.
     *
     * @param x		the horizontal coordinate of the text.
     * @param y		the vertical coordinate of the text.
     * @param width	the width of the text.
     * @param height	the height of the text.
     *
     * @return