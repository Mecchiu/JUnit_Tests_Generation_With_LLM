// Here's an example of how you can test the FieldInfo class:

@Test
void testIsRequiredInComponent() {
    // Create a new FieldInfo object
    FieldInfo field = new FieldInfo();

    // Create a new ComponentInfo object
    ComponentInfo component = new ComponentInfo();

    // Add the field to the component
    component.addField(field);

    // Test that the field is required in the component
    assertTrue(field.isRequiredInComponent(component));

    // Create a new ComponentInfo object without the field
    ComponentInfo componentWithoutField = new ComponentInfo();

    // Test that the field is not required in the component without the field
    assertFalse(field.isRequiredInComponent(componentWithoutField));
}