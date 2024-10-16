/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.BillerInqRs_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.BillerId;
import org.sourceforge.ifx.framework.element.BillerRec;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.DeliveryMethod;
import org.sourceforge.ifx.framework.element.IncBillerContact;
import org.sourceforge.ifx.framework.element.IncImages;
import org.sourceforge.ifx.framework.element.IndustId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.MsgRsHdr;
import org.sourceforge.ifx.framework.element.Name;
import org.sourceforge.ifx.framework.element.NewUpDt;
import org.sourceforge.ifx.framework.element.Phone;
import org.sourceforge.ifx.framework.element.PostAddr;
import org.sourceforge.ifx.framework.element.PostalCode;
import org.sourceforge.ifx.framework.element.RecCtrlOut;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.Status;
import org.sourceforge.ifx.framework.element.UpDt;

@RunWith(EvoSuiteRunner.class)
public class BillerInqRs_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      String string0 = billerInqRs_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      Name[] nameArray0 = new Name[2];
      billerInqRs_Type0.setName(nameArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  }\n  ]\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      IncImages[] incImagesArray0 = new IncImages[9];
      billerInqRs_Type0.setIncImages(incImagesArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  }\n  ]\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      MsgRqHdr msgRqHdr0 = billerInqRs_Type0.getMsgRqHdr();
      billerInqRs_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      PostalCode[] postalCodeArray0 = new PostalCode[1];
      billerInqRs_Type0.setPostalCode(postalCodeArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      Phone[] phoneArray0 = new Phone[6];
      billerInqRs_Type0.setPhone(phoneArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  }\n  ]\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      CustId custId0 = new CustId();
      billerInqRs_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.element.CustId = {\n  SPName = NULL\n  CustPermId = NULL\n  CustLoginId = NULL\n  CardMagData = NULL\n  CardLogicalData = NULL\n}", custId0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      boolean boolean0 = billerInqRs_Type0.equals((Object) "org.sourceforge.ifx.framework.element.PrenoteReqd = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      BillerRec[] billerRecArray0 = new BillerRec[8];
      billerInqRs_Type0.setBillerRec(billerRecArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      MsgRsHdr msgRsHdr0 = new MsgRsHdr();
      billerInqRs_Type0.setMsgRsHdr(msgRsHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRsHdr = {\n  MsgAuthCode = NULL\n  EMVRsData = NULL\n  ServerTerminalSeqId = NULL\n}", msgRsHdr0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      IncBillerContact[] incBillerContactArray0 = new IncBillerContact[9];
      billerInqRs_Type0.setIncBillerContact(incBillerContactArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  },\n    [7]:Exception! java.lang.NullPointerException\n  },\n    [8]:Exception! java.lang.NullPointerException\n  }\n  ]\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      NewUpDt[] newUpDtArray0 = new NewUpDt[5];
      billerInqRs_Type0.setNewUpDt(newUpDtArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      billerInqRs_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = null\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      RecCtrlOut recCtrlOut0 = new RecCtrlOut();
      billerInqRs_Type0.setRecCtrlOut(recCtrlOut0);
      assertEquals("org.sourceforge.ifx.framework.element.RecCtrlOut = {\n  MatchedRec = NULL\n  SentRec = NULL\n  Cursor = NULL\n}", recCtrlOut0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      UpDt[] upDtArray0 = new UpDt[2];
      billerInqRs_Type0.setUpDt(upDtArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  }\n  ]\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      IndustId[] industIdArray0 = new IndustId[4];
      billerInqRs_Type0.setIndustId(industIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  }\n  ]\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      DeliveryMethod[] deliveryMethodArray0 = new DeliveryMethod[1];
      billerInqRs_Type0.setDeliveryMethod(deliveryMethodArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      billerInqRs_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test18()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      PostAddr[] postAddrArray0 = new PostAddr[5];
      billerInqRs_Type0.setPostAddr(postAddrArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  }\n  ]\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      billerInqRs_Type0.setStatus((Status) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = NULL\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      BillerInqRs_Type billerInqRs_Type0 = new BillerInqRs_Type();
      BillerId[] billerIdArray0 = new BillerId[1];
      billerInqRs_Type0.setBillerId(billerIdArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.BillerInqRs_Type = {\n  Name = NULL\n  Status = NULL\n  RqUID = NULL\n  MsgRqHdr = NULL\n  MsgRsHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  RecCtrlOut = NULL\n  BillerId = [\n    [0]:Exception! java.lang.NullPointerException\n  }\n  ]\n  PostAddr = NULL\n  Phone = NULL\n  PostalCode = NULL\n  UpDt = NULL\n  IndustId = NULL\n  IncBillerContact = NULL\n  IncImages = NULL\n  DeliveryMethod = NULL\n  NewUpDt = NULL\n  BillerRec = NULL\n}", billerInqRs_Type0.toString());
  }
}
