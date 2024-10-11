```java
    @Test
    void testGetAttributeType() {
        Element element = new Element("http://example.com", "testElement");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");
        element.addAttribute("http://example.com", "attr2", "ID", "value2");
        element.addAttribute("http://example.com", "attr3", "IDREF", "value3");
        element.addAttribute("http://example.com", "attr4", "IDREFS", "value4");
        element.addAttribute("http://example.com", "attr5", "NMTOKEN", "value5");
        element.addAttribute("http://example.com", "attr6", "NMTOKENS", "value6");
        element.addAttribute("http://example.com", "attr7", "ENTITY", "value7");
        element.addAttribute("http://example.com", "attr8", "ENTITIES", "value8");
        element.addAttribute("http://example.com", "attr9", "NOTATION", "value9");

        assertEquals("CDATA", element.getAttributeType(0));
        assertEquals("ID", element.getAttributeType(1));
        assertEquals("IDREF", element.getAttributeType(2));
        assertEquals("IDREFS", element.getAttributeType(3));
        assertEquals("NMTOKEN", element.getAttributeType(4));
        assertEquals("NMTOKENS", element.getAttributeType(5));
        assertEquals("ENTITY", element.getAttributeType(6));
        assertEquals("ENTITIES", element.getAttributeType(7));
        assertEquals("NOTATION", element.getAttributeType(8));
    }
```
