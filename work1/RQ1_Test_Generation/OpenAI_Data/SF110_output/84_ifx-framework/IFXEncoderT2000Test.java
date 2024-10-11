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
* It contains ten unit test cases for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {

	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject.
	*/
	@Test
	void testEncodeSimpleIFXObject() throws Exception {
		IFXEncoder encoder = new IFXEncoder();
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace2() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace3() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace4() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace5() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace6() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace7() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace8() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace9() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
		assertEquals("ifx", element.getNamespacePrefix());
		assertEquals("http://www.ifxforum.org/ifx", element.getNamespaceURI());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a namespace.
	*/
	@Test
	void testEncodeSimpleIFXObjectWithNamespace10() throws Exception {
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx");
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
	