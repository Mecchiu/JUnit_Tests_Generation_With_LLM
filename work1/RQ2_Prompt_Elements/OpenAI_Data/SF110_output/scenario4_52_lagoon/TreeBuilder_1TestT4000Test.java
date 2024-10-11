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
	void testParseXML_1() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a/>")), false);
		assertEquals("a", element.getTagName());
	}
	
	@Test
	void testParseXML_2() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
	}
	
	@Test
	void testParseXML_3() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_4() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_5() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_6() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_7() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_8() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_9() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_10() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
}

// TreeBuilder_2Test.java
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
class TreeBuilder_2Test {
		
	@Test
	void testParseXML_1() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a/>")), false);
		assertEquals("a", element.getTagName());
	}
	
	@Test
	void testParseXML_2() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
	}
	
	@Test
	void testParseXML_3() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_4() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_5() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_6() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_7() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_8() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_9() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_10() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
}

// TreeBuilder_3Test.java
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
class TreeBuilder_3Test {
		
	@Test
	void testParseXML_1() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a/>")), false);
		assertEquals("a", element.getTagName());
	}
	
	@Test
	void testParseXML_2() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
	}
	
	@Test
	void testParseXML_3() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_4() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_5() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_6() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element.getContent().get(0).toString());
		assertEquals("c", ((Element)element.getContent().get(1)).getTagName());
		assertEquals("d", element.getContent().get(2).toString());
	}
	
	@Test
	void testParseXML_7() throws Exception {
		TreeBuilder treeBuilder = new TreeBuilder();
		Element element = treeBuilder.parseXML(new InputSource(new StringReader("<a>b<c/>d</a>")), false);
		assertEquals("a", element.getTagName());
		assertEquals("b", element