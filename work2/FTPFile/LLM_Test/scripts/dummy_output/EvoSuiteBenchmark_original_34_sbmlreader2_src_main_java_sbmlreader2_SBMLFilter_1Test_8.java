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
     * Test Constructor
     * No. 1 in class should be set a null object.
     */
    @Test
    public void TestConstructor_1() {
        assertNotNull("The object should not be null.", SBMLFilter.getReader(null));
    }

    @Test
    public void TestConstructor2() {
        SBMLFilter sbmlFilter = new SBMLFilter();
        assertTrue("The object should be not null.", sbmlFilter!= null);
    }

    @Test
    public void TestAccept_1() {
        SBMLFilter sbmlFilter = new SBMLFilter();
        boolean isAccepted = sbmlFilter.isAccepted(fileName);
        assertTrue("The file should be accepted.", isAccepted);
    }

    @Test
    public void TestAccept_2() {
        SBMLFilter sbmlFilter = new SBMLFilter();
        boolean isAccepted = sbmlFilter.isAccepted(fileName, fileNature);
        assertTrue("The file should be accepted.", isAccepted);
    }

    @Test
    public void TestAccept_3() {
        SBMLFilter sbmlFilter = new SBMLFilter();
        boolean isAccepted = sbmlFilter.isAccepted(fileName, fileNature, null);
        assertTrue("The file should be accepted.", isAccepted);
    }

    @Test
    public void testAccept_invalidFile() throws IOException {
        String file = new File("./C:/Users/Mat/workspaces/test/SBMLReader/sbml.sbml").getAbsolutePath() + "/C:/Users/Mat/workspaces/test/sbml/all.xml";
        boolean isAccepted = false;
        try {
            file = new File("./C:/Users/Mat/workspaces/test/SBMLReader/sbml.sbml").getAbsolutePath() + "/C:/Users/Mat/workspaces/test/sbml/all.xml";
            sbmlFilter.isAccepted(file, null, fileNature);
        } catch (Exception e) {
            assertTrue(true);
            isAccepted = true;
        }
        if (!isAccepted) {
            // No. 2 in line should be set a null object.
            boolean isNullObject[] = { false };
            sbmlFilter.isAccepted(file, null, fileNature, isNullObject);
            assertTrue("The object should be set a null object.", isNullObject[0]);
        }
    }

}
//SBMLFilter_1Test.java