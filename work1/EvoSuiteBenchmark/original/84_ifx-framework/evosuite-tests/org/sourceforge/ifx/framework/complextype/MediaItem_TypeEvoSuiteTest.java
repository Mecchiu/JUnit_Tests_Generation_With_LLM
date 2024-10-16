/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.MediaItem_Type;
import org.sourceforge.ifx.framework.element.Count;
import org.sourceforge.ifx.framework.element.CreditMediaChkInfo;
import org.sourceforge.ifx.framework.element.CurAmt;
import org.sourceforge.ifx.framework.element.MediaBal;
import org.sourceforge.ifx.framework.element.MediaCashInfo;
import org.sourceforge.ifx.framework.element.MediaContainerId;
import org.sourceforge.ifx.framework.element.MediaSubType;
import org.sourceforge.ifx.framework.element.MediaType;
import org.sourceforge.ifx.framework.element.TotalCurAmt;

@RunWith(EvoSuiteRunner.class)
public class MediaItem_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      MediaCashInfo mediaCashInfo0 = new MediaCashInfo();
      mediaItem_Type0.setMediaCashInfo(mediaCashInfo0);
      assertEquals("org.sourceforge.ifx.framework.element.MediaCashInfo = {\n  CashValidity = NULL\n  CashQuality = NULL\n  CashSignature = NULL\n  CashSerialNum = NULL\n}", mediaCashInfo0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      boolean boolean0 = mediaItem_Type0.equals((Object) "org.sourceforge.ifx.framework.element.CompositeContactInfo = {\n  ContactInfo = NULL\n  ContactInfoType = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      MediaBal mediaBal0 = new MediaBal();
      mediaItem_Type0.setMediaBal(mediaBal0);
      assertEquals("org.sourceforge.ifx.framework.element.MediaBal = {\n  CurAmt = NULL\n  MediaTotal = NULL\n}", mediaBal0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      mediaItem_Type0.setMediaSubType((MediaSubType) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.MediaItem_Type = {\n  Count = NULL\n  MediaContainerId = NULL\n  MediaType = NULL\n  MediaSubType = NULL\n  MediaCashInfo = NULL\n  CreditMediaChkInfo = NULL\n  CurAmt = NULL\n  TotalCurAmt = NULL\n  MediaBal = NULL\n}", mediaItem_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      mediaItem_Type0.setCreditMediaChkInfo((CreditMediaChkInfo) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.MediaItem_Type = {\n  Count = NULL\n  MediaContainerId = NULL\n  MediaType = NULL\n  MediaSubType = NULL\n  MediaCashInfo = NULL\n  CreditMediaChkInfo = NULL\n  CurAmt = NULL\n  TotalCurAmt = NULL\n  MediaBal = NULL\n}", mediaItem_Type0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      String string0 = mediaItem_Type0.toString();
      assertEquals("org.sourceforge.ifx.framework.complextype.MediaItem_Type = {\n  Count = NULL\n  MediaContainerId = NULL\n  MediaType = NULL\n  MediaSubType = NULL\n  MediaCashInfo = NULL\n  CreditMediaChkInfo = NULL\n  CurAmt = NULL\n  TotalCurAmt = NULL\n  MediaBal = NULL\n}", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      mediaItem_Type0.setCurAmt((CurAmt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.MediaItem_Type = {\n  Count = NULL\n  MediaContainerId = NULL\n  MediaType = NULL\n  MediaSubType = NULL\n  MediaCashInfo = NULL\n  CreditMediaChkInfo = NULL\n  CurAmt = NULL\n  TotalCurAmt = NULL\n  MediaBal = NULL\n}", mediaItem_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      mediaItem_Type0.setTotalCurAmt((TotalCurAmt) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.MediaItem_Type = {\n  Count = NULL\n  MediaContainerId = NULL\n  MediaType = NULL\n  MediaSubType = NULL\n  MediaCashInfo = NULL\n  CreditMediaChkInfo = NULL\n  CurAmt = NULL\n  TotalCurAmt = NULL\n  MediaBal = NULL\n}", mediaItem_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      MediaContainerId mediaContainerId0 = new MediaContainerId();
      mediaItem_Type0.setMediaContainerId(mediaContainerId0);
      assertNull(mediaContainerId0.getString());
  }

  @Test
  public void test9()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      mediaItem_Type0.setCount((Count) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.MediaItem_Type = {\n  Count = NULL\n  MediaContainerId = NULL\n  MediaType = NULL\n  MediaSubType = NULL\n  MediaCashInfo = NULL\n  CreditMediaChkInfo = NULL\n  CurAmt = NULL\n  TotalCurAmt = NULL\n  MediaBal = NULL\n}", mediaItem_Type0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      MediaItem_Type mediaItem_Type0 = new MediaItem_Type();
      mediaItem_Type0.setMediaType((MediaType) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.MediaItem_Type = {\n  Count = NULL\n  MediaContainerId = NULL\n  MediaType = NULL\n  MediaSubType = NULL\n  MediaCashInfo = NULL\n  CreditMediaChkInfo = NULL\n  CurAmt = NULL\n  TotalCurAmt = NULL\n  MediaBal = NULL\n}", mediaItem_Type0.toString());
  }
}
