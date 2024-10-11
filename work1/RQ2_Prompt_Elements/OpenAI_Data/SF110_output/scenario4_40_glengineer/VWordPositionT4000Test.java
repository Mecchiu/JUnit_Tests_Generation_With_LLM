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
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt1() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(1, 1);
		assertEquals("e", vwp.textAt(ct));
	}

	/**
	 * Test case 2.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt2() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(2, 2);
		assertEquals("f", vwp.textAt(ct));
	}

	/**
	 * Test case 3.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt3() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(0, 0);
		assertEquals("a", vwp.textAt(ct));
	}

	/**
	 * Test case 4.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt4() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(2, 0);
		assertEquals("c", vwp.textAt(ct));
	}

	/**
	 * Test case 5.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt5() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(0, 2);
		assertEquals("g", vwp.textAt(ct));
	}

	/**
	 * Test case 6.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt6() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(1, 0);
		assertEquals("b", vwp.textAt(ct));
	}

	/**
	 * Test case 7.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt7() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(0, 1);
		assertEquals("d", vwp.textAt(ct));
	}

	/**
	 * Test case 8.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt8() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(2, 1);
		assertEquals("f", vwp.textAt(ct));
	}

	/**
	 * Test case 9.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt9() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(1, 2);
		assertEquals("h", vwp.textAt(ct));
	}

	/**
	 * Test case 10.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt10() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition vwp = new VWordPosition(2, 0);
		assertEquals("c", vwp.textAt(ct));
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
public abstract class WordPosition implements Comparable<WordPosition> {

    /**
     * The vertical coordinate of the word.
     */
    public final int y;

    /**
     * The horizontal coordinate of the word start.
     */
    public final int x1;

    /**
     * The horizontal coordinate of the word end + 1.
     */
    public final int x2;

    public WordPosition(int x1, int x2, int y) {
    }

    public WordPosition(CharPosition start, int x2) {
    }

    public WordPosition(int x, CharPosition end) {
    }

    public WordPosition(Block block) {
    }

    /**
     * Creates a trivial word position
     * which begins and ends at the specified character position.
     */
    public WordPosition(CharPosition cp) {
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

    /**
     * Compares this horizontal position with the specified one
     * according to their y-coordinates.
     */
    public int compareTo(WordPosition hLine);

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
		
	/**
	 * Test case 1.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt1() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(1, 1);
		assertEquals("e", wp.textAt(ct));
	}

	/**
	 * Test case 2.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt2() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(2, 2);
		assertEquals("f", wp.textAt(ct));
	}

	/**
	 * Test case 3.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt3() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(0, 0);
		assertEquals("a", wp.textAt(ct));
	}

	/**
	 * Test case 4.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt4() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(2, 0);
		assertEquals("c", wp.textAt(ct));
	}

	/**
	 * Test case 5.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt5() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(0, 2);
		assertEquals("g", wp.textAt(ct));
	}

	/**
	 * Test case 6.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt6() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(1, 0);
		assertEquals("b", wp.textAt(ct));
	}

	/**
	 * Test case 7.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt7() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(0, 1);
		assertEquals("d", wp.textAt(ct));
	}

	/**
	 * Test case 8.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt8() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(2, 1);
		assertEquals("f", wp.textAt(ct));
	}

	/**
	 * Test case 9.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt9() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(1, 2);
		assertEquals("h", wp.textAt(ct));
	}

	/**
	 * Test case 10.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt10() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		WordPosition wp = new WordPosition(2, 0);
		assertEquals("c", wp.textAt(ct));
	}
}

// CharPosition.java
package glengineer.positions;

/**
 * Encapsulates the coordinates of a character on the scheme.
 */
public class CharPosition implements Comparable<CharPosition> {

    /**
     * The horizontal coordinate of the character.
     */
    public final int x;

    /**
     * The vertical coordinate of the character.
     */
    public final int y;

    public CharPosition(int x, int y) {
    }

    public CharPosition(CharPosition cp) {
    }

    public boolean equals(CharPosition cp);

    public boolean equals(int x, int y);

    public int compareTo(CharPosition cp);

    public String toString();
}

// CharPosition1.java
package glengineer.positions;

/**
 * Encapsulates the coordinates of the beginning of a word.
 */
public class CharPosition1 extends CharPosition {

    public CharPosition1(int x, int y) {
    }

    public CharPosition1(CharPosition cp) {
    }
}

// CharPosition2.java
package glengineer.positions;

/**
 * Encapsulates the coordinates of the ending of a word (exclusive).
 */
public class CharPosition2 extends CharPosition {

    public CharPosition2(int x, int y) {
    }

    public CharPosition2(CharPosition cp) {
    }
}

// CharPositionTest.java
package glengineer.positions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CharPosition}.
* It contains ten unit test cases for the {@link CharPosition#equals(CharPosition)} method.
