/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.upgrade.v6_0_3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.upgrade.v6_0_3.UpgradeAsset;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UpgradeAssetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UpgradeAsset upgradeAsset0 = new UpgradeAsset();
      try {
        upgradeAsset0.doUpgrade();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      UpgradeAsset upgradeAsset0 = new UpgradeAsset();
      try {
        upgradeAsset0.updateAssetEntry(12L, 12L, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
