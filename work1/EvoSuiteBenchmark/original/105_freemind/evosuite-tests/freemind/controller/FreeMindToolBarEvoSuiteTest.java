/*
 * This file was automatically generated by EvoSuite
 */

package freemind.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import freemind.controller.FreeMindToolBar;
import javax.swing.Action;
import javax.swing.text.DefaultEditorKit;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FreeMindToolBarEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FreeMindToolBar freeMindToolBar0 = new FreeMindToolBar(0);
      DefaultEditorKit.InsertBreakAction defaultEditorKit_InsertBreakAction0 = new DefaultEditorKit.InsertBreakAction();
      freeMindToolBar0.add((Action) defaultEditorKit_InsertBreakAction0);
      assertEquals(1, freeMindToolBar0.getComponentCount());
      assertEquals(1, freeMindToolBar0.countComponents());
  }

  @Test
  public void test1()  throws Throwable  {
      FreeMindToolBar freeMindToolBar0 = new FreeMindToolBar((String) null);
      assertEquals(false, freeMindToolBar0.isFloatable());
  }

  @Test
  public void test2()  throws Throwable  {
      FreeMindToolBar freeMindToolBar0 = new FreeMindToolBar();
      assertEquals(false, freeMindToolBar0.isFloatable());
  }
}
