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
     * Test of fileToInputSource(File) to set the tree as an XML document.
     * It tests a two-tuple situation: A File object is returned when no error occurs and the TreeBuilder constructs a
     * new XDocument, or when an error occurs and a new XML document is successfully created.
     *
     * The test data contains a single XML document which is not an XML document of any type.
     *
     * The test code was created from the XML file at src/test/resources/TreeBuilder_0.xml,
     * and is intended to be compared to a reference version of this file.
     */
	@Test
    public void testFileToInputSource() throws Exception {
		// File aFile = new File("src/test/resources/TreeBuilder_0.xml");
        URL url = getClass()
        	.getResource("/nu/staldal/xtree/TreeBuilder_0.xml");

    	InputSource inputSource = fileToInputSource(new File(url));

    	// File aFile = new File("src/test/resources/TreeBuilder_0.xml");
    	assertEquals(inputSource.getSystemId(), "src/test/resources/TreeBuilder_0.xml");

    	assertSame(inputSource, new InputSource(new InputStreamReader(inputSource.getInputStream())));
    	
    	assertNotSame(inputSource, new InputSource(new Reader("")));
	}

}