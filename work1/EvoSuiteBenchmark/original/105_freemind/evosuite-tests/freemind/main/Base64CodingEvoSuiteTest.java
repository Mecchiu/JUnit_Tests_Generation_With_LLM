/*
 * This file was automatically generated by EvoSuite
 */

package freemind.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import freemind.main.Base64Coding;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class Base64CodingEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Base64Coding base64Coding0 = new Base64Coding();
      assertNotNull(base64Coding0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = Base64Coding.decode64("I");
      assertNotNull(byteArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = Base64Coding.decode64("AAAAAA==");
      assertNotNull(byteArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = Base64Coding.decode64("+FYd]~)K{r");
      assertNull(byteArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = Base64Coding.decode64("~7s8hSDs}K;1R-\"!");
      assertNull(byteArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = Base64Coding.decode64("0@P)nxut:)CQtDl!");
      assertNull(byteArray0);
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = Base64Coding.decode64("fnUA/K0bAB0=");
      assertNotNull(byteArray0);
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Base64Coding.encode64(byteArray0);
      assertNotNull(string0);
      assertEquals("AAA=", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte) (-99);
      String string0 = Base64Coding.encode64(byteArray0);
      assertEquals("AJ0AAAAAAAAAAA==", string0);
      assertNotNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[5] = (byte) (-66);
      String string0 = Base64Coding.encode64(byteArray0);
      assertEquals("AAAAAAC+AAAAAA==", string0);
      assertNotNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[6] = (byte)11;
      byteArray0[7] = (byte) (-6);
      String string0 = Base64Coding.encode64(byteArray0);
      assertEquals("AAAAAAAAC/oAAA==", string0);
      assertNotNull(string0);
  }
}
