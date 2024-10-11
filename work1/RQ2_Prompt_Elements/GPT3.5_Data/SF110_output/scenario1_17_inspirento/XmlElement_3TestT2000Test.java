// Test case for XmlElement addSubElement method
class XmlElement_3Test {
    
    @Test
    void testAddSubElement() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child", "data");
        assertNotNull(child);
        assertEquals("child", child.getName());
        assertEquals("data", child.getData());
        assertEquals(parent, child.getParent());
        assertTrue(parent.getSubElements().contains(child));
    }
    
    @Test
    void testAddSubElementWithNullName() {
        XmlElement parent = new XmlElement("parent");
        assertThrows(IllegalArgumentException.class, () -> {
            parent.addSubElement(null, "data");
        });
    }
    
    @Test
    void testAddSubElementWithEmptyName() {
        XmlElement parent = new XmlElement("parent");
        assertThrows(IllegalArgumentException.class, () -> {
            parent.addSubElement("", "data");
        });
    }
    
    @Test
    void testAddSubElementWithNullData() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child", null);
        assertNotNull(child);
        assertEquals("child", child.getName());
        assertNull(child.getData());
        assertEquals(parent, child.getParent());
        assertTrue(parent.getSubElements().contains(child));
    }
    
    @Test
    void testAddSubElementWithEmptyData() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child", "");
        assertNotNull(child);
        assertEquals("child", child.getName());
        assertEquals("", child.getData());
        assertEquals(parent, child.getParent());
        assertTrue(parent.getSubElements().contains(child));
    }
    
    @Test
    void testAddSubElementWithExistingName() {
        XmlElement parent = new XmlElement("parent");
        parent.addSubElement("child", "data1");
        assertThrows(IllegalArgumentException.class, () -> {
            parent.addSubElement("child", "data2");
        });
    }
    
    @Test
    void testAddSubElementAndGetSubElements() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child1 = parent.addSubElement("child1", "data1");
        XmlElement child2 = parent.addSubElement("child2", "data2");
        List<XmlElement> subElements = parent.getSubElements();
        assertEquals(2, subElements.size());
        assertTrue(subElements.contains(child1));
        assertTrue(subElements.contains(child2));
    }
    
    @Test
    void testAddSubElementAndGetSubElementByName() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child1 = parent.addSubElement("child1", "data1");
        XmlElement child2 = parent.addSubElement("child2", "data2");
        assertEquals(child1, parent.getSubElement("child1"));
        assertEquals(child2, parent.getSubElement("child2"));
        assertNull(parent.getSubElement("child3"));
    }
    
    @Test
    void testAddSubElementAndGetSubElementByIndex() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child1 = parent.addSubElement("child1", "data1");
        XmlElement child2 = parent.addSubElement("child2", "data2");
        assertEquals(child1, parent.getSubElement(0));
        assertEquals(child2, parent.getSubElement(1));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            parent.getSubElement(2);
        });
    }
}