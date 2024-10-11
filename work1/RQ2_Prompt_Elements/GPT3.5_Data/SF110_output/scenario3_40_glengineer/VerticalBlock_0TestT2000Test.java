// Here's an example implementation of the VerticalBlock class and a test class for it:

// VerticalBlock.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;

/**
 * An implementation of the abstract class {@code Block}
 * used for vertical layouting.
 */
public class VerticalBlock extends Block {

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
            if (positions.get(i).getY() > positions.get(i-1).getY()) {
                subblocks.add(new VerticalBlock(positions.subList(start, i)));
                start = i;
            }
        }
        subblocks.add(new VerticalBlock(positions.subList(start, positions.size())));
        return optimizeSequentialSubblocks(subblocks);
    }
}

// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {

    @Test
    void testExtractSequentialSubblocks_emptyBlock() {
        VerticalBlock block = new VerticalBlock(new ArrayList<>());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(0, subblocks.size());
    }

    @Test
    void testExtractSequentialSubblocks_singleBlock() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(new Position(0, 0)));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_twoBlocks() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 1)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 1))), subblocks.get(1));
    }

    @Test
    void testExtractSequentialSubblocks_threeBlocks() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 1),
                new Position(0, 2)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 1))), subblocks.get(1));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 2))), subblocks.get(2));
    }

    @Test
    void testExtractSequentialSubblocks_twoBlocksOneGap() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 2)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 2))), subblocks.get(1));
    }

    @Test
    void testExtractSequentialSubblocks_twoBlocksTwoGaps() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 2),
                new Position(0, 4)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 2), new Position(0, 4))), subblocks.get(1));
    }

    @Test
    void testExtractSequentialSubblocks_threeBlocksTwoGaps() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 2),
                new Position(0, 3),
                new Position(0, 5)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 2), new Position(0, 3))), subblocks.get(1));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 5))), subblocks.get(2));
    }

    @Test
    void testExtractSequentialSubblocks_fourBlocksTwoGaps() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 2),
                new Position(0, 3),
                new Position(0, 5),
                new Position(0, 6)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(4, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 2), new Position(0, 3))), subblocks.get(1));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 5))), subblocks.get(2));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 6))), subblocks.get(3));
    }

    @Test
    void testExtractSequentialSubblocks_fourBlocksThreeGaps() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 2),
                new Position(0, 3),
                new Position(0, 5),
                new Position(0, 7)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(4, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 2), new Position(0, 3))), subblocks.get(1));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 5))), subblocks.get(2));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 7))), subblocks.get(3));
    }

    @Test
    void testExtractSequentialSubblocks_fourBlocksFourGaps() {
        VerticalBlock block = new VerticalBlock(Arrays.asList(
                new Position(0, 0),
                new Position(0, 2),
                new Position(0, 3),
                new Position(0, 5),
                new Position(0, 8)
        ));
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(4, subblocks.size());
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 0))), subblocks.get(0));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 2), new Position(0, 3))), subblocks.get(1));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 5))), subblocks.get(2));
        assertEquals(new VerticalBlock(Arrays.asList(new Position(0, 8))), subblocks.get(3));
    }

}