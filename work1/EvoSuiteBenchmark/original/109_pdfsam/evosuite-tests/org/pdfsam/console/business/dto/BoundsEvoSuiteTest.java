/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.console.business.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.pdfsam.console.business.dto.Bounds;

@RunWith(EvoSuiteRunner.class)
public class BoundsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Bounds bounds0 = new Bounds();
      bounds0.setStart(808);
      Bounds bounds1 = new Bounds();
      boolean boolean0 = bounds1.intersects(bounds0);
      assertEquals("808-0", bounds0.toString());
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Bounds bounds0 = new Bounds((-1), (-1));
      Bounds bounds1 = new Bounds();
      boolean boolean0 = bounds0.intersects(bounds1);
      assertEquals(false, boolean0);
      assertEquals(-1, bounds0.getStart());
      assertEquals(-1, bounds0.getEnd());
  }

  @Test
  public void test2()  throws Throwable  {
      Bounds bounds0 = new Bounds((-505), 0);
      String string0 = bounds0.toString();
      assertNotNull(string0);
      assertEquals("-505-0", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      Bounds bounds0 = new Bounds((-1), (-1));
      bounds0.setEnd((-1));
      assertEquals("-1--1", bounds0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      Bounds bounds0 = new Bounds(0, 0);
      Bounds bounds1 = new Bounds(1, 1);
      boolean boolean0 = bounds1.intersects(bounds0);
      assertEquals(1, bounds1.getStart());
      assertEquals(false, boolean0);
      assertEquals(1, bounds1.getEnd());
  }

  @Test
  public void test5()  throws Throwable  {
      Bounds bounds0 = new Bounds((-505), 0);
      boolean boolean0 = bounds0.intersects(bounds0);
      assertEquals(true, boolean0);
      assertEquals(-505, bounds0.getStart());
      assertEquals(0, bounds0.getEnd());
  }
}
