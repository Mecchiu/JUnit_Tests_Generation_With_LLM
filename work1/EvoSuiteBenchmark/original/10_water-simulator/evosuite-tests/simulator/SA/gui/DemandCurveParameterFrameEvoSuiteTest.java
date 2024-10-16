/*
 * This file was automatically generated by EvoSuite
 */

package simulator.SA.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import simulator.SA.SimulationAgent;
import simulator.SA.gui.DemandCurveParameterFrame;
import simulator.util.ConsumerType;
import simulator.util.Function;
import simulator.util.MetDataFunction;
import simulator.util.ParameterAttributes;
import simulator.util.Random;

@RunWith(EvoSuiteRunner.class)
public class DemandCurveParameterFrameEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimulationAgent simulationAgent0 = new SimulationAgent();
      Function[] functionArray0 = new Function[3];
      Random random0 = new Random((-9.702728F), (-9.702728F));
      functionArray0[0] = (Function) random0;
      functionArray0[1] = (Function) random0;
      MetDataFunction metDataFunction0 = new MetDataFunction();
      functionArray0[2] = (Function) metDataFunction0;
      ConsumerType consumerType0 = new ConsumerType();
      ParameterAttributes parameterAttributes0 = new ParameterAttributes();
      DemandCurveParameterFrame demandCurveParameterFrame0 = null;
      try {
        demandCurveParameterFrame0 = new DemandCurveParameterFrame(simulationAgent0, functionArray0, consumerType0, parameterAttributes0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
