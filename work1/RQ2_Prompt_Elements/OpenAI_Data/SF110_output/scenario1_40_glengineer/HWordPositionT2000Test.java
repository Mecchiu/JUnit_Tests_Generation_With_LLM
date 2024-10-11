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
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(1, 0, 'b');
		ct.setCharAt(2, 0, 'c');
		ct.setCharAt(3, 0, 'd');
		ct.setCharAt(4, 0, 'e');
		
		HWordPosition wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 0, 0);
		assertEquals("a", wp.textAt(ct));
		
		wp = new HWordPosition(4, 0, 4, 0);
		assertEquals("e", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 1, 0);
		assertEquals("ab", wp.textAt(ct));
		
		wp = new HWordPosition(1, 0, 4, 0);
		assertEquals("bcde", wp.textAt(ct));
		
		wp = new HWordPosition(1, 0, 2, 0);
		assertEquals("bc", wp.textAt(ct));
		
		wp = new HWordPosition(2, 0, 3, 0);
		assertEquals("cd", wp.textAt(ct));
		
		wp = new HWordPosition(3, 0, 4, 0);
		assertEquals("de", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 2, 0);
		assertEquals("abc", wp.textAt(ct));
		
		wp = new HWordPosition(2, 0, 4, 0);
		assertEquals("cde", wp.textAt(ct));
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
		
	@Test
	void testTextAt() {
		CharTable ct = new CharTable(5, 5);
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(0, 1, 'b');
		ct.setCharAt(0, 2, 'c');
		ct.setCharAt(0, 3, 'd');
		ct.setCharAt(0, 4, 'e');
		
		VWordPosition wp = new VWordPosition(0, 0, 0, 4);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new VWordPosition(0, 0, 0, 0);
		assertEquals("a", wp.textAt(ct));
		
		wp = new VWordPosition(0, 4, 0, 4);
		assertEquals("e", wp.textAt(ct));
		
		wp = new VWordPosition(0, 0, 0, 1);
		assertEquals("ab", wp.textAt(ct));
		
		wp = new VWordPosition(0, 1, 0, 4);
		assertEquals("bcde", wp.textAt(ct));
		
		wp = new VWordPosition(0, 1, 0, 2);
		assertEquals("bc", wp.textAt(ct));
		
		wp = new VWordPosition(0, 2, 0, 3);
		assertEquals("cd", wp.textAt(ct));
		
		wp = new VWordPosition(0, 3, 0, 4);
		assertEquals("de", wp.textAt(ct));
		
		wp = new VWordPosition(0, 0, 0, 2);
		assertEquals("abc", wp.textAt(ct));
		
		wp = new VWordPosition(0, 2, 0, 4);
		assertEquals("cde", wp.textAt(ct));
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

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public WordPosition(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

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
		ct.setCharAt(0, 0, 'a');
		ct.setCharAt(1, 0, 'b');
		ct.setCharAt(2, 0, 'c');
		ct.setCharAt(3, 0, 'd');
		ct.setCharAt(4, 0, 'e');
		
		WordPosition wp = new HWordPosition(0, 0, 4, 0);
		assertEquals("abcde", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 0, 0);
		assertEquals("a", wp.textAt(ct));
		
		wp = new HWordPosition(4, 0, 4, 0);
		assertEquals("e", wp.textAt(ct));
		
		wp = new HWordPosition(0, 0, 1, 0);
		assertEquals("ab", wp.textAt(ct));
		
		wp = new HWordPosition(1, 0, 4, 0);
		assertEquals("bcde", wp.textAt(ct));
		
		wp = new HWordPosition(1, 0, 2, 0);
		assertEquals("bc", wp.textAt(ct));
		
		wp = new HWordPosition(2, 0, 3, 0);
		assertEquals("cd", wp.textAt(ct));
		
		wp = new HWordPosition