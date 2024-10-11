// Test case 1: Test if getComponent() returns null for a non-existing component
@Test
void testGetComponentNonExisting() {
    // Create a GroupLayoutEngineer with an empty container
    GroupLayoutEngineer gle = new GroupLayoutEngineer(new JPanel());

    // Try to get a non-existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "nonExisting");

    // Assert that the result is null
    assertNull(foc);
}

// Test case 2: Test if getComponent() returns the correct FunctionsOnComponent object for an existing component
@Test
void testGetComponentExisting() {
    // Create a GroupLayoutEngineer with a container and a component
    JPanel panel = new JPanel();
    JButton button = new JButton("Test");
    panel.add(button);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "Test");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertTrue(foc instanceof JButtonSetter);
}

// Test case 3: Test if getComponent() returns the correct FunctionsOnComponent object for a component with a custom setter
@Test
void testGetComponentCustomSetter() {
    // Create a GroupLayoutEngineer with a container and a component with a custom setter
    JPanel panel = new JPanel();
    JCheckBox checkBox = new JCheckBox("Test");
    panel.add(checkBox);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);
    gle.setCustomSetter(JCheckBox.class, new JCheckBoxSetter());

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "Test");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertTrue(foc instanceof JCheckBoxSetter);
}

// Test case 4: Test if getComponent() returns the correct FunctionsOnComponent object for a component with a custom settings object
@Test
void testGetComponentCustomSettings() {
    // Create a GroupLayoutEngineer with a container and a component with a custom settings object
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Test");
    panel.add(label);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);
    gle.setCustomSettings(JLabel.class, new JLabelSettings());

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "Test");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertTrue(foc instanceof JLabelSettings);
}

// Test case 5: Test if getComponent() returns the correct FunctionsOnComponent object for a component with both a custom setter and custom settings object
@Test
void testGetComponentCustomSetterAndSettings() {
    // Create a GroupLayoutEngineer with a container and a component with both a custom setter and custom settings object
    JPanel panel = new JPanel();
    JTextField textField = new JTextField("Test");
    panel.add(textField);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);
    gle.setCustomSetter(JTextField.class, new JTextFieldSetter());
    gle.setCustomSettings(JTextField.class, new JTextFieldSettings());

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "Test");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertTrue(foc instanceof JTextFieldSetter);
    assertTrue(foc instanceof JTextFieldSettings);
}

// Test case 6: Test if getComponent() returns the correct FunctionsOnComponent object for a component with a custom setter and default settings object
@Test
void testGetComponentCustomSetterAndDefaultSettings() {
    // Create a GroupLayoutEngineer with a container and a component with a custom setter and default settings object
    JPanel panel = new JPanel();
    JPasswordField passwordField = new JPasswordField("Test");
    panel.add(passwordField);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);
    gle.setCustomSetter(JPasswordField.class, new JPasswordFieldSetter());

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "Test");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertTrue(foc instanceof JPasswordFieldSetter);
    assertFalse(foc instanceof JPasswordFieldSettings);
}

// Test case 7: Test if getComponent() returns the correct FunctionsOnComponent object for a component with default setter and custom settings object
@Test
void testGetComponentDefaultSetterAndCustomSettings() {
    // Create a GroupLayoutEngineer with a container and a component with default setter and custom settings object
    JPanel panel = new JPanel();
    JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
    panel.add(spinner);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);
    gle.setCustomSettings(JSpinner.class, new JSpinnerSettings());

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "0");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertFalse(foc instanceof JSpinnerSetter);
    assertTrue(foc instanceof JSpinnerSettings);
}

// Test case 8: Test if getComponent() returns the correct FunctionsOnComponent object for a component with default setter and default settings object
@Test
void testGetComponentDefaultSetterAndSettings() {
    // Create a GroupLayoutEngineer with a container and a component with default setter and default settings object
    JPanel panel = new JPanel();
    JComboBox<String> comboBox = new JComboBox<>(new String[]{"Test1", "Test2", "Test3"});
    panel.add(comboBox);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "Test1");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertFalse(foc instanceof JComboBoxSetter);
    assertFalse(foc instanceof JComboBoxSettings);
}

// Test case 9: Test if getComponent() returns the correct FunctionsOnComponent object for a component with a custom setter and null settings object
@Test
void testGetComponentCustomSetterAndNullSettings() {
    // Create a GroupLayoutEngineer with a container and a component with a custom setter and null settings object
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea("Test");
    panel.add(textArea);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);
    gle.setCustomSetter(JTextArea.class, new JTextAreaSetter());

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "Test");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertTrue(foc instanceof JTextAreaSetter);
    assertFalse(foc instanceof JTextAreaSettings);
}

// Test case 10: Test if getComponent() returns the correct FunctionsOnComponent object for a component with default setter and null settings object
@Test
void testGetComponentDefaultSetterAndNullSettings() {
    // Create a GroupLayoutEngineer with a container and a component with default setter and null settings object
    JPanel panel = new JPanel();
    JSlider slider = new JSlider();
    panel.add(slider);
    GroupLayoutEngineer gle = new GroupLayoutEngineer(panel);

    // Try to get the existing component
    FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "0");

    // Assert that the result is not null and that it is the correct object
    assertNotNull(foc);
    assertFalse(foc instanceof JSliderSetter);
    assertFalse(foc instanceof JSliderSettings);
}