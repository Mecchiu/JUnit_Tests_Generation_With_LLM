package com.allenstudio.ir.util;
java
class XmlElement_11Test {

    @Test
    void testAddSubElement() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child", "data");

        assertEquals("child", child.getName());
        assertEquals("data", child.getData());
        assertEquals(parent, child.getParent());
        List<XmlElement> subElements = parent.getElements();
        assertTrue(subElements.contains(child));
    }

    @Test
    void testAddSubElement_EmptyPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("", "data");

        assertEquals("", child.getName());
        assertEquals("data", child.getData());
        assertEquals(parent, child.getParent());
        List<XmlElement> subElements = parent.getElements();
        assertTrue(subElements.contains(child));
    }

    @Test
    void testAddSubElement_MultipleLevels() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("level1.level2.level3", "data");

        assertEquals("level1", parent.getElement("level1").getName());
        assertEquals("level2", parent.getElement("level1.level2").getName());
        assertEquals("level3", parent.getElement("level1.level2.level3").getName());
        assertEquals("data", parent.getElement("level1.level2.level3").getData());
    }

    @Test
    void testAddSubElement_SamePath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child1 = parent.addSubElement("samepath", "data1");
        XmlElement child2 = parent.addSubElement("samepath", "data2");

        assertEquals("samepath", child1.getName());
        assertEquals("data1", child1.getData());
        assertEquals("samepath", child2.getName());
        assertEquals("data2", child2.getData());
        List<XmlElement> subElements = parent.getElements();
        assertTrue(subElements.contains(child1));
        assertTrue(subElements.contains(child2));
    }

    @Test
    void testAddSubElement_NullPath() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement(null, "data");

        assertEquals(null, child.getName());
        assertEquals("data", child.getData());
        assertEquals(parent, child.getParent());
        List<XmlElement> subElements = parent.getElements();
        assertTrue(subElements.contains(child));
    }

    @Test
    void testAddSubElement_NullData() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child", null);

        assertEquals("child", child.getName());
        assertEquals(null, child.getData());
        assertEquals(parent, child.getParent());
        List<XmlElement> subElements = parent.getElements();
        assertTrue(subElements.contains(child));
    }

    @Test
    void testAddSubElement_EmptyData() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("child", "");

        assertEquals("child", child.getName());
        assertEquals("", child.getData());
        assertEquals(parent, child.getParent());
        List<XmlElement> subElements = parent.getElements();
        assertTrue(subElements.contains(child));
    }

    @Test
    void testAddSubElement_PathWithSlash() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("/level1/level2/level3", "data");

        assertEquals("level1", parent.getElement("level1").getName());
        assertEquals("level2", parent.getElement("level1.level2").getName());
        assertEquals("level3", parent.getElement("level1.level2.level3").getName());
        assertEquals("data", parent.getElement("level1.level2.level3").getData());
    }

    @Test
    void testAddSubElement_PathWithLeadingDot() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement(".level1.level2.level3", "data");

        assertEquals("level1", parent.getElement("level1").getName());
        assertEquals("level2", parent.getElement("level1.level2").getName());
        assertEquals("level3", parent.getElement("level1.level2.level3").getName());
        assertEquals("data", parent.getElement("level1.level2.level3").getData());
    }

    @Test
    void testAddSubElement_PathWithTrailingDot() {
        XmlElement parent = new XmlElement("parent");
        XmlElement child = parent.addSubElement("level1.level2.level3.", "data");

        assertEquals("level1", parent.getElement("level1").getName());
        assertEquals("level2", parent.getElement("level1.level2").getName());
        assertEquals("level3", parent.getElement("level1.level2.level3").getName());
        assertEquals("data", parent.getElement("level1.level2.level3").getData());
    }
}
