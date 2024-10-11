// Test case for adding sub elements to an XmlElement
class XmlElement_2Test {
    
    // Test case for adding a sub element to an empty XmlElement
    @Test
    void testAddSubElementToEmptyElement() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement("child");
        assertNotNull(subElement);
        assertEquals("child", subElement.getName());
        assertEquals(1, element.getElements().size());
        assertTrue(element.getElements().contains(subElement));
    }
    
    // Test case for adding a sub element to an existing element
    @Test
    void testAddSubElementToExistingElement() {
        XmlElement element = new XmlElement("root");
        XmlElement child1 = element.addSubElement("child1");
        XmlElement child2 = element.addSubElement("child2");
        XmlElement subElement = child1.addSubElement("grandchild");
        assertNotNull(subElement);
        assertEquals("grandchild", subElement.getName());
        assertEquals(2, element.getElements().size());
        assertTrue(element.getElements().contains(child1));
        assertTrue(element.getElements().contains(child2));
        assertEquals(1, child1.getElements().size());
        assertTrue(child1.getElements().contains(subElement));
    }
    
    // Test case for adding a sub element with a path starting with "/"
    @Test
    void testAddSubElementWithStartingSlash() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement("/child");
        assertNotNull(subElement);
        assertEquals("child", subElement.getName());
        assertEquals(1, element.getElements().size());
        assertTrue(element.getElements().contains(subElement));
    }
    
    // Test case for adding a sub element with a path containing multiple levels
    @Test
    void testAddSubElementWithMultipleLevels() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement("child1.grandchild1");
        assertNotNull(subElement);
        assertEquals("grandchild1", subElement.getName());
        assertEquals(1, element.getElements().size());
        assertTrue(element.getElements().contains(subElement.getParent()));
        assertEquals(1, subElement.getParent().getElements().size());
        assertTrue(subElement.getParent().getElements().contains(subElement));
    }
    
    // Test case for adding a sub element with a path containing multiple levels and existing elements
    @Test
    void testAddSubElementWithMultipleLevelsAndExistingElements() {
        XmlElement element = new XmlElement("root");
        XmlElement child1 = element.addSubElement("child1");
        XmlElement child2 = element.addSubElement("child2");
        XmlElement subElement = element.addSubElement("child1.grandchild1");
        assertNotNull(subElement);
        assertEquals("grandchild1", subElement.getName());
        assertEquals(2, element.getElements().size());
        assertTrue(element.getElements().contains(child1));
        assertTrue(element.getElements().contains(child2));
        assertEquals(1, child1.getElements().size());
        assertTrue(child1.getElements().contains(subElement));
    }
    
    // Test case for adding a sub element with an empty path
    @Test
    void testAddSubElementWithEmptyPath() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement("");
        assertNull(subElement);
        assertEquals(0, element.getElements().size());
    }
    
    // Test case for adding a sub element with a path containing only dots
    @Test
    void testAddSubElementWithOnlyDots() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement("...");
        assertNull(subElement);
        assertEquals(0, element.getElements().size());
    }
    
    // Test case for adding a sub element with a path containing only spaces
    @Test
    void testAddSubElementWithOnlySpaces() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement("   ");
        assertNull(subElement);
        assertEquals(0, element.getElements().size());
    }
    
    // Test case for adding a sub element with a path containing only dots and spaces
    @Test
    void testAddSubElementWithDotsAndSpaces() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement(" . . . ");
        assertNull(subElement);
        assertEquals(0, element.getElements().size());
    }
    
    // Test case for adding a sub element with a path containing only dots and slashes
    @Test
    void testAddSubElementWithDotsAndSlashes() {
        XmlElement element = new XmlElement("root");
        XmlElement subElement = element.addSubElement("../child");
        assertNotNull(subElement);
        assertEquals("child", subElement.getName());
        assertEquals(1, element.getElements().size());
        assertTrue(element.getElements().contains(subElement));
    }
}