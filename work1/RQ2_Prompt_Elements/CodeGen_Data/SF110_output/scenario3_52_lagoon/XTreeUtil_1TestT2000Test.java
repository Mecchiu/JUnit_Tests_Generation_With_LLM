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
// Test class
	private static final String xmlDocument = "file:/dummy/data.xml";
	private static final String dtdURL = null;
	private static final String schemaType = null;
	private static final String schemaURL = null;
	private static final long Xtree1 = 1;					// 0 : XTree1
	private static final Attribute xmlVersion =
	    new AttributeImpl(null, "1.0");
	private static final Attribute xmlBase_Attribute =
	    new AttributeImpl(null, "v1.6");
	private static final Element rootEl = new ElementImpl(null, null);
	private static final Element testRootEl = new ElementImpl(null, null);
	private static final String xmlDoc = "<?xml version='1.0' encoding='UTF-8'?>"+
									   "<test:element xmlns:test='http://my.relax"+(schemaType==null?"":":")+"' xmlns:foo='http://my.relax:v1.5'"+
									   "test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"' "+
									   "test:validate='yes'>"+
									   "<test:element xmlns:test='http://my.relax"+(schemaType==null?"":":")+'"><"+xmlDoc+">"+">"+">"+">"+">"+">"+">");
	private static final String document =
	    "<?xml version='1.0'?>"+
    				"<test:element xmlns:test='http://my.relax"+(schemaType==null?"":":")+'\"/>"+
    				"<test:element xmlns:test='http://my.relax:v1.5\'/>"+
					"<test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"'><test:element xmlns:test='http://my.relax:v1.5' test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"'><test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"/></test:element>"+
									   "<test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"'><test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"/></test:element>"+
									   "<test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"'><test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"/></test:element>"+
									   "<test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"'><test:element test:base='"+xmlBase_Attribute+"' test:version='"+Xtree1+"'><"+xmlDoc+">"+">"+">"+">"+">"+">"+">"+">";

   private static final Element testXmlRootElement = new ElementImpl(null, null);

   /**
    * Test constructor for parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler) with the XML data from a file.
    */
   @Test
   public void testXmlParseSequentialData() throws Exception {
        final InputSource inputSource1 = new InputSource(new FileInputStream(xmlDocument));
        final boolean validate = true;
        final String schemaUrl = null;
        final String schemaType = schemaUrl == null?null:schemaUrl.toString();
        ElementUtilsTest.setXML1Document(testXmlRootElement, dtdURL, schemaType, xmlVersion, validate, schemaUrl, schemaType);	// 0 : XTree1
        final InputSource inputSource2 = new InputSource(new FileInputStream(document));
        final Element output = XTreeUtil.parseXMLSequential(inputSource1, false, null, outputRootEl, ElementHandler.XML_HANDLER);
        assertEquals("Incorrect root element.", testXmlRootElement, output);
        assertNotNull("The root element is not initialized.", outputRootEl);
        final Attribute outputXmlVersion = (Attribute)outputRootEl.getAttributeNamed("test:version");
        final String expectedXmlVersion = Xtree1 + "/1.0";
        assertEquals("XML version not correctly set in the root element.", expectedXmlVersion, outputXmlVersion.getString());
        final Element outputChildElement1 = (Element)outputRootEl.getChildNodes().item(0);
        assertNotNull("Child element for root element is null. The second child cannot be retrieved.", outputChildElement1);
        assertEquals("Child element for root element does not have a name.", "test:element", outputChildElement1.getQName());
        assertNotNull("Child element for root element has no child elements. All child elements cannot be retrieved.", outputChildElement1.getChildNodes().item("test:element"));
        assertEquals("Document without a schema url can not contain a schema attribute.", Xtree1, outputChildElement1.getAttribute("test:schema").getString());
    }

   /**
    * Test constructor for parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler) without validation and without schema URL.
    */
   @Test
   public void testXmlWithoutSchema() throws Exception {
        final InputSource inputSource1 = new InputSource(new FileInputStream(xmlDocument));
        final boolean validate = false;
        final String schemaUrl = null;
        final String schemaType = null;
