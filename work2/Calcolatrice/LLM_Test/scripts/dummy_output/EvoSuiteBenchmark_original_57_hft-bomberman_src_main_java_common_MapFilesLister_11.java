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
* It contains one unit test case for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {
		// List of files in test case
    private static final String FILE = "testdata.map";
    // File where test-files are stored
    private static File mapFile;
    // MapInfo objects from the test-data.map
    private static Vector<MapInfo> mapInfoVector;
    // List of found File to be checked by this test-case-execution
    private Vector<File> foundFiles;
    // The current Test-Case-Execution
    private static final String TEST_CASE_EXECUTION = "test-case";
    /**
     * empty {@link Vector}
     *
     * @return empty Vector<Boolean>
     */
    public Vector<Boolean> emptyList();
    // Check whether a File is still there
    public boolean fileIsThere(String file);
    /**
     * Create a list of available MapInfo objects
     *
     * @return String
     */
    public List<MapInfo> initListOfMapInfo();
    /**
     * add {@link MapInfo} to the previous list of MapInfo objects
     *
     * @param mapInfo - {@link MapInfo} object
     * @return int - number of added objects
     */
    public int addToLast(MapInfo mapInfo);
    /**
     * Add all File object into a list of found File objects
     *
     * @param file
     *            File object to be added
     * @return integer - return the number of added Object
     */
    public int addToList(File file);
    /**
     * get the number of files that were found
     *
     * @return Integer
     */
    public int getFoundFilesNumber();
    /**
     * add a file into a list of found File objects
     *
     * @param path
     *            File to be added
     */
    public void addToList(String path);
    /**
     * add a list of MapInfo objects for test-case execution
     *
     * @param mapInfos
     *            Vector<MapInfo> object
     */
    public void addToList(Vector<MapInfo> mapInfos);
    /**
     * set the list of found files to the given list. Can be used for testing only
     *
     * @param fileList
     *            List<File>
     */
    public void setFoundFiles(Vector<File> fileList);
    /**
     * clear File object that was previously added
     */
    public void clearFile();
    /**
     * clears the list of found map-info.
     * Can be used for testing only
     */
    public void clearList();
    /**
     * clear the list of map-info that was previously added
     * Can be used for testing only
     */
    public void clearList();
    /**
     * sets the list of found map-info. Can be used for testing only
     *
     * @param mapInfos
     *            Vector<MapInfo>
     */
    public void setListOfMapInfos(Vector<MapInfo> mapInfos);
    /**
     * clear the list of File object that was previously added
     * Can be used for testing only
     *
     * @param fileList
     *            List<File>
     */
    public void clearListOfFile(Vector<File> fileList);
    /**
     * Set the file where map-info were last updated
     * Can be used for testing only
     *
     * @param file
     *            File
     */
    public void setLastUpdated(File file);
    /**
     * clears all File object that was added recently
     */
    public void clearLastUpdated();
    /**
     * read the list of map-info from given File
     *
     * A new List of MapInfo is read from given File. Can be used for testing only
     *
     * @param file
     *            File
     * @return Vector
     */
    public Vector<MapInfo> readListFromFile(File file);
    /**
     * Clear map-info data before a test-case execution
     */
    public void clearListOfMapInfos();
    /**
     * Set the map-info data before a test-case execution
     *
     * @param mapInfos
     *            Vector<MapInfo>
     */
    public void setListOfMapInfos(Vector<MapInfo> mapInfos);
    public boolean getMapInfoListInitialized();
    /**
     * return a list with all map-info objects that were read by the previous test-case execution
     * that matches the given String
     *
     * @param file
     */
    public List<MapInfo> getListOfMapInfos(String path);
    public void setMapInfo(MapInfo mapInfo);
    public MapInfo getMapInfo(int index);
}