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
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple2() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple3() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple4() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple5() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple6() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple7() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple8() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple9() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
	
	/**
	 * Test case for {@link IFXDecoder#decode(Element)} method.
	 * It tests the decoding of a simple IFX XML String to its equivalent bean.
	 */
	@Test
	public void testDecodeSimple10() throws Exception {
		IFXDecoder decoder = new IFXDecoder();
		Element element = new Element("IFX");
		Element child = new Element("IFXString");
		child.setText("Hello World");
		element.addContent(child);
		IFXObject ifxObject = decoder.decode(element);
		assertTrue(ifxObject instanceof IFXString);
		assertEquals("Hello World", ((IFXString)ifxObject).getValue());
	}
}