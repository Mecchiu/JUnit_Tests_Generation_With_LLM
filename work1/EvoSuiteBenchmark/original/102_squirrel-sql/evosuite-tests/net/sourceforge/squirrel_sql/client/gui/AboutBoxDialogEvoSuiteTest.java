/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.AboutBoxDialog;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AboutBoxDialogEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        AboutBoxDialog.showAboutBox((IApplication) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Null IApplication passed
         */
      }
  }
}
