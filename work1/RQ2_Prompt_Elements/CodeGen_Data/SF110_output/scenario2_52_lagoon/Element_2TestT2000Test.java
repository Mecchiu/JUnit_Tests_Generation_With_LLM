// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {

    protected Element e;
    protected String s;
    
    /**
     * Constructor.
     *
     * @param a the given element.
     */
    Element_2Test(Element a) {
        this.e = a;
        this.s = null;
    }
        
    /**
     * Constructor.
     *
     * @param a the given element.
     * @param s the namespace attribute name to use. Is ignored if null,
     *        meaning the local variable name.
     */
    Element_2Test(Element a, String s) {
        this.e = a;
        this.s = s;
    }

    /** Test of getName method, of class Element. */
    @Test
	public void testGetName() {
    	assertNull("getName() must return null if no name is set", e.getName());
    }
    /** Test of getAttributeNamespaceURI method, of class Element. */
    @Test
    public void testGetAttributeNamespaceURI() {
    	assertNull("getAttributeNamespaceURI() must return null if no uri is set", e.getAttributeNamespaceURI());
    }
    /** Test of getAttribute method, of class Element. */
    @Test
    public void testGetAttribute() {
    	assertNull("getAttribute() must return null if no name is set", e.getAttribute(""));
    	assertNull("getAttribute() must return null if no name is set", e.lookupAttribute(""));
    	e.setAttribute("name", "http://ni.sulphur.nu/names");
    	String s = e.getAttribute("name");
    	assertNotNull("Get attribute name", s);
    	assertEquals("Get attribute name", "http://ni.sulphur.nu/names", s);
    	
    	// test that the namespace is set properly
    	s = e.getAttributeNS(null, null);
    	assertNull("Get attribute namespace", s);
    }
    /** Test of getAttributeType method, of class Element. */
    @Test
	public void testGetAttributeType() {
    	assertNull("Get attribute type must return null", e.getAttributeType(""));
    	assertNull("Get attribute type must return null", e.lookupAttributeType(""));
    	e.setAttributeType(String.class.getCanonicalName().toUpperCase());
    	assertTrue("Get attribute type",
				"ID REQUEST".equals(((Stringable)e).getString()));
    	try {
			e.lookupAttributeType("");
		} catch (Exception ex) {
			// this happens sometimes... :(
		}
    }
    /** Test of getChildNodes method, of class Element. */
    @Test
	public void testGetChildNodes() {
    	e.setNamespaceURI("id");
    	Vector v = new Vector();
    	Element vE = (Element)e.getChild("id").elementAt(e.getChildCount("id") - 1);
    	v.addElement(vE);
    	assertEquals("Get child nodes", v, e.getChildNodes());
    }
    /** Test of getElementCount method, of class Element. */
    @Test
	public void testGetElementCount() {
    	e.setNamespaceURI("id");
    	assertEquals("Get element count", e.getElementCount("id"), 1);
    	assertEquals("Get element count", e.getElementCount(), 1);
    }
    /** Test of lookupAttribute method, of class Element. */
    @Test
	public void testLookupAttribute() {
    	assertNull("Lookup attribute must return null", e.lookupAttribute(""));
    	e.setAttribute("id", "http://ni.sulphur.nu");
    	assertEquals("Lookup attribute", "http://ni.sulphur.nu", e.lookupAttribute("id"));
    }
    /** Test of lookupAttributeType method, of class Element. */
	@Test
	public void testLookupAttributeType() {
    	assertNull("Lookup attribute type must return null", e.lookupAttributeType(""));
    	e.setAttributeType(String.class.getCanonicalName().toUpperCase().replace("ID_", ""));
    	assertTrue("Lookup attribute type",
				"ID REQUEST".equals(((Stringable)e).toString()));
    }
    /** Test of lookupAttributeTypeMethod method, of class Element. */
    @Test (expected = org.xml.sax.SAXNotRecognizedException.class)
	public void testLookupAttributeTypeNotRecognized() {
    	e.setAttributeType("unknown");
    }
    /** Test of lookupAttributeName method, of class Element. */
    @Test
	public void testLookupAttributeName() {
    	e.setAttribute("a", "http://localhost/d/A1");
    	assertEquals("Lookup attribute name", "http://localhost/d/A1", e.lookupAttribute("a"));
    }
    /** Test of lookupAttributeNamespaceURI method, of class Element. */
    @Test
    public void testLookupAttributeNamespaceURI() {
    	e.setAttributeNS("ns1:a", "http://localhost/foo", "X");
    	assertTrue("Lookup attribute namespace",
				"http://localhost/foo".equals(e.lookupAttributeNS("ns1:a", "http://localhost/d/A1")));
    	assertNull("Lookup attribute namespace", e.lookupAttributeNS("unknown", "http://localhost/d/A1"));
    }
    /** Test of lookupAttributeNS method, of class Element. */
    @Test
	public void testLookupAttributeNS() {
    	e.setAttributeNS("", null, "X");
    	assertNull("Lookup attribute ns1:", e.lookupAttributeNS("", null));
    	String s = e.lookupAttributeNS("ns1", null);
    	assertNull("Lookup attribute ns1:", s);
    	String name = e.getAttributeNS(null, "ns1:");
    	assertNull("Lookup attribute ns1:", name);
    }
    /** Test of lookupText method, of class Element. */
    @Test
	public void testLookupText2() {
    	e.setAttributeNS("", "ns1", "X");
    	e.setText("a");
    	assertNull("Lookup attribute ns1:", e.lookupText(e.getEntityRef().entityRef));
    	e.setText(null);
    	String s = e.lookupText(e.getEntityRef().entityRef);
    	e = (Element)e.getChild("id");
    	assertNull("Lookup attribute ns1:", s);
    	s = e.lookupText(e.getEntityRef