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
		@Test
    void test() throws Exception {
        //test a simple XML document
    	final String data1 = "<?xml version='1.0' encoding='UTF-8'?>" +
    			"<root><textNode1/></root>";
    	Tree builder = parseXML(new ByteArrayInputStream(data1.getBytes()), true);
        assertNotNull(builder);
		assertNotNull(builder.getChild(0));
		assertNotNull(builder.getChild(1));
    }
    
	@Test
    void test_xmlAt_error_1() throws Exception {
        //same as test_xmlAt_error_2, but with extra comment.
    	//@test_XTree("tree with xml at error on #1")
    	//@test_XTree("tree with xml at error on #2")
        final String data1 = "<?xml version='1.0' encoding='UTF-8'?>"
    			+ "<root><textNode1/><comment></comment>";
        final String data2 = "#1 <!--tree2-->#2";

        Tree builder = parseXML(new ByteArrayInputStream(data1.getBytes()));
    	assertNull("should not have child node", builder.getChild(0));
    	assertNotNull("document", builder);
		assertNotNull(builder.getChild("/root"));
		assertNull(builder.getChild("/root/textNode1"));
		assertNull(builder.getChild("//"+data1));
		assertNull(builder.getChild("////"+data1));
    	
    	
    	Tree parent = builder.getParent();
    	assertNotNull("root node", parent.getChild("/root"));
    	assertNotNull("root node", parent.getChild("//root"));
    }
	
}