/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.ResourceTypePermissionFinder;
import com.liferay.portal.service.persistence.ResourceTypePermissionFinderUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ResourceTypePermissionFinderUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        ResourceTypePermissionFinderUtil.findByEitherScopeC_G_N((-468L), (-468L), "e");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        ResourceTypePermissionFinderUtil.findByGroupScopeC_N_R((-220L), (String) null, (-220L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ResourceTypePermissionFinderUtil resourceTypePermissionFinderUtil0 = new ResourceTypePermissionFinderUtil();
      resourceTypePermissionFinderUtil0.setFinder((ResourceTypePermissionFinder) null);
  }
}
