/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.x509;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.V2Form;
import org.bouncycastle.asn1.x509.X509Name;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AttCertIssuerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BERSequence bERSequence0 = new BERSequence((DEREncodable) null);
      GeneralNames generalNames0 = new GeneralNames((ASN1Sequence) bERSequence0);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((Object) generalNames0);
      GeneralNames generalNames1 = (GeneralNames)attCertIssuer0.getIssuer();
      assertEquals("GeneralNames:\n    null\n", generalNames1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(1);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((ASN1TaggedObject) bERTaggedObject0, true);
      int int0 = attCertIssuer0.hashCode();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      BERSequence bERSequence0 = new BERSequence((DEREncodable) null);
      GeneralNames generalNames0 = new GeneralNames((ASN1Sequence) bERSequence0);
      V2Form v2Form0 = new V2Form(generalNames0);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((Object) v2Form0);
      assertNotNull(attCertIssuer0);
  }

  @Test
  public void test3()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(1);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((ASN1TaggedObject) bERTaggedObject0, true);
      AttCertIssuer attCertIssuer1 = AttCertIssuer.getInstance((Object) attCertIssuer0);
      assertSame(attCertIssuer1, attCertIssuer0);
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-99);
      DERTaggedObject dERTaggedObject0 = (DERTaggedObject)ASN1Object.fromByteArray(byteArray0);
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject((int) (byte) (-99), (DEREncodable) dERTaggedObject0);
      // Undeclared exception!
      try {
        AttCertIssuer.getInstance((ASN1TaggedObject) bERTaggedObject0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown object in getInstanceFromTagged
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = X509Name.O;
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject(true, 0, (DEREncodable) dERObjectIdentifier0);
      // Undeclared exception!
      try {
        AttCertIssuer.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown object in factory: class org.bouncycastle.asn1.DERObjectIdentifier
         */
      }
  }
}
