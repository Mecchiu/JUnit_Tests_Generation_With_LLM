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
	void testFileToInputSource() throws FileNotFoundException, IOException {
		File file = new File("/home/user/test.xml");
		InputSource inputSource = TreeBuilder.fileToInputSource(file);
		assertEquals("file:///home/user/test.xml", inputSource.getSystemId());
	}
}