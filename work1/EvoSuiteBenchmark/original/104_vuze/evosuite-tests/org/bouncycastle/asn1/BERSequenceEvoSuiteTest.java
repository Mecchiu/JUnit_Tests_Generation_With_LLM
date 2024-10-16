/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERNull;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROutputStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BERSequenceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BERSequence bERSequence0 = new BERSequence();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BEROutputStream bEROutputStream0 = new BEROutputStream((OutputStream) byteArrayOutputStream0);
      bERSequence0.encode((DEROutputStream) bEROutputStream0);
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("0\uFFFD\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DEREncodableVector dEREncodableVector0 = new DEREncodableVector();
      BERSequence bERSequence0 = new BERSequence(dEREncodableVector0);
      assertEquals("[]", bERSequence0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      BERNull bERNull0 = new BERNull();
      BERSequence bERSequence0 = new BERSequence((DEREncodable) bERNull0);
      byte[] byteArray0 = bERSequence0.getEncoded();
      assertNotNull(byteArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      DERObjectIdentifier dERObjectIdentifier0 = new DERObjectIdentifier(byteArray0);
      BERSequence bERSequence0 = new BERSequence((DEREncodable) dERObjectIdentifier0);
      byte[] byteArray1 = bERSequence0.getDEREncoded();
      assertNotSame(byteArray0, byteArray1);
  }
}
