```java
    private GroupLayoutEngineer engineer;

    @BeforeEach
    void setUp() {
        Container container = new JPanel();
        engineer = new GroupLayoutEngineer(container,
                "COMP1  COMP2  COMP3",
                "COMP4  COMP5  COMP6"
        );
        engineer.associate("COMP1", new JLabel("Label 1"));
        engineer.associate("COMP2", new JTextField());
        engineer.associate("COMP3", new JButton("Button 1"));
        engineer.associate("COMP4", new JCheckBox("Checkbox 1"));
        engineer.associate("COMP5", new JRadioButton("Radio 1"));
        engineer.associate("COMP6", new JButton("Button 2"));
    }

    @Test
    void testGetGroup_Horizontal_FirstAndLastComponents() {
        FunctionsOnGroup group = engineer.getGroup(Axis.HORIZONTAL, "COMP1", "COMP3");
        assertNotNull(group);
    }

    @Test
    void testGetGroup_Horizontal_FirstAndLastComponents_NonExistentGroup() {
        assertThrows(IllegalArgumentException.class, () -> engineer.getGroup(Axis.HORIZONTAL, "COMP1", "COMP4"));
    }

    @Test
    void testGetGroup_Horizontal_FirstAndLastComponents_NonExistentComponents() {
        assertThrows(IllegalArgumentException.class, () -> engineer.getGroup(Axis.HORIZONTAL, "COMP1", "COMP7"));
    }

    @Test
    void testGetGroup_Vertical_FirstAndLastComponents() {
        FunctionsOnGroup group = engineer.getGroup(Axis.VERTICAL, "COMP1", "COMP4");
        assertNotNull(group);
    }

    @Test
    void testGetGroup_Vertical_FirstAndLastComponents_NonExistentGroup() {
        assertThrows(IllegalArgumentException.class, () -> engineer.getGroup(Axis.VERTICAL, "COMP1", "COMP5"));
    }

    @Test
    void testGetGroup_Vertical_FirstAndLastComponents_NonExistentComponents() {
        assertThrows(IllegalArgumentException.class, () -> engineer.getGroup(Axis.VERTICAL, "COMP1", "COMP7"));
    }

    @Test
    void testGetGroup_Horizontal_FirstAndLastComponents_AssertInstanceOfFunctionsOnGroup() {
        FunctionsOnGroup group = engineer.getGroup(Axis.HORIZONTAL, "COMP1", "COMP3");
        assertTrue(group instanceof FunctionsOnGroup);
    }

    @Test
    void testGetGroup_Vertical_FirstAndLastComponents_AssertInstanceOfFunctionsOnGroup() {
        FunctionsOnGroup group = engineer.getGroup(Axis.VERTICAL, "COMP1", "COMP4");
        assertTrue(group instanceof FunctionsOnGroup);
    }

    @Test
    void testGetGroup_Horizontal_FirstAndLastComponents_AssertInstanceOfFunctionsOnParallelGroup() {
        FunctionsOnGroup group = engineer.getGroup(Axis.HORIZONTAL, "COMP1", "COMP3");
        assertTrue(group instanceof FunctionsOnParallelGroup);
    }

    @Test
    void testGetGroup_Vertical_FirstAndLastComponents_AssertInstanceOfFunctionsOnSequentialGroup() {
        FunctionsOnGroup group = engineer.getGroup(Axis.VERTICAL, "COMP1", "COMP4");
        assertTrue(group instanceof FunctionsOnSequentialGroup);
    }
```
