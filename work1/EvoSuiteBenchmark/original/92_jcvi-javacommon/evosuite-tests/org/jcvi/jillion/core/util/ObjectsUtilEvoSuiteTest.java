/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.core.util.ObjectsUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ObjectsUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = ObjectsUtil.nullSafeEquals(object0, object0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = ObjectsUtil.nullSafeEquals((Object) null, (Object) "");
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = ObjectsUtil.nullSafeEquals((Object) null, (Object) null);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      boolean boolean0 = ObjectsUtil.allNull(objectArray0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      Object object0 = new Object();
      objectArray0[0] = object0;
      boolean boolean0 = ObjectsUtil.allNull(objectArray0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = object0;
      objectArray0[1] = object0;
      objectArray0[2] = object0;
      objectArray0[3] = object0;
      objectArray0[4] = (Object) true;
      objectArray0[5] = (Object) true;
      objectArray0[6] = (Object) "q";
      objectArray0[7] = (Object) false;
      objectArray0[8] = (Object) 281474709;
      boolean boolean0 = ObjectsUtil.noneNull(objectArray0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      boolean boolean0 = ObjectsUtil.noneNull(objectArray0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      Object object0 = new Object();
      int int0 = ObjectsUtil.nullSafeHashCode(object0);
      assertEquals(2136991324, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = ObjectsUtil.nullSafeHashCode((Object) null);
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      Object object0 = new Object();
      ObjectsUtil.checkNotNull(object0, "");
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try {
        ObjectsUtil.checkNotNull((Object) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * 
         */
      }
  }
}
