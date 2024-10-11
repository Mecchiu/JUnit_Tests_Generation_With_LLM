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
		 * Test the <code>fileToInputSource</code> method.
		 */
		@Test
		public void testFileToInputSource() throws Exception {
						// TODO 1. Create a TestSuite-compatible with java.lang.
						new TreeBuilderTest_0().testFileToInputSource();
        }
}


// class TestTreeBuilder
public class TreeBuilderTest_0 {

    /**
    * Empty test
    */
    public void testFileToInputSource() {
        InputStream is = null;
        try {
            is = fileToInputSource("");
            fail("FileToInputSource returning null on empty String expected");
        }
        catch (FileNotFoundException ex) {
        }
        catch (IOException ex) {
        }
        
    }

}

// ObjectTree
public class ObjectTree extends TreeBuilder {

    /**
    * Empty constructor
    */
    public ObjectTree() {}

    /**
    * Empty constructor
    *
    * @param fileName the name of the XML input file to a file object.
    * @throws IOException if an I/O error occurs
    */
    public ObjectTree(String fileName) throws RuntimeException {
        super(fileName);
    }

}