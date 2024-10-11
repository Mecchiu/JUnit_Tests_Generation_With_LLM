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
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIBaseType() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIBaseTypeArray() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName(new String[] {"Sujit", "Pal"});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
				nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Pal", nameElement.getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIFXObject() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				obj.setAddress(new Address());
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
				Element addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIFXObjectArray() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				obj.setAddress(new Address[] {new Address(), new Address()});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
				Element addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIFXObjectArrayAndIBaseType() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				obj.setAddress(new Address[] {new Address(), new Address()});
				obj.setPhone(new String[] {"123-456-7890", "234-567-8901"});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
				Element addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				Element phoneElement = element.getChild("Phone", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("123-456-7890", phoneElement.getText());
				phoneElement = element.getChild("Phone", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("234-567-8901", phoneElement.getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIFXObjectArrayAndIBaseTypeArray() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				obj.setAddress(new Address[] {new Address(), new Address()});
				obj.setPhone(new String[] {"123-456-7890", "234-567-8901"});
				obj.setEmail(new String[] {"spal@users.sourceforge.net", "spal@users.sourceforge.net"});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
				Element addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				Element phoneElement = element.getChild("Phone", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("123-456-7890", phoneElement.getText());
				phoneElement = element.getChild("Phone", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("234-567-8901", phoneElement.getText());
				Element emailElement = element.getChild("Email", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("spal@users.sourceforge.net", emailElement.getText());
				emailElement = element.getChild("Email", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("spal@users.sourceforge.net", emailElement.getText());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIFXObjectArrayAndIBaseTypeArrayAndIFXObject() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				obj.setAddress(new Address[] {new Address(), new Address()});
				obj.setPhone(new String[] {"123-456-7890", "234-567-8901"});
				obj.setEmail(new String[] {"spal@users.sourceforge.net", "spal@users.sourceforge.net"});
				obj.setEmployer(new Employer());
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
				Element addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				Element phoneElement = element.getChild("Phone", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("123-456-7890", phoneElement.getText());
				phoneElement = element.getChild("Phone", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("234-567-8901", phoneElement.getText());
				Element emailElement = element.getChild("Email", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("spal@users.sourceforge.net", emailElement.getText());
				emailElement = element.getChild("Email", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("spal@users.sourceforge.net", emailElement.getText());
				Element employerElement = element.getChild("Employer", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Employer", employerElement.getName());
		}
		
		/**
		* Test case for {@link IFXEncoder#encode(IFXObject)} method.
		* It tests the encoding of a simple IFXObject with a single IBaseType.
		*/
		@Test
		public void testEncodeSimpleIFXObjectWithIFXObjectArrayAndIBaseTypeArrayAndIFXObjectArray() throws Exception {
				IFXEncoder encoder = new IFXEncoder();
				IFXObject obj = new IFXObject();
				obj.setId("12345");
				obj.setName("Sujit");
				obj.setAddress(new Address[] {new Address(), new Address()});
				obj.setPhone(new String[] {"123-456-7890", "234-567-8901"});
				obj.setEmail(new String[] {"spal@users.sourceforge.net", "spal@users.sourceforge.net"});
				obj.setEmployer(new Employer[] {new Employer(), new Employer()});
				Element element = encoder.encode(obj);
				assertEquals("IFXObject", element.getName());
				assertEquals("12345", element.getAttributeValue("Id"));
				Element nameElement = element.getChild("Name", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Sujit", nameElement.getText());
				Element addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				addressElement = element.getChild("Address", Namespace.getNamespace("http://www.ifxforum.org/ifx/2"));
				assertEquals("Address", addressElement.getName());
				Element phone