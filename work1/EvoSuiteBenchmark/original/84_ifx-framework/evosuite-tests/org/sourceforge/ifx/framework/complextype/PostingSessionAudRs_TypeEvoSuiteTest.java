/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.Method;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.PostingSessionId;
import org.sourceforge.ifx.framework.element.PostingSessionMsgRec;
import org.sourceforge.ifx.framework.element.RecCtrlOut;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.SelRangeDt;
import org.sourceforge.ifx.framework.element.Status;

@RunWith(EvoSuiteRunner.class)
public class PostingSessionAudRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      postingSessionAudRs_Type0.setAsyncRqUID((AsyncRqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      String string0 = postingSessionAudRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      postingSessionAudRs_Type0.setCustId((CustId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      boolean boolean0 = postingSessionAudRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.MacValue = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      Method[] methodArray0 = new Method[7];
      postingSessionAudRs_Type0.setMethod(methodArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  }\n  ]\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      RecCtrlOut recCtrlOut0 = new RecCtrlOut();
      postingSessionAudRs_Type0.setRecCtrlOut(recCtrlOut0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = org.sourceforge.ifx.framework.element.RecCtrlOut = {\n    MatchedRec = NULL\n    SentRec = NULL\n    Cursor = NULL\n  }\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      postingSessionAudRs_Type0.setMsgRsHdr((MsgRsHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      postingSessionAudRs_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      postingSessionAudRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      PostingSessionId[] postingSessionIdArray0 = new PostingSessionId[5];
      postingSessionAudRs_Type0.setPostingSessionId(postingSessionIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      SelRangeDt selRangeDt0 = new SelRangeDt();
      postingSessionAudRs_Type0.setSelRangeDt(selRangeDt0);
      assertEquals("org.sourceforge.ifx.framework.element.SelRangeDt = {\n  StartDt = NULL\n  EndDt = NULL\n}", selRangeDt0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      postingSessionAudRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      PostingSessionAudRs_Type postingSessionAudRs_Type0 = new PostingSessionAudRs_Type();
      postingSessionAudRs_Type0.setPostingSessionMsgRec((PostingSessionMsgRec[]) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.PostingSessionAudRs_Type = {\n  Method = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  SelRangeDt = NULL\n  PostingSessionId = NULL\n  PostingSessionMsgRec = NULL\n}", postingSessionAudRs_Type0.toString());
  }
}
