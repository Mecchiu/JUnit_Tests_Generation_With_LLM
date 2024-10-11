// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains one unit test case for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {
		
	/**
	 * Test the getNameSpace() Method.
	 */
	@Test
	void testGetNamespace() {
		IFXEncoder enc = new IFXEncoder();

		assertFalse(enc.getNameSpace().isEmpty());
		String [] namespaces = enc.getNameSpace().split(";");
		for (int i = 0; i < namespaces.length; i++) {
			assertTrue(namespaces[i].startsWith("xmlns=") || namespaces[i].startsWith("xmlns:xmlns="));
		}
	}

	/**
	 * Test the encode() Method.
	 */
	@Test
	void testEncode() throws IOException, MissingResourceException {
		IFXEncoder enc = new IFXEncoder();

		// Test the encoding of a nested element.
		{
			assertEquals("", enc.encode(new Element("element1", namespaces)));
		}
		// Test the encoding of an element with complex node types. There will be
		// one element per type.
		{
			Element elem = new Element("element1", namespaces);
			elem.addContent("a");
			elem.addContent("b");
			elem.addContent("c");
			elem.addContent("d");

			assertEquals("element1a element1b element1c element1d",
					enc.encode(elem));
		}
	}
}