/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.upgrade.v6_1_0;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.upgrade.v6_1_0.UpgradeJournal;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UpgradeJournalEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UpgradeJournal upgradeJournal0 = new UpgradeJournal();
      try {
        upgradeJournal0.updateStructureXsd((-43L), "Microsot SQL Server");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      UpgradeJournal upgradeJournal0 = new UpgradeJournal();
      try {
        upgradeJournal0.doUpgrade();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
