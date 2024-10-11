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
// TreeBuilder.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 * Build an XTree from a SAX2 event stream, or by parsing an XML document.
 *
 * The TreeBuilder ensures that the tree will not have two adjacent Text nodes.
 */
public class TreeBuilder implements ContentHandler, ErrorHandler {

    public static InputSource fileToInputSource(File file) throws FileNotFoundException, IOException {
        // we should use File.toURL() here, but it's Java2
        String absPath = file.getCanonicalPath().replace(File.separatorChar, '/');
        String systemId = "file:" + ((absPath.charAt(0) == '/')? "//" : "///") + absPath;
        if (!file.isFile())
            throw new FileNotFoundException(systemId);
        return new InputSource(systemId);
    }
}

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
		TreeBuilder builder;

		public TreeBuilder_0Test(TreeBuilder builder) {
			this.builder = builder;
		}

		@Test
		void canParseStreamFromFile() throws Exception {
			final InputSource inputSource1 = fileToInputSource(new File("src/nu/staldal/xtree/test/data/filetree.xml"));
			final InputSource inputSource2 = fileToInputSource(new File("src/nu/staldal/xtree/test/data/filetree1.xml"));

			builder.fileToInputSource(inputSource1);
			builder.fileToInputSource(inputSource2);

			final List<String> nodes = getNodes(this.builder.inputSource.getSystemId());
			assertEquals(3, nodes.size());
			assertTrue(nodes.size() > 0);
			boolean first = true;
			for (String node : nodes) {
				if (!first) {
					assertNotNull(node);
					assertNotNull(builder.getNode(builder.builder.getRoot(), node));
				}
				first = false;
			}
		}
}

// TreeBuilder_0.java
