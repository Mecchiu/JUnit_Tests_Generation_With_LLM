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
				String xPath = "x/text()";
				String expected = "1";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath2() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "y/text()";
				String expected = "0";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndInvalidXPath2() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "y/text()";
				String expected = "1";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath3() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "type/text()";
				String expected = "wall";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndInvalidXPath3() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "type/text()";
				String expected = "floor";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath4() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "accessible/text()";
				String expected = "false";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndInvalidXPath4() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "accessible/text()";
				String expected = "true";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath5() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "bombable/text()";
				String expected = "false";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndInvalidXPath5() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "bombable/text()";
				String expected = "true";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath6() {
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
		void testGetXMLValueWithValidNodeAndInvalidXPath6() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "x/text()";
				String expected = "1";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath7() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "y/text()";
				String expected = "0";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndInvalidXPath7() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "y/text()";
				String expected = "1";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath8() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "type/text()";
				String expected = "wall";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and an invalid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndInvalidXPath8() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and invalid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "type/text()";
				String expected = "floor";
				String actual = mapReader.getXMLValue(node, xPath);
				assertNotEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid node and a valid XPath expression.
		*/
		@Test
		void testGetXMLValueWithValidNodeAndValidXPath9() {
				logger.info("Test case for MapReader#getXMLValue(Node, String) method with valid node and valid XPath");
				MapReader mapReader = new MapReader("src/test/resources/testmap.xml");
				Node node = mapReader.xmlFunctions.findXmlNodes("//fields/field").item(0);
				String xPath = "accessible/text()";
				String expected = "false";
				String actual = mapReader.getXMLValue(node, xPath);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link MapReader#getXMLValue(Node, String)} method.
		* It tests the method with a valid