/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.x509;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Date;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERConstructedSequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AttCertValidityPeriod;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AttCertValidityPeriodEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AttCertValidityPeriod attCertValidityPeriod0 = new AttCertValidityPeriod((DERGeneralizedTime) null, (DERGeneralizedTime) null);
      DERGeneralizedTime dERGeneralizedTime0 = attCertValidityPeriod0.getNotBeforeTime();
      assertNull(dERGeneralizedTime0);
  }

  @Test
  public void test1()  throws Throwable  {
      Date date0 = new Date();
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(date0);
      AttCertValidityPeriod attCertValidityPeriod0 = new AttCertValidityPeriod(dERGeneralizedTime0, dERGeneralizedTime0);
      attCertValidityPeriod0.getNotAfterTime();
      assertEquals(1372725244792L, date0.getTime());
  }

  @Test
  public void test2()  throws Throwable  {
      AttCertValidityPeriod attCertValidityPeriod0 = new AttCertValidityPeriod((DERGeneralizedTime) null, (DERGeneralizedTime) null);
      byte[] byteArray0 = attCertValidityPeriod0.getEncoded();
      assertNotNull(byteArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      BERConstructedSequence bERConstructedSequence0 = new BERConstructedSequence();
      // Undeclared exception!
      try {
        AttCertValidityPeriod.getInstance((Object) bERConstructedSequence0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Bad sequence size: 0
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Date date0 = new Date();
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(date0);
      AttCertValidityPeriod attCertValidityPeriod0 = new AttCertValidityPeriod(dERGeneralizedTime0, dERGeneralizedTime0);
      AttCertValidityPeriod.getInstance((Object) attCertValidityPeriod0);
      assertEquals(1372725244938L, date0.getTime());
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        AttCertValidityPeriod.getInstance((Object) "DER");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown object in factory
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ASN1Encodable[] aSN1EncodableArray0 = new ASN1Encodable[2];
      DERSequence dERSequence0 = new DERSequence(aSN1EncodableArray0);
      AttCertValidityPeriod attCertValidityPeriod0 = new AttCertValidityPeriod((ASN1Sequence) dERSequence0);
      assertNotNull(attCertValidityPeriod0);
  }
}
