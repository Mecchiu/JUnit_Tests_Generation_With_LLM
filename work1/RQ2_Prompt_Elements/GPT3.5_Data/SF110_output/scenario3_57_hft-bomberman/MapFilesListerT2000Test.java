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

    /**
     * reads directory and returns a list of found xml-files
     *
     * @param dir -
     *            directory to be searched in
     * @return Vector<File>
     */
    public Vector<File> listMaps(String dir) {
        File directory = new File(dir);
        Vector<File> mapFiles = new Vector<File>();
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".xml")) {
                    mapFiles.add(file);
                }
            }
        }
        return mapFiles;
    }
}

// MapFilesListerTest.java
package common;

import java.io.File;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapFilesLister}.
* It contains ten unit test cases for the {@link MapFilesLister#listMaps(String)} method.
*/
class MapFilesListerTest {
    
    @Test
    void testListMapsReturnsEmptyVectorWhenDirectoryIsEmpty() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/empty_directory");
        assertTrue(mapFiles.isEmpty());
    }
    
    @Test
    void testListMapsReturnsEmptyVectorWhenDirectoryDoesNotExist() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/non_existing_directory");
        assertTrue(mapFiles.isEmpty());
    }
    
    @Test
    void testListMapsReturnsEmptyVectorWhenDirectoryContainsNoXmlFiles() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/no_xml_files_directory");
        assertTrue(mapFiles.isEmpty());
    }
    
    @Test
    void testListMapsReturnsVectorWithOneFileWhenDirectoryContainsOneXmlFile() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/one_xml_file_directory");
        assertEquals(1, mapFiles.size());
    }
    
    @Test
    void testListMapsReturnsVectorWithMultipleFilesWhenDirectoryContainsMultipleXmlFiles() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/multiple_xml_files_directory");
        assertEquals(3, mapFiles.size());
    }
    
    @Test
    void testListMapsReturnsOnlyXmlFiles() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/mixed_files_directory");
        for (File file : mapFiles) {
            assertTrue(file.getName().endsWith(".xml"));
        }
    }
    
    @Test
    void testListMapsReturnsAbsolutePaths() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/one_xml_file_directory");
        for (File file : mapFiles) {
            assertTrue(file.isAbsolute());
        }
    }
    
    @Test
    void testListMapsReturnsFilesWithCorrectNames() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/multiple_xml_files_directory");
        for (File file : mapFiles) {
            assertTrue(file.getName().matches("map[1-3]\\.xml"));
        }
    }
    
    @Test
    void testListMapsReturnsFilesWithCorrectParentDirectory() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/multiple_xml_files_directory");
        for (File file : mapFiles) {
            assertEquals("test/resources/multiple_xml_files_directory", file.getParent());
        }
    }
    
    @Test
    void testListMapsReturnsFilesWithCorrectAbsolutePath() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> mapFiles = mapFilesLister.listMaps("test/resources/multiple_xml_files_directory");
        for (File file : mapFiles) {
            assertEquals(new File("test/resources/multiple_xml_files_directory", file.getName()).getAbsolutePath(), file.getAbsolutePath());
        }
    }
}