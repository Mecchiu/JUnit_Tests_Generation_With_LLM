// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {
		 
	/**
	 * Test that an empty tree is created.
	 */
	@Test
	public void emptyTreeIsNotCreated() {
		XTree tree = new TreeBuilder().build();
		assertEquals(0, tree.treeNodeCount());
	}
	
    /**
     * Set some XML-like information (e.g. a location)
     * in a separate test.
     */
	public void setUp() {
		System.setProperty("jaxb.encoding", "UTF-8");
	}
    	
	/**
     * Build an XML from a file.
     *
     * @param file the file
     * @throws FileNotFoundException if the file doesn't exist
     * @throws FileNotFoundException if some I/O error occurs
     */
	public void fileToInputSource(File file) throws FileNotFoundException, IOException {
		this.setUp();
		Document documentStream = new DocumentSource(documentToInputSource(new FileInputStream(file)));
 		assertTrue("File must exist.", file.exists());
		
		TreeBuilder builder = new TreeBuilder();
		builder.setRootElement(documentStream);
    	builder.setErrorHandler(new ErrorHandler() { 
 			public void warning(SAXParseException exception) { assertEquals("Warning", exception.getSystemId()); } 
 			public void error(SAXParseException exception) { assertEquals("Error", exception.getSystemId()); } 
 			public void fatalError(SAXParseException exception) { assertEquals("Fatal Error", exception.getSystemId()); } 
                public void end(EOLEvent event) { assertEquals("", exception.getSystemId()); }
            });
    	builder.build();
	}
		
}