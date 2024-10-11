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

	public static void assertMapInfoList(List<MapInfo> list) {
		for(MapInfo mapInfo : list) {
			logger.debug("Checking that '"+mapInfo.name+"' has '"+mapInfo.version+"' version, "
								+mapInfo.file.getAbsolutePath()+"' available!");
		}
		assertNotNull("List of maps wasn't null!", list);
		boolean isEmpty = list.isEmpty();
		assertTrue("List isn't empty", isEmpty);
	}
	
	@Test
	public void test() {
		
		System.out.println("List of maps found: ");
		List<MapInfo> list = getMapInfoList();
		for(MapInfo mapInfo : list) {
			System.out.println("Testing name "+mapInfo.name + " version "+ mapInfo.version);
		}
		System.out.println("Expected list of maps is " + listToString(list));
        assertMapInfoList(list);

	}

	private static String listToString(List <MapInfo> list) {
		StringBuilder stringBuilder = new StringBuilder("");

        stringBuilder.append("Name: " + list.get(0).name);
        stringBuilder.append("Version: " + list.get(0).version);

        stringBuilder.append("\n");
		for(MapInfo mapInfo : list) {

			stringBuilder.append("\t").append(mapInfo.name).append("\t\t").append(mapInfo.version)
					.append("\n");
		}

		return stringBuilder.toString();

	}
}