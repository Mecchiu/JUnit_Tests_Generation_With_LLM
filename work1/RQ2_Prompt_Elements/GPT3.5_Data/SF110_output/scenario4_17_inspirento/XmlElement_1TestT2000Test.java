// Test case for XmlElement#getElement(String)
class XmlElement_1Test {

    @Test
    void testGetElement_NullPath() {
        XmlElement element = new XmlElement("test");
        assertNull(element.getElement(null));
    }

    @Test
    void testGetElement_EmptyPath() {
        XmlElement element = new XmlElement("test");
        assertNull(element.getElement(""));
    }

    @Test
    void testGetElement_RootElement() {
        XmlElement element = new XmlElement("test");
        assertEquals(element, element.getElement("test"));
    }

    @Test
    void testGetElement_NonExistentPath() {
        XmlElement element = new XmlElement("test");
        assertNull(element.getElement("nonexistent"));
    }

    @Test
    void testGetElement_SingleLevelPath() {
        XmlElement element = new XmlElement("test");
        XmlElement subElement = new XmlElement("sub");
        element.addSubElement(subElement);
        assertEquals(subElement, element.getElement("sub"));
    }

    @Test
    void testGetElement_MultiLevelPath() {
        XmlElement element = new XmlElement("test");
        XmlElement subElement1 = new XmlElement("sub1");
        XmlElement subElement2 = new XmlElement("sub2");
        XmlElement subElement3 = new XmlElement("sub3");
        element.addSubElement(subElement1);
        subElement1.addSubElement(subElement2);
        subElement2.addSubElement(subElement3);
        assertEquals(subElement3, element.getElement("sub1.sub2.sub3"));
    }

    @Test
    void testGetElement_MultiLevelPathWithNonExistentElement() {
        XmlElement element = new XmlElement("test");
        XmlElement subElement1 = new XmlElement("sub1");
        XmlElement subElement2 = new XmlElement("sub2");
        element.addSubElement(subElement1);
        subElement1.addSubElement(subElement2);
        assertNull(element.getElement("sub1.nonexistent.sub2"));
    }

    @Test
    void testGetElement_MultiLevelPathWithDuplicateElementNames() {
        XmlElement element = new XmlElement("test");
        XmlElement subElement1 = new XmlElement("sub");
        XmlElement subElement2 = new XmlElement("sub");
        element.addSubElement(subElement1);
        element.addSubElement(subElement2);
        assertEquals(subElement1, element.getElement("sub"));
    }

    @Test
    void testGetElement_MultiLevelPathWithDuplicateElementNamesAndDifferentPaths() {
        XmlElement element = new XmlElement("test");
        XmlElement subElement1 = new XmlElement("sub");
        XmlElement subElement2 = new XmlElement("sub");
        XmlElement subElement3 = new XmlElement("sub");
        element.addSubElement(subElement1);
        element.addSubElement(subElement2);
        subElement2.addSubElement(subElement3);
        assertEquals(subElement1, element.getElement("sub"));
    }
}