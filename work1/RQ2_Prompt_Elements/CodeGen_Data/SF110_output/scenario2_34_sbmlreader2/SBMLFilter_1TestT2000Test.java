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
     * Gets the appropirate GraphReader object.
     * If the libsbml is not available use the old sbml library.
     *
     * @author Matthias Koenig
     * @param fileName File Name.
     * @return GraphReader Object.
     */
    public GraphReader getReader(String fileName) {
        System.out.println("Getting SBML reader...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            return new SBMLGraphReader2(fileName);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            return new SBMLGraphReader(fileName);
        }
    }
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
     * This constructor checks the class integrity.
     * An error message should be reported if an object of class "SBMLFilter_1Test" is created with invalid parameters.
     */
    public SBMLFilter_1Test() {
    	// This test class uses standard SBML library (libSBML) and does not call any super
    	// super constructor of 'FileFilter' class
        System.out.println("\nTest class is an empty class...");
    }

    /**
     * This test class runs it with no SBML library and checks that every parameters of class
	 * "SBMLFilter_1Test" are correct.
	* It performs tests that use the new library functionality.
     * If a wrong parameter was passed to the test constructor an error message will be generated.
     */
    @Test
	public void testGetReaderSBML()
			throws IllegalAccessException, IllegalArgumentException, NoSuchMethodException, IOException, InstantiationException, ClassNotFoundException {
           File fOut = new File("test.sbml");

           // In the first step of the test the class SBMLFilter class will be loaded as default graph class
			ImportHandler.loadGraphFactory("org.sbml.sbml.sbmlj.SBMLGraph");
		    ImportHandler.importSBMLGraph(fOut, "org.sbml.sbml.jsbml", new File("test.jsbml"));
            
           // If first step failed an error message will be reported.
           if (!new SBMLGraphReader(fOut).getClass().equals(GraphReader.class)) {
             System.out.println("The first step of the test was not well-formed.\n"
                                + "Was expecting a good SBML GraphReader but got:"); //$NON-NLS-1$
             System.out.println(new SBMLGraphReader( fOut ).getClass().getCanonicalName());
             System.out.println(System.getProperty("user.home")
                                + "/.sbml/unittestData/sbml/sbml/"); //$NON-NLS-1$
             assertTrue("Failed to load SBML graph from test.jsbml",false);
             fail("Failed to load SBML graph from test.jsbml");
           }
       }
}

