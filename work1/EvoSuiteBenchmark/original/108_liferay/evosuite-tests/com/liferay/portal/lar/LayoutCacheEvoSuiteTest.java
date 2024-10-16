/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.lar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.lar.LayoutCache;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LayoutCacheEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      layoutCache0.getEntityGroupId((-546L), "MessageDigest.MD2", "MessageDigest.MD2");
      long long0 = layoutCache0.getEntityGroupId((-546L), "MessageDigest.MD2", "MessageDigest.MD2");
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getEntityGroupId(15L, "user-group", "user-group");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getEntityGroupId((-1L), "organization", "organization");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      Map<String, Long> map0 = layoutCache0.getEntityMap((-29L), "S");
      assertNotNull(map0);
      
      Map<String, Long> map1 = layoutCache0.getEntityMap((-29L), "S");
      assertSame(map1, map0);
  }

  @Test
  public void test4()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getEntityMap(748L, "user-group");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getEntityMap((-14L), "organization");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getGroupRoles_1to4((-815L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getGroupRoles_5((-26L), "org.bouncycstle.jce.providxr.JCEDHKeyAgreement");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getGroupUsers((-14L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getRole((-29L), "S");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      LayoutCache layoutCache0 = new LayoutCache();
      // Undeclared exception!
      try {
        layoutCache0.getUserRoles(0L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
