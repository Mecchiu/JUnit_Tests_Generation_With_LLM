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
		
	@Test
    public void testGetReader() {		
		GraphReader reader = SBMLFilter.getReader("Test1");
		assertEquals("Test1", reader.getFileName());
		
		GraphReader reader2 = SBMLFilter.getReader("Test2");
		assertEquals("Test2", reader2.getFileName());
	}
	
	
	@Test(expected = org.junit.jupiter.api.Assertions.Error.class)
	public void testGetReader_withFileName() {
	//noinspection ResultOfMethodCallIgnored
		SBMLFilter.getReader("Test1");
	}
}