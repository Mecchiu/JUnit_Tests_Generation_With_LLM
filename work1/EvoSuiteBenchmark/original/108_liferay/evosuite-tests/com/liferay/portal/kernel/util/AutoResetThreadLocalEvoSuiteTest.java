/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.AutoResetThreadLocal;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AutoResetThreadLocalEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AutoResetThreadLocal<String> autoResetThreadLocal0 = new AutoResetThreadLocal<String>("s*.X1~`[6wHzqU&", "s*.X1~`[6wHzqU&");
  }

  @Test
  public void test1()  throws Throwable  {
      AutoResetThreadLocal<Integer> autoResetThreadLocal0 = new AutoResetThreadLocal<Integer>("");
  }
}
