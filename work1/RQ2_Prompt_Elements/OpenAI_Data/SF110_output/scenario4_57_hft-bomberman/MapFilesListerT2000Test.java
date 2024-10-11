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
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/empty");
		assertEquals(0, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file.
	 */
	@Test
	void testListMapsOneXmlFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFile");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile2() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile2");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile3() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile3");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile4() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile4");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile5() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile5");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile6() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile6");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile7() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile7");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile8() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile8");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile9() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile9");
		assertEquals(1, files.size());
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests the case when the directory contains only one xml file and one non-xml file.
	 */
	@Test
	void testListMapsOneXmlFileAndOneNonXmlFile10() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> files = mapFilesLister.ListMaps("src/test/resources/oneXmlFileAndOneNonXmlFile10");
		assertEquals(1, files.size());
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
        Vector<File> files = new Vector<File>();
        File directory = new File(dir);
        if (directory.isDirectory()) {
            File[] fileList = directory.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].getName().endsWith(".xml")) {
                    files.add(fileList[i]);
                }
            }
        }
        return files;
