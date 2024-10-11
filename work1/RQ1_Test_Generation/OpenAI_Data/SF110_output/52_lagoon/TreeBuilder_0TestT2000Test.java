// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {

		@Test
		void test_0() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_1() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_2() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_3() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_4() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_5() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_6() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_7() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_8() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
		
		@Test
		void test_9() throws Exception {
				File file = new File("src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml");
				InputSource inputSource = TreeBuilder.fileToInputSource(file);
				assertEquals("file:/src/test/resources/nu/staldal/xtree/TreeBuilder_0Test.xml", inputSource.getSystemId());
		}
}

// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		
		@Test
		void test_0() throws Exception {
				InputSource inputSource = new InputSource("src/test/resources/nu/staldal/xtree/TreeBuilder_1Test.xml");
				Element element = TreeBuilder.parseXML(inputSource, false);
				assertEquals("http://www.staldal.nu/", element.getNamespaceURI());
				assertEquals("root", element.getLocalName());
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(0));
				assertEquals("attr", element.getAttributeLocalName(0));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(1));
				assertEquals("attr2", element.getAttributeLocalName(1));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(2));
				assertEquals("attr3", element.getAttributeLocalName(2));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(3));
				assertEquals("attr4", element.getAttributeLocalName(3));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(4));
				assertEquals("attr5", element.getAttributeLocalName(4));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(5));
				assertEquals("attr6", element.getAttributeLocalName(5));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(6));
				assertEquals("attr7", element.getAttributeLocalName(6));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(7));
				assertEquals("attr8", element.getAttributeLocalName(7));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(8));
				assertEquals("attr9", element.getAttributeLocalName(8));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(9));
				assertEquals("attr10", element.getAttributeLocalName(9));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(10));
				assertEquals("attr11",