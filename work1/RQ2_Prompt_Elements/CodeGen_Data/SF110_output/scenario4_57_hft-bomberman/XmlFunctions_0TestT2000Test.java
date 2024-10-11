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

    XmlFunctions _pXmlFunctions;

    /**
    * Constructor
    *
    */
    public XmlFunctions_0Test() {
        _pXmlFunctions = new XmlFunctions(null);
    }

    /**
     *
     */
    @Test
    public void testGetXmlValue() {

        for (Iterator<Node> it = (new XmlFunctions_0Test()).findXmlNodes(); it.hasNext();) {
            String sXmlPath = it.next().getPath().getRelative(sXmlFile);
            String sValue = _pXmlFunctions.getXmlValue(sXmlFile);

            assertTrue("Could not find the XPath expression for the element "
                        + sXmlPath +   getLocalFile(sXmlPath).getAbsolutePath(),
                        sValue!= null
                        && sValue.toLowerCase().indexOf("xml") >= 0);
       }
    }

    /**
     * reads a xml file into a Document object
     * @throws ParserConfigurationException -
     * @throws SAXException -
     * @throws TransformerConfigurationException -
     * @throws TransformerException -
     */
    private void openXmlFile(String fileName) throws ParserConfigurationException,
                SAXException, TransformerConfigurationException,
                TransformerException {
        File f = new File(fileName);
        _pXmlFunctions.openXmlFile(f);
    }

    /**
     * writes a Document object xml (back) into xml file
     * @throws ParserConfigurationException -
     * @throws SAXException -
     * @throws TransformerConfigurationException -
     * @throws TransformerException
     */
    private void writeXmlFile() throws ParserConfigurationException,
                SAXException, TransformerConfigurationException,
                TransformerException {
        File f = new File(fileName);
        _pXmlFunctions.openXmlFile(f);
    }

    /**
     *
     * @param sXmlPath -
     *            path to xml file
     */
    private Document buildDocument(String sXmlPath) {
        File f = new File(new File("target/XmlFunctions") + File.separator
                    + "xml" + File.separator + sXmlPath);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc =  db.parse(f);
        doc.getDocumentElement().normalize();
        return doc;
    }
    
    private static Document buildDocWithParsingErrors(String sXmlPath)


    {
        try {


            Document doc = buildDocument(sXmlPath);
            return doc;

        }
        catch (ParserConfigurationException e) {
            Logger.getLogger(XmlFunctions_0Test.class.getName())
           .log(Level.SEVERE,e.getMessage(),e);
            return null;
        }
        catch (SAXException e) {
            Logger.getLogger(XmlFunctions_0Test.class.getName())
           .log(Level.SEVERE,e.getMessage(),e);
            return null;
        }
    }
    

    private File _localFile(String sXmlPath) {

        return new File("target/XmlFunctions" + File.separator
                    + "xml"+ File.separator+sXmlPath);