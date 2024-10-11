// Test case for XmlElement addSubElement method
class XmlElement_3Test {
    
    // Test case 1: Adding a sub element with valid name and data
    @Test
    void testAddSubElement_validNameAndData() {
        XmlElement parent = new XmlElement("parent");
        XmlElement subElement = parent.addSubElement("sub", "data");
        assertNotNull(subElement);
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
        assertEquals(parent, subElement.getParent());
        assertTrue(parent.getElements().contains(subElement));
    }
    
    // Test case 2: Adding a sub element with null name
    @Test
    void testAddSubElement_nullName() {
        XmlElement parent = new XmlElement("parent");
        XmlElement subElement = parent.addSubElement(null, "data");
        assertNull(subElement);
        assertTrue(parent.getElements().isEmpty());
    }
    
    // Test case 3: Adding a sub element with empty name
    @Test
    void testAddSubElement_emptyName() {
        XmlElement parent = new XmlElement("parent");
        XmlElement subElement = parent.addSubElement("", "data");
        assertNull(subElement);
        assertTrue(parent.getElements().isEmpty());
    }
    
    // Test case 4: Adding a sub element with null data
    @Test
    void testAddSubElement_nullData() {
        XmlElement parent = new XmlElement("parent");
        XmlElement subElement = parent.addSubElement("sub", null);
        assertNotNull(subElement);
        assertEquals("sub", subElement.getName());
        assertNull(subElement.getData());
        assertEquals(parent, subElement.getParent());
        assertTrue(parent.getElements().contains(subElement));
    }
    
    // Test case 5: Adding a sub element with empty data
    @Test
    void testAddSubElement_emptyData() {
        XmlElement parent = new XmlElement("parent");
        XmlElement subElement = parent.addSubElement("sub", "");
        assertNotNull(subElement);
        assertEquals("sub", subElement.getName());
        assertEquals("", subElement.getData());
        assertEquals(parent, subElement.getParent());
        assertTrue(parent.getElements().contains(subElement));
    }
    
    // Test case 6: Adding a sub element with invalid name (contains space)
    @Test
    void testAddSubElement_invalidName() {
        XmlElement parent = new XmlElement("parent");
        XmlElement subElement = parent.addSubElement("sub element", "data");
        assertNull(subElement);
        assertTrue(parent.getElements().isEmpty());
    }
    
    // Test case 7: Adding a sub element with existing name (case sensitive)
    @Test
    void testAddSubElement_existingName_caseSensitive() {
        XmlElement parent = new XmlElement("parent");
        parent.addSubElement("sub", "data1");
        XmlElement subElement = parent.addSubElement("sub", "data2");
        assertNull(subElement);
        assertEquals(1, parent.getElements().size());
        assertEquals("data1", parent.getElements().get(0).getData());
    }
    
    // Test case 8: Adding a sub element with existing name (case insensitive)
    @Test
    void testAddSubElement_existingName_caseInsensitive() {
        XmlElement parent = new XmlElement("parent");
        parent.addSubElement("sub", "data1");
        XmlElement subElement = parent.addSubElement("SUB", "data2");
        assertNull(subElement);
        assertEquals(1, parent.getElements().size());
        assertEquals("data1", parent.getElements().get(0).getData());
    }
    
    // Test case 9: Adding a sub element with invalid parent (null)
    @Test
    void testAddSubElement_invalidParent() {
        XmlElement subElement = new XmlElement("sub").addSubElement("subsub", "data");
        assertNull(subElement);
    }
    
    // Test case 10: Adding a sub element with invalid path (contains space)
    @Test
    void testAddSubElement_invalidPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement subElement = parent.addSubElement("sub.subsub", "data");
        assertNull(subElement);
        assertTrue(parent.getElements().isEmpty());
    }
}