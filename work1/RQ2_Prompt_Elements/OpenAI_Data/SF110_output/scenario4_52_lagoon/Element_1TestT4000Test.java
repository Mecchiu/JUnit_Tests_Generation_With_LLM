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
* It contains ten unit test cases for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {

	/**
	 * Test case for {@link Element#numberOfAttributes()}
	 * <p>
	 * Test if the number of attributes is correct.
	 */
	@Test
	void testNumberOfAttributes() {
		Element element = new Element("", "", 0);
		assertEquals(0, element.numberOfAttributes());
		element = new Element("", "", 1);
		assertEquals(1, element.numberOfAttributes());
		element = new Element("", "", 2);
		assertEquals(2, element.numberOfAttributes());
		element = new Element("", "", 3);
		assertEquals(3, element.numberOfAttributes());
		element = new Element("", "", 4);
		assertEquals(4, element.numberOfAttributes());
		element = new Element("", "", 5);
		assertEquals(5, element.numberOfAttributes());
		element = new Element("", "", 6);
		assertEquals(6, element.numberOfAttributes());
		element = new Element("", "", 7);
		assertEquals(7, element.numberOfAttributes());
		element = new Element("", "", 8);
		assertEquals(8, element.numberOfAttributes());
		element = new Element("", "", 9);
		assertEquals(9, element.numberOfAttributes());
	}
}

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
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_2Test {
		
	/**
	 * Test case for {@link Element#numberOfNamespaceMappings()}
	 * <p>
	 * Test if the number of namespace mappings is correct.
	 */
	@Test
	void testNumberOfNamespaceMappings() {
		Element element = new Element("", "", 0);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 1);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 2);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 3);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 4);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 5);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 6);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 7);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 8);
		assertEquals(0, element.numberOfNamespaceMappings());
		element = new Element("", "", 0, 9);
		assertEquals(0, element.numberOfNamespaceMappings());
	}
}

// Element_3Test.java
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
class Element_3Test {
		
	/**
	 * Test case for {@link Element#getAttributeNamespaceURI(int)}
	 * <p>
	 * Test if the namespace URI of an attribute is correct.
	 */
	@Test
	void testGetAttributeNamespaceURI() {
		Element element = new Element("", "", 0);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 1);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 2);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 3);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 4);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 5);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 6);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 7);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 8);
		assertEquals("", element.getAttributeNamespaceURI(0));
		element = new Element("", "", 9);
		assertEquals("", element.getAttributeNamespaceURI(0));
	}
}

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
* It contains ten unit test cases for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_4Test {
		
	/**
	 * Test case for {@link Element#getAttributeLocalName(int)}
	 * <p>
	 * Test if the local name of an attribute is correct.
	 */
	@Test
	void testGetAttributeLocalName() {
		Element element = new Element("", "", 0);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 1);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 2);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 3);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 4);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 5);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 6);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 7);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 8);
		assertEquals("", element.getAttributeLocalName(0));
		element = new Element("", "", 9);
		assertEquals("", element.getAttributeLocalName(0));
	}
}

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
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class Element_5Test {
		
	/**
	 * Test case for {@link Element#getAttributeType(int)}
	 * <p>
	 * Test if the type of an attribute is correct.
	 */
	@Test
	void testGetAttributeType() {
		Element element = new Element("", "", 0);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 1);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 2);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 3);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 4);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 5);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 6);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 7);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 8);
		assertEquals("", element.getAttributeType(0));
		element = new Element("", "", 9);
		assertEquals("", element.getAttributeType(0));
	}
}

// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_6Test {
		
	/**
	 * Test case for {@link Element#getAttributeValue(int)}
	 * <p>
	 * Test if the value of an attribute is correct.
	 */
	@Test
	void testGetAttributeValue() {
		Element element = new Element("", "", 0);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 1);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 2);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 3);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 4);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 5);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 6);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 7);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 8);
		assertEquals("", element.getAttributeValue(0));
		element = new Element("", "", 9);
		assertEquals("", element.getAttributeValue(0));
	}
}

// Element_7Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getTextContentOrNull()} method.
*/
class Element_7Test {
		
	/**
	 * Test case for {@link Element#getTextContentOrNull()}
	 * <p>
	 * Test if the text content is correct.
	 */
	@Test
	void testGetTextContentOrNull() {
		Element element = new Element("", "", 0);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 1);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 2);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 3);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 4);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 5);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 6);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 7);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 8);
		assertEquals("", element.getTextContentOrNull());
		element = new Element("", "", 0, 9);
		assertEquals("", element.getTextContentOrNull());
	}
}

// Element_8Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getFirstChildElementOrNull(String, String)} method.
*/
class Element_8Test {
		
	/**
	 * Test case for {@link Element#getFirstChildElementOrNull(String, String)}
	 * <p>
	 * Test if the first child element is correct.
	 */
	@Test
	void testGetFirstChildElementOrNull() {
		Element element = new Element("", "", 0);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 1);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 2);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 3);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 4);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 5);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 6);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 7);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 8);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
		element = new Element("", "", 0, 9);
		assertEquals(null, element.getFirstChildElementOrNull("", ""));
	}
}

// Element_9Test.java
package nu.