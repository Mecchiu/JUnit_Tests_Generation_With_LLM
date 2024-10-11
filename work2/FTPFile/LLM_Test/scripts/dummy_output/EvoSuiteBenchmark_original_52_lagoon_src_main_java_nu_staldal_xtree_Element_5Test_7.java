// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {
		
	/**
	 * Test method of {@link Element#Element(String)}.
	 */
	@Test
	public void Element__ElementString__() {
		try {
			new Element("Element", null);
			assertNull(new Element("", null));
			assertEquals("Element", new Element("", null).getTagName());
		} 
		catch (Exception e) {
			error(e);
		}
	}
	
	/**
	 * Test method of {@link Element#ElementFactory}.
	 */
	@Test
	public void Element__ElementFactory__() {
		try {
			ElementFactory factory = new ElementFactory();
			Element element = factory.create(new String("Element"));
			element.addAttribute(new NodeAttribute("", null, "test", null));
			fail("Exception expected");
		} catch (RuntimeException e) {
			assertToStringEquals("RuntimeException", e);
		}
	}
	
	/**
	 * Test method of {@link Element#lookupTagAttribute()}.
	 */
	@Test
	public void Element__lookupTagAttribute__() {
		try {
			ElementFactory factory = new ElementFactory();
			Element element = factory.create(new String("Element"));
			URL url = getClass().getClassLoader().getResource("test.xml");
			URL url1 = getClass().getClassLoader().getResource("test1.xml");
			assertEquals("1", element.lookupTagAttribute("http://www.wikitable.co.uk/1/5/Element") ); // WTF
		}catch (Exception e) {
			error(e);
		}
	}
	
	/**
	 * Test method of {@link Element#lookupTagValue()}.
	 */
	@Test
	public void Element__lookupTagValue__() {
		try {
			ElementFactory factory = new ElementFactory();
			Element element = factory.create(new String("Element"));
			Vector<String> values = new Vector<>();
			
			values.add("value");
			values.add("value2");
			
			Element value = new Element("value2", values);
			element.addAttribute(new NodeAttribute("", null, "testAttr", value) );
			
			Element element2 = factory.create(new String("Element"));
			Vector<String> values2 = new Vector<>();
			
			values2.add("value3");
			
			value = new Element("value3", values2);
			
			Vector<String> expectedValues = new Vector<>();
			expectedValues.add("testAttr|value");
			expectedValues.add("testAttr|value2");
			expectedValues.add("testAttr|value3");
			
			assertToStringEquals("Vector with expected values", expectedValues);
		}catch (Exception e) {
			error(e);
		}
	}
	
	/**
	 * Test method of {@link Element#NodeAttribute(String)}.
	 */
	@Test
	public void NodeAttribute__NodeAttributeString__() {
		try {
			Element element = new Element("nodeAttribute", null);
			Vector<String> values = new Vector<String>();
			ElementAttribute a = new ElementAttribute(new Element("tag", values), "val", Element.class);
			a.setDefault(null);
			assertNull(a.defaultValue()); // WTF
			assertEquals("", a.getValue());
	
			a = new ElementAttribute(new Element("tag", values), "val", Element.class);
			ElementValue ve = a.defaultValue();
			assertTrue(ve.getClass().equals(ElementValue.class));
			assertEquals(values[0], ve.getValue());
			
			a = new ElementAttribute(new Element("tag", values), null, ElementValue.class);
			ElementValue ve2 = a.defaultValue();
			assertTrue(ve2.getClass().equals(ElementValue.class));
			assertEquals(values[1], ve2.getValue());
			
			assertNull(a.getDefault());
		
			a = new ElementAttribute(new Element("tag", values), null, ElementValue.class);
			ElementValue ve3 = a.getDefault();
			assertTrue(ve3.getClass().equals(ElementValue.class));
			assertTrue(String.valueOf(ve3).equals(values[1]));
			
			assertTrue(ve.getClass().equals(Element.class));
		} catch (Exception e) {
			error (e);
		}
	}
	
	/**
	 * Test method of {@link Element#NodeValueFactory}.
	 */
	@Test
	public void NodeAttribute__NodeValueFactory__() {
		try {
			Element element = new Element("nodeValue", null);
			try {
				element.addAttributeValue(new NodeAttribute("test", null, "val"));
				fail("Exception expected"); // TODO replace with Assertions.fail()
			} catch (IllegalStateException e) {
				assertEquals("IllegalStateException", ExceptionUtils.getExceptionMessage(e));
			}
			
			element = new Element("nodeValue", new Vector<NodeAttribute>());
			try {
				element.addAttributeValue(new NodeAttribute("test", new Vector<NodeValue>()));
				fail("Exception expected"); // WTF
			} catch (IllegalStateException e) {
				assertEquals("IllegalStateException", ExceptionUtils.getExceptionMessage(e));
			}
		} catch (Throwable e) {
			error(e);
		}
	}
	
	/**
	 * Test method of {@link Element#lookupAttribute(String)}.
	 */
	@Test
	public void Element__lookupAttribute__string__() {
		try {
			ElementFactory factory = new ElementFactory();
			Element element = factory.create(new String("Element"));
			
			ElementAttribute a = new ElementAttribute(new Element("tag", new Vector<NodeValue>()), null, Element.class);
			a.setDefault("val");
			ElementValue ve = a.defaultValue();
			
			assertEquals("val", a.getValue());
			assertFalse(ve.getClass().equals(ElementValue.class));
		} catch (Exception e) {
            error(e);
        }
	}
	
}