// Map_0Test.java
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
* It contains ten unit test cases for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {

		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @author christian
		*/
		@Test
		void testGetTileByIndex() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(0, 0);
				assertEquals(tile.getType(), "wall");
				tile = map.getTileByIndex(1, 1);
				assertEquals(tile.getType(), "empty");
				tile = map.getTileByIndex(2, 2);
				assertEquals(tile.getType(), "wall");
				tile = map.getTileByIndex(3, 3);
				assertEquals(tile.getType(), "empty");
				tile = map.getTileByIndex(4, 4);
				assertEquals(tile.getType(), "wall");
				tile = map.getTileByIndex(5, 5);
				assertEquals(tile.getType(), "empty");
				tile = map.getTileByIndex(6, 6);
				assertEquals(tile.getType(), "wall");
				tile = map.getTileByIndex(7, 7);
				assertEquals(tile.getType(), "empty");
				tile = map.getTileByIndex(8, 8);
				assertEquals(tile.getType(), "wall");
				tile = map.getTileByIndex(9, 9);
				assertEquals(tile.getType(), "empty");
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
 * MapReader-Class reads xml-file and writes data to map-object
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
     * reads map-properties from xml-file and writes them to map-object
     *
     * @param map -
     *            map-object
     */
    public void setMapProperies(Map map) {
        // get map-properties
        String mapName = root.getAttribute("name");
        String mapVersion = root.getAttribute("version");
        String mapAuthor = root.getAttribute("author");
        Date mapDate = new Date(root.getAttribute("date"));
        int mapDifficulty = Integer.parseInt(root.getAttribute("difficulty"));
        String mapImageSet = root.getAttribute("imageSet");
        int mapMaxPlayers = Integer.parseInt(root.getAttribute("maxPlayers"));
        String mapFilePath = root.getAttribute("filePath");
        // set map-properties to map-object
        map.setProperties(mapName, mapVersion, mapAuthor, mapDate, mapDifficulty, mapImageSet, mapMaxPlayers, mapFilePath);
    }

    /**
     * reads map-tiles from xml-file and writes them to map-object
     *
     * @param map -
     *            map-object
     */
    public void setTiles(Map map) {
        // get map-tiles
        NodeList tiles = root.getElementsByTagName("tile");
        // set map-tiles to map-object
        for (int i = 0; i < tiles.getLength(); i++) {
            Node tile = tiles.item(i);
            if (tile.getNodeType() == Node.ELEMENT_NODE) {
                Element tileElement = (Element) tile;
                int x = Integer.parseInt(tileElement.getAttribute("x"));
                int y = Integer.parseInt(tileElement.getAttribute("y"));
                String type = tileElement.getAttribute("type");
                Tile mapTile = new Tile(new Point(x, y));
                mapTile.setType(type);
                map.setTileByIndex(x, y, mapTile);
            }
        }
    }

    /**
     * reads map-powerups from xml-file and writes them to map-object
     *
     * @param map -
     *            map-object
     */
    public void setPowerups(Map map) {
        // get map-powerups
        NodeList powerups = root.getElementsByTagName("powerup");
        // set map-powerups to map-object
        for (int i = 0; i < powerups.getLength(); i++) {
            Node powerup = powerups.item(i);
            if (powerup.getNodeType() == Node.ELEMENT_NODE) {
                Element powerupElement = (Element) powerup;
                int x = Integer.parseInt(powerupElement.getAttribute("x"));
                int y = Integer.parseInt(powerupElement.getAttribute("y"));
                String type = powerupElement.getAttribute("type");
                PowerUp mapPowerup = new PowerUp(new Point(x, y));
                mapPowerup.setType(type);
                map.addPowerup(mapPowerup);
            }
        }
    }

    /**
     * reads map-startpoints from xml-file and writes them to map-object
     *
     * @param map -
     *            map-object
     */
    public void setStartPoints(Map map) {
        // get map-startpoints
        NodeList startpoints = root.getElementsByTagName("startpoint");
        // set map-startpoints to map-object
        Point[] startPoint = new Point[startpoints.getLength()];
        for (int i = 0; i < startpoints.getLength(); i++) {
            Node startpoint = startpoints.item(i);
            if (startpoint.getNodeType() == Node.ELEMENT_NODE) {
                Element startpointElement = (Element) startpoint;
                int x = Integer.parseInt(startpointElement.getAttribute("x"));
                int y = Integer.parseInt(startpointElement.getAttribute("y"));
                startPoint[i] = new Point(x, y);
            }
        }
        map.setStartPoints(startPoint);
    }

    /**
     * returns map-dimensions
     *
     * @return Point with map-dimensions
     */
    public Point getArea() {
        // get map-dimensions
        NodeList area = root.getElementsByTagName("area");
        Node areaNode = area.item(0);
        if (areaNode.getNodeType() == Node.ELEMENT_NODE) {
            Element areaElement = (Element) areaNode;
            int x = Integer.parseInt(areaElement.getAttribute("x"));
            int y = Integer.parseInt