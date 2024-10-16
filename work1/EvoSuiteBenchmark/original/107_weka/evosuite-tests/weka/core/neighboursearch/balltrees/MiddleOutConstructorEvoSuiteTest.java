/*
 * This file was automatically generated by EvoSuite
 */

package weka.core.neighboursearch.balltrees;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Enumeration;
import java.util.Vector;
import org.evosuite.testcase.CodeUnderTestException;
import org.junit.BeforeClass;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.neighboursearch.balltrees.BallNode;
import weka.core.neighboursearch.balltrees.MiddleOutConstructor;

@RunWith(EvoSuiteRunner.class)
public class MiddleOutConstructorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.ListNode middleOutConstructor_ListNode0 = middleOutConstructor0.new ListNode(0, (double) 0);
      String string0 = middleOutConstructor_ListNode0.getRevision();
      assertEquals(1, middleOutConstructor0.getSeed());
      assertEquals("8034", string0);
      assertEquals(0, middleOutConstructor_ListNode0.idx);
      assertNotNull(string0);
      assertEquals(0.0, middleOutConstructor_ListNode0.distance, 0.01D);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
  }

  @Test
  public void test1()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      int[] intArray0 = new int[7];
      middleOutConstructor0.setPoints(middleOutConstructor_TempNode0, 94, 0, intArray0);
      // Undeclared exception!
      try {
        middleOutConstructor_TempNode0.points.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      int[] intArray0 = new int[7];
      middleOutConstructor0.setPoints(middleOutConstructor_TempNode0, 94, 0, intArray0);
      String string0 = middleOutConstructor_TempNode0.points.getRevision();
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertNotNull(string0);
      assertEquals(1, middleOutConstructor0.getSeed());
      assertEquals("8034", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList0 = middleOutConstructor0.new MyIdxList(1638);
      assertNotNull(middleOutConstructor_MyIdxList0);
      
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList1 = middleOutConstructor_MyIdxList0.append(middleOutConstructor_MyIdxList0, middleOutConstructor_MyIdxList0);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
      assertNotSame(middleOutConstructor_MyIdxList1, middleOutConstructor_MyIdxList0);
      assertNotNull(middleOutConstructor_MyIdxList1);
  }

  @Test
  public void test4()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList0 = middleOutConstructor0.new MyIdxList();
      // Undeclared exception!
      try {
        middleOutConstructor_MyIdxList0.getFirst();
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList0 = middleOutConstructor0.new MyIdxList();
      double[] doubleArray0 = new double[8];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(5.932164139298549, doubleArray0);
      double double0 = middleOutConstructor0.calcRadius(middleOutConstructor_MyIdxList0, middleOutConstructor_MyIdxList0, (Instance) binarySparseInstance0, (Instances) null);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01D);
      assertEquals(1, middleOutConstructor0.getSeed());
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
  }

  @Test
  public void test6()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      String string0 = middleOutConstructor_TempNode0.getRevision();
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
      assertEquals("8034", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      String string0 = middleOutConstructor0.globalInfo();
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
      assertNotNull(string0);
      assertEquals("The class that builds a BallTree middle out.\n\nFor more information see also:\n\nAndrew W. Moore: The Anchors Hierarchy: Using the Triangle Inequality to Survive High Dimensional Data. In: UAI '00: Proceedings of the 16th Conference on Uncertainty in Artificial Intelligence, San Francisco, CA, USA, 397-405, 2000.\n\nAshraf Masood Kibriya (2007). Fast Algorithms for Nearest Neighbour Search. Hamilton, New Zealand.", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      String[] stringArray0 = middleOutConstructor0.getOptions();
      middleOutConstructor0.setOptions(stringArray0);
      assertEquals(true, middleOutConstructor0.getContainChildBalls());
  }

  @Test
  public void test9()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      middleOutConstructor0.setInstances((Instances) null);
      assertEquals(1, middleOutConstructor0.getSeed());
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
  }

  @Test
  public void test10()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      String string0 = middleOutConstructor0.getRevision();
      assertNotNull(string0);
      assertEquals("8034", string0);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
  }

  @Test
  public void test11()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      Enumeration<Object> enumeration0 = middleOutConstructor0.listOptions();
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
      assertNotNull(enumeration0);
  }

  @Test
  public void test12()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      String string0 = middleOutConstructor0.initialAnchorRandomTipText();
      assertEquals("Whether the initial anchor is chosen randomly.", string0);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
  }

  @Test
  public void test13()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      Vector<MiddleOutConstructor.TempNode> vector0 = new Vector<MiddleOutConstructor.TempNode>();
      try {
        middleOutConstructor0.createAnchorsHierarchy(vector0, 991, 991, 991);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      // Undeclared exception!
      try {
        middleOutConstructor0.calcRadius((MiddleOutConstructor.TempNode) null, (MiddleOutConstructor.TempNode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      String string0 = middleOutConstructor0.seedTipText();
      assertEquals("The seed value for the random number generator.", string0);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
  }

  @Test
  public void test16()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      BallNode ballNode0 = new BallNode(0, 0, 0);
      double[] doubleArray0 = new double[28];
      int[] intArray0 = new int[9];
      SparseInstance sparseInstance0 = new SparseInstance((double) 0, doubleArray0, intArray0, 0);
      try {
        middleOutConstructor0.addInstance(ballNode0, (Instance) sparseInstance0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * Addition of instances after the tree is built, not possible with MiddleOutConstructor.
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      try {
        middleOutConstructor0.buildTree();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      BallNode ballNode0 = new BallNode(0);
      try {
        middleOutConstructor0.buildLeavesMiddleOut(ballNode0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      BallNode ballNode0 = new BallNode((-1), 93, 0, (Instance) null, 0.0);
      try {
        middleOutConstructor0.buildLeavesMiddleOut(ballNode0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      
      Vector<MiddleOutConstructor.TempNode> vector0 = new Vector<MiddleOutConstructor.TempNode>();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "}*rInKMhv0e$KE@uAU";
      stringArray0[1] = "}*rInKMhv0e$KE@uAU";
      middleOutConstructor0.setOptions(stringArray0);
      try {
        middleOutConstructor0.createAnchorsHierarchy(vector0, (-1), (-1), (-1));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      BallNode ballNode0 = new BallNode(6, 0, 0, (Instance) null, 0.0);
      ballNode0.m_Left = (weka.core.neighboursearch.balltrees.BallNode) ballNode0;
      try {
        middleOutConstructor0.buildLeavesMiddleOut(ballNode0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * Invalid leaf assignment. Please check code
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      Vector<MiddleOutConstructor.TempNode> vector0 = new Vector<MiddleOutConstructor.TempNode>();
      try {
        middleOutConstructor0.mergeNodes(vector0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      Vector<MiddleOutConstructor.TempNode> vector0 = new Vector<MiddleOutConstructor.TempNode>();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      vector0.add(middleOutConstructor_TempNode0);
      try {
        middleOutConstructor0.mergeNodes(vector0, 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      BallNode ballNode0 = middleOutConstructor0.makeBallTreeNodes(middleOutConstructor_TempNode0, 0, 0, 0);
      assertEquals(1, middleOutConstructor0.getSeed());
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, ballNode0.m_NumInstances);
  }

  @Test
  public void test25()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try {
        middleOutConstructor0.setPoints(middleOutConstructor_TempNode0, 0, 0, intArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      Vector<MiddleOutConstructor.TempNode> vector0 = new Vector<MiddleOutConstructor.TempNode>();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      Vector<double[]> vector1 = new Vector<double[]>();
      middleOutConstructor0.setInterAnchorDistances(vector0, middleOutConstructor_TempNode0, vector1);
      assertEquals(false, vector1.isEmpty());
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
  }

  @Test
  public void test27()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      Vector<MiddleOutConstructor.TempNode> vector0 = new Vector<MiddleOutConstructor.TempNode>();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      vector0.add(middleOutConstructor_TempNode0);
      Vector<double[]> vector1 = new Vector<double[]>();
      try {
        middleOutConstructor0.setInterAnchorDistances(vector0, middleOutConstructor_TempNode0, vector1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      Vector<MiddleOutConstructor.TempNode> vector0 = new Vector<MiddleOutConstructor.TempNode>();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      Vector<double[]> vector1 = new Vector<double[]>();
      double[] doubleArray0 = new double[7];
      vector1.addElement(doubleArray0);
      boolean boolean0 = middleOutConstructor0.stealPoints(middleOutConstructor_TempNode0, (Vector) vector0, (Vector) vector1);
      assertEquals(false, boolean0);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
  }

  @Test
  public void test29()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      try {
        middleOutConstructor0.setMaxInstancesInLeaf((-11));
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * The maximum number of instances in a leaf for using MiddleOutConstructor must be >=2.
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      middleOutConstructor0.setOptions(stringArray0);
      middleOutConstructor0.getOptions();
      assertEquals(false, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
  }

  @Test
  public void test31()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList0 = middleOutConstructor0.new MyIdxList();
      int[] intArray0 = new int[9];
      middleOutConstructor0.setInstanceList(intArray0);
      middleOutConstructor_MyIdxList0.insertReverseSorted(0, 0);
      middleOutConstructor0.checkIndicesList(middleOutConstructor_MyIdxList0, 0, 0);
      assertEquals(1, middleOutConstructor_MyIdxList0.length());
  }

  @Test
  public void test32()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      String string0 = middleOutConstructor0.printList((MiddleOutConstructor.MyIdxList) null);
      assertEquals(1, middleOutConstructor0.getSeed());
      assertNotNull(string0);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
  }

  @Test
  public void test33()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      int[] intArray0 = new int[7];
      middleOutConstructor0.setPoints(middleOutConstructor_TempNode0, 94, 0, intArray0);
  }

  @Test
  public void test34()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList0 = middleOutConstructor0.new MyIdxList();
      int[] intArray0 = new int[9];
      middleOutConstructor_MyIdxList0.insertReverseSorted(597, 597);
      middleOutConstructor0.setInstanceList(intArray0);
      middleOutConstructor_MyIdxList0.insertReverseSorted(0, 0);
      assertEquals(2, middleOutConstructor_MyIdxList0.length());
      
      try {
        middleOutConstructor0.checkIndicesList(middleOutConstructor_MyIdxList0, 0, 0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
        /*
         * Error: Element 597 of the list not in the array.
         * Array: i: 0
         * List: 597, 0
         */
      }
  }

  @Test
  public void test35()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      String string0 = middleOutConstructor_TempNode0.toString();
      assertEquals(1, middleOutConstructor0.getSeed());
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals("0", string0);
      assertNotNull(string0);
  }

  @Test
  public void test36()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.TempNode middleOutConstructor_TempNode0 = middleOutConstructor0.new TempNode();
      int[] intArray0 = new int[7];
      middleOutConstructor0.setPoints(middleOutConstructor_TempNode0, 94, 0, intArray0);
      String string0 = middleOutConstructor_TempNode0.toString();
      assertEquals("0", string0);
      assertNotNull(string0);
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
      assertEquals(1, middleOutConstructor0.getSeed());
  }

  @Test
  public void test37()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList0 = middleOutConstructor0.new MyIdxList(1638);
      assertNotNull(middleOutConstructor_MyIdxList0);
      
      middleOutConstructor_MyIdxList0.insertReverseSorted(0, 0.0);
      middleOutConstructor_MyIdxList0.insertReverseSorted(1638, 1638);
      assertEquals(2, middleOutConstructor_MyIdxList0.size());
      assertEquals(2, middleOutConstructor_MyIdxList0.length());
  }

  @Test
  public void test38()  throws Throwable  {
      MiddleOutConstructor middleOutConstructor0 = new MiddleOutConstructor();
      MiddleOutConstructor.MyIdxList middleOutConstructor_MyIdxList0 = middleOutConstructor0.new MyIdxList();
      middleOutConstructor_MyIdxList0.insertReverseSorted(422, 422);
      middleOutConstructor_MyIdxList0.insertReverseSorted(422, 422);
      middleOutConstructor_MyIdxList0.checkSorting(middleOutConstructor_MyIdxList0);
      assertEquals(2, middleOutConstructor_MyIdxList0.size());
      assertEquals(true, middleOutConstructor0.isInitialAnchorRandom());
  }
}
