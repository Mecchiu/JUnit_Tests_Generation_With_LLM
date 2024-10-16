/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.fw.completion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.swing.Action;
import javax.swing.TransferHandler;
import net.sourceforge.squirrel_sql.client.gui.session.ToolsPopupCompletionInfo;
import net.sourceforge.squirrel_sql.fw.completion.CompletionInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CompletionInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Action action0 = TransferHandler.getCutAction();
      ToolsPopupCompletionInfo toolsPopupCompletionInfo0 = new ToolsPopupCompletionInfo("dc#0TMEJ-U8:r{J(`", action0);
      boolean boolean0 = toolsPopupCompletionInfo0.matchesCompletionString("NULL IAPPLICATION PASSEDNULL IAPPLICATION PASSEDNULL IAPPLICATON PASSEDNULL IAPPLICATION PASSED");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Action action0 = TransferHandler.getCutAction();
      ToolsPopupCompletionInfo toolsPopupCompletionInfo0 = new ToolsPopupCompletionInfo("dc#0TMEJ-U8:r{J(`", action0);
      boolean boolean0 = toolsPopupCompletionInfo0.hasColumns();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Action action0 = TransferHandler.getCutAction();
      ToolsPopupCompletionInfo toolsPopupCompletionInfo0 = new ToolsPopupCompletionInfo("dc#0TMEJ-U8:r{J(`", action0);
      int int0 = toolsPopupCompletionInfo0.compareTo((CompletionInfo) toolsPopupCompletionInfo0);
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      Action action0 = TransferHandler.getCutAction();
      ToolsPopupCompletionInfo toolsPopupCompletionInfo0 = new ToolsPopupCompletionInfo("NULL IAPPLICATION PASSEDNULL IAPPLICATION PASSEDNULL IAPPLICATON PASSEDNULL IAPPLICATION PASSED", action0);
      boolean boolean0 = toolsPopupCompletionInfo0.matchesCompletionStringStart("dc#0TMEJ-U8:r{J(`", true);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Action action0 = TransferHandler.getCutAction();
      ToolsPopupCompletionInfo toolsPopupCompletionInfo0 = new ToolsPopupCompletionInfo("dc#0TMEJ-U8:r{J(`", action0);
      boolean boolean0 = toolsPopupCompletionInfo0.matchesCompletionStringStart("dc#0TMEJ-U8:r{J(`", false);
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      Action action0 = TransferHandler.getCutAction();
      ToolsPopupCompletionInfo toolsPopupCompletionInfo0 = new ToolsPopupCompletionInfo("dc#0TMEJ-U8:r{J(`", action0);
      boolean boolean0 = toolsPopupCompletionInfo0.matchesCompletionStringStart("NULL IAPPLICATION PASSEDNULL IAPPLICATION PASSEDNULL IAPPLICATON PASSEDNULL IAPPLICATION PASSED", false);
      assertEquals(false, boolean0);
  }
}
