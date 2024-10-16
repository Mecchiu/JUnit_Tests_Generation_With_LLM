/*
 * This file was automatically generated by EvoSuite
 */

package jahuwaldt.plot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jahuwaldt.plot.CircleSymbol;
import jahuwaldt.plot.PlotAxis;
import jahuwaldt.plot.PlotRunList;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.PlotXAxis;
import jahuwaldt.plot.PlotYAxis;
import jahuwaldt.plot.SimplePlotXY;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimplePlotXYEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      PlotYAxis plotYAxis0 = new PlotYAxis();
      simplePlotXY0.setHorizontalAxis((PlotAxis) plotYAxis0);
      assertEquals((-1.7976931348623157E308), plotYAxis0.getUpperBounds(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Locale locale0 = JComponent.getDefaultLocale();
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getInstance(locale0);
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "", "", "", (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      assertNotNull(simplePlotXY0);
      
      PlotRunList plotRunList0 = simplePlotXY0.getRuns();
      assertNotNull(plotRunList0);
      
      simplePlotXY0.setRuns(plotRunList0);
      assertEquals(0.0, plotRunList0.getMinY(), 0.01D);
      assertEquals(0.0, plotRunList0.getMinX(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      // Undeclared exception!
      try {
        simplePlotXY0.clone();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      PlotAxis plotAxis0 = simplePlotXY0.getVerticalAxis();
      assertNull(plotAxis0);
  }

  @Test
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("z");
      DecimalFormat decimalFormat0 = (DecimalFormat)simpleDateFormat0.getNumberFormat();
      CircleSymbol circleSymbol0 = new CircleSymbol();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "z", "z", "z", (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0, (PlotSymbol) circleSymbol0);
      assertNotNull(simplePlotXY0);
      
      PlotXAxis plotXAxis0 = (PlotXAxis)simplePlotXY0.getHorizontalAxis();
      assertNotNull(plotXAxis0);
      assertEquals(2, plotXAxis0.getGridStyle());
  }

  @Test
  public void test5()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getCurrencyInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(plotRunList0, (String) null, (String) null, (String) null, (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      simplePlotXY0.setTitle((String) null);
      assertNull(simplePlotXY0.getTitle());
  }

  @Test
  public void test6()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      String string0 = simplePlotXY0.getTitle();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      simplePlotXY0.setVerticalAxis((PlotAxis) null);
      assertNull(simplePlotXY0.getTitle());
  }

  @Test
  public void test8()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getCurrencyInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(plotRunList0, (String) null, (String) null, (String) null, (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      JCheckBox jCheckBox0 = new JCheckBox((String) null);
      CompoundBorder compoundBorder0 = new CompoundBorder();
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jCheckBox0, (Border) compoundBorder0, 18, 18, 18, 18);
      // Undeclared exception!
      try {
        simplePlotXY0.draw((Graphics) null, (Component) jCheckBox0, rectangle0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[8];
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getIntegerInstance();
      SimplePlotXY simplePlotXY0 = null;
      try {
        simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray1, (String) null, (String) null, (String) null, (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Inconsistant array sizes.
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Locale locale0 = JComponent.getDefaultLocale();
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getInstance(locale0);
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "", "", "", (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader((TableColumnModel) defaultTableColumnModel0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("", (Icon) null);
      Rectangle rectangle0 = jRadioButtonMenuItem0.getBounds((Rectangle) null);
      // Undeclared exception!
      try {
        simplePlotXY0.draw((Graphics) null, (Component) jTableHeader0, rectangle0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
