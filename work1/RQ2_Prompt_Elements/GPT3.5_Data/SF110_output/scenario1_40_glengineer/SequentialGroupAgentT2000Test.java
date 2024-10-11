// Test case 1: Test if the method returns a SequentialGroup object
@Test
public void testGroupContentReturnsSequentialGroup() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertTrue(result instanceof SequentialGroup);
}

// Test case 2: Test if the method returns a SequentialGroup object with correct layout style
@Test
public void testGroupContentReturnsSequentialGroupWithCorrectLayoutStyle() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(GroupLayout.SequentialGroup.class, result.getClass());
}

// Test case 3: Test if the method returns a SequentialGroup object with correct axis
@Test
public void testGroupContentReturnsSequentialGroupWithCorrectAxis() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(GroupLayout.DEFAULT_AXIS, result.getAxis());
}

// Test case 4: Test if the method adds all children agents to the SequentialGroup
@Test
public void testGroupContentAddsAllChildrenAgentsToSequentialGroup() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    agent.addChildAgent(new ComponentAgent());
    agent.addChildAgent(new ComponentAgent());
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(2, result.getChildCount());
}

// Test case 5: Test if the method adds children agents to the SequentialGroup in correct order
@Test
public void testGroupContentAddsChildrenAgentsToSequentialGroupInCorrectOrder() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    ComponentAgent child1 = new ComponentAgent();
    ComponentAgent child2 = new ComponentAgent();
    agent.addChildAgent(child1);
    agent.addChildAgent(child2);
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(child1.getComponent(), result.getChildAt(0));
    assertEquals(child2.getComponent(), result.getChildAt(1));
}

// Test case 6: Test if the method adds children agents to the SequentialGroup with correct alignment
@Test
public void testGroupContentAddsChildrenAgentsToSequentialGroupWithCorrectAlignment() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    ComponentAgent child1 = new ComponentAgent();
    ComponentAgent child2 = new ComponentAgent();
    child1.setAlignment(GroupLayout.Alignment.TRAILING);
    child2.setAlignment(GroupLayout.Alignment.LEADING);
    agent.addChildAgent(child1);
    agent.addChildAgent(child2);
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(GroupLayout.Alignment.TRAILING, result.getChildAlignment(0));
    assertEquals(GroupLayout.Alignment.LEADING, result.getChildAlignment(1));
}

// Test case 7: Test if the method adds children agents to the SequentialGroup with correct size
@Test
public void testGroupContentAddsChildrenAgentsToSequentialGroupWithCorrectSize() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    ComponentAgent child1 = new ComponentAgent();
    ComponentAgent child2 = new ComponentAgent();
    child1.setSize(100, 50);
    child2.setSize(200, 100);
    agent.addChildAgent(child1);
    agent.addChildAgent(child2);
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(100, result.getComponent(0).getHeight());
    assertEquals(200, result.getComponent(1).getWidth());
}

// Test case 8: Test if the method adds children agents to the SequentialGroup with correct gap
@Test
public void testGroupContentAddsChildrenAgentsToSequentialGroupWithCorrectGap() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    ComponentAgent child1 = new ComponentAgent();
    ComponentAgent child2 = new ComponentAgent();
    agent.addChildAgent(child1);
    agent.addChildAgent(child2);
    agent.setGap(10);
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(10, result.getGap());
}

// Test case 9: Test if the method adds children agents to the SequentialGroup with correct padding
@Test
public void testGroupContentAddsChildrenAgentsToSequentialGroupWithCorrectPadding() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    ComponentAgent child1 = new ComponentAgent();
    ComponentAgent child2 = new ComponentAgent();
    agent.addChildAgent(child1);
    agent.addChildAgent(child2);
    agent.setPadding(10);
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(10, result.getPadding().top);
    assertEquals(10, result.getPadding().bottom);
    assertEquals(10, result.getPadding().left);
    assertEquals(10, result.getPadding().right);
}

// Test case 10: Test if the method adds children agents to the SequentialGroup with correct layout style and axis when using GroupLayoutCreatorAndElementAdder
@Test
public void testGroupContentAddsChildrenAgentsToSequentialGroupWithCorrectLayoutStyleAndAxisWhenUsingGroupLayoutCreatorAndElementAdder() {
    SequentialGroupAgent agent = new SequentialGroupAgent();
    ComponentAgent child1 = new ComponentAgent();
    ComponentAgent child2 = new ComponentAgent();
    agent.addChildAgent(child1);
    agent.addChildAgent(child2);
    SequentialGroup result = agent.groupContent(new GroupLayoutCreatorAndElementAdder());
    assertEquals(GroupLayout.SequentialGroup.class, result.getClass());
    assertEquals(GroupLayout.DEFAULT_AXIS, result.getAxis());
}