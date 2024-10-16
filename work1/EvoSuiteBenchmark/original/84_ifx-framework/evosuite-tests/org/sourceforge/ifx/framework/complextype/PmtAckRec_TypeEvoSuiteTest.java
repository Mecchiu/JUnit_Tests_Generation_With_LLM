/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.PmtAckRec_Type;
import org.sourceforge.ifx.framework.element.PmtAckInfo;
import org.sourceforge.ifx.framework.element.SvcRqUID;

@RunWith(EvoSuiteRunner.class)
public class PmtAckRec_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PmtAckRec_Type pmtAckRec_Type0 = new PmtAckRec_Type();
      SvcRqUID svcRqUID0 = new SvcRqUID();
      pmtAckRec_Type0.setSvcRqUID(svcRqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtAckRec_Type = {\n  SvcRqUID = null\n  PmtAckInfo = NULL\n}", pmtAckRec_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      PmtAckRec_Type pmtAckRec_Type0 = new PmtAckRec_Type();
      boolean boolean0 = pmtAckRec_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      PmtAckRec_Type pmtAckRec_Type0 = new PmtAckRec_Type();
      PmtAckInfo[] pmtAckInfoArray0 = new PmtAckInfo[9];
      pmtAckRec_Type0.setPmtAckInfo(pmtAckInfoArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtAckRec_Type = {\n  SvcRqUID = NULL\n  PmtAckInfo = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", pmtAckRec_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      PmtAckRec_Type pmtAckRec_Type0 = new PmtAckRec_Type();
      String string0 = pmtAckRec_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.PmtAckRec_Type = {\n  SvcRqUID = NULL\n  PmtAckInfo = NULL\n}", string0);
  }
}
