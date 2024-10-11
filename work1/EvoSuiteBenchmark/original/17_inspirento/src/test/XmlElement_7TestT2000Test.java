```java
    @Test
    void testGetElement() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child1");
        XmlElement child2 = new XmlElement("child2");
        XmlElement subChild1 = new XmlElement("subChild1");
        XmlElement subChild2 = new XmlElement("subChild2");

        root.addElement(child1);
        root.addElement(child2);
        child1.addElement(subChild1);
        child2.addElement(subChild2);

        assertEquals(child1, root.getElement("child1"));
        assertEquals(subChild1, root.getElement("child1.subChild1"));
        assertEquals(child2, root.getElement("child2"));
        assertEquals(subChild2, root.getElement("child2.subChild2"));
        assertNull(root.getElement("child3"));
    }

    @Test
    void testGetElement_EmptyPath() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child1");

        root.addElement(child1);

        assertEquals(child1, root.getElement(""));
    }

    @Test
    void testGetElement_InvalidPath() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child1");

        root.addElement(child1);

        assertNull(root.getElement(".child1"));
        assertNull(root.getElement("child1."));
        assertNull(root.getElement("child1..subChild1"));
    }

    @Test
    void testGetElement_MultipleElementsWithSameName() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child");
        XmlElement child2 = new XmlElement("child");
        XmlElement subChild1 = new XmlElement("subChild1");
        XmlElement subChild2 = new XmlElement("subChild2");

        root.addElement(child1);
        root.addElement(child2);
        child1.addElement(subChild1);
        child2.addElement(subChild2);

        assertEquals(child1, root.getElement("child"));
        assertEquals(subChild1, root.getElement("child.subChild1"));
    }

    @Test
    void testGetElement_NullPath() {
        XmlElement root = new XmlElement("root");

        assertNull(root.getElement(null));
    }

    @Test
    void testGetElement_PathWithLeadingDot() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child1");
        XmlElement subChild1 = new XmlElement("subChild1");

        root.addElement(child1);
        child1.addElement(subChild1);

        assertEquals(child1, root.getElement(".child1"));
        assertEquals(subChild1, root.getElement(".child1.subChild1"));
    }

    @Test
    void testGetElement_PathWithLeadingDotOnly() {
        XmlElement root = new XmlElement("root");

        assertEquals(root, root.getElement("."));
    }

    @Test
    void testGetElement_PathWithLeadingDotAndSubsequentDots() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child1");
        XmlElement subChild1 = new XmlElement("subChild1");

        root.addElement(child1);
        child1.addElement(subChild1);

        assertEquals(subChild1, root.getElement(".child1.subChild1"));
    }

    @Test
    void testGetElement_PathWithLeadingDotAndInvalidSubsequentDots() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child1");
        XmlElement subChild1 = new XmlElement("subChild1");

        root.addElement(child1);
        child1.addElement(subChild1);

        assertNull(root.getElement(".child1..subChild1"));
    }
```
