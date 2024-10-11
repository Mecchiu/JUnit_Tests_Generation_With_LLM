// Here's an example implementation of the HWordPosition class and its test class:

// HWordPosition.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;

/**
 * Encapsulates the position (start and end coordinates)
 * of a word lying horizontally on the scheme.
 */
public class HWordPosition extends WordPosition {
    private int row;
    private int startCol;
    private int endCol;

    public HWordPosition(int row, int startCol, int endCol) {
        this.row = row;
        this.startCol = startCol;
        this.endCol = endCol;
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
    public String textAt(CharTable ct) {
        StringBuilder sb = new StringBuilder();
        for (int col = startCol; col <= endCol; col++) {
            Block block = ct.getBlock(row, col);
            if (block != null) {
                sb.append(block.getChar());
            }
        }
        return sb.toString();
    }
}

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
    void testTextAt_emptyTable() {
        CharTable ct = new CharTable(0, 0);
        HWordPosition pos = new HWordPosition(0, 0, 0);
        assertEquals("", pos.textAt(ct));
    }

    @Test
    void testTextAt_singleBlock() {
        CharTable ct = new CharTable(1, 1);
        ct.setBlock(0, 0, new Block('A'));
        HWordPosition pos = new HWordPosition(0, 0, 0);
        assertEquals("A", pos.textAt(ct));
    }

    @Test
    void testTextAt_singleRow() {
        CharTable ct = new CharTable(1, 5);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(0, 1, new Block('B'));
        ct.setBlock(0, 2, new Block('C'));
        ct.setBlock(0, 3, new Block('D'));
        ct.setBlock(0, 4, new Block('E'));
        HWordPosition pos = new HWordPosition(0, 1, 3);
        assertEquals("BCD", pos.textAt(ct));
    }

    @Test
    void testTextAt_singleColumn() {
        CharTable ct = new CharTable(5, 1);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(1, 0, new Block('B'));
        ct.setBlock(2, 0, new Block('C'));
        ct.setBlock(3, 0, new Block('D'));
        ct.setBlock(4, 0, new Block('E'));
        HWordPosition pos = new HWordPosition(2, 0, 0);
        assertEquals("C", pos.textAt(ct));
    }

    @Test
    void testTextAt_multipleRows() {
        CharTable ct = new CharTable(3, 5);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(0, 1, new Block('B'));
        ct.setBlock(0, 2, new Block('C'));
        ct.setBlock(1, 2, new Block('D'));
        ct.setBlock(1, 3, new Block('E'));
        ct.setBlock(2, 2, new Block('F'));
        ct.setBlock(2, 3, new Block('G'));
        ct.setBlock(2, 4, new Block('H'));
        HWordPosition pos = new HWordPosition(1, 2, 4);
        assertEquals("DE", pos.textAt(ct));
    }

    @Test
    void testTextAt_multipleColumns() {
        CharTable ct = new CharTable(5, 3);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(1, 0, new Block('B'));
        ct.setBlock(2, 0, new Block('C'));
        ct.setBlock(2, 1, new Block('D'));
        ct.setBlock(3, 1, new Block('E'));
        ct.setBlock(2, 2, new Block('F'));
        ct.setBlock(3, 2, new Block('G'));
        ct.setBlock(4, 2, new Block('H'));
        HWordPosition pos = new HWordPosition(2, 0, 2);
        assertEquals("ABC", pos.textAt(ct));
    }

    @Test
    void testTextAt_emptyRow() {
        CharTable ct = new CharTable(3, 3);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(0, 1, new Block('B'));
        ct.setBlock(0, 2, new Block('C'));
        HWordPosition pos = new HWordPosition(1, 0, 2);
        assertEquals("", pos.textAt(ct));
    }

    @Test
    void testTextAt_emptyColumn() {
        CharTable ct = new CharTable(3, 3);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(1, 0, new Block('B'));
        ct.setBlock(2, 0, new Block('C'));
        HWordPosition pos = new HWordPosition(0, 1, 2);
        assertEquals("", pos.textAt(ct));
    }

    @Test
    void testTextAt_nullBlock() {
        CharTable ct = new CharTable(1, 3);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(0, 2, new Block('C'));
        HWordPosition pos = new HWordPosition(0, 0, 2);
        assertEquals("A\u0000C", pos.textAt(ct));
    }

    @Test
    void testTextAt_outOfBounds() {
        CharTable ct = new CharTable(2, 2);
        ct.setBlock(0, 0, new Block('A'));
        ct.setBlock(1, 1, new Block('B'));
        HWordPosition pos = new HWordPosition(0, 0, 3);
        assertEquals("A", pos.textAt(ct));
    }
}