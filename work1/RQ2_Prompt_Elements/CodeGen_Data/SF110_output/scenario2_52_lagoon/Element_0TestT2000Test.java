// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {
 /**
		 * Creates a new Element.
		 *
		 * @return a new Element.
		 */
		public static Element newElement() {
			return new Element();
		}

		 /**
		  * Creates a new Element.
		  *
		  * @return a new Element.
		  */
		 public Element newElement(String namespacesUri) {
				 return new Element__(namespacesUri);
		 }

		 /**
		  * Creates a new Element.
		  *
		  * @return a new Element.
		  */
		 public Element newElement(String localName, String namespacesUri) {
				 Element e = newElement(namespacesUri);
				 attrName.add(e.attrName);
				 elemAttrs.add(new Attribute(namespacesUri, localName, e.attrName));
				 return e;
		 }


		/**
		 * Tests that the element is initialized with an xml version of this
		 * version of StAX.
		 */
		@Test
		public void test1() {
			assertEquals(false, Element.newElement("").isStAXInstance());
			assertEquals(true, Element.newElement("x").isStAXInstance());
		}

		/**
		 * Tests that the element can be cast to an XML element.
		 */
		@Test
        public void test2() {
			Element el = Element.newElement("");
			assertEquals(1, el.getChildNodes().size());
		}

		/**
		 * Tests that the element can be cast to an XML attribute.
		 */
		@Test
        public void test3() {
			Element el = Element.newElement("");
			assertEquals(0, el.getChildNodes().size());
		}
}