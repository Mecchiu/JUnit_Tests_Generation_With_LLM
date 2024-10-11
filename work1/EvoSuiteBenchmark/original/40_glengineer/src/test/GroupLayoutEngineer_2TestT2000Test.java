```java
    GroupLayoutEngineer gle;
    
    @Test
    void testGetParallelGroup() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        FunctionsOnParallelGroup functions = gle.getParallelGroup(Axis.HORIZONTAL, "COMP1", "COMP3");
        
        assertNotNull(functions);
    }
    
    @Test
    void testGetParallelGroup_NonExistentGroup() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            gle.getParallelGroup(Axis.HORIZONTAL, "COMP1", "COMP4");
        });
    }
    
    @Test
    void testGetParallelGroup_NonExistentComponent() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            gle.getParallelGroup(Axis.HORIZONTAL, "COMP1", "COMP4");
        });
    }
    
    @Test
    void testGetParallelGroup_VerticalDirection() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        FunctionsOnParallelGroup functions = gle.getParallelGroup(Axis.VERTICAL, "COMP1", "COMP3");
        
        assertNotNull(functions);
    }
    
    @Test
    void testGetParallelGroup_NullNames() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            gle.getParallelGroup(Axis.HORIZONTAL, null, null);
        });
    }
    
    @Test
    void testGetParallelGroup_NullFirstName() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            gle.getParallelGroup(Axis.HORIZONTAL, null, "COMP3");
        });
    }
    
    @Test
    void testGetParallelGroup_NullLastName() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            gle.getParallelGroup(Axis.HORIZONTAL, "COMP1", null);
        });
    }
    
    @Test
    void testGetParallelGroup_EmptyNames() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            gle.getParallelGroup(Axis.HORIZONTAL, "", "");
        });
    }
    
    @Test
    void testGetParallelGroup_SameNames() {
        gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2 COMP3");
        gle.associate("COMP1", new JButton("Button 1"));
        gle.associate("COMP2", new JButton("Button 2"));
        gle.associate("COMP3", new JButton("Button 3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            gle.getParallelGroup(Axis.HORIZONTAL, "COMP1", "COMP1");
        });
    }
}
```