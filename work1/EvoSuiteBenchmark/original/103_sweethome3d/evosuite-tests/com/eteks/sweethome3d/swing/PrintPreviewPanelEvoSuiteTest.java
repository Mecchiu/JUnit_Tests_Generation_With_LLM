/*
 * This file was automatically generated by EvoSuite
 */

package com.eteks.sweethome3d.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.swing.PrintPreviewPanel;
import com.eteks.sweethome3d.swing.SwingViewFactory;
import com.eteks.sweethome3d.viewcontroller.HomeController;
import com.eteks.sweethome3d.viewcontroller.PrintPreviewController;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PrintPreviewPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Home home0 = new Home(17.829313F);
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      HomeController homeController0 = new HomeController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0);
      PrintPreviewController printPreviewController0 = new PrintPreviewController(home0, (UserPreferences) null, homeController0, (ViewFactory) swingViewFactory0);
      PrintPreviewPanel printPreviewPanel0 = null;
      try {
        printPreviewPanel0 = new PrintPreviewPanel(home0, (UserPreferences) null, homeController0, printPreviewController0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
