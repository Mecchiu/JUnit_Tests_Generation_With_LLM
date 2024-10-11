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
		 * Test method for {@link sbmlreader2.SBMLFilter#accept(java.io.File)}.
		 *
		 * @throws IOException IOException
		 */
		@Test
		public void testAcceptFile() throws IOException {
			// Get GraphReader.
			GraphReader gr = getReader("test");
			GraphReader.GRAPH_READER.setNamespaceDeclaration(true);
			GraphReader.GRAPH_READER.reloadPreferredGraphTypes();

			// Now test all the file extensions.
			for (String ef : fileExtensions) {
				String fileString = file.getAbsolutePath() + "/" + fileName + "." + ef;
				assertTrue("File " + ef + " not found and should have failed",
						gr.accept(new File("." + ef)));
				assertFalse(
						"File " + ef + " found but should have failed",
						gr.accept(new File(fileString)));
			}
		}
}