/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.guiclient.commons.business.loaders.callable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import org.junit.BeforeClass;
import org.pdfsam.guiclient.commons.business.loaders.callable.ReloadPdfDocument;
import org.pdfsam.guiclient.commons.panels.JPdfSelectionPanel;

@RunWith(EvoSuiteRunner.class)
public class ReloadPdfDocumentEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("rO", "rO");
      ReloadPdfDocument reloadPdfDocument0 = new ReloadPdfDocument(file0, (JPdfSelectionPanel) null, "rO", "rO", 0);
      // Undeclared exception!
      try {
        reloadPdfDocument0.call();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ReloadPdfDocument reloadPdfDocument0 = new ReloadPdfDocument((File) null, (JPdfSelectionPanel) null, "8Z%b?*g^Fmk?}KC5kl", "8Z%b?*g^Fmk?}KC5kl", 201);
      Boolean boolean0 = reloadPdfDocument0.call();
      assertEquals(false, boolean0.booleanValue());
  }
}
