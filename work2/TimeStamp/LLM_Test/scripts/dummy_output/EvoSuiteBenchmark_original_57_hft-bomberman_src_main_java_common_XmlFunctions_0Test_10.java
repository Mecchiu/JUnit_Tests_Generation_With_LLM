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
		
    public static int testGetXmlValue(String x) {
        return getXmlValue(x).getFile().getAbsolutePath().getBytes().length; 
	}
	
	private static final File XML_FILE = new File("TestDoc.xml");
	
	public static int testGetXmlValue() {
	    return testGetXmlValue(XML_FILE.getAbsolutePath());
	}
	
	public static int testGetXmlValueByFilePath() {
	    return testGetXmlValue(null);
	}
	
	public static class GetXmlValueByFilePath {
		public int getFile() {
			return getXmlValue(XML_FILE.getPath()).getFile().getAbsolutePath().length;
		}
	}

	@Test
	public void testGetXmlValueByFilePath() throws IOException, TransformerException, ParserConfigurationException {
		try {
			File file = new File(XML_FILE.getPath());
			File tempFile = File.createTempFile("test",".tmp");
			
			tempFile.deleteOnExit();
			
			TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
	        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	        
	        Source source = new DOMSource(file);
	        
	        transformer
	       .transform(
	                source,
	                new StreamResult(new File(tempFile.getAbsolutePath())));
	        
	        Document document = DocumentBuilderFactory.newInstance()
	                       .newDocumentBuilder()
	                       .parse(new File(file.getFullPath()));

	        Node n = findXmlNode(document.getDocumentElement().getLocalName(), document);
	        if (n == null) {
	            logger.info("Not found: " + document.getDocumentElement().getLocalName());
	        }
	        
			String value = findXmlValue(n);
			assertEquals("Value is wrong", document.getDocumentElement().getLocalName(), value);
	} catch (FileNotFoundException ex) {
	    logger.error(ex.getMessage());
	} catch (IOException ex) {
	    logger.error(ex.getMessage());
	} catch (TransformerException ex) {
	    logger.error(ex.getMessage());
	} catch (ParserConfigurationException ex) {
	    logger.error(ex.getMessage());
	} catch (SAXException ex) {
	    logger.error(ex.getMessage());
	}

}
}