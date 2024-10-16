/*
 * This file was automatically generated by EvoSuite
 */

package de.progra.charting.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.progra.charting.model.AbstractChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.model.StackedChartDataModelConstraints;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StackedChartDataModelConstraintsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[1][4];
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) (-1727);
      EditableDataSet editableDataSet0 = new EditableDataSet(objectArray0, (Object[]) intArray0, Integer.MIN_VALUE);
      editableDataSetArray0[0] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) editableChartDataModel0, 498, false);
      Double double0 = (Double)stackedChartDataModelConstraints0.getMaximumValue();
      assertEquals(4.9E-324, (double)double0, 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[1][4];
      String[] stringArray0 = new String[3];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, (Object[]) intArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) objectChartDataModel0, (-285));
      Integer integer0 = (Integer)stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[1][4];
      int[] intArray1 = new int[3];
      intArray1[0] = (-1727);
      intArray0[0] = intArray1;
      String[] stringArray0 = new String[3];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, (Object[]) intArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) objectChartDataModel0, (-285));
      Double double0 = (Double)stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals((-1727.0), (double)double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) objectChartDataModel0, 1);
      double double0 = stackedChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[1][7];
      Object[] objectArray0 = new Object[21];
      String[] stringArray0 = new String[5];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, objectArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) objectChartDataModel0, 0);
      double double0 = stackedChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(21.0, double0, 0.01D);
  }
}
