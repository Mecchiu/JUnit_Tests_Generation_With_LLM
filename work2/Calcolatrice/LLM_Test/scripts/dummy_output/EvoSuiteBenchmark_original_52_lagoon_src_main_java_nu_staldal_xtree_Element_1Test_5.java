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
		
	/**
	 * Run the void numberOfAttributes() method test.
	 */
	@Test
	public void run_1_Test()
        throws org.xml.sax.SAXException, IOException
	{
        Element_1Test test = new Element_1Test();
        try {
                test.test_1();
        } catch (Throwable e) {
                // This exception is never thrown. If it does, it's a bug in the document
                // (either we don't know this exception handler, or the XTree implementation
                // doesn't implement this interface).
                System.err.println("Error running testCase 1: " + e);
                e.printStackTrace();
                throw new Exception(e);
        }
	}
	
	/**
	 * test_1()
	 */
	private void test_1() throws org.xml.sax.SAXException, IOException 
	{
		// Attributes
		String name = "Name";
		String value = "value";
		String att1Value = "att1 Value with value";
		String att2Value = "att2 Value with value (second)";
		String att3Value = "att3 Value with value";

		// Elements
		NodeList nodeList = new NodeList();
	
		// Test
		assertNotNull("The NodeList for this Element with an empty name must be non null.", 
			nodeList.getNode(nodeList.size() - 1));
		assertNotNull("The NodeList for this Element with an empty value must be non null.", 
			nodeList.getNode(nodeList.size() - 2));
		try {
			nodeList.getNode(0);
			fail("An IllegalArgumentException should be throw if the index is invalid.");
        } catch (IllegalArgumentException e) {
                // This exception is never thrown. If it does, it's a bug in the document
                // (either we don't know this exception handler, or the XTree implementation
                // doesn't implement this interface).
        }
		
		String id = "id"; 
		String tagName = "Name";
		
		Node childNode = null;
		assertNotNull("The node list for this element must have a child element.", childNode);
		
		Element parent = childNode.jjtCreateElement(parentNode.jjtAddChild(tagName, parentNode.jjtAddChild(id, childNode)));
		Element grandChild = childNode.jjtCreateElement(grandChildNode.jjtAddChild(tagName, grandChildNode));
		
		parent.jjtAddChild(tagName, parentNode.jjtAddChild(att1Value, childNode)).jjtAddChild(att2Value, grandChildNode);	
		
		int count = 0;
		for (; count < 10; count++) {
				parent = childNode.jjtCreateElement(grandChildNode.jjtAddChild(tagName, parentNode.jjtAddChild(grandChildNode.jjtAddChild(tag1Value, childNode))));
                
				String value1 = "value_" + count; 
				parent.jjtAddChild(tag1Value, parentNode.jjtAddChild(grandChildNode.jjtAddChild(tag3Value, childNode))).jjtAddChild(att1Value, parentNode.jjtAddChild(grandChildNode.jjtAddChild(tag3Value, childNode))).jjtAddChild(att2Value, parentNode.jjtAddChild(grandChildNode.jjtAddChild(tag3Value, childNode))).jjtAddChild(att3Value, parentNode.jjtAddChild(grandChildNode.jjtAddChild(tag3Value, childNode)));
                
        }
	}
	
}