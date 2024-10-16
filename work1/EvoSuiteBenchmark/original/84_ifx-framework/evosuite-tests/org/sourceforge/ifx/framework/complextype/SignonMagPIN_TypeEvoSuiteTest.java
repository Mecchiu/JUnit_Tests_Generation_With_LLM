/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.SignonMagPIN_Type;
import org.sourceforge.ifx.framework.element.CardMagData;
import org.sourceforge.ifx.framework.element.CryptType;
import org.sourceforge.ifx.framework.element.GenSessKey;
import org.sourceforge.ifx.framework.element.PINBlock;
import org.sourceforge.ifx.framework.element.SecObjId;
import org.sourceforge.ifx.framework.element.SignonRole;

@RunWith(EvoSuiteRunner.class)
public class SignonMagPIN_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      GenSessKey genSessKey0 = signonMagPIN_Type0.getGenSessKey();
      signonMagPIN_Type0.setGenSessKey(genSessKey0);
      assertEquals("org.sourceforge.ifx.framework.complextype.SignonMagPIN_Type = {\n  SignonRole = NULL\n  CardMagData = NULL\n  CryptType = NULL\n  PINBlock = NULL\n  SecObjId = NULL\n  GenSessKey = NULL\n}", signonMagPIN_Type0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      CardMagData cardMagData0 = signonMagPIN_Type0.getCardMagData();
      assertNull(cardMagData0);
  }

  @Test
  public void test2()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      SignonRole signonRole0 = signonMagPIN_Type0.getSignonRole();
      assertNull(signonRole0);
  }

  @Test
  public void test3()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      signonMagPIN_Type0.setSecObjId((SecObjId) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SignonMagPIN_Type = {\n  SignonRole = NULL\n  CardMagData = NULL\n  CryptType = NULL\n  PINBlock = NULL\n  SecObjId = NULL\n  GenSessKey = NULL\n}", signonMagPIN_Type0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      CryptType cryptType0 = new CryptType();
      signonMagPIN_Type0.setCryptType(cryptType0);
      assertEquals("org.sourceforge.ifx.framework.element.CryptType = {\n  String = NULL\n}", cryptType0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      CryptType cryptType0 = signonMagPIN_Type0.getCryptType();
      assertNull(cryptType0);
  }

  @Test
  public void test6()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      SignonRole signonRole0 = new SignonRole();
      signonMagPIN_Type0.setSignonRole(signonRole0);
      assertEquals("org.sourceforge.ifx.framework.complextype.SignonMagPIN_Type = {\n  SignonRole = null\n  CardMagData = NULL\n  CryptType = NULL\n  PINBlock = NULL\n  SecObjId = NULL\n  GenSessKey = NULL\n}", signonMagPIN_Type0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      signonMagPIN_Type0.setPINBlock((PINBlock) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SignonMagPIN_Type = {\n  SignonRole = NULL\n  CardMagData = NULL\n  CryptType = NULL\n  PINBlock = NULL\n  SecObjId = NULL\n  GenSessKey = NULL\n}", signonMagPIN_Type0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      signonMagPIN_Type0.setCardMagData((CardMagData) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.SignonMagPIN_Type = {\n  SignonRole = NULL\n  CardMagData = NULL\n  CryptType = NULL\n  PINBlock = NULL\n  SecObjId = NULL\n  GenSessKey = NULL\n}", signonMagPIN_Type0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      SecObjId secObjId0 = signonMagPIN_Type0.getSecObjId();
      assertNull(secObjId0);
  }

  @Test
  public void test10()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      PINBlock pINBlock0 = signonMagPIN_Type0.getPINBlock();
      assertNull(pINBlock0);
  }

  @Test
  public void test11()  throws Throwable  {
      SignonMagPIN_Type signonMagPIN_Type0 = new SignonMagPIN_Type();
      boolean boolean0 = signonMagPIN_Type0.equals((Object) null);
      assertEquals(false, boolean0);
  }
}
