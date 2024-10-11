// XTreeUtil_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {
		private static IStoredNode root = null;
		
		@Test
		public void testParseXML() throws Exception {
			// Set up the root
			root = parseXML(
				new URL("foo.xml"), true,
				null, null
			);

			// Check the root
			assertNotNull(root);

			// Test the method
			checkXPath("//li[child::a]", true);
		}

		@Test
		public void testGetNamespaces() throws Exception{ 
			setUseJAXP(true);
			Namespaces namespace1 = getNamespaces("namespace1");
			assertEquals("http://relaxng.org/ns/xml#", namespace1.getTargetNamespace(null));
			assertEquals("http://relaxng.org/ns/xml11#", namespace1.getTargetNamespace("http://relaxng.org/ns/xml11#"));
			assertFalse(namespace1.containsSchema(null));
			assertFalse(namespace1.containsXSchema(null));
		}

		@Test
		public void testGetNamespaces_schema() throws Exception {
			setUseJAXP(true);
            Namespaces namespace2 = getNamespaces("namespace2");
			
            assertNotNull(namespace2);
            assertFalse(namespace2.containsSchema(null));
            assertFalse(namespace2.containsXSchema(null));
			assertTrue(namespace2.containsSchema("namespace2"));
			assertTrue(namespace2.containsXSchema("namespace2"));
			assertNotNull(namespace2.getSchemaNamespace("namespace2"));
			assertNull(namespace2.getXMLSchemaNamespace("namespace2"));
			assertEquals(new String("namespace2"), namespace2.getXMLSchemaNamespace("namespace2"));
			assertEquals(new String(""), namespace2.getXMLSchemaNamespace(""));
			assertTrue(namespace2.getXMLSchemaNamespace("namespace2").isPrefixOf("namespace2"));
			
		}

		@Test
		public void testGetNamespaceNames() throws Exception {
			Namespaces namespace1 = getNamespaces("namespace1");
			assertEquals(new String("namespace1"), namespace1.getTargetNamespace("namespace1"));
			assertTrue(namespace1.containsSchema(null));
			assertFalse(namespace1.containsXSchema(null));
			assertFalse(namespace1.containsSchema("namespace1"));
		}

		@Test
		public void testGetNsPrefixes() throws Exception {
			Namespaces namespace2 = getNamespaces("namespace2");
			assertNotNull(namespace2);
			assertFalse(namespace2.containsSchema(null));
			assertTrue(namespace2.containsXSchema(null));
			assertFalse(namespace2.containsSchema("namespace2"));
			assertFalse(namespace2.containsXSchema("namespace2"));
            assertNotNull(namespace2.getSchemaNamespace("namespace2"));
			assertNotNull(namespace2.getXMLSchemaNamespace("namespace2"));
			assertEquals(new String(""), namespace2.getXMLSchemaNamespace(""));
			assertEquals(new String(""), namespace2.getXMLSchemaNamespace("namespace2"));
		}
        public static  Namespaces getNamespaces(String ns) {}

        @Test
        public static void testGetSchemaNames_Schema() throws Exception {
            setUseJAXP(true);
            Namespaces namespace2 = getNamespaces("namespace2");
            assertNotNull(namespace2);
            assertFalse(namespace2.containsSchema(null));
            assertFalse(namespace2.containsXSchema(null));
            assertFalse(namespace2.containsSchema("namespace2"));
            assertFalse(namespace2.containsXSchema("namespace2"));
            assertFalse(namespace2.containsSchema("namespace2", "xml"));
            assertNotNull(namespace2.getSchemaNamespace("namespace2"));
            assertEquals(new String("namespace2"), namespace2.getXMLSchemaNamespace(""));
            assertEquals(new String(""), namespace2.getXMLSchemaNamespace("namespace2"));

            assertNotNull(namespace2.getXMLSchemaNamespace("namespace2"));
            assertEquals(new String("namespace2", "xml"), namespace2.getXMLSchemaNamespace("namespace2"));
            assertEquals(new String(""), namespace2.getXMLSchemaNamespace(""));
		}

		@Test
		public void testGetSchemaNamespaces() throws Exception {
			Namespaces namespace2 = getNamespaces("namespace2");
			assertNotNull(namespace2);
			String[] names = namespace2.getSchemaNamespaces();
			assertNotNull(names);
			assertTrue( (names.length > 0) && (names.length < 2) 
				&& (names[0]!= null && 
					(names[0].equals("namespace2") || names[1].equals("namespace2"))));
		}
}