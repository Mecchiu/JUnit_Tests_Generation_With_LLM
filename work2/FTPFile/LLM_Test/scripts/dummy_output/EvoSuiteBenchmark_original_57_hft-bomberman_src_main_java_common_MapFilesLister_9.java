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
		
    /**
     * test read a previously pre-created map list file and assert that all created directories are present
     */
    @Test
	public void CheckMapList_PreCreatedDirectoryShouldBePresent()
		throws Exception {

	    String file_path_to_list = "test-1.cwl";
	    List<File> list_files_precreated;
	    
	    // write maps that will be tested
	    MapInfo map_precreated =
		new MapInfo(
			"TestMap_PreCreatedDirectory", 
			0, 
			10000, 
			1000, 
			"",
			File.separator,
			"",
			"testfile2", 
			"",
			-1, 
			10000, 
			null, 
			null);
	    
	    // write map files
	    list_files_precreated =
		ListFiles(
			new File("test-2.json"),
			new File("test-1.cwl"),
			0, 0, 10000,
			"").toVector();
	    
	    // remove file1 from map with creation
	    list_files_precreated.remove(0);
	    
	    // write map list
	    MapFiles.createMapList(map_precreated, list_files_precreated);
	    
	    // verify existing map entries
	    List<MapInfo> list_maps = MapFiles.getMapList();
	    
	    assertNotNull(list_maps);
	    assertEquals(2, list_maps.size());
	    
	    List<File> list_files = 
		ListFiles(
			new File("test-2.json"),
			new File("test-1.cwl"),
			0, 0, 10000,
			"").toVector();
	    
	    // no map should be present
	    assertFalse(list_maps.remove(map_precreated));
	    boolean contains_map = false;
	    for (File f : list_files) {
		if (map_precreated.getMapInfo().getMetadata().getFileName().equals(f.getAbsolutePath())) this.equalsIgnoreCase(true, f);
		else {
		    contains_map = true;
		}
	    }
	    assertTrue(contains_map);
	    
	}
    
    /**
     * test read a previously precreated list files and assert that all created directories are present
     */
    @Test
	public void CheckMapList_AlreadyExistingDirectory(@SuppressWarnings("null") File currentDirectory, String expected_file)  // create new directory and remove files from it
		throws Exception {
	     String file_path_to_list = "test-1.cwl";
	     File fileToRemoveFrom = new File(currentDirectory, file_path_to_list);
	     List<File> listFilesToRemove;

	    // write maps that will be tested
	    MapInfo map_precreated =
		new MapInfo(
			"TestMap_AlreadyExistingDirectory", 
			0, 
			10000, 
			1000, 
			"",
			File.separator,
			"",
			"testfile2", 
			"",
			-1, 
			10000, 
			null, 
			null);
	    
	    // write map files
	    list_files_precreated =
		ListFiles(
			fileToRemoveFrom,
			new File("test-2.json"),
			0, 0, 10000,
			"").toVector();
	    
	    // remove file1 from map with creation
	    list_files_precreated.remove(0);
	    
	    // write map list
	    MapFiles.createMapList(map_precreated, list_files_precreated);
	    
	    // verify existing map entries
	    List<MapInfo> list_maps = MapFiles.getMapList();
	    assertNotNull(list_maps);
	    assertEquals(2, list_maps.size());
	    
	    List<File> list_files = 
		ListFiles(
			fileToRemoveFrom,
			new File("test-2.json"),
			0, 0, 10000,
			"").toVector();
	    
	    // no map should be present
	    assertFalse(list_maps.remove(map_precreated));
	    boolean contains_map = false;
	    for (File f : list_files) {
		if (map_precreated.getMapInfo().getMetadata().getFileName().equals(f.getAbsolutePath())) this.equalsIgnoreCase(true, f);
		else {
		    contains_map = true;
		}
	    }
	    assertTrue(contains_map);
	    
	}

	/**
	 * test read a pre-created map list and return it as a list
	 * @return
	 */
    public static List<File> ListMaps(String filePathInDirectoryToList)
    {
	Vector<File> vector_file =
	ListFiles(
			new File(""),
			new File(filePathInDirectoryToList),
			0, 0, 100,
			"").toVector();
		
	List<String> file_path_in_directory_to_map =
	LinkedList.fromVector(vector_file).remove(0);
	
	return vector_file;
    }
    
    /**
     * test read a map list from file list that contains a vector of files with paths for files with file ext
     * @return
     */
	public static List<File> ListMapInfoFilesList(String file_to_extract)
    {
	/**
	 * read a map list from one of available map files and add its entries to a new list
	 * @param file_list_with_files
	 * @return
	 */
	Vector<File> vector_return;
	File mapInfoFileListWithFiles = new File("test-5.cwm");
	File mapInfoFileListWithFile = new File(mapInfoFileListWithFiles,".json");
	
	MapInfo map_precreated;
	
	List<File> listFileWithFiles = ListFiles(map_infoFileListWithFile, file_to_extract,0,0,1,1,1,1,1000,map_infoFileListWithFiles);
		
}
}