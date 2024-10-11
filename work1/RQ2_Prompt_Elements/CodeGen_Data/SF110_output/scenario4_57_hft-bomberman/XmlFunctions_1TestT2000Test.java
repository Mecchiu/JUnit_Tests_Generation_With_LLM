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

	private File document;

	/**
	 *  Constructor for JUnit Test
	 * @param documentName The name of the xml file
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 * @throws ClassNotFoundException
	 * @throws XPathExpressionException
	 *  
	 */
	public XmlFunctions_1Test(String documentName) {
	    String basePath = getClass().getResource("").getFile();
	    File path;
	    try{
			path = new File(basePath + File.separator + documentName);
			assertFalse("Document path: " + path.getAbsolutePath() + " cannot be found", path.exists());
	    }
	    catch (Exception e)
	    {
	    	throw new IllegalStateException("Cannot find document: " + documentName);
	    }
	}

	/**
	 * test to retrieve global xml node list within document
	 * The xml file is not closed so if it fails in such a case no node should be found
	 */

	@Test (expected = IOException.class)
	public void findXmlNodesIoct() throws ParserConfigurationException,
	 				IOException, SAXException, ClassNotFoundException,
	 				XPathExpressionException, TransformerConfigurationException {
	    XmlFunctions.findXmlNodes("Ioct");
	}
	
	
    @Test
    public void findXmlNodesJUnitTest() throws Exception
    {
        openXmlFile("P2_1_M_Test");
        NodeList n = findXmlNodes("M");
        assertEquals("Number of found nodes", 1, n.getLength());
        
        n = findXmlNodes("N");
        assertEquals("Number of found nodes", 5, n.getLength());
        n = findXmlNodes("E");
        assertEquals("Number of found nodes", 5, n.getLength());
       
       
    }

    @Test 
    void findXmlNodesStreamTest() throws Exception {
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
    	
        DocHelper d1 = new DocHelper();
    	
        Document doc = d1.getDocument(new StringReader("<?xml version=\"1.0\"?>\n<document root=\"M\"/>"));
        
        XPathFactory xpf = XPathFactory.newInstance("org.w3c.dom.Document");
        XPath xp = xpf.newXPath();
        
        Source src =  new DOMSource(doc);
        
        XPathExpression xPathExpr = xp.compile("/document/@M", XPathConstants.STRING);
        
        //System.out.println( xPathExpr.evaluate(src) );
        
        Node node = xPathExpr.evaluate(src, Node.class);
        
        assertNotNull("Document root node is null", node);
        
        d1.close();

    }
  
    static class DocHelper extends DocumentBuilderFactory {
        public org.w3c.dom.Document newDocument() throws ParserConfigurationException {
            //logger.debug("Document creation process started...");

            DocumentBuilderFactory factory = this.getClass().getSuperclass().newInstance();
            DocumentBuilder dom;
            try {
                dom = factory.newDocumentBuilder();
