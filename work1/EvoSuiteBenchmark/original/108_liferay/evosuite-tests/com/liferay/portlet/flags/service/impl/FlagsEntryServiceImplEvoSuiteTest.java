/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.flags.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.flags.service.impl.FlagsEntryServiceImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FlagsEntryServiceImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FlagsEntryServiceImpl flagsEntryServiceImpl0 = new FlagsEntryServiceImpl();
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try {
        flagsEntryServiceImpl0.addEntry("Ulkuy\"Zcn`k+,L\"+8(/", 0L, "Ulkuy\"Zcn`k+,L\"+8(/", (-1032L), "Ulkuy\"Zcn`k+,L\"+8(/", "Ulkuy\"Zcn`k+,L\"+8(/", "Ulkuy\"Zcn`k+,L\"+8(/", serviceContext0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
