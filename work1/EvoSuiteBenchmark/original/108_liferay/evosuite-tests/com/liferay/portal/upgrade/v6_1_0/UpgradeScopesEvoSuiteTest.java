/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.upgrade.v6_1_0;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.upgrade.v6_1_0.UpgradeScopes;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UpgradeScopesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UpgradeScopes upgradeScopes0 = new UpgradeScopes();
      try {
        upgradeScopes0.doUpgrade();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      UpgradeScopes upgradeScopes0 = new UpgradeScopes();
      String string0 = upgradeScopes0.getUpdatePortletPreferencesWhereClause();
      assertEquals("preferences like '%lfrScopeLayoutUuid%'", string0);
  }
}
