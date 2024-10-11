// Here's an example implementation of the HorizontalBlock class and a test class for it.

// HorizontalBlock.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;

/**
 * An implementation of the abstract class {@code Block}
 * used for horizontal layouting.
 */
public class HorizontalBlock extends Block {

    /**
     * Divides the current block into a set of sequential subblocks,
     * optimizes these subblocks and returns them as a linked list.
     *
     * @return a list of optimized sequential subblocks.
     */
    public List<Block> extractSequentialSubblocks() {
        List<Block> subblocks = new LinkedList<>();
        List<Position> positions = getPositions();
        int start = 0;
        for (int i = 1; i < positions.size(); i++) {
            if (positions.get(i).getX() != positions.get(i-1).getX() + 1) {
                subblocks.add(new HorizontalBlock(positions.subList(start, i)));
                start = i;
            }
        }
        subblocks.add(new HorizontalBlock(positions.subList(start, positions.size())));
        return subblocks;
    }
}

// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {
    @Test
    void testExtractSequentialSubblocks_emptyBlock() {
        Block block = new HorizontalBlock(new ArrayList<>());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(0, subblocks.size());
    }

    @Test
    void testExtractSequentialSubblocks_singleBlock() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_twoSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(1, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_twoNonSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(2, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(2, 0))), subblocks.get(1));
    }

    @Test
    void testExtractSequentialSubblocks_threeSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(1, 0), new Position(2, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_threeNonSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(2, 0), new Position(4, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(2, 0))), subblocks.get(1));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(4, 0))), subblocks.get(2));
    }

    @Test
    void testExtractSequentialSubblocks_fourSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(1, 0), new Position(2, 0), new Position(3, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_fourNonSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(2, 0), new Position(4, 0), new Position(6, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(4, subblocks.size());
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(2, 0))), subblocks.get(1));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(4, 0))), subblocks.get(2));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(6, 0))), subblocks.get(3));
    }

    @Test
    void testExtractSequentialSubblocks_fiveSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(1, 0), new Position(2, 0), new Position(3, 0), new Position(4, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_fiveNonSequentialBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(2, 0), new Position(4, 0), new Position(6, 0), new Position(8, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(5, subblocks.size());
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(2, 0))), subblocks.get(1));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(4, 0))), subblocks.get(2));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(6, 0))), subblocks.get(3));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(8, 0))), subblocks.get(4));
    }

    @Test
    void testExtractSequentialSubblocks_randomBlocks() {
        Block block = new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(1, 0), new Position(3, 0), new Position(4, 0), new Position(5, 0), new Position(7, 0), new Position(8, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(4, subblocks.size());
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(1, 0))), subblocks.get(0));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(3, 0), new Position(4, 0), new Position(5, 0))), subblocks.get(1));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(7, 0), new Position(8, 0))), subblocks.get(2));
        assertEquals(new HorizontalBlock(Arrays.asList(new Position(0, 0), new Position(1, 0), new Position(3, 0), new Position(4, 0), new Position(5, 0), new Position(7, 0), new Position(8, 0))), subblocks.get(3));
    }
}