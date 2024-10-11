// IFXDocumentHandler_0Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains one unit test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {
		private IFXDocumentHandler docHandler = new IFXDocumentHandler();
		private Document root;
    /**
     * @return all namespaces for the current namespace, null for none.
     */
    private Map getNamespaces(Document doc) {

      final Namespace namespace_n = new Namespace("", "http://www.w3.org/1999/xhtml");
      return doc.getRootElement().getOwnNamespaces();
     }


  /**
   * Test case for the method {@link #build(IFXObject, boolean, Map)}
   * which will set all the namespaces to "http://www.w3.org/2000/XMLSchema"
   * which is not supported by the parser in order to get validation of
   * an XML schema document.
   * @throws IOException if an error occurred while reading/parsing the
   * input/output stream.
   * @throws IFXDocumentException if the build() method determines that the
   * XML is not valid or has an invalid schema definition.
   */
  @Test
  public void testBuild() throws IOException, IFXDocumentException {
    root = docHandler.build(null, false, null);

    assertNotNull(root);
    DocumentBuilder builder = new SAXBuilder();
    Element rootNode = root.getRootElement();
    assertNotNull(rootNode);
    assertEquals(Namespace.XML_SCHEMA_INSTANCE_NS_URI,
         rootNode.getNamespaceURI(), "");
    assertEquals("http://www.w3.org/2000/XMLSchema",
         rootNode.getDeclaredNamespace(Namespace.XML_SCHEMA_INSTANCE_NS_URI),
         null);

    // Check the content node
    assertEquals(Namespace.XML_SCHEMA_INSTANCE_NS_URI,
         rootNode.getXMLSchemaLocation());
    assertEquals("http://www.w3.org/2000/xmlschema/1.1",
         rootNode.getLocalName());

    Element contentNode = (Element)rootNode.getContent();

    // Check the schema definitions node
    Element schemaNode = contentNode.getChild("schema");

    // Check the schema namespace URI, should be null
    assertNotNull(getNamespaces(schemaNode));
    assertEquals(null,
         schemaNode.getDeclaredNamespace(XMLConstants.XML_SCHEMA_1_0_URI));

    // Check the definition node
    Element definitionNode = schemaNode.getChild("definitions");
    assertNotNull(definitionNode);

    // Check the xs:any name definition
    final Element ifNode = (Element)definitionNode.getContent();


    // Test the definition node
    Element xsDef = (Element)XMLInputFactory.newInstance().
                 createXMLStreamReader(ifNode.getInputStream()).getNextElement();
    assertNotNull(schemaNode);
    assertEquals("x",    xsDef.getLocalName());
    assertEquals(0,        xsDef.getAttributes().size());
    assertEquals("xs:any", xsDef.getContent().getLocalName());
    assertEquals("any",  definitionNode.getName());
  }

  /**
   * Check if the validation is being skipped.
   * 
   * @param validate If true checks if the validation succeeds, checks if the XML is 
   *                         valid and that its document type is XSD.
   */
  private void assertCheckValidity( boolean validate) throws IOException {
    assertFalse(docHandler.validate(root, validate));
  }


  /**
   * Test case for the method {@link #parse(Document)}
   * which checks if the XML is valid according to the schema definitions
   * schema and the content definition.
   * 
   */
  @Test
  public void testParse() throws IOException, IFXDocumentException {
    assertCheckValidity(false);
    // parse the document and check the validity
    DocumentBuilder xmlParser = new Builder().build();
}
}