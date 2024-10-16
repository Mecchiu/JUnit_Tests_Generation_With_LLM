/*
 * This file was automatically generated by EvoSuite
 */

package jigl.signal.ops.levelOps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jigl.signal.DiscreteSignal;
import jigl.signal.ROI;
import jigl.signal.RealSignal;
import jigl.signal.Signal;
import jigl.signal.SignalNotSupportedException;
import jigl.signal.ops.levelOps.ClipNeg;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ClipNegEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClipNeg clipNeg0 = new ClipNeg();
      DiscreteSignal discreteSignal0 = new DiscreteSignal(380);
      DiscreteSignal discreteSignal1 = (DiscreteSignal)clipNeg0.apply((Signal) discreteSignal0);
      assertNotNull(discreteSignal1);
      assertEquals(0, discreteSignal1.max());
  }

  @Test
  public void test1()  throws Throwable  {
      ClipNeg clipNeg0 = new ClipNeg();
      short[] shortArray0 = new short[7];
      DiscreteSignal discreteSignal0 = new DiscreteSignal(shortArray0);
      discreteSignal0.add((int) (short) (-470));
      ROI rOI0 = new ROI();
      clipNeg0.apply(discreteSignal0, rOI0);
      assertEquals(-470, discreteSignal0.min());
      assertEquals("7\n0 -470 -470 -470 -470 -470 -470 \n", discreteSignal0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      ClipNeg clipNeg0 = new ClipNeg();
      float[] floatArray0 = new float[9];
      floatArray0[0] = (-1060.0751F);
      RealSignal realSignal0 = new RealSignal(floatArray0);
      clipNeg0.apply(realSignal0);
      assertEquals("9\n0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 \n", realSignal0.toString());
      assertEquals(0.0F, realSignal0.min(), 0.01F);
  }
}
