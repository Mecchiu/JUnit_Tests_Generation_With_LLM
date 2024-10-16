/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.RefInfo_Type;
import org.sourceforge.ifx.framework.element.RefId;
import org.sourceforge.ifx.framework.element.RefType;

@RunWith(EvoSuiteRunner.class)
public class RefInfo_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RefInfo_Type refInfo_Type0 = new RefInfo_Type();
      boolean boolean0 = refInfo_Type0.equals((Object) "org.sourceforge.ifx.framework.element.RefType = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      RefInfo_Type refInfo_Type0 = new RefInfo_Type();
      String string0 = refInfo_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.RefInfo_Type = {\n  RefType = NULL\n  RefId = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      RefInfo_Type refInfo_Type0 = new RefInfo_Type();
      refInfo_Type0.setRefId((RefId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.RefInfo_Type = {\n  RefType = NULL\n  RefId = NULL\n}", refInfo_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      RefInfo_Type refInfo_Type0 = new RefInfo_Type();
      RefType refType0 = new RefType();
      refInfo_Type0.setRefType(refType0);
      assertNull(refType0.getString());
  }
}
