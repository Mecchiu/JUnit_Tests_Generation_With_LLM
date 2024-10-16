/*
 * This file was automatically generated by EvoSuite
 */

package com.eteks.sweethome3d.viewcontroller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.swing.SwingViewFactory;
import com.eteks.sweethome3d.viewcontroller.ContentManager;
import com.eteks.sweethome3d.viewcontroller.UserPreferencesController;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UserPreferencesControllerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      UserPreferencesController userPreferencesController0 = null;
      try {
        userPreferencesController0 = new UserPreferencesController((UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
