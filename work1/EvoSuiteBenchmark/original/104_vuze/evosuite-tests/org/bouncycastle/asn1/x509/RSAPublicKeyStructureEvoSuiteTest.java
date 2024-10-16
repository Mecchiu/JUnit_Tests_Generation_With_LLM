/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.x509;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.RSAPublicKeyStructure;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RSAPublicKeyStructureEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      RSAPublicKeyStructure rSAPublicKeyStructure0 = new RSAPublicKeyStructure(bigInteger0, bigInteger0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((-1973), (DEREncodable) rSAPublicKeyStructure0);
      RSAPublicKeyStructure rSAPublicKeyStructure1 = RSAPublicKeyStructure.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
      assertNotSame(rSAPublicKeyStructure0, rSAPublicKeyStructure1);
  }

  @Test
  public void test1()  throws Throwable  {
      RSAPublicKeyStructure rSAPublicKeyStructure0 = RSAPublicKeyStructure.getInstance((Object) null);
      assertNull(rSAPublicKeyStructure0);
  }

  @Test
  public void test2()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      RSAPublicKeyStructure rSAPublicKeyStructure0 = new RSAPublicKeyStructure(bigInteger0, bigInteger0);
      RSAPublicKeyStructure rSAPublicKeyStructure1 = RSAPublicKeyStructure.getInstance((Object) rSAPublicKeyStructure0);
      assertSame(rSAPublicKeyStructure1, rSAPublicKeyStructure0);
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        RSAPublicKeyStructure.getInstance((Object) "T:e~zn!:vm~m");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid RSAPublicKeyStructure: java.lang.String
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BERTaggedObject bERTaggedObject0 = new BERTaggedObject(true, 0, (DEREncodable) null);
      // Undeclared exception!
      try {
        RSAPublicKeyStructure.getInstance((ASN1TaggedObject) bERTaggedObject0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Bad sequence size: 1
         */
      }
  }
}
