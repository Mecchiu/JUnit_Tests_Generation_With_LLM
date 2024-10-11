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
    public boolean accept(File file) {
        String fileName = file.getName();
        boolean firstPass = false;
        //  First test:  file must end with one of the registered file extensions.
        for (int i = 0; i < fileExtensions.length; i++) {
            if (fileName.endsWith(fileExtensions[i])) {
                firstPass = true;
            }
        }
        if (firstPass) {
            //  Second test:  file header must contain the biopax declaration
            try {
                String header = getHeader(file);
                if (header.indexOf("www.sbml.org") > 0) {
                    return true;
                }
            } catch (IOException e) {
            }
        }
        return false;
    }
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
     * Sets up test environment for this test class.
     * Creates a graph builder and connects to a new SBML server.
     *
     * @throws IOException when an error occurred.
     */
    @Test
    void setUpTest() throws IOException {
        File file = new File("src/java/sbml");
        setUpTestWithFile(file, true);
    }

    /**
     * Removes a file from the disk.
     *
     * @param file File that does not exist.
     * @throws IOException when an error occurred while attempting to remove the file.
     * @see File
     */
    @Test
    void unRemoveFile(File file) throws IOException {
        setUpTestWithFile(file, false);
        file.delete();
    }

    @Test
    void testSetUpBeforeCreate() throws Exception {
        File file = new File("src/java/sbml");
        setUpTestWithFile(file, true);
        ImportHandler importHandler = new ImportHandler();
        importHandler.setServerEndpoint("http://sbml-ws.sandia.gov:80/biopax");
        importHandler.setBaseDirectory("/cytoscape/data");
        GraphReader graphReader = new GraphReader(importHandler);
        
        SBMLBuilder builder = new SBMLBuilder(graphReader, 30);
        builder.setIgnoreUnsupportedEntities(true);
        builder.open();
        
        assertNotNull("Expected to get a graph while the SBML is running before we get it.", graphReader.getGraph());
        assertNull("Got a valid graph!", graphReader.getGraph());
        
        builder.close();
    }
    
    @Test
    void testSetUp() throws Exception {
        //TODO
        return;
    }
}
