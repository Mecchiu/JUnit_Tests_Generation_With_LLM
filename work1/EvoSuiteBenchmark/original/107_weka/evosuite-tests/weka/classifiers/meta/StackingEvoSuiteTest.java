/*
 * This file was automatically generated by EvoSuite
 */

package weka.classifiers.meta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Enumeration;
import org.junit.BeforeClass;
import weka.classifiers.meta.Stacking;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.TestInstances;

@RunWith(EvoSuiteRunner.class)
public class StackingEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      String[] stringArray0 = stacking0.getOptions();
      assertNotNull(stringArray0);
      
      stacking0.setOptions(stringArray0);
      assertEquals("Stacking: No model built yet.", stacking0.toString());
      assertEquals(10, stacking0.getNumFolds());
  }

  @Test
  public void test1()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      String string0 = stacking0.globalInfo();
      assertNotNull(string0);
      assertEquals(10, stacking0.getNumFolds());
      assertEquals("Combines several classifiers using the stacking method. Can do classification or regression.\n\nFor more information, see\n\nDavid H. Wolpert (1992). Stacked generalization. Neural Networks. 5:241-259.", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      String string0 = stacking0.metaClassifierTipText();
      assertEquals(10, stacking0.getNumFolds());
      assertEquals("The meta classifiers to be used.", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      String string0 = stacking0.numFoldsTipText();
      assertEquals("The number of folds used for cross-validation.", string0);
      assertEquals(10, stacking0.getNumFolds());
  }

  @Test
  public void test4()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("The meta classifiers to be used.");
      stacking0.buildClassifier(instances0);
      String string0 = stacking0.toString();
      assertEquals("Stacking\n\nBase classifiers\n\nZeroR predicts class value: class1\n\n\n\nMeta classifier\n\nZeroR predicts class value: class1", stacking0.toString());
      assertEquals("Stacking\n\nBase classifiers\n\nZeroR predicts class value: class1\n\n\n\nMeta classifier\n\nZeroR predicts class value: class1", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      Enumeration<Object> enumeration0 = stacking0.listOptions();
      assertEquals(10, stacking0.getNumFolds());
      assertEquals("\tFull name of meta classifier, followed by options.\n\t(default: \"weka.classifiers.rules.Zero\")", stacking0.metaOption());
      assertNotNull(enumeration0);
  }

  @Test
  public void test6()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      String string0 = stacking0.getRevision();
      assertNotNull(string0);
      assertEquals("8034", string0);
      assertEquals(10, stacking0.getNumFolds());
  }

  @Test
  public void test7()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      try {
        stacking0.distributionForInstance((Instance) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      stacking0.setOptions((String[]) null);
      assertEquals("Stacking: No model built yet.", stacking0.toString());
      assertEquals(10, stacking0.getNumFolds());
  }

  @Test
  public void test9()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      try {
        stacking0.setNumFolds((-303));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Stacking: Number of cross-validation folds must be positive.
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Stacking stacking0 = new Stacking();
      String string0 = stacking0.toString();
      assertEquals("Stacking: No model built yet.", string0);
      assertEquals(10, stacking0.getNumFolds());
      assertNotNull(string0);
  }
}
