```java
class XmlElement_9Test {

    @Test
    void testAddSubElement() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = root.addSubElement("child1");
        assertEquals("child1", child1.getName());
        assertEquals(root, child1.getParent());
    }

    @Test
    void testAddSubElementWithMultipleLevels() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = root.addSubElement("child1");
        XmlElement child2 = root.addSubElement("child1.child2");
        assertEquals("child2", child2.getName());
        assertEquals(child1, child2.getParent());
    }

    @Test
    void testAddSubElementWithEmptyPath() {
        XmlElement root = new XmlElement("root");
        XmlElement child = root.addSubElement("");
        assertEquals("", child.getName());
        assertEquals(root, child.getParent());
    }

    @Test
    void testAddSubElementWithSlashInPath() {
        XmlElement root = new XmlElement("root");
        XmlElement child = root.addSubElement(".child");
        assertEquals("child", child.getName());
        assertEquals(root, child.getParent());
    }

    @Test
    void testAddSubElementWithExistingPath() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = root.addSubElement("child1");
        XmlElement child2 = root.addSubElement("child1");
        assertEquals("child1", child2.getName());
        assertEquals(root, child2.getParent());
    }

    @Test
    void testAddSubElementWithAttributes() {
        XmlElement root = new XmlElement("root");
        XmlElement child = root.addSubElement("child");
        child.addAttribute("key", "value");
        assertEquals("value", child.getAttribute("key"));
    }

    @Test
    void testAddSubElementWithData() {
        XmlElement root = new XmlElement("root");
        XmlElement child = root.addSubElement("child");
        child.setData("data");
        assertEquals("data", child.getData());
    }

    @Test
    void testAddSubElementWithMultipleLevelsAndData() {
        XmlElement root = new XmlElement("root");
        XmlElement child = root.addSubElement("child1.child2");
        child.setData("data");
        assertEquals("data", child.getData());
    }

    @Test
    void testAddSubElementWithMultipleLevelsAndAttributes() {
        XmlElement root = new XmlElement("root");
        XmlElement child = root.addSubElement("child1.child2");
        child.addAttribute("key", "value");
        assertEquals("value", child.getAttribute("key"));
    }

    @Test
    void testAddSubElementWithEmptyPathAndData() {
        XmlElement root = new XmlElement("root");
        XmlElement child = root.addSubElement(".child");
        child.setData("data");
        assertEquals("data", child.getData());
    }
}
```
```