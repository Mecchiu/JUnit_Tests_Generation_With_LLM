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
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DERSequenceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DERSequence dERSequence0 = new DERSequence();
      DEREncodableVector dEREncodableVector0 = new DEREncodableVector();
      dEREncodableVector0.add((DEREncodable) dERSequence0);
      DERSequence dERSequence1 = new DERSequence(dEREncodableVector0);
      assertEquals("[[]]", dERSequence1.toString());
      assertNotNull(dERSequence1);
  }

  @Test
  public void test1()  throws Throwable  {
      DERNull dERNull0 = new DERNull();
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject((-638), (DEREncodable) dERNull0);
      BERSequence bERSequence0 = (BERSequence)ASN1Sequence.getInstance((ASN1TaggedObject) bERTaggedObject0, false);
      assertEquals("[NULL]", bERSequence0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      DEREncodableVector dEREncodableVector0 = new DEREncodableVector();
      BERSequence bERSequence0 = new BERSequence(dEREncodableVector0);
      assertEquals("[]", bERSequence0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      ASN1Encodable[] aSN1EncodableArray0 = new ASN1Encodable[1];
      DERSequence dERSequence0 = new DERSequence(aSN1EncodableArray0);
      assertNotNull(dERSequence0);
      
      byte[] byteArray0 = dERSequence0.getEncoded("}UH(t^H}");
      assertNotNull(byteArray0);
      assertEquals("[null]", dERSequence0.toString());
      assertEquals(1, dERSequence0.size());
  }
}
