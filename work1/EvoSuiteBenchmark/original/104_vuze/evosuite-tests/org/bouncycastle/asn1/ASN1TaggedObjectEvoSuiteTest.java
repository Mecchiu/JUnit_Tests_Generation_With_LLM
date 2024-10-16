/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ASN1TaggedObjectEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(16);
      BERConstructedOctetString bERConstructedOctetString0 = (BERConstructedOctetString)bERTaggedObject0.getObjectParser(16, false);
      assertEquals(false, bERTaggedObject0.explicit);
      assertNotNull(bERConstructedOctetString0);
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals(16, bERTaggedObject0.tagNo);
      assertEquals("[16][]", bERTaggedObject0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DERBoolean dERBoolean0 = new DERBoolean(false);
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(11, (DEREncodable) dERBoolean0);
      DistributionPointName distributionPointName0 = new DistributionPointName((ASN1TaggedObject) bERTaggedObject0);
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals(true, bERTaggedObject0.isExplicit());
      assertNotNull(distributionPointName0);
      assertEquals(11, bERTaggedObject0.getTagNo());
      assertEquals("DistributionPointName: [\n    nameRelativeToCRLIssuer:\n        [FALSE]\n]\n", distributionPointName0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(19);
      boolean boolean0 = bERTaggedObject0.isEmpty();
      assertEquals("[19][]", bERTaggedObject0.toString());
      assertEquals(false, bERTaggedObject0.explicit);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(19);
      String string0 = bERTaggedObject0.toString();
      assertEquals("[19][]", string0);
      assertNotNull(string0);
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals(false, bERTaggedObject0.explicit);
  }

  @Test
  public void test4()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(true, 19, (DEREncodable) null);
      // Undeclared exception!
      try {
        ASN1TaggedObject.getInstance((ASN1TaggedObject) bERTaggedObject0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * implicitly tagged tagged object
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DisplayText displayText0 = new DisplayText("!cRa[iece)g");
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(true, 2046, (DEREncodable) displayText0);
      // Undeclared exception!
      try {
        ASN1TaggedObject.getInstance((ASN1TaggedObject) bERTaggedObject0, true);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * org.bouncycastle.asn1.DERUTF8String cannot be cast to org.bouncycastle.asn1.ASN1TaggedObject
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ASN1TaggedObject aSN1TaggedObject0 = ASN1TaggedObject.getInstance((Object) null);
      assertNull(aSN1TaggedObject0);
  }

  @Test
  public void test7()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(0);
      BERTaggedObject bERTaggedObject1 = (BERTaggedObject)ASN1TaggedObject.getInstance((Object) bERTaggedObject0);
      assertNotNull(bERTaggedObject1);
      assertEquals(false, bERTaggedObject0.explicit);
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals("[0][]", bERTaggedObject0.toString());
      assertEquals(0, bERTaggedObject1.getTagNo());
  }

  @Test
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try {
        ASN1TaggedObject.getInstance((Object) "BER");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown object in getInstance
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(0);
      boolean boolean0 = bERTaggedObject0.asn1Equals((DERObject) bERTaggedObject0);
      assertEquals(true, boolean0);
      assertEquals("[0][]", bERTaggedObject0.toString());
      assertEquals(false, bERTaggedObject0.explicit);
  }

  @Test
  public void test10()  throws Throwable  {
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((-410));
      BigInteger bigInteger0 = BigInteger.TEN;
      DEREnumerated dEREnumerated0 = new DEREnumerated(bigInteger0);
      boolean boolean0 = dERTaggedObject0.asn1Equals((DERObject) dEREnumerated0);
      assertEquals(false, dERTaggedObject0.explicit);
      assertEquals(false, boolean0);
      assertEquals("[-410][]", dERTaggedObject0.toString());
      assertEquals(false, dERTaggedObject0.empty);
  }

  @Test
  public void test11()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject(false, 22, (DEREncodable) bERTaggedObject0);
      boolean boolean0 = bERTaggedObject0.equals((Object) dERTaggedObject0);
      assertEquals("[22][0][]", dERTaggedObject0.toString());
      assertEquals(false, dERTaggedObject0.explicit);
      assertEquals(false, dERTaggedObject0.empty);
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(19);
      BERTaggedObject bERTaggedObject1 = new BERTaggedObject(true, 19, (DEREncodable) null);
      boolean boolean0 = bERTaggedObject1.asn1Equals((DERObject) bERTaggedObject0);
      assertEquals("[19][]", bERTaggedObject0.toString());
      assertEquals(false, boolean0);
      assertEquals(false, bERTaggedObject1.empty);
      assertEquals(false, bERTaggedObject0.explicit);
      assertEquals(true, bERTaggedObject1.isExplicit());
  }

  @Test
  public void test13()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(19);
      BERTaggedObject bERTaggedObject1 = new BERTaggedObject(false, 19, (DEREncodable) null);
      boolean boolean0 = bERTaggedObject1.asn1Equals((DERObject) bERTaggedObject0);
      assertEquals("[19][]", bERTaggedObject0.toString());
      assertEquals(false, boolean0);
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals(false, bERTaggedObject0.explicit);
  }

  @Test
  public void test14()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(true, 19, (DEREncodable) null);
      boolean boolean0 = bERTaggedObject0.asn1Equals((DERObject) bERTaggedObject0);
      assertEquals(true, bERTaggedObject0.explicit);
      assertEquals(19, bERTaggedObject0.tagNo);
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals(true, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(1026);
      GeneralName generalName0 = new GeneralName((DERObject) bERTaggedObject0, 1026);
      boolean boolean0 = bERTaggedObject0.equals((Object) generalName0);
      assertEquals(false, bERTaggedObject0.explicit);
      assertEquals("[1026][]", bERTaggedObject0.toString());
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(true, 19, (DEREncodable) null);
      int int0 = bERTaggedObject0.hashCode();
      assertEquals(19, int0);
      assertEquals(true, bERTaggedObject0.explicit);
  }

  @Test
  public void test17()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(0);
      int int0 = bERTaggedObject0.hashCode();
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals(false, bERTaggedObject0.explicit);
      assertEquals(0, int0);
      assertEquals("[0][]", bERTaggedObject0.toString());
  }

  @Test
  public void test18()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(true, 19, (DEREncodable) null);
      bERTaggedObject0.getObjectParser(19, true);
      assertEquals(19, bERTaggedObject0.tagNo);
      assertEquals(true, bERTaggedObject0.explicit);
      assertEquals(false, bERTaggedObject0.empty);
      assertEquals("[19]null", bERTaggedObject0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(1640);
      BERConstructedOctetString bERConstructedOctetString0 = (BERConstructedOctetString)bERTaggedObject0.getObjectParser(4, false);
      assertEquals(false, bERTaggedObject0.explicit);
      assertEquals("[1640][]", bERTaggedObject0.toString());
      assertEquals(false, bERTaggedObject0.empty);
      assertNotNull(bERConstructedOctetString0);
  }

  @Test
  public void test20()  throws Throwable  {
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((int) (byte)17);
      BERConstructedOctetString bERConstructedOctetString0 = (BERConstructedOctetString)dERTaggedObject0.getObjectParser((int) (byte)17, false);
      assertEquals(false, dERTaggedObject0.empty);
      assertEquals(17, dERTaggedObject0.tagNo);
      assertNotNull(bERConstructedOctetString0);
      assertEquals(false, dERTaggedObject0.explicit);
      assertEquals("[17][]", dERTaggedObject0.toString());
  }

  @Test
  public void test21()  throws Throwable  {
      DERBoolean dERBoolean0 = new DERBoolean(false);
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(11, (DEREncodable) dERBoolean0);
      // Undeclared exception!
      try {
        bERTaggedObject0.getObjectParser(11, false);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * implicit tagging not implemented for tag: 11
         */
      }
  }
}
