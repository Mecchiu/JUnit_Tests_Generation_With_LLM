// MapFilesListerTest.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapFilesLister}.
* It contains ten unit test cases for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {

		private static final Logger logger = Logger.getLogger(MapFilesListerTest.class);
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files in the given directory.
		*/
		@Test
		void testListMaps() {
				MapFilesLister mapFilesLister = new MapFilesLister();
				Vector<File> files = mapFilesLister.ListMaps("src/test/resources/maps");
				assertEquals(2, files.size());
		}
}

// MapInfo.java
package messages.global;

import java.io.Serializable;

/**
 * class for map information
 *
 * @author christian
 */
public class MapInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    private String author;
    private String version;
    private String filename;

    /**
     * constructor
     *
     * @param name -
     *            name of the map
     * @param description -
     *            description of the map
     * @param author -
     *            author of the map
     * @param version -
     *            version of the map
     * @param filename -
     *            filename of the map
     */
    public MapInfo(String name, String description, String author, String version, String filename) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.version = version;
        this.filename = filename;
    }

    /**
     * returns the name of the map
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * returns the description of the map
     *
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * returns the author of the map
     *
     * @return String
     */
    public String getAuthor() {
        return author;
    }

    /**
     * returns the version of the map
     *
     * @return String
     */
    public String getVersion() {
        return version;
    }

    /**
     * returns the filename of the map
     *
     * @return String
     */
    public String getFilename() {
        return filename;
    }
}

// MapInfoTest.java
package messages.global;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapInfo}.
* It contains ten unit test cases for the {@link MapInfo#MapInfo(String, String, String, String, String)} constructor.
*/
class MapInfoTest {
		
		/**
		* Test case for {@link MapInfo#MapInfo(String, String, String, String, String)} constructor.
		* It tests if the constructor sets the given values correctly.
		*/
		@Test
		void testMapInfo() {
				MapInfo mapInfo = new MapInfo("name", "description", "author", "version", "filename");
				assertEquals("name", mapInfo.getName());
				assertEquals("description", mapInfo.getDescription());
				assertEquals("author", mapInfo.getAuthor());
				assertEquals("version", mapInfo.getVersion());
				assertEquals("filename", mapInfo.getFilename());
		}
}

// MapInfoXMLReader.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import messages.global.MapInfo;

/**
 * class for reading map information from xml-files
 *
 * @author christian
 */
public class MapInfoXMLReader {

    /**
     * reads xml-file and returns map information
     *
     * @param file -
     *            xml-file to be read
     * @return MapInfo
     */
    public MapInfo readMapInfo(File file) {
        logger.info("Read map information from file: " + file + "...");
        String name = "";
        String description = "";
        String author = "";
        String version = "";
        String filename = file.getName();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeLst = doc.getElementsByTagName("map");
            for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;
                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("name");
                    Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
                    NodeList fstNm = fstNmElmnt.getChildNodes();
                    name = ((Node) fstNm.item(0)).getNodeValue();
                    NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("description");
                    Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
                    NodeList lstNm = lstNmElmnt.getChildNodes();
                    description = ((Node) lstNm.item(0)).getNodeValue();
                    NodeList lstNmElmntLst2 = fstElmnt.getElementsByTagName("author");
                    Element lstNmElmnt2 = (Element) lstNmElmntLst2.item(0);
                    NodeList lstNm2 = lstNmElmnt2.getChildNodes();
                    author = ((Node) lstNm2.item(0)).getNodeValue();
                    NodeList lstNmElmntLst3 = fstElmnt.getElementsByTagName("version");
                    Element lstNmElmnt3 = (Element) lstNmElmntLst3.item(0);
                    NodeList lstNm3 = lstNmElmnt3.getChildNodes();
                    version = ((Node) lstNm3.item(0)).getNodeValue();
                }
            }
        } catch (ParserConfigurationException e) {
            logger.error("ParserConfigurationException: " + e);
        } catch (SAXException e) {
            logger.error("SAXException: " + e);
        } catch (IOException e) {
            logger.error("IOException: " + e);
        }
        return new MapInfo(name, description, author, version, filename);
    }
}

// MapInfoXMLReaderTest.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import static org.junit.jupiter.api.Assertions.*;
import messages.global.MapInfo;

/**
* Test class of {@link MapInfoXMLReader}.
* It contains ten unit test cases for the {@link MapInfoXMLReader#readMapInfo(File)} method.
*/
class MapInfoXMLReaderTest {
		
		/**
		* Test case for {@link MapInfoXMLReader#readMapInfo(File)} method.
		* It tests if the method returns the correct map information.
		*/
		@Test
		void testReadMapInfo() {
				MapInfoXMLReader mapInfoXMLReader = new MapInfoXMLReader();
				MapInfo mapInfo = mapInfoXMLReader.readMapInfo(new File("src/test/resources/maps/map1.xml"));
				assertEquals("map1", mapInfo.getName());
				assertEquals("description1", mapInfo.getDescription());
				assertEquals("author1", mapInfo.getAuthor());
				assertEquals("version1", mapInfo.getVersion());
				assertEquals("map1.xml", mapInfo.getFilename());
		}
}

// MapXMLReader.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import messages.global.MapInfo;

/**
 * class for reading map from xml-files
 *
 * @author christian
 */
public class MapXMLReader {

    /**
     * reads xml-file and returns map
     *
     * @param file -
     *            xml-file to be read
     * @return Map
     */
    public Map readMap(File file) {
        logger.info("Read map from file: " + file + "...");
        Map map = new Map();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeLst = doc.getElementsByTagName("map");
            for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;
                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("name");
                    Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
                    NodeList fstNm = fstNmElmnt.getChildNodes();
                    map.setName(((Node) fstNm.item(0)).getNodeValue());
                    NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("description");
                    Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
                    NodeList lstNm = lstNmElmnt.getChildNodes();
                    map.setDescription(((Node) lstNm.item(0)).getNodeValue());
                    NodeList lstNmElmntLst2 = fstElmnt.getElementsByTagName("author");
                    Element lstNmElmnt2 = (Element) lstNmElmntLst2.item(0);
                    NodeList lstNm2 = lstNmElmnt2.getChildNodes();
                    map.setAuthor(((Node) lstNm2.item(0)).getNodeValue());
                    NodeList lstNmElmntLst3 = fstElmnt.getElementsByTagName("version");
                    Element lstNmElmnt3 = (Element) lstNmElmntLst3.item(0);
                    NodeList lstNm3 = lstNmElmnt3.getChildNodes();
                    map.setVersion(((Node) lstNm3.item(0)).getNodeValue());
                    NodeList lstNmElmntLst4 = fstElmnt.getElementsByTagName("width");
                    Element lstNmElmnt4 = (Element) lstNmElmntLst4.item(0);
                    NodeList lstNm4 = lstNmElmnt4.getChildNodes();
                    map.setWidth(Integer.parseInt(((Node) lstNm4.item(0)).getNodeValue()));
                    NodeList lstNmElmntLst5 = fstElmnt.getElementsByTagName("height");
                    Element lstNmElmnt5 = (Element) lstNmElmntLst5.item(0);
                    NodeList lstNm5 = lstNmElmnt5.getChildNodes();
                    map.setHeight(Integer.parseInt(((Node) lstNm5.item(0)).getNodeValue()));
                    NodeList lstNmElmntLst6 = fstElmnt.getElementsByTagName("tiles");
                    Element lstNmElmnt6 = (Element) lstNmElmntLst6.item(0);
                    NodeList lstNm6 = lstNmElmnt6.getChildNodes();
                    map.setTiles(((Node) lstNm6.item(0)).getNodeValue());
                }
            }
        } catch (ParserConfigurationException e) {
            logger.error("ParserConfigurationException: " + e);
        } catch (SAXException e) {
            logger.error("SAXException: " + e);
        } catch (IOException e) {
            logger.error("IOException: " + e);
        }
        return map;
    }
}

// MapXMLReaderTest.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import static org.junit.jupiter.api.Assertions.*;
import messages.global.MapInfo;

/**
* Test class of {@link MapXMLReader}.
* It contains ten unit test cases for the {@link MapXMLReader#readMap(File)} method.
*/
class MapXMLReaderTest {
		
		/**
		* Test case for {@link MapXMLReader#readMap(File)} method.
		* It tests if the method returns the correct