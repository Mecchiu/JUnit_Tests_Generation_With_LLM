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
		// IFXDecoderTest Test Class.

    @Test
    public void emptyDecodeTest() throws Throwable {

        IFXObject obj = new IFXString("<string>");

        IFXObject object = IFXDecoder.decode(obj);

        assertNotNull(object);
        assertEquals( "IFXDecoderTest.TstClass2x2MISSINGPROP", false,
                      obj.getClass().getName().startsWith("IFXDecoderTest"));

        // IFXDecoderTest Test Method.

    }

    @Test
    public void oneChildDecodeTest() throws Throwable {

        IFXObject obj = new IFXString("<string>");

        List children = null;

        IFXObject resultObject = obj.setChildElement("<children>", children);

        assertNotNull(resultObject);

        obj = resultObject;
        List child = obj.getChild();
       assertNotNull(child);
       assertEquals( "IFXDecoderTest.TstClass1x1DECODENOTNULL", false,
                      obj.getClass().getName().startsWith("IFXDecoderTest"));

        obj = obj.setChildElement("<children>", child);

        resultObject = obj.getChild();

        assertNotNull(resultObject);
        assertEquals( "IFXDecoderTest.TstClass1x1DECODENOTNULL", true, resultObject.getClass().getName().startsWith("IFXDecoderTest"));

        // IFXDecoderTest Test Method.

    }

    @Test
    public void setBeanValueTest() throws Throwable {

        IFXObject obj = new IFXString("<string>");

        IFXObject resultObject = obj.setBeanValue("<string>", "");
        assertNotNull(resultObject);
        assertEquals( "IFXDecoderTest.TstClass1x1BEANVALUENOTNULL", false,
                      resultObject.getClass().getName().startsWith("IFXDecoderTest"));

        // IFXDecoderTest Test Method.

    }

    @Test
    public void setBeanValueValueNotTypeTest() throws Throwable {

        IFXObject obj = new IFXString("<string>");

        IFXObject resultObject = obj.setBeanValue("<string>", 1234);
        assertNotNull(resultObject);
        assertEquals( "IFXDecoderTest.TstClass1x1BEANVALUENOTTYPE", false,
                      resultObject.getClass().getName().startsWith("IFXDecoderTest"));

        // IFXDecoderTest Test Method.

    }

    /**
     * A single element, which is the name of the element as returned from
     * {@link IFXObject#getAttributeValue(String)}.
     */
    static class TstClass1x1Element {
        private static String ATTRIBUTE_NAME = "name";

        private String name;

        /**
         * Constructs a test of the element with its expected name.
         * @param obj an IFXObject.
         * @param value the value for the element.
         */
        public TstClass1x1Element(IFXObject obj, String value) {
            name = value;
        }
    }

    /** Test of setBeanValue method for a String element. */
    @Test
    public void setBeanValueStringTest() throws Throwable {

        IFXObject obj = new IFXString("<string>");

        IFXObject resultObject = obj.setBeanValue(IFXString.class.getName(), "");
        assertNotNull(resultObject);
        assertEquals( "IFXDecoderTest.TstClass1x1BEANVALUETYPE", false,
                      resultObject.getClass().getName().startsWith("IFXDecoderTest"));

        // IFXDecoderTest Test Method.

    }

    /** Test of getBeanValue method for a String element. */
    @Test
    public void getBeanValueStringTest() throws Throwable {

        IFXObject obj = new IFXString("<string>");

        IFXObject resultObject = obj.getBeanValue(IFXString.class.getName());
        assertNotNull(resultObject);
        assertEquals( "IFXDecoderTest.TstClass1x1BEANVALUETYPE", false,
                      resultObject.getClass().getName().startsWith("IFXDecoderTest"));

        // IFXDecoderTest Test Method.

    }

    @Test
    public void getBeanValueTypeNotNullTest() throws Throwable {

        IFXObject obj = new IFXString("<string>");

}
}