// Here's an example of how you can write a unit test case for the TreeBuilder class:

@Test
void testParseXML() throws Exception {
    // Create an input source from a string containing XML data
    String xmlData = "<root><child>text</child></root>";
    InputSource inputSource = new InputSource(new StringReader(xmlData));

    // Parse the XML data using the TreeBuilder class
    Element rootElement = TreeBuilder.parseXML(inputSource, false);

    // Verify that the root element has the correct name and child element
    assertEquals("root", rootElement.getName());
    assertEquals(1, rootElement.getChildCount());
    Element childElement = rootElement.getChild(0);
    assertEquals("child", childElement.getName());
    assertEquals("text", childElement.getTextContent());
}