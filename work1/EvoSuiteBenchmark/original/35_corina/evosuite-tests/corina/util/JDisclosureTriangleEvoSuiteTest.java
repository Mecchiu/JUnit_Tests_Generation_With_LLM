/*
 * This file was automatically generated by EvoSuite
 */

package corina.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import corina.util.JDisclosureTriangle;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JMenu;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JDisclosureTriangleEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JMenu jMenu0 = new JMenu();
      JDisclosureTriangle jDisclosureTriangle0 = new JDisclosureTriangle("*", (JComponent) jMenu0);
      assertNotNull(jDisclosureTriangle0);
      
      Dimension dimension0 = jDisclosureTriangle0.getPreferredSize();
      assertNotNull(dimension0);
      assertEquals("java.awt.Dimension[width=17,height=31]", dimension0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      JMenu jMenu0 = new JMenu();
      JDisclosureTriangle jDisclosureTriangle0 = new JDisclosureTriangle("*", (JComponent) jMenu0, false);
      assertEquals("corina.util.JDisclosureTriangle[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDisclosureTriangle0.toString());
      assertEquals(1, jDisclosureTriangle0.countComponents());
      assertNotNull(jDisclosureTriangle0);
  }
}
