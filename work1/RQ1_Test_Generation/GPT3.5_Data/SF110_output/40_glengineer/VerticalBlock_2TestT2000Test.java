```java
class VerticalBlock_2Test {

    @Test
    void testExtractSequentialSubblocks_EmptyBlock() {
        Scheme scheme = new Scheme(" ");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 0, 0);
        List<Block> result = block.extractSequentialSubblocks();
        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractSequentialSubblocks_SingleLineBlock() {
        Scheme scheme = new Scheme("abc");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 3, 1);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(block, result.get(0));
    }

    @Test
    void testExtractSequentialSubblocks_TwoSequentialLines() {
        Scheme scheme = new Scheme("abc\ndef");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 3, 2);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 3, 1), result.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 3, 2), result.get(1));
    }

    @Test
    void testExtractSequentialSubblocks_TwoNonSequentialLines() {
        Scheme scheme = new Scheme("abc\nde\nf");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 3, 3);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 3, 1), result.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 3, 2), result.get(1));
        assertEquals(new VerticalBlock(scheme, 0, 2, 3, 3), result.get(2));
    }

    @Test
    void testExtractSequentialSubblocks_MultipleSequentialLines() {
        Scheme scheme = new Scheme("abc\ndef\nghi\njkl");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 3, 4);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(4, result.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 3, 1), result.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 3, 2), result.get(1));
        assertEquals(new VerticalBlock(scheme, 0, 2, 3, 3), result.get(2));
        assertEquals(new VerticalBlock(scheme, 0, 3, 3, 4), result.get(3));
    }

    @Test
    void testExtractSequentialSubblocks_MultipleNonSequentialLines() {
        Scheme scheme = new Scheme("abc\nde\nf\nghi\njkl");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 3, 5);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(5, result.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 3, 1), result.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 3, 2), result.get(1));
        assertEquals(new VerticalBlock(scheme, 0, 2, 3, 3), result.get(2));
        assertEquals(new VerticalBlock(scheme, 0, 3, 3, 4), result.get(3));
        assertEquals(new VerticalBlock(scheme, 0, 4, 3, 5), result.get(4));
    }

    @Test
    void testExtractSequentialSubblocks_LargeBlock() {
        Scheme scheme = new Scheme("abc\ndef\nghi\njkl\nmno\npqr\nstu\nvwx\nyz");
        VerticalBlock block = new VerticalBlock(scheme, 0, 0, 3, 9);
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(9, result.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 3, 1), result.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 3, 2), result.get(1));
        assertEquals(new VerticalBlock(scheme, 0, 2, 3, 3), result.get(2));
        assertEquals(new VerticalBlock(scheme, 0, 3, 3, 4), result.get(3));
        assertEquals(new VerticalBlock(scheme, 0, 4, 3, 5), result.get(4));
        assertEquals(new VerticalBlock(scheme, 0, 5, 3, 6), result.get(5));
        assertEquals(new VerticalBlock(scheme, 0, 6, 3, 7), result.get(6));
        assertEquals(new VerticalBlock(scheme, 0, 7, 3, 8), result.get(7));
        assertEquals(new VerticalBlock(scheme, 0, 8, 3, 9), result.get(8));
    }

}
```
```