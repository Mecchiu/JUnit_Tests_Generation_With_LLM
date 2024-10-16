/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.cache.CacheRegistryImpl;
import com.liferay.portal.kernel.cache.CacheRegistry;
import com.liferay.portal.kernel.cache.CacheRegistryItem;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CacheRegistryUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        CacheRegistryUtil.unregister("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        CacheRegistryUtil.clear();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        CacheRegistryUtil.register((CacheRegistryItem) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CacheRegistryImpl cacheRegistryImpl0 = (CacheRegistryImpl)CacheRegistryUtil.getCacheRegistry();
      CacheRegistryUtil.setCacheRegistry((CacheRegistry) cacheRegistryImpl0);
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        CacheRegistryUtil.setActive(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        CacheRegistryUtil.clear((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      CacheRegistryUtil cacheRegistryUtil0 = new CacheRegistryUtil();
      assertNotNull(cacheRegistryUtil0);
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try {
        CacheRegistryUtil.isActive();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
