/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.softwarecatalog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.softwarecatalog.service.SCLicenseServiceUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SCLicenseServiceUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseServiceUtil.addLicense("READ_UNCOMMITTED", "READ_UNCOMMITTED", true, true, true);
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
        SCLicenseServiceUtil.setBeanIdentifier(";JH_-q+%");
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SCLicenseServiceUtil sCLicenseServiceUtil0 = new SCLicenseServiceUtil();
      assertNotNull(sCLicenseServiceUtil0);
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseServiceUtil.getBeanIdentifier();
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseServiceUtil.updateLicense((-1889L), "puR", "puR", true, true, true);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseServiceUtil.getLicense(0L);
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        SCLicenseServiceUtil.deleteLicense((-2L));
        fail("Expecting exception: BeanLocatorException");
      } catch(BeanLocatorException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
