/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.dao.orm.hibernate.region;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.hibernate.region.MBeanRegisteringPortalLifecycle;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import net.sf.ehcache.CacheManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MBeanRegisteringPortalLifecycleEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MBeanRegisteringPortalLifecycle mBeanRegisteringPortalLifecycle0 = new MBeanRegisteringPortalLifecycle((CacheManager) null);
      try {
        mBeanRegisteringPortalLifecycle0.doPortalInit();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MBeanRegisteringPortalLifecycle mBeanRegisteringPortalLifecycle0 = new MBeanRegisteringPortalLifecycle((CacheManager) null);
      // Undeclared exception!
      try {
        mBeanRegisteringPortalLifecycle0.doPortalDestroy();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
