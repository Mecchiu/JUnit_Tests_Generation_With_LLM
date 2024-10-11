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
		
	/**
	 * Test the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method with a null
	 * parameter.
	*/

	@Test
	public void testNullArgument() {
		String schemaType = "http://example.com/schema.xsd";
		
		InputSource schemaSource = new FileInputSource(XTreeUtil_0Test.class.getClassLoader().getResource("simple_root_with_schema.xsd"));
		assertNotNull("null schemaSource", schemaSource);
		InputSource schemaSource2 = new FileInputSource(XTreeUtil_0Test.class.getClassLoader().getResource("schema.xsd"));
		TreeBuilder rootBuilder = new TreeBuilder();
		ContentHandlerFixer contentHandlerFixer = new ContentHandlerFixer(rootBuilder);
		XTreeUtil_0Test.parseXML(schemaSource, false, schemaType, schemaSource);
		String content = rootBuilder.resultXML();
		assertEquals("testNullArgument.1.1", content);
		
		assertNull("new ContentHandlerFixer is initialized", contentHandlerFixer);
		
		assertTrue("no contentHandlerFixer is initialized", contentHandlerFixer == null);
	}
	
	/**
	 * Test the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method with a null
	 * input source.
	*/
	@Test
	public void testNullInputSource() {
		String schemaType = "http://example.com/schema.xsd";
		
		TreeBuilder rootBuilder = new TreeBuilder();
		
		assertEquals("rootBuilder is not initialized correctly", rootBuilder, new TreeBuilder().getTree());
		
		InputSource nullSource = null;
		
		try {
			XTreeUtil.parseXML(nullSource, false, schemaType, nullSource);
			
			fail("Parse null source exception");
		} catch (NullPointerException e) {
			if (!(e.getMessage().contains("the null string")) &&!(e.getMessage().contains("null input source"))) {
				fail("expected null string " + e.getMessage() + " containing null source " + nullSource.toString());
			}
		}
		
	}
}