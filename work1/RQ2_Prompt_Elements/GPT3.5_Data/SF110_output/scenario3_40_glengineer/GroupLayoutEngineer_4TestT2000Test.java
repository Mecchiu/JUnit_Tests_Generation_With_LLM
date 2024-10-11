// Test cases for the GroupLayoutEngineer class
class GroupLayoutEngineer_4Test {
    
    // Test case 1: Test if the top level sequential group is returned for horizontal axis
    @Test
    void testGetTopSequentialGroupHorizontal() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a horizontal scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1 FIELD1",
            "LABEL2 FIELD2"
        );
        
        // Get the top level sequential group for horizontal axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group is not null
        assertNotNull(group);
    }
    
    // Test case 2: Test if the top level sequential group is returned for vertical axis
    @Test
    void testGetTopSequentialGroupVertical() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a vertical scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1",
            "FIELD1",
            "LABEL2",
            "FIELD2"
        );
        
        // Get the top level sequential group for vertical axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group is not null
        assertNotNull(group);
    }
    
    // Test case 3: Test if the correct number of elements are added to the top level sequential group for horizontal axis
    @Test
    void testGetTopSequentialGroupHorizontalElements() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a horizontal scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1 FIELD1",
            "LABEL2 FIELD2"
        );
        
        // Get the top level sequential group for horizontal axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group contains the correct number of elements
        assertEquals(4, group.getElements().size());
    }
    
    // Test case 4: Test if the correct number of elements are added to the top level sequential group for vertical axis
    @Test
    void testGetTopSequentialGroupVerticalElements() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a vertical scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1",
            "FIELD1",
            "LABEL2",
            "FIELD2"
        );
        
        // Get the top level sequential group for vertical axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group contains the correct number of elements
        assertEquals(4, group.getElements().size());
    }
    
    // Test case 5: Test if the correct elements are added to the top level sequential group for horizontal axis
    @Test
    void testGetTopSequentialGroupHorizontalElementsOrder() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a horizontal scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1 FIELD1",
            "LABEL2 FIELD2"
        );
        
        // Get the top level sequential group for horizontal axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group contains the correct elements in the correct order
        assertEquals("LABEL1", group.getElements().get(0).getName());
        assertEquals("FIELD1", group.getElements().get(1).getName());
        assertEquals("LABEL2", group.getElements().get(2).getName());
        assertEquals("FIELD2", group.getElements().get(3).getName());
    }
    
    // Test case 6: Test if the correct elements are added to the top level sequential group for vertical axis
    @Test
    void testGetTopSequentialGroupVerticalElementsOrder() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a vertical scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1",
            "FIELD1",
            "LABEL2",
            "FIELD2"
        );
        
        // Get the top level sequential group for vertical axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group contains the correct elements in the correct order
        assertEquals("LABEL1", group.getElements().get(0).getName());
        assertEquals("FIELD1", group.getElements().get(1).getName());
        assertEquals("LABEL2", group.getElements().get(2).getName());
        assertEquals("FIELD2", group.getElements().get(3).getName());
    }
    
    // Test case 7: Test if the correct number of groups are added to the top level sequential group for horizontal axis
    @Test
    void testGetTopSequentialGroupHorizontalGroups() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a horizontal scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1 FIELD1",
            "LABEL2 FIELD2"
        );
        
        // Get the top level sequential group for horizontal axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group contains the correct number of groups
        assertEquals(2, group.getGroups().size());
    }
    
    // Test case 8: Test if the correct number of groups are added to the top level sequential group for vertical axis
    @Test
    void testGetTopSequentialGroupVerticalGroups() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a vertical scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1",
            "FIELD1",
            "LABEL2",
            "FIELD2"
        );
        
        // Get the top level sequential group for vertical axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group contains the correct number of groups
        assertEquals(2, group.getGroups().size());
    }
    
    // Test case 9: Test if the correct groups are added to the top level sequential group for horizontal axis
    @Test
    void testGetTopSequentialGroupHorizontalGroupsOrder() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a horizontal scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1 FIELD1",
            "LABEL2 FIELD2"
        );
        
        // Get the top level sequential group for horizontal axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group contains the correct groups in the correct order
        assertEquals("LABEL1 FIELD1", group.getGroups().get(0).toString());
        assertEquals("LABEL2 FIELD2", group.getGroups().get(1).toString());
    }
    
    // Test case 10: Test if the correct groups are added to the top level sequential group for vertical axis
    @Test
    void testGetTopSequentialGroupVerticalGroupsOrder() {
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a GroupLayoutEngineer with a vertical scheme
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            panel,
            "LABEL1",
            "FIELD1",
            "LABEL2",
            "FIELD2"
        );
        
        // Get the top level sequential group for vertical axis
        FunctionsOnTopSequentialGroup group = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group contains the correct groups in the correct order
        assertEquals("LABEL1", group.getGroups().get(0).toString());
        assertEquals("FIELD1", group.getGroups().get(1).toString());
        assertEquals("LABEL2", group.getGroups().get(2).toString());
        assertEquals("FIELD2", group.getGroups().get(3).toString());
    }
}