```java
    @Test
    void testNumberOfNamespaceMappingsEmpty() {
        Element element = new Element("", "test");
        assertEquals(0, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsOne() {
        Element element = new Element("", "test");
        element.addNamespaceMapping("prefix1", "http://example.com/ns1");
        assertEquals(1, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsMultiple() {
        Element element = new Element("", "test");
        element.addNamespaceMapping("prefix1", "http://example.com/ns1");
        element.addNamespaceMapping("prefix2", "http://example.com/ns2");
        element.addNamespaceMapping("prefix3", "http://example.com/ns3");
        assertEquals(3, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsWithParent() {
        Element parent = new Element("", "parent");
        parent.addNamespaceMapping("prefix1", "http://example.com/ns1");

        Element element = new Element("", "test");
        element.setParent(parent);

        assertEquals(1, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsInherited() {
        Element parent = new Element("", "parent");
        parent.addNamespaceMapping("prefix1", "http://example.com/ns1");

        Element element = new Element("", "test");
        element.setParent(parent);

        assertEquals(1, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsWithInheritedAndOwn() {
        Element parent = new Element("", "parent");
        parent.addNamespaceMapping("prefix1", "http://example.com/ns1");

        Element element = new Element("", "test");
        element.setParent(parent);
        element.addNamespaceMapping("prefix2", "http://example.com/ns2");

        assertEquals(2, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsWithDuplicateMappings() {
        Element element = new Element("", "test");
        element.addNamespaceMapping("prefix1", "http://example.com/ns1");
        element.addNamespaceMapping("prefix1", "http://example.com/ns1");

        assertEquals(2, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsWithNullPrefix() {
        Element element = new Element("", "test");
        element.addNamespaceMapping(null, "http://example.com/ns1");

        assertEquals(1, element.numberOfNamespaceMappings());
    }

    @Test
    void testNumberOfNamespaceMappingsWithNullURI() {
        Element element = new Element("", "test");
        element.addNamespaceMapping("prefix1", null);

        assertEquals(1, element.numberOfNamespaceMappings());
    }
```
```