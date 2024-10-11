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
* It contains ten unit test cases for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class ElementTest {

	/**
	* Test case 1 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = -1</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase1() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = -1;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 2 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 0</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase2() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 0;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 3 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 1</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase3() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 1;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 4 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 2</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase4() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 2;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 5 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 3</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase5() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 3;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 6 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 4</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase6() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 4;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 7 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 5</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase7() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 5;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 8 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 6</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase8() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 6;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 9 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 7</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase9() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 7;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
	
	/**
	* Test case 10 for {@link Element#getAttributeNamespaceURI(int)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>index = 8</li>
	* </ul>
	* The expected result is:
	* <ul>
	* <li>returns null</li>
	* </ul>
	*/
	@Test
	public void testCase10() {
		Element element = new Element("", "", "", new AttributesImpl());
		int index = 8;
		String result = element.getAttributeNamespaceURI(index);
		assertNull(result);
	}
}