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
/**
		 * Initializes test.
		 * @throws IFXException wrapped by IFXException.
		 */
	@Test
	void initialize() throws IFXException {
		IFXDecoderIF.init(new IFXDecoder());
	}

	/**
	 * Tests the handling of a setXXX method.
	 * @throws IFXException wrapping the original exception thrown.
	 */
	@Test
	void decodeSetXXX() throws IFXException {
		Element element = bundle.getString("beanWithSetXXX");
		Element element2 = bundle.getString("beanWithSetXXX");
		IFXObject obj = IFXDecoder.decode(element);
		IFXObject obj2 = IFXDecoder.decode(element2);
		assertEquals(obj, obj2);
	}

	/**
	 * Tests the handling of a listXXX method.
	 * @throws IFXException wrapping the original exception thrown.
	 */
	@Test
	void decodeListXXX() throws IFXException {
		Element element = bundle.getString("beanWithListXXX");
		Element element2 = bundle.getString("beanWithListXXX");
		IFXObject obj = IFXDecoder.decode(element);
		IFXObject obj2 = IFXDecoder.decode(element2);
		assertEquals(obj, obj2);
	}

	/**
	 * Tests the handling of a listXXX method with parameters.
	 * @throws IFXException wrapping the original exception thrown.
	 */
	@Test
	void decodeListXXXWithParameters() throws IFXException {
		Element element = bundle.getString("beanWithListXXX-Parameters");
		Element element2 = bundle.getString("beanWithListXXX-Parameters");
		IFXObject obj = IFXDecoder.decode(element);
		IFXObject obj2 = IFXDecoder.decode(element2);
		assertEquals(obj, obj2);
	}

	/**
	 * Tests the handling of a setXXX method with parameters.
	 * @throws IFXException wrapping the original exception thrown.
	 */
	@Test
	void decodeSetXXXWithParameters() throws IFXException {
		Element element = bundle.getString("beanWithSetXXX-Parameters");
		Element element2 = bundle.getString("beanWithSetXXX-Parameters");
		IFXObject obj1 = IFXDecoder.decode(element);
		IFXObject obj2 = IFXDecoder.decode(element2);
		assertEquals(obj1, obj2);
	}

	/**
	 * Tests the handling of an element associated with an IFXObject with a setXXX method.
	 * @throws IFXException wrapping the original exception thrown.
	 */
	@Test
	void decodeElementWithSetXXXMethod() throws IFXException {
		Element element = bundle.getString("myBeanElementWithSetXXXMethod");
		Element element2 = bundle.getString("myBeanElementWithSetXXXMethod");
		IFXObject obj = IFXDecoder.decode(element);
		IFXObject obj2 = IFXDecoder.decode(element2);
		assertEquals(obj, obj2);
	}

	/**
	 * Tests the handling of an element associated with an IFXObject with a setXXX method
	 * @throws IFXException if element name cannot be found.
	 */
	@Test
	void decodeElementWithSetXXXMethodMissing() throws IFXException {
		Element element = bundle.getString("myBeanElementWithSetXXXReturnTypeMethod");
		Element element2 = bundle.getString("myBeanElementWithSetXXXReturnTypeMethod");
		IFXObject obj = IFXDecoder.decode(element);
		IFXObject obj2 = IFXDecoder.decode(element2);
		assertNull(obj);
		assertNull(obj2);
	}


	/**
	 * Tests the handling of a list object to a setXXX method.
	 * @throws IFXException wrapping the original exception thrown.
	 */
	@Test
	void decodeListOfObjectsWithSetXXXMethod() throws IFXException {
		IFXObject obj1 = IFXDecoder.decode(bundle.getString("myBean"), IFXObject.class);
		IFXObject obj = IFXDecoder.decode(bundle.getString("myBean"));
		assertEquals(obj, obj1);
	}

	private ResourceBundle bundle;
}