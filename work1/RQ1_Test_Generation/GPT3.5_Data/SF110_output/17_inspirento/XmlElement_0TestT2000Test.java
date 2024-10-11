```java
class XmlElement_0Test {
    
    @Test
    void testAddAttribute() {
        XmlElement xmlElement = new XmlElement();
        
        // Test adding attribute with non-null name and value
        Object oldValue = xmlElement.addAttribute("key1", "value1");
        assertNull(oldValue);
        assertEquals("value1", xmlElement.getAttribute("key1"));
        
        // Test adding attribute with null value
        oldValue = xmlElement.addAttribute("key2", null);
        assertNull(oldValue);
        assertNull(xmlElement.getAttribute("key2"));
        
        // Test adding attribute with null name
        oldValue = xmlElement.addAttribute(null, "value3");
        assertNull(oldValue);
        assertNull(xmlElement.getAttribute(null));
        
        // Test adding attribute with null name and value
        oldValue = xmlElement.addAttribute(null, null);
        assertNull(oldValue);
        assertNull(xmlElement.getAttribute(null));
    }
    
    // Add more test cases here
    
}
```
```