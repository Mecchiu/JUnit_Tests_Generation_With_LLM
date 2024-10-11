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
		ct.setCharAt(0, 0, 'A');
		ct.setCharAt(0, 1, 'B');
		ct.setCharAt(0, 2, 'C');
		ct.setCharAt(0, 3, 'D');
		ct.setCharAt(0, 4, 'E');
		ct.setCharAt(0, 5, 'F');
		ct.setCharAt(0, 6, 'G');
		ct.setCharAt(0, 7, 'H');
		ct.setCharAt(0, 8, 'I');
		ct.setCharAt(0, 9, 'J');
		ct.setCharAt(1, 0, 'K');
		ct.setCharAt(1, 1, 'L');
		ct.setCharAt(1, 2, 'M');
		ct.setCharAt(1, 3, 'N');
		ct.setCharAt(1, 4, 'O');
		ct.setCharAt(1, 5, 'P');
		ct.setCharAt(1, 6, 'Q');
		ct.setCharAt(1, 7, 'R');
		ct.setCharAt(1, 8, 'S');
		ct.setCharAt(1, 9, 'T');
		ct.setCharAt(2, 0, 'U');
		ct.setCharAt(2, 1, 'V');
		ct.setCharAt(2, 2, 'W');
		ct.setCharAt(2, 3, 'X');
		ct.setCharAt(2, 4, 'Y');
		ct.setCharAt(2, 5, 'Z');
		ct.setCharAt(2, 6, 'A');
		ct.setCharAt(2, 7, 'B');
		ct.setCharAt(2, 8, 'C');
		ct.setCharAt(2, 9, 'D');
		ct.setCharAt(3, 0, 'E');
		ct.setCharAt(3, 1, 'F');
		ct.setCharAt(3, 2, 'G');
		ct.setCharAt(3, 3, 'H');
		ct.setCharAt(3, 4, 'I');
		ct.setCharAt(3, 5, 'J');
		ct.setCharAt(3, 6, 'K');
		ct.setCharAt(3, 7, 'L');
		ct.setCharAt(3, 8, 'M');
		ct.setCharAt(3, 9, 'N');
		ct.setCharAt(4, 0, 'O');
		ct.setCharAt(4, 1, 'P');
		ct.setCharAt(4, 2, 'Q');
		ct.setCharAt(4, 3, 'R');
		ct.setCharAt(4, 4, 'S');
		ct.setCharAt(4, 5, 'T');
		ct.setCharAt(4, 6, 'U');
		ct.setCharAt(4, 7, 'V');
		ct.setCharAt(4, 8, 'W');
		ct.setCharAt(4, 9, 'X');
		ct.setCharAt(5, 0, 'Y');
		ct.setCharAt(5, 1, 'Z');
		ct.setCharAt(5, 2, 'A');
		ct.setCharAt(5, 3, 'B');
		ct.setCharAt(5, 4, 'C');
		ct.setCharAt(5, 5, 'D');
		ct.setCharAt(5, 6, 'E');
		ct.setCharAt(5, 7, 'F');
		ct.setCharAt(5, 8, 'G');
		ct.setCharAt(5, 9, 'H');
		ct.setCharAt(6, 0, 'I');
		ct.setCharAt(6, 1, 'J');
		ct.setCharAt(6, 2, 'K');
		ct.setCharAt(6, 3, 'L');
		ct.setCharAt(6, 4, 'M');
		ct.setCharAt(6, 5, 'N');
		ct.setCharAt(6, 6, 'O');
		ct.setCharAt(6, 7, 'P');
		ct.setCharAt(6, 8, 'Q');
		ct.setCharAt(6, 9, 'R');
		ct.setCharAt(7, 0, 'S');
		ct.setCharAt(7, 1, 'T');
		ct.setCharAt(7, 2, 'U');
		ct.setCharAt(7, 3, 'V');
		ct.setCharAt(7, 4, 'W');
		ct.setCharAt(7, 5, 'X');
		ct.setCharAt(7, 6, 'Y');
		ct.setCharAt(7, 7, 'Z');
		ct.setCharAt(7, 8, 'A');
		ct.setCharAt(7, 9, 'B');
		ct.setCharAt(8, 0, 'C');
		ct.setCharAt(8, 1, 'D');
		ct.setCharAt(8, 2, 'E');
		ct.setCharAt(8, 3, 'F');
		ct.setCharAt(8, 4, 'G');
		ct.setCharAt(8, 5, 'H');
		ct.setCharAt(8, 6, 'I');
		ct.setCharAt(8, 7, 'J');
		ct.setCharAt(8, 8, 'K');
		ct.setCharAt(8, 9, 'L');
		ct.setCharAt(9, 0, 'M');
		ct.setCharAt(9, 1, 'N');
		ct.setCharAt(9, 2, 'O');
		ct.setCharAt(9, 3, 'P');
		ct.setCharAt(9, 4, 'Q');
		ct.setCharAt(9, 5, 'R');
		ct.setCharAt(9, 6, 'S');
		ct.setCharAt(9, 7, 'T');
		ct.setCharAt(9, 8, 'U');
		ct.setCharAt(9, 9, 'V');
		
		VWordPosition wp = new VWordPosition(0, 0, 0, 9);
		assertEquals("ABCDEFGHIJ", wp.textAt(ct));
		wp = new VWordPosition(0, 0, 9, 0);
		assertEquals("MNBOCPDQER", wp.textAt(ct));
		wp = new VWordPosition(0, 0, 9, 9);
		assertEquals("MNBOCPDQER", wp.textAt(ct));
		wp = new VWordPosition(0, 9, 0, 0);
		assertEquals("JIHGFEDCBA", wp.textAt(ct));
		wp = new VWordPosition(0, 9, 9, 0);
		assertEquals("JIHGFEDCBA", wp.textAt(ct));
		wp = new VWordPosition(0, 9, 9, 9);
		assertEquals("JIHGFEDCBA", wp.textAt(ct));
		wp = new VWordPosition(9, 0, 0, 0);
		assertEquals("MNBOCPDQER", wp.textAt(ct));
		wp = new VWordPosition(9, 0, 0, 9);
		assertEquals("MNBOCPDQER", wp.textAt(ct));
		wp = new VWordPosition(9, 0, 9, 0);
		assertEquals("MNBOCPDQER", wp.textAt(ct));
		wp = new VWordPosition(9, 0, 9, 9);
		assertEquals("MNBOCPDQER", wp.textAt(ct));
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

    protected int startX;
    protected int startY;
    protected int endX;
    protected int endY;

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
		CharTable ct = new CharTable(10, 10);
		ct.setCharAt(0, 0, 'A');
		ct.setCharAt(0, 1, 'B');
		ct.setCharAt(0, 2, 'C');
		ct.setCharAt(0, 3, 'D');
		ct.setCharAt(0, 4, 'E');
		ct.setCharAt(0, 5, 'F');
		ct.setCharAt(0, 6, 'G');
		ct.setCharAt(0, 7, 'H');
		ct.setCharAt(0, 8, 'I');
		ct.setCharAt(0, 9, 'J');
		ct.setCharAt(1, 0, 'K');
		ct.setCharAt(1, 1, 'L');
		ct.setCharAt(1, 2, 'M');
		ct.setCharAt(1, 3, 'N');
		ct.setCharAt(1, 4, 'O');
		ct.setCharAt(1, 5, 'P');
		ct.setCharAt(1, 6, 'Q');
		ct.setCharAt(1, 7, 'R');
		ct.setCharAt(1, 8, 'S');
		ct.setCharAt(1, 9, 'T');
		ct.setCharAt(2, 0, 'U');
		ct.setCharAt(2, 1, 'V');
		ct.setCharAt(2, 2, 'W');
		ct.setCharAt(2, 3, 'X');
		ct.setCharAt(2, 4, 'Y');
		ct.setCharAt(2, 5, 'Z');
		ct.setCharAt(2, 6, 'A');
		ct.setCharAt(2, 7, 'B');
		ct.setCharAt(2, 8, 'C');
		ct.setCharAt(2, 9, 'D');
		ct.setCharAt(3, 0, 'E');
		ct.setCharAt(3, 1, 'F');
		ct.setCharAt(3, 2, 'G');
		ct.setCharAt(3, 3, 'H');
		ct.setCharAt(3, 4, 'I');
		ct.setCharAt(3, 5, 'J');
		ct.setCharAt(3, 6, 'K');
		ct.setCharAt(3, 7, 'L');
		ct.setCharAt(3, 8, 'M');
		ct.setCharAt(3, 9, 'N');
		ct.setCharAt(4, 0, 'O');
		ct.setCharAt(4, 1, 'P');
		ct.setCharAt(4, 2, 'Q');
		ct.setCharAt(4, 3, 'R');
		ct.setCharAt(4, 4, 'S');
		ct.setCharAt(4, 5, 'T');
		ct.setCharAt(4, 6, 'U');
		ct.setCharAt(4, 7, 'V');
		ct.setCharAt(4, 8, 'W');
		ct.setCharAt(4, 9, 'X');
		ct.setCharAt(5, 0, 'Y');
		ct.setCharAt(5, 1, 'Z');
		ct.setCharAt(5, 2, 'A');
		ct.setCharAt(5, 3, 'B');
		ct.setCharAt(5, 4, 'C');
		ct.setCharAt(5, 5, 'D');
		ct.setCharAt(5, 6, 'E');
		ct.setCharAt(5, 7, 'F');
		ct.setCharAt(5, 8, 'G');
		ct.setCharAt(5, 9, 'H');
		ct.setCharAt(6, 0, 'I');
		ct.setCharAt(6, 1, 'J');
		ct.setCharAt(6, 2, 'K');
		ct.setCharAt(6, 3, 'L');
		ct.setCharAt(6, 4, 'M');
		ct.setCharAt(6, 5, 'N');
		ct.setCharAt(6, 6, 'O');
		ct.setCharAt(6, 7, 'P');
		ct.setCharAt(6, 8, 'Q');
		ct.setCharAt(6, 9, 'R');
		ct.setCharAt(7, 0, 'S');
		ct.setCharAt(7, 1, 'T');
		ct.setCharAt(7, 2, 'U');
		ct.setCharAt(7, 3, 'V');
		ct.setCharAt(7, 4, 'W');
		ct.setCharAt(7, 5, 'X');
		ct.setCharAt(7, 6, 'Y');
		ct.setCharAt(7, 7, 'Z');
		ct.setCharAt(7, 8, 'A');
		ct.setCharAt(7, 9, 'B');
		ct.setCharAt(8, 0, 'C');
		ct.setCharAt(8, 1, 'D');
		ct.setCharAt(8, 2, 'E');
		ct.setCharAt(8, 3, 'F');
		ct.setCharAt(8, 4, 'G');
		ct.setCharAt(8, 5, 'H');
		ct.setCharAt(8, 6, 'I');
		ct.setCharAt(8, 7, 'J');
		ct.setCharAt(8, 8, 'K');
		ct.setCharAt(8, 9, 'L');
		ct.setCharAt(9, 0, 'M');
		ct.setCharAt(9, 1, 'N');
		ct.setCharAt(9, 2, 'O');
		ct.setCharAt(9, 3, 'P');
		ct.setCharAt(9, 4, 'Q');
		ct.setCharAt(9, 5, 'R');
		ct.setCharAt(9, 6, 'S');
		ct.