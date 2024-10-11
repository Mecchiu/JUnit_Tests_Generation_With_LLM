// SBMLFilter_0Test.java
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
* It contains one unit test case for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilter_0Test {
		/**
		 * Tests for file is accepted.
		 */
		@Test
		public void accept() throws IOException {
    		String[] expectedFileNames = new String[] { "sbml.xml", "sbml.sbml" };
    		File[] files = new File[] {new File(System.getenv("HOME") + "/files/sbml.xml"), 
				new File(System.getenv("HOME") + "/files/sbml.sbml")};

			for(int i = 0; i < files.length; i ++) {
				for(String expectedFileName : expectedFileNames) {
					File testFile = files[i];
					GraphReader reader = getReader(expectedFileName);
					if(reader!= null) {
						assertTrue("File is not expected: " + expectedFileName, reader.accept(testFile));
					} else {
						assertFalse("File has no reader", testFile.isDirectory());
						assertTrue("File does not seem to be a file", testFile.getName().toUpperCase().endsWith(expectedFileName.toUpperCase()));
					}
				}
			}
    }
}