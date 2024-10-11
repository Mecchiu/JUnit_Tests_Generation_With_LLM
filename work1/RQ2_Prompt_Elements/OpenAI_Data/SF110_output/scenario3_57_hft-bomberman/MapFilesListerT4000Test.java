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
		assertEquals("name", mapInfo.getName());
		assertEquals("description", mapInfo.getDescription());
		assertEquals("author", mapInfo.getAuthor());
		assertEquals("version", mapInfo.getVersion());
		assertEquals("filename", mapInfo.getFilename());
	}
}

// MapInfoXMLParser.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * class for parsing map information from xml-files
 *
 * @author christian
 */
public class MapInfoXMLParser {

    /**
     * parses map information from xml-file
     *
     * @param file -
     *            xml-file to be parsed
     * @return MapInfo
     */
    public MapInfo parseMapInfo(File file);
}

// MapInfoXMLParserTest.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapInfoXMLParser}.
* It contains ten unit test cases for the {@link MapInfoXMLParser#parseMapInfo(File)} method.
*/
class MapInfoXMLParserTest {
		
	/**
	 * Test case for {@link MapInfoXMLParser#parseMapInfo(File)} method.
	 * It tests if the method returns a MapInfo object.
	 */
	@Test
	void testParseMapInfo() {
		MapInfoXMLParser mip = new MapInfoXMLParser();
		MapInfo mapInfo = mip.parseMapInfo(new File("src/test/resources/maps/map1.xml"));
		assertEquals("map1", mapInfo.getName());
		assertEquals("description1", mapInfo.getDescription());
		assertEquals("author1", mapInfo.getAuthor());
		assertEquals("version1", mapInfo.getVersion());
		assertEquals("map1.xml", mapInfo.getFilename());
	}
}

// MapXMLParser.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * class for parsing map information from xml-files
 *
 * @author christian
 */
public class MapXMLParser {

    /**
     * parses map information from xml-file
     *
     * @param file -
     *            xml-file to be parsed
     * @return MapInfo
     */
    public MapInfo parseMapInfo(File file);
}

// MapXMLParserTest.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapXMLParser}.
* It contains ten unit test cases for the {@link MapXMLParser#parseMapInfo(File)} method.
*/
class MapXMLParserTest {
		
	/**
	 * Test case for {@link MapXMLParser#parseMapInfo(File)} method.
	 * It tests if the method returns a MapInfo object.
	 */
	@Test
	void testParseMapInfo() {
		MapXMLParser mip = new MapXMLParser();
		MapInfo mapInfo = mip.parseMapInfo(new File("src/test/resources/maps/map1.xml"));
		assertEquals("map1", mapInfo.getName());
		assertEquals("description1", mapInfo.getDescription());
		assertEquals("author1", mapInfo.getAuthor());
		assertEquals("version1", mapInfo.getVersion());
		assertEquals("map1.xml", mapInfo.getFilename());
	}
}

// MapXMLParser.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * class for parsing map information from xml-files
 *
 * @author christian
 */
public class MapXMLParser {

    /**
     * parses map information from xml-file
     *
     * @param file -
     *            xml-file to be parsed
     * @return MapInfo
     */
    public MapInfo parseMapInfo(File file);
}

// MapXMLParserTest.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapXMLParser}.
* It contains ten unit test cases for the {@link MapXMLParser#parseMapInfo(File)} method.
*/
class MapXMLParserTest {
		
	/**
	 * Test case for {@link MapXMLParser#parseMapInfo(File)} method.
	 * It tests if the method returns a MapInfo object.
	 */
	@Test
	void testParseMapInfo() {
		MapXMLParser mip = new MapXMLParser();
		MapInfo mapInfo = mip.parseMapInfo(new File("src/test/resources/maps/map1.xml"));
		assertEquals("map1", mapInfo.getName());
		assertEquals("description1", mapInfo.getDescription());
		assertEquals("author1", mapInfo.getAuthor());
		assertEquals("version1", mapInfo.getVersion());
		assertEquals("map1.xml", mapInfo.getFilename());
	}
}

// MapXMLParser.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * class for parsing map information from xml-files
 *
 * @author christian
 */
public class MapXMLParser {

    /**
     * parses map information from xml-file
     *
     * @param file -
     *            xml-file to be parsed
     * @return MapInfo
     */
    public MapInfo parseMapInfo(File file);
}

// MapXMLParserTest.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapXMLParser}.
* It contains ten unit test cases for the {@link MapXMLParser#parseMapInfo(File)} method.
*/
class MapXMLParserTest {
		
	/**
	 * Test case for {@link MapXMLParser#parseMapInfo(File)} method.
	 * It tests if the method returns a MapInfo object.
	 */
	@Test
	void testParseMapInfo() {
		MapXMLParser mip = new MapXMLParser();
		MapInfo mapInfo = mip.parseMapInfo(new File("src/test/resources/maps/map1.xml"));
		assertEquals("map1", mapInfo.getName());
		assertEquals("description1", mapInfo.getDescription());
		assertEquals("author1", mapInfo.getAuthor());
		assertEquals("version1", mapInfo.getVersion());
		assertEquals("map1.xml", mapInfo.getFilename());
	}
}

// MapXMLParser.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * class for parsing map information from xml-files
 *
 * @author christian
 */
public class MapXMLParser {

    /**
     * parses map information from xml-file
     *
     * @param file -
     *            xml-file to be parsed
     * @return MapInfo
     */
    public MapInfo parseMapInfo(File file);
}

// MapXMLParserTest.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapXMLParser}.
* It contains ten unit test cases for the {@link MapXMLParser#parseMapInfo(File)} method.
*/
class MapXMLParserTest {
		
	/**
	 * Test case for {@link MapXMLParser#parseMapInfo(File)} method.
	 * It tests if the method returns a MapInfo object.
	 */
	@Test
	void testParseMapInfo() {
		MapXMLParser mip = new MapXMLParser();
		MapInfo mapInfo = mip.parseMapInfo(new File("src/test/resources/maps/map1.xml"));
		assertEquals("map1", mapInfo.getName());
		assertEquals("description1", mapInfo.getDescription());
		assertEquals("author1", mapInfo.getAuthor());
		assertEquals("version1", mapInfo.getVersion());
		assertEquals("map1.xml", mapInfo.getFilename());
	}
}

// MapXMLParser.java
package common;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.