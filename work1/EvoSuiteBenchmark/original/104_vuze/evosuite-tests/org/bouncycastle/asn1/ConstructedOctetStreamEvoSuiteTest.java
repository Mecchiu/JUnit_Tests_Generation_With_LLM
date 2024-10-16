/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectParser;
import org.bouncycastle.asn1.ConstructedOctetStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConstructedOctetStreamEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConstructedOctetStream constructedOctetStream0 = new ConstructedOctetStream((ASN1ObjectParser) null);
      byte[] byteArray0 = new byte[11];
      // Undeclared exception!
      try {
        constructedOctetStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ConstructedOctetStream constructedOctetStream0 = new ConstructedOctetStream((ASN1ObjectParser) null);
      // Undeclared exception!
      try {
        constructedOctetStream0.read();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
