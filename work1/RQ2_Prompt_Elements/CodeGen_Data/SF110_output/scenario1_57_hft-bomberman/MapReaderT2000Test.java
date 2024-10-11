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

	private Logger logger = Logger.getLogger(XMLRendererTest.class);
	
	public MapReaderTest(){
		logger.debug("MapReaderTest is empty");
	}
	
	/**
     * Test of getXMLValue method, of class MapReader.
     */
    @Test
    public void testGetXMLValue(){

    	String xml = "<root><data><val>Hello World</val></data></root>";

    	MapReader map = new MapReader();
    	String result = map.getXMLValue(xml);
    	logger.debug(result);
    	assertEquals("<root><data><val>Hello World</val></data></root>", result);
    }

    /**
     * Test of toString method, of class MapReader.
     */
    @Test
    public void testToAsString(){
    	final MapReader map = new MapReader();

    	String result = map.toString();
    	logger.debug(result);
    	assertEquals("MapReader [toString()=<empty>]", result);
    }
    
}
