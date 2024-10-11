// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {
		
	private static final boolean debug = true;
	
	@Test	
	public void testElements() {
		System.out.println("*** XML Element");
		
		Nodes list = new Nodes(new Nodes(new Nodes(new Nodes("tag"))), new Nodes(new Nodes("item")));
		
		try {
			AttributesImpl attributes = new AttributesImpl();
			attributes.addAttribute("tag", "itemtag", "tag");
			attributes.addAttribute("tag", "itemtag", "CDATA", "item2");
			String tag = getAttribute("tag");
			ElementElement el = new Element(getRoot(), getRoot(), "root", tag, attributes);
			System.out.println(el.getName());
			assertTrue("getName() == root", el.getName().equals("root"));
		}
		catch (Exception exc) {
			if (debug) {
				exc.printStackTrace();
			}
			fail("Unexpected exception while processing XML Element");
		}
	}
	
	@Test
	public void testWithUnicodeName() {
		try {
			String node = "unicode";
			String name = "unicode_1u";
			Nodes list = new Nodes(new Nodes(new Nodes(new Nodes(new Nodes(node))), new Nodes(new Nodes(new Nodes(name))))) {
				
				public boolean getNodeType(String name, String ns) {
					if (name.equals(name)) return false;
					return super.getNodeType(name, ns);
				}
			};
			Node root = new Element(list, new Nodes(new Nodes(new Nodes(new Nodes("item"))), new Nodes(new Nodes("unicode_1u"))), null);
			Element a = new Element(root, list, null, null, null);
			assertTrue("a.getName().equals(unicode)", a.getName().equals("unicode"));
		}
		catch (Exception exc) {
			if (debug) {
				exc.printStackTrace();
			}
			fail("Error when processing with unicode");
		}
	}
	
	@Test
	public void testWithNullNs() {
}
}