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
		//public static void main(String args[]) {
		//	IFXDecoderTester.mainIntegrationTest(IFXDecoderTest::getBeanClassName, "IFXDecoderTest.java", true);
		//}

        @Test
        public void getBeanClassName() throws Exception {
            final String beanClassName = "org/sourceforge/ifx/utils/IFXDecoderTest";
            assertSame(IFXObject.class, getBeanClass(beanClassName));
        }

        /**
         * Tries to get the bean class of the class which is the equivalent to the given
         * class name.
         * @param beanClassName a class name.
         * @return the corresponding concrete class.
         * @throws ClassNotFoundException if the bean class could not be found.
         */
        private Class getBeanClass(String beanClassName) throws ClassNotFoundException {
            Class c;
            try {
                c = Class.forName(beanClassName);
            } catch (ClassNotFoundException e) {
                // We won't want to swallow ClassNotFoundException because the bean class may have
                // some extra details which is not interesting for the decoder and therefore
                // we don't want to worry about that.
                //assert(false);
                throw e;
            }
            return c;
        }

        /**
         * Returns an array holding a list of the sub elements of a given element,
         * where the current element is the element with the given ID.
         * The first element of an array is the element with a "null" value, it indicates
         * that it has no corresponding element with that name.
         *
         * @param element the child element.
         * @param id the child element ID.
         * @return the array.
         * @throws MissingResourceException if there is no such element.
         */
        private Element[] getChildElements(Element element, String id) throws MissingResourceException {
            Element child = element.getChild(id);
            return (child == null)? null : child.getChildren();
        }

        /**
         * Returns a list of elements matching a given element name, based on the
         * specified order.
         *
         * @param element the element to match.
         * @param order the list of elements matching the ID to match.
         * @return a list of child elements matching the element name.
         * @exception MissingResourceException if there is no such element.
         */
        private List<?> getChildrenElements(Element element, String elementID, String order) throws MissingResourceException {
            Element child = element.getChild(elementID);
            if (order.equals("null")) {
                if (child == null)
                    return null;
                else
                    return child.getChildren();
            }
            else {
                List<Object> elements = child.getChildren();
                Iterator<Object> it = elements.iterator();
                Object item = it.next();
                if (order.equals("null")) {
                    while (it.hasNext() &&!(item.equals(null) || item instanceof IFXString))
                        item = it.next();
                } else {
                    while (it.hasNext()) {
                        if (item.equals(it.next()))
                            break;
                    }
                }
                if (it.hasNext() || item.equals(null) || item instanceof IFXString)
                    return elements;
                else
                    return null;
            }
        }
}