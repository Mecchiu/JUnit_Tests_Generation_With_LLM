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

// MapReader.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Loads a XML-file and write read properties, tiles and start points to
 * map-object
 *
 * @author christian
 */
public class MapReader {

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

// MapReader.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Loads a XML-file and write read properties, tiles and start points to
 * map-object
 *
 * @author christian
 */
public class MapReader {

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

// MapReader.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Loads a XML-file and write read properties, tiles and start points to
 * map-object
 *
 * @author christian
 */
public class MapReader {

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

// MapReader.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Loads a XML-file and write read properties, tiles and start points to
 * map-object
 *
 * @author christian
 */
public class MapReader {

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

// MapReader.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Loads a XML-file and write read properties, tiles and start points to
 * map-object
 *
 * @author christian
 */
public class MapReader {

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

// MapReader.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;

/**
 * Loads a XML-file and write read properties, tiles and start points to
 * map-object
 *
 * @author christian
 */
public class MapReader {

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

// MapReaderTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.