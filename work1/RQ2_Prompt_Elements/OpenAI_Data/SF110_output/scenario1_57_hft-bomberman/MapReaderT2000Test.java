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
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@name";
				String expected = "test";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue2() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@width";
				String expected = "10";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue3() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@height";
				String expected = "10";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue4() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@tilewidth";
				String expected = "32";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue5() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@tileheight";
				String expected = "32";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue6() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@version";
				String expected = "1.0";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue7() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@orientation";
				String expected = "orthogonal";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue8() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@renderorder";
				String expected = "right-down";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue9() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/@nextobjectid";
				String expected = "1";
				String actual = mapReader.getXMLValue(node, XMLPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests if the method returns the correct value for a given XML-path.
		*/
		@Test
		void testGetXMLValue10() {
				MapReader mapReader = new MapReader();
				String XMLPath = "//map/tileset/@firstgid";
				String expected = "1";
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
 * Loads a XML-file and write read properties, tiles and start points to
 * map-object
 *
 * @author christian
 */
public class MapWriter {

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
		
		private static final Logger logger = Logger.getLogger(Map