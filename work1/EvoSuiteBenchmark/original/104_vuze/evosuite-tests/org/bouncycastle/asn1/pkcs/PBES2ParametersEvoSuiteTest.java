/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.pkcs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PBES2ParametersEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DERObjectIdentifier dERObjectIdentifier0 = PKCSObjectIdentifiers.id_alg_PWRI_KEK;
      BERSequence bERSequence0 = new BERSequence((DEREncodable) dERObjectIdentifier0);
      DERSequence dERSequence0 = new DERSequence((DEREncodable) bERSequence0);
      PBES2Parameters pBES2Parameters0 = null;
      try {
        pBES2Parameters0 = new PBES2Parameters((ASN1Sequence) dERSequence0);
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
        /*
         * Vector Enumeration
         */
      }
  }
}
