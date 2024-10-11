@Test
void testGetAttributeValue() {
    Element element = new Element();
    AttributesImpl attributes = new AttributesImpl();
    attributes.addAttribute("", "attr1", "attr1", "CDATA", "value1");
    attributes.addAttribute("", "attr2", "attr2", "CDATA", "value2");
    attributes.addAttribute("", "attr3", "attr3", "CDATA", "value3");
    element.setAttributes(attributes);

    // Test getting attribute values by index
    assertEquals("value1", element.getAttributeValue(0));
    assertEquals("value2", element.getAttributeValue(1));
    assertEquals("value3", element.getAttributeValue(2));

    // Test getting attribute values by invalid index
    assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeValue(-1));
    assertThrows(IndexOutOfBoundsException.class, () -> element.getAttributeValue(3));
}
}