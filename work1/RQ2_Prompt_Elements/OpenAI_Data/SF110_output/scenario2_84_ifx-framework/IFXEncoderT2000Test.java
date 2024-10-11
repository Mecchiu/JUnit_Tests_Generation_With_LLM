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
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a base type.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithBaseType() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				assertEquals("Sujit", element.getChild("Name").getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a base type array.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithBaseTypeArray() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName(new String[] {"Sujit", "Pal"});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				assertEquals("Sujit", element.getChild("Name").getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a base type array.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithBaseTypeArray2() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName(new String[] {"Sujit", "Pal"});
				obj.setName(new String[] {"Sujit", "Pal"});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				assertEquals("Sujit", element.getChild("Name").getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getText());
				assertEquals("Sujit", element.getChild("Name").getNextSibling().getNextSibling().getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a base type array.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithBaseTypeArray3() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName(new String[] {"Sujit", "Pal"});
				obj.setName(new String[] {"Sujit", "Pal"});
				obj.setName(new String[] {"Sujit", "Pal"});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				assertEquals("Sujit", element.getChild("Name").getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getText());
				assertEquals("Sujit", element.getChild("Name").getNextSibling().getNextSibling().getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getText());
				assertEquals("Sujit", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getNextSibling().getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a base type array.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithBaseTypeArray4() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName(new String[] {"Sujit", "Pal"});
				obj.setName(new String[] {"Sujit", "Pal"});
				obj.setName(new String[] {"Sujit", "Pal"});
				obj.setName(new String[] {"Sujit", "Pal"});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				assertEquals("Sujit", element.getChild("Name").getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getText());
				assertEquals("Sujit", element.getChild("Name").getNextSibling().getNextSibling().getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getText());
				assertEquals("Sujit", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getNextSibling().getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getText());
				assertEquals("Sujit", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getText());
				assertEquals("Pal", element.getChild("Name").getNextSibling().getNextSibling().getNextSibling().getNextS