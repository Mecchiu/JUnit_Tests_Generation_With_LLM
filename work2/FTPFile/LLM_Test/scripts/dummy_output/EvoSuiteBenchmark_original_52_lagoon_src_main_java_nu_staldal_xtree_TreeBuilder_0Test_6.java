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
		 * Unit test case for {@link TreeBuilder#fileToInputSource(File)}
		 * @throws IOException
		 * @throws SAXException
		 */
    @Test
    @org.junit.jupiter.api.Test
    void fileToInputSource() throws IOException, SAXException {
        final String testString =
        "<A>&#xB7;</A><X>&#xB3;</X>&lt;A&gt;&#xAA;<X&gt;&#xAA;</X&gt;<A>&#xB3;</A>&lt;"
                          + "&#xAA;&gt;";
		InputSource source = null;
        try (InputStream in = assertXMLStream(_TestDataFile, testString, Charset.forName("UTF-8"))) {
			source = FileInputSource.fileToInputSource(in);
		}
        assertNotNull(source);
        assertEquals(testString, new InputSource(source).toString());
        // Test TreeBuilder.java

        URL url = new URL("test");
        try (final java.io.FileOutputStream out =
                new java.io.FileOutputStream("test.xml")) {
            new OutputFormat(out, Charset.forName("UTF-8"))
           .writeObject(source, this);
        }

        try (InputStream in = assertXMLStream(out.getFile(), testString, Charset.forName("UTF-8"))) {
            source = FileInputSource.fileToInputSource(in);
            assertNotNull(source);
            assertEquals(testString, new InputSource(source).toString());
        }
    }
}