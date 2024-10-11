// Test case 1: Test empty block
@Test
void testEmptyBlock() {
    VerticalBlock block = new VerticalBlock();
    List<Block> subblocks = block.extractParallelSubblocks();
    assertTrue(subblocks.isEmpty());
}

// Test case 2: Test block with one line
@Test
void testBlockWithOneLine() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(1, subblocks.size());
    assertEquals(block, subblocks.get(0));
}

// Test case 3: Test block with two parallel lines
@Test
void testBlockWithTwoParallelLines() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new HWordPosition(0, 20, 30));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.get(0), subblocks.get(0));
    assertEquals(block.get(1), subblocks.get(1));
}

// Test case 4: Test block with two intersecting lines
@Test
void testBlockWithTwoIntersectingLines() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new VWordPosition(5, 20, 30));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.add(block.get(0));
    assertEquals(subblock1, subblocks.get(0));
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.add(block.get(1));
    assertEquals(subblock2, subblocks.get(1));
}

// Test case 5: Test block with three intersecting lines
@Test
void testBlockWithThreeIntersectingLines() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new VWordPosition(5, 20, 30));
    block.add(new VWordPosition(7, 40, 50));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(3, subblocks.size());
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.add(block.get(0));
    assertEquals(subblock1, subblocks.get(0));
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.add(block.get(1));
    assertEquals(subblock2, subblocks.get(1));
    VerticalBlock subblock3 = new VerticalBlock();
    subblock3.add(block.get(2));
    assertEquals(subblock3, subblocks.get(2));
}

// Test case 6: Test block with four intersecting lines
@Test
void testBlockWithFourIntersectingLines() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new VWordPosition(5, 20, 30));
    block.add(new VWordPosition(7, 40, 50));
    block.add(new HWordPosition(10, 60, 70));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(4, subblocks.size());
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.add(block.get(0));
    assertEquals(subblock1, subblocks.get(0));
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.add(block.get(1));
    assertEquals(subblock2, subblocks.get(1));
    VerticalBlock subblock3 = new VerticalBlock();
    subblock3.add(block.get(2));
    assertEquals(subblock3, subblocks.get(2));
    VerticalBlock subblock4 = new VerticalBlock();
    subblock4.add(block.get(3));
    assertEquals(subblock4, subblocks.get(3));
}

// Test case 7: Test block with multiple parallel lines
@Test
void testBlockWithMultipleParallelLines() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new HWordPosition(0, 20, 30));
    block.add(new HWordPosition(0, 40, 50));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(3, subblocks.size());
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.add(block.get(0));
    assertEquals(subblock1, subblocks.get(0));
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.add(block.get(1));
    assertEquals(subblock2, subblocks.get(1));
    VerticalBlock subblock3 = new VerticalBlock();
    subblock3.add(block.get(2));
    assertEquals(subblock3, subblocks.get(2));
}

// Test case 8: Test block with multiple intersecting lines
@Test
void testBlockWithMultipleIntersectingLines() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new VWordPosition(5, 20, 30));
    block.add(new HWordPosition(10, 40, 50));
    block.add(new VWordPosition(7, 60, 70));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(4, subblocks.size());
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.add(block.get(0));
    assertEquals(subblock1, subblocks.get(0));
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.add(block.get(1));
    assertEquals(subblock2, subblocks.get(1));
    VerticalBlock subblock3 = new VerticalBlock();
    subblock3.add(block.get(2));
    assertEquals(subblock3, subblocks.get(2));
    VerticalBlock subblock4 = new VerticalBlock();
    subblock4.add(block.get(3));
    assertEquals(subblock4, subblocks.get(3));
}

// Test case 9: Test block with multiple intersecting lines and parallel lines
@Test
void testBlockWithMultipleIntersectingAndParallelLines() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new VWordPosition(5, 20, 30));
    block.add(new HWordPosition(10, 40, 50));
    block.add(new VWordPosition(7, 60, 70));
    block.add(new HWordPosition(20, 80, 90));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(5, subblocks.size());
    VerticalBlock subblock1 = new VerticalBlock();
    subblock1.add(block.get(0));
    assertEquals(subblock1, subblocks.get(0));
    VerticalBlock subblock2 = new VerticalBlock();
    subblock2.add(block.get(1));
    assertEquals(subblock2, subblocks.get(1));
    VerticalBlock subblock3 = new VerticalBlock();
    subblock3.add(block.get(2));
    assertEquals(subblock3, subblocks.get(2));
    VerticalBlock subblock4 = new VerticalBlock();
    subblock4.add(block.get(3));
    assertEquals(subblock4, subblocks.get(3));
    VerticalBlock subblock5 = new VerticalBlock();
    subblock5.add(block.get(4));
    assertEquals(subblock5, subblocks.get(4));
}

// Test case 10: Test block with multiple intersecting lines and parallel lines, but no subblocks
@Test
void testBlockWithMultipleIntersectingAndParallelLinesButNoSubblocks() {
    VerticalBlock block = new VerticalBlock();
    block.add(new HWordPosition(0, 0, 10));
    block.add(new VWordPosition(5, 20, 30));
    block.add(new HWordPosition(10, 40, 50));
    block.add(new VWordPosition(7, 60, 70));
    block.add(new HWordPosition(20, 80, 90));
    block.add(new VWordPosition(15, 100, 110));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertTrue(subblocks.isEmpty());
}
}