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
final Element e = new Element();
		static Vector v = new Vector();
		static Vector vg = v;

	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.TestParametrized
	public void testElement_01() throws Exception {
		assertNotNull(e);
		assertNull(e.attrType);
	}

	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.TestParametrized
	public void testElement_02() throws Exception {
		final String p = e.attribute("p").getValue();
		assertNotNull(p);
		assertEquals("val1", p);
		assertNull(e.parent);
	}

	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.TestParametrized
	public void testElement_03() throws Exception {
		final String p = e.attribute("p").getValue();
		assertNotNull(p);
		assertEquals("p1", p);
	}

	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.TestParametrized
	public void testElement_04() throws Exception {
		final String p = e.attribute("p").getValue();
		assertNotNull(p);
		assertEquals("p1", p);
		assertNull(e.parent);
		
		final String s = e.getChild("p").getValue();
		assertNotNull(s);
		assertEquals("val2", s);
	}

	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.TestParametrized
	public void testElement_05() throws Exception {
		final String p = e.attribute("p").getValue();
		assertNotNull(p);
		assertEquals("p1", p);
	}

	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.TestParametrized
	public void testElement_06() throws Exception {
		final Element e = new Element();
		e.elements().addElement(e);
	}

	@org.junit.jupiter.api.Test
	@org.junit.jupiter.api.TestParametrized
	public void testElement_07() throws Exception {
		final Element e = new Element();
		e.elements().addElement(e.elements().elementAt(0));
	}

	@org.junit.jupiter.api.Test
	@TestParametrized
	public void testElement_08() throws Exception {
		final Element e = new Element();
		e.elements().addElement(e.elements().elementAt(5));
	}

	@org.junit.jupiter.api.Test
	@TestParametrized
	public void testElement_09() throws Exception {
		final Element e = new Element();
		e.elements().addElement(e.elements().elementAt(10));
	}

	@org.junit.jupiter.api.Test
	@TestParametrized
	public void testElement_10() throws Exception {
		final Element e = new Element();
		e.elements().addElement(e.elements().elementAt(4));
	}
}
