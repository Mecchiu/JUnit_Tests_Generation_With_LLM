/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type;
import org.sourceforge.ifx.framework.element.CreditAuthAddRq;
import org.sourceforge.ifx.framework.element.CreditAuthAudRq;
import org.sourceforge.ifx.framework.element.CreditAuthCanRq;
import org.sourceforge.ifx.framework.element.CreditAuthInqRq;
import org.sourceforge.ifx.framework.element.CreditAuthModRq;
import org.sourceforge.ifx.framework.element.CreditAuthSyncRq;

@RunWith(EvoSuiteRunner.class)
public class CreditAuthMsgRqInfo_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      String string0 = creditAuthMsgRqInfo_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type = {\n  CreditAuthAddRq = NULL\n  CreditAuthModRq = NULL\n  CreditAuthCanRq = NULL\n  CreditAuthInqRq = NULL\n  CreditAuthAudRq = NULL\n  CreditAuthSyncRq = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      CreditAuthCanRq creditAuthCanRq0 = new CreditAuthCanRq();
      creditAuthMsgRqInfo_Type0.setCreditAuthCanRq(creditAuthCanRq0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type = {\n  CreditAuthAddRq = NULL\n  CreditAuthModRq = NULL\n  CreditAuthCanRq = org.sourceforge.ifx.framework.element.CreditAuthCanRq = {\n    RqUID = NULL\n    MsgRqHdr = NULL\n    AsyncRqUID = NULL\n    CustId = NULL\n    CreditAuthId = NULL\n    ClientChgCode = NULL\n  }\n  CreditAuthInqRq = NULL\n  CreditAuthAudRq = NULL\n  CreditAuthSyncRq = NULL\n}", creditAuthMsgRqInfo_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      creditAuthMsgRqInfo_Type0.setCreditAuthModRq((CreditAuthModRq) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type = {\n  CreditAuthAddRq = NULL\n  CreditAuthModRq = NULL\n  CreditAuthCanRq = NULL\n  CreditAuthInqRq = NULL\n  CreditAuthAudRq = NULL\n  CreditAuthSyncRq = NULL\n}", creditAuthMsgRqInfo_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      creditAuthMsgRqInfo_Type0.setCreditAuthInqRq((CreditAuthInqRq) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type = {\n  CreditAuthAddRq = NULL\n  CreditAuthModRq = NULL\n  CreditAuthCanRq = NULL\n  CreditAuthInqRq = NULL\n  CreditAuthAudRq = NULL\n  CreditAuthSyncRq = NULL\n}", creditAuthMsgRqInfo_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      CreditAuthSyncRq creditAuthSyncRq0 = new CreditAuthSyncRq();
      creditAuthMsgRqInfo_Type0.setCreditAuthSyncRq(creditAuthSyncRq0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type = {\n  CreditAuthAddRq = NULL\n  CreditAuthModRq = NULL\n  CreditAuthCanRq = NULL\n  CreditAuthInqRq = NULL\n  CreditAuthAudRq = NULL\n  CreditAuthSyncRq = org.sourceforge.ifx.framework.element.CreditAuthSyncRq = {\n    RqUID = NULL\n    MsgRqHdr = NULL\n    AsyncRqUID = NULL\n    CustId = NULL\n    RecCtrlIn = NULL\n    DepAcctId = NULL\n    CardAcctId = NULL\n    Token = NULL\n  }\n}", creditAuthMsgRqInfo_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      creditAuthMsgRqInfo_Type0.setCreditAuthAddRq((CreditAuthAddRq) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type = {\n  CreditAuthAddRq = NULL\n  CreditAuthModRq = NULL\n  CreditAuthCanRq = NULL\n  CreditAuthInqRq = NULL\n  CreditAuthAudRq = NULL\n  CreditAuthSyncRq = NULL\n}", creditAuthMsgRqInfo_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      CreditAuthAudRq creditAuthAudRq0 = new CreditAuthAudRq();
      creditAuthMsgRqInfo_Type0.setCreditAuthAudRq(creditAuthAudRq0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CreditAuthMsgRqInfo_Type = {\n  CreditAuthAddRq = NULL\n  CreditAuthModRq = NULL\n  CreditAuthCanRq = NULL\n  CreditAuthInqRq = NULL\n  CreditAuthAudRq = org.sourceforge.ifx.framework.element.CreditAuthAudRq = {\n    Method = NULL\n    RqUID = NULL\n    MsgRqHdr = NULL\n    AsyncRqUID = NULL\n    CustId = NULL\n    CreditAuthId = NULL\n    RecCtrlIn = NULL\n    SelRangeDt = NULL\n  }\n  CreditAuthSyncRq = NULL\n}", creditAuthMsgRqInfo_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      CreditAuthMsgRqInfo_Type creditAuthMsgRqInfo_Type0 = new CreditAuthMsgRqInfo_Type();
      boolean boolean0 = creditAuthMsgRqInfo_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }
}
