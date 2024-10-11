```java
class VerticalBlock_3Test {

    @Test
    void testExtractParallelSubblocks_emptyBlock() {
        Scheme scheme = new Scheme(" ");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 0, 0);
        List<Block> result = block.extractParallelSubblocks();
        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractParallelSubblocks_noVLines() {
        Scheme scheme = new Scheme("abc\ndef\nghi");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 3, 3);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(3, result.size());
    }

    @Test
    void testExtractParallelSubblocks_withVLines() {
        Scheme scheme = new Scheme("abc|def|ghi");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 11, 3);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(3, result.size());
    }

    @Test
    void testExtractParallelSubblocks_singleVLine() {
        Scheme scheme = new Scheme("abc|def|ghi");
        VerticalBlock block = new VerticalBlock(scheme, 4, 0, 7, 3);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(2, result.size());
    }

    @Test
    void testExtractParallelSubblocks_multipleVLines() {
        Scheme scheme = new Scheme("abc|def|ghi|jkl");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 11, 4);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(4, result.size());
    }

    @Test
    void testExtractParallelSubblocks_gapAtVLine() {
        Scheme scheme = new Scheme("abc|def|ghi");
        scheme.addGap(3, 0, 3, 2);
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 11, 3);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(4, result.size());
    }

    @Test
    void testExtractParallelSubblocks_gapAtEnd() {
        Scheme scheme = new Scheme("abc|def|ghi");
        scheme.addGap(8, 0, 8, 2);
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 11, 3);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(4, result.size());
    }

    @Test
    void testExtractParallelSubblocks_gapAtStart() {
        Scheme scheme = new Scheme("abc|def|ghi");
        scheme.addGap(0, 0, 0, 2);
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 11, 3);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(4, result.size());
    }

    @Test
    void testExtractParallelSubblocks_gapInMiddle() {
        Scheme scheme = new Scheme("abc|def|ghi");
        scheme.addGap(4, 0, 4, 2);
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 11, 3);
        List<Block> result = block.extractParallelSubblocks();
        assertEquals(4, result.size());
    }
}
```
