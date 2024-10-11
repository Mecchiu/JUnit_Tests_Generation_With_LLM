// Here's an example implementation of the test cases for the Element class:

@Test
void testGetAttributeLocalName() {
    // Create a new Element with some attributes
    Element element = new Element();
    element.addAttribute("foo^bar", "value1");
    element.addAttribute("baz^qux", "value2");
    element.addAttribute("quux^corge", "value3");

    // Test getting the local name of each attribute
    assertEquals("foo", element.getAttributeLocalName(0));
    assertEquals("baz", element.getAttributeLocalName(1));
    assertEquals("quux", element.getAttributeLocalName(2));

    // Test getting the local name of an attribute that doesn't exist
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeLocalName(3);
    });

    // Test getting the local name of an attribute with no namespace prefix
    element.addAttribute("fred", "value4");
    assertEquals("fred", element.getAttributeLocalName(3));

    // Test getting the local name of an attribute with an empty namespace prefix
    element.addAttribute("^wilma", "value5");
    assertEquals("", element.getAttributeLocalName(4));
}