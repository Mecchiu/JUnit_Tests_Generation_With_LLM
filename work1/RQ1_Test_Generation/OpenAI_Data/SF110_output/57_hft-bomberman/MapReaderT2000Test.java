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
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "x/text()";
				String expected = "0";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndInvalidXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "x/text()/";
				String expected = "";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an empty XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndEmptyXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and empty XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "";
				String expected = "";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a null XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndNullXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and null XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = null;
				String expected = "";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with an invalid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithInvalidNodeAndValidXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with invalid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				node = null;
				String xPath = "x/text()";
				String expected = "";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with an invalid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithInvalidNodeAndInvalidXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with invalid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				node = null;
				String xPath = "x/text()/";
				String expected = "";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with an invalid node and an empty XPath expression.
		*/
		@Test
		void testGetXMLValueWithInvalidNodeAndEmptyXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with invalid node and empty XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				node = null;
				String xPath = "";
				String expected = "";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with an invalid node and a null XPath expression.
		*/
		@Test
		void testGetXMLValueWithInvalidNodeAndNullXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with invalid node and null XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				node = null;
				String xPath = null;
				String expected = "";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a null node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithNullNodeAndValidXPath() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with null node and valid XPath");
				MapReader mapReader = new