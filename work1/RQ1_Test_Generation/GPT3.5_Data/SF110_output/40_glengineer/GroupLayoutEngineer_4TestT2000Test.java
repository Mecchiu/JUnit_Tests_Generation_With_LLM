```java
    @Test
    void testGetTopSequentialGroup_Horizontal() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1 COMP2", "----+----");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertNotNull(functions);
    }

    @Test
    void testGetTopSequentialGroup_Vertical() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1", "----", "COMP2");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.VERTICAL);
        assertNotNull(functions);
    }

    @Test
    void testGetTopSequentialGroup_NonExistentAxis() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1", "----", "COMP2");
        assertThrows(IllegalArgumentException.class, () -> gle.getTopSequentialGroup(null));
    }

    @Test
    void testGetTopSequentialGroup_NoComponents() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());
        assertThrows(IllegalArgumentException.class, () -> gle.getTopSequentialGroup(Axis.HORIZONTAL));
    }

    @Test
    void testGetTopSequentialGroup_HorizontalWithGaps() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1 . COMP2", "----+----");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertNotNull(functions);
    }

    @Test
    void testGetTopSequentialGroup_VerticalWithGaps() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1", "----", "COMP2 .");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.VERTICAL);
        assertNotNull(functions);
    }

    @Test
    void testGetTopSequentialGroup_HorizontalWithGapsAndComponents() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1 . COMP2", "----+----", "COMP3");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertNotNull(functions);
    }

    @Test
    void testGetTopSequentialGroup_VerticalWithGapsAndComponents() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1", "----", "COMP2 .", "COMP3");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.VERTICAL);
        assertNotNull(functions);
    }

    @Test
    void testGetTopSequentialGroup_HorizontalWithGapsAndNonComponents() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1 . COMP2", "----+----", "----");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.HORIZONTAL);
        assertNotNull(functions);
    }

    @Test
    void testGetTopSequentialGroup_VerticalWithGapsAndNonComponents() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel(), "COMP1", "----", "COMP2 .", "----");
        FunctionsOnTopSequentialGroup functions = gle.getTopSequentialGroup(Axis.VERTICAL);
        assertNotNull(functions);
    }
```
