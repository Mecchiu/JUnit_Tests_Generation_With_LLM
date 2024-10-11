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
		
    private static int id = 0;
    private static int currentId = 0;
 
    private String mapFile = path + "/TestMap.xml";
 
	private Node root;
	private Document doc;
	
    private static final Logger logger = Logger.getLogger(MapReaderTest.class);

    public MapReaderTest() {
        return;
    }
 
 

    /**
     *  method to set path of map file
     */
    public void setPath(String mapFilePath) {
        initMapFile(mapFilePath);
    }


    /**
     * sets up map file-object for read-methods
     *
     * @param mapFilePath
     */
    private void initMapFile(String mapFilePath) {

    	doc = getXMLDocument(mapFilePath);
    	root = doc.getDocumentElement();

    }    	
 
    /**
     * reads value of property map-object
     *
     * @param node
     *            - where xml value for property map-object should be read from
     * @param name
     *            - expected property name
     * @return null - if the read value of property is not found in xml-file
     */
    private String getXMLValue(Node node, String name) {
    	NodeList list = node.getElementsByTagName(name);
    	if (list.getLength() == 0) {
    		logger.debug(String.format("\nNo value found for %s, Property is %s.\n", path, name));
    		return "";
    	} else {
    		return list.item(0).getTextContent();
    	}
    }
 

// Test methods of MapReader   

    /**
     *  tests if a value in a group of Nodes is found properly
     *
     * @param node - where xml value should be read
     * @param list - list of nodes
     */
    private void checkXMLValue(Node node, NodeList list) {

    	String value;

		value = node.getProperty(path + ".Value");

	logger.debug(String.format("%s: %s \n",path,value));

		if (StringUtils.isBlank(value)) {
			logger.debug("%s: ERROR No value found %s, Property is %s.\n",
					path, value, node.getTextContent());
		} else {

			logger.debug(String.format("%s: OK value found %s, Property is %s.\n",
					path, value, node.getTextContent()));
		}

    }

    /**
     * checks if all attributes exist in the properties of the map-object
     *
     * @param map - map object
     */
    public void checkValues(Map map) {

    	logger.debug("\nAttributes of map object {} \n", map);


        checkXMLValue(doc.getDocumentElement(), root.getElementsByTagName("map-attribute"));
        checkXMLValue(doc.getDocumentElement(), root.getElementsByTagName("x"));
        checkXMLValue(doc.getDocumentElement(), root.getElementsByTagName("y"));
        checkXMLValue(doc.getDocumentElement(), root.getElementsByTagName("width"));
        checkXMLValue(doc.getDocumentElement(), root.getElementsByTagName("height"));

    }

    /**
     * calls XML-read method for all properties
     * @return
     */
    private Document getXMLDocument(String mapPath) {

    	logger.debug("\nRead all properties from " + mapPath);

        final NodeList mapList;
        InputSource inStr = new FileInputSource(mapPath);
        
        try {

            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

            builderFactory.setValidating(false);
            builderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            builderFactory
               .setFeature("http://xml.org/sax/features/external-general-entities", false);
            builderFactory.setFeature("http://xml.org/sax/features/external-parameters", false);

            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            mapList = builder.parse(inStr);

        } catch (ParserConfigurationException ex) {
            builder = null;
            logger.debug(String.format("\nERROR Parsing map %s\n",mapPath));
        }

        if (builder!= null) {
            if (builder.getElementsByTagName("map-attribute").getLength() > 0) {
            	checkValues(new Map(mapList));
            }
        }

        return mapList.item(0).getOwnerDocument();
    }

    /**
     * Gets map's path as xml-file path
     *
     * @return
     */
    private String path() {
        return mapFilePath;
    }
}