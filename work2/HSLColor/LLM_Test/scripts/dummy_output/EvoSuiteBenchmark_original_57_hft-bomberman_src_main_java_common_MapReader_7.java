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
     * Test for the getXmlValue method.
     *
     * @throws XPathExpressionException
     *             Exception thrown by XPath functions
     */
    @Test
    public void testGetXmlValue() throws XPathExpressionException {
        XPathFactory xpathFactory = XPathFactory.newInstance();

        XPath xPathObject = xpathFactory.newXPath();
		
        XPathExpression xp = xPathObject.compile("//area/Point[@x='0']");
        assertNotNull("can not create XPathExpression", xp);

        NodeList nl = (NodeList) xp.evaluate(null, "root", XPathConstants.NODE_SHEET);
        assertNotNull("can not get children ", nl);
        //System.out.println("there are: "+nl.getLength()+" objects");

        return;

    }

    /**
     * Test for the getXMLValue method.
     *
     * @throws XPathExpressionException
     *             Exception thrown by XPath functions
     */
    @Test
    public void testGetXMLValue_1() throws XPathExpressionException {

        XPathFactory xpathFactory = XPathFactory.newInstance();

        XPath xPathObject = xpathFactory.newXPath();
		
        XPathExpression xp = xPathObject.compile("//area/Point[@x='0']/Point[@y='0']");
        assertNotNull("can not create XPathExpression", xp);

        NodeList nl = (NodeList) xp.evaluate(null, "root", XPathConstants.NODE_SHEET);
        assertNotNull("can not get children ", nl);
        //System.out.println("there are: "+nl.getLength()+" objects");

        return;

    }

    /**
     * Test for the getXMLValue method.
     *
     * @throws XPathExpressionException
     *             Exception thrown by XPath functions
     */
    @Test
    public void testGetXMLValue_2() throws XPathExpressionException {

        XPathFactory xpathFactory = XPathFactory.newInstance();

        XPath xPathObject = xpathFactory.newXPath();
		
        XPathExpression xp = xPathObject.compile("//area/Point[@x='0']/Point[@y='0']/Point[@x='1']");
        assertNotNull("can not create XPathExpression", xp);

        NodeList nl = (NodeList) xp.evaluate(null, "root", XPathConstants.NODE_SHEET);
        assertNotNull("can not get children ", nl);
        //System.out.println("there are: "+nl.getLength()+" objects");

        return;

    }






}