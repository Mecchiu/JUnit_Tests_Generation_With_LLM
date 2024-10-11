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
//@Test
	/**
	 * Test of equals method, of class Element.
	 * @since 1.5
	 */
	@Test
    public void test_equals_boolean() {
		Class<Element> c1 = Element.class;
		Class<Element> c2 = Element.class;
		boolean r1 = c2.isInstance(this);
		boolean r2 = c1.isInstance(this);
        assertTrue("Equal objects must return true", r1 && r2);

        boolean r3 = c1.isInstance(new Element() {
        	public String getNodeName() {
        		return "Element";
        	}

        	public Object getAttributes() {
        		return new Vector<String>();
        	}
        });
        boolean r4 = c1.isInstance(new Element() {
        	public String getNodeName() {
        		return "ElementWithChildren";
        	}

        	public Object getAttributes() {
        		return new Vector<String>();

        	}
        });
        boolean r5 = c1.isInstance(new Element() {
        	public String getNodeName() {
        		return "ElementWithChildren_1";
        	}

        	public Object getAttributes() {
        		return new Vector<String>();

        	}
        });
        boolean r6 = c1.isInstance(new Element_1Test() {
        	public String getNodeName() {
        		return "ElementsTest";
        	}

        	public Object getAttributes() {
        		return new Vector<String>();

        	}
        });
        assertTrue("Equal objects must return true", r1 && r2 && r3 && r4 && r5 && r6);
    }

	/**
	 * Test of equals method, of class Element.
	 */
	@Test
	void test_equals_String() {
		Class<Element> c1 = Element.class;
		Class<Element> c2 = Element.class;
		String r1 = c2.isInstance(this);
		String r2 = c1.isInstance(this);
        assertTrue("Equal objects must return true", r1 && r2);

        boolean r3 = c1.isInstance(new Element() {
        	public String getNodeName() {
        		return "Element";
        	}

        	public Object getAttributes() {
        		return new Vector<String>();
        	}
        });
        boolean r4 = c1.isInstance(new Element() {
        	public String getNodeName() {
        		return "ElementWithChildren";
        	}

        	public Object getAttributes() {
        		return new Vector<String>();

        	}
        });
        boolean r5 = c1.isInstance(new Element_1Test() {
        	public String getNodeName() {
        		return "ElementsTest";
        	}

        	public Object getAttributes() {
        		return new Vector<String>();

        	}
        });
        assertTrue("Equal objects must return true", r1 && r2 && r3 && r4 && r5);
    }

	/**
	 * Test of getNodeName method, of class Element.
	 * @since 1.5
	 */
	@Test
    public void test_getNodeName() {
		String r = new Element().getNodeName();
		Class<Element> c = Element.class;
		assertEquals("ElementsTest", c.getSimpleName());

        String s = "ElementsTestWithChildren";
        c = Element_1Test.class;
	    Class<Element> c2 = c.getSuperclass();
        assertEquals("ElementsTest", c2.getSimpleName());
        String o1 = c.getSimpleName();
        String o2 = new Element().getNodeName();
        Class<Element> o3 = o2.equals("ElementsTest")? Element_1Test.class : Element.class;
        assertEquals(o3.getSimpleName(), o2.equals("ElementsTest")? "ElementsTest" : "ElementsTestWithChildren");
    }

	/**
	 * Test of clone method, of class Element
	 * @since 1.5
	 */
	@Test
    public void test_clone_element() throws ParserConfigurationException, SAXException {
		Class<Element> c = Element.class;
		Element r = (Element) c.newInstance();

		assertBool(true, c.isInstance(r));
		assertBool(false, c.isInstance(new Element()));
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		//@TODO:
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() {
		//@TODO:
	}

	private static void assertBool(boolean expected, Class<Element> expectedType) {
		Class<Element> c = Element.class;
		assertTrue("expectedTrue must be true", expected);
		assertTrue("expectedFalse must be false",!expected);
        Element e = newElement();
		try {
			c.newInstance();
			assertFalse("expectedFalse must NOT be true", expected);
		} catch (Exception ex){}
	}

	private static Object newElement() {
		return new Element();
	}

	private static Element newElementWithChildren() {
		return new Element()
				.withAttributes(new Vector<String>());
	}

}
