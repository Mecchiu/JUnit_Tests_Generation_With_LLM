/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.SecObjSyncRq_Type;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RecCtrlIn;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SecObjId;
import org.sourceforge.ifx.framework.element.Token;

@RunWith(EvoSuiteRunner.class)
public class SecObjSyncRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SecObjSyncRq_Type secObjSyncRq_Type0 = new SecObjSyncRq_Type();
      String string0 = secObjSyncRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.SecObjSyncRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  SecObjId = NULL\n  RecCtrlIn = NULL\n  Token = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      SecObjSyncRq_Type secObjSyncRq_Type0 = new SecObjSyncRq_Type();
      secObjSyncRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SecObjSyncRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  SecObjId = NULL\n  RecCtrlIn = NULL\n  Token = NULL\n}", secObjSyncRq_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      SecObjSyncRq_Type secObjSyncRq_Type0 = new SecObjSyncRq_Type();
      Token[] tokenArray0 = new Token[7];
      secObjSyncRq_Type0.setToken(tokenArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.SecObjSyncRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  SecObjId = NULL\n  RecCtrlIn = NULL\n  Token = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", secObjSyncRq_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      SecObjSyncRq_Type secObjSyncRq_Type0 = new SecObjSyncRq_Type();
      secObjSyncRq_Type0.setRecCtrlIn((RecCtrlIn[]) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SecObjSyncRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  SecObjId = NULL\n  RecCtrlIn = NULL\n  Token = NULL\n}", secObjSyncRq_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      SecObjSyncRq_Type secObjSyncRq_Type0 = new SecObjSyncRq_Type();
      SecObjId[] secObjIdArray0 = new SecObjId[4];
      secObjSyncRq_Type0.setSecObjId(secObjIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.SecObjSyncRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  SecObjId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  }\n  ]\n  RecCtrlIn = NULL\n  Token = NULL\n}", secObjSyncRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      SecObjSyncRq_Type secObjSyncRq_Type0 = new SecObjSyncRq_Type();
      MsgRqHdr msgRqHdr0 = new MsgRqHdr();
      secObjSyncRq_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRqHdr = {\n  EMVRqData = NULL\n  NetworkTrnInfo = NULL\n  ClientTerminalSeqId = NULL\n  PointOfServiceData = NULL\n  MsgAuthCode = NULL\n}", msgRqHdr0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      SecObjSyncRq_Type secObjSyncRq_Type0 = new SecObjSyncRq_Type();
      boolean boolean0 = secObjSyncRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.IdentConditions = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }
}
