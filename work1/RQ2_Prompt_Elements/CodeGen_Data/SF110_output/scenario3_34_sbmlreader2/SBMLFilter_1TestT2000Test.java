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
     * Tests file reading for SBML files.
     */
    @Test
    public void testBasic(){
        SBMLFilter f = new SBMLFilter();
        assertEquals(true,f.isValid(new File("SBML_Test.cy")));
    }
}
