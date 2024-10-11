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
		
    private final InputSource xmlInput = new InputSource(new FileReader("test1.xml"));
    private final boolean validateDTD = true;
    private final String schemaType = "xsd";
    private final String schema = "dtd";
	
    /**
     * Test case for
     * {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}
     *
     * The expected result with the parsing XML input on the root element (without any children) is:
     * <ul>
     * <li><code>rootElement</code> : <code>XTree</code></li>
     * <ul>
     *
     * @throws SAXException if there was a problem while parsing XML
     * @throws IOException if there was a problem while writing to a file
     */
    @Test
    public void test() throws SAXException, IOException {
		
		Element rootElement = parseXMLSequential(xmlInput, validateDTD, schemaType, schema, null);
		XTreeUtil.parseXMLSequential(null, validateDTD, schemaType, schema, null);
		
		check(rootElement, "<rootElement lang=\"enb\" lang_space=\"\" xmlns=\"0\" />", null, null);
		
		check("<tag>value</tag>", "<tag>value</tag>", null, null);
		
		Element child1 = (Element)rootElement.getFirstChild();
		check("<tag>value</tag>", "<tag>child2</tag>", null, null);
		
	   check("<tag>value</tag>", "<tag>another value</tag>", null, null);
		
		check("<tag>value</tag><tag>another value</tag>", "<tag>more &more</tag>", null, null);

	}
private void check(String out1, String out2, InputSource expectedInputSource, String expectedResult) throws Exception {
	  checker = null;
	  expectedResult = expectedResult.replaceAll("/", File.separatorChar);
	  checker = new ContentHandlerFixer();
	  checker.parse(xmlInput, validateDTD, expectedInputSource, expectedResult );
	  checker.getXMLValidator().setValidation(false);
	  XTreeUtil.parseXMLSequential(null, validateDTD, schemaType, expectedInputSource, rootElementHandler);
	}
}