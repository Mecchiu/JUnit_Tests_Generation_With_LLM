// XmlFunctions_1Test.java
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
* It contains one unit test case for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_1Test {
		
	final static String BASE_PATH = "/home";
		
    private String getXmlFilePath(String fileName);

    /**
     * sets global Document object
     *
     * @param document -
     *            xml document
     */
    private void setDocument(Document document);

    /**
     * writes document object of xml file into file
     *
     * @param document -
     *            file path to xml file
     * @throws ParserConfigurationException -
     *             unable to initialize the parser
     * @throws SAXException -Unable to parse xml file
     * @throws FileNotFoundException - 
     *             this shouldn't happen because it's a valid XML file.
     * @throws IOException - 
     *             this should not happen because we can read some data out of file.
     */
    private void writeXmlToFile(String fileName) throws ParserConfigurationException, SAXException, IOException {
        File file = new File(fileName);
        DocumentBuilderFactory docBuilder_factory = DocumentBuilderFactory.newInstance();
        docBuilder_factory.setValidating(false);
        DocumentBuilder docBuilder = docBuilder_factory.newDocumentBuilder();
        file.getParentFile().mkdirs();
        docBuilder.setEntityResolver(new MyEntityResolver());
        docBuilder.setErrorHandler(new MyErrorHandler());
        docBuilder.setDocumentURI(file.toURI().toString());
        FileWriter fWriter = new FileWriter(file);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        File outputFile = new File(fileName);
        StreamResult result = new StreamResult(outputFile);

        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(xml), result);

        fWriter.flush();
        fWriter.close();

    }

    /**
     * reads a xml file into a Document object
     *
     * @throws ParserConfigurationException -
     *             unable to initialize the parser
     * @throws SAXException -Unable to parse xml file
     * @throws FileNotFoundException - 
     *             this shouldn't happen because it's a valid XML file.
     * @throws IOException - 
     *             this should not happen because we can read some data out of file.
     */
    private void openXmlFile(String fileName) throws ParserConfigurationException, SAXException, IOException {
      
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setValidating(false);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        document = documentBuilder.parse(new FileReader(fileName));
    }
    
	String getXmlFilePath();

	static class MyEntityResolver implements EntityResolver {
    	private boolean initialized = false;
	}

	static class MyErrorHandler implements ErrorHandler {
		private boolean initialized = false;
	}

	Document getDocument() {
		return xml;
	}

	Node root;

	public void setDocument(Document document) {
		this.xml = document;
	}

	public boolean isInitialized() {
		return initialized;
	}

	void setInitialized() {
		this.initialized = true;
	}

	public Object unmarshal(String xml) {
}
}