// Here's an example implementation of the Element_5Test class:

class Element_5Test {

    @Test
    void testGetAttributeValue() {
        // Create a new Element with some attributes
        Element element = new Element();
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");

        // Test getting the values of the attributes
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));

        // Test getting the value of a non-existent attribute
        assertNull(element.getAttributeValue(-1));

        // Test getting the value of an attribute with an invalid index
        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeValue(3);
        });
    }
}