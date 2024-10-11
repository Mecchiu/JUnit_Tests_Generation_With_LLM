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
     * Class constructor
     *
     * @param args -
     *            empty
     */
    public MapReaderTest(String[] args) {
    }

    public Logger getLogger(){
        return Logger.getLogger(this.getClass().getName());
    }

    public void test1() throws Exception {

        String xmlPath = "META-INF/XMLConfig.xsd";

	NodeList nl = getXML(xmlPath);

	//print first level nodes
	for (int i = 0; i < nl.getLength(); i++) {
	    Node node = nl.item(i);
	    logger.debug("node:" + node);
	}

	//print first level nodes
	for (int i = 0; i < nl.getLength(); i++) {

	    Node node = nl.item(i);
	    logger.debug("node:" + node);
	}

        //get node of xml config
        Node mapConfig = getNodes(xmlPath, "MapConfiguration/mapConfiguration").item(0);

	//get Node of XML config
	NodeMapNodeMap mapNodeMap = new NodeMapNodeMap(mapConfig);

	//get Node of XML config
	NodeMapConfigNodeList mapNodeList = new NodeMapConfigNodeList(mapConfig);

        //get x number of tiles
	NodeList xList = mapNodeList.getNodeList();
        NodeList xItem = (NodeList) xList.item(0);
        int xNumber = Integer.parseInt((String) xItem.item(0));

	//get number of tiles in map object
	NodeList zList = mapNodeList.getNodeList();
        NodeList zItem = (NodeList) zList.item(0);
        int zNumber = Integer.parseInt((String) zItem.item(0));


        //get Tile at X value
	NodeList tileList = mapNodeList.getNodeList();
        NodeList tileItem = (NodeList) tileList.item(0);
        Node tile = tileItem.item(0);

        // get Start-points of map object
	NodeList startPointList = mapNodeList.getNodeList();
        NodeList startPointItem = (NodeList) startPointList.item(0);
        Point startPoint = new Point(
                    Integer.parseInt((String) startPointItem.item(0)),
                    Integer.parseInt((String) startPointItem.item(1)));



        //creating MapReader object and setting read properties
        MapReader mapReader = new MapReader();
        //creating map object
        Map map = new Map(mapNumber, tileNumber, startPoint, xNumber, zNumber);

        //creating properties
        mapReader.setXML((String) "META-INF/XMLConfig.xsd");
        mapReader.getMapProperies();
        mapReader.setMapProperies(map);
        mapReader.setPowerups(powerups());

        System.out.println("map reader:" + mapReader);

        //reading map
        logMap("test1", mapNumber, tileNumber, startPoint, xNumber, zNumber, gridWidth, gridHeight,
                gridWidthGrid, gridHeightGrid, mapReader.getArea());

	//reading map again and setting autowall and start points
        logMap("test2", mapNumber, tileNumber, startPoint, xNumber, zNumber, gridWidth, gridHeight,
                gridWidthGrid, gridHeightGrid, mapReader.getArea());

        //reading map twice
        logMap("test3", mapNumber, tileNumber, startPoint, xNumber, zNumber, gridWidth, gridHeight,
                gridWidthGrid, gridHeightGrid, mapReader.getArea());



		//setting property
        NodeMapNodeMap property = new NodeMapNodeMap(map);
        property.addProperty("width", gridWidth);
        property.addProperty("height", gridHeight);
        property.addProperty("widthGrid", gridWidthGrid);
        property.addProperty("heightGrid", gridHeightGrid);
        property.addProperty("startPosition", String.valueOf(xNumber + startPoint.x));
        property.addProperty("startPositionGrid", String.valueOf(xNumber + startPoint.x));

        property.addProperty("startPoint", String.valueOf(startPoint.x + startPoint.y));
        property.addProperty("startPointGrid", String.valueOf(startPoint.x + startPoint.y));

        property.addProperty("startLocation",
                String.valueOf(((double) startPoint.y) + startPoint.x));
        property.addProperty("startLocationGrid",
                String.valueOf(((double) startPoint.y) + startPoint.x));

        property.addProperty("properties", property);
        property.addProperty("tileProperty", tileString);



    }
}