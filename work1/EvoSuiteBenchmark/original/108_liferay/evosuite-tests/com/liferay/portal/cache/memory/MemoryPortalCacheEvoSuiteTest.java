/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.cache.memory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.cache.memory.MemoryPortalCache;
import com.liferay.portal.kernel.cache.CacheListener;
import com.liferay.portal.kernel.cache.CacheListenerScope;
import com.liferay.portal.kernel.cache.PortalCache;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MemoryPortalCacheEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MemoryPortalCache<String, Serializable> memoryPortalCache0 = new MemoryPortalCache<String, Serializable>("3", 776);
      CacheListenerScope cacheListenerScope0 = CacheListenerScope.ALL;
      // Undeclared exception!
      try {
        memoryPortalCache0.registerCacheListener((CacheListener<String, Serializable>) null, cacheListenerScope0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MemoryPortalCache<Serializable, Object> memoryPortalCache0 = new MemoryPortalCache<Serializable, Object>("", 1480);
      assertNotNull(memoryPortalCache0);
      
      LinkedHashSet<Serializable> linkedHashSet0 = new LinkedHashSet<Serializable>();
      linkedHashSet0.add((Serializable) "");
      Collection<Object> collection0 = memoryPortalCache0.get((Collection<Serializable>) linkedHashSet0);
      assertEquals(1, collection0.size());
      assertNotNull(collection0);
  }

  @Test
  public void test2()  throws Throwable  {
      MemoryPortalCache<Integer, PortalCache<String, String>> memoryPortalCache0 = new MemoryPortalCache<Integer, PortalCache<String, String>>("7*IvEcKIy;n", 1687);
      memoryPortalCache0.destroy();
      assertNull(memoryPortalCache0.getName());
  }

  @Test
  public void test3()  throws Throwable  {
      MemoryPortalCache<Serializable, String> memoryPortalCache0 = new MemoryPortalCache<Serializable, String>("", 82);
      memoryPortalCache0.unregisterCacheListeners();
      assertEquals("", memoryPortalCache0.getName());
  }

  @Test
  public void test4()  throws Throwable  {
      MemoryPortalCache<String, PortalCache<String, Serializable>> memoryPortalCache0 = new MemoryPortalCache<String, PortalCache<String, Serializable>>("", 0);
      // Undeclared exception!
      try {
        memoryPortalCache0.unregisterCacheListener((CacheListener<String, PortalCache<String, Serializable>>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MemoryPortalCache<Integer, String> memoryPortalCache0 = new MemoryPortalCache<Integer, String>("", 0);
      String string0 = memoryPortalCache0.getName();
      assertEquals("", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      MemoryPortalCache<Integer, Serializable> memoryPortalCache0 = new MemoryPortalCache<Integer, Serializable>("", 369);
      memoryPortalCache0.put((Integer) 369, (Serializable) 369);
      memoryPortalCache0.put((Integer) 369, (Serializable) "");
      assertEquals("", memoryPortalCache0.getName());
  }

  @Test
  public void test7()  throws Throwable  {
      MemoryPortalCache<Serializable, Serializable> memoryPortalCache0 = new MemoryPortalCache<Serializable, Serializable>("3", 776);
      memoryPortalCache0.put((Serializable) 776, (Serializable) 776, 776);
      assertEquals("3", memoryPortalCache0.getName());
  }

  @Test
  public void test8()  throws Throwable  {
      MemoryPortalCache<Integer, Serializable> memoryPortalCache0 = new MemoryPortalCache<Integer, Serializable>("", 369);
      memoryPortalCache0.put((Integer) 369, (Serializable) 369);
      memoryPortalCache0.put((Integer) 369, (Serializable) 369, 369);
      assertEquals("", memoryPortalCache0.getName());
  }

  @Test
  public void test9()  throws Throwable  {
      MemoryPortalCache<Integer, PortalCache<String, String>> memoryPortalCache0 = new MemoryPortalCache<Integer, PortalCache<String, String>>("7*IvEcKIy;n", 1687);
      memoryPortalCache0.remove((Integer) 1687);
      assertEquals("7*IvEcKIy;n", memoryPortalCache0.getName());
  }
}
