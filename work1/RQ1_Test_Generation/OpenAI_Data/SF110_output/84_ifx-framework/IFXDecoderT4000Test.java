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
	void testDecodeElementWithNoChildren() throws Exception {
		Element element = new Element("IFX");
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with one child.
	*/
	@Test
	void testDecodeElementWithOneChild() throws Exception {
		Element element = new Element("IFX");
		Element childElement = new Element("SignonRq");
		element.addContent(childElement);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with two children.
	*/
	@Test
	void testDecodeElementWithTwoChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		element.addContent(childElement1);
		element.addContent(childElement2);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement1);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement2);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with three children.
	*/
	@Test
	void testDecodeElementWithThreeChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("SignonRq");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement1);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement2);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement3);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with four children.
	*/
	@Test
	void testDecodeElementWithFourChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("SignonRq");
		Element childElement4 = new Element("SignonRs");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement1);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement2);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement3);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement4);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with five children.
	*/
	@Test
	void testDecodeElementWithFiveChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("SignonRq");
		Element childElement4 = new Element("SignonRs");
		Element childElement5 = new Element("SignonRq");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		element.addContent(childElement5);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement1);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement2);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement3);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement4);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement5);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with six children.
	*/
	@Test
	void testDecodeElementWithSixChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("SignonRq");
		Element childElement4 = new Element("SignonRs");
		Element childElement5 = new Element("SignonRq");
		Element childElement6 = new Element("SignonRs");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		element.addContent(childElement5);
		element.addContent(childElement6);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement1);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement2);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement3);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement4);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement5);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement6);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with seven children.
	*/
	@Test
	void testDecodeElementWithSevenChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("SignonRq");
		Element childElement4 = new Element("SignonRs");
		Element childElement5 = new Element("SignonRq");
		Element childElement6 = new Element("SignonRs");
		Element childElement7 = new Element("SignonRq");
		element.addContent(childElement1);
		element.addContent(childElement2);
		element.addContent(childElement3);
		element.addContent(childElement4);
		element.addContent(childElement5);
		element.addContent(childElement6);
		element.addContent(childElement7);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, childElement1);
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement2);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement3);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement4);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement5);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement6);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, childElement7);
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with eight children.
	*/
	@Test
	void testDecodeElementWithEightChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		Element childElement3 = new Element("SignonRq");
		Element childElement4 = new Element("SignonRs");
		Element childElement5 = new Element("SignonRq");
