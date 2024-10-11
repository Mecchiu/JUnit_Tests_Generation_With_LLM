// XTreeUtil_1Test.java
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
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
// XTreeUtil.java
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

/**
 * Some utility methods for XTree. All methods in this class are static.
 */
public final class XTreeUtil {

    /**
     * Parse an XML document into a list of XTree:s, one for each element under the root.
     * Uses JAXP to find a parser and JARV to find a validator.
     * Will not support xml:base.
     *
     * @param xmlInput the input to parse
     * @param validateDTD validate using DTD
     * @param schemaType the type of schema to use, or <code>null</code>
     *                    for no schema validation
     * @param schema the schema to use, or <code>null</code>
     *                    for no schema validation
     * @param handler handler to invoke for each element
     * @return the root element (without any children)
     * @throws SAXParseException if the XML data is not valid
     * @throws SAXException if any other error occurs while parsing the XML data
     * @throws IOException if there was some I/O error while reading the input.
     */
    public static Element parseXMLSequential(InputSource xmlInput, boolean validateDTD, String schemaType, InputSource schema, ElementHandler handler) throws SAXParseException, SAXException, IOException {
        try {
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            parserFactory.setNamespaceAware(true);
            parserFactory.setValidating(validateDTD);
            XMLReader xmlReader = parserFactory.newSAXParser().getXMLReader();
            SequentialTreeBuilder tb = new SequentialTreeBuilder(handler);
            if (schema!= null) {
                VerifierFactory vf = VerifierFactory.newInstance(schemaType);
                Verifier verifier = vf.newVerifier(schema);
                VerifierFilter filter = verifier.getVerifierFilter();
                filter.setParent(xmlReader);
                xmlReader = filter;
            }
            xmlReader.setContentHandler(tb);
            xmlReader.setErrorHandler(tb);
            xmlReader.parse(xmlInput);
            if ((schema!= null) &&!((VerifierFilter) xmlReader).isValid()) {
                throw new SAXParseException("Invalid XML data", null, null, -1, -1);
            }
            return tb.getRootElement();
        } catch (javax.xml.parsers.ParserConfigurationException e) {
            throw new Error("XML parser configuration error: " + e.getMessage());
        } catch (VerifierConfigurationException e) {
            throw new Error("XML verifier configuration error: " + e.getMessage());
        }
    }
}

// XTreeUtil_1Test.java
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
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
		
    public XTreeUtil_1Test() {
    }

    /**
     * The input to parse.
     */
    public static final String INPUT_TEXT = "<a>b</a><a>c</a><b>def</b><b>x</b>y</b>z";

    /**
     * The text to parse.
     */
    public static final String TEXT = "a";

    @Test
    public void testParseXMLSequential() throws Exception {
        InputSource input = new InputSource(new FileInputStream(INPUT_TEXT));
        XTreeUtil util = new XTreeUtil(true, null, null, false, false);
        Element element = util.parseXMLSequential(input, false, null, null, null);

        // Test if the root of the tree is not null and the text is correct.
        assertTrue("Root of tree should have been null and is still", element.getParent()!= null);
        assertTrue("Text is now in the TextContentHandler",
            ((ContentHandlerFixer) element.getContentHandler()).getContent().contentType.equals("text/xml"));
        assertTrue("Text is now in the TextContentHandler",
            ((ContentHandlerFixer) element.getContentHandler()).getContent().contentType.equals("text/plain"));

        /**
         * Test if the text is correct with a correct and invalid transformer.
         */
        assertTrue("The TextContentHandler (TextOutputStream) should start",
            ((ContentHandlerFixer) element.getContentHandler()).getContent().contentType.equals("text/xml"));
    }

    @Test
    public void testParseXMLSequentialXPath() throws Exception {
        InputSource input = new InputSource(new FileInputStream(INPUT_TEXT));

        XTreeUtil util = new XTreeUtil(true, null, null, false, false);
        Element element = util.parseXMLSequential(input, false, XTreeUtil.XPATH_PATH_ATTRIBUTE);

        // Test if the root of the tree is not null and the text is correct.
        assertTrue("Root of tree should have been null and is still", element.getParent()!= null);
        assertTrue("Text is now in the TextContentHandler",
            ((ContentHandlerFixer) element.getContentHandler()).getContent().contentType.equals("text/xml"));
        assertTrue("Text is now in the TextContentHandler",
            ((ContentHandlerFixer) element.getContentHandler()).getContent().contentType.equals("text/plain"));

        // Test if the text is correct with a correct and invalid transformer.
        List expected = Arrays.asList(TEXT);
        List result = new ArrayList();
        XPathContext context = new SimpleXPathContext();
        context.setNamespaceContext(new NamespaceContext() {
                public String getNamespaceURI(String prefix) {
                        if (prefix.equals(XTreeUtil.XPATH_PATH_ATTRIBUTE)) {
                                return "http://example.com/p";
                        } else {
                                if (prefix.equals(XTreeUtil.XPATH_LAST_PREFIX)) {
                                        if (TEXT.equals(expected.get(expected.size() - 1))) {
                                                return null;
                                        }
                                        return "text/html";
                                }
                                return null;
                        }
                }

                public String getPrefix(String namespaceURI) {
                        if (TEXT.equals(expected.get(expected.size() - 1))) {
                                return "http://example.com/p";
                        }
                        return null;
                }
            });
        context.setNamespaceMappings(result);
        try {
            util.parseXMLSequential(input, true, XTreeUtil.XPATH_PATH_ATTRIBUTE,
                context, element);
        } catch (XTreeException e) {
            assertNotNull(e.getCause());
            expected.remove(expected.size() - 1);
        }
        assertEquals("XPathException", expected, result);
    }

}
