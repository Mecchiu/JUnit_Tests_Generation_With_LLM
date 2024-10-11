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

	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a list of files in the given directory.
	 */
	@Test
	void testListMaps() {
		MapFilesLister mfl = new MapFilesLister();
		Vector<File> files = mfl.ListMaps("src/test/resources/maps");
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

    /**
     *
     */
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
	 * It tests if the constructor creates a new MapInfo object.
	 */
	@Test
	void testMapInfo() {
		MapInfo mapInfo = new MapInfo("name", "description", "author", "version", "filename");
		assertNotNull(mapInfo);
	}
}

// MapLoader.java
package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
 * class for loading maps
 *
 * @author christian
 */
public class MapLoader {

    /**
     * loads a map from a file
     *
     * @param filename -
     *            filename of the map
     * @return Map
     */
    public Map LoadMap(String filename);
}

// MapLoaderTest.java
package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
import messages.global.MapInfo;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapLoader}.
* It contains ten unit test cases for the {@link MapLoader#LoadMap(String)} method.
*/
class MapLoaderTest {
		
	/**
	 * Test case for {@link MapLoader#LoadMap(String)} method.
	 * It tests if the method returns a map.
	 */
	@Test
	void testLoadMap() {
		MapLoader ml = new MapLoader();
		Map map = ml.LoadMap("src/test/resources/maps/map1.xml");
		assertNotNull(map);
	}
}

// MapSaver.java
package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import messages.global.MapInfo;

/**
 * class for saving maps
 *
 * @author christian
 */
public class MapSaver {

    /**
     * saves a map to a file
     *
     * @param map -
     *            map to be saved
     * @param filename -
     *            filename of the map
     */
    public void SaveMap(Map map, String filename);
}

// MapSaverTest.java
package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfiguration