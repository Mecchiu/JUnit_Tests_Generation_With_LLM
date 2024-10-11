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
		

//        private MapFilesListerTest() {
//        }
//
//        /**
//         * unit test method for {@link MapFilesLister#ListMaps(String)}.
//         */
//        @Test
//        public void testListMaps0() {

        final MapFilesLister listMaps = new MapFilesLister();

        /**
		 * List map information
		 */
        final List<MapInfo> listMapInfo = listMaps.ListMaps(fileName);

//		/**
//         * test return list map information object
//         */
//        List<MapInfo> listMaps = listMapInfo.asList();

//		System.out.println(listMaps.size());
//
//		/**
//         * check for 0 results
//         */
//		assertTrue(listMaps.size()== 0);
        
        logger.info("Number of maps retrieved: " + listMaps.size());

//        for (int i = 0; i < listMapInfo.size(); i++) {
//            logger.info("Map file: " + i );
//        }
//
//        logger.info("Number : " + listMapInfo.size());
        
        System.out.printf("Number of Map Files: %d\n", listMaps.getClass().getCanonicalName());
        
    }


}