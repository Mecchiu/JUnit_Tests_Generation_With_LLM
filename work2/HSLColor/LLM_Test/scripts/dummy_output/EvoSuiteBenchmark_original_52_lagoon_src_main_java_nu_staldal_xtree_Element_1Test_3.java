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
		 * Constructor of this class
		 */
		public Element_1Test() { }

		/**
		 * Return the number of attributes this element have.
		 */
		public int numberOfAttributes();

		/**
		 * Test method of {@link java.lang.Object#clone()}.
		 */
		@Test
		public void testClone() {
			Element e1 = new Element(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml"));
			Node n = e1.clone();
			assertEquals("Incorrect type.", Element.class, n.getClass());
			assertEquals("Incorrect type.", n.getClass().getName(), n.getNodeName());
			assertEquals("Incorrect type.", 1, n.getNumberOfAttributes());
			Vector<NodeAtt> n1 = new Vector<NodeAtt>();
			n1.add(new NodeAtt("Att1", new AttributesImpl()));
			n1.add(new NodeAtt("Att2", new AttributesImpl()));
			n1.add(new NodeAtt("Att3", new AttributesImpl()));
			Vector<AttAtt> att1 = (Vector<AttAtt>) n1.toArray(new AttAtt[0]);
			assertEquals("Incorrect number of attributes. The original has 8 (Att1) + 2 (Att2) + 1 (Att3).", 8, att1.size());
			n2 = ((Element) n).clone();
			assertEquals("Incorrect type.", n2.getClass(), n1.getClass());
			assertEquals("Incorrect type.", n2.getClass().getName(), n2.getNodeName());
		}

		/**
		 * Test method for
		 * {@link nu.staldal.xtree.Element#Element(java.net.URL)}.
		 * 
		 * @throws Exception
		 *              if an error occurs
		 */
		@Test
		public void testElementUrlDefaultElementNoAttributes() throws Exception {
			assertEquals("Incorrect type.", "file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml", new Element(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml")));
		}

		/**
		 * Test method for {@link nu.staldal.xtree.Element#Element(java.net.URL)}.
		 * 
		 * @throws Exception
		 *              if an error occurs
		 */
		@Test
		public void testElementUrlWithAttributes() throws Exception {
			Elements.append(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml"), new AttributesImpl());
			Elements.append(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml"), new AttributesImpl());
			Vector<NodeAtt> v = Elements.getAttributeVector(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml"));
			assertEquals("Incorrect number of attributes.", 4, v.size());
			for (NodeAtt a : v)
				assertEquals("Incorrect type.", Element.class, a.getDataType());
		}

		/**
		 * Test method for {@link nu.staldal.xtree.Element#clone()}.
		 */
		@Test
		public void testClone() throws Exception {
			assertEquals("Incorrect type.", Element.class, new Element(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml")));
			assertEquals("Incorrect type.", new Element(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml")));
			Elements.removeAllElements();
			assertEquals("Incorrect type.", 0, Elements.size());
			Element e1 = new Element(new URL("file:/home/staldal/src/XTree/Elements/Element_1Test/element1.xml"));
			assertEquals("Incorrect type.", e1.getClass(), Element.class);
		}
		// end of class Element

		public static void mainTest(String[] args) {
			try {
				new Element_1Test().doTestClone();
			} catch (Exception error) {
				System.out.println(error);
				error.printStackTrace();
			} finally {
				if (Elements.isElementCloned("Element_1Test")) {
					System.out.println("ERROR!! A detached element was created.");
				}
			}
		}
}