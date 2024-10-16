/*
 * This file was automatically generated by EvoSuite
 */

package org.gudy.azureus2.ui.swt.ipchecker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.gudy.azureus2.core3.ipchecker.extipchecker.ExternalIPCheckerService;
import org.gudy.azureus2.ui.swt.ipchecker.IpCheckerWizard;
import org.gudy.azureus2.ui.swt.ipchecker.ProgressPanel;
import org.gudy.azureus2.ui.swt.wizard.IWizardPanel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ProgressPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ProgressPanel progressPanel0 = new ProgressPanel((IpCheckerWizard) null, (IWizardPanel) null);
      // Undeclared exception!
      try {
        progressPanel0.finish();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ProgressPanel progressPanel0 = new ProgressPanel((IpCheckerWizard) null, (IWizardPanel) null);
      // Undeclared exception!
      try {
        progressPanel0.show();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ProgressPanel progressPanel0 = new ProgressPanel((IpCheckerWizard) null, (IWizardPanel) null);
      // Undeclared exception!
      try {
        progressPanel0.checkFailed((ExternalIPCheckerService) null, "m8X.Q-Xb{FK<%;Pxy");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
