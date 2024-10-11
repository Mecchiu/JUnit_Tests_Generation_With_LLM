```java
    @Test
    void testGetAttributeValue() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");
        element.addAttribute("http://example.com", "attr2", "CDATA", "value2");

        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
    }

    @Test
    void testGetAttributeValueWithInvalidIndex() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeValue(1);
        });
    }

    @Test
    void testGetAttributeValueWithNegativeIndex() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeValue(-1);
        });
    }

    @Test
    void testGetAttributeValueWithNoAttributes() {
        Element element = new Element("http://example.com", "test");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeValue(0);
        });
    }

    @Test
    void testGetAttributeValueWithEmptyValue() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "CDATA", "");

        assertEquals("", element.getAttributeValue(0));
    }

    @Test
    void testGetAttributeValueWithNullValue() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "CDATA", null);

        assertNull(element.getAttributeValue(0));
    }

    @Test
    void testGetAttributeValueWithMultipleAttributes() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");
        element.addAttribute("http://example.com", "attr2", "CDATA", "value2");

        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
    }

    @Test
    void testGetAttributeValueWithDifferentTypes() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "ID", "value1");
        element.addAttribute("http://example.com", "attr2", "IDREF", "value2");

        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
    }

    @Test
    void testGetAttributeValueWithSpecialCharacters() {
        Element element = new Element("http://example.com", "test");
        element.addAttribute("http://example.com", "attr1", "CDATA", "<>&\"'");

        assertEquals("<>&\"'", element.getAttributeValue(0));
    }
```
