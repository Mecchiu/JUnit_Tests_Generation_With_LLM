/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.util.RegExUtil;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RegExUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Pattern pattern0 = RegExUtil.getCachedPattern("`\u00EF\u00BF\u00BD\"\u00EF\u00BF\u00BD$%^&*()-_=+[{]};:'@#~,<.>/?'", "`\u00EF\u00BF\u00BD\"\u00EF\u00BF\u00BD$%^&*()-_=+[{]};:'@#~,<.>/?'");
      assertEquals(0, pattern0.flags());
  }

  @Test
  public void test1()  throws Throwable  {
      RegExUtil regExUtil0 = new RegExUtil();
      assertNotNull(regExUtil0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        RegExUtil.getCachedPattern("pju(#l]0){m", "pju(#l]0){m");
        fail("Expecting exception: PatternSyntaxException");
      } catch(PatternSyntaxException e) {
        /*
         * Illegal repetition near index 8
         * pju(#l]0){m
         *         ^
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      boolean boolean0 = RegExUtil.mightBeEvil("g5)/[e{<Qv15We*J");
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      boolean boolean0 = RegExUtil.mightBeEvil("]@O");
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = RegExUtil.mightBeEvil("`\u00EF\u00BF\u00BD\"\u00EF\u00BF\u00BD$%^&*()-_=+[{]};:'@#~,<.>/?'");
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = RegExUtil.mightBeEvil("|Aein (pr|-initaFi^atio)");
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = RegExUtil.mightBeEvil("ju(bm{)*{_UWm");
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      boolean boolean0 = RegExUtil.mightBeEvil("pju(#l]0){m");
      assertEquals(false, boolean0);
  }
}
