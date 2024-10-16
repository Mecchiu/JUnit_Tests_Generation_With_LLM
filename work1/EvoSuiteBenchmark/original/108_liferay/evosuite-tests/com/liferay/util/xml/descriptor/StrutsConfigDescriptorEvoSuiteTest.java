/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.util.xml.descriptor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.util.xml.ElementIdentifier;
import com.liferay.util.xml.descriptor.StrutsConfigDescriptor;
import org.dom4j.Document;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StrutsConfigDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StrutsConfigDescriptor strutsConfigDescriptor0 = new StrutsConfigDescriptor();
      String[] stringArray0 = strutsConfigDescriptor0.getRootChildrenOrder();
      assertNotNull(stringArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      StrutsConfigDescriptor strutsConfigDescriptor0 = new StrutsConfigDescriptor();
      String[] stringArray0 = strutsConfigDescriptor0.getJoinableElements();
      assertNotNull(stringArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      StrutsConfigDescriptor strutsConfigDescriptor0 = new StrutsConfigDescriptor();
      String[] stringArray0 = strutsConfigDescriptor0.getUniqueElements();
      assertNotNull(stringArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      StrutsConfigDescriptor strutsConfigDescriptor0 = new StrutsConfigDescriptor();
      boolean boolean0 = strutsConfigDescriptor0.canHandleType("W~v;U-G\"%*3uUOk@(]f", (Document) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      StrutsConfigDescriptor strutsConfigDescriptor0 = new StrutsConfigDescriptor();
      ElementIdentifier[] elementIdentifierArray0 = strutsConfigDescriptor0.getElementsIdentifiedByAttribute();
      assertNotNull(elementIdentifierArray0);
  }
}
