// Test case 1: Test if the method returns a non-null object
@Test
void testGetParallelGroupNotNull() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertNotNull(fpg);
}

// Test case 2: Test if the method returns an object of type FunctionsOnParallelGroup
@Test
void testGetParallelGroupType() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertTrue(fpg instanceof FunctionsOnParallelGroup);
}

// Test case 3: Test if the method returns the correct parallel group
@Test
void testGetParallelGroupCorrect() {
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel, "comp1 comp2");
    JLabel comp1 = new JLabel("Component 1");
    JLabel comp2 = new JLabel("Component 2");
    gle.associate("comp1", comp1);
    gle.associate("comp2", comp2);
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp2");
    ParallelGroup pg = layout.createParallelGroup(GroupLayout.Alignment.LEADING, comp1, comp2);
    assertEquals(pg, fpg.getParallelGroup());
}

// Test case 4: Test if the method returns null when the first component is not found
@Test
void testGetParallelGroupFirstNotFound() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertNull(fpg);
}

// Test case 5: Test if the method returns null when the last component is not found
@Test
void testGetParallelGroupLastNotFound() {
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel, "comp1 comp2");
    JLabel comp1 = new JLabel("Component 1");
    gle.associate("comp1", comp1);
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertNull(fpg);
}

// Test case 6: Test if the method returns null when the first and last components are not found
@Test
void testGetParallelGroupBothNotFound() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertNull(fpg);
}

// Test case 7: Test if the method returns null when the first and last components are the same
@Test
void testGetParallelGroupSameComponents() {
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel, "comp1");
    JLabel comp1 = new JLabel("Component 1");
    gle.associate("comp1", comp1);
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp1");
    assertNull(fpg);
}

// Test case 8: Test if the method returns null when the first and last components are in different groups
@Test
void testGetParallelGroupDifferentGroups() {
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel, "comp1 comp2 | comp3 comp4");
    JLabel comp1 = new JLabel("Component 1");
    JLabel comp2 = new JLabel("Component 2");
    JLabel comp3 = new JLabel("Component 3");
    JLabel comp4 = new JLabel("Component 4");
    gle.associate("comp1", comp1);
    gle.associate("comp2", comp2);
    gle.associate("comp3", comp3);
    gle.associate("comp4", comp4);
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp4");
    assertNull(fpg);
}

// Test case 9: Test if the method returns the correct parallel group when components are in different groups
@Test
void testGetParallelGroupDifferentGroupsCorrect() {
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel, "comp1 comp2 | comp3 comp4");
    JLabel comp1 = new JLabel("Component 1");
    JLabel comp2 = new JLabel("Component 2");
    JLabel comp3 = new JLabel("Component 3");
    JLabel comp4 = new JLabel("Component 4");
    gle.associate("comp1", comp1);
    gle.associate("comp2", comp2);
    gle.associate("comp3", comp3);
    gle.associate("comp4", comp4);
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp3");
    ParallelGroup pg = layout.createParallelGroup(GroupLayout.Alignment.LEADING, comp1, comp2, comp3);
    assertEquals(pg, fpg.getParallelGroup());
}

// Test case 10: Test if the method returns the correct parallel group when components are in different groups and separated by gaps
@Test
void testGetParallelGroupDifferentGroupsGapsCorrect() {
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel, "comp1 . comp2 | comp3 . comp4");
    JLabel comp1 = new JLabel("Component 1");
    JLabel comp2 = new JLabel("Component 2");
    JLabel comp3 = new JLabel("Component 3");
    JLabel comp4 = new JLabel("Component 4");
    gle.associate("comp1", comp1);
    gle.associate("comp2", comp2);
    gle.associate("comp3", comp3);
    gle.associate("comp4", comp4);
    gle.associateGap(".", ComponentPlacement.UNRELATED);
    FunctionsOnParallelGroup fpg = gle.getParallelGroup(Axis.HORIZONTAL, "comp1", "comp3");
    ParallelGroup pg = layout.createParallelGroup(GroupLayout.Alignment.LEADING, comp1, comp2, comp3);
    assertEquals(pg, fpg.getParallelGroup());
}