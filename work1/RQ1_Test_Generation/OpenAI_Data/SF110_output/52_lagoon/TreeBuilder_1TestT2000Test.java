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
		public void test1() throws Exception {
				String xml = "<?xml version=\"1.0\"?><root/>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				Element root = TreeBuilder.parseXML(xmlInput, false);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getAttributeCount());
				assertEquals(0, root.getChildCount());
		}
		
		@Test
		public void test2() throws Exception {
				String xml = "<?xml version=\"1.0\"?><root attr=\"value\"/>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				Element root = TreeBuilder.parseXML(xmlInput, false);
				assertEquals("root", root.getLocalName());
				assertEquals(1, root.getAttributeCount());
				assertEquals("attr", root.getAttributeName(0));
				assertEquals("value", root.getAttributeValue(0));
				assertEquals(0, root.getChildCount());
		}
		
		@Test
		public void test3() throws Exception {
				String xml = "<?xml version=\"1.0\"?><root><child/></root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				Element root = TreeBuilder.parseXML(xmlInput, false);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getAttributeCount());
				assertEquals(1, root.getChildCount());
				Node child = root.getChild(0);
				assertTrue(child instanceof Element);
				assertEquals("child", child.getLocalName());
				assertEquals(0, ((Element)child).getAttributeCount());
				assertEquals(0, ((Element)child).getChildCount());
		}
		
		@Test
		public void test4() throws Exception {
				String xml = "<?xml version=\"1.0\"?><root><child>text</child></root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				Element root = TreeBuilder.parseXML(xmlInput, false);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getAttributeCount());
				assertEquals(1, root.getChildCount());
				Node child = root.getChild(0);
				assertTrue(child instanceof Element);
				assertEquals("child", child.getLocalName());
				assertEquals(0, ((Element)child).getAttributeCount());
				assertEquals(1, ((Element)child).getChildCount());
				Node text = ((Element)child).getChild(0);
				assertTrue(text instanceof Text);
				assertEquals("text", text.getText());
		}
		
		@Test
		public void test5() throws Exception {
				String xml = "<?xml version=\"1.0\"?><root><child>text1<child2/>text2</child></root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				Element root = TreeBuilder.parseXML(xmlInput, false);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getAttributeCount());
				assertEquals(1, root.getChildCount());
				Node child = root.getChild(0);
				assertTrue(child instanceof Element);
				assertEquals("child", child.getLocalName());
				assertEquals(0, ((Element)child).getAttributeCount());
				assertEquals(3, ((Element)child).getChildCount());
				Node text1 = ((Element)child).getChild(0);
				assertTrue(text1 instanceof Text);
				assertEquals("text1", text1.getText());
				Node child2 = ((Element)child).getChild(1);
				assertTrue(child2 instanceof Element);
				assertEquals("child2", child2.getLocalName());
				assertEquals(0, ((Element)child2).getAttributeCount());
				assertEquals(0, ((Element)child2).getChildCount());
				Node text2 = ((Element)child).getChild(2);
				assertTrue(text2 instanceof Text);
				assertEquals("text2", text2.getText());
		}
		
		@Test
		public void test6() throws Exception {
				String xml = "<?xml version=\"1.0\"?><root><child>text1<child2/>text2</child>text3</root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				Element root = TreeBuilder.parseXML(xmlInput, false);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getAttributeCount());
				assertEquals(2, root.getChildCount());
				Node child = root.getChild(0);
				assertTrue(child instanceof Element);
				assertEquals("child", child.getLocalName());
				assertEquals(0, ((Element)child).getAttributeCount());
				assertEquals(3, ((Element)child).getChildCount());
				Node text1 = ((Element)child).getChild(0);
				assertTrue(text1 instanceof Text);
				assertEquals("text1", text1.getText());
				Node child2 = ((Element)child).getChild(1);
				assertTrue(child2 instanceof Element);
				assertEquals("child2", child2.getLocalName());
				assertEquals(0, ((Element)child2).getAttributeCount());
				assertEquals(0, ((Element)child2).getChildCount());
				Node text2 = ((Element)child).getChild(2);
				assertTrue(text2 instanceof Text);
				assertEquals("text2", text2.getText());
				Node text3 = root.getChild(1);
				assertTrue(text3 instanceof Text);
				assertEquals("text3", text3.getText());
		}
		
		@Test
		public void test7() throws Exception {
				String xml = "<?xml version=\"1.0\"?><root><child>text1<child2/>text2</child>text3<child3/></root>";
				InputSource xmlInput = new InputSource(new StringReader(xml));
				Element root = TreeBuilder.parseXML(xmlInput, false);
				assertEquals("root", root.getLocalName());
				assertEquals(0, root.getAttributeCount());
				assertEquals(3, root.getChildCount());
				Node child = root.getChild(0);
				assertTrue(child instanceof Element);
				assertEquals("child", child.getLocalName());
				assertEquals(0, ((Element)child).getAttributeCount());
				assertEquals(3, ((Element)child).getChildCount());
				Node text1 = ((Element)child).getChild(0);
				assertTrue(text1 instanceof Text