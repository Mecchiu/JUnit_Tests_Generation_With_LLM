```java
    private GroupLayoutEngineer engineer;

    @BeforeEach
    void setUp() {
        engineer = new GroupLayoutEngineer(new JPanel(),
                "COMP1  COMP2  COMP3",
                "COMP4  COMP5  COMP6");
        engineer.associate("COMP1", new JLabel("Label 1"));
        engineer.associate("COMP2", new JTextField());
        engineer.associate("COMP3", new JButton("Button 1"));
        engineer.associate("COMP4", new JCheckBox("Checkbox 1"));
        engineer.associate("COMP5", new JRadioButton("Radio 1"));
        engineer.associate("COMP6", new JButton("Button 2"));
    }

    @Test
    void testGetComponent_Horizontal_FirstComponent() {
        FunctionsOnComponent functions = engineer.getComponent(Axis.HORIZONTAL, "COMP1");
        assertNotNull(functions);
    }

    @Test
    void testGetComponent_Horizontal_LastComponent() {
        FunctionsOnComponent functions = engineer.getComponent(Axis.HORIZONTAL, "COMP3");
        assertNotNull(functions);
    }

    @Test
    void testGetComponent_Horizontal_MiddleComponent() {
        FunctionsOnComponent functions = engineer.getComponent(Axis.HORIZONTAL, "COMP2");
        assertNotNull(functions);
    }

    @Test
    void testGetComponent_Vertical_FirstComponent() {
        FunctionsOnComponent functions = engineer.getComponent(Axis.VERTICAL, "COMP1");
        assertNotNull(functions);
    }

    @Test
    void testGetComponent_Vertical_LastComponent() {
        FunctionsOnComponent functions = engineer.getComponent(Axis.VERTICAL, "COMP4");
        assertNotNull(functions);
    }

    @Test
    void testGetComponent_Vertical_MiddleComponent() {
        FunctionsOnComponent functions = engineer.getComponent(Axis.VERTICAL, "COMP5");
        assertNotNull(functions);
    }

    @Test
    void testGetComponent_NonExistentComponent() {
        assertThrows(IllegalArgumentException.class, () -> engineer.getComponent(Axis.HORIZONTAL, "COMP7"));
    }

    @Test
    void testGetComponent_NullName() {
        assertThrows(IllegalArgumentException.class, () -> engineer.getComponent(Axis.HORIZONTAL, null));
    }

    @Test
    void testGetComponent_NullAxis() {
        assertThrows(IllegalArgumentException.class, () -> engineer.getComponent(null, "COMP1"));
    }
```
