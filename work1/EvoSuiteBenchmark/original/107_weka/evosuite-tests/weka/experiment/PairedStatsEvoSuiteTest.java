/*
 * This file was automatically generated by EvoSuite
 */

package weka.experiment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import weka.experiment.PairedStats;
import weka.experiment.Stats;

@RunWith(EvoSuiteRunner.class)
public class PairedStatsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-1204.2179938617928));
      // Undeclared exception!
      try {
        pairedStats0.setDegreesOfFreedom(0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * PairedStats: degrees of freedom must be >= 1
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats(Double.NaN);
      String string0 = pairedStats0.getRevision();
      assertEquals(Double.NaN, pairedStats0.sigLevel, 0.01D);
      assertEquals(0, pairedStats0.getDegreesOfFreedom());
      assertEquals("8034", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-1693.4112855013018));
      int int0 = pairedStats0.getDegreesOfFreedom();
      assertEquals(0, int0);
      assertEquals((-1693.4112855013018), pairedStats0.sigLevel, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-1693.4112855013018));
      String string0 = pairedStats0.toString();
      assertNotNull(string0);
      assertEquals("Analysis for 0 points:\n                         Column 1         Column 2       Difference\nMinimums                 NaN              NaN              NaN     \nMaximums                 NaN              NaN              NaN     \nSums                       0                0                0     \nSumSquares                 0                0                0     \nMeans                    NaN              NaN              NaN     \nSDs                      NaN              NaN              NaN     \nProb(differences) 0 (sigflag 0)\nCorrelation       0\n", string0);
      assertEquals((-1693.4112855013018), pairedStats0.sigLevel, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-1693.4112855013018));
      double[] doubleArray0 = new double[22];
      pairedStats0.subtract(doubleArray0, doubleArray0);
      assertEquals((-22.0), pairedStats0.count, 0.01D);
      assertEquals((-1693.4112855013018), pairedStats0.sigLevel, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-8.607716391297789));
      // Undeclared exception!
      try {
        pairedStats0.add((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-358.58434355443416));
      double[] doubleArray0 = new double[24];
      pairedStats0.add(doubleArray0, doubleArray0);
      pairedStats0.calculateDerived();
      assertEquals(24.0, pairedStats0.count, 0.01D);
      assertEquals("Analysis for 24 points:\n                         Column 1         Column 2       Difference\nMinimums                   0                0                0     \nMaximums                   0                0                0     \nSums                       0                0                0     \nSumSquares                 0                0                0     \nMeans                      0                0                0     \nSDs                        0                0                0     \nProb(differences) 1 (sigflag 0)\nCorrelation       NaN\n", pairedStats0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-634.5731397550903));
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[6];
      // Undeclared exception!
      try {
        pairedStats0.add(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Arrays must be of the same length
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-5.83261649824752));
      // Undeclared exception!
      try {
        pairedStats0.subtract((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats(Double.NaN);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[30];
      // Undeclared exception!
      try {
        pairedStats0.subtract(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Arrays must be of the same length
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-634.5731397550903));
      pairedStats0.calculateDerived();
      assertEquals(1.0, pairedStats0.differencesProbability, 0.01D);
      assertEquals("Analysis for 0 points:\n                         Column 1         Column 2       Difference\nMinimums                 NaN              NaN              NaN     \nMaximums                 NaN              NaN              NaN     \nSums                       0                0                0     \nSumSquares                 0                0                0     \nMeans                    NaN              NaN              NaN     \nSDs                      NaN              NaN              NaN     \nProb(differences) 1 (sigflag 0)\nCorrelation       NaN\n", pairedStats0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats(Double.POSITIVE_INFINITY);
      pairedStats0.add(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Stats stats0 = new Stats();
      pairedStats0.yStats = (weka.experiment.Stats) stats0;
      pairedStats0.calculateDerived();
      assertEquals(Double.POSITIVE_INFINITY, pairedStats0.xySum, 0.01D);
      assertEquals("Analysis for 1 points:\n                         Column 1         Column 2       Difference\nMinimums            Infinity              NaN              NaN     \nMaximums            Infinity              NaN              NaN     \nSums                Infinity                0              NaN     \nSumSquares          Infinity                0              NaN     \nMeans               Infinity              NaN              NaN     \nSDs                 Infinity              NaN         Infinity     \nProb(differences) 1 (sigflag -1)\nCorrelation       NaN\n", pairedStats0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats(1901.7478690153625);
      pairedStats0.add(1901.7478690153625, 0.0);
      pairedStats0.add((double) 0, 0.0);
      pairedStats0.calculateDerived();
      assertEquals(2.0, pairedStats0.count, 0.01D);
      assertEquals("Analysis for 2 points:\n                         Column 1         Column 2       Difference\nMinimums                   0                0                0     \nMaximums                1901.7479           0             1901.7479\nSums                    1901.7479           0             1901.7479\nSumSquares           3616644.9573           0          3616644.9573\nMeans                    950.8739           0              950.8739\nSDs                     1344.7388           0             1344.7388\nProb(differences) 0.5 (sigflag 1)\nCorrelation       1\n", pairedStats0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats(Double.POSITIVE_INFINITY);
      pairedStats0.add(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      pairedStats0.setDegreesOfFreedom(2026);
      pairedStats0.calculateDerived();
      assertEquals(2026, pairedStats0.getDegreesOfFreedom());
      assertEquals(Double.POSITIVE_INFINITY, pairedStats0.sigLevel, 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      PairedStats pairedStats0 = new PairedStats((-634.5731397550903));
      pairedStats0.subtract((-1.0), (-634.5731397550903));
      pairedStats0.calculateDerived();
      assertEquals((-1.0), pairedStats0.count, 0.01D);
      assertEquals((-634.5731397550903), pairedStats0.xySum, 0.01D);
  }
}
