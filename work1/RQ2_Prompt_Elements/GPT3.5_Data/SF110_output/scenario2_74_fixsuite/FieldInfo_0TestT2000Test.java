// Here's an example of how you can test the FieldInfo class:

@Test
void testIsRequiredInComponent() {
    // Create a new FieldInfo object
    FieldInfo field = new FieldInfo();

    // Create a new ComponentInfo object
    ComponentInfo component = new ComponentInfo();

    // Test that the field is not required in the component
    assertFalse(field.isRequiredInComponent(component));

    // Add the component to the list of requiring components for the field
    List<ComponentInfo> requiringComponents = new ArrayList<>();
    requiringComponents.add(component);
    field.setRequiringComponents(requiringComponents);

    // Test that the field is now required in the component
    assertTrue(field.isRequiredInComponent(component));

    // Create another component and test that the field is not required in it
    ComponentInfo anotherComponent = new ComponentInfo();
    assertFalse(field.isRequiredInComponent(anotherComponent));
}