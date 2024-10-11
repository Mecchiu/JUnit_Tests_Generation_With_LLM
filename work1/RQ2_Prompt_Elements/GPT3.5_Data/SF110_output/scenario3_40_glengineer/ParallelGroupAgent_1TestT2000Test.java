// Test case 1: Test if groupContent method returns a ParallelGroup object
@Test
void testGroupContentReturnsParallelGroup() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup());
    assertTrue(group instanceof ParallelGroup);
}

// Test case 2: Test if groupContent method adds elements to the group
@Test
void testGroupContentAddsElementsToGroup() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element));
    assertEquals(1, group.countComponents());
}

// Test case 3: Test if groupContent method adds multiple elements to the group
@Test
void testGroupContentAddsMultipleElementsToGroup() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element).addComponent(element));
    assertEquals(2, group.countComponents());
}

// Test case 4: Test if groupContent method sets the alignment of the group
@Test
void testGroupContentSetsAlignmentOfGroup() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup(Alignment.CENTER).addComponent(element));
    assertEquals(Alignment.CENTER, group.getAlignment());
}

// Test case 5: Test if groupContent method sets the size of the group
@Test
void testGroupContentSetsSizeOfGroup() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element).addGap(10));
    assertEquals(10, group.getSize());
}

// Test case 6: Test if groupContent method sets the gap size of the group
@Test
void testGroupContentSetsGapSizeOfGroup() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element).addGap(10));
    assertEquals(10, group.getGapSize());
}

// Test case 7: Test if groupContent method sets the resizable property of the group
@Test
void testGroupContentSetsResizablePropertyOfGroup() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element).setResizable(true));
    assertTrue(group.isResizable());
}

// Test case 8: Test if groupContent method sets the size of the group based on the size of the elements
@Test
void testGroupContentSetsSizeOfGroupBasedOnElements() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element).setSizeGroup(FunctionsOnGroup.SIZE));
    assertEquals(FunctionsOnGroup.SIZE, group.getSizeGroup());
}

// Test case 9: Test if groupContent method sets the minimum size of the group based on the minimum size of the elements
@Test
void testGroupContentSetsMinimumSizeOfGroupBasedOnElements() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element).setMinimumSizeGroup(FunctionsOnGroup.MIN_SIZE));
    assertEquals(FunctionsOnGroup.MIN_SIZE, group.getMinimumSizeGroup());
}

// Test case 10: Test if groupContent method sets the preferred size of the group based on the preferred size of the elements
@Test
void testGroupContentSetsPreferredSizeOfGroupBasedOnElements() {
    ParallelGroupAgent agent = new ParallelGroupAgent();
    ParallelGroup group = agent.groupContent((layout, element) -> layout.createParallelGroup().addComponent(element).setPreferredSizeGroup(FunctionsOnGroup.PREF_SIZE));
    assertEquals(FunctionsOnGroup.PREF_SIZE, group.getPreferredSizeGroup());
}