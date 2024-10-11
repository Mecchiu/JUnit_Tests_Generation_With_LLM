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
	* Gets area of map
	*/
	@Test
	public void testGetArea() {
		
		// create empty Map object
		Map map = new Map();
	}
		
		/**
* Gets start-points in map object. start points are read from xml
* and the point (0,0) is added at the
* end after.
*
* @throws Exception 
*/
	@Test
	public void testGetStartPoint() {
		
		// create empty Map object
//		Map map = new Map();
	}
		
		/**
* Sets start-points in map object. start points are read from xml
* and the point (0,0) is added at the
* end after.
*
* @throws Exception 
*/
//	@Test
	public void testSetStartPoint() {
		
//		Map map = new Map();
	}

		/**
* sets the specific tiles to map object
*/
	@Test
	public void testSetTiles() {
		
		Map map = new Map("test");
		map.setTiles(new Array(1));

//		map.setStartPoints(new Array(new Point(0,0)));
	}

	@Test
	public void testSetStartPoints() {
		
	}

		/**
* sets the autowall property of map-object
*/
	@Test
	public void testSetWall() {
		
		Map map = new Map("test");
		map.setWall("1");
		
//		map.setStartPoints(new Array(new Point(0,0)));
	}

	@Test
	public void testSetWallFalse() {
		
	}

		@Test
	public void testSetArea() {
		
//		assertTrue(false);
	}

	@Test
	public void testSetAreaFalse() {
		
//		assertTrue(true);
	}
		
		/**
* creates a map object. It contains one unit test case for the
* {@link MapReader#getXMLValue(Node, String)} method
*/
	@Test
	public void testNewInstance() {
		
//		// create empty map object
		Map map = new Map("test");
		
		// create instance and add it to the Map
		System.out.println(map);
		MapReader test = new MapReader("test");
		test.setMapProperies(map);
	}

	/**
* tests a new method for {@link MapReader#getXMLValue(Node, String)}
*/
@Test
public void testNewInstance_2() {
		
//		// create empty map object
		Map map = new Map("test");
		
        // tests is empty
		System.out.println(map);
	}

	/**
* tests a new method for {@link MapReader#getXMLValue(Node, String)} using
* the xpath-expression
*/
@Test
public void testNewInstance_3() {
		
	// create empty map object
		Map map = new Map("test");
		
        // tests contains a specific Value
		String expected = "contains a specific Value";
	    	
        //tests getXMLValue with xpath-expression
		assertEquals(null, map.getXMLValue(test.getNodes().xpath("/map-object/name"), "test"));
		assertEquals("containsValue", expected);
        
	}

		/**
* tests a new method for {@link MapReader#getXMLValue(Node, String)} using
* the xpath-expression of the specific value
*/
@Test
public void testNewInstance_4() {
		    
	    // create empty map object
		        Map map = new Map("test");
		    
        // tests contains a specific Value
		assertEquals("containsValue, but returns a String", "test", map.getXMLValue(  
                test.getNodes().xpath("/map-object/name"), "test"));
        
	}

	
		/**
* tests a new method for {@link MapReader#getStartPoints(org.w3c.dom.Node)} using the
* specific node
*/
@Test
public void testGetStartPoints_2() throws XPathExpressionException {
		
		// create empty map object
		 Map map = new Map("test");

        // tests contains a specific Value
		Object value = new Point("0,0");

        // tests get start-points using the xpath-expression
		NodeList list = xmlFunctions.getStartPoints(new XPath("start-points/coordinate-of-wall"),
				 new XPath("start-points/position-of-wall"), new XPath("start-points/(position/number)-/position^-of-wall"),
				 new XPath("/map-object/start-points"));
		assertEquals(value, list.item(0));

		value = new Point("0,1");

        // tests get start-points using the xpath-expression
		list = xmlFunctions.getStartPoints(new XPath("start-points/coordinate-of-wall"),
				 new XPath("start-points/position-of-wall"), new XPath("start-points/(position/number)-/position^-of-wall"),
				 new XPath("/map-object/start-points"));
		assertEquals(value, list.item(0));

		value = null;

        // tests get start-points using the xpath-expression on specific node
		Node target = new XPath("start-points/(position/number)-/position^-of-wall/start-point")
			.evaluate( test.getNodes().item(4) );

		Element element = (Element) target;
}
}