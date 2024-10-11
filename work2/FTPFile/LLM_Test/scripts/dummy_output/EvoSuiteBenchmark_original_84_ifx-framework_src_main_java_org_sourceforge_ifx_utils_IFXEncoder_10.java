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
	void testEncodeForClassObject() throws Exception
	{
		ClassLoader classLoader = getClass().getClassLoader();
		Class<IFXObject> objClass = IFXObject.class;
		Class<?>[] excludedClasses = new Class<?>[] {
					IBaseType.class,
			Element.class,
			Iterator.class,
			List.class,
			Map.class,
			HashMap.class,
			ArrayList.class,
			Array.class,
			Hash.class,
			Iterator.class,
			List.class
		};
		Object obj = new Object();

		ArrayList<Element> elements = new ArrayList<Element>(objClass.getDeclaredFields());
		Map<String, String> elementsNamespaces = new HashMap<String, String>();
		objClass.getDeclaredFields().forEach( f -> elementsNamespaces.put(f.getName(),f.getDeclaringClass().getSimpleName()));
		//System.out.println("ELEMENTS CLASS="+elements.getClass(0).getName());
		// System.out.println("ELEMENTS:");
		//System.out.println(elements);
		//System.out.println("ELEMENTS NAMESPACES="+elementsNamespaces);
		Object object = new Object();
		List<BaseType> list1 = new ArrayList<BaseType>();
	}

    @Test
    void testEncodeForClassArray() throws Exception
	{
		ClassLoader classLoader = getClass().getClassLoader();
		Class<IFXArray> objClass = IFXArray.class;
		Class<?>[] excludedClasses = new Class<?>[] {
					IBaseType.class,
			Iterator.class
		};
		Object obj = new Object();
		
		ArrayList<Element> elements = new ArrayList<Element>(objClass.getDeclaredFields());
		Map<String, String> elementsNamespaces = new HashMap<String, String>();
		objClass.getDeclaredFields().forEach( f -> elementsNamespaces.put(f.getName(),f.getDeclaringClass().getSimpleName()));
		//System.out.println("ELEMENTS CLASS="+elements.getClass(0).getName());
		//System.out.println("ELEMENTS:");
		//System.out.println(elements);
        
        //System.out.println("ELEMENTS NAMESPACES="+elementsNamespaces);
        //System.out.println("ELEMENTS:"+elements);
		Object array = new Object();
		Object[] objList = new Object[] {
			new Object()
		};
    }

	@Test
	void testEncodeForClassMap() throws Exception
	{
		ClassLoader classLoader = getClass().getClassLoader();
		Class<IFXHashMap> objClass = IFXHashMap.class;
		Class<?>[] excludedClasses = new Class<?>[] {
					IBaseType.class,
		};
	}

	@Test
	void testEncodeForClassHashMap() throws Exception
	{
		ClassLoader classLoader = getClass().getClassLoader();
		Class<IFXHashMap> objClass = IFXHashMap.class;
		Class<?>[] excludedClasses = new Class<?>[] {
					IBaseType.class
		};
	}

	@Test
	void testEncodeForClassHash() throws Exception
	{
		ClassLoader classLoader = getClass().getClassLoader();
}
}