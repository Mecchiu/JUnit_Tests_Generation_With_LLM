package glengineer.blocks;
java
class HorizontalBlock_2Test {

    @Test
    void testExtractSequentialSubblocks_EmptyBlock() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 0, 0);
        List<Block> result = block.extractSequentialSubblocks();
        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractSequentialSubblocks_SingleTrivialBlock() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 1, 1);
        List<Block> result = block.extractSequentialSubblocks();
        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractSequentialSubblocks_SingleNonTrivialBlock() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 2, 1);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(block, result.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_TwoNonTrivialBlocks() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 4, 1);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new HorizontalBlock(new Scheme(), 0, 0, 2, 1), result.get(0));
        assertEquals(new HorizontalBlock(new Scheme(), 3, 0, 4, 1), result.get(1));
    }

    @Test
    void testExtractSequentialSubblocks_MultipleNonTrivialBlocks() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 6, 1);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new HorizontalBlock(new Scheme(), 0, 0, 2, 1), result.get(0));
        assertEquals(new HorizontalBlock(new Scheme(), 3, 0, 4, 1), result.get(1));
        assertEquals(new HorizontalBlock(new Scheme(), 5, 0, 6, 1), result.get(2));
    }

    @Test
    void testExtractSequentialSubblocks_AllTrivialBlocks() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 6, 1);
        block.setTrivial(true);
        List<Block> result = block.extractSequentialSubblocks();
        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractSequentialSubblocks_AlternatingTrivialAndNonTrivialBlocks() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 6, 1);
        block.setTrivial(true);
        block.subblock(3, 0, 4, 1).setTrivial(false);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(new HorizontalBlock(new Scheme(), 3, 0, 4, 1), result.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_AllNonTrivialBlocks() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 6, 1);
        block.subblock(0, 0, 2, 1).setTrivial(false);
        block.subblock(3, 0, 4, 1).setTrivial(false);
        block.subblock(5, 0, 6, 1).setTrivial(false);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new HorizontalBlock(new Scheme(), 0, 0, 2, 1), result.get(0));
        assertEquals(new HorizontalBlock(new Scheme(), 3, 0, 4, 1), result.get(1));
        assertEquals(new HorizontalBlock(new Scheme(), 5, 0, 6, 1), result.get(2));
    }

    @Test
    void testExtractSequentialSubblocks_NestedNonTrivialBlocks() {
        HorizontalBlock block = new HorizontalBlock(new Scheme(), 0, 0, 6, 1);
        block.subblock(1, 0, 5, 1).setTrivial(false);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(new HorizontalBlock(new Scheme(), 1, 0, 5, 1), result.get(0));
    }
}
