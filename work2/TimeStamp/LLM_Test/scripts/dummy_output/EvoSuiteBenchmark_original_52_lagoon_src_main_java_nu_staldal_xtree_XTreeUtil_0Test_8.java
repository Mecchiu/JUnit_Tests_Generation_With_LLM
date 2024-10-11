// XTreeUtil_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {
		
	/**
	 * The data for the test.
	 */
    private final String DATA_T = 
        "<?xml version=\"1.0\" encoding=\"ISO 8859-1\"?>"+
        "<ns1 xmlns=\"http://docs.oasis-open.org/opendocument/ urn\"><ns2 name=\"Root\">"+
        "<ns1:namespace>"+namespace+"</ns1:namespace>"+
        "   <ns1:package namespace=\"http://docs.oasis-open.org/opendocument/ urn/graphics\" xmlns:ns1=\"http://www.oasis.org/xri/graphics\">"+
        "      <ns2:styleSheet xmlns:ns2=\"http://www.w3.org/1999/XSL/Transform\">"+
        "        <ns1:stylesheet xmlns=\"http://www.w3.org/1999/XSL/Transform\">"+
        "          <ns1:ref textformat=\"application/x-dtbncx+xml\" formatoptions=\"http://www.w3.org/2005/xmp\"></ns1:ref>"+
        "        </ns1:stylesheet></ns2:stylesheet>"+
        "      </ns1:styleSheet>"+
        "   </ns1:package>"+
        "</ns2></ns1:namespace>"+
        "</ns1:package>"+
        "</ns2></ns1:package>";
		
    /**
     * This member object represents the expected output from the method.
     */
    private List<OdtDocumentEntry> expectedResult;

    /**
     * Parse the input into an XTree.
     *
     * @param xmlInput the input to parse
     * @param validateDTD validate using DTD
     * @param schemaType the type of schema to use, or <code>null</code>
     *                    for no schema validation
     * @param schema the schema to use, or <code>null</code>
     *                    for no schema validation
     * @return an XTree representation of the XML data
     * @throws SAXParseException if the XML data is not valid
     * @throws SAXException if any other error occurs while parsing the XML data
     * @throws IOException if there was some I/O error while reading the input.
     */
    private Element parseXML(InputSource xmlInput, boolean validateDTD, String schemaType, InputSource schema) 
    throws SAXParseException, SAXException, IOException {
        StringWriter stringWriter = new StringWriter();
        XmlReader xmlReader = new XMLReader(new InputSource(stringWriter));
        xmlReader.setFeature("http://xml.org/sax/features/namespaces", true);
        xmlReader.setFeature("http://xml.org/sax/features/validation", true);
        Element element = (Element)xmlReader.read();
        xmlReader.close();

        // fixer test
        Element entity = ContentHandlerFixer.getEntity(element);

        String input = stringWriter.toString();
        input = XTreeUtil.unescapingXML(input);

        element = parseXML(input, validateDTD, schemaType, schema);

        if(!stringWriter.toString().endsWith("/>") && element!= null) {
            throw new IllegalArgumentException("Failed to parse XML:\n"+stringWriter);
        }
        return element;
    }

    @Test
    public void testParseXML_valid() throws SAXException {
        List<OdtDocumentEntry> expectedResult = parseXML(new InputSource(DATA_T), true, null, null);
        assertNotNull(expectedResult);
        assertTrue(expectedResult.size() > 0);



        List<TreeNode> elementTree = new ArrayList<TreeNode>();
        System.out.println("Element tree length: "+elementTree.size());

    }

    @Test
    public void testParseXML_validNoSchema() throws SAXException {
        List<OdtDocumentEntry> expectedResult = parseXML(new InputSource(DATA_T), false, null, null);
        assertNotNull(expectedResult);
        assertEquals(3, expectedResult.size());

    }

    /**
    * Tests the implementation of {@link XTreeUtil#parseXML(InputSource, boolean)} for the
    * case where the document has been validated but no schema is specified.
    */
	@Test
	public void testParseXML_validSchema() throws SAXException {
        Document document = parseXML(DATA_T, true, null, null);

        // verify that the schema is loaded
        assertNotNull(document.getURNSection(new URN(null, "Schema")));
    }

    /**
     * Tests the implementation of {@link XTreeUtil#parseXML(InputSource, boolean)} for a schema error.
     */
    @Test
    public void testParseXML_schemaErr() throws SAXException, ParserConfigurationException {
        Document document = parseXML(DATA_T, true, null, null);

        // verify that the schema is loaded
        assertNotNull(document.getURNSection(new URN(null, "Schema")));
        
        assertNull(document.getURNSection(new URN(null, "noSuchSection")));
    }


    /**
     * Tests the implementation of {@link XTreeUtil#parseXML(InputSource, boolean)} for an
     * invalid content.
     */
	@Test
	public void testParseXML_invalid() throws SAXException {
        Document document = parseXML(new InputSource(DATA_T+"<ns2:stylesheet xmlns:ns2=\"http://www.w3.org/1999/XSL/Transform\">"));
        
}
}