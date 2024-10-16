/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.DevInqRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CSPRefId;
import org.sourceforge.ifx.framework.element.DevId;
import org.sourceforge.ifx.framework.element.DevName;
import org.sourceforge.ifx.framework.element.DevStatusCode;
import org.sourceforge.ifx.framework.element.DevType;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RecCtrlIn;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SPRefId;

@RunWith(EvoSuiteRunner.class)
public class DevInqRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      DevStatusCode[] devStatusCodeArray0 = new DevStatusCode[9];
      devInqRq_Type0.setDevStatusCode(devStatusCodeArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      String string0 = devInqRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      DevName[] devNameArray0 = new DevName[1];
      devInqRq_Type0.setDevName(devNameArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      DevType[] devTypeArray0 = new DevType[6];
      devInqRq_Type0.setDevType(devTypeArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      RqUID rqUID0 = new RqUID();
      devInqRq_Type0.setRqUID(rqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = null\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      SPRefId[] sPRefIdArray0 = new SPRefId[1];
      devInqRq_Type0.setSPRefId(sPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      CSPRefId[] cSPRefIdArray0 = new CSPRefId[9];
      devInqRq_Type0.setCSPRefId(cSPRefIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  }\n  ]\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      devInqRq_Type0.setRecCtrlIn((RecCtrlIn) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      DevId[] devIdArray0 = new DevId[4];
      devInqRq_Type0.setDevId(devIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      boolean boolean0 = devInqRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.NetworkTrnInfo = {\n  Name = NULL\n  Desc = NULL\n  NetworkOwner = NULL\n  OriginatorName = NULL\n  OriginatorType = NULL\n  TerminalId = NULL\n  TerminalType = NULL\n  PostAddr = NULL\n  BankIdType = NULL\n  BankId = NULL\n  NetworkRefId = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      devInqRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      DevInqRq_Type devInqRq_Type0 = new DevInqRq_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      devInqRq_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.DevInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = null\n  RecCtrlIn = NULL\n  DevId = NULL\n  DevName = NULL\n  DevType = NULL\n  DevStatusCode = NULL\n  CSPRefId = NULL\n  SPRefId = NULL\n}", devInqRq_Type0.toString());
  }
}
