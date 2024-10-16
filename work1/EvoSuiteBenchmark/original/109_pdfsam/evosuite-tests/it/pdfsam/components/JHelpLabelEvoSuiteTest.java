/*
 * This file was automatically generated by EvoSuite
 */

package it.pdfsam.components;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import it.pdfsam.components.JHelpLabel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JHelpLabelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JHelpLabel jHelpLabel0 = new JHelpLabel("Tem9ar- documeaHnt ", false);
      assertEquals("<html><body>Tem9ar&#45 documeaHnt </body></html>", jHelpLabel0.getToolTipText());
      assertNotNull(jHelpLabel0);
  }

  @Test
  public void test1()  throws Throwable  {
      JHelpLabel jHelpLabel0 = new JHelpLabel("{B8lOAI!", true);
      assertEquals(true, jHelpLabel0.isPreferredSizeSet());
      assertEquals(true, jHelpLabel0.isMaximumSizeSet());
      assertEquals(true, jHelpLabel0.isMinimumSizeSet());
      assertEquals("{B8lOAI!", jHelpLabel0.getToolTipText());
  }

  @Test
  public void test2()  throws Throwable  {
      JHelpLabel jHelpLabel0 = new JHelpLabel("{B8lOAI!", false);
      assertEquals(true, jHelpLabel0.isMinimumSizeSet());
      assertEquals("<html><body>&#123B8lOAI&#33</body></html>", jHelpLabel0.getToolTipText());
      assertEquals(true, jHelpLabel0.isPreferredSizeSet());
      assertNotNull(jHelpLabel0);
  }
}
