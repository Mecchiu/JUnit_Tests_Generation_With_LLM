/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.firebirdsql.encodings.Encoding_ISO8859_6;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class Encoding_ISO8859_6EvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Encoding_ISO8859_6 encoding_ISO8859_6_0 = new Encoding_ISO8859_6();
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[6];
      int int0 = encoding_ISO8859_6_0.encodeToCharset(charArray0, 1028, (-219), byteArray0);
      assertEquals((-219), int0);
  }

  @Test
  public void test1()  throws Throwable  {
      Encoding_ISO8859_6 encoding_ISO8859_6_0 = new Encoding_ISO8859_6();
      byte[] byteArray0 = new byte[6];
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try {
        encoding_ISO8859_6_0.decodeFromCharset(byteArray0, (-985), 1584, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -985
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[10];
      Encoding_ISO8859_6 encoding_ISO8859_6_0 = null;
      try {
        encoding_ISO8859_6_0 = new Encoding_ISO8859_6(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 10
         */
      }
  }
}
