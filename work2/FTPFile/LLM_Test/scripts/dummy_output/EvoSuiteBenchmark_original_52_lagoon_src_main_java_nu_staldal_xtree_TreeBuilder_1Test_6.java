// TreeBuilder_1Test.java
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
* It contains one unit test case for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		
    /**
     * This unit test case will build an invalid XML document by parsing a XML
     *, and then again it will build an invalid XML document.
     * @throws Exception
     */
    @Test
    public void test() throws Exception {

        // create a new InputSource
        InputSource xmlInput = new InputSource();

        // set validation.
        xmlInput.setErrorHandler(new ErrorHandler() {
            @Override
            public boolean error(SAXParseException e) {
                fail("expected error from invalid xml");
                return false; // stop executing tests
            }
        });

        // parse an XML document through the builder using the builder.
        Element result = TreeBuilder.parseXML(xmlInput, true);

        // verify the result tree.
        assertNotNull(result);

	return;
    }
}