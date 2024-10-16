/*
 * This file was automatically generated by EvoSuite
 */

package de.progra.charting.render;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.render.RadarChartRenderer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RadarChartRendererEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer((CoordSystem) null, (ChartDataModel) null);
      assertNotNull(radarChartRenderer0);
  }

  @Test
  public void test1()  throws Throwable  {
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer((ChartDataModel) null);
      assertNotNull(radarChartRenderer0);
  }
}
