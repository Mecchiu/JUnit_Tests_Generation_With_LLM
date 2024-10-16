/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.repository.cmis.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.repository.cmis.search.CMISInTreeExpression;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CMISInTreeExpressionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CMISInTreeExpression cMISInTreeExpression0 = new CMISInTreeExpression("v");
      String string0 = cMISInTreeExpression0.toQueryFragment();
      assertNotNull(string0);
      assertEquals("IN_TREE('v')", string0);
  }
}
