// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
		private static final String ELEMENT_NAME = "element";
	@Test
    void testElementName() throws Exception {
		System.out.println("Testcase : Element.getAttributeLocalName");
	}
	@Test
    void testAttributeNames() throws Exception {
		System.out.println("Testcase : Element.getAttributeNames");
	}
	@Test
    void testLookupAttribute() throws Exception {
		System.out.println("Testcase : Element.getAttribute(attribute_name)");
	}
	@Test
    void testGetAttribute(String attribute_name, String attribute_ns, String attribute_localName, int index) throws Exception {
		System.out.println("Testcase : Element.getAttribute(attribute_name,attribute_ns,attribute_localName,index)");
	}
	@Test
    void testLookupXMLAttr() throws Exception {
		System.out.println("Testcase : Element.lookupXMLAttr");
	}
	@Test
    void testLookupXMLAttrWithValue() throws Exception {
		System.out.println("Testcase : Element.lookupXMLAttrWithValue");
	}
	@Test
    void testLookupXMLNSAttr() throws Exception {
		System.out.println("Testcase : Element.lookupXMLNSAttr");
	}
	@Test
    void testLookupUnknownAttr(int index) throws Exception {
		System.out.println("Testcase : Element.lookupUnknownAttr(index)");
	}
	@Test
    void testText() throws Exception {
		System.out.println("Testcase : Element.text");
	}
	@Test
    void testText1() throws Exception {
		System.out.println("Testcase : Element.text1");
	}
	@Test
    void testText2() throws Exception {
		System.out.println("Testcase : Element.testText2");
	}
	@Test
    void testText3() throws Exception {
		System.out.println("Testcase : Element.testText3");
	}
	@Test
    void testText4() throws Exception {
		System.out.println("Testcase : Element.testText4");
	}
	@Test
    void testText5() throws Exception {
		System.out.println("Testcase : Element.testText5");
	}
	@Test
    void testTextAttributes() throws Exception {
		System.out.println("Testcase : Element.testTextAttributes");
	}
	@Test
    void testGetNodeName() throws Exception {
		System.out.println("Testcase : Element.getNodeName");
	}
	@Test
    void testLookupXMLNSTag() throws Exception {
		System.out.println("Testcase : Element.lookupXMLNSTag");
	}
	@Test
    void testLookupXMLTagName() throws Exception {
		System.out.println("Testcase : Element.lookupXMLTagName");
	}
	@Test
    void testGetXsiType() throws Exception {
		System.out.println("Testcase : Element.getXsiType");
	}
	@Test
    void testGetNamespace() throws Exception {
		System.out.println("Testcase : Element.getNamespace");
	}
	@Test
    void testGetName() throws Exception {
		System.out.println("Testcase : Element.getName");
	}
	@Test
    void testGetText() throws Exception {
		System.out.println("Testcase : Element.getText");
	}
	@Test
    void testGetTextAttributes() throws SAXException {
		System.out.println("Testcase : Element.getTextAttributes");
	}
}