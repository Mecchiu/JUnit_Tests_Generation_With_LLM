// Here's an example of how you can write unit tests for the MapReader class:

@Test
void testGetXMLValue() {
    // Create a sample XML node
    Node node = createSampleNode();

    // Test case 1: Test if the method returns the correct value for a valid XML path
    String expectedValue = "Test Value";
    String actualValue = MapReader.getXMLValue(node, "/root/element");
    assertEquals(expectedValue, actualValue);

    // Test case 2: Test if the method returns an empty string for an invalid XML path
    expectedValue = "";
    actualValue = MapReader.getXMLValue(node, "/root/invalid");
    assertEquals(expectedValue, actualValue);

    // Test case 3: Test if the method returns an empty string for a null node
    expectedValue = "";
    actualValue = MapReader.getXMLValue(null, "/root/element");
    assertEquals(expectedValue, actualValue);

    // Test case 4: Test if the method returns an empty string for a null XML path
    expectedValue = "";
    actualValue = MapReader.getXMLValue(node, null);
    assertEquals(expectedValue, actualValue);

    // Test case 5: Test if the method returns an empty string for an empty XML path
    expectedValue = "";
    actualValue = MapReader.getXMLValue(node, "");
    assertEquals(expectedValue, actualValue);

    // Test case 6: Test if the method returns an empty string for a node without a value
    expectedValue = "";
    actualValue = MapReader.getXMLValue(node, "/root/empty");
    assertEquals(expectedValue, actualValue);

    // Test case 7: Test if the method returns an empty string for a node with an empty value
    expectedValue = "";
    actualValue = MapReader.getXMLValue(node, "/root/emptyValue");
    assertEquals(expectedValue, actualValue);

    // Test case 8: Test if the method returns the correct value for a node with multiple child nodes
    expectedValue = "Child Value 1";
    actualValue = MapReader.getXMLValue(node, "/root/multiple/child1");
    assertEquals(expectedValue, actualValue);

    // Test case 9: Test if the method returns the correct value for a node with multiple child nodes and an attribute
    expectedValue = "Child Value 2";
    actualValue = MapReader.getXMLValue(node, "/root/multiple/child2[@attr='test']");
    assertEquals(expectedValue, actualValue);

    // Test case 10: Test if the method returns an empty string for a node with multiple child nodes and an invalid attribute
    expectedValue = "";
    actualValue = MapReader.getXMLValue(node, "/root/multiple/child2[@invalid='test']");
    assertEquals(expectedValue, actualValue);
}

// Helper method to create a sample XML node for testing
private Node createSampleNode() {
    String xml = "<root>" +
            "<element>Test Value</element>" +
            "<empty></empty>" +
            "<emptyValue></emptyValue>" +
            "<multiple>" +
            "<child1>Child Value 1</child1>" +
            "<child2 attr='test'>Child Value 2</child2>" +
            "</multiple>" +
            "</root>";
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder;
    try {
        builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new InputSource(new StringReader(xml)));
        return doc.getFirstChild();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}