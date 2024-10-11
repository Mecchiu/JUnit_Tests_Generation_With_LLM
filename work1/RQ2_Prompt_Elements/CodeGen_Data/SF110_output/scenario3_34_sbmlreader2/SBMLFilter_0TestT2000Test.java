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
    public boolean accept(File file);
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
		
	@Test
	void testAccept(){
	         
 		assertTrue(File.separatorChar == '/' && File.separatorChar == '\\', "File separator char");
 		assertTrue(File.separatorChar!= '/' && File.separatorChar!= '\\', "File separator char");
 		assertTrue(File.separatorChar == '\\', "File separator char");

        //TODO check if / and \ character is not replaced by \:
 		assertTrue(File.separatorChar!= '/') && File.separatorChar!= '\\', "File separator char");
 		assertTrue(File.separatorChar == '/');
 		assertTrue("\\".equals(File.separatorChar, "/"), "File separator char");


        //TODO check if \: is replaced by \
             assertTrue(File.separatorChar == '\\' && File.separatorChar == '/', "File separator char");
 		assertTrue(File.separatorChar!= '\\' && File.separatorChar!= '/', "File separator char");
 		assertTrue(File.separatorChar == '\\');
 		
 	}
}


// End SBMLFilter_0Test.java