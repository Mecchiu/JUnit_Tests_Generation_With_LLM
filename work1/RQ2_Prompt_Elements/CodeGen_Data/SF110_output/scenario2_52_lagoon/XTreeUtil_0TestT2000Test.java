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
     * Parse an XML document into an XTree.
     * Uses JAXP to find a parser and JARV to find a validator.
     * Will not support xml:base.
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
    public static Element parseXML(InputSource xmlInput, boolean validateDTD, String schemaType, InputSource schema) throws SAXParseException, SAXException, IOException {
        try {
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            parserFactory.setNamespaceAware(true);
            parserFactory.setValidating(validateDTD);
            parserFactory.setFeature("http://xml.org/sax/features/namespaces", true);
            parserFactory.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
            parserFactory.setFeature("http://xml.org/sax/features/validation", validateDTD);
            XMLReader xmlReader = parserFactory.newSAXParser().getXMLReader();
            TreeBuilder tb = new TreeBuilder();
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
            return tb.getTree();
        } catch (javax.xml.parsers.ParserConfigurationException e) {
            throw new Error("XML parser configuration error: " + e.getMessage());
        } catch (VerifierConfigurationException e) {
            throw new Error("XML verifier configuration error: " + e.getMessage());
        }
    }
}

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
		/** Simple test for parseXML with a valid XML file. */
		@Test
        void testSimple() throws Exception {
            InputSource xmlInput;
            InputSource xmlInput1;
			List<String> lines = new ArrayList<String>();
			lines.add("<?xml version=\"1.0\"?>");
			lines.add("<greeting>Hello World</greeting>");
            xmlInput = new InputSource(getClass().getResourceAsStream("/simple.xml"));
            xmlInput.setEncoding("UTF-8");
            xmlInput1 = new InputSource(getClass().getResourceAsStream("/simple.xml"));
            xmlInput1.setEncoding("UTF-8");
            XTreeUtil.parseXML(xmlInput, false, null, xmlInput1);
			assertTrue(lines.removeAll(Collections.singletonList("<greeting")));
            if (!lines.equals(Arrays.asList("<?xml version=\"1.0\"?>", "Hello World")))
                fail("Simple.xml did not contain \"Hello World\"");
        }


        /** Simple test for parseXML with a valid XML file. */
        @Test
        void testSJISPlus() throws Exception {
            InputSource xmlInput;
            InputSource xmlInput1;
			List<String> lines = new ArrayList<String>();
			lines.add("<?xml version=\"1.0\"?>");
			lines.add("<greeting>Hallo Welt<b>Hallo Hello</b>B</greeting>");
            xmlInput = new InputSource(getClass().getResourceAsStream("/sjisextended.xml"));
            xmlInput.setEncoding("ISO-8859-1, " + XTreeUtil.ISO_8859_1.getLanguages()[0]);
			xmlInput1 = new InputSource(getClass().getResourceAsStream("/sjisextended.xml"));
			xmlInput1.setEncoding("ISO-8859-1, " + XTreeUtil.ISO_8859_1.getLanguages()[1]);
            XTreeUtil.parseXML(xmlInput, false, null, xmlInput1);
			assertTrue(lines.removeAll(Collections.singletonList("<?xml version=\"1.0\"?>", "<greeting>Hallo Welt<b>Hallo Hello</b>B</greeting>")));
            if (!lines.equals(Arrays.asList("<?xml version=\"1.0\"?>", "<greeting>Hallo Welt<b>Hallo hello</b>B</greeting>", "<greeting>Hallo Welt<b>Hallo hello</b>B</greeting>")))
                fail("SJIS+ extended XML does not contain \"Hello World\"");
        }
}
