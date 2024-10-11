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
* XML input for test.
* <pre>
* &lt;root xmlns="http://www.example.org/">
*   &lt;child xmlns="http://example.org/">
*     &lt;desc>A very simple desc</desc>
*   &lt;child></child>
*   &lt;child xmlns=/&gt;
*   &lt;child xmlns=&quot;http://example.org/&quot;&gt;
*     &lt;desc>A more deeply nested desc</desc>
*   &lt;child></child>
*   &lt;child xmlns="http://example.org/&quot;&gt;
*     &lt;desc>A descendant desc</desc>
*   &lt;child xmlns=&quot;http://example.org/&quot;&gt;
*     &lt;desc>A deeply nested desc</desc></child>
* &lt;/root>
* </pre>
* The tests that produce this XML have to be performed using
* the XTreeUtil class to replace
* the original XML: XTreeUtil.parseXML(XMLData, false, null, null), which is the same instance used with the
* standard parser used by XML parsers and with the standard verifier used by the JAXP/JAX-RS XML readers.
* The XML data is parsed via the JAXP Parser and the test is performed by checking the results.
* @since 0.9
* @throws IOException the i/o exception occurred
* @see <a href="http://www.sopra-tech.org/sopra/xtree/xtree.html#parseXML">http://www.sopra-tech.org/sopra/xtree/xtree.html#parseXML</a>
* @see <a href="http://www.sopra-tech.org/sopra/xtree/xtree.html#getXML">http://www.sopra-tech.org/sopra/xtree/xtree.html#getXML</a>
* @see <a href="http://jwkh.stellala.org/2013/05/27/xml-parsing.html">http://jwkh.stellala.org/2013/05/27/xml-parsing.html</a>
*/
public class parseXML_0_Test {
public final static String XMLDATA_0 ="<root>"+
			" <child xmlns='http://www.example.org/' desc='A very simple desc'/>"+
			"<child xmlns='http://example.org/' desc='A very deeply nested desc'> <desc>A very deeply nested desc</desc></child> </root>";
		/**
* XML data for test.
* @param validDTD optional boolean to indicate whether DTD validation should be used
* @return XML data for test
*/
public static String getXMLData(boolean validDTD) {
		return XMLDATA_0;
}


	public void testReadXML() throws Exception {
		test_readXML1(validDTD);
	}

	public void testReadXML1() throws Exception {
		test_readXML1(null);
	}

	/**
* Parse an XML document into an XTree
*
* @param validDTD if true the DTD validation should be used for XML parsing; if false no DTD validation is used
* @return an XTree
* @throws Exception if test fails
*/
}
}