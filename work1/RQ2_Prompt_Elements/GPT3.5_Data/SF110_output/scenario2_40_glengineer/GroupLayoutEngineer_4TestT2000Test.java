// Test cases for the GroupLayoutEngineer class
class GroupLayoutEngineer_4Test {
    
    // Test case 1: Test if the top level sequential group is not null
    @Test
    void testGetTopSequentialGroupNotNull() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertNotNull(topSeqGroup);
    }
    
    // Test case 2: Test if the top level sequential group is of type SequentialGroup
    @Test
    void testGetTopSequentialGroupType() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertTrue(topSeqGroup instanceof SequentialGroup);
    }
    
    // Test case 3: Test if the top level sequential group has the correct axis
    @Test
    void testGetTopSequentialGroupAxis() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertEquals(topSeqGroup.getAxis(), Axis.HORIZONTAL);
    }
    
    // Test case 4: Test if the top level sequential group has no elements
    @Test
    void testGetTopSequentialGroupNoElements() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertTrue(topSeqGroup.getElements().isEmpty());
    }
    
    // Test case 5: Test if the top level sequential group has one element
    @Test
    void testGetTopSequentialGroupOneElement() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        topSeqGroup.addComponent(new JButton());
        assertEquals(topSeqGroup.getElements().size(), 1);
    }
    
    // Test case 6: Test if the top level sequential group has multiple elements
    @Test
    void testGetTopSequentialGroupMultipleElements() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        topSeqGroup.addComponent(new JButton());
        topSeqGroup.addComponent(new JTextField());
        topSeqGroup.addComponent(new JLabel());
        assertEquals(topSeqGroup.getElements().size(), 3);
    }
    
    // Test case 7: Test if the top level sequential group has the correct elements
    @Test
    void testGetTopSequentialGroupCorrectElements() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        JButton button = new JButton();
        JTextField textField = new JTextField();
        JLabel label = new JLabel();
        topSeqGroup.addComponent(button);
        topSeqGroup.addComponent(textField);
        topSeqGroup.addComponent(label);
        List<Component> elements = topSeqGroup.getElements();
        assertTrue(elements.contains(button));
        assertTrue(elements.contains(textField));
        assertTrue(elements.contains(label));
    }
    
    // Test case 8: Test if the top level sequential group has the correct size
    @Test
    void testGetTopSequentialGroupCorrectSize() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        JButton button = new JButton();
        JTextField textField = new JTextField();
        JLabel label = new JLabel();
        topSeqGroup.addComponent(button);
        topSeqGroup.addComponent(textField);
        topSeqGroup.addComponent(label);
        assertEquals(topSeqGroup.getSize(), 3);
    }
    
    // Test case 9: Test if the top level sequential group has the correct gap size
    @Test
    void testGetTopSequentialGroupCorrectGapSize() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        topSeqGroup.addGap(10);
        assertEquals(topSeqGroup.getSize(), 1);
        assertEquals(topSeqGroup.getGapSize(), 10);
    }
    
    // Test case 10: Test if the top level sequential group has the correct gap type
    @Test
    void testGetTopSequentialGroupCorrectGapType() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        FunctionsOnTopSequentialGroup topSeqGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        topSeqGroup.addPreferredGap(ComponentPlacement.UNRELATED);
        assertEquals(topSeqGroup.getSize(), 1);
        assertEquals(topSeqGroup.getGapType(), ComponentPlacement.UNRELATED);
    }
}