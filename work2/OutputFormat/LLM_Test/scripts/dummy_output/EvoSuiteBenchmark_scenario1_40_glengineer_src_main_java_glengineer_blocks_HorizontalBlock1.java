// HorizontalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlockTest {
		
    /**
     * Test case 1.
     * The block is empty.
     */
    @Test
    void testExtractParallelSubblocks1() {
        HorizontalBlock block = new HorizontalBlock();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(0, subblocks.size());
    }

    /**
     * Test case 2.
     * The block contains one word.
     */
    @Test
    void testExtractParallelSubblocks2() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(1, subblocks.get(0).size());
    }

    /**
     * Test case 3.
     * The block contains two words.
     */
    @Test
    void testExtractParallelSubblocks3() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(2, subblocks.get(0).size());
    }

    /**
     * Test case 4.
     * The block contains three words.
     */
    @Test
    void testExtractParallelSubblocks4() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        block.add(new HWordPosition(40, 0, 50, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(3, subblocks.get(0).size());
    }

    /**
     * Test case 5.
     * The block contains three words and one line.
     */
    @Test
    void testExtractParallelSubblocks5() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        block.add(new HWordPosition(40, 0, 50, 10));
        block.add(new HLinePosition(30, 0, 30, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(2, subblocks.get(0).size());
        assertEquals(1, subblocks.get(1).size());
    }

    /**
     * Test case 6.
     * The block contains three words and two lines.
     */
    @Test
    void testExtractParallelSubblocks6() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        block.add(new HWordPosition(40, 0, 50, 10));
        block.add(new HLinePosition(30, 0, 30, 10));
        block.add(new HLinePosition(10, 0, 10, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(1, subblocks.get(0).size());
        assertEquals(1, subblocks.get(1).size());
        assertEquals(1, subblocks.get(2).size());
    }

    /**
     * Test case 7.
     * The block contains three words and three lines.
     */
    @Test
    void testExtractParallelSubblocks7() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        block.add(new HWordPosition(40, 0, 50, 10));
        block.add(new HLinePosition(30, 0, 30, 10));
        block.add(new HLinePosition(10, 0, 10, 10));
        block.add(new HLinePosition(50, 0, 50, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(1, subblocks.get(0).size());
        assertEquals(1, subblocks.get(1).size());
        assertEquals(1, subblocks.get(2).size());
    }

    /**
     * Test case 8.
     * The block contains three words and four lines.
     */
    @Test
    void testExtractParallelSubblocks8() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        block.add(new HWordPosition(40, 0, 50, 10));
        block.add(new HLinePosition(30, 0, 30, 10));
        block.add(new HLinePosition(10, 0, 10, 10));
        block.add(new HLinePosition(50, 0, 50, 10));
        block.add(new HLinePosition(0, 0, 0, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(4, subblocks.size());
        assertEquals(1, subblocks.get(0).size());
        assertEquals(1, subblocks.get(1).size());
        assertEquals(1, subblocks.get(2).size());
        assertEquals(1, subblocks.get(3).size());
    }

    /**
     * Test case 9.
     * The block contains three words and five lines.
     */
    @Test
    void testExtractParallelSubblocks9() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        block.add(new HWordPosition(40, 0, 50, 10));
        block.add(new HLinePosition(30, 0, 30, 10));
        block.add(new HLinePosition(10, 0, 10, 10));
        block.add(new HLinePosition(50, 0, 50, 10));
        block.add(new HLinePosition(0, 0, 0, 10));
        block.add(new HLinePosition(60, 0, 60, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(5, subblocks.size());
        assertEquals(1, subblocks.get(0).size());
        assertEquals(1, subblocks.get(1).size());
        assertEquals(1, subblocks.get(2).size());
        assertEquals(1, subblocks.get(3).size());
        assertEquals(1, subblocks.get(4).size());
    }

    /**
     * Test case 10.
     * The block contains three words and six lines.
     */
    @Test
    void testExtractParallelSubblocks10() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new HWordPosition(0, 0, 10, 10));
        block.add(new HWordPosition(20, 0, 30, 10));
        block.add(new HWordPosition(40, 0, 50, 10));
        block.add(new HLinePosition(30, 0, 30, 10));
        block.add(new HLinePosition(10, 0, 10, 10));
        block.add(new HLinePosition(50, 0, 50, 10));
        block.add(new HLinePosition(0, 0, 0, 10));
        block.add(new HLinePosition(60, 0, 60, 10));
        block.add(new HLinePosition(70, 0, 70, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(6, subblocks.size());
        assertEquals(1, subblocks.get(0).size());
        assertEquals(1, subblocks.get(1).size());
        assertEquals(1, subblocks.get(2).size());
        assertEquals(1, subblocks.get(3).size());
        assertEquals(1, subblocks.get(4).size());
        assertEquals(1, subblocks.get(5).size());
    }
}