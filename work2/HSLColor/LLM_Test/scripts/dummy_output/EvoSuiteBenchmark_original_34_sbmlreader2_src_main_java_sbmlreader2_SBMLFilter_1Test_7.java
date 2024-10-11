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
	 * Verify that the "www.sbml.org" namespace has been imported properly.
	 */
	@Test
	public void testGetReader() throws IOException
	{
		assertNotNull(getReader("www.sbml.org"));
	}
		
//	@Test
//	public void testImport() {


	/**
	 * The SBML import is an attempt to import an XML file as a graph.
	 *
	 * When the SBML import returns, ensure that the file has the urn URI of the imported
	 * graph.
	*/


//		{
//			// Try import
//			GraphReader r = getReader("xml");
//
//			// Import file
//			if (r!= null) {
//				GraphReader gr = getReader("testgraph");
//				r.import(true, true);
//
//				// Verify
//				assertTrue(importState);
//				assertTrue(importFile);
//				assertTrue(importRootName);
//				assertTrue(importRootXML);
//				assertTrue(importGraphModel);
//				assertTrue(importFileStatus);
//				assertTrue(importRootModel);
//
//				// Close reader
//				r.close();
//			}
//
//			// Close reader
//			r.close();
//		}
////		}
//			
//		if (r == null) {
////			throw new IllegalStateException("Test failed!");
//		}
//	}
}