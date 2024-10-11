// Test case 1: Test if the method returns the correct sequential group agent
@Test
void testGetSequentialGroup1() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-B-C");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "C");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 2: Test if the method returns null when no sequential group is found
@Test
void testGetSequentialGroup2() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-B-C");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.VERTICAL, "A", "C");
    assertNull(agent);
}

// Test case 3: Test if the method returns the correct sequential group agent when there are multiple sequential groups
@Test
void testGetSequentialGroup3() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-B-C-D-E");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    gle.associate("D", new JCheckBox());
    gle.associate("E", new JRadioButton());
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "C");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 4: Test if the method returns the correct sequential group agent when the first and last components are the same
@Test
void testGetSequentialGroup4() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-B-C");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "A");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 5: Test if the method returns the correct sequential group agent when the first and last components are adjacent
@Test
void testGetSequentialGroup5() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-B-C");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "B");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 6: Test if the method returns the correct sequential group agent when the first and last components are in different sequential groups
@Test
void testGetSequentialGroup6() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-B-C-D-E");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    gle.associate("D", new JCheckBox());
    gle.associate("E", new JRadioButton());
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "B", "D");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 7: Test if the method returns the correct sequential group agent when there are gaps between the first and last components
@Test
void testGetSequentialGroup7() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A--B--C");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "C");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 8: Test if the method returns the correct sequential group agent when there are gaps between the first and last components and the gaps have associated values
@Test
void testGetSequentialGroup8() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-.5-B-.5-C");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    gle.associateGap(".5", 5);
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "C");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 9: Test if the method returns the correct sequential group agent when there are gaps between the first and last components and the gaps have associated values and are of different types
@Test
void testGetSequentialGroup9() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-.5-B--C");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    gle.associateGap(".5", 5);
    FunctionsOnSequentialGroup agent = gle.getSequentialGroup(Axis.HORIZONTAL, "A", "C");
    assertTrue(agent instanceof SequentialGroupAgent);
}

// Test case 10: Test if the method throws an IllegalArgumentException when the first and last components are not on the same line
@Test
void testGetSequentialGroup10() {
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "A-B-C", "D-E-F");
    gle.associate("A", new JLabel());
    gle.associate("B", new JTextField());
    gle.associate("C", new JButton());
    gle.associate("D", new JLabel());
    gle.associate("E", new JTextField());
    gle.associate("F", new JButton());
    assertThrows(IllegalArgumentException.class, () -> gle.getSequentialGroup(Axis.HORIZONTAL, "A", "F"));
}