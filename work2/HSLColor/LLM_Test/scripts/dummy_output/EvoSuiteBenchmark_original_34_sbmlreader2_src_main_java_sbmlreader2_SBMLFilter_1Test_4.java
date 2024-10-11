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
	  * Test of accept method for GraphReader.
	  */
	@Test
    public void testAccept() {
        System.out.println("-- testAccept");
		File file = new File("src/test/resources/xml.xml");
		boolean accept = false;
		
		try {
			System.out.println("FileName: " + file.getName());
			//assertFalse("The filter accepts file",this.accept(file));
			accept = this.accept(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertTrue("The filter accepts",accept);
    }
}