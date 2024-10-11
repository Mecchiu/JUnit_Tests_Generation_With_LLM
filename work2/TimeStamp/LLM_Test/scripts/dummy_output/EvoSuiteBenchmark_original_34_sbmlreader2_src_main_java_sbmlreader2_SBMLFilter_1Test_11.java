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
		  * Test method for {@link SBMLFilter#getReader(String)}
		  */
		  @Test
		  public void testGetReader(String fileName) {
		    	 
		    	// get reader object
		    	File xml_in = new File(fileName + ".xml");
		    	
		      // get reader object 
		    	ImportHandler importHandler = new ImportHandler();
		    	GraphReader reader = importHandler.getReader(xml_in);
		    	
		    	// test if reader exists
		    	assertNotNull(reader);
		    	
		        // test if reader has correct extension
		        assertTrue(new SBMLFilter().accept(xml_in));
		    }
}