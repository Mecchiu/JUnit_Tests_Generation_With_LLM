/*
 * This file was automatically generated by EvoSuite
 */

package org.heal.servlet.cataloger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.heal.servlet.cataloger.SaveMetadataAction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SaveMetadataActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SaveMetadataAction saveMetadataAction0 = new SaveMetadataAction();
      boolean boolean0 = saveMetadataAction0.actionRequiresLogin();
      assertEquals(true, boolean0);
  }
}
