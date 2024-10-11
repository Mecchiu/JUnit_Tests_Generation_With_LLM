// XTreeUtil_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {
		
	/**
	 * The test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
	 * @throws IOException if there was some I/O error while reading the input.
	 */
	@Test
	void test() throws IOException {
		final String input = "<A a_attr = \"a\"/>";
		final InputSource source = new InputSource(new ByteArrayInputStream(input.getBytes()));
		final String result = XTreeUtil.parseXML(source, false, null, source);
		assertEquals("XTreeUtil.parseXML: Incorrect XML", input, result);
	}
}

/**
 * Generates a test {@link Element} with a specific type and xml:base.
 *
 * <pre>
 * &lt;A&gt;
 *     &lt;A a_attr = &quot;a&quot;&gt;
 *    ...
 * &lt;/A&gt;
 * </pre>
 *
 * @author Christian Johansen
 * @date 12.08.2011
 */
public class XTreeUtil_0GenerateElementTest
    extends ContentHandlerFixer {

    /**
     * Overridden content handler for the test.
     *
     * @param handler the existing handler
     * @param schema the XML schema
     * @return the handler
     *
     * @throws SAXException in case of error
     * @throws IOException in case of I/O error
     */
    @Override
    public ContentHandler handleContent(XMLReader handler, InputSource schema)
        throws SAXException, IOException {
        handler.setContentHandler(ContentHandlerFixer.getNewHandler(ContentHandlerFixer.Type.element));
		// no need to set document location because element needs to be closed in handleContent method
        XTreeUtil.parseXML(new InputSource(schema.getByteStream().toString()), true, null, null);
        return ContentHandlerFixer.getNewHandler(ContentHandlerFixer.Type.element);
    }
}