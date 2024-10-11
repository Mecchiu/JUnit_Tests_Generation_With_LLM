package nu.staldal.xtree;
java
public class Element_1Test {

    @Test
    void testNumberOfAttributesEmptyElement() {
        Element element = new Element("", "test");
        assertEquals(0, element.numberOfAttributes());
    }

    @Test
    void testNumberOfAttributesWithAttributes() {
        Element element = new Element("", "test", 2);
        element.addAttribute("", "attr1", "CDATA", "value1");
        element.addAttribute("", "attr2", "CDATA", "value2");
        assertEquals(2, element.numberOfAttributes());
    }

    @Test
    void testNumberOfAttributesWithNoAttributesSpecified() {
        Element element = new Element("", "test");
        element.addAttribute("", "attr1", "CDATA", "value1");
        assertEquals(1, element.numberOfAttributes());
    }

    @Test
    void testNumberOfAttributesWithNegativeNumberOfAttributes() {
        Element element = new Element("", "test", -1);
        element.addAttribute("", "attr1", "CDATA", "value1");
        assertEquals(1, element.numberOfAttributes());
    }

    @Test
    void testNumberOfAttributesWithNoAttributes() {
        Element element = new Element("", "test");
        assertEquals(0, element.numberOfAttributes());
    }

    @Test
    void testNumberOfAttributesWithMultipleAttributes() {
        Element element = new Element("", "test", 3);
        element.addAttribute("", "attr1", "CDATA", "value1");
        element.addAttribute("", "attr2", "CDATA", "value2");
        element.addAttribute("", "attr3", "CDATA", "value3");
        assertEquals(3, element.numberOfAttributes());
    }

    @Test
    void testNumberOfAttributesWithNullNamespaceURI() {
        Element element = new Element(null, "test");
        assertEquals(0, element.numberOfAttributes());
    }

    @Test
    void testNumberOfAttributesWithNullLocalName() {
        assertThrows(NullPointerException.class, () -> new Element("", null));
    }

    @Test
    void testNumberOfAttributesWithNullNamespaceURIAndLocalName() {
        assertThrows(NullPointerException.class, () -> new Element(null, null));
    }
}
