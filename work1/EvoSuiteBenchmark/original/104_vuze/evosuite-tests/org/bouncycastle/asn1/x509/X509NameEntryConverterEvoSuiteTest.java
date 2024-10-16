/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.x509;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.bouncycastle.asn1.x509.X509DefaultEntryConverter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class X509NameEntryConverterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      X509DefaultEntryConverter x509DefaultEntryConverter0 = new X509DefaultEntryConverter();
      boolean boolean0 = x509DefaultEntryConverter0.canBePrintable("P9[xld2V");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      X509DefaultEntryConverter x509DefaultEntryConverter0 = new X509DefaultEntryConverter();
      try {
        x509DefaultEntryConverter0.convertHexEncoded("P9[xld2V", 0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * DER length more than 4 bytes
         */
      }
  }
}
