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
	* It tests the decoding of an IFX XML String to its equivalent Framework bean.
	*/
	@Test
	void testDecode() throws IFXException {
		IFXDecoder decoder = new IFXDecoder();
		IFXObject obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-1.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-2.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-3.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-4.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-5.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-6.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-7.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-8.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-9.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-10.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an IFX XML String to its equivalent Framework bean.
	*/
	@Test
	void testDecode2() throws IFXException {
		IFXDecoder decoder = new IFXDecoder();
		IFXObject obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-11.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-12.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-13.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-14.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-15.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-16.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-17.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-18.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-19.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-20.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an IFX XML String to its equivalent Framework bean.
	*/
	@Test
	void testDecode3() throws IFXException {
		IFXDecoder decoder = new IFXDecoder();
		IFXObject obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-21.xml"));
		assertEquals("org.sourceforge.ifx.basetypes.IFXString", obj.getClass().getName());
		assertEquals("Hello World", ((IFXString) obj).getString());
		obj = decoder.decode(IFXDecoderTest.getElement("ifx-test-22.xml"));
		assertEquals("org.sourceforge.ifx