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
		private static final String name = "myElement.test";
	
	@Test
	public void test() throws Exception {
		Element a = new Element(Element.class, name);
		System.out.println(a.getClass().getName());
	
		a.addChild(new StringNodeContent("test2"));
		assertEquals(1, a.getChildCount());
		assertEquals("test2", a.getChild(0).getValue());
		Element b = (Element) a.getChild(0);
		assertEquals(1, b.getChildCount());
		assertEquals("test", b.getChild(0).getValue());
		assertEquals(1, a.getChildCount());
		assertEquals("test", a.getChild(0).getValue());
	
	}
	
	@Test
	public void test2() throws Exception {
		Element a = new Element(Element.class, name);
		a.addChild(new StringContent("test2"));
		assertEquals(1, a.getChildCount());
		assertEquals("test2", a.getChild(0).getValue());
		Element b = (Element) a.getChild(0);
		assertEquals(1, b.getChildCount());
		assertEquals("test", b.getChild(0).getValue());
		assertEquals(1, a.getChildCount());
		assertEquals("test2", a.getChild(0).getValue());
		
	}
	
	@Test
	public void test3() throws Exception {
		Element a = new Element(String.class, name);
		a.addChild(new StringNodeContent("test2"));
		a.addChild(new StringContent("test3"));
		assertEquals(1, a.getChildCount());
		assertEquals("test2", a.getChild(0).getValue());
		assertEquals("test3", a.getChild(1).getValue());
	
	}
	
	@Test
	public void test4() throws Exception {
		Element a = new Element(Element.class, name);
		a.addChild(new StringContent("test4"));
		a = (Element) a.getChild(0);
		a.addChild(new StringNodeContent("test5"));
		assertEquals(2, a.getChildCount());
		assertEquals("test2", a.getChild(0).getValue());
		assertEquals("test5", a.getChild(1).getValue());
	}
	
	@Test
	public void test5() throws Exception {
		Element a = new Element(Element.class, name);
		a.addChild(new StringContent("test3"));
		a = (Element) a.getChild(0);
		a.addChild(new StringNodeContent("test1"));
		assertEquals(2, a.getChildCount());
	}

	@Test
	public void test6() throws Exception {
		Element a = new Element(Element.class, name);
		a.setXPath(new StringContent("//test"));
		a.addChild(new StringContent("test3"));
		a = (Element) a.getChild(0);
		a.addChild(new StringNodeContent("test2"));
		assertEquals(2, a.getChildCount());
	}

}