/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.guiclient.gui.panels;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.pdfsam.guiclient.gui.panels.JLogPanel;

@RunWith(EvoSuiteRunner.class)
public class JLogPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JLogPanel jLogPanel0 = null;
      try {
        jLogPanel0 = new JLogPanel();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
