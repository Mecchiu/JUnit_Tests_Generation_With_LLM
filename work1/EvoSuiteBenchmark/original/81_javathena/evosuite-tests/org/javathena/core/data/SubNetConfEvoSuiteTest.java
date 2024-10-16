/*
 * This file was automatically generated by EvoSuite
 */

package org.javathena.core.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.javathena.core.data.SubNetConf;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SubNetConfEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      subNetConf0.setMap_ip(0L);
      assertEquals(0L, subNetConf0.getMap_ip());
  }

  @Test
  public void test1()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      long long0 = subNetConf0.getMask();
      assertEquals(0L, long0);
  }

  @Test
  public void test2()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      subNetConf0.setSubnet(0L);
      assertEquals(0L, subNetConf0.getMask());
  }

  @Test
  public void test3()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      long long0 = subNetConf0.getSubnet();
      assertEquals(0L, long0);
  }

  @Test
  public void test4()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      long long0 = subNetConf0.getMap_ip();
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      subNetConf0.setMask(0L);
      assertEquals(0L, subNetConf0.getMap_ip());
  }

  @Test
  public void test6()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      subNetConf0.setChar_ip(0L);
      assertEquals(0L, subNetConf0.getMask());
  }

  @Test
  public void test7()  throws Throwable  {
      SubNetConf subNetConf0 = new SubNetConf();
      long long0 = subNetConf0.getChar_ip();
      assertEquals(0L, long0);
  }
}
