/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.visualize;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import weka.gui.visualize.AttributePanelEvent;

@RunWith(EvoSuiteRunner.class)
public class AttributePanelEventEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AttributePanelEvent attributePanelEvent0 = new AttributePanelEvent(false, false, 246);
      assertEquals(false, attributePanelEvent0.m_yChange);
      assertEquals(false, attributePanelEvent0.m_xChange);
      assertEquals(246, attributePanelEvent0.m_indexVal);
  }
}
