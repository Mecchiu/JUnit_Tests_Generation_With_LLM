// SBMLFilter_1Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains one unit test case for the {@link SBMLFilter#getReader(String)} method.
*/
class SBMLFilter_1Test {
		/**
		* Tests the constructor for SBMLFilter.
		*/
	
	@Test
	public void testSbmlFilter() {
		
		checkEmpty();
		
		// read in SBML file with SBML file nature
        File testFile = getTestFile("example.xml");
		FileReader reader = getReader(testFile.getAbsolutePath(),"sbml");
		
		// create the graph reader for reading XML documents.
		ImportHandler importHandler = new ImportHandler(reader);
		
		// check the returned import handler object.
        assertEquals(importHandler.getFileName(), "example.xml");
		// set the supported file extensions
        importHandler.setSupportedFileExtensions(fileExtensions);
		
		// check the return type.
		assertEquals(GraphReader.class.getCanonicalName(), ImportHandler.GRAPH_NATURE);
		
	}
	
	
	/**
	 * This tests the getReader(String) method.
	 */
	@Test
	public void testSbmlFilterNonExistentFile() {
	
		File testFile = getTestFile("dummy.xml");
		try {
			getReader(testFile.getAbsolutePath(),"sbml");
			fail("Should throw an Exception.");
		} catch (IOException e) {
			if (e.getMessage().contains("File not found")) {
				return;
			} else {
				fail("Should have caught a IOException");
			}
		}
		
	}
	
	
	/**
	 * This tests the getReader(String) method.
	 * If the libsbml not available, try to use the old
	 * sbml library.
	 */
	@Test
	public void testSbmlFilterFile() {
		
		checkEmpty();
		
		File testFile = getTestFile("example.xml");
		FileReader reader = getReader(testFile.getAbsolutePath(),"sbml");
		String s = ((GraphReader) reader).getDescription();
		// test if the description is empty and we have
		// not read in the description yet.
    	assertTrue("SBML file has no description.",
    		!(s).isEmpty());
		
	}
		
}