// Here's an example of how you can write unit tests for the FieldInfo class:

@Test
void testIsRequiredInComponent() {
    // Create a new FieldInfo object
    FieldInfo field = new FieldInfo();

    // Create some ComponentInfo objects to use in the tests
    ComponentInfo component1 = new ComponentInfo();
    ComponentInfo component2 = new ComponentInfo();
    ComponentInfo component3 = new ComponentInfo();

    // Test case 1: No requiring components set
    assertFalse(field.isRequiredInComponent(component1));

    // Test case 2: Empty requiring components set
    field.setRequiringComponents(new ArrayList<>());
    assertFalse(field.isRequiredInComponent(component1));

    // Test case 3: Component not in requiring components set
    List<ComponentInfo> requiringComponents = new ArrayList<>();
    requiringComponents.add(component1);
    requiringComponents.add(component2);
    field.setRequiringComponents(requiringComponents);
    assertFalse(field.isRequiredInComponent(component3));

    // Test case 4: Component in requiring components set
    assertTrue(field.isRequiredInComponent(component1));

    // Test case 5: Multiple components in requiring components set
    requiringComponents.add(component3);
    field.setRequiringComponents(requiringComponents);
    assertTrue(field.isRequiredInComponent(component1));
    assertTrue(field.isRequiredInComponent(component2));
    assertTrue(field.isRequiredInComponent(component3));

    // Test case 6: Null component parameter
    assertFalse(field.isRequiredInComponent(null));
}