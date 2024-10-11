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
		
    @Test
    void testCreateDummy() throws Exception {
        final int INPUT_SIZE = 1024 * 3;
        final Object O = new Object();
        final IFXObject o = new IFXObject(INPUT_SIZE * 4, INPUT_SIZE);
        final IFXObject n = new IFXObject(INPUT_SIZE * 4);
        final IFXObject oo = new IFXObject() {
        	@Override
            protected void encodeBody(Writer writer, List values) throws IOException {
                writer.write(encodeFromCollection(values));
            }
        };

        final IFXObject t = new IFXObject(INPUT_SIZE * 30);
        final IFXObject tt = new IFXObject(INPUT_SIZE * 30);

        o.set(INPUT_SIZE, t);

        assertEquals(n, o);
        assertEquals(n, t);
        assertSame(n, oo);

        assertEquals(oo, o.clone());
        assertSame(oo, oo.clone());

        final IFXObject result = encodeFromCollection(o);
        assertEquals(o, result);
        assertSame(o, result.clone());


		// test cloning
		final IFXObject result2 = encodeFromCollection(oo.clone());
		assertEquals(oo, result2);
		assertSame(oo, result2.clone());

		// test cloning with a non-deterministic clone()
		final Object result3 = new ArrayList().clone();

        // test cloning a map
        final Map m = new HashMap(2);
        m.put(INPUT_SIZE + o.get().get(INPUT_SIZE), t);

        // test cloning a List
        java.util.List l = new ArrayList();
        l.add(INPUT_SIZE);
        l.add(OO);

        final List result4 = encodeFromCollection(l.clone());

        // test cloning a List
        l = new ArrayList(INPUT_SIZE);
        l.add(INPUT_SIZE);
        l.add(OO);
        l.add(new IFXObject(INPUT_SIZE + o.get().get(INPUT_SIZE)));
       

        assertEquals(l, result4);

        o.set(INPUT_SIZE + t.get(INPUT_SIZE), t);

        // test cloning non-deterministic
        final IFXObject result42 = result4.clone();

        check(result42, t, o);
    }

    @Test
    void testRemoveNonStringFields() {
        final IFXObject o = new IFXObject(INPUT_SIZE * 4);

        o.remove(new IFXField("f"));
        assertEquals(0, check(o.getInt(new IFXField("f")), -1));
        o.remove(IFXObject.ATTR_FIELD_NAMESPACE);
        assertEquals(0, check(o.getInt(new IFXField("f")), -1));
        o.remove(IFXObject.ATTR_FIELD, new IFXField[] {IFXObject.ATTR_FIELD});
        assertEquals(0, check(o.getInt(new IFXField("f")), -1));
        o.remove(new IFXField());
        assertEquals(0, check(o.getInt(new IFXField("f")), -1));
    }

    @Test
    void testEncodeNoListElements() throws IOException {
}
}