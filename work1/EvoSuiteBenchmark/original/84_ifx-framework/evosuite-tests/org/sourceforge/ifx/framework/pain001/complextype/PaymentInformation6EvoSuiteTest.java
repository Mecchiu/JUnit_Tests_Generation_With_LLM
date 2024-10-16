/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.pain001.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.pain001.complextype.GenericPaymentTransaction3;
import org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6;
import org.sourceforge.ifx.framework.pain004.complextype.BranchAndFinancialInstitutionIdentification;
import org.sourceforge.ifx.framework.pain004.complextype.CashAccount3;
import org.sourceforge.ifx.framework.pain004.complextype.CreditTransferTypeIdentification;
import org.sourceforge.ifx.framework.pain004.complextype.PartyIdentification1;
import org.sourceforge.ifx.framework.pain004.simpletype.CountryCode;
import org.sourceforge.ifx.framework.pain004.simpletype.ISODate;
import org.sourceforge.ifx.framework.pain004.simpletype.PaymentMethod1Code;

@RunWith(EvoSuiteRunner.class)
public class PaymentInformation6EvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      boolean boolean0 = paymentInformation6_0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      CreditTransferTypeIdentification creditTransferTypeIdentification0 = new CreditTransferTypeIdentification();
      paymentInformation6_0.setCreditTransferTypeIdentification(creditTransferTypeIdentification0);
      assertEquals("org.sourceforge.ifx.framework.pain004.complextype.CreditTransferTypeIdentification = {\n  CreditTransferType2Code = NULL\n  Max35Text = NULL\n  Priority2Code = NULL\n  SettlementPriorityChoice = NULL\n}", creditTransferTypeIdentification0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      String string0 = paymentInformation6_0.toString();
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6 = {\n  ISODate = NULL\n  PaymentMethod1Code = NULL\n  CreditTransferTypeIdentification = NULL\n  PartyIdentification1 = NULL\n  CountryCode = NULL\n  CashAccount3 = NULL\n  BranchAndFinancialInstitutionIdentification = NULL\n  GenericPaymentTransaction3 = NULL\n}", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      paymentInformation6_0.setCashAccount3((CashAccount3) null);
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6 = {\n  ISODate = NULL\n  PaymentMethod1Code = NULL\n  CreditTransferTypeIdentification = NULL\n  PartyIdentification1 = NULL\n  CountryCode = NULL\n  CashAccount3 = NULL\n  BranchAndFinancialInstitutionIdentification = NULL\n  GenericPaymentTransaction3 = NULL\n}", paymentInformation6_0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      paymentInformation6_0.setCountryCode((CountryCode) null);
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6 = {\n  ISODate = NULL\n  PaymentMethod1Code = NULL\n  CreditTransferTypeIdentification = NULL\n  PartyIdentification1 = NULL\n  CountryCode = NULL\n  CashAccount3 = NULL\n  BranchAndFinancialInstitutionIdentification = NULL\n  GenericPaymentTransaction3 = NULL\n}", paymentInformation6_0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      PartyIdentification1 partyIdentification1_0 = paymentInformation6_0.getPartyIdentification1();
      paymentInformation6_0.setPartyIdentification1(partyIdentification1_0);
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6 = {\n  ISODate = NULL\n  PaymentMethod1Code = NULL\n  CreditTransferTypeIdentification = NULL\n  PartyIdentification1 = NULL\n  CountryCode = NULL\n  CashAccount3 = NULL\n  BranchAndFinancialInstitutionIdentification = NULL\n  GenericPaymentTransaction3 = NULL\n}", paymentInformation6_0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      paymentInformation6_0.setISODate((ISODate) null);
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6 = {\n  ISODate = NULL\n  PaymentMethod1Code = NULL\n  CreditTransferTypeIdentification = NULL\n  PartyIdentification1 = NULL\n  CountryCode = NULL\n  CashAccount3 = NULL\n  BranchAndFinancialInstitutionIdentification = NULL\n  GenericPaymentTransaction3 = NULL\n}", paymentInformation6_0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      PaymentMethod1Code paymentMethod1Code0 = new PaymentMethod1Code();
      paymentInformation6_0.setPaymentMethod1Code(paymentMethod1Code0);
      assertEquals("org.sourceforge.ifx.framework.pain004.simpletype.PaymentMethod1Code = {\n  String = NULL\n}", paymentMethod1Code0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      BranchAndFinancialInstitutionIdentification branchAndFinancialInstitutionIdentification0 = new BranchAndFinancialInstitutionIdentification();
      paymentInformation6_0.setBranchAndFinancialInstitutionIdentification(branchAndFinancialInstitutionIdentification0);
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6 = {\n  ISODate = NULL\n  PaymentMethod1Code = NULL\n  CreditTransferTypeIdentification = NULL\n  PartyIdentification1 = NULL\n  CountryCode = NULL\n  CashAccount3 = NULL\n  BranchAndFinancialInstitutionIdentification = org.sourceforge.ifx.framework.pain004.complextype.BranchAndFinancialInstitutionIdentification = {\n    FinancialInstitutionIdentification1 = NULL\n    BranchData = NULL\n  }\n  GenericPaymentTransaction3 = NULL\n}", paymentInformation6_0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      PaymentInformation6 paymentInformation6_0 = new PaymentInformation6();
      GenericPaymentTransaction3[] genericPaymentTransaction3Array0 = new GenericPaymentTransaction3[2];
      paymentInformation6_0.setGenericPaymentTransaction3(genericPaymentTransaction3Array0);
      assertEquals("org.sourceforge.ifx.framework.pain001.complextype.PaymentInformation6 = {\n  ISODate = NULL\n  PaymentMethod1Code = NULL\n  CreditTransferTypeIdentification = NULL\n  PartyIdentification1 = NULL\n  CountryCode = NULL\n  CashAccount3 = NULL\n  BranchAndFinancialInstitutionIdentification = NULL\n  GenericPaymentTransaction3 = [\n    [0]:Exception! java.lang.NullPointerException\n  },\n    [1]:Exception! java.lang.NullPointerException\n  }\n  ]\n}", paymentInformation6_0.toString());
  }
}
