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
     * Test method for accept(File file)
     */
    @Test
    public void testAcceptOneFile() throws IOException {
        if (accept(new File("E:\\Project\\cytoscape\\cytoscape.xml") )) { return; }
        assertEquals(new File("E:\\Project\\cytoscape\\cytoscape.xml"),
            accept(new File("E:\\Project\\cytoscape.xml") ));
    }
    
    /**
     * Test method for accept(File file)
     */
    @Test
    public void testAcceptMultiFiles() throws IOException {
        if (accept(new File("E:\\cytoscape.xml"), new File("E:\\cytoscape.xml")) ) { return; }
        assertTrue(accept(new File("E:\\cytoscape.xml"), new File("E:\\cytoscape.xml")) );
    }

}