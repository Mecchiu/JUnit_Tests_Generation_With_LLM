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
		private IFXEncoder encoder = new IFXEncoder();
		private Element doc;
     	private ResourceBundle bundle;
	   	private Element element;
        private Element output;
        private ResourceBundle bundle2;
        private Writer writer;
        
    @Test
    public void testNull() throws IFXException, IOException {
        Object obj = encoder.encode(IFXObject.NULL);
        assertNotNull(obj);
    }
    
    @Test
    public void testSet() throws IFXException, MissingResourceException,
            IOException {
        Object obj = encoder.encode(IFXObject.NULL);
        obj = encoder.encode(obj);
//        System.out.println(encoder.encode(obj));
        assertNotNull(obj);
    }
    
    @Test
    public void testArray() throws IFXException, IOException {
        Object obj = encoder.encode(IFXArray.NULL);
        obj = encoder.encode(obj);
        assertNotNull(obj);
    }

    @Test
    public void testSetArray() throws IFXException, MissingResourceException,
            IOException {
        Object obj = encoder.encode(IFXArray.NULL);
        obj = encoder.encode(obj);
//        System.out.println(encoder.encode(obj));
        assertNotNull(obj);
    }

	@Test
	public void testArrayList() throws IFXException, IOException {
		List list = encoder.encode(new ArrayList());
		list = encoder.encode(list);
//        System.out.println(encoder.encode(list));
        assertNotNull(list);
		assertEquals(list.size(), 4);
		assertEquals((Integer) 1, list.get(0));
        assertNull(list.get(1));
	}

	@Test
	public void testList() throws IFXException, IOException {
		List list = encoder.encode(new ArrayList());
		list = encoder.encode(list);
//        System.out.println(encoder.encode(list));
        assertNotNull(list);
		assertEquals(list.size(), 4);
        assertIsCollectionOfSize(list, 0);
	}

	@Test
	public void testListOfIFXObjects() throws IFXException, IOException {
		List list = encoder.encode(IFXArray.NULL);
		list = encoder.encode(list);
//        System.out.println(encoder.encode(list));
        assertNotNull(list);
        assertEquals(list.size(), 4);
		assertIsCollectionOfSize(list, 1);
        List<?> arrayOfIFXObjects =	encoder
		.getAccessors((IFXObject) list.get(list.size() - 1));
        assertNotNull(arrayOfIFXObjects);
        assertEquals(arrayOfIFXObjects.size(), 1);
	}

	@Test
	public void testMap() throws IFXException, IOException {
		Map map = encoder.encodeMap();
//        System.out.println(encoder.encode(map));
        assertNotNull(map);
        assertEquals(map.size(), 4);
		assertIsMapOfSize(map, 0);
	}

	@Test
	public void testMapOfIFXObjects() throws IFXException, IOException {
}
}