// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains one unit test case for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {
		
    /**
     * Test case for <code>encode()</code> method.
     */
    @Test
    public void encodeTest() throws Exception {
        IFXObject object = new IFXObject();
        object.setName("test object");
        object.setKind(1);
        object.setValue("test value");

        IFXObject object2 = new IFXObject();
        object2.setName("test object2");
        object2.setKind(1);
        object2.setValue("test value2");

        List accessors = new ArrayList();
        accessors.add(object.getAccessors());
        accessors.add(object2.getAccessors());

        object.setAccessors(accessors);

        IFXObject result = encode(object, object.getAccessors(), "UTF8");
        assertNull(result);

        resourceBundle = new Bundle("test.resource", "en");
        object.encode(resourceBundle, "UTF8");
        result = encode(object2, object2.getAccessors(), "UTF8");
        assertNull(result);
    }

    /**
     * Test case for <code>encode()</code> method.
     */
    @Test
    public void encodeTest_withList() throws Exception {
        IFXObject object = new IFXObject();
        object.setName("test object");
        object.setKind(1);
        object.setValue("test value");

        List accessors = new ArrayList();
        accessors.add(object.getAccessors());
        accessors.add(new ArrayList());
        accessors.add(new HashMap());

        object.setAccessors(accessors);

        IFXObject result = encode(object, object.getAccessors(), "UTF8");
        assertTrue(result instanceof Element);

        element = new Element(((Element) result).getName());
        result = encode(object, object.getAccessors(), "");
        assertTrue(result instanceof Element);
    }

    /**
     * Test case for <code>encode()</code> method.
     */
    @Test
    public void encodeTest_named() throws Exception {
        IFXObject object = new IFXObject();
        object.setName("abc");
        object.setKind(1);
        object.setValue("abc");

        list = encode(object, object.getAccessors(), "UTF8");
        assertTrue(list.size() == 2);
    }

    /**
     * Test case for <code>stringToString()</code> method.
     */
    @Test
    public void stringToStringTest() throws IFXException {
        IFXObject object = new IFXObject();
        object.setName("test object");
        object.setKind(1);

        try {
            object.stringToString((String) null);
            fail("Exception expected");
        } catch (NullPointerException e) {
        }

        try {
            object.stringToString(new Object());
            fail("Exception expected");
        } catch (IOException e) {
        }

        try {
            object.stringToString("abc");
            fail("Exception expected");
        } catch (IOException e) {
        }

        try {
            object.stringToString(list);
            fail("Exception expected");
        } catch (IOException e) {
        }

        try {
            object.stringToString("abc");
            fail("Exception expected");
        } catch (IOException e) {
        }
    }

}