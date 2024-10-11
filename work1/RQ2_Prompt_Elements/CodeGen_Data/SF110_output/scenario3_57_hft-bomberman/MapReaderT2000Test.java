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

    public static final String XPATH_EXPRESSION = "/map/points/point";
    public static final String ROOT_TAG = "point";


    /**
     * Returns a specific value in a group of nodes using XPath expressions
     *
     * @param node -
     *            node(set) in which value should be searched
     * @param XMLPath -
     *            XPath expression
     * @return String - found value
     */
    public String getXMLValue(Node node, String XMLPath){
	XPathFactory factory = XPathFactory.newInstance(); // factory is an in-memory factory of nodes
	XPathFactory factory2 = XPathFactory.newInstance(); // factory is a XPath-instance of XML-Nodes
				
	XPath xPath = factory.newXPath();
	XPathExpression expression = xPath.compile( XPATH_EXPRESSION );

	try {

	    // execute XPath expression
	    NodeList nodes = (NodeList) expression.evaluate( node, XPathConstants.NODESET );
	    int foundCount = nodes.getLength();
	    Logger.getAnonymousLogger().debug("Number of found " + foundCount + " nodes");

	    // retrieve nodes by the XPath expression
	    for (int i=0; i<nodes.getLength(); i++) {
		Node node = nodes.item( i );
		Logger.getAnonymousLogger().debug("Node " + i + " [" + node.getNodeName() + "]");
		Point point = new Point( (int) node.getChildNodes().item(0).getDoubleValue() );
		Logger.getAnonymousLogger().debug("[Point: " + toString(point) + "]");
		String value = xPath.evaluate( XPATH_EXPRESSION, node.getTextContent(), XPathConstants.STRING).
					toString();
		Logger.getAnonymousLogger().debug("Returned value: " + value);
		node = (Node) node.getTextContent();
		node.setTextContent("NODE_ERROR");
		node = null;
	    }

	} catch (XPathInitializationException ex) {
		System.out.println("Exception occured when evaluating XPath expression");
		ex.printStackTrace();
	}
			
	return null;
    }

    public Node getDataNode(String name){
	// create a new node with the provided name
	Node dataNode =  document.createElement(name);

	// add properties and fill in the property names
	dataNode.setAttribute("name", name);
	dataNode.setAttribute("type", "number");
	dataNode.setAttribute("val", "1");
	return dataNode;
    }

    public static Node getDataNode(String name, int type, int val, Date timestamp){

	Node dataNode = getDataNode(name);

	// add properties and fill in the given property names
	dataNode.setAttribute("name", name);
	dataNode.setAttribute("type", type);
	dataNode.setAttribute("val", val);
	dataNode.setAttribute("timestamp", timestamp.toGMTString());

	return dataNode;

    }

}