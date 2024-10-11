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
		
	/**
	 * @throws Exception
	 * @param testXml the XML data to test
	 */
	private void testXmlSpecificity(XTreeTree testXml) throws Exception {
		Element root = XTreeUtil.parseXMLSequential(new InputSource(new StringReader(testXml)), true, null, null, null);
		
		// test that result conforms to DTD
		XTreeUtil assertValidator = new XTreeExceptionRewriting(new XMLInputSource(testXml, 2), Validator.ALLOW_MISSING_REFERENCES, true).getValidator();
		DocumentBuilderFactory myFactory = XMLReaderFactory.newInstance();
		XMLReader myRdr = myFactory.newXMLReader();
		myRdr.setContentHandler(new ContentHandlerFixer(assertValidator));
		try {
			myRdr.parse(new InputSource(new StringReader(testXml)));
		} catch (SAXParseException e) {
			assertEquals(e.getMessage(), "Parse Exception: " + e.getMessage());
		}
	}
	
	/**
	 * @throws Exception
	 * @param testXml the XML data to test
	 */
	public void testXmlSpecificity(Element root) throws Exception {
		testXmlSpecificity(new XMLInputSource(null, 0));
	}
	
	/**
	 * @throws Exception
	 * @param testFile the input resource
	 * @throws Exception
	 * @param systemPath the system path (if any) for the input resource
	 */
	private void testResourceSpecificity(InputStream testFile, String systemPath) throws Exception {
		XTreeUtil assertValidator = new XTreeExceptionRewriting(new XMLInputSource(testFile), Validator.ALLOW_MISSING_REFERENCES, true).getValidator();
		DocumentBuilderFactory myFactory = XMLReaderFactory.newInstance();
		XMLReader myRdr = myFactory.newXMLReader();
		myRdr.setContentHandler(new ContentHandlerFixer(assertValidator));
		
		InputSource inputSource = new InputSource();
		inputSource.setByteStream(testFile);
		inputSource.setSystemId(systemPath);
		try {
			myRdr.parse(inputSource);
		} catch (SAXParseException e) {
			assertEquals(e.getMessage(), "Parse Exception: " + e.getMessage());
		}
	}
	
	/**
	 * @throws Exception
	 * @param input the input for the XML DOM result (or null if the input data was not parsed)
	 * @param document the document to check (or null if the input DOM result is not a DOM)
	 */
	private static void checkDocumentSpecificity(InputSource input, Document document) throws Exception {
		// get the first validator
		Validator validator = document.getDocumentElement().getValidator();
		assertNotNull("No Validator returned" + validator.toString(), validator);
		
		// get the first schema-validator
		SchemaFactory myFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = myFactory.newSchema(new URL(validator.getSchemaSource()), false);
		
		// test that result conforms to schema
		ValidatorHandler validatorHandler = new ValidatorHandler((Validator) schema, validator);
		XMLReader myRdr = validatorHandler.getXMLReader();
		myRdr.setContentHandler(new ContentHandlerFixer(validatorHandler));
		
		// test that result conforms to schema
		Schema schemaChecker = myFactory.newSchema(null, true);
		myRdr.reset();
		myRdr.parse(input);
		
		schema.normalize("1.0");
		myRdr.reset();
		myRdr.parse(new InputSource(new StringReader(input.getContent())));
		assertSameSchema(schema, validator);
		
		// test that result conforms to schema
		schemaChecker.normalize("1.0");
		myRdr.reset();
		myRdr.parse(input);
		assertSameSchema(schema, validator, System.getProperty("file.encoding"));
		
		// test that result conforms to schema
		schemaChecker.normalize("2.0");
		myRdr.reset();
		myRdr.parse(input);
		assertSameSchema(schema, validator);
		
		// test that result conforms to schema
		schemaChecker.checkerFeatures();
		myRdr.reset();
		myRdr.parse(input);
		assertSameSchema(schema, validator);
	}
	
	/**
	 * @return the DOM result for the first DOM test
	 */
	private Document parseXMLSequential() throws Exception {
		return new XMLInputSource(null, 0).getDocument();
	}
	
	/**
	 * @return the first DOM result for the first DOM test
	 */
	private Document parseXML() throws Exception {
		return new XMLInputSource(null, 0).getDocument();
	}
	
	// utility methods
	
	/**
	 * @param root the root for the first test case
	 * @return the DOM result for the first DOM test
	 */
	private Document parseXMLSequential(Element root) throws Exception {
		return parseXML(null, null, root);
	}
	
	/**
	 * @param root the root for the first test case
	 * @return the DOM result for the first DOM test
	 */
}