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
		

private final Document document=new Document();
private XPathExpression xpath=null;

   /*
    * constructor
    *
    */
    public XmlFunctions_1Test(){}
   
   /*
     * runs a test for the XPath with XPathExpression
     *
     */
   private void runXPathTest(String XPath) throws IOException {
      logger.info("run this test : ["+Document.class.getName()+"."+XPath+"]. "+ XPath+ " < " + XML_FILE_NAME);
      xpath = XPathFactory.newInstance().newXPath();
      xpath.setNamespaceContext(new SimpleNamespaceContext());//getNamespaceContext(document, XML_NAMESPACE_URI+":parsing", XML_NAMESPACE_URI)+"/@*");
			
      if(XML_FILE_NAME.endsWith(".xml")) {
         document = (Document) xpath.evaluate("parse(_file)",document,XPathConstants.NODE);
      }else if(XML_FILE_NAME.endsWith(".xml.gz")) {
         document = (Document) xpath.evaluate("@parse(_file)",document,XPathConstants.NODE);
      } else {
         System.out.println("not found gz file");
         return;
      }
   }

  /*
    * 
    * get xml nodes by XPath, used in the unit tests.
    *
    */
 public NodeList findXmlNodes(String XPath) throws  TransformerException, ParserConfigurationException, IOException, SAXException {
   	NodeList nodeList = null;

    xpath = XPathFactory.newInstance().newXPath();
    xpath.setNamespaceContext(new SimpleNamespaceContext());

    if(XML_FILE_NAME.endsWith(".xml")) {
         document = (Document) xpath.evaluate("parse(_file)",document,XPathConstants.NODE);
    } else if(XML_FILE_NAME.endsWith(".xml.gz")) {
         document = (Document) xpath.evaluate("@parse(_file)",document,XPathConstants.NODE);
    } else {
         System.out.println("not found gz file");
         return (NodeList) null;
    }
    return nodeList;
 }

	 
   /**
    * prints documentation xml file 
    */
   private final void writeXmlFile() {
}
}