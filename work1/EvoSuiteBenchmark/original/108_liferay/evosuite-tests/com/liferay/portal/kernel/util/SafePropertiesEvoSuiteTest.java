/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.SafeProperties;
import javax.swing.Action;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SafePropertiesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SafeProperties safeProperties0 = new SafeProperties();
      String string0 = safeProperties0.getProperty("Zg;EqiP");
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      SafeProperties safeProperties0 = new SafeProperties();
      safeProperties0.setProperty("af@2r%%/s{sz]O mp", "af@2r%%/s{sz]O mp");
      assertEquals(1, safeProperties0.size());
      assertEquals(false, safeProperties0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      SafeProperties safeProperties0 = new SafeProperties();
      String string0 = safeProperties0.getEncodedProperty("Q");
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      SafeProperties safeProperties0 = new SafeProperties();
      Object object0 = safeProperties0.put((Object) null, (Object) null);
      assertNull(object0);
  }

  @Test
  public void test4()  throws Throwable  {
      SafeProperties safeProperties0 = new SafeProperties();
      Object object0 = safeProperties0.put((Object) "BandMerge", (Object) null);
      assertNull(object0);
  }

  @Test
  public void test5()  throws Throwable  {
      SafeProperties safeProperties0 = new SafeProperties();
      String string0 = Action.SMALL_ICON;
      Object object0 = safeProperties0.remove((Object) string0);
      assertNull(object0);
  }

  @Test
  public void test6()  throws Throwable  {
      SafeProperties safeProperties0 = new SafeProperties();
      Object object0 = safeProperties0.remove((Object) null);
      assertNull(object0);
  }
}
