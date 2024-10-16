/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERTaggedObject;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DERTaggedObjectEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(0);
      byte[] byteArray0 = bERTaggedObject0.getDEREncoded();
      assertNotNull(byteArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject(286);
      assertEquals(false, dERTaggedObject0.isExplicit());
  }

  @Test
  public void test2()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject((-1));
      bERTaggedObject0.empty = true;
      byte[] byteArray0 = bERTaggedObject0.getDEREncoded();
      assertNotNull(byteArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(byteArray0);
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(0, (DEREncodable) dERGeneralizedTime0);
      byte[] byteArray1 = bERTaggedObject0.getDEREncoded();
      assertFalse(byteArray0.equals(byteArray1));
  }

  @Test
  public void test4()  throws Throwable  {
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject(false, 1, (DEREncodable) null);
      byte[] byteArray0 = dERTaggedObject0.getEncoded();
      assertNotNull(byteArray0);
  }
}
