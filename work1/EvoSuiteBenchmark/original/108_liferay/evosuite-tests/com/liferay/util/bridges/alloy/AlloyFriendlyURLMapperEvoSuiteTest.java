/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.util.bridges.alloy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.util.bridges.alloy.AlloyFriendlyURLMapper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AlloyFriendlyURLMapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AlloyFriendlyURLMapper alloyFriendlyURLMapper0 = new AlloyFriendlyURLMapper();
      assertNull(alloyFriendlyURLMapper0.getMapping());
  }
}
