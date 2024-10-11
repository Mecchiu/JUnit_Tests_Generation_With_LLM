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
		@Test
		public void ListMaps__emptyVectorListList() {
			File folder = new File(".");
			String path = folder.getCanonicalPath();

			List<File> emptyList = new Vector<File>();
			List<File> result = new LinkedList<File>();

			// first test case: list the files only
			List<File> testList = ListMaps(path);
			assertTrue("ListFiles() did not find any files", testList.size()!= 0);

			// second test case: check if the file list is not empty
			result = ListMaps(path);
			assertTrue("The list is empty", result.size()!= 0);
			
			assertTrue("The first test case" + result.get(0).getName() 
					+ " did not return expected list of File",
					equal(emptyList, result));
			logger.debug("Test finished");
		}

		@Test
		public void ListMaps__listOfFile() {
			File folder = new File(".");
			String path = folder.getCanonicalPath();

			List<File> listOfFile = new LinkedList<File>();
			File fileOne = new File("Map.properties");
			File fileTwo = new File("Map_Preview.properties");
			File fileThree = new File("Test_map.properties");

			listOfFile.add(fileOne);
			listOfFile.add(fileTwo);

			listOfFile.addAll(ListMaps(path));

			List<File> result = ListMaps(path);
			int i = 0;
			for (File file : listOfFile) {
				assertTrue("The file " + file.getAbsolutePath() 
						+ " does not exist!", new File(path + File.separator
						+ file.getName()).exists());
				assertTrue("File: " + path + File.separator
						+ file.getName() + " does not return correct File object",
						file.equals(result.get(i)));
				assertTrue("File: " + path + "/" + file.getName() + " has 1st "
						+ "file: '" + path + File.separator + file.getName() + "'",
						i == 0);
				i++;
			}

			// third test case: check if map file is present
			result = ListMaps(path);
			for (File file : listOfFile) {
				assertTrue("The file " + file.getAbsolutePath() 
						+ " does not exist!", new File(path + File.separator
						+ file.getName()).exists());
			}
			assertTrue("Listfiles: " + result.get(0).getName() + " does not return correct file object.",
					result.get(0).getName().endsWith(".properties"));

			logger.info("Test finished");
		}

		@Test
		public void ListMaps__listOfFile_and_file() {
			File folder = new File(".");
			String path = folder.getCanonicalPath();

			List<File> listOfFileOne = new LinkedList<File>();
			File firstFile = new File("FirstFile.properties");
			File lastFile = new File("LastFile.properties");
			File firstFileOut = new File("firstFile.properties");

			listOfFileOne.add(firstFile);
			listOfFileOne.add(lastFile);
			listOfFileOne.addAll(ListMaps(path));

			List<File> result = ListMaps(path);
			assertTrue("The first and last files was not found.",
					result.contains(firstFileOut));

			assertTrue("The first and last files did not return correct File object",
					result.get(0).equals(firstFile));
			assertTrue("The first and last files did not return correct File object",
					listOfFileOne.contains((File) result.get(0)));

			assertTrue("The first and last files did not return correct File object",
					listOfFileOne.contains(lastFileOut));

			assertTrue("The first and last files did not return correct File object",
					result.contains(lastFile));

			assertTrue("The first and last files did not return correct and correct File object",
					firstFile.equals(firstFileOut) && firstFile.equals(lastFileOut));
			logger.info("Test finished");
		}
}