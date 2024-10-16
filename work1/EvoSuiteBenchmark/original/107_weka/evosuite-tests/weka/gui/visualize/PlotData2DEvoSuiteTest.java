/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.visualize;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.BeforeClass;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ProtectedProperties;
import weka.gui.visualize.PlotData2D;

@RunWith(EvoSuiteRunner.class)
public class PlotData2DEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      plotData2D0.setPlotNameHTML("");
      String string0 = plotData2D0.getPlotNameHTML();
      assertEquals("", plotData2D0.getPlotNameHTML());
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("gS^", arrayList0, 900);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      int int0 = plotData2D0.getCindex();
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 1203);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      plotData2D0.setXindex(1203);
      assertEquals(1203, plotData2D0.getXindex());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
  }

  @Test
  public void test3()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("gk", arrayList0, 114);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      int[] intArray0 = plotData2D0.getShapeSize();
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(0, plotData2D0.getCindex());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals("new plot", plotData2D0.getPlotNameHTML());
      assertNotNull(intArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      int int0 = plotData2D0.getYindex();
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals("new plot", plotData2D0.getPlotNameHTML());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      plotData2D0.setYindex((-1));
      assertEquals(-1, plotData2D0.getYindex());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
  }

  @Test
  public void test6()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      plotData2D0.setCindex(0);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals(0, plotData2D0.getCindex());
  }

  @Test
  public void test7()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("gS^", arrayList0, 900);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      Instances instances1 = plotData2D0.getPlotInstances();
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals(0, plotData2D0.getYindex());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertNotNull(instances1);
      assertEquals(false, plotData2D0.m_useCustomColour);
  }

  @Test
  public void test8()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      int int0 = plotData2D0.getXindex();
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals(0, int0);
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
  }

  @Test
  public void test9()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("gS^", arrayList0, 900);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      String string0 = plotData2D0.getPlotName();
      assertEquals("new plot", string0);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertNotNull(string0);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals(0, plotData2D0.getXindex());
  }

  @Test
  public void test10()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      assertEquals("new plot", plotData2D0.getPlotNameHTML());
      
      plotData2D0.setPlotName("");
      assertEquals(false, plotData2D0.m_displayAllPoints);
  }

  @Test
  public void test11()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      double[] doubleArray0 = new double[7];
      DenseInstance denseInstance0 = new DenseInstance((double) 875, doubleArray0);
      instances0.add((Instance) denseInstance0);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      int[] intArray0 = plotData2D0.getShapeType();
      assertNotNull(intArray0);
      
      plotData2D0.setShapeType(intArray0);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals(0, plotData2D0.getCindex());
  }

  @Test
  public void test12()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      double[] doubleArray0 = new double[14];
      DenseInstance denseInstance0 = new DenseInstance((double) 875, doubleArray0);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("", protectedProperties0);
      arrayList0.add(attribute0);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      instances0.add((Instance) denseInstance0);
      plotData2D0.addInstanceNumberAttribute();
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(0, plotData2D0.getXindex());
  }

  @Test
  public void test13()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 1203);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      String string0 = plotData2D0.getPlotNameHTML();
      assertNotNull(string0);
      assertEquals("new plot", string0);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals(0, plotData2D0.getXindex());
      assertEquals(false, plotData2D0.m_displayAllPoints);
  }

  @Test
  public void test14()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("gS^", arrayList0, 900);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      int[] intArray0 = new int[9];
      try {
        plotData2D0.setShapeType(intArray0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * PlotData2D: Shape type array must have the same number of entries as number of data points!
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      int[] intArray0 = new int[9];
      plotData2D0.setShapeSize(intArray0);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals("new plot", plotData2D0.getPlotNameHTML());
      assertEquals(0, plotData2D0.getXindex());
      assertEquals(0, plotData2D0.getCindex());
  }

  @Test
  public void test16()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      double[] doubleArray0 = new double[14];
      DenseInstance denseInstance0 = new DenseInstance((double) 875, doubleArray0);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      instances0.add((Instance) denseInstance0);
      boolean[] booleanArray0 = new boolean[1];
      plotData2D0.setConnectPoints(booleanArray0);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals(0, plotData2D0.getCindex());
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
  }

  @Test
  public void test17()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("gk", arrayList0, 114);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      boolean[] booleanArray0 = new boolean[2];
      try {
        plotData2D0.setConnectPoints(booleanArray0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * PlotData2D: connect points array must have the same number of entries as number of data points!
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("gS^", arrayList0, 900);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      
      plotData2D0.setCustomColour((Color) null);
      assertEquals("new plot", plotData2D0.getPlotNameHTML());
      assertEquals(0, plotData2D0.getYindex());
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals("new plot", plotData2D0.getPlotName());
  }

  @Test
  public void test19()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertNotNull(plotData2D0);
      assertEquals(false, plotData2D0.m_useCustomColour);
      
      Color color0 = Color.cyan;
      plotData2D0.setCustomColour(color0);
      assertEquals(true, plotData2D0.m_useCustomColour);
      assertEquals(0, plotData2D0.getYindex());
  }

  @Test
  public void test20()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      ArrayList<String> arrayList1 = new ArrayList<String>();
      Attribute attribute0 = new Attribute("", (List<String>) arrayList1, 1);
      arrayList0.add(attribute0);
      double[] doubleArray0 = new double[7];
      DenseInstance denseInstance0 = new DenseInstance((double) 875, doubleArray0);
      instances0.add((Instance) denseInstance0);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertNotNull(plotData2D0);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertEquals("new plot", plotData2D0.getPlotName());
      assertEquals(false, plotData2D0.m_useCustomColour);
  }

  @Test
  public void test21()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 875);
      double[] doubleArray0 = new double[14];
      DenseInstance denseInstance0 = new DenseInstance((double) 875, doubleArray0);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("", protectedProperties0);
      arrayList0.add(attribute0);
      instances0.add((Instance) denseInstance0);
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      assertEquals(false, plotData2D0.m_displayAllPoints);
      assertNotNull(plotData2D0);
      assertEquals((-1), plotData2D0.m_alwaysDisplayPointsOfThisSize);
      assertEquals(false, plotData2D0.m_useCustomColour);
      assertEquals("new plot", plotData2D0.getPlotName());
  }
}
