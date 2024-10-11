```java
    @Test
    void testLookupAttribute() {
        Element element = new Element("http://example.com", "testElement");
        
        // Add attributes to the element
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");
        element.addAttribute("http://example.com", "attr2", "CDATA", "value2");
        element.addAttribute("http://example.com", "attr3", "CDATA", "value3");
        
        // Test lookupAttribute method
        assertEquals(0, element.lookupAttribute("http://example.com", "attr1"));
        assertEquals(1, element.lookupAttribute("http://example.com", "attr2"));
        assertEquals(2, element.lookupAttribute("http://example.com", "attr3"));
        assertEquals(-1, element.lookupAttribute("http://example.com", "attr4"));
    }
```
