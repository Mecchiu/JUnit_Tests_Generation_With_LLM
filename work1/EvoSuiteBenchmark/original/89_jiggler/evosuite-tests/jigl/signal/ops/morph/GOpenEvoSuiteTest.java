/*
 * This file was automatically generated by EvoSuite
 */

package jigl.signal.ops.morph;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jigl.signal.DiscreteSignal;
import jigl.signal.PowerSignal;
import jigl.signal.ROI;
import jigl.signal.RealSignal;
import jigl.signal.Signal;
import jigl.signal.SignalKernel;
import jigl.signal.SignalNotSupportedException;
import jigl.signal.ops.morph.GOpen;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GOpenEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      float[] floatArray0 = new float[1];
      SignalKernel signalKernel0 = new SignalKernel(floatArray0);
      GOpen gOpen0 = new GOpen(signalKernel0, 675);
      ROI rOI0 = new ROI();
      RealSignal realSignal0 = (RealSignal)gOpen0.apply((Signal) signalKernel0, rOI0);
      assertEquals(0.0F, realSignal0.max(), 0.01F);
  }

  @Test
  public void test1()  throws Throwable  {
      float[] floatArray0 = new float[1];
      SignalKernel signalKernel0 = new SignalKernel(floatArray0);
      GOpen gOpen0 = new GOpen(signalKernel0, 675);
      RealSignal realSignal0 = (RealSignal)gOpen0.apply((Signal) signalKernel0, (ROI) null);
      assertEquals(1, realSignal0.length());
  }

  @Test
  public void test2()  throws Throwable  {
      PowerSignal powerSignal0 = new PowerSignal(0);
      SignalKernel signalKernel0 = new SignalKernel((RealSignal) powerSignal0);
      GOpen gOpen0 = new GOpen(signalKernel0, 0);
      short[] shortArray0 = new short[5];
      DiscreteSignal discreteSignal0 = new DiscreteSignal(shortArray0);
      DiscreteSignal discreteSignal1 = (DiscreteSignal)gOpen0.apply(discreteSignal0);
      assertNotNull(discreteSignal1);
      assertNotSame(discreteSignal0, discreteSignal1);
  }

  @Test
  public void test3()  throws Throwable  {
      GOpen gOpen0 = new GOpen((SignalKernel) null, 1660);
      short[] shortArray0 = new short[4];
      DiscreteSignal discreteSignal0 = new DiscreteSignal(shortArray0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        gOpen0.apply(discreteSignal0, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
