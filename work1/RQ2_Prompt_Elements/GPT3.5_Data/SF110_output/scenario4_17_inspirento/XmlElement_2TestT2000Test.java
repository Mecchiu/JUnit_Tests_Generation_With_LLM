// Test case for XmlElement addSubElement method
class XmlElement_2Test {
    
    // Test case 1: Adding a sub element with a valid path
    @Test
    void testAddSubElement_validPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child");
        assertNotNull(child);
        assertEquals("child", child.getName());
        assertEquals(parent, child.getParent());
    }
    
    // Test case 2: Adding a sub element with an invalid path
    @Test
    void testAddSubElement_invalidPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child.invalid");
        assertNull(child);
        assertEquals(0, parent.getElements().size());
    }
    
    // Test case 3: Adding a sub element with an empty path
    @Test
    void testAddSubElement_emptyPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("");
        assertNull(child);
        assertEquals(0, parent.getElements().size());
    }
    
    // Test case 4: Adding a sub element with a null path
    @Test
    void testAddSubElement_nullPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement(null);
        assertNull(child);
        assertEquals(0, parent.getElements().size());
    }
    
    // Test case 5: Adding a sub element with a path that already exists
    @Test
    void testAddSubElement_existingPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child1 = parent.addSubElement("child");
        XmlElement child2 = parent.addSubElement("child");
        assertNull(child2);
        assertEquals(1, parent.getElements().size());
        assertEquals(child1, parent.getElements().get(0));
    }
    
    // Test case 6: Adding a sub element with a path that partially exists
    @Test
    void testAddSubElement_partialPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child1 = parent.addSubElement("child1");
        XmlElement child2 = parent.addSubElement("child1.child2");
        assertNotNull(child1);
        assertNotNull(child2);
        assertEquals(1, parent.getElements().size());
        assertEquals(child1, parent.getElements().get(0));
        assertEquals(child2, child1.getElements().get(0));
    }
    
    // Test case 7: Adding a sub element with a path that contains spaces
    @Test
    void testAddSubElement_pathWithSpaces() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child with spaces");
        assertNotNull(child);
        assertEquals("child with spaces", child.getName());
        assertEquals(parent, child.getParent());
    }
    
    // Test case 8: Adding a sub element with a path that contains special characters
    @Test
    void testAddSubElement_pathWithSpecialCharacters() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child<>&'\"");
        assertNotNull(child);
        assertEquals("child<>&'\"", child.getName());
        assertEquals(parent, child.getParent());
    }
    
    // Test case 9: Adding a sub element with a path that contains non-ASCII characters
    @Test
    void testAddSubElement_pathWithNonASCIICharacters() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child_äöüß");
        assertNotNull(child);
        assertEquals("child_äöüß", child.getName());
        assertEquals(parent, child.getParent());
    }
    
    // Test case 10: Adding a sub element to a null parent
    @Test
    void testAddSubElement_nullParent() {
        XmlElement parent = null;
        XmlElement child = new XmlElement("child");
        assertNull(child.getParent());
        assertFalse(child.addElement(new XmlElement("grandchild")));
    }
}