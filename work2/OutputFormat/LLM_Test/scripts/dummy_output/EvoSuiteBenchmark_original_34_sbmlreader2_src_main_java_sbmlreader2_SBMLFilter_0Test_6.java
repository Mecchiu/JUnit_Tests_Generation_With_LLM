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
    public void test() throws IOException {
	cyFile("sbml", "xml");	// test with file extension "xml"

	cyFile("sbml", "sbml");	// test with both file extension and file extension
    }

    @Test
    public void test_fileFilter() throws IOException {
        cyFile("", "xml");
        cyFile("sbml.xml", "xml.sbml"); // no file extension
        cyFile("sbml.sbml", "sbml"); // no extension
    }

    private void cyFile(String fileExtension, String filterExtension)
            throws IOException {

	File f = new File("graphs");
    	File dir = f.getParentFile();
    	
    	File[] files = dir.listFiles(new String[] {"sbml.xml", "sbml.sbml"});

	if ((files!= null) && (files.length > 0)) {
	    for (int i = 0; i < files.length; i ++) {
	        File f = files[i];
	        assertEquals(f.getName(), fileExtension);
	    }
	}
	else {
	    fail("There was no graph: " + f.getName());
	}

	// test with the filter extension
	f = new File("graphs", "sbml.xml");
	files = dir.listFiles(new String[] {"sbml.xml", "sbml.sbml"});

	if ((files!= null) && (files.length > 0)) {
	    for (int i = 0; i < files.length; i ++) {
	        File f = files[i];
		assertEquals(fileExtension, f.getName());
	    }
	}
	else {
	    fail("There was no graph: " + f.getName());
	}

	// test with no filter extension
	f = new File("graphs", "/sbml.xml");
	files = dir.listFiles(new String[] {"sbml.xml", "sbml.sbml"});

	if ((files!= null) && (files.length > 0)) {
	    for (int i = 0; i < files.length; i ++) {
	        File f = files[i];
		assertEquals(fileExtension, f.getName());
	    }
	}
	else {
	    fail("There was no graph: " + f.getName());
	}

	//test with non valid extension
	f = new File("graphs", "sbml-");
	files = dir.listFiles(new String[] {"sbml-xml", "sbml-"});

	if ((files!= null) && (files.length > 0)) {
	    for (int i = 0; i < files.length; i ++) {
	        File f = files[i];
		assertEquals(fileExtension, f.getName());
	    }
	}
	else {
	    fail("There was no graph: " + f.getName());
	}
    }
}