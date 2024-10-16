/*
 * This file was automatically generated by EvoSuite
 */

package client.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.gui.Cash;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CashEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Cash cash0 = new Cash();
      assertNotNull(cash0);
      assertEquals("client.gui.Cash[,0,0,800x600,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", cash0.toString());
      assertEquals(1, cash0.getComponentCount());
  }
}
