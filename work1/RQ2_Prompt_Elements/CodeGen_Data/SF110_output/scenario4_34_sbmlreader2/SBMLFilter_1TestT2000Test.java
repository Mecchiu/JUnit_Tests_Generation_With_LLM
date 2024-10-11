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
// SBMLFilter.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;

/**
 * SBMLReader extends CyFileFilter for integration into the Cytoscape ImportHandler
 * framework.
 */
public class SBMLFilter extends CyFileFilter {

    /**
     * XGMML Files are Graphs.
     */
    private static String fileNature = ImportHandler.GRAPH_NATURE;

    /**
     * File Extensions.
     */
    private static String[] fileExtensions = { "xml", "sbml" };

    /**
     * Filter Description.
     */
    private static String description = "SBML files";

    /**
     * Constructor.
     */
    public SBMLFilter() {
    }

    /**
     * Indicates which files the SBMLFilter accepts.
     * <p/>
     * This method will return true only if:
     * <UL>
     * <LI>File ends in.xml or.sbml;  and
     * <LI>File headers includes the www.sbml.org namespace declaration.
     * </UL>
     *
     * @param file File
     * @return true or false.
     */
    public boolean accept(File file);

    /**
     * Gets the appropirate GraphReader object.
     * If the libsbml is not available use the old sbml library.
     *
     * @author Matthias Koenig
     * @param fileName File Name.
     * @return GraphReader Object.
     */
    public GraphReader getReader(String fileName);
}

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
		 * Tests the behaviour of the sbmlFilter.
		 *
		 * @throws IOException Exception
		 */
        @Test
        void testGetReader() throws IOException {
            assertNotNull(getReader("TEST_TASKS_XML.xml"),
                "Failed to find reader for the XML file");
            assertNotNull(getReader("TEST_TASKS_SAX.sbml"),
                "Failed to find reader for the SBML file");
            assertNotNull(getReader("TEST_TASKS_SBML.sbml"),
                "Failed to find reader for the SBML file");
            assertNotNull(getReader("TEST_TASKS_XGMML.xml"),
                "Failed to find reader for the XGMML file");
            assertNotNull(getReader("TEST_TASKS_XGMML.xz"),
                "Failed to find reader for the XGMML file");
            assertNotNull(getReader("TEST_TASKS_KML.xml"),
                "Failed to find reader for the KML file");
            assertNotNull(getReader("TEST_TASKS_KML.xz"),
                "Failed to find reader for the KML file");
            assertNotNull(getReader("TEST_TASKS_KML.kml"),
                "Failed to find reader for the KML file");
            assertNull(getReader("TEST_TASKS_KML.sbml"),
                "Failed to find reader for the SBML file");
            assertNull(getReader("TEST_TASKS_XGMML.xz"),
                "Failed to find reader for the XGMML file");
            assertNull(getReader("TEST_TASKS_XGMML.kzl"),
                "Failed to find reader for the XGMML file");
            assertNull(getReader("TEST_TASKS_SAX.sbml"),
                "Failed to find reader for the SAX file");
            assertNull(getReader("TEST_TASKS_SAX.xz"),
                "Failed to find reader for the SAX file");
            assertNull(getReader("TEST_TASKS_SAX.kzl"),
                "Failed to find reader for the SAX file");
            assertNotNull(getReader("TEST_TASKS_SAX.sbml"),
                "Failed to find reader for the SBML file");
            assertNull(getReader("TEST_TASKS_SBML.sbml"),
                "Failed to find reader for the SBML file");
            assertNull(getReader("TEST_TASKS_XGMML.xz"),
                "Failed to find reader for the XGMML file");
            assertNull(getReader("TEST_TASKS_XGMML.kzl"),
                "Failed to find reader for the XGMML file");
            assertNotNull(getReader("TEST_TASKS_SAX.xz"),
                "Failed to find reader for the SAX file");
            assertNull(getReader("TEST_TASKS_SAX.sbml"),
                "Failed to find reader for the SAX file");
            assertNotNull(getReader("TEST_TASKS_KML.xz"),
                "Failed to find reader for the KML file");
            assertNull(getReader("TEST_TASKS_KML.kzl"),
                "Failed to find reader for the KML file");
        }
}
