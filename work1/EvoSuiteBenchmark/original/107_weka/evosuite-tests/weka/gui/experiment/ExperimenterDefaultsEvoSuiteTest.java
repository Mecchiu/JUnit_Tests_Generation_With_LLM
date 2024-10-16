/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.experiment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.util.Properties;
import org.junit.BeforeClass;
import weka.experiment.ResultMatrixPlainText;
import weka.gui.experiment.ExperimenterDefaults;

@RunWith(EvoSuiteRunner.class)
public class ExperimenterDefaultsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = (ResultMatrixPlainText)ExperimenterDefaults.getOutputFormat();
      assertEquals(2, resultMatrixPlainText0.getMeanPrec());
      assertEquals(2, resultMatrixPlainText0.getStdDevPrec());
      assertNotNull(resultMatrixPlainText0);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = ExperimenterDefaults.getColumn();
      assertEquals("Key_Scheme,Key_Scheme_options,Key_Scheme_version_ID", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = ExperimenterDefaults.getTrainPercentage();
      assertEquals(66.0, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = ExperimenterDefaults.getDestination();
      assertEquals("ARFF file", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = ExperimenterDefaults.getExperimentType();
      assertEquals("Cross-validation", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = ExperimenterDefaults.getComparisonField();
      assertEquals("percent_correct", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      ExperimenterDefaults experimenterDefaults0 = new ExperimenterDefaults();
      assertEquals(true, experimenterDefaults0.getDatasetsFirst());
  }

  @Test
  public void test7()  throws Throwable  {
      Properties properties0 = ExperimenterDefaults.getProperties();
      assertEquals(true, properties0.isEmpty());
  }

  @Test
  public void test8()  throws Throwable  {
      String string0 = ExperimenterDefaults.getTester();
      assertEquals("Paired T-Tester (corrected)", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = ExperimenterDefaults.getRepetitions();
      assertEquals(10, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = ExperimenterDefaults.getExtension();
      assertEquals(".exp", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = ExperimenterDefaults.getFolds();
      assertEquals(10, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = ExperimenterDefaults.getSignificance();
      assertEquals(0.05, double0, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      boolean boolean0 = ExperimenterDefaults.getDatasetsFirst();
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      boolean boolean0 = ExperimenterDefaults.getUseClassification();
      assertEquals(true, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = ExperimenterDefaults.getSorting();
      assertEquals("", string0);
  }

  @Test
  public void test16()  throws Throwable  {
      boolean boolean0 = ExperimenterDefaults.getUseRelativePaths();
      assertEquals(false, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = ExperimenterDefaults.getRow();
      assertEquals("Key_Dataset", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      File file0 = ExperimenterDefaults.getInitialDatasetsDirectory();
      assertNotNull(file0);
      assertEquals("/mnt/fastdata/ac1gf/SF110/dist/107_weka", file0.getPath());
  }
}
