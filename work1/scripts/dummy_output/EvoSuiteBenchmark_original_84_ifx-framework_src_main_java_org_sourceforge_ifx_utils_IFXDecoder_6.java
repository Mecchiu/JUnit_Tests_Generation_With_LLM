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
     * Decodes the element into its equivalent IFX XML representation.
     * @param element the Element to decode.
     * @return an IFXObject.
	* @throws IFXException wrapped for exception.
     */
    private static IFXObject decode(Element element) throws IFXException {
		try {
			Object decodedObj = ElementDecoder.decode(element);
			Element targetElement = (Element) decodedObj;
			
			return new IFXObject(IFXObject.IFX_TYPE, targetElement);
		} catch (ClassCastException cce) {
			throw new IFXException("error: incorrect element type", cce);
		}
	}

	/**
     * Returns a single setXXX Method object corresponding to the IFXObject
     * and childElement.
     * @param obj the IFXObject.
     * @param childElement the element corresponding to the mutator method.
     * @return a setXXX method object.
     * @exception IFXException if there was a problem getting the mutators.
     */
    private static Method getMutator(IFXObject obj, Element childElement) throws IFXException {
		if (obj.getClass() == IFXString.class) {
			return IFXDecoder.getMutator((IFXString) obj, childElement);
		} else if (obj.getClass() == IBaseType.class) {
			return IFXDecoder.getMutator((IBaseType) obj, childElement);
		}
        throw new IFXException("error: not an IFXString or IBaseType: " + obj);
    }

    /**
     * Returns the accessor method associated with the given element name.
     * @param obj an IFXObject.
     * @param element the element object.
     * @return a setXXX method object associated with the element.
     * @exception IFXException wraps the original exception thrown.
     */
    private static Method getAccessor(IFXObject obj, Element element) throws IFXException {
        if (obj.getClass() == IFXString.class) {
            return IFXDecoder.getAccessor((IFXString) obj, element);
        } else if (obj.getClass() == IBaseType.class) {
            return IFXDecoder.getAccessor((IBaseType) obj, element);
        }
        throw new IFXException("error: not an IFXString or IBaseType: " + obj);
    }

    /**
     * Returns the element name from a bean class name.
     * @param element the Element to decode.
     * @return the element name.
     * @exception IFXException if bean class name could not be found.
     */
    private static String getBeanClassName(Element element) throws IFXException {
		try {
			return ElementDecoder.getBeanClassName(element);
		} catch (ClassCastException cce) {
			throw new IFXException("error: incorrect element type", cce);
		}
	}
}