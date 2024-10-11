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
         * Testcase for SBMLFilter.accept
		 * 
         * @throws IOException  thrown if test fails
         * @throws XMLParseException   thrown if test fails
         */
        @Test
        void accept_0Test() throws IOException, XMLParseException {
        						
            final File testDataFolder = prepareTestData();
            
            importSBML(testDataFolder);
            
        	  final ImportHandler importHandlerObj = new ImportHandler(false);

        	  
            final File filterFile = importHandlerObj.getFile(null, null, testDataFolder);

        	  assertTrue(filterFile.exists());                       
        	  
        	  importHandlerObj.populateData(null, null, filterFile);        	

            final File outputFile = importHandlerObj.getOutputFile(null, null);
            
            assertTrue(outputFile.exists());                           
            
        	  System.out.println(outputFile.toURI().toString());   
        }
    
    
        /**
         * Testcase for SBMLFilter.accept
		 * @throws IOException  thrown if test fails
         * @throws XMLParseException   thrown if test fails
         */
        @Test
        void accept_1Test() throws IOException, XMLParseException {
        		
            // Test SBML Filter: no extensions
            final File filterFile = new File(".");
            final ImportHandler importHandlerObj = new ImportHandler(false);
            assertTrue(importHandlerObj.isAcceptFile(filterFile, true, false, fileExtensions, false),
                false);
            
        	  final ImportHandler importHandlerObj = new ImportHandler(false);

        	  final File filterFile = importHandlerObj.getFile(null, null, ".");       
                assertTrue(importHandlerObj.isAcceptFile(filterFile, true, false, fileExtensions, false), 
                    false);               
            }
        
}