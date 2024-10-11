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
		
    @Before
    public void setUp() throws Exception {
        testFile = new File("/Users/mschroeder/Documents/SBMLTESTING/sbml/file_1.xml");
        assertTrue("Input file should be a sbml XML file.", 
				File.separatorChar == '/');
    }
			
    @Test
    public void test_accept() {
        // test
        // get the same reader to test using old libsbml 
        assertNotNull("sbml reader expected",
                    getReader(testFile.getCanonicalFile()));

    }
		
    @Test
    public void test_accept_file_wrong_nature() {
        // test File
        // set the wrong nature for the reader in the File
        String wrongNature = "https://cythong.org/sbml/file/";
        GraphReader reader = getReader(testFile.getCanonicalFile());
       if (reader.getFileNature() == null) {
           reader.setFileNature(wrongNature);
       }

        // test File
        assertNotNull("reader set for correct nature",
                     getReader(testFile.getCanonicalFile()));

    }
		
    @Test
    public void test_accept_file_invalid_nature() {
        // test File
        // set the nature for the reader in the File
        String nature = "Invaild Nature";
        GraphReader reader = getReader(testFile.getCanonicalFile());
        if (reader.getFileNature() == null) {
            reader.setFileNature(nature);
        }

        // test File
        assertNotNull("reader set for invalid nature",
                     getReader(testFile.getCanonicalFile()));

    }

    private GraphReader getReader(File file)
            throws ImportHandler.FileNotFoundException {
        assertTrue("File name should be XML: "+ testFile.getName(),
                file.isFile() && file.getName().toString().equals("xml") );
        
        ImportHandler.GraphParseHandler parser = 
                new ImportHandler.GraphParseHandler();
        return parser.readGraph("sbml", file, fileExtensions[0], fileNature);
    }

}// SBMLFilter_0Test.java