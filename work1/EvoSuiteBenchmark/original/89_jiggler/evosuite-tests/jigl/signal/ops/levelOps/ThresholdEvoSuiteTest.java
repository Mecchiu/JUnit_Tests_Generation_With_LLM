/*
 * This file was automatically generated by EvoSuite
 */

package jigl.signal.ops.levelOps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jigl.signal.DiscreteSignal;
import jigl.signal.RealSignal;
import jigl.signal.Signal;
import jigl.signal.SignalKernel;
import jigl.signal.SignalNotSupportedException;
import jigl.signal.ops.levelOps.Threshold;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ThresholdEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Threshold threshold0 = new Threshold((-1582.7279F));
      SignalKernel signalKernel0 = new SignalKernel((-1582.7279F), 982);
      threshold0.apply((RealSignal) signalKernel0);
  }

  @Test
  public void test1()  throws Throwable  {
      Threshold threshold0 = new Threshold(1.0F);
      short[] shortArray0 = new short[5];
      DiscreteSignal discreteSignal0 = new DiscreteSignal(shortArray0);
      threshold0.apply(discreteSignal0);
      assertEquals(255, discreteSignal0.min());
      assertEquals("5\n255 255 255 255 255 \n", discreteSignal0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      Threshold threshold0 = new Threshold((-1));
      short[] shortArray0 = new short[8];
      shortArray0[2] = (short) (-609);
      DiscreteSignal discreteSignal0 = new DiscreteSignal(shortArray0);
      DiscreteSignal discreteSignal1 = (DiscreteSignal)threshold0.apply(discreteSignal0);
      assertEquals(255, discreteSignal0.max());
      assertEquals(0, discreteSignal1.min());
  }

  @Test
  public void test3()  throws Throwable  {
      Threshold threshold0 = new Threshold(32767);
      float[] floatArray0 = new float[9];
      SignalKernel signalKernel0 = new SignalKernel(floatArray0);
      SignalKernel signalKernel1 = (SignalKernel)threshold0.apply((Signal) signalKernel0);
      assertNotNull(signalKernel1);
      assertEquals(0.0F, signalKernel1.min(), 0.01F);
  }
}
