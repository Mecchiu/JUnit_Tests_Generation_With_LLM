/*
 * This file was automatically generated by EvoSuite
 */

package it.pdfsam.console.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import it.pdfsam.console.exception.ConsoleException;
import it.pdfsam.console.tools.PrefixParser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PrefixParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PrefixParser prefixParser0 = null;
      try {
        prefixParser0 = new PrefixParser("", "");
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * Filename length is 0.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrefixParser prefixParser0 = null;
      try {
        prefixParser0 = new PrefixParser((String) null, (String) null);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * Filename length is 0.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PrefixParser prefixParser0 = new PrefixParser("4bE..", "4bE..");
      assertEquals("4bE..4bE..pdf", prefixParser0.generateFileName());
      assertNotNull(prefixParser0);
  }

  @Test
  public void test3()  throws Throwable  {
      PrefixParser prefixParser0 = new PrefixParser("4bE..", "?)G{;-");
      assertNotNull(prefixParser0);
      
      String string0 = prefixParser0.generateFileName("mNgG=jW3");
      assertEquals("mNgG=jW3_4bE..?)G{;-.pdf", string0);
      assertNotNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      PrefixParser prefixParser0 = new PrefixParser("[CURRENTPAGE]", "[CURRENTPAGE]");
      assertNotNull(prefixParser0);
      
      String string0 = prefixParser0.generateFileName("P-_,oF!MXK}");
      assertEquals("P-_,oF!MXK}.pdf", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      PrefixParser prefixParser0 = new PrefixParser("4bE..", "?)G{;-");
      assertNotNull(prefixParser0);
      
      String string0 = prefixParser0.generateFileName();
      assertEquals("4bE..?)G{;-.pdf", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      PrefixParser prefixParser0 = new PrefixParser("[TIMESTAMP]", "[TIMESTAMP]");
      assertNotNull(prefixParser0);
      
      String string0 = prefixParser0.generateFileName();
      assertEquals("20130702_180226709.pdf", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      PrefixParser prefixParser0 = new PrefixParser("[TIMESTAMP]", "[TIMESTAMP]");
      assertNotNull(prefixParser0);
      
      String string0 = prefixParser0.generateFileName("mwlf?M_|R");
      assertEquals("20130702_180227246.pdf", prefixParser0.generateFileName());
      assertEquals("20130702_180227246.pdf", string0);
  }
}
