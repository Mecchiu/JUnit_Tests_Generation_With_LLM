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
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MapReaderTest.class);

	/**
	 * Gets a specific value in a group of nodes using XPath expressions
	 *
	 * @param node -
     *            node(set) in which value should be searched
     * @param XMLPath -
     *            XPath expression
     * @return String - found value
	 */
    @Test
    public void test_getXMLValue() {
        assertEquals(new String(), "0");
        StringBuilder builder = new StringBuilder();
        
        builder.append("<node ");
        builder.append("x=\"0\" ");
        builder.append("y=\"0\" ");
        builder.append("val=\"testNode\" ");
        
        builder.append("/>");
        
        Node node = XPathFactory.newInstance().newXPath().evaluate(builder.toString(), "/node");
        
        for (int i = 0; i < 5; i++) {
            String val = getXMLValue((Node) node.get(3), "/nodes/node[1]/text()");
            assertEquals("testNode", val);
        }
        
	}
}
