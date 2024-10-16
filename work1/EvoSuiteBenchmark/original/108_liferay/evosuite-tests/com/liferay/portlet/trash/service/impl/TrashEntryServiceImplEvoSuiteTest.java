/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.trash.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portlet.trash.service.impl.TrashEntryServiceImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TrashEntryServiceImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TrashEntryServiceImpl trashEntryServiceImpl0 = new TrashEntryServiceImpl();
      // Undeclared exception!
      try {
        trashEntryServiceImpl0.getEntries(1458L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
