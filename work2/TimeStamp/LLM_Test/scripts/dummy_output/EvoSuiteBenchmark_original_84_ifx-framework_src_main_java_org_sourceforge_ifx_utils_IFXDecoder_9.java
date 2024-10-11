// IFXDecoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDecoder}.
* It contains one unit test case for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {
		private IFXDecoder decoder;

	// --------------------------------------------------------------------------
	// Test cases
	// --------------------------------------------------------------------------

	/**
	 * Test the decoding of an XML element.
	 */
	@Test
    public void testDecodeElement() throws MissingResourceException,
			MissingRequiredAttributeException, CannotInstantiateException {
        // Create a setXXX method object containing two mutators (setBean() and getBean()).
		decoder = new IFXDecoder();
		
		// Create the Element object with a name starting from "setBean()"
		Element element = new Element("setBean");
		element.setAttribute("key", "value");
		
		// Create a setXXX method object with a different name.
		Method mutator1 = decoder.getMutator("setBean()");
		Element element1 = new Element("setBean");
		element1.setAttribute("key", "value");
		
		// Create another setXXX method object with a different name.
		Method mutator2 = decoder.getMutator("getBean()");
		Element element2 = new Element("getBean");
		element2.setAttribute("key", "value");
		
		// Add mutation tests
		ArrayList<Element> mutations = new ArrayList<Element>();
		mutations.add(element);
		mutations.add(element1);
		mutations.add(element2);
		
		// Check the setXXX method objects can be decoded as expected.
		assertTrue("Elements not decoded correctly", decoder.decode(element.getRootElement())
			.getID().equals(decoder.decode(mutators.get(0)).getID()));
		assertTrue("Elements not decoded correctly", decoder.decode(element1.getRootElement())
			.getID().equals(decoder.decode(mutators.get(1)).getID()));
		assertTrue("Elements not decoded correctly", decoder.decode(element2.getRootElement())
			.getID().equals(decoder.decode(mutators.get(2)).getID()));
		
		// Check that the list of mutations has the correct number
		assertTrue("Mutations count wrong", mutations.size() == decoder.decode(element.getRootElement()).getMutations().size());
	}

	// --------------------------------------------------------------------------
	// Inner classes
	// --------------------------------------------------------------------------
    public static class ElementTest {
		@Test
    public void getBeanClassName() throws Exception {
			IFXDecoder decoder = new IFXDecoder();
			String result = decoder.getBeanClassName(new Element("test"));
			assertFalse("No return value", result == null);
			assertTrue("Null return value", "org/sourceforge/ifx/utils/IFXDecoderTest$ElementTest".equals(result));
		}

		@Test
    public void getMutator() throws Exception {
			IFXDecoder decoder = new IFXDecoder();
			assertTrue("Has only 1 setXXX method!", 
				decoder.getMutator("setBean()") == decoder.getMutator("getBean()"));
		}

		// Inner classes are defined by interfaces
		public static class IBeanTest {
			@Test
			public void mutator() throws Exception {
				IFXDecoder decoder = new IFXDecoder();
				decoder.mutateElement(new Element("test"));
			}
		}
	}
}