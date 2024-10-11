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
		* It tests if the method returns the correct start point for player 1.
		*/
		@Test
		void testGetStartPoint_1() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(1);
				assertEquals(new Point(20, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 2.
		*/
		@Test
		void testGetStartPoint_2() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(2);
				assertEquals(new Point(20, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 3.
		*/
		@Test
		void testGetStartPoint_3() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(3);
				assertEquals(new Point(40, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 4.
		*/
		@Test
		void testGetStartPoint_4() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(4);
				assertEquals(new Point(40, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 5.
		*/
		@Test
		void testGetStartPoint_5() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(5);
				assertEquals(new Point(60, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 6.
		*/
		@Test
		void testGetStartPoint_6() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(6);
				assertEquals(new Point(60, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 7.
		*/
		@Test
		void testGetStartPoint_7() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(7);
				assertEquals(new Point(80, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 8.
		*/
		@Test
		void testGetStartPoint_8() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(8);
				assertEquals(new Point(80, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 9.
		*/
		@Test
		void testGetStartPoint_9() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(9);
				assertEquals(new Point(100, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 10.
		*/
		@Test
		void testGetStartPoint_10() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(10);
				assertEquals(new Point(100, 40), startPoint);
		}
}

// MapReader.java
package common;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
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
 * MapReader-Class reads xml-file and writes information to map-object
 *
 * @author christian
 */
public class MapReader {

    private Document doc;

    private Element root;

    private Point area;

    /**
     * creates MapReader-Object and reads xml-file
     *
     * @param xmlFile -
     *            path to xml-file
     */
    public MapReader(String xmlFile) {
        try {
            File file = new File(xmlFile);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(file);
            doc.getDocumentElement().normalize();
            root = doc.getDocumentElement();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * sets map properties to map-object
     *
     * @param map -
     *            map-object
     */
    public void setMapProperies(Map map) {
        // get map properties
        String mapName = root.getAttribute("name");
        String mapVersion = root.getAttribute("version");
        String mapAuthor = root.getAttribute("author");
        Date mapDate = new Date(root.getAttribute("date"));
        int mapDifficulty = Integer.parseInt(root.getAttribute("difficulty"));
        String mapImageSet = root.getAttribute("imageSet");
        int mapMaxPlayers = Integer.parseInt(root.getAttribute("maxPlayers"));
        String mapFilePath = root.getAttribute("filePath");
        // set map properties to map-object
        map.setProperties(mapName, mapVersion, mapAuthor, mapDate, mapDifficulty, mapImageSet, mapMaxPlayers, mapFilePath);
        // get map dimensions
        NodeList nodeList = root.getElementsByTagName("area");
        Element areaElement = (Element) nodeList.item(0);
        int mapX = Integer.parseInt(areaElement.getAttribute("x"));
        int mapY = Integer.parseInt(areaElement.getAttribute("y"));