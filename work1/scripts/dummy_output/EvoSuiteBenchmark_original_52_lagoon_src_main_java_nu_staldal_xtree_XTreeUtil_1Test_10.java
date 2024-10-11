// XTreeUtil_1Test.java
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
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
		
    private XTreeUtil_1Test() {
    }
			
	/**
	 * @throws Exception throws this for a memory leak.
	 */
	@Test
	public void test() 
			throws Exception
	{
		int[] size = new int[0];
		
		// Create a DOM Document
		InputSource xmlInput = new InputSource(
				new ByteArrayInputStream(new byte[0]));

		ContentHandlerFixer.fix(xmlInput, null);
		
		// Apply styles to create a DOM Document
		Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		d.getDocumentElement().setAttribute("xmlns", Namespaces.SCHEMA_NS);
		Element root = d.createElement("root");
		root.setAttribute("type", "text/xml");
		DOMSource src = new DOMSource (d);
		DOMResult dst = new DOMResult();         

		// Run it
		XTreeUtil.parseXMLSequential(xmlInput, true, Namespaces.SCHEMA, schemaType, src, dst);
		
		// Validate
		for (int i = 0; i < size.length / 2; i++) {
			int h = nameToId(dst.getNodeName());
			
			// Test name
			assertTrue(dst.getStringAttribute("node").length() > 0);
				
			// Test id length
			assertTrue(nameToId(dst.getStringAttribute("node")).length() > 0);
			
			d.getDocumentElement().removeAttribute("node");
		}
			
		// Make sure values have been correctly identified
		for (int i = 0; i < size.length / 2; i++) {
			int h = nameToId(dst.getNodeName());
    			// Test name
    			assertFalse(dst.getStringAttribute("node").length() > 0);
    			
    			// Test id length
    			assertFalse(nameToId(dst.getStringAttribute("node"))
    					.length() > 0);
    		}
	}
	
	/**
	 * @param id a node name
	 * @return the node id
	 */
	private static int nameToId(String id) {
		if (id.length() > 0) {
			return id.charAt(0) -'';
		}
		return 0;
	}
}