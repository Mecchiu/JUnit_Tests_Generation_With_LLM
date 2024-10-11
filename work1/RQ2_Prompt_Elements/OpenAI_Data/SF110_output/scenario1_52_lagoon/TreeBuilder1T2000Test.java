// TreeBuilderTest.java
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
class TreeBuilderTest {

	/**
	* Test case 1 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase1() throws Exception {
		InputSource xmlInput = new InputSource(new File("test1.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 2 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase2() throws Exception {
		InputSource xmlInput = new InputSource(new File("test2.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 3 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase3() throws Exception {
		InputSource xmlInput = new InputSource(new File("test3.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 4 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase4() throws Exception {
		InputSource xmlInput = new InputSource(new File("test4.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 5 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase5() throws Exception {
		InputSource xmlInput = new InputSource(new File("test5.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 6 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase6() throws Exception {
		InputSource xmlInput = new InputSource(new File("test6.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 7 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase7() throws Exception {
		InputSource xmlInput = new InputSource(new File("test7.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 8 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase8() throws Exception {
		InputSource xmlInput = new InputSource(new File("test8.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 9 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase9() throws Exception {
		InputSource xmlInput = new InputSource(new File("test9.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
	
	/**
	* Test case 10 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input XML document is valid and well-formed.
	*/
	@Test
	public void testCase10() throws Exception {
		InputSource xmlInput = new InputSource(new File("test10.xml").toURI().toString());
		Element root = TreeBuilder.parseXML(xmlInput, false);
		assertEquals("root", root.getName());
		assertEquals(1, root.getChildren().size());
		Element child = (Element)root.getChildren().get(0);
		assertEquals("child", child.getName());
		assertEquals(0, child.getChildren().size());
	}
}