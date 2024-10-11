// Test case 1: Test empty block
@Test
void testEmptyBlock() {
    HorizontalBlock block = new HorizontalBlock();
    List<Block> subblocks = block.extractParallelSubblocks();
    assertTrue(subblocks.isEmpty());
}

// Test case 2: Test block with one word
@Test
void testBlockWithOneWord() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(1, subblocks.size());
    assertEquals(block, subblocks.get(0));
}

// Test case 3: Test block with two parallel words
@Test
void testBlockWithTwoParallelWords() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(0, 5, "world"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(1, subblocks.size());
    assertEquals(block, subblocks.get(0));
}

// Test case 4: Test block with two non-parallel words
@Test
void testBlockWithTwoNonParallelWords() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(1, 5, "world"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.getWords().get(0), subblocks.get(0).getWords().get(0));
    assertEquals(block.getWords().get(1), subblocks.get(1).getWords().get(0));
}

// Test case 5: Test block with three parallel words
@Test
void testBlockWithThreeParallelWords() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(0, 5, "world"));
    block.addWord(new HWordPosition(0, 11, "again"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(1, subblocks.size());
    assertEquals(block, subblocks.get(0));
}

// Test case 6: Test block with three non-parallel words
@Test
void testBlockWithThreeNonParallelWords() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(1, 5, "world"));
    block.addWord(new HWordPosition(2, 11, "again"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(3, subblocks.size());
    assertEquals(block.getWords().get(0), subblocks.get(0).getWords().get(0));
    assertEquals(block.getWords().get(1), subblocks.get(1).getWords().get(0));
    assertEquals(block.getWords().get(2), subblocks.get(2).getWords().get(0));
}

// Test case 7: Test block with two parallel words and one non-parallel word
@Test
void testBlockWithTwoParallelWordsAndOneNonParallelWord() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(0, 5, "world"));
    block.addWord(new HWordPosition(1, 11, "again"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(2, subblocks.size());
    assertEquals(block.getWords().get(0), subblocks.get(0).getWords().get(0));
    assertEquals(block.getWords().get(1), subblocks.get(0).getWords().get(1));
    assertEquals(block.getWords().get(2), subblocks.get(1).getWords().get(0));
}

// Test case 8: Test block with two parallel words and two non-parallel words
@Test
void testBlockWithTwoParallelWordsAndTwoNonParallelWords() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(0, 5, "world"));
    block.addWord(new HWordPosition(1, 11, "again"));
    block.addWord(new HWordPosition(2, 15, "and"));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(3, subblocks.size());
    assertEquals(block.getWords().get(0), subblocks.get(0).getWords().get(0));
    assertEquals(block.getWords().get(1), subblocks.get(0).getWords().get(1));
    assertEquals(block.getWords().get(2), subblocks.get(1).getWords().get(0));
    assertEquals(block.getWords().get(3), subblocks.get(2).getWords().get(0));
}

// Test case 9: Test block with two parallel words and two horizontal lines
@Test
void testBlockWithTwoParallelWordsAndTwoHorizontalLines() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(0, 5, "world"));
    block.addWord(new HWordPosition(2, 0, "again"));
    block.addWord(new HWordPosition(2, 5, "and"));
    block.addHorizontalLine(new HLinePosition(1, 0, 10));
    block.addHorizontalLine(new HLinePosition(3, 0, 10));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(3, subblocks.size());
    assertEquals(block.getWords().get(0), subblocks.get(0).getWords().get(0));
    assertEquals(block.getWords().get(1), subblocks.get(0).getWords().get(1));
    assertEquals(block.getWords().get(2), subblocks.get(1).getWords().get(0));
    assertEquals(block.getWords().get(3), subblocks.get(2).getWords().get(0));
}

// Test case 10: Test block with two non-parallel words and two horizontal lines
@Test
void testBlockWithTwoNonParallelWordsAndTwoHorizontalLines() {
    HorizontalBlock block = new HorizontalBlock();
    block.addWord(new HWordPosition(0, 0, "hello"));
    block.addWord(new HWordPosition(1, 5, "world"));
    block.addWord(new HWordPosition(2, 11, "again"));
    block.addWord(new HWordPosition(3, 15, "and"));
    block.addHorizontalLine(new HLinePosition(1, 0, 10));
    block.addHorizontalLine(new HLinePosition(3, 0, 10));
    List<Block> subblocks = block.extractParallelSubblocks();
    assertEquals(4, subblocks.size());
    assertEquals(block.getWords().get(0), subblocks.get(0).getWords().get(0));
    assertEquals(block.getWords().get(1), subblocks.get(1).getWords().get(0));
    assertEquals(block.getWords().get(2), subblocks.get(2).getWords().get(0));
    assertEquals(block.getWords().get(3), subblocks.get(3).getWords().get(0));
}
}