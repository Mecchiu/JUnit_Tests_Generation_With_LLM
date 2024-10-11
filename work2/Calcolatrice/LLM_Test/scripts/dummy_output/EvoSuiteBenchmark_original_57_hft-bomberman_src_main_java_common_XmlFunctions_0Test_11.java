// XmlFunctions_0Test.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains one unit test case for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {
		String testDocument;
	
	/** Creates a new instance of XmlFunctions_0Test */
	public XmlFunctions_0Test() {
	}

	/**
	* tests getting a value from an element
	*/
	@Test
    public void testGetXmlValue() {
		File testDir = new File("E:/test");
		File testFile = new File(testDir, "test.xml");
		try {
			System.out.println("File " + testFile.getCanonicalPath() + " will be read!");
		} catch (IOException ioEx){
			System.err.println("Error in test.xml");
			ioEx.printStackTrace();
		}

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException orXPathEx){
			System.err.println("Error in test document: ParserConfigurationException");
			orXPathEx.printStackTrace();
		}
		dBuilder.setEntityResolver(_dDoc);

		Document _xmlFile;
		try {
			_xmlFile = dBuilder.parse(testFile);
		} catch (SAXException saXEx) {
			// TODO: handle exception
			//System.err.println("Error in test.xml");
			//saXEx.printStackTrace();
			try {
				XPathFactory factory = XPathFactory.newInstance();
				XPath xpath = factory.newXPath();
				XPathExpression expr = xpath.compile( "//TEST" );

				String valueXEx = expr.evaluate( _xmlFile );
				assertEquals( "XML error", "Error in TEST", valueXEx);
				System.out.println("");
			} catch (XPathExpressionException e) {
			} catch (ParserConfigurationException e) {
		}}
		assertNotNull(testFile);

		try {
			System.out.println("Testing xml value(1)");
			//System.out.println(getXmlValue("1"));  // <XmlFunctions>
			System.out.println(getXmlValue("2"));  // <XmlFunctions>
			System.out.println(getXmlValue("3"));  // <XmlFunctions>
		} catch (Exception e){
		}
	}

	private DocumentBuilderFactory dbFactory;
	private DocumentBuilder dBuilder;
	private String getXmlValue(String testKey) throws SAXException, XPathExpressionException, TransformerException, ParserConfigurationException, IOException {
		File testXml = new File(File("E:"), String.format("%s%03d.xml", testKey, 1));
		Document _xmlFile = null;
		Document _xmlFile2 = null;
		Document _xmlFile2Doc = null;
		try {
			System.out.println("Test file " + testXml.getCanonicalPath() + " read...");
			_xmlFile = dBuilder.parse(testXml);
		} catch (SAXException saXEx) {
			// TODO: handle exception
			//System.err.println("Error in test document: SAXException");
			//saXEx.printStackTrace();
		}
		// System.out.println("File read:" + testXml.getCanonicalPath() + " XML: " + getXmlValue(testKey));
}
}