```java
class Element_2Test {

    @Test
    void testGetAttributeNamespaceURI() {
        Element element = new Element("http://example.com", "testElement");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");
        element.addAttribute("http://example.org", "attr2", "CDATA", "value2");

        assertEquals("http://example.com", element.getAttributeNamespaceURI(0));
        assertEquals("http://example.org", element.getAttributeNamespaceURI(1));
    }

    @Test
    void testGetAttributeNamespaceURIWithInvalidIndex() {
        Element element = new Element("http://example.com", "testElement");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeNamespaceURI(1);
        });
    }

    @Test
    void testGetAttributeNamespaceURIWithNegativeIndex() {
        Element element = new Element("http://example.com", "testElement");
        element.addAttribute("http://example.com", "attr1", "CDATA", "value1");

        assertNull(element.getAttributeNamespaceURI(-1));
    }
}
```
