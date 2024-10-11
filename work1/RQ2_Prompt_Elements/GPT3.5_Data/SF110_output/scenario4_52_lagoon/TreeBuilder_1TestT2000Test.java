// Test case 1: Test parsing of a simple XML document with no attributes
@Test
public void testParseSimpleXML() throws Exception {
    String xml = "<root><child>text</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    Element root = TreeBuilder.parseXML(input, false);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("text", child.getText());
}

// Test case 2: Test parsing of an XML document with attributes
@Test
public void testParseXMLWithAttributes() throws Exception {
    String xml = "<root attr1=\"value1\" attr2=\"value2\"><child>text</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    Element root = TreeBuilder.parseXML(input, false);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals("value1", root.getAttribute("attr1"));
    assertEquals("value2", root.getAttribute("attr2"));
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("text", child.getText());
}

// Test case 3: Test parsing of an XML document with namespaces
@Test
public void testParseXMLWithNamespaces() throws Exception {
    String xml = "<root xmlns:ns1=\"http://example.com/ns1\"><ns1:child>text</ns1:child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    Element root = TreeBuilder.parseXML(input, false);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("ns1:child", child.getName());
    assertEquals("http://example.com/ns1", child.getNamespaceURI());
    assertEquals("text", child.getText());
}

// Test case 4: Test parsing of an XML document with CDATA section
@Test
public void testParseXMLWithCDATA() throws Exception {
    String xml = "<root><![CDATA[<child>text</child>]]></root>";
    InputSource input = new InputSource(new StringReader(xml));
    Element root = TreeBuilder.parseXML(input, false);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals("<child>text</child>", root.getText());
}

// Test case 5: Test parsing of an XML document with comments
@Test
public void testParseXMLWithComments() throws Exception {
    String xml = "<root><!-- comment --><child>text</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    Element root = TreeBuilder.parseXML(input, false);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(2, root.getChildCount());
    Comment comment = root.getComment(0);
    assertNotNull(comment);
    assertEquals(" comment ", comment.getText());
    Element child = root.getElement(1);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("text", child.getText());
}

// Test case 6: Test parsing of an XML document with a DOCTYPE declaration
@Test
public void testParseXMLWithDOCTYPE() throws Exception {
    String xml = "<!DOCTYPE root SYSTEM \"root.dtd\"><root><child>text</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    Element root = TreeBuilder.parseXML(input, false);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("text", child.getText());
}

// Test case 7: Test parsing of an XML document with an external entity
@Test
public void testParseXMLWithExternalEntity() throws Exception {
    String xml = "<!DOCTYPE root [<!ENTITY foo SYSTEM \"foo.txt\">]><root><child>&foo;</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    EntityResolver resolver = new EntityResolver() {
        public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
            if ("foo.txt".equals(systemId)) {
                return new InputSource(new StringReader("bar"));
            }
            return null;
        }
    };
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    factory.setValidating(false);
    SAXParser parser = factory.newSAXParser();
    XMLReader reader = parser.getXMLReader();
    reader.setEntityResolver(resolver);
    Element root = new TreeBuilder().parseXML(input, reader);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("bar", child.getText());
}

// Test case 8: Test parsing of an XML document with an internal entity
@Test
public void testParseXMLWithInternalEntity() throws Exception {
    String xml = "<root><child>&foo;</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    EntityResolver resolver = new EntityResolver() {
        public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
            if ("foo".equals(publicId)) {
                return new InputSource(new StringReader("bar"));
            }
            return null;
        }
    };
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    factory.setValidating(false);
    SAXParser parser = factory.newSAXParser();
    XMLReader reader = parser.getXMLReader();
    reader.setEntityResolver(resolver);
    Element root = new TreeBuilder().parseXML(input, reader);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("bar", child.getText());
}

// Test case 9: Test parsing of an XML document with an external DTD
@Test
public void testParseXMLWithExternalDTD() throws Exception {
    String xml = "<!DOCTYPE root SYSTEM \"root.dtd\"><root><child>text</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    EntityResolver resolver = new EntityResolver() {
        public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
            if ("root.dtd".equals(systemId)) {
                return new InputSource(new StringReader("<!ELEMENT root (child)>\n<!ELEMENT child (#PCDATA)>"));
            }
            return null;
        }
    };
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    factory.setValidating(true);
    SAXParser parser = factory.newSAXParser();
    XMLReader reader = parser.getXMLReader();
    reader.setEntityResolver(resolver);
    Element root = new TreeBuilder().parseXML(input, reader);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("text", child.getText());
}

// Test case 10: Test parsing of an XML document with an internal DTD
@Test
public void testParseXMLWithInternalDTD() throws Exception {
    String xml = "<!DOCTYPE root [\n<!ELEMENT root (child)>\n<!ELEMENT child (#PCDATA)>\n]><root><child>text</child></root>";
    InputSource input = new InputSource(new StringReader(xml));
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    factory.setValidating(true);
    SAXParser parser = factory.newSAXParser();
    XMLReader reader = parser.getXMLReader();
    Element root = new TreeBuilder().parseXML(input, reader);
    assertNotNull(root);
    assertEquals("root", root.getName());
    assertEquals(1, root.getChildCount());
    Element child = root.getElement(0);
    assertNotNull(child);
    assertEquals("child", child.getName());
    assertEquals("text", child.getText());
}
}