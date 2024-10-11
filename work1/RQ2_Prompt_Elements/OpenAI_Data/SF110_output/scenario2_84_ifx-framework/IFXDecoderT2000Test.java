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
* It contains ten unit test cases for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {

	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with no children.
	*/
	@Test
	void testDecode_NoChildren() throws Exception {
		Element element = new Element("IFXString");
		element.setText("Hello World");
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with children.
	*/
	@Test
	void testDecode_WithChildren() throws Exception {
		Element element = new Element("IFXString");
		Element childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with children.
	*/
	@Test
	void testDecode_WithChildren_Array() throws Exception {
		Element element = new Element("IFXString");
		Element childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with children.
	*/
	@Test
	void testDecode_WithChildren_Array_Id() throws Exception {
		Element element = new Element("IFXString");
		element.setAttribute("Id", "12345");
		Element childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with children.
	*/
	@Test
	void testDecode_WithChildren_Array_Id_Nested() throws Exception {
		Element element = new Element("IFXString");
		element.setAttribute("Id", "12345");
		Element childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with children.
	*/
	@Test
	void testDecode_WithChildren_Array_Id_Nested_Array() throws Exception {
		Element element = new Element("IFXString");
		element.setAttribute("Id", "12345");
		Element childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with children.
	*/
	@Test
	void testDecode_WithChildren_Array_Id_Nested_Array_Nested() throws Exception {
		Element element = new Element("IFXString");
		element.setAttribute("Id", "12345");
		Element childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with children.
	*/
	@Test
	void testDecode_WithChildren_Array_Id_Nested_Array_Nested_Array() throws Exception {
		Element element = new Element("IFXString");
		element.setAttribute("Id", "12345");
		Element childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		childElement = new Element("IFXString");
		childElement.setText("Hello World");
		element.addContent(childElement);
		IFXObject obj = new IFXDecoder().decode(element);
		assertTrue(obj instanceof IFXString);
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode