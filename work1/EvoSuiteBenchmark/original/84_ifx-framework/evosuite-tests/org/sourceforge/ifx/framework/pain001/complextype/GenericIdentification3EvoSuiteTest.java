/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.pain001.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.pain001.complextype.GenericIdentification3;
import org.sourceforge.ifx.framework.pain004.simpletype.Max35Text;

@RunWith(EvoSuiteRunner.class)
public class GenericIdentification3EvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GenericIdentification3 genericIdentification3_0 = new GenericIdentification3();
      genericIdentification3_0.setMax35Text((Max35Text) null);
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.GenericIdentification3 = {\n  Max35Text = NULL\n}", genericIdentification3_0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      GenericIdentification3 genericIdentification3_0 = new GenericIdentification3();
      boolean boolean0 = genericIdentification3_0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      GenericIdentification3 genericIdentification3_0 = new GenericIdentification3();
      Max35Text max35Text0 = genericIdentification3_0.getMax35Text();
      assertNull(max35Text0);
  }
}
