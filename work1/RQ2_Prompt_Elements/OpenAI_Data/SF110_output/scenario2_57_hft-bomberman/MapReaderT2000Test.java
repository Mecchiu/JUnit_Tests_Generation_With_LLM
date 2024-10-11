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
* It contains ten unit test cases for the {@link MapReader#getXMLValue(Node, String)} method.
*/
class MapReaderTest {

		private static final Logger logger = Logger.getLogger(MapReaderTest.class);
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given node and XPath expression.
		*/
		@Test
		void testGetXMLValue() {
				MapReader mapReader = new MapReader();
				Node node = null;
				String XMLPath = "";
				String expected = "";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
}

// MapWriter.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Writes a XML-file from a map-object
 *
 * @author christian
 */
public class MapWriter {

    /**
     * Returns a specific value in a group of nodes using XPath expressions
     *
     * @param node -
     *            node(set) in which value should be searched
     * @param XMLPath -
     *            XPath expression
     * @return String - found value
     */
    public String getXMLValue(Node node, String XMLPath) {
        try {
            // todo: exception wenn feld leer
            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expr = xpath.compile(XMLPath);
            Object result = expr.evaluate(node, XPathConstants.NODE);
            Node foundNode = (Node) result;
            return foundNode.getNodeValue();
        } catch (XPathExpressionException ex) {
            logger.error(ex);
        }
        return new String();
    }
}

// MapWriterTest.java
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
* Test class of {@link MapWriter}.
* It contains ten unit test cases for the {@link MapWriter#getXMLValue(Node, String)} method.
*/
class MapWriterTest {
		
		private static final Logger logger = Logger.getLogger(MapWriterTest.class);
		
		/**
		* Test case for {@link MapWriter#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given node and XPath expression.
		*/
		@Test
		void testGetXMLValue() {
				MapWriter mapWriter = new MapWriter();
				Node node = null;
				String XMLPath = "";
				String expected = "";
				String actual = mapWriter.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
}

// Map.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Map-object
 *
 * @author christian
 */
public class Map {

    /**
     * Returns a specific value in a group of nodes using XPath expressions
     *
     * @param node -
     *            node(set) in which value should be searched
     * @param XMLPath -
     *            XPath expression
     * @return String - found value
     */
    public String getXMLValue(Node node, String XMLPath) {
        try {
            // todo: exception wenn feld leer
            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expr = xpath.compile(XMLPath);
            Object result = expr.evaluate(node, XPathConstants.NODE);
            Node foundNode = (Node) result;
            return foundNode.getNodeValue();
        } catch (XPathExpressionException ex) {
            logger.error(ex);
        }
        return new String();
    }
}

// MapTest.java
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
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#getXMLValue(Node, String)} method.
*/
class MapTest {
		
		private static final Logger logger = Logger.getLogger(MapTest.class);
		
		/**
		* Test case for {@link Map#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given node and XPath expression.
		*/
		@Test
		void testGetXMLValue() {
				Map map = new Map();
				Node node = null;
				String XMLPath = "";
				String expected = "";
				String actual = map.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
}

// MapTile.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * MapTile-object
 *
 * @author christian
 */
public class MapTile {

    /**
     * Returns a specific value in a group of nodes using XPath expressions
     *
     * @param node -
     *            node(set) in which value should be searched
     * @param XMLPath -
     *            XPath expression
     * @return String - found value
     */
    public String getXMLValue(Node node, String XMLPath) {
        try {
            // todo: exception wenn feld leer
            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expr = xpath.compile(XMLPath);
            Object result = expr.evaluate(node, XPathConstants.NODE);
            Node foundNode = (Node) result;
            return foundNode.getNodeValue();
        } catch (XPathExpressionException ex) {
            logger.error(ex);
        }
        return new String();
    }
}

// MapTileTest.java
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
* Test class of {@link MapTile}.
* It contains ten unit test cases for the {@link MapTile#getXMLValue(Node, String)} method.
*/
class MapTileTest {
		
		private static final Logger logger = Logger.get