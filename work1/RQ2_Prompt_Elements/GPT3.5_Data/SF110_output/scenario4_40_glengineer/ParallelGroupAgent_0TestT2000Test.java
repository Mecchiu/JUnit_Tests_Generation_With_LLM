// Test case 1: Test if containsGapsOnly() returns true when the parallel group only contains gaps
@Test
void testContainsGapsOnlyTrue() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addGap(10);
    group.addGap(20);
    assertTrue(group.containsGapsOnly());
}

// Test case 2: Test if containsGapsOnly() returns false when the parallel group contains elements and gaps
@Test
void testContainsGapsOnlyFalse() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addComponent(new Agent());
    group.addGap(10);
    assertFalse(group.containsGapsOnly());
}

// Test case 3: Test if containsGapsOnly() returns false when the parallel group only contains elements
@Test
void testContainsGapsOnlyFalse2() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addComponent(new Agent());
    group.addComponent(new Agent());
    assertFalse(group.containsGapsOnly());
}

// Test case 4: Test if containsGapsOnly() returns true when the parallel group is empty
@Test
void testContainsGapsOnlyEmpty() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    assertTrue(group.containsGapsOnly());
}

// Test case 5: Test if containsGapsOnly() returns true when the parallel group only contains one gap
@Test
void testContainsGapsOnlyOneGap() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addGap(10);
    assertTrue(group.containsGapsOnly());
}

// Test case 6: Test if containsGapsOnly() returns true when the parallel group only contains multiple gaps of the same size
@Test
void testContainsGapsOnlyMultipleSameSizeGaps() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addGap(10);
    group.addGap(10);
    group.addGap(10);
    assertTrue(group.containsGapsOnly());
}

// Test case 7: Test if containsGapsOnly() returns false when the parallel group only contains multiple gaps of different sizes
@Test
void testContainsGapsOnlyMultipleDifferentSizeGaps() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addGap(10);
    group.addGap(20);
    group.addGap(30);
    assertFalse(group.containsGapsOnly());
}

// Test case 8: Test if containsGapsOnly() returns true when the parallel group only contains one element and one gap
@Test
void testContainsGapsOnlyOneElementOneGap() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addComponent(new Agent());
    group.addGap(10);
    assertTrue(group.containsGapsOnly());
}

// Test case 9: Test if containsGapsOnly() returns true when the parallel group only contains one element and multiple gaps
@Test
void testContainsGapsOnlyOneElementMultipleGaps() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addComponent(new Agent());
    group.addGap(10);
    group.addGap(20);
    assertTrue(group.containsGapsOnly());
}

// Test case 10: Test if containsGapsOnly() returns true when the parallel group only contains multiple elements and multiple gaps
@Test
void testContainsGapsOnlyMultipleElementsMultipleGaps() {
    ParallelGroupAgent group = new ParallelGroupAgent();
    group.addComponent(new Agent());
    group.addGap(10);
    group.addComponent(new Agent());
    group.addGap(20);
    assertTrue(group.containsGapsOnly());
}