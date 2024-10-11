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
		/**
		 * Test method for {@link XmlFunctions#XmlFunctions#getXmlValue(XPath)}.
		 *
		 * @throws ParserConfigurationException
		 * @throws TransformerException
		 * @throws XPathExpressionException
		 */
		@Test
		public void getXmlValue() throws ParserConfigurationException, TransformerException, XPathExpressionException {
	        try {
	            document = setUpDocument();
			// test method
			assertEquals("xmlfile", document.getDocType() );
			XmlFunctions.setXmlValue("xml-file", DocumentTools.getAsString(document, "cde"));
    		// test assertions
    		assertTrue("xml-file == XmlFunctions.getXmlValue()", docCompare( DocumentTools
    				.getXmlString(document), DocumentTools.getAsString(document, "cde")));
	        } catch (SAXException e) {
	            e.printStackTrace();
	        }
		}

		/**
		 * Method testing to set up a Document object
		*/
	private Document setUpDocument() {
		NodeList documentNodes =  findXmlNodes("document");
        // test results
        Document testDocument = DocumentTools.getAsDOMDocument("<document>", documentNodes);
        return testDocument;
	}

		/**
		 * Method testing to set up a Document object from a File path
		*/
	private Document setUpDocumentFromFile(File xmlFile) throws IOException, SAXException, ParserConfigurationException, TransformerConfigurationException {
		Logger.getLogger("CommonXmlFunctions").debug("xmlFile path :" + xmlFile.getAbsolutePath());
		final String filePath = xmlFile.getAbsolutePath();
        File newFile = new File( filePath );
		final Document newDocument = DocumentTools.getAsDOMDocument(filePath, null);
        return newDocument;
	}
}