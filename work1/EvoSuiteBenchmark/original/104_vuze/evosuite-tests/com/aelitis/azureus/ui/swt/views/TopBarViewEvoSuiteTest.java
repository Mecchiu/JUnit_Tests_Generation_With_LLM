/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.ui.swt.views;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.ui.swt.skin.SWTSkinObject;
import com.aelitis.azureus.ui.swt.views.TopBarView;
import org.gudy.azureus2.ui.swt.plugins.UISWTViewEventListener;
import org.gudy.azureus2.ui.swt.pluginsimpl.UISWTViewCore;
import org.gudy.azureus2.ui.swt.pluginsimpl.UISWTViewImpl;
import org.gudy.azureus2.ui.swt.views.LoggerView;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TopBarViewEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TopBarView topBarView0 = new TopBarView();
      // Undeclared exception!
      try {
        topBarView0.skinObjectInitialShow((SWTSkinObject) null, (Object) "sharing");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TopBarView topBarView0 = new TopBarView();
      LoggerView loggerView0 = new LoggerView();
      UISWTViewImpl uISWTViewImpl0 = new UISWTViewImpl("<@", "<@", (UISWTViewEventListener) loggerView0, (Object) topBarView0);
      // Undeclared exception!
      try {
        topBarView0.activateTopBar((UISWTViewCore) uISWTViewImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
