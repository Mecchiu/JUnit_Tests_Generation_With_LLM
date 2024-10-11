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
				assertEquals("attr11", element.getAttributeLocalName(10));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(11));
				assertEquals("attr12", element.getAttributeLocalName(11));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(12));
				assertEquals("attr13", element.getAttributeLocalName(12));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(13));
				assertEquals("attr14", element.getAttributeLocalName(13));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(14));
				assertEquals("attr15", element.getAttributeLocalName(14));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(15));
				assertEquals("attr16", element.getAttributeLocalName(15));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(16));
				assertEquals("attr17", element.getAttributeLocalName(16));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(17));
				assertEquals("attr18", element.getAttributeLocalName(17));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(18));
				assertEquals("attr19", element.getAttributeLocalName(18));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(19));
				assertEquals("attr20", element.getAttributeLocalName(19));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(20));
				assertEquals("attr21", element.getAttributeLocalName(20));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(21));
				assertEquals("attr22", element.getAttributeLocalName(21));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(22));
				assertEquals("attr23", element.getAttributeLocalName(22));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(23));
				assertEquals("attr24", element.getAttributeLocalName(23));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(24));
				assertEquals("attr25", element.getAttributeLocalName(24));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(25));
				assertEquals("attr26", element.getAttributeLocalName(25));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(26));
				assertEquals("attr27", element.getAttributeLocalName(26));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(27));
				assertEquals("attr28", element.getAttributeLocalName(27));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(28));
				assertEquals("attr29", element.getAttributeLocalName(28));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(29));
				assertEquals("attr30", element.getAttributeLocalName(29));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(30));
				assertEquals("attr31", element.getAttributeLocalName(30));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(31));
				assertEquals("attr32", element.getAttributeLocalName(31));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(32));
				assertEquals("attr33", element.getAttributeLocalName(32));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(33));
				assertEquals("attr34", element.getAttributeLocalName(33));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(34));
				assertEquals("attr35", element.getAttributeLocalName(34));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(35));
				assertEquals("attr36", element.getAttributeLocalName(35));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(36));
				assertEquals("attr37", element.getAttributeLocalName(36));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(37));
				assertEquals("attr38", element.getAttributeLocalName(37));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(38));
				assertEquals("attr39", element.getAttributeLocalName(38));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(39));
				assertEquals("attr40", element.getAttributeLocalName(39));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(40));
				assertEquals("attr41", element.getAttributeLocalName(40));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(41));
				assertEquals("attr42", element.getAttributeLocalName(41));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(42));
				assertEquals("attr43", element.getAttributeLocalName(42));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(43));
				assertEquals("attr44", element.getAttributeLocalName(43));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(44));
				assertEquals("attr45", element.getAttributeLocalName(44));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(45));
				assertEquals("attr46", element.getAttributeLocalName(45));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(46));
				assertEquals("attr47", element.getAttributeLocalName(46));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(47));
				assertEquals("attr48", element.getAttributeLocalName(47));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(48));
				assertEquals("attr49", element.getAttributeLocalName(48));
				assertEquals("http://www.staldal.nu/", element.getAttributeNamespaceURI(49));
				assertEquals("attr50", element.getAttributeLocalName(49));
	