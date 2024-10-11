// SBMLFilterTest.java
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
* It contains ten unit test cases for the {@link SBMLFilter#getReader(String)} method.
*/
class SBMLFilterTest {

	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.io.IOException
	 */
	@Test
	void testGetReader() throws IOException {
		System.out.println("getReader");
		String fileName = "";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}