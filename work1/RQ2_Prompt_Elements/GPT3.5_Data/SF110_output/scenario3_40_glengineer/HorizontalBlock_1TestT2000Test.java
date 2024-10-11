// Here's an example implementation of the test cases for the HorizontalBlock class

class HorizontalBlock_1Test {
    
    @Test
    void testExtractParallelSubblocks_NoHorizontalLines() {
        // Test case for a block with no horizontal lines
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }
    
    @Test
    void testExtractParallelSubblocks_OneHorizontalLine() {
        // Test case for a block with one horizontal line
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 10));
        block.addHorizontalLine(new Position(0, 5));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new HorizontalBlock(new Position(0, 0), new Position(10, 5)), subblocks.get(0));
        assertEquals(new HorizontalBlock(new Position(0, 5), new Position(10, 10)), subblocks.get(1));
    }
    
    @Test
    void testExtractParallelSubblocks_MultipleHorizontalLines() {
        // Test case for a block with multiple horizontal lines
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 10));
        block.addHorizontalLine(new Position(0, 3));
        block.addHorizontalLine(new Position(0, 7));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new HorizontalBlock(new Position(0, 0), new Position(10, 3)), subblocks.get(0));
        assertEquals(new HorizontalBlock(new Position(0, 3), new Position(10, 7)), subblocks.get(1));
        assertEquals(new HorizontalBlock(new Position(0, 7), new Position(10, 10)), subblocks.get(2));
    }
    
    @Test
    void testExtractParallelSubblocks_SinglePointBlock() {
        // Test case for a block with only one point
        Block block = new HorizontalBlock(new Position(0, 0), new Position(0, 0));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }
    
    @Test
    void testExtractParallelSubblocks_RectangleBlock() {
        // Test case for a rectangular block with no horizontal lines
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 5));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }
    
    @Test
    void testExtractParallelSubblocks_RectangleBlockWithHorizontalLine() {
        // Test case for a rectangular block with one horizontal line
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 5));
        block.addHorizontalLine(new Position(0, 3));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new HorizontalBlock(new Position(0, 0), new Position(10, 3)), subblocks.get(0));
        assertEquals(new HorizontalBlock(new Position(0, 3), new Position(10, 5)), subblocks.get(1));
    }
    
    @Test
    void testExtractParallelSubblocks_RectangleBlockWithMultipleHorizontalLines() {
        // Test case for a rectangular block with multiple horizontal lines
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 5));
        block.addHorizontalLine(new Position(0, 2));
        block.addHorizontalLine(new Position(0, 4));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new HorizontalBlock(new Position(0, 0), new Position(10, 2)), subblocks.get(0));
        assertEquals(new HorizontalBlock(new Position(0, 2), new Position(10, 4)), subblocks.get(1));
        assertEquals(new HorizontalBlock(new Position(0, 4), new Position(10, 5)), subblocks.get(2));
    }
    
    @Test
    void testExtractParallelSubblocks_BlockWithVerticalLine() {
        // Test case for a block with a vertical line
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 10));
        block.addVerticalLine(new Position(5, 0));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }
    
    @Test
    void testExtractParallelSubblocks_BlockWithDiagonalLine() {
        // Test case for a block with a diagonal line
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 10));
        block.addDiagonalLine(new Position(0, 0), new Position(10, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }
    
    @Test
    void testExtractParallelSubblocks_BlockWithMultipleLines() {
        // Test case for a block with multiple lines
        Block block = new HorizontalBlock(new Position(0, 0), new Position(10, 10));
        block.addHorizontalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addDiagonalLine(new Position(0, 0), new Position(10, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }
}