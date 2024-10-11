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

	private static final String MAPS_DIR = "/data/mapfiles";
	private static Logger logger = Logger.getLogger(MapFileListerTest.class.getName());
	public MapFilesListerTest(){
	}
	

	/**
     * tests the {@link MapFilesLister#ListMaps(String)} method
     *
     * @throws Exception
     *
     * @author christian
     */
    @Test
    public void ListMapsTest() throws Exception {
        List<File> mapListFiles = ListMaps(MAPS_DIR);
        System.out.println("the number of maps read is " + mapListFiles.size());
        assertNotNull("null", mapListFiles);
    	assertTrue("list is empty", mapListFiles.size() > 0);
    	
    	for(File file: mapListFiles){
            logger.debug("read xml file: " + file.getName() );
        }
    	logger.error("list contains unread map info with class: " + classOfMap());
	}


}

