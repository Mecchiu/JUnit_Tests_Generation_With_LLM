// Map_2Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {

	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 1
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_1() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(1);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 2
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_2() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(2);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 3
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_3() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(3);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 4
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_4() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(4);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 5
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_5() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(5);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 6
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_6() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(6);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 7
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_7() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(7);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 8
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_8() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(8);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 9
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_9() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(9);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Map#getStartPoint(int)} method.
	 * 
	 * <p>
	 * Tested method: {@link Map#getStartPoint(int)}
	 * 
	 * <p>
	 * Tested input: playerNo = 10
	 * 
	 * <p>
	 * Expected output: Point(1,1)
	 */
	@Test
	void testGetStartPoint_10() {
		Map map = new Map("");
		Point expected = new Point(1,1);
		Point actual = map.getStartPoint(10);
		assertEquals(expected, actual);
	}
}

// MapReader.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * MapReader-Class for reading xml-files
 *
 * @author christian
 */
public class MapReader {

    private Map map;

    private String xmlFile;

    private boolean settiles;

    private boolean setpowerups;

    private boolean setstartpoints;

    /**
     * creates MapReader-Object
     *
     * @param xmlFile -
     *            path to xml file
     */
    public MapReader(String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap();

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap();

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap();

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap();

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap();

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(String xmlFile);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap();

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map, boolean settiles, boolean setpowerups, boolean setstartpoints);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */
    public Map readMap(Map map);

    /**
     * reads xml-file and sets all information to map
     *
     * @return
     */