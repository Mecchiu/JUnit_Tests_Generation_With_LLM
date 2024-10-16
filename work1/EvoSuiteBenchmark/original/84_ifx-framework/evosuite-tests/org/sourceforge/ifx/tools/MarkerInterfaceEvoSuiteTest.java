/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.tools.MarkerInterface;

@RunWith(EvoSuiteRunner.class)
public class MarkerInterfaceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MarkerInterface markerInterface0 = new MarkerInterface();
      String string0 = markerInterface0.getPackage();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      MarkerInterface markerInterface0 = new MarkerInterface();
      markerInterface0.setPackage("}A4.0x~zL2IPZm-");
      assertNull(markerInterface0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      MarkerInterface markerInterface0 = new MarkerInterface();
      markerInterface0.setName((String) null);
      assertNull(markerInterface0.getName());
  }

  @Test
  public void test3()  throws Throwable  {
      MarkerInterface markerInterface0 = new MarkerInterface();
      String string0 = markerInterface0.getName();
      assertNull(string0);
  }
}
