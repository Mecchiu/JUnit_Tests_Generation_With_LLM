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
	 *
	 * @exception IFXException wrapper for underlying exception.
	 */
	@Test
	public void testDecodeSimple() throws IFXException {
		IFXDecoder decoder = new IFXDecoder();
		IFXObject ifxObject = decoder.decode(getElement("simple.xml"));
		assertEquals("IFXObject", ifxObject.getClass().getName());
		assertEquals("IFXString", ifxObject.getName().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
		assertEquals("IFXString", ifxObject.getValue().getClass().getName());
}
}