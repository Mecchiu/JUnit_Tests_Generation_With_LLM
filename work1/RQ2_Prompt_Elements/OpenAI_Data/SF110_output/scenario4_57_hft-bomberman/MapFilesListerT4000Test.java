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
	 * It tests the case when the directory is empty.
	 */
	@Test
	void testListMapsEmptyDirectory() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/empty");
		assertEquals(0, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file.
	 */
	@Test
	void testListMapsOneMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFile");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFile");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFile");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectory() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectory");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFile");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFile");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectory() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectory");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile");
		assertEquals(3, mapFiles.size());
	}
}

// MapFilesLister.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;

/**
 * class for listing maps and returning map information
 *
 * @author christian
 */
public class MapFilesLister {

    private static final Logger logger = Logger.getLogger(MapFilesLister.class);

    public MapFilesLister() {
    }

    /**
     * reads directory and returns a list of found xml-files
     *
     * @param dir -
     *            directory to be searched in
     * @return Vector<File>
     */
    public Vector<File> ListMaps(String dir) {
        Vector<File> mapFiles = new Vector<File>();
        File directory = new File(dir);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile() && files[i].getName().endsWith(".xml")) {
                    mapFiles.add(files[i]);
                }
            }
        }
        return mapFiles;
    }

    /**
     * retrieve list of MapInfo objects
     *
     * @return
     */
    public List<MapInfo> getMapInfoList() {
        List<MapInfo> mapInfoList = new LinkedList<MapInfo>();
        Vector<File> mapFiles = ListMaps("maps");
        for (File mapFile : mapFiles) {
            MapInfo mapInfo = new MapInfo();
            mapInfo.setName(mapFile.getName());
            mapInfo.setPath(mapFile.getPath());
            mapInfoList.add(mapInfo);
        }
        return mapInfoList;
    }

    /**
     * clears unused or obsolete map preview files
     */
    public void clearPreviews() {
        Vector<File> mapFiles = ListMaps("maps");
        File directory = new File("previews");
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile() && files[i].getName().endsWith(".png")) {
                    boolean found = false;
                    for (File mapFile : mapFiles) {
                        if (mapFile.getName().equals(files[i].getName())) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        files[i].delete();
                    }
                }
            }
        }
    }
}

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
	 * It tests the case when the directory is empty.
	 */
	@Test
	void testListMapsEmptyDirectory() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/empty");
		assertEquals(0, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file.
	 */
	@Test
	void testListMapsOneMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFile");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFile");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFile");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectory() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectory");
		assertEquals(1, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFile");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFile");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectory() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectory");
		assertEquals(2, mapFiles.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one map file and one non-map file.
	 */
	@Test
	void testListMapsOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/oneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFileOneNonMapFileOneEmptyFileOneDirectoryOneMapFile");
		assertEquals(3, mapFiles.size());
	}
}

// MapFilesLister.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;

/**
 * class for listing maps and returning map information
 *
 * @author christian
 */
public class MapFilesLister {

    private static final Logger logger = Logger.getLogger(MapFilesLister.class);

    public MapFilesL