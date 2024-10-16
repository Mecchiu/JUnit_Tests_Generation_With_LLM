/*
 * This file was automatically generated by EvoSuite
 */

package weka.classifiers.lazy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Enumeration;
import org.junit.BeforeClass;
import weka.classifiers.lazy.IBk;
import weka.classifiers.meta.RegressionByDiscretization;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.neighboursearch.CoverTree;
import weka.core.neighboursearch.LinearNNSearch;
import weka.core.neighboursearch.NearestNeighbourSearch;

@RunWith(EvoSuiteRunner.class)
public class IBkEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      String string0 = iBk0.globalInfo();
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(753, iBk0.getKNN());
      assertEquals("K-nearest neighbours classifier. Can select appropriate value of K based on cross-validation. Can also do distance weighting.\n\nFor more information, see\n\nD. Aha, D. Kibler (1991). Instance-based learning algorithms. Machine Learning. 6:37-66.", string0);
      assertEquals(0, iBk0.getWindowSize());
      assertNotNull(string0);
      assertEquals(false, iBk0.getMeanSquared());
  }

  @Test
  public void test1()  throws Throwable  {
      IBk iBk0 = new IBk((-1095));
      String[] stringArray0 = iBk0.getOptions();
      assertNotNull(stringArray0);
      
      iBk0.setOptions(stringArray0);
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(-1095, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
  }

  @Test
  public void test2()  throws Throwable  {
      IBk iBk0 = new IBk(21);
      String string0 = iBk0.distanceWeightingTipText();
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals("Gets the distance weighting method used.", string0);
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(21, iBk0.getKNN());
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test3()  throws Throwable  {
      IBk iBk0 = new IBk(16);
      LinearNNSearch linearNNSearch0 = (LinearNNSearch)iBk0.getNearestNeighbourSearchAlgorithm();
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(16, iBk0.getKNN());
      assertEquals(false, iBk0.getMeanSquared());
      assertNotNull(linearNNSearch0);
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test4()  throws Throwable  {
      IBk iBk0 = new IBk();
      // Undeclared exception!
      try {
        iBk0.getNumTraining();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      IBk iBk0 = new IBk();
      String string0 = iBk0.windowSizeTipText();
      assertEquals(1, iBk0.getKNN());
      assertEquals("Gets the maximum number of instances allowed in the training pool. The addition of new instances above this value will result in old instances being removed. A value of 0 signifies no limit to the number of training instances.", string0);
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(0, iBk0.getWindowSize());
  }

  @Test
  public void test6()  throws Throwable  {
      IBk iBk0 = new IBk((-1095));
      String string0 = iBk0.meanSquaredTipText();
      assertEquals("Whether the mean squared error is used rather than mean absolute error when doing cross-validation for regression problems.", string0);
      assertEquals(-1095, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test7()  throws Throwable  {
      IBk iBk0 = new IBk();
      String string0 = iBk0.KNNTipText();
      assertEquals("The number of neighbours to use.", string0);
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(1, iBk0.getKNN());
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test8()  throws Throwable  {
      IBk iBk0 = new IBk();
      String string0 = iBk0.getRevision();
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals("8034", string0);
      assertEquals(false, iBk0.getMeanSquared());
      assertNotNull(string0);
      assertEquals(1, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
  }

  @Test
  public void test9()  throws Throwable  {
      IBk iBk0 = new IBk(43);
      Enumeration<Object> enumeration0 = iBk0.listOptions();
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(43, iBk0.getKNN());
      assertNotNull(enumeration0);
      assertEquals(0, iBk0.getWindowSize());
  }

  @Test
  public void test10()  throws Throwable  {
      IBk iBk0 = new IBk(0);
      String string0 = iBk0.nearestNeighbourSearchAlgorithmTipText();
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals("The nearest neighbour search algorithm to use (Default: weka.core.neighboursearch.LinearNNSearch).", string0);
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(0, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
  }

  @Test
  public void test11()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      int int0 = iBk0.getWindowSize();
      assertEquals(753, iBk0.getKNN());
      assertEquals(0, int0);
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(false, iBk0.getMeanSquared());
  }

  @Test
  public void test12()  throws Throwable  {
      IBk iBk0 = new IBk(16);
      String string0 = iBk0.crossValidateTipText();
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(16, iBk0.getKNN());
      assertEquals("Whether hold-one-out cross-validation will be used to select the best k value.", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      IBk iBk0 = new IBk();
      try {
        iBk0.buildClassifier((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      IBk iBk0 = new IBk(21);
      SelectedTag selectedTag0 = iBk0.getDistanceWeighting();
      assertEquals(21, iBk0.getKNN());
      assertEquals("1", selectedTag0.toString());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(0, iBk0.getWindowSize());
      assertNotNull(selectedTag0);
  }

  @Test
  public void test15()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      SelectedTag selectedTag0 = regressionByDiscretization0.getEstimatorType();
      iBk0.setDistanceWeighting(selectedTag0);
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(753, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test16()  throws Throwable  {
      IBk iBk0 = new IBk(21);
      assertEquals(21, iBk0.getKNN());
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      iBk0.setOptions(stringArray0);
      assertEquals(1, iBk0.getKNN());
  }

  @Test
  public void test17()  throws Throwable  {
      IBk iBk0 = new IBk();
      assertEquals(false, iBk0.getCrossValidate());
      
      iBk0.setCrossValidate(true);
      iBk0.getOptions();
      assertEquals(true, iBk0.getCrossValidate());
      assertEquals(1, iBk0.getKNN());
  }

  @Test
  public void test18()  throws Throwable  {
      IBk iBk0 = new IBk();
      assertEquals(false, iBk0.getMeanSquared());
      
      iBk0.setMeanSquared(true);
      iBk0.getOptions();
      assertEquals(true, iBk0.getMeanSquared());
      assertEquals(1, iBk0.getKNN());
  }

  @Test
  public void test19()  throws Throwable  {
      IBk iBk0 = new IBk((-1095));
      Enumeration<Object> enumeration0 = iBk0.enumerateMeasures();
      assertNotNull(enumeration0);
      assertEquals(false, enumeration0.hasMoreElements());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(-1095, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
  }

  @Test
  public void test20()  throws Throwable  {
      IBk iBk0 = new IBk(16);
      CoverTree coverTree0 = new CoverTree();
      iBk0.setNearestNeighbourSearchAlgorithm((NearestNeighbourSearch) coverTree0);
      assertEquals(false, iBk0.getCrossValidate());
      
      iBk0.setCrossValidate(true);
      iBk0.enumerateMeasures();
      assertEquals(true, iBk0.getCrossValidate());
  }

  @Test
  public void test21()  throws Throwable  {
      IBk iBk0 = new IBk();
      // Undeclared exception!
      try {
        iBk0.getMeasure("P]PqIjE~3{e");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * P]PqIjE~3{e not supported (NearestNeighbourSearch)
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      IBk iBk0 = new IBk();
      double double0 = iBk0.getMeasure("measureKNN");
      assertEquals(1.0, double0, 0.01D);
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(0, iBk0.getWindowSize());
  }

  @Test
  public void test23()  throws Throwable  {
      IBk iBk0 = new IBk();
      String string0 = iBk0.toString();
      assertEquals(1, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getCrossValidate());
      assertNotNull(string0);
      assertEquals("IBk: No model built yet.", string0);
      assertEquals(false, iBk0.getMeanSquared());
  }

  @Test
  public void test24()  throws Throwable  {
      IBk iBk0 = new IBk();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("P]PqIjE~3{e", arrayList0, 1);
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = iBk0.makeDistribution(instances0, doubleArray0);
      assertEquals(false, iBk0.getMeanSquared());
      assertNotNull(doubleArray1);
      assertEquals(1, iBk0.getKNN());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test25()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 753);
      double[] doubleArray0 = new double[10];
      DenseInstance denseInstance0 = new DenseInstance(0.0, doubleArray0);
      instances0.add((Instance) denseInstance0);
      // Undeclared exception!
      try {
        iBk0.makeDistribution(instances0, doubleArray0);
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * Data has no class attribute!
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      IBk iBk0 = new IBk();
      // Undeclared exception!
      try {
        iBk0.crossValidate();
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * Couldn't optimize by cross-validation: null
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      IBk iBk0 = new IBk();
      CoverTree coverTree0 = new CoverTree();
      iBk0.setNearestNeighbourSearchAlgorithm((NearestNeighbourSearch) coverTree0);
      // Undeclared exception!
      try {
        iBk0.crossValidate();
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * Couldn't optimize by cross-validation: CoverTree doesn't support hold-one-out cross-validation. Use some other NN method.
         */
      }
  }

  @Test
  public void test28()  throws Throwable  {
      IBk iBk0 = new IBk();
      double[] doubleArray0 = new double[9];
      iBk0.pruneToK((Instances) null, doubleArray0, 789);
      assertEquals(1, iBk0.getKNN());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test29()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 753);
      double[] doubleArray0 = new double[10];
      Instances instances1 = iBk0.pruneToK(instances0, doubleArray0, 753);
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(753, iBk0.getKNN());
      assertEquals(false, iBk0.getMeanSquared());
      assertNull(instances1);
      assertEquals(false, iBk0.getCrossValidate());
  }

  @Test
  public void test30()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 753);
      double[] doubleArray0 = new double[10];
      DenseInstance denseInstance0 = new DenseInstance(0.0, doubleArray0);
      instances0.add((Instance) denseInstance0);
      Instances instances1 = iBk0.pruneToK(instances0, doubleArray0, 753);
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(false, iBk0.getMeanSquared());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(753, iBk0.getKNN());
      assertNotNull(instances1);
  }

  @Test
  public void test31()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 753);
      double[] doubleArray0 = new double[8];
      DenseInstance denseInstance0 = new DenseInstance(0.0, doubleArray0);
      instances0.add((Instance) denseInstance0);
      instances0.add((Instance) denseInstance0);
      Instances instances1 = iBk0.pruneToK(instances0, doubleArray0, 0);
      assertNotNull(instances1);
      assertEquals(0, iBk0.getWindowSize());
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(2, instances1.numInstances());
      assertEquals(753, iBk0.getKNN());
      assertEquals(false, iBk0.getMeanSquared());
  }

  @Test
  public void test32()  throws Throwable  {
      IBk iBk0 = new IBk(753);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 753);
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 753;
      DenseInstance denseInstance0 = new DenseInstance(0.0, doubleArray0);
      instances0.add((Instance) denseInstance0);
      instances0.add((Instance) denseInstance0);
      Instances instances1 = iBk0.pruneToK(instances0, doubleArray0, 0);
      assertEquals(753, iBk0.getKNN());
      assertNotNull(instances1);
      assertEquals(false, iBk0.getCrossValidate());
      assertEquals(0, iBk0.getWindowSize());
      assertEquals("Relation Name:  \nNum Instances:  1\nNum Attributes: 0\n\n     Name                      Type  Nom  Int Real     Missing      Unique  Dist\n", instances1.toSummaryString());
  }
}
