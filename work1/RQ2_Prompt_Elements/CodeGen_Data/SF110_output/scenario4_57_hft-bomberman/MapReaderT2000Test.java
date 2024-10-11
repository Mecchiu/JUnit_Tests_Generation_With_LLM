// MapReaderTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapReader}.
* It contains one unit test case for the {@link MapReader#getXMLValue(Node, String)} method.
*/
class MapReaderTest {

    /**
     * Tests {@link MapReader#getXMLValue(Node, String)}
     */
    @Test
    void getXMLValue() {
    {
        logger.debug("Testing setter");
        final int area = 1;
     * 	   
            XPathFactory xPathfactory = XPathFactory.newInstance();
    	XPath xPath =  xPathfactory.newXPath();

    	//xPath.setNamespaceContext(null);
    	NodeSet nodeset =  new NodeSet();
    	nodeset.addNode(
                 xPath.selectSingleNode("//*[@id='1']")
				  , null) ;
    	//nodeset.addNode(
                //xPath.evaluate("//*[@id='1']/rectangle[@x='1.1']/circle[@y='1.3']/line")
                //, null) ;
//		nodeset.addNode(
//                //xPath.evaluate("//*[@id='1']/rectangle[@x='1.4']/circle[@y='1.2']/line")
//                //, null) ;

//				nodeset.addNode(
//                        xPath.evaluate("//line[@y='1.4']/line")
//				   , null) ;
        nodeset.addNode(
                 xPath.evaluate("//*[@id='1']/text")
					  , null) ;

        nodeset.addNode(
                xPath.evaluate("//*[@id='1']/text/string")
             , null) ;

        NodeList result = (NodeList)xPath.compile(
                "//line[@y='1.4']/line").evaluate(nodeset);
        logger.debug("Result:");
        for (int i = 0; i < result.getLength(); i++) {
                Node node = result.item(i);
                logger.debug("x:" + node.getTextContent());
        }
        
        logger.debug("nodeset:");
        for (int i = 0; i < result.getLength(); i++) {
                Node node = result.item(i);
                logger.debug("n:" + node.getTextContent());
        }
        logger.debug("result:");
        for (int i = 0; i < result.getLength(); i++) {
                Node node = result.item(i);
                logger.debug("nodes:" + node.getTextContent());
        }
        
        System.out.println("Success!");
        System.exit(0);
    }
}
