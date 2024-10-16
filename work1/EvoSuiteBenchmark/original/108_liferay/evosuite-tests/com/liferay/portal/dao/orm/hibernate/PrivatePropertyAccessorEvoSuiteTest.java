/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.dao.orm.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.hibernate.PrivatePropertyAccessor;
import org.hibernate.PropertyNotFoundException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PrivatePropertyAccessorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PrivatePropertyAccessor privatePropertyAccessor0 = new PrivatePropertyAccessor();
      Class<?> class0 = Class.class;
      try {
        privatePropertyAccessor0.getSetter((Class) class0, "");
        fail("Expecting exception: PropertyNotFoundException");
      } catch(PropertyNotFoundException e) {
        /*
         * field [_] not found on java.lang.Class
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrivatePropertyAccessor privatePropertyAccessor0 = new PrivatePropertyAccessor();
      Class<?> class0 = PrivatePropertyAccessor.class;
      try {
        privatePropertyAccessor0.getGetter((Class) class0, "");
        fail("Expecting exception: PropertyNotFoundException");
      } catch(PropertyNotFoundException e) {
        /*
         * field [_] not found on com.liferay.portal.dao.orm.hibernate.PrivatePropertyAccessor
         */
      }
  }
}
