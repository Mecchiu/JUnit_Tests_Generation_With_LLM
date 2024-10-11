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
     * Tests the accept method of this SBMLFilter class.
     */
    @Test
    public void testAccept() throws IOException {
	//File file = new File("/home/matthias/cytoscape-samples/test/test_01_t1_0.xml");
	File file = new File("/home/matthias/cytoscape-samples/test/test_1_0_tbml_file.sbml");
	GraphReader gRd = getReader(file.getName());
	assertFalse("SBML is not available", gRd.isSBMLSupported());
    }

	/**
     * Tests the accept method of this SBMLFilter class.
     */
    @Test
    public void testFileExtension() {
	//File file = new File("/home/matthias/cytoscape-samples/test/test_01_t1_0.xml");
	File file = new File("/home/matthias/cytoscape-samples/test/test_1_0_tbml_file.sbml");
	GraphReader gRd = getReader(file);
	assertEquals("sbml only", "sbml", gRd.getType().getExtension());
    }

	/**
     * Tests the accept method of this SBMLFilter class.
     */
    @Test
    public void testFileNature () {
	//File file = new File("/home/matthias/cytoscape-samples/test/test_01_t1_0.xml");
	File file = new File("/home/matthias/cytoscape-samples/test/test_1_0_tbml_file.sbml");
	GraphReader gRd = getReader(file.getName());
	assertEquals("http://www.sbml.org", gRd.getType().getNamespace());

    }
}
