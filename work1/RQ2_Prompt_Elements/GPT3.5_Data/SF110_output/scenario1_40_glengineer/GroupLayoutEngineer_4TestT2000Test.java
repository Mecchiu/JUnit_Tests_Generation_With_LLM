// Test cases for the GroupLayoutEngineer class
class GroupLayoutEngineer_4Test {
    
    // Test case 1: Test if the top sequential group is created correctly for the horizontal axis
    @Test
    void testGetTopSequentialGroup_Horizontal() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Get the top sequential group for the horizontal axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.HORIZONTAL, topGroup.getAxis());
    }
    
    // Test case 2: Test if the top sequential group is created correctly for the vertical axis
    @Test
    void testGetTopSequentialGroup_Vertical() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Get the top sequential group for the vertical axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.VERTICAL, topGroup.getAxis());
    }
    
    // Test case 3: Test if the top sequential group is created correctly for the horizontal axis with a single component
    @Test
    void testGetTopSequentialGroup_Horizontal_SingleComponent() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Add a single component to the container
        JLabel label = new JLabel("Test");
        container.add(label);
        
        // Get the top sequential group for the horizontal axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.HORIZONTAL, topGroup.getAxis());
        
        // Check if the group contains the component
        assertTrue(topGroup.getElements().contains(label));
    }
    
    // Test case 4: Test if the top sequential group is created correctly for the vertical axis with a single component
    @Test
    void testGetTopSequentialGroup_Vertical_SingleComponent() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Add a single component to the container
        JLabel label = new JLabel("Test");
        container.add(label);
        
        // Get the top sequential group for the vertical axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.VERTICAL, topGroup.getAxis());
        
        // Check if the group contains the component
        assertTrue(topGroup.getElements().contains(label));
    }
    
    // Test case 5: Test if the top sequential group is created correctly for the horizontal axis with multiple components
    @Test
    void testGetTopSequentialGroup_Horizontal_MultipleComponents() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Add multiple components to the container
        JLabel label1 = new JLabel("Test 1");
        JLabel label2 = new JLabel("Test 2");
        JLabel label3 = new JLabel("Test 3");
        container.add(label1);
        container.add(label2);
        container.add(label3);
        
        // Get the top sequential group for the horizontal axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.HORIZONTAL, topGroup.getAxis());
        
        // Check if the group contains all the components
        assertTrue(topGroup.getElements().contains(label1));
        assertTrue(topGroup.getElements().contains(label2));
        assertTrue(topGroup.getElements().contains(label3));
    }
    
    // Test case 6: Test if the top sequential group is created correctly for the vertical axis with multiple components
    @Test
    void testGetTopSequentialGroup_Vertical_MultipleComponents() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Add multiple components to the container
        JLabel label1 = new JLabel("Test 1");
        JLabel label2 = new JLabel("Test 2");
        JLabel label3 = new JLabel("Test 3");
        container.add(label1);
        container.add(label2);
        container.add(label3);
        
        // Get the top sequential group for the vertical axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.VERTICAL, topGroup.getAxis());
        
        // Check if the group contains all the components
        assertTrue(topGroup.getElements().contains(label1));
        assertTrue(topGroup.getElements().contains(label2));
        assertTrue(topGroup.getElements().contains(label3));
    }
    
    // Test case 7: Test if the top sequential group is created correctly for the horizontal axis with multiple components and gaps
    @Test
    void testGetTopSequentialGroup_Horizontal_MultipleComponentsAndGaps() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Add multiple components and gaps to the container
        JLabel label1 = new JLabel("Test 1");
        JLabel label2 = new JLabel("Test 2");
        JLabel label3 = new JLabel("Test 3");
        container.add(label1);
        container.addGap(10);
        container.add(label2);
        container.addGap(20);
        container.add(label3);
        
        // Get the top sequential group for the horizontal axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.HORIZONTAL, topGroup.getAxis());
        
        // Check if the group contains all the components and gaps
        assertTrue(topGroup.getElements().contains(label1));
        assertTrue(topGroup.getElements().contains(label2));
        assertTrue(topGroup.getElements().contains(label3));
        assertTrue(topGroup.getGaps().contains(10));
        assertTrue(topGroup.getGaps().contains(20));
    }
    
    // Test case 8: Test if the top sequential group is created correctly for the vertical axis with multiple components and gaps
    @Test
    void testGetTopSequentialGroup_Vertical_MultipleComponentsAndGaps() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Add multiple components and gaps to the container
        JLabel label1 = new JLabel("Test 1");
        JLabel label2 = new JLabel("Test 2");
        JLabel label3 = new JLabel("Test 3");
        container.add(label1);
        container.addGap(10);
        container.add(label2);
        container.addGap(20);
        container.add(label3);
        
        // Get the top sequential group for the vertical axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.VERTICAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.VERTICAL, topGroup.getAxis());
        
        // Check if the group contains all the components and gaps
        assertTrue(topGroup.getElements().contains(label1));
        assertTrue(topGroup.getElements().contains(label2));
        assertTrue(topGroup.getElements().contains(label3));
        assertTrue(topGroup.getGaps().contains(10));
        assertTrue(topGroup.getGaps().contains(20));
    }
    
    // Test case 9: Test if the top sequential group is created correctly for the horizontal axis with multiple components and gaps of different types
    @Test
    void testGetTopSequentialGroup_Horizontal_MultipleComponentsAndGaps_DifferentTypes() {
        // Create a container and a GroupLayoutEngineer instance
        Container container = new JPanel();
        GroupLayoutEngineer gle = new GroupLayoutEngineer(container);
        
        // Add multiple components and gaps of different types to the container
        JLabel label1 = new JLabel("Test 1");
        JLabel label2 = new JLabel("Test 2");
        JLabel label3 = new JLabel("Test 3");
        container.add(label1);
        container.addGap(10);
        container.add(label2);
        container.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        container.add(label3);
        
        // Get the top sequential group for the horizontal axis
        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        
        // Check if the group is not null and has the correct axis
        assertNotNull(topGroup);
        assertEquals(Axis.HORIZONTAL, topGroup.getAxis());
        
        // Check if the group contains all the components and gaps
        assertTrue(topGroup.getElements().contains(label1));
        assertTrue(topGroup.getElements().contains(label2));
        assertTrue(topGroup.getElements().contains(label3));
        assertTrue(topGroup.getGaps().contains(10));
        assertTrue(top