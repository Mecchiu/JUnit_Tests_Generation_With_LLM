/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DERUTF8StringEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DERUTF8String dERUTF8String0 = new DERUTF8String("unknown object in getInstanceFromTagged");
      String string0 = dERUTF8String0.toString();
      assertEquals("unknown object in getInstanceFromTagged", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DERUTF8String dERUTF8String0 = new DERUTF8String("S;/z~$<5:1M1 <S");
      int int0 = dERUTF8String0.hashCode();
      assertEquals((-970166727), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      DERUTF8String dERUTF8String0 = new DERUTF8String("unknown object in getInstanceFromTagged");
      byte[] byteArray0 = dERUTF8String0.getEncoded("mzw,?");
      assertNotNull(byteArray0);
      assertEquals("unknown object in getInstanceFromTagged", dERUTF8String0.toString());
      assertEquals("unknown object in getInstanceFromTagged", dERUTF8String0.getString());
  }

  @Test
  public void test3()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(1);
      // Undeclared exception!
      try {
        DERUTF8String.getInstance((ASN1TaggedObject) bERTaggedObject0, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * illegal object in getInstance: org.bouncycastle.asn1.BERSequence
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DERUTF8String dERUTF8String0 = DERUTF8String.getInstance((Object) null);
      assertNull(dERUTF8String0);
  }

  @Test
  public void test5()  throws Throwable  {
      DERUTF8String dERUTF8String0 = new DERUTF8String("unknown object in getInstanceFromTagged");
      DERUTF8String dERUTF8String1 = DERUTF8String.getInstance((Object) dERUTF8String0);
      assertEquals("unknown object in getInstanceFromTagged", dERUTF8String1.getString());
      assertNotNull(dERUTF8String1);
  }

  @Test
  public void test6()  throws Throwable  {
      DERBoolean dERBoolean0 = new DERBoolean(false);
      BERConstructedOctetString bERConstructedOctetString0 = new BERConstructedOctetString((DERObject) dERBoolean0);
      DERUTF8String dERUTF8String0 = DERUTF8String.getInstance((Object) bERConstructedOctetString0);
      assertEquals("\u0001\u0001\u0000", dERUTF8String0.getString());
  }

  @Test
  public void test7()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(17);
      // Undeclared exception!
      try {
        DERUTF8String.getInstance((Object) bERTaggedObject0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * illegal object in getInstance: org.bouncycastle.asn1.BERSequence
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      DERUTF8String dERUTF8String0 = new DERUTF8String((String) null);
      DERUTF8String dERUTF8String1 = new DERUTF8String((String) null);
      // Undeclared exception!
      try {
        dERUTF8String0.equals((Object) dERUTF8String1);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      DERUTF8String dERUTF8String0 = new DERUTF8String("S;/z~$<5:1M1 <S");
      ASN1Encodable[] aSN1EncodableArray0 = new ASN1Encodable[1];
      DERSequence dERSequence0 = new DERSequence(aSN1EncodableArray0);
      boolean boolean0 = dERUTF8String0.asn1Equals((DERObject) dERSequence0);
      assertEquals(false, boolean0);
      assertEquals("S;/z~$<5:1M1 <S", dERUTF8String0.toString());
  }
}
