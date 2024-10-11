// Test case 1: Test if getComponent returns null when the component name is not found
@Test
void testGetComponent_notFound() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component = dictionary.getComponent("UnknownComponent");
    assertNull(component);
}

// Test case 2: Test if getComponent returns the correct component when the component name is found
@Test
void testGetComponent_foundByName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    dictionary.addComponent(component);
    ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
    assertEquals(component, retrievedComponent);
}

// Test case 3: Test if getComponent returns the correct component when the component ID is found
@Test
void testGetComponent_foundById() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    dictionary.addComponent(component);
    ComponentInfo retrievedComponent = dictionary.getComponent(component.getId());
    assertEquals(component, retrievedComponent);
}

// Test case 4: Test if getComponent returns the correct component when there are multiple components with the same name
@Test
void testGetComponent_multipleComponentsWithSameName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component1 = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    ComponentInfo component2 = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    dictionary.addComponent(component1);
    dictionary.addComponent(component2);
    ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
    assertEquals(component1, retrievedComponent);
}

// Test case 5: Test if getComponent returns the correct component when there are multiple components with the same ID
@Test
void testGetComponent_multipleComponentsWithSameId() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component1 = new ComponentInfo("TestComponent1", "TestComponent1", "TestComponent1", new ArrayList<FieldInfo>());
    ComponentInfo component2 = new ComponentInfo("TestComponent2", "TestComponent2", "TestComponent2", new ArrayList<FieldInfo>());
    component2.setId(component1.getId());
    dictionary.addComponent(component1);
    dictionary.addComponent(component2);
    ComponentInfo retrievedComponent = dictionary.getComponent(component1.getId());
    assertEquals(component1, retrievedComponent);
}

// Test case 6: Test if getComponent returns the correct component when there are both components with the same name and ID
@Test
void testGetComponent_componentsWithSameNameAndId() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component1 = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    ComponentInfo component2 = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    component2.setId(component1.getId());
    dictionary.addComponent(component1);
    dictionary.addComponent(component2);
    ComponentInfo retrievedComponent = dictionary.getComponent(component1.getId());
    assertEquals(component1, retrievedComponent);
}

// Test case 7: Test if getComponent returns the correct component when there are components with the same name and different IDs
@Test
void testGetComponent_componentsWithSameNameDifferentIds() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component1 = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    ComponentInfo component2 = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    dictionary.addComponent(component1);
    dictionary.addComponent(component2);
    ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
    assertEquals(component1, retrievedComponent);
}

// Test case 8: Test if getComponent returns the correct component when there are components with the same ID and different names
@Test
void testGetComponent_componentsWithSameIdDifferentNames() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component1 = new ComponentInfo("TestComponent1", "TestComponent1", "TestComponent1", new ArrayList<FieldInfo>());
    ComponentInfo component2 = new ComponentInfo("TestComponent2", "TestComponent2", "TestComponent2", new ArrayList<FieldInfo>());
    component2.setId(component1.getId());
    dictionary.addComponent(component1);
    dictionary.addComponent(component2);
    ComponentInfo retrievedComponent = dictionary.getComponent(component1.getId());
    assertEquals(component1, retrievedComponent);
}

// Test case 9: Test if getComponent returns the correct component when there are no components in the dictionary
@Test
void testGetComponent_noComponents() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component = dictionary.getComponent("TestComponent");
    assertNull(component);
}

// Test case 10: Test if getComponent returns the correct component when the dictionary contains only one component
@Test
void testGetComponent_oneComponent() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
    ComponentInfo component = new ComponentInfo("TestComponent", "TestComponent", "TestComponent", new ArrayList<FieldInfo>());
    dictionary.addComponent(component);
    ComponentInfo retrievedComponent = dictionary.getComponent("TestComponent");
    assertEquals(component, retrievedComponent);
}