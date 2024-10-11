package common;
java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.Vector;

import org.junit.jupiter.api.Test;

class MapFilesListerTest {

    @Test
    void testListMaps() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("test/maps");

        assertEquals(3, foundFiles.size());
        assertTrue(foundFiles.contains(new File("test/maps/map1.xml")));
        assertTrue(foundFiles.contains(new File("test/maps/map2.xml")));
        assertTrue(foundFiles.contains(new File("test/maps/map3.xml")));
    }

    @Test
    void testListMapsEmptyDirectory() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("test/empty");

        assertEquals(0, foundFiles.size());
    }

    @Test
    void testListMapsNoXmlFiles() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("test/no_xml");

        assertEquals(0, foundFiles.size());
    }

    @Test
    void testListMapsNonExistentDirectory() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("test/non_existent");

        assertEquals(0, foundFiles.size());
    }

    @Test
    void testListMapsNullDirectory() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps(null);

        assertEquals(0, foundFiles.size());
    }

    @Test
    void testListMapsSubDirectories() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("test/sub_directories");

        assertEquals(2, foundFiles.size());
        assertTrue(foundFiles.contains(new File("test/sub_directories/map4.xml")));
        assertTrue(foundFiles.contains(new File("test/sub_directories/map5.xml")));
    }

    @Test
    void testListMapsHiddenFiles() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("test/hidden_files");

        assertEquals(0, foundFiles.size());
    }

    @Test
    void testListMapsMixedFiles() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("test/mixed_files");

        assertEquals(2, foundFiles.size());
        assertTrue(foundFiles.contains(new File("test/mixed_files/map6.xml")));
        assertTrue(foundFiles.contains(new File("test/mixed_files/map7.xml")));
    }

    @Test
    void testListMapsInvalidDirectory() {
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> foundFiles = mapFilesLister.ListMaps("invalid_directory");

        assertEquals(0, foundFiles.size());
    }
}
