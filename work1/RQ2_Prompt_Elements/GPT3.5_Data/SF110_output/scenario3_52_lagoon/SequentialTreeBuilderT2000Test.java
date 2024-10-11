// Here's an example implementation of a test case for SequentialTreeBuilder:

@Test
void testParseXMLSequential() throws Exception {
    // Create a sample XML input
    String xml = "<root><child1>text1</child1><child2>text2</child2></root>";
    InputSource input = new InputSource(new StringReader(xml));

    // Create a mock ElementHandler to verify the output
    List<Element> elements = new ArrayList<>();
    ElementHandler handler = new ElementHandler() {
        public void startElement(Element element) {
            elements.add(element);
        }
        public void endElement(Element element) {}
    };

    // Parse the XML input using SequentialTreeBuilder
    Element root = SequentialTreeBuilder.parseXMLSequential(input, false, handler);

    // Verify the output
    assertEquals(2, elements.size());
    assertEquals("child1", elements.get(0).getName());
    assertEquals("text1", elements.get(0).getText());
    assertEquals("child2", elements.get(1).getName());
    assertEquals("text2", elements.get(1).getText());
    assertNull(root.getChildren());
}
