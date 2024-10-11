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
     * Tests method {@link MapFilesLister#ListMaps(String)}
     *
     * @throws Exception
     *     TODO
     */
    @Test
    public void ListMapsTest() throws Exception {
        List<File> mapFiles = new LinkedList<File>();
        File file = MapFile.listFiles(this.getClass().getResource("/mapfiles.txt"));
        List<MapInfo> mapInfoList = MapInfo.getMapInfoList();

        File[] files = file.listFiles(MapInfoTestUtils::isMapFile);
        for (File f : files) {
            MapInfo mapInfo = MapInfoTestUtils.readMapInfo(f);
            mapInfoList.add(mapInfo);
        }

        List<File> newFileList = new LinkedList<File>();
        newFileList.add(file);

        logger.debug(String.format("*** Listing files ***%s\n", file));
        List<File> fileList = ListMaps(file.getAbsolutePath());
        assertEquals(mapFiles, fileList);
        assertEquals(mapInfoList, ListInfo.extractMapInfoList(files));
    }
}