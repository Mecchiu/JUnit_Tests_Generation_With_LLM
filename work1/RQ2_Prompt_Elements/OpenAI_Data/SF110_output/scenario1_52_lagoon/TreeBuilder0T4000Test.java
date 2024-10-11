// TreeBuilderTest.java
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
* It contains ten unit test cases for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilderTest {

	@Test
	public void testFileToInputSource() throws Exception {
		File file = new File("test.xml");
		InputSource inputSource = TreeBuilder.fileToInputSource(file);
		assertEquals("file:///test.xml", inputSource.getSystemId());
	}
}