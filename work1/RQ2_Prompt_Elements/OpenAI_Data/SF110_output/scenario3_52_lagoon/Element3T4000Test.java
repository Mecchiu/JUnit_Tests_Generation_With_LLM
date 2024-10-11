// ElementTest.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeLocalName(int)} method.
*/
class ElementTest {

	/**
	 * Test case 1 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 1 is a positive test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 1 tests the normal operation of the method.
	 * </p>
	 * 
	 * <p>
	 * Test case 1 expects the method to return the local name of the attribute at the specified index.
	 * </p>
	 */
	@Test
	void testCase1() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Get the index of the attribute.
		int index = element.lookupAttribute("attribute", "http://www.example.com/");
		
		// Get the local name of the attribute at the specified index.
		String localName = element.getAttributeLocalName(index);
		
		// Check if the local name is correct.
		assertEquals("attribute", localName);
	}
	
	/**
	 * Test case 2 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 2 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 2 tests the operation of the method when the index is -1.
	 * </p>
	 * 
	 * <p>
	 * Test case 2 expects the method to return null.
	 * </p>
	 */
	@Test
	void testCase2() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Get the local name of the attribute at the specified index.
		String localName = element.getAttributeLocalName(-1);
		
		// Check if the local name is null.
		assertNull(localName);
	}
	
	/**
	 * Test case 3 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 3 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 3 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 3 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase3() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(0);
		});
	}
	
	/**
	 * Test case 4 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 4 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 4 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 4 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase4() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(1);
		});
	}
	
	/**
	 * Test case 5 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 5 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 5 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 5 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase5() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(-2);
		});
	}
	
	/**
	 * Test case 6 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 6 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 6 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 6 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase6() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(2);
		});
	}
	
	/**
	 * Test case 7 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 7 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 7 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 7 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase7() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(3);
		});
	}
	
	/**
	 * Test case 8 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 8 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 8 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 8 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase8() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(4);
		});
	}
	
	/**
	 * Test case 9 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 9 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 9 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 9 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase9() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(5);
		});
	}
	
	/**
	 * Test case 10 for {@link Element#getAttributeLocalName(int)}.
	 * 
	 * <p>
	 * Test case 10 is a negative test case.
	 * </p>
	 * 
	 * <p>
	 * Test case 10 tests the operation of the method when the index is out of bounds.
	 * </p>
	 * 
	 * <p>
	 * Test case 10 expects the method to throw an IndexOutOfBoundsException.
	 * </p>
	 */
	@Test
	void testCase10() {
		// Create a new Element object.
		Element element = new Element("element", "http://www.example.com/", "prefix");
		
		// Add an attribute to the element.
		element.addAttribute("attribute", "http://www.example.com/", "prefix", "value");
		
		// Check if an IndexOutOfBoundsException is thrown.
		assertThrows(IndexOutOfBoundsException.class, () -> {
			// Get the local name of the attribute at the specified index.
			element.getAttributeLocalName(6);
		});
	}
}