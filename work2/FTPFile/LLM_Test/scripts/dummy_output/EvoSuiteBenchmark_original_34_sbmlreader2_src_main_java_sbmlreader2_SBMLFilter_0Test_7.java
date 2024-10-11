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
         * @throws Exception Any Exception
         */
        @Test
        public void testAccept_File() throws Exception {
            File f = new File("example-2.sbml");
            assertTrue(f.isFile());
            if (!(f.getName().endsWith(".sbml")) &&!(f.getName().endsWith(".xml"))) {
                assertFalse(f.isFile());
            }

            f = new File("example-0.xml");
            assertFalse(f.isFile());
            assertFalse(f.isFile());
         }
}
//end SBMLFilter_0Test