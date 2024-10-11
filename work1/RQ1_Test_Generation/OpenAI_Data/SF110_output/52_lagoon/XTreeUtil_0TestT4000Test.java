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
* It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {

		@Test
		void test_0() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals("a", result.getLocalName());
		}
		
		@Test
		void test_1() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals("", result.getNamespaceURI());
		}
		
		@Test
		void test_2() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getAttributeCount());
		}
		
		@Test
		void test_3() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getChildCount());
		}
		
		@Test
		void test_4() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getLineNumber());
		}
		
		@Test
		void test_5() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getColumnNumber());
		}
		
		@Test
		void test_6() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getSystemId().length());
		}
		
		@Test
		void test_7() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getPublicId().length());
		}
		
		@Test
		void test_8() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getBaseURI().length());
		}
		
		@Test
		void test_9() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getPrefix().length());
		}
}

// XTreeUtil_1Test.java
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
* It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_1Test {
		
		@Test
		void test_0() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals("a", result.getLocalName());
		}
		
		@Test
		void test_1() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals("", result.getNamespaceURI());
		}
		
		@Test
		void test_2() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getAttributeCount());
		}
		
		@Test
		void test_3() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getChildCount());
		}
		
		@Test
		void test_4() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getLineNumber());
		}
		
		@Test
		void test_5() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getColumnNumber());
		}
		
		@Test
		void test_6() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getSystemId().length());
		}
		
		@Test
		void test_7() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getPublicId().length());
		}
		
		@Test
		void test_8() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getBaseURI().length());
		}
		
		@Test
		void test_9() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getPrefix().length());
		}
}

// XTreeUtil_2Test.java
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
* It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_2Test {
		
		@Test
		void test_0() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals("a", result.getLocalName());
		}
		
		@Test
		void test_1() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals("", result.getNamespaceURI());
		}
		
		@Test
		void test_2() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getAttributeCount());
		}
		
		@Test
		void test_3() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getChildCount());
		}
		
		@Test
		void test_4() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getLineNumber());
		}
		
		@Test
		void test_5() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getColumnNumber());
		}
		
		@Test
		void test_6() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
				assertEquals(0, result.getSystemId().length());
		}
		
		@Test
		void test_7() throws Exception {
				InputSource xmlInput = new InputSource(new StringReader("<a/>"));
				boolean validateDTD = false;
				String schemaType = null;
				InputSource schema = null;
				Element result = XTreeUt