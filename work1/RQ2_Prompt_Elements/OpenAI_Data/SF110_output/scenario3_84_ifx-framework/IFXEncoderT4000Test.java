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
* It contains ten unit test cases for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {

	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject.
	*/
	@Test
	public void testEncodeSimpleIFXObject() throws Exception {
		IFXObject obj = new IFXObject();
		obj.setString("string", "string");
		obj.setInt("int", 1);
		obj.setLong("long", 2);
		obj.setFloat("float", 3.0f);
		obj.setDouble("double", 4.0);
		obj.setBoolean("boolean", true);
		obj.setDate("date", new java.util.Date());
		obj.setObject("object", new Object());
		obj.setArray("array", new String[] {"one", "two", "three"});
		obj.setList("list", new ArrayList());
		obj.setMap("map", new HashMap());
		obj.setIFXObject("ifxobject", new IFXObject());
		Element element = new IFXEncoder().encode(obj);
		assertNotNull(element);
		assertEquals("IFXObject", element.getName());
		assertEquals(12, element.getChildren().size());
		assertEquals("string", element.getChild("string").getText());
		assertEquals("1", element.getChild("int").getText());
		assertEquals("2", element.getChild("long").getText());
		assertEquals("3.0", element.getChild("float").getText());
		assertEquals("4.0", element.getChild("double").getText());
		assertEquals("true", element.getChild("boolean").getText());
		assertNotNull(element.getChild("date").getText());
		assertEquals("Object", element.getChild("object").getText());
		assertEquals(3, element.getChild("array").getChildren().size());
		assertEquals(0, element.getChild("list").getChildren().size());
		assertEquals(0, element.getChild("map").getChildren().size());
		assertEquals(0, element.getChild("ifxobject").getChildren().size());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a complex IFXObject.
	*/
	@Test
	public void testEncodeComplexIFXObject() throws Exception {
		IFXObject obj = new IFXObject();
		obj.setString("string", "string");
		obj.setInt("int", 1);
		obj.setLong("long", 2);
		obj.setFloat("float", 3.0f);
		obj.setDouble("double", 4.0);
		obj.setBoolean("boolean", true);
		obj.setDate("date", new java.util.Date());
		obj.setObject("object", new Object());
		obj.setArray("array", new String[] {"one", "two", "three"});
		obj.setList("list", new ArrayList());
		obj.setMap("map", new HashMap());
		obj.setIFXObject("ifxobject", new IFXObject());
		IFXObject obj2 = new IFXObject();
		obj2.setString("string", "string");
		obj2.setInt("int", 1);
		obj2.setLong("long", 2);
		obj2.setFloat("float", 3.0f);
		obj2.setDouble("double", 4.0);
		obj2.setBoolean("boolean", true);
		obj2.setDate("date", new java.util.Date());
		obj2.setObject("object", new Object());
		obj2.setArray("array", new String[] {"one", "two", "three"});
		obj2.setList("list", new ArrayList());
		obj2.setMap("map", new HashMap());
		obj2.setIFXObject("ifxobject", new IFXObject());
		obj.setIFXObject("ifxobject2", obj2);
		Element element = new IFXEncoder().encode(obj);
		assertNotNull(element);
		assertEquals("IFXObject", element.getName());
		assertEquals(13, element.getChildren().size());
		assertEquals("string", element.getChild("string").getText());
		assertEquals("1", element.getChild("int").getText());
		assertEquals("2", element.getChild("long").getText());
		assertEquals("3.0", element.getChild("float").getText());
		assertEquals("4.0", element.getChild("double").getText());
		assertEquals("true", element.getChild("boolean").getText());
		assertNotNull(element.getChild("date").getText());
		assertEquals("Object", element.getChild("object").getText());
		assertEquals(3, element.getChild("array").getChildren().size());
		assertEquals(0, element.getChild("list").getChildren().size());
		assertEquals(0, element.getChild("map").getChildren().size());
		assertEquals(0, element.getChild("ifxobject").getChildren().size());
		assertEquals(12, element.getChild("ifxobject2").getChildren().size());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a null value.
	*/
	@Test
	public void testEncodeSimpleIFXObjectWithNullValue() throws Exception {
		IFXObject obj = new IFXObject();
		obj.setString("string", null);
		obj.setInt("int", 1);
		obj.setLong("long", 2);
		obj.setFloat("float", 3.0f);
		obj.setDouble("double", 4.0);
		obj.setBoolean("boolean", true);
		obj.setDate("date", new java.util.Date());
		obj.setObject("object", new Object());
		obj.setArray("array", new String[] {"one", "two", "three"});
		obj.setList("list", new ArrayList());
		obj.setMap("map", new HashMap());
		obj.setIFXObject("ifxobject", new IFXObject());
		Element element = new IFXEncoder().encode(obj);
		assertNotNull(element);
		assertEquals("IFXObject", element.getName());
		assertEquals(12, element.getChildren().size());
		assertNull(element.getChild("string"));
		assertEquals("1", element.getChild("int").getText());
		assertEquals("2", element.getChild("long").getText());
		assertEquals("3.0", element.getChild("float").getText());
		assertEquals("4.0", element.getChild("double").getText());
		assertEquals("true", element.getChild("boolean").getText());
		assertNotNull(element.getChild("date").getText());
		assertEquals("Object", element.getChild("object").getText());
		assertEquals(3, element.getChild("array").getChildren().size());
		assertEquals(0, element.getChild("list").getChildren().size());
		assertEquals(0, element.getChild("map").getChildren().size());
		assertEquals(0, element.getChild("ifxobject").getChildren().size());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a complex IFXObject with a null value.
	*/
	@Test
	public void testEncodeComplexIFXObjectWithNullValue() throws Exception {
		IFXObject obj = new IFXObject();
		obj.setString("string", "string");
		obj.setInt("int", 1);
		obj.setLong("long", 2);
		obj.setFloat("float", 3.0f);
		obj.setDouble("double", 4.0);
		obj.setBoolean("boolean", true);
		obj.setDate("date", new java.util.Date());
		obj.setObject("object", new Object());
		obj.setArray("array", new String[] {"one", "two", "three"});
		obj.setList("list", new ArrayList());
		obj.setMap("map", new HashMap());
		obj.setIFXObject("ifxobject", new IFXObject());
		IFXObject obj2 = new IFXObject();
		obj2.setString("string", null);
		obj2.setInt("int", 1);
		obj2.setLong("long", 2);
		obj2.setFloat("float", 3.0f);
		obj2.setDouble("double", 4.0);
		obj2.setBoolean("boolean", true);
		obj2.setDate("date", new java.util.Date());
		obj2.setObject("object", new Object());
		obj2.setArray("array", new String[] {"one", "two", "three"});
		obj2.setList("list", new ArrayList());
		obj2.setMap("map", new HashMap());
		obj2.setIFXObject("ifxobject", new IFXObject());
		obj.setIFXObject("ifxobject2", obj2);
		Element element = new IFXEncoder().encode(obj);
		assertNotNull(element);
		assertEquals("IFXObject", element.getName());
		assertEquals(13, element.getChildren().size());
		assertEquals("string", element.getChild("string").getText());
		assertEquals("1", element.getChild("int").getText());
		assertEquals("2", element.getChild("long").getText());
		assertEquals("3.0", element.getChild("float").getText());
		assertEquals("4.0", element.getChild("double").getText());
		assertEquals("true", element.getChild("boolean").getText());
		assertNotNull(element.getChild("date").getText());
		assertEquals("Object", element.getChild("object").getText());
		assertEquals(3, element.getChild("array").getChildren().size());
		assertEquals(0, element.getChild("list").getChildren().size());
		assertEquals(0, element.getChild("map").getChildren().size());
		assertEquals(0, element.getChild("ifxobject").getChildren().size());
		assertEquals(11, element.getChild("ifxobject2").getChildren().size());
		assertNull(element.getChild("ifxobject2").getChild("string"));
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a simple IFXObject with a null value.
	*/
	@Test
	public void testEncodeSimpleIFXObjectWithNullValueAndValidation() throws Exception {
		IFXObject obj = new IFXObject();
		obj.setString("string", null);
		obj.setInt("int", 1);
		obj.setLong("long", 2);
		obj.setFloat("float", 3.0f);
		obj.setDouble("double", 4.0);
		obj.setBoolean("boolean", true);
		obj.setDate("date", new java.util.Date());
		obj.setObject("object", new Object());
		obj.setArray("array", new String[] {"one", "two", "three"});
		obj.setList("list", new ArrayList());
		obj.setMap("map", new HashMap());
		obj.setIFXObject("ifxobject", new IFXObject());
		Element element = new IFXEncoder().encode(obj, true);
		assertNotNull(element);
		assertEquals("IFXObject", element.getName());
		assertEquals(12, element.getChildren().size());
		assertNull(element.getChild("string"));
		assertEquals("1", element.getChild("int").getText());
		assertEquals("2", element.getChild("long").getText());
		assertEquals("3.0", element.getChild("float").getText());
		assertEquals("4.0", element.getChild("double").getText());
		assertEquals("true", element.getChild("boolean").getText());
		assertNotNull(element.getChild("date").getText());
		assertEquals("Object", element.getChild("object").getText());
		assertEquals(3, element.getChild("array").getChildren().size());
		assertEquals(0, element.getChild("list").getChildren().size());
		assertEquals(0, element.getChild("map").getChildren().size());
		assertEquals(0, element.getChild("ifxobject").getChildren().size());
	}
	
	/**
	* Test case for {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the encoding of a complex IFXObject with a null value.
	*/
	@Test
	public void testEncodeComplexIFXObjectWithNullValueAndValidation() throws Exception {
		IFXObject obj = new IFXObject();
		obj.setString("string", "string");
		obj.setInt("int", 1);
		obj.setLong("long", 2);
		obj.setFloat("float", 3.0f);
		obj.setDouble("double", 4.0);
		obj.setBoolean("boolean", true);
		obj.setDate("date", new java.util.Date());
		obj.setObject("object", new Object());
		obj.setArray("array", new String[] {"one", "two", "three"});
		obj.setList("list", new ArrayList());
		obj.setMap("map", new HashMap());
		obj.setIFXObject("ifxobject", new IFXObject());
		IFXObject obj2 = new IFXObject();
		obj2.setString("string", null);
		obj2.setInt("int", 1);
		obj2.setLong("long", 2);
		obj2.setFloat("float", 3.0f);
		obj2.setDouble("double", 4.0);
		obj2.setBoolean("boolean", true);
		obj2.setDate("date", new java.util.Date());
		obj2.setObject("object", new Object());
		obj2.setArray("array", new String[] {"one", "two", "three"});
		obj2.setList("list", new ArrayList());
		obj2.setMap("map", new HashMap());
		obj2.setIFXObject("ifxobject", new IFXObject());
		obj.setIFXObject("ifxobject2", obj2);
		Element element = new IFXEncoder().encode(obj, true);
		assertNotNull(element);
		assertEquals("IFXObject", element.getName());
		assertEquals(13, element.getChildren().size());
		assertEquals("string", element.getChild("string").getText());
		assertEquals("1", element.getChild("int").getText());
		assertEquals("2", element.getChild("long").getText());
		assertEquals("3.0", element.getChild("float").getText());
		assertEquals("4.0", element.getChild("double").getText());
		assertEquals("true", element.getChild("boolean").getText());
		assert