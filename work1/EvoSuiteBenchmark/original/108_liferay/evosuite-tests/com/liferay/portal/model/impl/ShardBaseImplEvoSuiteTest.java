/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.impl.ShardImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ShardBaseImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ShardImpl shardImpl0 = null;
      try {
        shardImpl0 = new ShardImpl();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.model.impl.ShardImpl
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ShardImpl shardImpl0 = null;
      try {
        shardImpl0 = new ShardImpl();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.model.impl.ShardImpl
         */
      }
  }
}
