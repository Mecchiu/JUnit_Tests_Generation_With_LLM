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
		
    public SBMLFilter_1Test() {
    }
    
    /**
     * Test.
     */
    @Test
    public void test() {

        // Create the File
        File file = new File("sbmlxml/TestData/sbml.xml");

        // Create the GraphReader
        GraphReader graphReader = importGraphFile(file);


        // Indicate if the graph is readable
        boolean usable = graphReader.isDataImportable();

        // Indicate if the graph is readable
        boolean isGraphReadable = graphReader.isGraphReadable();


        // Check if "sbml_read" property of GraphReader is set to true
        try {
            assertTrue(usable);
        } catch (IOException ioe) {
            assertTrue(false);
        }
        
        // Check if "importMode" is set to true
        try {
            assertTrue(graphReader.getImportMode() == ImportHandler.importMode.IMPORT_MODE_VALIDATE);
        } catch (
                IOException ioe
        ) {
            
        }
        
        // Now check if the graph reader object is readable
        assertTrue(isGraphReadable);
        
        // Finally close the reader.
        graphReader.close();
    }

    /**
     * ImportGraphFile.
     *
     * @param file File.
     * @return GraphReader Object.
     * @throws IOException Any Exception.
     * @throws ClassNotFoundException Any Exception.
     */
    private GraphReader importGraphFile(File file) throws IOException, ClassNotFoundException {
        ImportHandler importHandler = new SBMLImportHandler();

        // Import the SBML XML into the JVM
        importHandler.importSBMLFromFile(file,fileNature,fileExtensions);

        return importHandler.getImportReader();
    }
    
    /**
     * SBMLImportHandler.
     *
     * @author Matthias Koenig
     */
    private static class SBMLImportHandler extends ImportHandler {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
         *
         * 
         */
		public SBMLImportHandler() {
        }

        /**
         *
         * 
         */
		public SBMLImportHandler(String name) {
            super(name);
        }

        /**
         *
         * 
         */
		public SBMLImportHandler(String name, String namespace, String... extensions) {
            super(name, namespace, extensions);
        }

		/**
         *
         * @param args
         * @throws IOException
         */
       public void importSBMLFromFile(File file,String fileNature, String[] fileExtensions) throws IOException {
            
            String fileName = file.getAbsolutePath();
            
            assertNotNull(fileName);
            
            // Check if the SBML XML is on the CLASSPATH
            assertTrue(fileName.toLowerCase().endsWith(".xml"));

            // Check if the file extensions are defined: [1,2,3]
            String[] theExtensionsArray = new String[fileExtensions.length];
            for (int i=0;i<theExtensionsArray.length;i++) {
                theExtensionsArray[i] = fileExtensions[i].substring(fileExtensions[i].lastIndexOf(".")+1, fileExtensions[i].length());
            }
            
            assertTrue(Arrays.asList(theExtensionsArray).containsAll(Arrays.asList(fileExtensions)));

            // Create a new GraphReader to read SBML XML
            GraphReader graphReader = new SBMLGraphReader();

            // Create a new GraphReader.addPropertyList.
            graphReader.addPropertyList();

            // Add a property from SBML XML.
            graphReader.getProperty().setSBML(fileName);
        }


    }
}