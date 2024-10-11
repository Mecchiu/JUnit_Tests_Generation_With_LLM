// Here's an example implementation of the DictionaryInfo_2Test class with ten unit test cases for the getComponent(int) method:

class DictionaryInfo_2Test {

    @Test
    void testGetComponentWithValidId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo(1, "TestComponent");
        dictionary.addComponent(component);
        assertEquals(component, dictionary.getComponent(1));
    }

    @Test
    void testGetComponentWithInvalidId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo(1, "TestComponent");
        dictionary.addComponent(component);
        assertNull(dictionary.getComponent(2));
    }

    @Test
    void testGetComponentWithZeroId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo(0, "TestComponent");
        dictionary.addComponent(component);
        assertEquals(component, dictionary.getComponent(0));
    }

    @Test
    void testGetComponentWithNegativeId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo(-1, "TestComponent");
        dictionary.addComponent(component);
        assertNull(dictionary.getComponent(-1));
    }

    @Test
    void testGetComponentWithMultipleComponents() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo(1, "TestComponent1");
        ComponentInfo component2 = new ComponentInfo(2, "TestComponent2");
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        assertEquals(component1, dictionary.getComponent(1));
        assertEquals(component2, dictionary.getComponent(2));
    }

    @Test
    void testGetComponentWithNullComponent() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getComponent(1));
    }

    @Test
    void testGetComponentWithEmptyDictionary() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getComponent(1));
    }

    @Test
    void testGetComponentWithDuplicateIds() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo(1, "TestComponent1");
        ComponentInfo component2 = new ComponentInfo(1, "TestComponent2");
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        assertEquals(component1, dictionary.getComponent(1));
    }

    @Test
    void testGetComponentWithMixedIds() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component1 = new ComponentInfo(1, "TestComponent1");
        ComponentInfo component2 = new ComponentInfo(2, "TestComponent2");
        dictionary.addComponent(component1);
        dictionary.addComponent(component2);
        assertEquals(component1, dictionary.getComponent(1));
        assertEquals(component2, dictionary.getComponent(2));
        assertNull(dictionary.getComponent(3));
    }

    @Test
    void testGetComponentWithLargeId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        ComponentInfo component = new ComponentInfo(1000000, "TestComponent");
        dictionary.addComponent(component);
        assertEquals(component, dictionary.getComponent(1000000));
    }
}