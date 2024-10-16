/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type;
import org.sourceforge.ifx.framework.element.DaysWith;
import org.sourceforge.ifx.framework.element.DeliveryMethod;
import org.sourceforge.ifx.framework.element.DfltDaysToPay;
import org.sourceforge.ifx.framework.element.DfltXferDaysToPay;
import org.sourceforge.ifx.framework.element.HistRetentionDays;
import org.sourceforge.ifx.framework.element.ModPendingType;
import org.sourceforge.ifx.framework.element.MsgSupt;
import org.sourceforge.ifx.framework.element.OptSupt;
import org.sourceforge.ifx.framework.element.PmtModel;
import org.sourceforge.ifx.framework.element.PrcSched;
import org.sourceforge.ifx.framework.element.RecPmtProf;
import org.sourceforge.ifx.framework.element.SvcCore;

@RunWith(EvoSuiteRunner.class)
public class PaySvcProfInfo_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      DeliveryMethod[] deliveryMethodArray0 = new DeliveryMethod[10];
      paySvcProfInfo_Type0.setDeliveryMethod(deliveryMethodArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  },\n    [9]:Exception! java.lang.NullPointerException\n  }\n  ]\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      String string0 = paySvcProfInfo_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      DfltXferDaysToPay[] dfltXferDaysToPayArray0 = new DfltXferDaysToPay[1];
      paySvcProfInfo_Type0.setDfltXferDaysToPay(dfltXferDaysToPayArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      ModPendingType[] modPendingTypeArray0 = new ModPendingType[6];
      paySvcProfInfo_Type0.setModPendingType(modPendingTypeArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  }\n  ]\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      DaysWith[] daysWithArray0 = new DaysWith[1];
      paySvcProfInfo_Type0.setDaysWith(daysWithArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      boolean boolean0 = paySvcProfInfo_Type0.equals((Object) "org.sourceforge.ifx.framework.element.PrcDtAdj = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      paySvcProfInfo_Type0.setSvcCore((SvcCore) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      DfltDaysToPay[] dfltDaysToPayArray0 = new DfltDaysToPay[3];
      paySvcProfInfo_Type0.setDfltDaysToPay(dfltDaysToPayArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      HistRetentionDays[] histRetentionDaysArray0 = new HistRetentionDays[4];
      paySvcProfInfo_Type0.setHistRetentionDays(histRetentionDaysArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      RecPmtProf[] recPmtProfArray0 = new RecPmtProf[8];
      paySvcProfInfo_Type0.setRecPmtProf(recPmtProfArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      PrcSched[] prcSchedArray0 = new PrcSched[4];
      paySvcProfInfo_Type0.setPrcSched(prcSchedArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  }\n  ]\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      PmtModel[] pmtModelArray0 = new PmtModel[3];
      paySvcProfInfo_Type0.setPmtModel(pmtModelArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      OptSupt[] optSuptArray0 = new OptSupt[7];
      paySvcProfInfo_Type0.setOptSupt(optSuptArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = NULL\n  OptSupt = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  }\n  ]\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      PaySvcProfInfo_Type paySvcProfInfo_Type0 = new PaySvcProfInfo_Type();
      MsgSupt[] msgSuptArray0 = new MsgSupt[1];
      paySvcProfInfo_Type0.setMsgSupt(msgSuptArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PaySvcProfInfo_Type = {\n  SvcCore = NULL\n  MsgSupt = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  OptSupt = NULL\n  PrcSched = NULL\n  PmtModel = NULL\n  DfltDaysToPay = NULL\n  DfltXferDaysToPay = NULL\n  DaysWith = NULL\n  HistRetentionDays = NULL\n  DeliveryMethod = NULL\n  ModPendingType = NULL\n  RecPmtProf = NULL\n}", paySvcProfInfo_Type0.toString());
  }
}
