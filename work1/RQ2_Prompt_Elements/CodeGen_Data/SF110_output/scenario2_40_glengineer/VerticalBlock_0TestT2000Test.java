// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {
/**
		  * Tests the creation of {@link VerticalBlock} by passing a {@link Position} and a
		  *  {@link BlockList}, and compares the {@link Position#getX1()} value with the new {@link Position#getX1()}.
		  *
		  * @throws Exception (in case an error occurs)
		  */
     @Test
    public void testCreation() throws Exception {
        Position position = new Position(5.0f, 7.0f);
        Position2D position1 = new Position2D(5.0f, 7.0f);
        Position2D position2 = new Position2D(7.0f, 5.0f);
        Position3D position3 = new Position3D(5.0f, 7.0f, 6.0f);

        VertexLayout vertexLayout = new VertexLayout(12, PositionVertexSize, PositionNormal);
		ArrayBlock arrayBlock = createArrayBlock(position, vertexLayout);

        Vector<Vector<Block>> arrayBlocks = createArrayBlocks(position, 2, vertexLayout);
        ArrayBlock arrayBlock0 = createArrayBlock(position, PositionNormal);
        ArrayBlock arrayBlock1 = createArrayBlock(position, PositionNormal);

        BlockList blocks0 = new BlockList(arrayBlocks.get(0));
        BlockList blocks1 = new BlockList(arrayBlocks.get(1));

        Block firstBlock = createBlock(blocks0);
        assertEquals(2, firstBlock.getX2());

        Block thirdBlock = createBlock(blocks1);
        assertEquals(3, thirdBlock.getX2());

        firstBlock.extractSequentialSubblocks();
        assertNotNull("null element from subsequential list", firstBlock);

        secondBlock = blocks0.get(0);
        thirdBlock = blocks0.get(1);

        assertEquals(position, firstBlock.getX1());
        assertEquals(8.0f, firstBlock.y2);
        assertEquals(position, secondBlock.getX1());
        assertEquals(8.0f, secondBlock.y2);
        assertEquals(position, thirdBlock.getX1());
        assertEquals(8.0f, thirdBlock.y2);
    }

    /**
     * Extracts a (trivial) block from the given position.
     */
    private boolean isTrivial() {
        // Trivial blocks are the result of a number of tests, some with a different x1 value, some with not.
        // So, extract only those.
        // This is needed because the blocks are extracted by copying the reference, and the new copy
        // stores the reference. Therefore it cannot be done by the original.
        // So, we need extract only those.
        return (this.blocks.get(0).getX1()==6.0f  // Subsequent
            || this.blocks.get(1).getX1()==6.0f  // Block 0.
            || this.blocks.get(2).getX2()==6.0f  // Block 1.
            || this.blocks.get(3).getX2()==6.0f  // Block 2.
            );

    }

    /**
     * Creates a {@link Block} instance.
     */
    private Block createBlock(BlockList blocks) {
        Block result = null;
        for (Block b : blocks) {
            if (b.equals(this.blocks.get(0))) {
                result = createBlock(blocks);
            } else if (b.equals(this.blocks.get(1))) {
                result = createBlock(blocks);
            } else if (b.equals(this.blocks.get(2))) {
                result = createBlock(blocks);
            } else if (b.equals(this.blocks.get(3))) {
                result = createBlock(blocks);
            }
        }
        return result;
    }

    /**
     * Creates an array {@code ArrayBlock} instance containing given parameters.
     */
    private ArrayBlock createArrayBlock(Position position, VertexLayout vertexLayout) {
        ArrayBlock arrayBlock = new ArrayBlock();
        arrayBlock.y1 = 7.0f;
        arrayBlock.y2 = 8.0f;
        arrayBlock.sizeX = position.getXSize();
        arrayBlock.sizeY = vertexLayout.getXSize();    // We want this.
        arrayBlock.setBlockList(new ArrayBlockList());
        return arrayBlock;
    }

    /**
     * Creates an array {@code ArrayBlock} instance using given positions.
     */
    private ArrayBlock createArrayBlock(Position position1, VertexLayout position2) {
        ArrayBlock arrayBlock = new ArrayBlock();
        arrayBlock.y1 = 9.0f;
        arrayBlock.y2 = 7.0f;
        arrayBlock.sizeX = position1.getXSize();
        arrayBlock.sizeY = position1.getYSize();
        arrayBlock.setBlockList(new ArrayBlockList());
        arrayBlock.setBlock(0, position1);     // This is the first block
        arrayBlock.setBlock(1, position2);     // This is second block
        return arrayBlock;
    }
}