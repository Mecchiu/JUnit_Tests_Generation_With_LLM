// Test case 1: Test if the method returns a FunctionsOnGroup object
@Test
void testGetGroupReturnsFunctionsOnGroup() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnGroup fog = gle.getGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertTrue(fog instanceof FunctionsOnGroup);
}

// Test case 2: Test if the method throws an IllegalArgumentException when no group is found
@Test
void testGetGroupThrowsIllegalArgumentException() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    assertThrows(IllegalArgumentException.class, () -> gle.getGroup(Axis.HORIZONTAL, "comp1", "comp2"));
}

// Test case 3: Test if the method returns a SequentialGroup object for horizontal axis
@Test
void testGetGroupReturnsSequentialGroupForHorizontal() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    gle.associate("comp1", new JLabel());
    gle.associate("comp2", new JTextField());
    FunctionsOnGroup fog = gle.getGroup(Axis.HORIZONTAL, "comp1", "comp2");
    assertTrue(fog instanceof SequentialGroup);
}

// Test case 4: Test if the method returns a ParallelGroup object for vertical axis
@Test
void testGetGroupReturnsParallelGroupForVertical() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    gle.associate("comp1", new JLabel());
    gle.associate("comp2", new JTextField());
    FunctionsOnGroup fog = gle.getGroup(Axis.VERTICAL, "comp1", "comp2");
    assertTrue(fog instanceof ParallelGroup);
}

// Test case 5: Test if the method returns a SequentialGroup object for single component
@Test
void testGetGroupReturnsSequentialGroupForSingleComponent() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    gle.associate("comp1", new JLabel());
    FunctionsOnGroup fog = gle.getGroup(Axis.HORIZONTAL, "comp1", "comp1");
    assertTrue(fog instanceof SequentialGroup);
}

// Test case 6: Test if the method returns a ParallelGroup object for single component
@Test
void testGetGroupReturnsParallelGroupForSingleComponent() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    gle.associate("comp1", new JLabel());
    FunctionsOnGroup fog = gle.getGroup(Axis.VERTICAL, "comp1", "comp1");
    assertTrue(fog instanceof ParallelGroup);
}

// Test case 7: Test if the method returns a SequentialGroup object for empty range
@Test
void testGetGroupReturnsSequentialGroupForEmptyRange() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnGroup fog = gle.getGroup(Axis.HORIZONTAL, "comp1", "comp1");
    assertTrue(fog instanceof SequentialGroup);
}

// Test case 8: Test if the method returns a ParallelGroup object for empty range
@Test
void testGetGroupReturnsParallelGroupForEmptyRange() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    FunctionsOnGroup fog = gle.getGroup(Axis.VERTICAL, "comp1", "comp1");
    assertTrue(fog instanceof ParallelGroup);
}

// Test case 9: Test if the method returns a SequentialGroup object for reversed range
@Test
void testGetGroupReturnsSequentialGroupForReversedRange() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    gle.associate("comp1", new JLabel());
    gle.associate("comp2", new JTextField());
    FunctionsOnGroup fog = gle.getGroup(Axis.HORIZONTAL, "comp2", "comp1");
    assertTrue(fog instanceof SequentialGroup);
}

// Test case 10: Test if the method returns a ParallelGroup object for reversed range
@Test
void testGetGroupReturnsParallelGroupForReversedRange() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "");
    gle.associate("comp1", new JLabel());
    gle.associate("comp2", new JTextField());
    FunctionsOnGroup fog = gle.getGroup(Axis.VERTICAL, "comp2", "comp1");
    assertTrue(fog instanceof ParallelGroup);
}