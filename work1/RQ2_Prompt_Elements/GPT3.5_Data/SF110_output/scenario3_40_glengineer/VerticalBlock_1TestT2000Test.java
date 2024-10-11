// Here's an example implementation of the test cases for VerticalBlock_1Test class:

class VerticalBlock_1Test {
    
    @Test
    void testExtractParallelSubblocks_NoVerticalLines() {
        // Test case for a block with no vertical lines
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }
    
    @Test
    void testExtractParallelSubblocks_OneVerticalLine() {
        // Test case for a block with one vertical line
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(5, 0), new Position(5, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(5, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(5, 0), new Position(10, 20)), subblocks.get(1));
    }
    
    @Test
    void testExtractParallelSubblocks_MultipleVerticalLines() {
        // Test case for a block with multiple vertical lines
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(3, 0), new Position(3, 20));
        block.addVerticalLine(new Position(7, 0), new Position(7, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(3, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(3, 0), new Position(7, 20)), subblocks.get(1));
        assertEquals(new VerticalBlock(new Position(7, 0), new Position(10, 20)), subblocks.get(2));
    }
    
    @Test
    void testExtractParallelSubblocks_VerticalLineAtStart() {
        // Test case for a block with a vertical line at the start
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(0, 0), new Position(0, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(0, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(10, 20)), subblocks.get(1));
    }
    
    @Test
    void testExtractParallelSubblocks_VerticalLineAtEnd() {
        // Test case for a block with a vertical line at the end
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(10, 0), new Position(10, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new Position(10, 0), new Position(10, 20)), subblocks.get(1));
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(10, 20)), subblocks.get(0));
    }
    
    @Test
    void testExtractParallelSubblocks_VerticalLineAtMiddle() {
        // Test case for a block with a vertical line at the middle
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(5, 0), new Position(5, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(5, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(5, 0), new Position(10, 20)), subblocks.get(1));
    }
    
    @Test
    void testExtractParallelSubblocks_VerticalLineAtRandomPosition() {
        // Test case for a block with a vertical line at a random position
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(3, 0), new Position(3, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(3, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(3, 0), new Position(10, 20)), subblocks.get(1));
        assertEquals(new VerticalBlock(new Position(3, 0), new Position(10, 20)), subblocks.get(2));
    }
    
    @Test
    void testExtractParallelSubblocks_VerticalLineAtRandomPosition2() {
        // Test case for a block with a vertical line at a random position
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(7, 0), new Position(7, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(7, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(7, 0), new Position(10, 20)), subblocks.get(1));
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(10, 20)), subblocks.get(2));
    }
    
    @Test
    void testExtractParallelSubblocks_VerticalLineAtRandomPosition3() {
        // Test case for a block with a vertical line at a random position
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(5, 0), new Position(5, 20));
        block.addVerticalLine(new Position(7, 0), new Position(7, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(5, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(5, 0), new Position(7, 20)), subblocks.get(1));
        assertEquals(new VerticalBlock(new Position(7, 0), new Position(10, 20)), subblocks.get(2));
    }
    
    @Test
    void testExtractParallelSubblocks_VerticalLineAtRandomPosition4() {
        // Test case for a block with a vertical line at a random position
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 20));
        block.addVerticalLine(new Position(3, 0), new Position(3, 20));
        block.addVerticalLine(new Position(7, 0), new Position(7, 20));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(new Position(0, 0), new Position(3, 20)), subblocks.get(0));
        assertEquals(new VerticalBlock(new Position(3, 0), new Position(7, 20)), subblocks.get(1));
        assertEquals(new VerticalBlock(new Position(7, 0), new Position(10, 20)), subblocks.get(2));
    }
}