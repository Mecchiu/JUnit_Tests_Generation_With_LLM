// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {
 
	// The following methods will be used for tests.
	@Test
    public void class1(){
		assertNotNull(Element.this);
    }
}

// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URLEncoder;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.EntityResolver2;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class Element_2Test extends ElementTest {

    @Override
    public String getRootURI() {
        return "";
    }

    @Override
    public String getXMLRootTag() {
        return "";
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    // A test element. Its name is defined by the parent node.
    @Test
    public void test() {
        Element parent = getParent();
        parent.getParent();
    }
}

