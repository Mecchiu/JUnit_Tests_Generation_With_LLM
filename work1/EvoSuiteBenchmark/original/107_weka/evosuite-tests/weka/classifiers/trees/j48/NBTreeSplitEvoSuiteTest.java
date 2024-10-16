/*
 * This file was automatically generated by EvoSuite
 */

package weka.classifiers.trees.j48;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import weka.classifiers.trees.j48.NBTreeNoSplit;
import weka.classifiers.trees.j48.NBTreeSplit;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

@RunWith(EvoSuiteRunner.class)
public class NBTreeSplitEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(0, 0, 0);
      // Undeclared exception!
      try {
        nBTreeSplit0.weights((Instance) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit((-862), (-862), (-862));
      // Undeclared exception!
      try {
        nBTreeSplit0.rightSide((-862), (Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(808, 808, 808);
      double double0 = nBTreeSplit0.getErrors();
      assertEquals(0.0, double0, 0.01D);
      assertEquals(808, nBTreeSplit0.attIndex());
  }

  @Test
  public void test3()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(1668, 1668, 1668);
      DenseInstance denseInstance0 = new DenseInstance(1668);
      try {
        nBTreeSplit0.classifyInstance((Instance) denseInstance0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit((-244), (-244), (-244));
      String string0 = nBTreeSplit0.getRevision();
      assertEquals(-244, nBTreeSplit0.attIndex());
      assertNotNull(string0);
      assertEquals("8034", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(463, 463, 463);
      // Undeclared exception!
      try {
        nBTreeSplit0.sourceExpression(463, (Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit((-244), (-244), (-244));
      nBTreeSplit0.getGlobalModel();
      assertEquals(-244, nBTreeSplit0.attIndex());
  }

  @Test
  public void test7()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(808, 808, 808);
      // Undeclared exception!
      try {
        nBTreeSplit0.leftSide((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(689, 689, 689);
      int int0 = nBTreeSplit0.attIndex();
      assertEquals(689, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(678, 678, 678);
      try {
        nBTreeSplit0.buildClassifier((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(689, 689, 689);
      NBTreeNoSplit nBTreeNoSplit0 = new NBTreeNoSplit();
      nBTreeSplit0.setGlobalModel(nBTreeNoSplit0);
      try {
        nBTreeSplit0.buildClassifier((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit((-5), (-5), (-5));
      SparseInstance sparseInstance0 = new SparseInstance(0);
      try {
        nBTreeSplit0.classProb(0, (Instance) sparseInstance0, (-5));
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * This shouldn't happen!!!
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      NBTreeSplit nBTreeSplit0 = new NBTreeSplit(1964, 1964, 1964);
      try {
        nBTreeSplit0.classProb(1964, (Instance) null, 1964);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
