/*
 * This file was automatically generated by EvoSuite
 */

package lotus.core.phases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import lotus.core.phases.CombatDamagePhase;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CombatDamagePhaseEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CombatDamagePhase combatDamagePhase0 = new CombatDamagePhase();
      combatDamagePhase0.doPhase();
  }
}
