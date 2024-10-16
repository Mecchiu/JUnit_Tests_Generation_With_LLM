/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.fw.gui.action.wikiTable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.sourceforge.squirrel_sql.fw.gui.action.wikiTable.WikiTableSelection;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WikiTableSelectionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WikiTableSelection wikiTableSelection0 = new WikiTableSelection();
      wikiTableSelection0.setData("OAE|VkwU[");
  }

  @Test
  public void test1()  throws Throwable  {
      WikiTableSelection wikiTableSelection0 = new WikiTableSelection();
      Class<?> class0 = WikiTableSelection.class;
      DataFlavor dataFlavor0 = new DataFlavor(class0, "`Uz-((0HBeEj218");
      try {
        wikiTableSelection0.getTransferData(dataFlavor0);
        fail("Expecting exception: UnsupportedFlavorException");
      } catch(UnsupportedFlavorException e) {
        /*
         * `Uz-((0HBeEj218
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      WikiTableSelection wikiTableSelection0 = new WikiTableSelection();
      DataFlavor[] dataFlavorArray0 = wikiTableSelection0.getTransferDataFlavors();
      DataFlavor dataFlavor0 = DataFlavor.selectBestTextFlavor(dataFlavorArray0);
      // Undeclared exception!
      try {
        wikiTableSelection0.getTransferData(dataFlavor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
