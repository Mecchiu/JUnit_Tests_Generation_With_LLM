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
* It contains ten unit test cases for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {
		
		private static final Logger logger = Logger.getLogger(MapFilesListerTest.class);
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files in the given directory.
		*/
		@Test
		void testListMaps() {
				MapFilesLister mapFilesLister = new MapFilesLister();
				Vector<File> files = mapFilesLister.ListMaps("src/test/resources/maps");
				assertEquals(2, files.size());
		}
}