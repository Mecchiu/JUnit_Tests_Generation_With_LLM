/*
 * This file was automatically generated by EvoSuite
 */

package jahuwaldt.plot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jahuwaldt.plot.BoxLLSymbol;
import jahuwaldt.plot.CircleSymbol;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotRun;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.TabDSymbol;
import jahuwaldt.plot.TabRSymbol;
import jahuwaldt.plot.TabUpSymbol;
import java.awt.Color;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PlotRunEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.clear();
      assertEquals("[]", plotRun0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      CircleSymbol circleSymbol0 = new CircleSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, (PlotSymbol) circleSymbol0);
      assertNotNull(plotRun0);
      
      // Undeclared exception!
      try {
        plotRun0.add((Object) 1121.9710542024022);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.Double cannot be cast to jahuwaldt.plot.PlotDatum
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      PlotRun plotRun1 = new PlotRun((Collection) plotRun0);
      assertEquals("[]", plotRun1.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try {
        plotRun0.remove(894);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 894, Size: 0
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, (PlotSymbol) null);
      assertNotNull(plotRun0);
      
      plotRun0.lastIndexOf((Object) plotRun0);
      assertEquals(10, plotRun0.size());
      assertEquals(false, plotRun0.isEmpty());
  }

  @Test
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, (PlotSymbol) tabDSymbol0);
      assertNotNull(plotRun0);
      
      // Undeclared exception!
      try {
        plotRun0.set(451, (Object) 0.0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.Double cannot be cast to jahuwaldt.plot.PlotDatum
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      assertNotNull(plotRun0);
      
      // Undeclared exception!
      try {
        plotRun0.getMinY();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[14];
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun(doubleArray0, doubleArray1, true, (PlotSymbol) boxLLSymbol0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Object[][] objectArray0 = new Object[5][2];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[3]);
      Vector<Object> vector0 = defaultTableModel0.getDataVector();
      PlotRun plotRun0 = new PlotRun((Collection) vector0);
      assertNotNull(plotRun0);
      assertEquals(0, plotRun0.size());
  }

  @Test
  public void test9()  throws Throwable  {
      TreeSet<PlotDatum> treeSet0 = new TreeSet<PlotDatum>();
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-18.09977153015337), (-18.09977153015337), false, (PlotSymbol) tabRSymbol0);
      treeSet0.add(plotDatum0);
      PlotRun plotRun0 = new PlotRun((Collection) treeSet0);
      assertEquals(1, plotRun0.size());
      assertNotNull(plotRun0);
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, (PlotSymbol) tabDSymbol0);
      assertNotNull(plotRun0);
      
      double double0 = plotRun0.getMinX();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, (PlotSymbol) tabUpSymbol0);
      assertNotNull(plotRun0);
      
      double double0 = plotRun0.getMaxX();
      assertEquals(9, plotRun0.size());
      assertEquals(4.9E-324, double0, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      double double0 = plotRun0.getMinY();
      assertEquals(1.7976931348623157E308, double0, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, (PlotSymbol) null);
      assertNotNull(plotRun0);
      
      double double0 = plotRun0.getMaxY();
      assertEquals(4.9E-324, double0, 0.01D);
      assertEquals(0.0, plotRun0.getMinX(), 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      CircleSymbol circleSymbol0 = new CircleSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, (PlotSymbol) circleSymbol0);
      assertNotNull(plotRun0);
      
      plotRun0.setPlotSymbol((PlotSymbol) circleSymbol0);
      assertEquals(7, plotRun0.size());
  }

  @Test
  public void test15()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.setLineColor((Color) null);
      assertEquals("[]", plotRun0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[6];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      assertNotNull(plotRun0);
      
      // Undeclared exception!
      try {
        plotRun0.setLineColor((Color) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[7];
      PlotDatum plotDatum0 = new PlotDatum(6.745239538698439, 6.745239538698439, false);
      plotDatumArray0[0] = plotDatum0;
      plotDatumArray0[1] = plotDatum0;
      plotDatumArray0[2] = plotDatum0;
      plotDatumArray0[3] = plotDatum0;
      plotDatumArray0[4] = plotDatumArray0[0];
      plotDatumArray0[5] = plotDatumArray0[0];
      plotDatumArray0[6] = plotDatum0;
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      assertNotNull(plotRun0);
      
      PlotRun plotRun1 = (PlotRun)plotRun0.clone();
      assertNotSame(plotRun1, plotRun0);
      assertEquals(7, plotRun1.size());
      assertNotNull(plotRun1);
      assertEquals(6.745239538698439, plotRun0.getMaxX(), 0.01D);
  }
}
