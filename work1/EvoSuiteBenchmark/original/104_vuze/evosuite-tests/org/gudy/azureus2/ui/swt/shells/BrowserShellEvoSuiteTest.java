/*
 * This file was automatically generated by EvoSuite
 */

package org.gudy.azureus2.ui.swt.shells;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.gudy.azureus2.ui.swt.shells.BrowserShell;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BrowserShellEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BrowserShell browserShell0 = new BrowserShell("'", "'", 1578, 1);
      assertNotNull(browserShell0);
  }
}
