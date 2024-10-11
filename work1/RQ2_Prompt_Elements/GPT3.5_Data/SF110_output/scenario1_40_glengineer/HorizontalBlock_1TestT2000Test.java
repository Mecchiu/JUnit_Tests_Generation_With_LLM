// Test case 1: Test trivial case where block has no subblocks
@Test
void testExtractParallelSubblocksTrivial() {
    HorizontalBlock block = new HorizontalBlock();
    List<Block> subblocks = block.extractParallelSubblocks();
    assertTrue(subblocks.isEmpty());
}

// Test case 2: Test case where block has only one subblock
@Test
void testExtractParallelSubblocksOneSubblock() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(1, subblocks.size());
    assertEquals(block.getSubblocks().get(0), subblocks.get(0));
}

// Test case 3: Test case where block has multiple subblocks without intersecting horizontal lines
@Test
void testExtractParallelSubblocksNoLines() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    block.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(1, subblocks.size());
    assertEquals(block, subblocks.get(0));
}

// Test case 4: Test case where block has multiple subblocks with intersecting horizontal lines
@Test
void testExtractParallelSubblocksWithLines() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    block.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    block.addSubblock(new TextBlock(new HWordPosition(2, 1), "Foo"));
    block.addSubblock(new TextBlock(new HWordPosition(3, 1), "Bar"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.getSubblocks().get(0), subblocks.get(0));
    assertEquals(block.getSubblocks().get(1), subblocks.get(0).getSubblocks().get(0));
    assertEquals(block.getSubblocks().get(2), subblocks.get(1));
    assertEquals(block.getSubblocks().get(3), subblocks.get(1).getSubblocks().get(0));
}

// Test case 5: Test case where block has multiple subblocks with intersecting horizontal lines and some subblocks are already parallel
@Test
void testExtractParallelSubblocksWithLinesAndParallelSubblocks() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    block.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.addSubblock(new TextBlock(new HWordPosition(2, 1), "Foo"));
    subblock1.addSubblock(new TextBlock(new HWordPosition(3, 1), "Bar"));
    block.addSubblock(subblock1);
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.addSubblock(new TextBlock(new HWordPosition(4, 2), "Baz"));
    subblock2.addSubblock(new TextBlock(new HWordPosition(5, 2), "Qux"));
    block.addSubblock(subblock2);
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.getSubblocks().get(0), subblocks.get(0));
    assertEquals(block.getSubblocks().get(1), subblocks.get(0).getSubblocks().get(0));
    assertEquals(subblock1, subblocks.get(1));
    assertEquals(subblock2, subblocks.get(1).getSubblocks().get(0));
}

// Test case 6: Test case where block has multiple subblocks with intersecting horizontal lines and all subblocks are already parallel
@Test
void testExtractParallelSubblocksWithLinesAndAllParallelSubblocks() {
    HorizontalBlock block = new HorizontalBlock();
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    subblock1.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    block.addSubblock(subblock1);
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.addSubblock(new TextBlock(new HWordPosition(2, 1), "Foo"));
    subblock2.addSubblock(new TextBlock(new HWordPosition(3, 1), "Bar"));
    block.addSubblock(subblock2);
    VerticalBlock subblock3 = new VerticalBlock();
    subblock3.addSubblock(new TextBlock(new HWordPosition(4, 2), "Baz"));
    subblock3.addSubblock(new TextBlock(new HWordPosition(5, 2), "Qux"));
    block.addSubblock(subblock3);
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(3, subblocks.size());
    assertEquals(subblock1, subblocks.get(0));
    assertEquals(subblock2, subblocks.get(1));
    assertEquals(subblock3, subblocks.get(2));
}

// Test case 7: Test case where block has multiple subblocks with intersecting horizontal lines and some subblocks are trivial
@Test
void testExtractParallelSubblocksWithLinesAndTrivialSubblocks() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    block.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.addSubblock(new TextBlock(new HWordPosition(2, 1), "Foo"));
    block.addSubblock(subblock1);
    block.addSubblock(new TextBlock(new HWordPosition(3, 1), ""));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.getSubblocks().get(0), subblocks.get(0));
    assertEquals(block.getSubblocks().get(1), subblocks.get(0).getSubblocks().get(0));
    assertEquals(subblock1, subblocks.get(1));
}

// Test case 8: Test case where block has multiple subblocks with intersecting horizontal lines and some subblocks are empty
@Test
void testExtractParallelSubblocksWithLinesAndEmptySubblocks() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    block.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.addSubblock(new TextBlock(new HWordPosition(2, 1), ""));
    subblock1.addSubblock(new TextBlock(new HWordPosition(3, 1), ""));
    block.addSubblock(subblock1);
    block.addSubblock(new TextBlock(new HWordPosition(4, 2), "Foo"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.getSubblocks().get(0), subblocks.get(0));
    assertEquals(block.getSubblocks().get(1), subblocks.get(0).getSubblocks().get(0));
    assertEquals(block.getSubblocks().get(3), subblocks.get(1));
}

// Test case 9: Test case where block has multiple subblocks with intersecting horizontal lines and some subblocks are null
@Test
void testExtractParallelSubblocksWithLinesAndNullSubblocks() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    block.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    block.addSubblock(null);
    block.addSubblock(new TextBlock(new HWordPosition(3, 1), "Foo"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.getSubblocks().get(0), subblocks.get(0));
    assertEquals(block.getSubblocks().get(1), subblocks.get(0).getSubblocks().get(0));
    assertEquals(block.getSubblocks().get(3), subblocks.get(1));
}

// Test case 10: Test case where block has multiple subblocks with intersecting horizontal lines and some subblocks are not text blocks
@Test
void testExtractParallelSubblocksWithLinesAndNonTextSubblocks() {
    HorizontalBlock block = new HorizontalBlock();
    block.addSubblock(new TextBlock(new HWordPosition(0, 0), "Hello"));
    block.addSubblock(new TextBlock(new HWordPosition(1, 0), "World"));
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.addSubblock(new ImageBlock(new HWordPosition(2, 1), "image.png"));
    subblock1.addSubblock(new TextBlock(new HWordPosition(3, 1), "Foo"));
    block.addSubblock(subblock1);
    block