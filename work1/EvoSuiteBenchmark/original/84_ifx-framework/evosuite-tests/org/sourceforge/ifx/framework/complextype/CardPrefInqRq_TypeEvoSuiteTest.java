/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.CardPrefInqRq_Type;
import org.sourceforge.ifx.framework.element.AsyncRqUID;
import org.sourceforge.ifx.framework.element.CardLogicalData;
import org.sourceforge.ifx.framework.element.CardPrefId;
import org.sourceforge.ifx.framework.element.CardPrefType;
import org.sourceforge.ifx.framework.element.CustId;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RqUID;

@RunWith(EvoSuiteRunner.class)
public class CardPrefInqRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      MsgRqHdr msgRqHdr0 = new MsgRqHdr();
      cardPrefInqRq_Type0.setMsgRqHdr(msgRqHdr0);
      assertEquals("org.sourceforge.ifx.framework.element.MsgRqHdr = {\n  EMVRqData = NULL\n  NetworkTrnInfo = NULL\n  ClientTerminalSeqId = NULL\n  PointOfServiceData = NULL\n  MsgAuthCode = NULL\n}", msgRqHdr0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      CustId custId0 = new CustId();
      cardPrefInqRq_Type0.setCustId(custId0);
      assertEquals("org.sourceforge.ifx.framework.element.CustId = {\n  CardLogicalData = NULL\n  SPName = NULL\n  CustPermId = NULL\n  CustLoginId = NULL\n  CardMagData = NULL\n}", custId0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      boolean boolean0 = cardPrefInqRq_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      cardPrefInqRq_Type0.setRqUID((RqUID) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CardPrefInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CardPrefId = NULL\n  CardLogicalData = NULL\n  CardPrefType = NULL\n}", cardPrefInqRq_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      CardPrefType[] cardPrefTypeArray0 = new CardPrefType[7];
      cardPrefInqRq_Type0.setCardPrefType(cardPrefTypeArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CardPrefInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CardPrefId = NULL\n  CardLogicalData = NULL\n  CardPrefType = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  },\n    [6]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", cardPrefInqRq_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      AsyncRqUID asyncRqUID0 = new AsyncRqUID();
      cardPrefInqRq_Type0.setAsyncRqUID(asyncRqUID0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CardPrefInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = null\n  CustId = NULL\n  CardPrefId = NULL\n  CardLogicalData = NULL\n  CardPrefType = NULL\n}", cardPrefInqRq_Type0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      cardPrefInqRq_Type0.setCardPrefId((CardPrefId[]) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.CardPrefInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CardPrefId = NULL\n  CardLogicalData = NULL\n  CardPrefType = NULL\n}", cardPrefInqRq_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      String string0 = cardPrefInqRq_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.CardPrefInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CardPrefId = NULL\n  CardLogicalData = NULL\n  CardPrefType = NULL\n}", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      CardPrefInqRq_Type cardPrefInqRq_Type0 = new CardPrefInqRq_Type();
      CardLogicalData[] cardLogicalDataArray0 = new CardLogicalData[6];
      cardPrefInqRq_Type0.setCardLogicalData(cardLogicalDataArray0);
      assertEquals("org.sourceforge.ifx.framework.complextype.CardPrefInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  AsyncRqUID = NULL\n  CustId = NULL\n  CardPrefId = NULL\n  CardLogicalData = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  },\n    [2]:Exception! java.lang.NullPointerException\n  },\n    [3]:Exception! java.lang.NullPointerException\n  },\n    [4]:Exception! java.lang.NullPointerException\n  },\n    [5]:Exception! java.lang.NullPointerException\n  }\n  ]\n  CardPrefType = NULL\n}", cardPrefInqRq_Type0.toString());
  }
}
