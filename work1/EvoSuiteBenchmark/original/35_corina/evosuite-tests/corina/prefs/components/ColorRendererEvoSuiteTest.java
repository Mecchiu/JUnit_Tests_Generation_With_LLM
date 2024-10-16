/*
 * This file was automatically generated by EvoSuite
 */

package corina.prefs.components;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import corina.prefs.components.ColorRenderer;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ColorRendererEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ColorRenderer colorRenderer0 = new ColorRenderer(false);
      JTable jTable0 = new JTable();
      // Undeclared exception!
      try {
        colorRenderer0.getTableCellRendererComponent(jTable0, (Object) null, false, false, 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ColorRenderer colorRenderer0 = new ColorRenderer(true);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Vector<Object> vector0 = defaultTableModel0.getDataVector();
      JTable jTable0 = new JTable(vector0, vector0);
      // Undeclared exception!
      try {
        colorRenderer0.getTableCellRendererComponent(jTable0, (Object) null, true, true, 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ColorRenderer colorRenderer0 = new ColorRenderer(true);
      JTable jTable0 = new JTable();
      // Undeclared exception!
      try {
        colorRenderer0.getTableCellRendererComponent(jTable0, (Object) null, false, true, 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
