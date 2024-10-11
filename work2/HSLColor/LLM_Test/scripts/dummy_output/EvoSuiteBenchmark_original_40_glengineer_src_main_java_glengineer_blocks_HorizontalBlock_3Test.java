package glengineer.blocks;
java
class HorizontalBlock_3Test {

    @Test
    void testExtractParallelSubblocks_emptyBlock() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 0, 0);
        List<Block> result = block.extractParallelSubblocks();
        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractParallelSubblocks_noHorizontalLines() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(11, result.size());
    }

    @Test
    void testExtractParallelSubblocks_withHorizontalLines() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        scheme.addHLine(3, 3, 7);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(3, result.size());
    }

    @Test
    void testExtractParallelSubblocks_singleHorizontalLine() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(2, result.size());
    }

    @Test
    void testExtractParallelSubblocks_multipleHorizontalLines() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        scheme.addHLine(3, 3, 7);
        scheme.addHLine(6, 6, 9);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(4, result.size());
    }

    @Test
    void testExtractParallelSubblocks_noSeparation() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(1, result.size());
    }

    @Test
    void testExtractParallelSubblocks_noOptimization() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        for (Block b : result) {
            assertFalse(b.isTrivial());
        }
    }

    @Test
    void testExtractParallelSubblocks_trivialSubblocks() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        for (Block b : result) {
            assertFalse(b.isTrivial());
        }
    }

    @Test
    void testExtractParallelSubblocks_separationByLines() {
        Scheme scheme = new Scheme();
        scheme.addHLine(1, 1, 5);
        scheme.addHLine(3, 3, 7);
        HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 10, 10);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(3, result.size());
    }
}
