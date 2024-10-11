// Test case for XmlElement#addAttribute(String, String)
class XmlElement_0Test {
    
    // Test case 1: Adding a new attribute to an empty XmlElement
    @Test
    void testAddAttributeToEmptyElement() {
        XmlElement element = new XmlElement();
        String attributeName = "color";
        String attributeValue = "red";
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertEquals(attributeValue, element.getAttribute(attributeName));
    }
    
    // Test case 2: Adding a new attribute to an XmlElement with existing attributes
    @Test
    void testAddAttributeToElementWithExistingAttributes() {
        XmlElement element = new XmlElement();
        String attributeName1 = "color";
        String attributeValue1 = "red";
        String attributeName2 = "size";
        String attributeValue2 = "large";
        element.addAttribute(attributeName1, attributeValue1);
        assertNull(element.addAttribute(attributeName2, attributeValue2));
        assertEquals(attributeValue2, element.getAttribute(attributeName2));
    }
    
    // Test case 3: Adding a new attribute with an existing name to an XmlElement with existing attributes
    @Test
    void testAddAttributeWithExistingName() {
        XmlElement element = new XmlElement();
        String attributeName = "color";
        String attributeValue1 = "red";
        String attributeValue2 = "blue";
        element.addAttribute(attributeName, attributeValue1);
        assertEquals(attributeValue1, element.addAttribute(attributeName, attributeValue2));
        assertEquals(attributeValue2, element.getAttribute(attributeName));
    }
    
    // Test case 4: Adding a new attribute with a null name to an XmlElement
    @Test
    void testAddAttributeWithNullName() {
        XmlElement element = new XmlElement();
        String attributeName = null;
        String attributeValue = "red";
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertNull(element.getAttribute(attributeName));
    }
    
    // Test case 5: Adding a new attribute with a null value to an XmlElement
    @Test
    void testAddAttributeWithNullValue() {
        XmlElement element = new XmlElement();
        String attributeName = "color";
        String attributeValue = null;
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertNull(element.getAttribute(attributeName));
    }
    
    // Test case 6: Adding a new attribute with an empty name to an XmlElement
    @Test
    void testAddAttributeWithEmptyName() {
        XmlElement element = new XmlElement();
        String attributeName = "";
        String attributeValue = "red";
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertNull(element.getAttribute(attributeName));
    }
    
    // Test case 7: Adding a new attribute with an empty value to an XmlElement
    @Test
    void testAddAttributeWithEmptyValue() {
        XmlElement element = new XmlElement();
        String attributeName = "color";
        String attributeValue = "";
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertEquals("", element.getAttribute(attributeName));
    }
    
    // Test case 8: Adding a new attribute with a name containing spaces to an XmlElement
    @Test
    void testAddAttributeWithNameContainingSpaces() {
        XmlElement element = new XmlElement();
        String attributeName = "background color";
        String attributeValue = "white";
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertEquals(attributeValue, element.getAttribute(attributeName));
    }
    
    // Test case 9: Adding a new attribute with a value containing spaces to an XmlElement
    @Test
    void testAddAttributeWithValueContainingSpaces() {
        XmlElement element = new XmlElement();
        String attributeName = "color";
        String attributeValue = "light blue";
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertEquals(attributeValue, element.getAttribute(attributeName));
    }
    
    // Test case 10: Adding a new attribute with a name and value containing special characters to an XmlElement
    @Test
    void testAddAttributeWithNameAndValueContainingSpecialCharacters() {
        XmlElement element = new XmlElement();
        String attributeName = "color&size";
        String attributeValue = "<red>large</red>";
        assertNull(element.addAttribute(attributeName, attributeValue));
        assertEquals(attributeValue, element.getAttribute(attributeName));
    }
}