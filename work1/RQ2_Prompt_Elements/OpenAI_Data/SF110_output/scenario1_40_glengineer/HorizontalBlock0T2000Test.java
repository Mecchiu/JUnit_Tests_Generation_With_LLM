// HorizontalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlockTest {

    @Test
    void testExtractSequentialSubblocks1() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(0, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(0, result.size());
    }

    @Test
    void testExtractSequentialSubblocks2() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(1, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(new CharPosition1(0, 0), result.get(0).x1);
        assertEquals(new CharPosition1(1, 0), result.get(0).x2);
    }

    @Test
    void testExtractSequentialSubblocks3() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(2, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new CharPosition1(0, 0), result.get(0).x1);
        assertEquals(new CharPosition1(1, 0), result.get(0).x2);
        assertEquals(new CharPosition1(1, 0), result.get(1).x1);
        assertEquals(new CharPosition1(2, 0), result.get(1).x2);
    }

    @Test
    void testExtractSequentialSubblocks4() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(3, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new CharPosition1(0, 0), result.get(0).x1);
        assertEquals(new CharPosition1(1, 0), result.get(0).x2);
        assertEquals(new CharPosition1(1, 0), result.get(1).x1);
        assertEquals(new CharPosition1(2, 0), result.get(1).x2);
        assertEquals(new CharPosition1(2, 0), result.get(2).x1);
        assertEquals(new CharPosition1(3, 0), result.get(2).x2);
    }

    @Test
    void testExtractSequentialSubblocks5() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(4, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(4, result.size());
        assertEquals(new CharPosition1(0, 0), result.get(0).x1);
        assertEquals(new CharPosition1(1, 0), result.get(0).x2);
        assertEquals(new CharPosition1(1, 0), result.get(1).x1);
        assertEquals(new CharPosition1(2, 0), result.get(1).x2);
        assertEquals(new CharPosition1(2, 0), result.get(2).x1);
        assertEquals(new CharPosition1(3, 0), result.get(2).x2);
        assertEquals(new CharPosition1(3, 0), result.get(3).x1);
        assertEquals(new CharPosition1(4, 0), result.get(3).x2);
    }

    @Test
    void testExtractSequentialSubblocks6() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(5, result.size());
        assertEquals(new CharPosition1(0, 0), result.get(0).x1);
        assertEquals(new CharPosition1(1, 0), result.get(0).x2);
        assertEquals(new CharPosition1(1, 0), result.get(1).x1);
        assertEquals(new CharPosition1(2, 0), result.get(1).x2);
        assertEquals(new CharPosition1(2, 0), result.get(2).x1);
        assertEquals(new CharPosition1(3, 0), result.get(2).x2);
        assertEquals(new CharPosition1(3, 0), result.get(3).x1);
        assertEquals(new CharPosition1(4, 0), result.get(3).x2);
        assertEquals(new CharPosition1(4, 0), result.get(4).x1);
        assertEquals(new CharPosition1(5, 0), result.get(4).x2);
    }

    @Test
    void testExtractSequentialSubblocks7() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(6, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(6, result.size());
        assertEquals(new CharPosition1(0, 0), result.get(0).x1);
        assertEquals(new CharPosition1(1, 0), result.get(0).x2);
        assertEquals(new CharPosition1(1, 0), result.get(1).x1);
        assertEquals(new CharPosition1(2, 0), result.get(1).x2);
        assertEquals(new CharPosition1(2, 0), result.get(2).x1);
        assertEquals(new CharPosition1(3, 0), result.get(2).x2);
        assertEquals(new CharPosition1(3, 0), result.get(3).x1);
        assertEquals(new CharPosition1(4, 0), result.get(3).x2);
        assertEquals(new CharPosition1(4, 0), result.get(4).x1);
        assertEquals(new CharPosition1(5, 0), result.get(4).x2);
        assertEquals(new CharPosition1(5, 0), result.get(5).x1);
        assertEquals(new CharPosition1(6, 0), result.get(5).x2);
    }

    @Test
    void testExtractSequentialSubblocks8() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(7, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(7, result.size());
        assertEquals(new CharPosition1(0, 0), result.get(0).x1);
        assertEquals(new CharPosition1(1, 0), result.get(0).x2);
        assertEquals(new CharPosition1(1, 0), result.get(1).x1);
        assertEquals(new CharPosition1(2, 0), result.get(1).x2);
        assertEquals(new CharPosition1(2, 0), result.get(2).x1);
        assertEquals(new CharPosition1(3, 0), result.get(2).x2);
        assertEquals(new CharPosition1(3, 0), result.get(3).x1);
        assertEquals(new CharPosition1(4, 0), result.get(3).x2);
        assertEquals(new CharPosition1(4, 0), result.get(4).x1);
        assertEquals(new CharPosition1(5, 0), result.get(4).x2);
        assertEquals(new CharPosition1(5, 0), result.get(5).x1);
        assertEquals(new CharPosition1(6, 0), result.get(5).x2);
        assertEquals(new CharPosition1(6, 0), result.get(6).x1);
        assertEquals(new CharPosition1(7, 0), result.get(6).x2);
    }

    @Test
    void testExtractSequentialSubblocks9() {
        HorizontalBlock block =