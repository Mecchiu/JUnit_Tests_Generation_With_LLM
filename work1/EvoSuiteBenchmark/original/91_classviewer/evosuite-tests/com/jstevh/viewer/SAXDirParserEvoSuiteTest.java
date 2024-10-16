/*
 * This file was automatically generated by EvoSuite
 */

package com.jstevh.viewer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.jstevh.tools.StringList;
import com.jstevh.viewer.SAXDirParser;
import java.util.HashMap;
import org.junit.BeforeClass;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;

@RunWith(EvoSuiteRunner.class)
public class SAXDirParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      boolean boolean0 = SAXDirParser.acceptsLineNumber();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = SAXDirParser.lineNumberParameter();
      assertEquals("", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = SAXDirParser.getLocalBrowser();
      assertEquals("", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      String string0 = sAXDirParser0.getWebData();
      assertEquals("", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = SAXDirParser.getEditor();
      assertEquals("", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = SAXDirParser.getDirectory();
      assertEquals(true, hashMap0.isEmpty());
  }

  @Test
  public void test6()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sAXDirParser0.startElement("", "Names", "Names", (Attributes) attributes2Impl0);
      assertEquals("", sAXDirParser0.getWebData());
  }

  @Test
  public void test7()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sAXDirParser0.startElement("BrowserLoc", "BrowserLoc", "BrowserLoc", (Attributes) attributesImpl0);
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try {
        sAXDirParser0.characters(charArray0, (int) '\u0000', (int) 'p');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 7
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sAXDirParser0.startElement("Editor", "Editor", "Editor", (Attributes) attributesImpl0);
      char[] charArray0 = new char[5];
      sAXDirParser0.characters(charArray0, (int) '?', (int) '\u0000');
      assertEquals("", sAXDirParser0.getEditor());
  }

  @Test
  public void test9()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sAXDirParser0.startElement("acceptsLineNumber", "acceptsLineNumber", "acceptsLineNumber", (Attributes) attributes2Impl0);
      char[] charArray0 = new char[3];
      sAXDirParser0.characters(charArray0, (int) '\u0000', (-702));
      assertEquals(false, sAXDirParser0.acceptsLineNumber());
  }

  @Test
  public void test10()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sAXDirParser0.startElement("parameter", "parameter", "parameter", (Attributes) attributesImpl0);
      char[] charArray0 = new char[3];
      sAXDirParser0.characters(charArray0, (int) '\u0000', (-537));
      assertEquals("", sAXDirParser0.getLocalBrowser());
  }

  @Test
  public void test11()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      sAXDirParser0.startElement("Group", "", "Group", (Attributes) null);
      assertEquals("", sAXDirParser0.getEditor());
  }

  @Test
  public void test12()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sAXDirParser0.startElement("Web", "Web", "Web", (Attributes) attributesImpl0);
      char[] charArray0 = new char[4];
      sAXDirParser0.characters(charArray0, (int) '&', (-1608));
      assertEquals(false, sAXDirParser0.acceptsLineNumber());
  }

  @Test
  public void test13()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sAXDirParser0.startElement("Local", "Local", "Local", (Attributes) attributesImpl0);
      char[] charArray0 = new char[3];
      sAXDirParser0.characters(charArray0, (int) 'M', (-1610));
      assertEquals("", sAXDirParser0.lineNumberParameter());
  }

  @Test
  public void test14()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sAXDirParser0.startElement("", "pkg", "pkg", (Attributes) attributes2Impl0);
      assertEquals("", sAXDirParser0.getLocalBrowser());
  }

  @Test
  public void test15()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      char[] charArray0 = new char[2];
      sAXDirParser0.characters(charArray0, 753, (int) '\u0000');
      assertEquals("", sAXDirParser0.getWebData());
  }

  @Test
  public void test16()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      char[] charArray0 = new char[3];
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sAXDirParser0.startElement("BrowserLoc", "BrowserLoc", "BrowserLoc", (Attributes) attributes2Impl0);
      sAXDirParser0.characters(charArray0, (int) ';', (int) '\u0000');
      assertEquals("", sAXDirParser0.getEditor());
  }

  @Test
  public void test17()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      sAXDirParser0.endElement("", "", "");
      assertEquals("", sAXDirParser0.getEditor());
  }

  @Test
  public void test18()  throws Throwable  {
      SAXDirParser sAXDirParser0 = new SAXDirParser();
      sAXDirParser0.endElement("Group", "Group", "Group");
      assertEquals("", sAXDirParser0.getEditor());
  }

  @Test
  public void test19()  throws Throwable  {
      StringList stringList0 = SAXDirParser.getLocalPackages();
      assertNull(stringList0);
  }
}
