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
     * Test class of {@link SBMLFilter}.
     */
    public SBMLFilter_0Test() {
    }
    
    @Test
    public void test1() {
        String fileName = "sbml.v2.12";
        boolean firstPass = false;
        //  First test:  file must end with one of the registered file extensions.
        for (int i = 0; i < fileExtensions.length; i++) {
            if (fileName.endsWith(fileExtensions[i])) {
                if (firstPass) {
                    firstPass = false;
                } else {
                    firstPass = true;
                }
            }
        }
        File file = new File("C:\\Documents and Settings\\joe\\Desktop\\sbml.xml");
        ImportHandler importHandler = CytoscapeSystem.getImportHandler();
        importHandler.setCurrentFile(file.getName());
        GraphReader graphReader = new GraphReader("C:\\Documents and Settings\\joe\\Document Folders\\cytoscape\\src\\io\\sbml");
        SBMLReaderModel sbmlReaderModel = new SBMLReaderModel();
        sbmlReaderModel.setImportHandler(importHandler);
        assertEquals(sbmlReaderModel.loadExternal(file), true);
        assertEquals(sbmlReaderModel.loadExternal(file), false);
    }
    
    public String getHeader(File file) {
        String header = "";
        String line;
        try {
            header = ImportHandler.getHeader(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return header;
    }
    
}