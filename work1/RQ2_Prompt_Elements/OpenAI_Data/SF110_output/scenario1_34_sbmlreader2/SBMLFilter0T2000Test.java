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
* It contains ten unit test cases for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilterTest {

	/**
	* Test of accept method, of class SBMLFilter.
	*/
	@Test
	void testAccept() {
		System.out.println("accept");
		File file = null;
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}