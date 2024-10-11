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
		/*
		Decodes the element into its equivalent Framework bean.
		*/
		@Test
	public void Test() throws Exception {
				ResourceBundle bundle = ResourceBundle.getBundle("org.sourceforge.ifx.utils.IFXDecoderTest");

				try {
				Element element = new Element("Element", Element.ELEMENT_NODE, "Elements");
				Class c = Class.forName("java.lang.reflect.Method");
				Method m = c.getDeclaredMethod("getAccessor", new Class[] {Element.class});
				Object o = m.invoke(null, new Object[] {element});
				Element result = (Element) o;
				assertTrue ("Element not correctly decoded", result.getText().equals("test"));
				}

             catch (MissingResourceException e) {
                System.err.println(e);
                fail();
            }
    }

			/*
			Returns the accessor method corresponding to the element name for the given parent method.
			*/
			@Test(expected = RuntimeException.class)
    protected Object getAccessor(Class<?> c, String name) {
				Method m = c.getDeclaredMethod(name);
                Object o = m.invoke(null, new Object[] { Element.getType(name) });
                return o;
			}

					/*
					Accesses the element object for a given element name.
					*/
					@Test(expected = RuntimeException.class)
    protected Object getAccessor(Class<?> c, String name, String sub, String sub1) {
				Method m = c.getDeclaredMethod(name, new Class[] {Element.getType(name), Element.getType(sub), Element.getType(sub1)});
                Object o = m.invoke(null, new Object[] { Element.getType(name), Element.getType(sub), Element.getType(sub1) });
                return o;
			}

}