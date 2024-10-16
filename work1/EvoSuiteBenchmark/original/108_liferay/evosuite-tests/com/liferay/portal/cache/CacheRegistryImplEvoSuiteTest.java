/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.cache.CacheRegistryImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CacheRegistryImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CacheRegistryImpl cacheRegistryImpl0 = new CacheRegistryImpl();
      boolean boolean0 = cacheRegistryImpl0.isActive();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      CacheRegistryImpl cacheRegistryImpl0 = new CacheRegistryImpl();
      cacheRegistryImpl0.clear("KwkoP<");
      assertEquals(true, cacheRegistryImpl0.isActive());
  }

  @Test
  public void test2()  throws Throwable  {
      CacheRegistryImpl cacheRegistryImpl0 = new CacheRegistryImpl();
      cacheRegistryImpl0.setActive(true);
      assertEquals(true, cacheRegistryImpl0.isActive());
  }

  @Test
  public void test3()  throws Throwable  {
      CacheRegistryImpl cacheRegistryImpl0 = new CacheRegistryImpl();
      assertEquals(true, cacheRegistryImpl0.isActive());
      
      cacheRegistryImpl0.setActive(false);
      assertEquals(false, cacheRegistryImpl0.isActive());
  }

  @Test
  public void test4()  throws Throwable  {
      CacheRegistryImpl cacheRegistryImpl0 = new CacheRegistryImpl();
      cacheRegistryImpl0.unregister("KwkoP<");
      assertEquals(true, cacheRegistryImpl0.isActive());
  }
}
