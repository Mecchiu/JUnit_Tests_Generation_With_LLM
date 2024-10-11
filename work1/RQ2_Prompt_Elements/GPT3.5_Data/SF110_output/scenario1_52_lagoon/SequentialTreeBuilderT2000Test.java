// Here's an example of how you can write a test case for the SequentialTreeBuilder class:

@Test
void testParseXMLSequential() throws Exception {
    // Create an input source from a string containing XML
    String xml = "<root><child>text</child></root>";
    InputSource input = new InputSource(new StringReader(xml));

    // Create a handler to receive the parsed elements
    ElementHandler handler = new ElementHandler() {
        public void onElement(Element element) {
            // Do something with the element
        }
    };

    // Parse the XML and get the root element
    Element root = SequentialTreeBuilder.parseXMLSequential(input, false, handler);

    // Verify that the root element has the expected name and child element
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getChild(0);
    assertEquals("child", child.getName());
    assertEquals("text", child.getText());
}
