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
		
	protected static final Logger logger = Logger.getLogger(MapFilesListerTest.class);

        private static String DESTINATION = "./temp";
        private static boolean TRUSTED = true;

		public static void main(String args[]) {
			
			initLogger();

			// set to true to have logger be created for testing
			TRUSTED = false;
			if (logger!= null) {
				logger.debug("Setting to UN TRUSTED");
				TRUSTED = false;
			} else {
				logger.debug("Couldn't set to UN TRUSTED...");
			}

			// Set the log4j level to DEBUG
        	System.setProperty("log4j.configuration", "verbose");

        	List<File> mapList = new LinkedList<>();

        	//
        	List<MapInfo> testResults = new LinkedList<>();

        	for (int i = 0; i < 3999; i++) {

        		File mapFile = new File(DESTINATION + File.separator + i);
        		System.out.println(i);
        		List<File> mapListCopy = new LinkedList<>(mapList);
        		List<MapInfo> mapListFinal = new LinkedList<>();

        		for (File mapFileCopy : mapListCopy) {

        			try {

        				MapInfo map = MapReader.getMapInfo(mapFileCopy.getAbsolutePath(), TRUSTED);
        				MapInfo map2 = MapReader.readMapInfo(mapFileCopy);

        				mapListFinal.add(map2);

        			} catch (Exception e) {
        				//logger.error("Error during read of map file ", e);
        			}

        		}

        		// create new list and add items.
        		mapList = new LinkedList<>();
        		mapList.addAll(mapListFinal);
        	}


        	logger.debug(mapList);
        	List<File> mapListToCompare = new LinkedList<>();

        	for (MapInfo map : mapList) {
        		if (map.getMapFile().getName().indexOf("preview") >= 0) {
        			mapListToCompare.add(map.getMapFile());
        		}
        	}
        	logger.debug(mapListToCompare);

        	if (logger.getLevel()!= Logger.getLogger("").levels[Logger.TRACE]) {
        		String msg = "MapList Test FAILED:"
        				+ " mapListToCompare  size=" + mapListToCompare.size()
        				+ " numMaps found ";

        		for (MapInfo map : mapListToCompare) {
        			msg += " " + map.getMapFile();
        		}

        		msg += " test " + i;
        		System.out.println(msg);
        	}

        	// cleanup
        	MapReader.delete(DESTINATION);

        	System.exit(0);
        }
}