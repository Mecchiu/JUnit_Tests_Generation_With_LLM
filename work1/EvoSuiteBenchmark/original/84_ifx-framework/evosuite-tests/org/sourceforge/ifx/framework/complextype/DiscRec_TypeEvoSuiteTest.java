/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DiscRec_Type;
import org.sourceforge.ifx.framework.element.DiscId;
import org.sourceforge.ifx.framework.element.DiscInfo;

@RunWith(EvoSuiteRunner.class)
public class DiscRec_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DiscRec_Type discRec_Type0 = new DiscRec_Type();
      boolean boolean0 = discRec_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      DiscRec_Type discRec_Type0 = new DiscRec_Type();
      DiscInfo discInfo0 = new DiscInfo();
      discRec_Type0.setDiscInfo(discInfo0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DiscRec_Type = {\n  DiscId = NULL\n  DiscInfo = org.sourceforge.ifx.framework.element.DiscInfo = {\n    LongText = NULL\n    DiscURL = NULL\n    AcceptReqd = NULL\n  }\n}", discRec_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      DiscRec_Type discRec_Type0 = new DiscRec_Type();
      DiscId discId0 = discRec_Type0.getDiscId();
      assertNull(discId0);
  }

  @Test
  public void test3()  throws Throwable  {
      DiscRec_Type discRec_Type0 = new DiscRec_Type();
      DiscId discId0 = new DiscId();
      discRec_Type0.setDiscId(discId0);
      assertNull(discId0.getString());
  }

  @Test
  public void test4()  throws Throwable  {
      DiscRec_Type discRec_Type0 = new DiscRec_Type();
      DiscInfo discInfo0 = discRec_Type0.getDiscInfo();
      assertNull(discInfo0);
  }
}
