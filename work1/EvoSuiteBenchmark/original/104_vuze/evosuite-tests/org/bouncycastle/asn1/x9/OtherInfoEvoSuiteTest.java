/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.x9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x9.KeySpecificInfo;
import org.bouncycastle.asn1.x9.OtherInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OtherInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OtherInfo otherInfo0 = new OtherInfo((KeySpecificInfo) null, (ASN1OctetString) null, (ASN1OctetString) null);
      ASN1OctetString aSN1OctetString0 = otherInfo0.getPartyAInfo();
      assertNull(aSN1OctetString0);
  }

  @Test
  public void test1()  throws Throwable  {
      OtherInfo otherInfo0 = new OtherInfo((KeySpecificInfo) null, (ASN1OctetString) null, (ASN1OctetString) null);
      KeySpecificInfo keySpecificInfo0 = otherInfo0.getKeyInfo();
      assertNull(keySpecificInfo0);
  }

  @Test
  public void test2()  throws Throwable  {
      OtherInfo otherInfo0 = new OtherInfo((KeySpecificInfo) null, (ASN1OctetString) null, (ASN1OctetString) null);
      ASN1OctetString aSN1OctetString0 = otherInfo0.getSuppPubInfo();
      assertNull(aSN1OctetString0);
  }

  @Test
  public void test3()  throws Throwable  {
      OtherInfo otherInfo0 = new OtherInfo((KeySpecificInfo) null, (ASN1OctetString) null, (ASN1OctetString) null);
      DERSequence dERSequence0 = (DERSequence)otherInfo0.getDERObject();
      assertEquals("[null, [2]null]", dERSequence0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DEROctetString dEROctetString0 = new DEROctetString((DEREncodable) null);
      OtherInfo otherInfo0 = new OtherInfo((KeySpecificInfo) null, (ASN1OctetString) dEROctetString0, (ASN1OctetString) dEROctetString0);
      DERSequence dERSequence0 = (DERSequence)otherInfo0.getDERObject();
      assertEquals("[null, [0]#0500, [2]#0500]", dERSequence0.toString());
  }
}
