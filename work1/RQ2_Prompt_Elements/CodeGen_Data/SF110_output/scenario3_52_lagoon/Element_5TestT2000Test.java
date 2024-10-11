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
	 * Test method for 'Element.getAttributeValue()'.
	 *
	 * @throws XMLStreamException when parsing XML stream fails
	 */
	@Test
   public void testGetAttributeValue() throws XMLStreamException{
      getAttributeValue(""); //default value
      getAttributeValue(""); //empty value
      getAttributeValue("abc"); //value as a single byte
      getAttributeValue("def");
      getAttributeValue("bcd");

      try {
         getAttributeValue("c");
         fail("Element.getAttributeValue() with multiple values should throw XMLStreamException");
      } catch (XMLStreamException ex){
         assertEquals(ex.getMessage(), "No such attribute 'c'.");
      }
   }
	
	/**
	 * Test method for 'Element.lookupAttribute(String)'.
	 *
	 * @throws XMLStreamException when parsing XML stream fails
	 */
    @Test
   public void testLookupAttribute() throws XMLStreamException {
      System.out.println("getAttributeValue()");
		String name = "abc";
		String value = "def";
		lookupAttribute(name, value);
		System.out.println("");
		
		name = "bcd";
		value = "def";
		lookupAttribute(name, value);
		System.out.println("");
	}

	/**
	 * Test method for 'Element.lookupAttribute(String, String)'.
	 *
	 * @throws XMLStreamException when parsing XML stream fails
	 * @throws ElementLookupException when there is any wrong element name
	 */
	@Test
	public void testLookupAttributeExistent() throws XMLStreamException, ElementLookupException {
		System.out.println("");
		Vector<String> expectedNames = new Vector();
		expectedNames.add("abc");
		expectedNames.add("bcd");
		
		Vector<String> attributes = new Vector<String>();
		Vector<String> values = new Vector<String>();
		Vector<String> errors = new Vector<String>();
		
		
		
		try{
			lookupAttribute("", "value"); //doesn't exist an attribute
			fail("element without value attribute throws ElementLookupException");
		} catch (ElementLookupException ex){
			attributes.add("");
			values.add("value");
			errors.add(ex.getMessage());
		}
		try{
			lookupAttribute("", "bcd"); //doesn't exist a value
			fail("element without value attribute throws ElementLookupException");
		} catch (ElementLookupException ex){
			attributes.add("");
			values.add("bcd");
			errors.add(ex.getMessage());
		}
		try{
			lookupAttribute("", null);
			fail("element with null attribute name throws ElementLookupException");
		} catch (ElementLookupException ex){
			//no error when attribute is null
		}

		
		Node parentNode = m_context.getRootElement().getNode("abc");
		lookupAttribute("abc", "value");
		lookupAttribute("abc", "bcd");
		lookupAttribute("c", "", "", 1);
		
		lookupAttribute("abc", "value", 1);
		lookupAttribute("abc", "bcd", 1);
		
		lookupElement("abc", "value");
		lookupElement("abc", "bcd", 1);
		
		Node abcElement = parentNode.lookupElement("abc");
		Node defElement = parentNode.lookupElement("c");
		
		assertElement(abcElement, "value");
		assertElement(defElement, "bcd");
		
    }
	
	private void assertElement(Node node, String expectedName){
		assertNodeExist(node, expectedName, 0);
        
		for(int i=0;i<node.getChildCount();i++){
			NamedNodeMap attributes = node.getAttributes();
			Node attr = attributes.getNamedItem("");
			assertElement(attr, expectedName + " ("+ i +")");
		}
	}
}
