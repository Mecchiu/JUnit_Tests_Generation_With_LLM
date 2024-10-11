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
	void testDecode_OneChild() throws Exception {
		Element element = new Element("IFX");
		Element childElement = new Element("SignonRq");
		element.addContent(childElement);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, "SignonRq");
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with two children.
	*/
	@Test
	void testDecode_TwoChildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement1 = new Element("SignonRq");
		Element childElement2 = new Element("SignonRs");
		element.addContent(childElement1);
		element.addContent(childElement2);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, "SignonRq");
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, "SignonRs");
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with three children.
	*/
	@Test
	void testDecode_ThreeChildren() throws Exception {
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
		Method accessorMethod = getAccessor(ifxObject, "SignonRq");
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(ifxObject, "SignonRs");
		retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRs", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with one child and one grandchild.
	*/
	@Test
	void testDecode_OneChildOneGrandchild() throws Exception {
		Element element = new Element("IFX");
		Element childElement = new Element("SignonRq");
		Element grandchildElement = new Element("ClientDt");
		childElement.addContent(grandchildElement);
		element.addContent(childElement);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, "SignonRq");
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(retValObj, "ClientDt");
		retValObj = accessorMethod.invoke(retValObj, null);
		assertEquals("org.sourceforge.ifx.basetypes.IFXDate", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with one child and two grandchildren.
	*/
	@Test
	void testDecode_OneChildTwoGrandchildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement = new Element("SignonRq");
		Element grandchildElement1 = new Element("ClientDt");
		Element grandchildElement2 = new Element("ClientApp");
		childElement.addContent(grandchildElement1);
		childElement.addContent(grandchildElement2);
		element.addContent(childElement);
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(element);
		assertEquals("org.sourceforge.ifx.framework.IFX", ifxObject.getClass().getName());
		Method accessorMethod = getAccessor(ifxObject, "SignonRq");
		Object retValObj = accessorMethod.invoke(ifxObject, null);
		assertEquals("org.sourceforge.ifx.framework.SignonRq", retValObj.getClass().getName());
		accessorMethod = getAccessor(retValObj, "ClientDt");
		retValObj = accessorMethod.invoke(retValObj, null);
		assertEquals("org.sourceforge.ifx.basetypes.IFXDate", retValObj.getClass().getName());
		accessorMethod = getAccessor(retValObj, "ClientApp");
		retValObj = accessorMethod.invoke(retValObj, null);
		assertEquals("org.sourceforge.ifx.framework.ClientApp", retValObj.getClass().getName());
	}
	
	/**
	* Test case for {@link IFXDecoder#decode(Element)} method.
	* It tests the decoding of an element with one child and three grandchildren.
	*/
	@Test
	void testDecode_OneChildThreeGrandchildren() throws Exception {
		Element element = new Element("IFX");
		Element childElement = new Element("SignonRq");
		Element grandchildElement1 = new Element("ClientDt");
		Element grandchildElement2 = new Element("ClientApp");
		Element grandchild