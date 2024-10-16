/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.webserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.webserver.WebServerEntry;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WebServerEntryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WebServerEntry webServerEntry0 = null;
      try {
        webServerEntry0 = new WebServerEntry("/", "X~!x1");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      WebServerEntry webServerEntry0 = null;
      try {
        webServerEntry0 = new WebServerEntry("8i:S/", "8i:S/");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      WebServerEntry webServerEntry0 = null;
      try {
        webServerEntry0 = new WebServerEntry("x", "x");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
