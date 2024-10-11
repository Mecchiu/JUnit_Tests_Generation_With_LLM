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

    private static final String dir = "/map/home";
    private static final String mapName = "map";
    private static final String mapAux = ".map";
    private static final List<String> filesList = new LinkedList<String>();
    private static final Logger logger = Logger.getLogger(MapFilesLister.class);

	@Test
    public void listMapsTest() {
        List<MapInfo> mpList = ListMaps(dir);
        for(MapInfo mInfo : mpList) {
//            assertFalse(mInfo.isArchive(), "unsupported map type:" + mInfo.getType());
//            MapInfo mTemp =new MapInfo(mInfo.getFile().toString(), mapAux);
//            List<String> list = new LinkedList<String>();
//            list.add(mTemp.getFileName());
//            list.add(mTemp.getType());
//            if (mTemp.getAux().isEmpty()) {
//                list.add("");
//            } else {
//                for(String mTempAux : mTemp.getAux()) {
//                    list.add(mTempAux);
//                }
//            }
//            printList(list);
            filesList.add(mInfo.getFile().toString());
        }
        String currentIndex = this.filesList.toString();
        List<String> expected = VectorUtils.toStringVector(this.dir, "test" + mpList.size(), mapName);
        assertEquals(expected, currentIndex);
    }
	
	void printList(List<String> list) {
		for(String item : list){
			System.out.println("[" + item + "]");
		}
        System.out.println(list.toString());
	}
	

}
