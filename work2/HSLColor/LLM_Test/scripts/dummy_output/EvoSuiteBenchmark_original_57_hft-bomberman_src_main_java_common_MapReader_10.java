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
		* @return the x coordinate of Point <set><e><o>
		*/
    @Test
    public void setAreaX_test(){
        final Point point=new Point(2085.0,5.0);
        String mapFilePath="/map/test.xml";
        
        final XmlFunctions xmlFunctions=new XmlFunctions(mapFilePath);
        assertEquals("0.0.0", xmlFunctions.getXMLValue(Point.class,"e").substring(0,0));
        assertEquals("0.0.0", xmlFunctions.getXMLValue(Point.class,"o").substring(0,0));
        assertEquals("0",xmlFunctions.getXMLValue(Point.class,"b").substring(0,0));
        assertEquals(new Date().getNanos(),xmlFunctions.getXMLValue(Point.class,"now").getNanos());
        assertNull(xmlFunctions.getXMLValue(point,"b"));
        
        try {
            xmlFunctions.getXMLValue(point,"e");
            fail("XPathException expected");
        } catch(ParserConfigurationException pce) {
            logger.info("test XPath-Exception: "+ pce);
        }
        
        try {
            xmlFunctions.getXMLValue(point,"e.b");
            fail("XPathException expected");
        } catch(XPathExpressionException pe) {
            logger.info("test XPath-ExpressionError: "+ pe);
        }
    }
    
	/**
	* @return the y coordinate of Point <set><e><o>
	*/
    @Test
    public void setAreaY_test(){
        final Point point=new Point(2085.0,5.0);
        String mapFilePath="/map/test.xml";
        
        final XmlFunctions xmlFunctions=new XmlFunctions(mapFilePath);
        assertEquals("255.0", xmlFunctions.getXMLValue(Point.class,"e").substring(0,0));
        assertEquals("0.0.0", xmlFunctions.getXMLValue(Point.class,"o").substring(0,0));
        assertEquals("0",xmlFunctions.getXMLValue(Point.class,"b").substring(0,0));
        assertEquals(new Date().getNanos(),xmlFunctions.getXMLValue(Point.class,"now").getNanos());
        assertNull(xmlFunctions.getXMLValue(point,"b"));
        
        try {
            xmlFunctions.getXMLValue(point,"e");
            fail("XPathException expected");
        } catch(ParserConfigurationException pce) {
            logger.info("test XPath-Exception: "+ pce);
        }
        
        try {
            xmlFunctions.getXMLValue(point,"e.b");
            fail("XPathException expected");
        } catch(XPathExpressionException pe) {
            logger.info("test XPath-ExpressionError: "+ pe);
        }
    }
    
}