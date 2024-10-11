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
		private final SBMLGraphReader2 reader;
		/**
		 * Creates a {@link SBMLFilter_1Test} object.
		 * 
		 * @see testConstructor
		 * @param fileName	Input graph file to be examined.
		 * @throws IOException
		 */
		public SBMLFilter_1Test(String fileName) throws IOException {
			File f = new File(fileName);
			assertTrue(f.isFile(), "Input file not found: " + fileName);
			GraphReader graphReader = getReader(fileName);
			assertNotNull(graphReader, "No SBML reader configured");

            // create file handler
			ImportHandler importHandler = new ImportHandler((f.getParentFile()!= null)?
					f.getParentFile().getAbsolutePath() : "");
			importHandler.loadData(f.getAbsolutePath());
			System.out.println(f.getAbsolutePath());
			graphReader = new SBMLGraphReader( f.getAbsolutePath() );
			
			// create a new file parser
			ImportHandler2.setDefaultFileHandlerFactory( new org.cytoscape.io.importer.CyImportHandlerFactoryImpl( importHandler ) );
			GraphReader baseReader = new SBMLGraphReader( f.getAbsolutePath() );
            
			// add SBML library
			importHandler.addSBMLLibrary( baseReader );
			reader = new SBMLGraphReader2( baseReader );
		}
		
		/**
		 * Sets the number of iterations before the program
        * stops (i.e. calls {@link #finish()}).
        */
		@Test
        public void testFinish() {
            Thread th = new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep( 2000 );
                    } catch (InterruptedException e) {}
                    finish();
                }
            });
            th.start();
            
        }

}

