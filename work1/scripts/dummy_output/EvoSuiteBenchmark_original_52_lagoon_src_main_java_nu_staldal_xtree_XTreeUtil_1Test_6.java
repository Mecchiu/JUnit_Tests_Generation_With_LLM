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
		
    /** The test XML content. */
	private static final String TEST_XML_CONTENT = "" +
		                                             "<root>" +
      		                                             "  <child>" +
          								  "    <child_name>child3" +
                         		"      <child_name>child2" +
      					  "      </child_name>" +
      					  "  </child>" +
          								"</root>";
		
    /** The test XML schema in XML 2.2 format. */
		private static final String TEST_XML_2_2 = "" +
            "<?xml version=\"1.0\"?>" +
            "<schema version=\"2.2\"" +
            "xmlns=\"http://www.staldal.nu/xmlns/2.2\"" +
            ">" +
            "<simple type=\"xsd\"></simple>" +
            "</schema>";
	
    /** The schema type version, to check if it used the schema2 schema (http://www.mzml.org/xmlns/schema#2.2, not xmlns="http://www.mzml.org/xmlns/schema#2.2"). */
    private static final String TEST_GIVEN_VERSION = "XML 2.2";
    
    /** The test XML schema in XML 3.0 format. */
    private static final String TEST_XML_3_0 = "" +
            "<?xml version=\"1.0\"?>" +
            "<schema version=\"3.0\"" +
            "xmlns=\"http://www.staldal.nu/xmlns/3.0\"" +
            ">" +
            "<simple type=\"xsd\"/>" +
            "</schema>";
	
	/** The test XML schema in XML 3.0 format. */
	private static final String TEST_XML_3_0_2 = "" +
            "<?xml version=\"1.0\"?>" +
            "<schema version=\"3.0\"" +
            "xmlns=\"http://www.staldal.nu/xmlns/3.0\"" +
            "xml:base=\"http://www.staldal.nu/xml/3.0\"" +
            ">" +
            "<simple type=\"xsd\"/>" +
            "</schema>";
	
	/** The test XML schema in XML 3.0 format. */
	private static final String TEST_XML_3_0_3 = "" +
            "<?xml version=\"1.0\"?>" +
            "<schema version=\"3.0\"" +
            "xmlns=\"http://www.staldal.nu/xmlns/3.0\"" +
            "xml:base=\"http://www.staldal.nu/xml/3.0/simple\"" +
            ">" +
            "<simple type=\"xsd\"/>" +
            "</schema>";
	
	/** The test XML document. */
	private static final String TEST_XML_DOCUMENT = "" +
        "<?xml version=\"1.0\"?>" +
        "<root>" +
        "  <child>" +
            "    <child_name>child3</child_name>" +
            "  </child>" +
        "</root>";
	
	/** The content handler to be used. */
	private ContentHandler contentHandler;
	
    /** The test XML content handler. */
	private String contentHandlerStr;
	
	/** The test XML parser. */
	private ValidatorParser xmlParser;
	
	/** The test XML validator. */
	private Validator xmlValidator;
	
	/**
	 * Creates a test XML element content handler.  This is used to insert the tree element
	 * from XTreeUtil.parseXML to check when the tree element is parsed successfully.
	 * @param contentHandler content handler to use.
	 * @param testXMLContent test XML to parse.
	 * @return the test XML handler.
	 */
	private ContentHandler createXMLContentHandler(ContentHandler contentHandler, String testXMLContent) {
        contentHandlerStr = "";
		ContentHandlerFixer contentHandlerFixer = new ContentHandlerFixer();
		contentHandlerFixer.addContentFixer(new ContentHandlerFixer() {
													 public void afterStartElement(Attributes atts) {
													 if (atts.getURI("xmlns") == null) {
                                                       contentHandlerStr += "<?xml version=\"1.0\"?>";
                                                    }
													 }
        });
        contentHandlerFixer.insertContent(contentHandler, testXMLContent);
		return contentHandlerFixer.getContentHandler();
	}
	
	/**
	 * Creates an empty XML document.
	 * Used to use the test XML content handler.
	 * @return XML document.
	 */
	private Document createEmptyDocument() {
		return xmlParser.parse(new InputSource(new StringReader(TEST_XML_DOCUMENT)));
	}
	
	/**
	 * Creates a validator.
	 * @param verifyDTD should the document type be validated?
	 * @param schemaType schema type.
	 * @param schema the schema type.
	 */
	private Validator createValidator(boolean verifyDTD, String schemaType, String schema) {
		final ValidatorFactory verifierFactory = new ValidatorFactory();
		
		if (verifyDTD) {
            verifierFactory.setValidator(createXMLValidator());
		} else {
            verifierFactory.setValidator(createValidator());
		}
		
}
}