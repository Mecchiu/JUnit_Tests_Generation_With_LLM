/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.mobiledevicerules.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portlet.mobiledevicerules.model.MDRAction;
import com.liferay.portlet.mobiledevicerules.model.MDRActionSoap;
import com.liferay.portlet.mobiledevicerules.model.MDRActionWrapper;
import com.liferay.portlet.mobiledevicerules.model.impl.MDRActionImpl;
import com.liferay.portlet.mobiledevicerules.model.impl.MDRActionModelImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MDRActionImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MDRActionSoap mDRActionSoap0 = new MDRActionSoap();
      // Undeclared exception!
      try {
        MDRActionModelImpl.toModel(mDRActionSoap0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portlet.mobiledevicerules.model.impl.MDRActionModelImpl
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MDRActionImpl mDRActionImpl0 = null;
      try {
        mDRActionImpl0 = new MDRActionImpl();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portlet.mobiledevicerules.model.impl.MDRActionImpl
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MDRActionImpl mDRActionImpl0 = null;
      try {
        mDRActionImpl0 = new MDRActionImpl();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portlet.mobiledevicerules.model.impl.MDRActionImpl
         */
      }
  }
}
