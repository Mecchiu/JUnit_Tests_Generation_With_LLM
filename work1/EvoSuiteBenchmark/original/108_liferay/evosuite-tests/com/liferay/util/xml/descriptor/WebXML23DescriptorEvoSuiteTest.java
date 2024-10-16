/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.util.xml.descriptor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.util.xml.ElementIdentifier;
import com.liferay.util.xml.descriptor.WebXML23Descriptor;
import org.dom4j.Document;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WebXML23DescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WebXML23Descriptor webXML23Descriptor0 = new WebXML23Descriptor();
      boolean boolean0 = webXML23Descriptor0.canHandleType("W~v;U-G\"%*3uUOk@(]f", (Document) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      WebXML23Descriptor webXML23Descriptor0 = new WebXML23Descriptor();
      ElementIdentifier[] elementIdentifierArray0 = webXML23Descriptor0.getElementsIdentifiedByChild();
      assertNotNull(elementIdentifierArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      WebXML23Descriptor webXML23Descriptor0 = new WebXML23Descriptor();
      String[] stringArray0 = webXML23Descriptor0.getJoinableElements();
      assertNotNull(stringArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      WebXML23Descriptor webXML23Descriptor0 = new WebXML23Descriptor();
      String[] stringArray0 = webXML23Descriptor0.getRootChildrenOrder();
      assertNotNull(stringArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      WebXML23Descriptor webXML23Descriptor0 = new WebXML23Descriptor();
      String[] stringArray0 = webXML23Descriptor0.getUniqueElements();
      assertNotNull(stringArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      WebXML23Descriptor webXML23Descriptor0 = new WebXML23Descriptor();
      ElementIdentifier[] elementIdentifierArray0 = webXML23Descriptor0.getElementsIdentifiedByAttribute();
      assertNotNull(elementIdentifierArray0);
  }
}
