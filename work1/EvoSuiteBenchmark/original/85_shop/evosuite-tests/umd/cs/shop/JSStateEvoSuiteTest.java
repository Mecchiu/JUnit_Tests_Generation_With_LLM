/*
 * This file was automatically generated by EvoSuite
 */

package umd.cs.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import umd.cs.shop.JSListAxioms;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSListSubstitution;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;

@RunWith(EvoSuiteRunner.class)
public class JSStateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution1 = jSState0.satisfies((JSListLogicalAtoms) jSState0, jSSubstitution0, jSListAxioms0);
      assertNotNull(jSSubstitution1);
      assertEquals(0, jSSubstitution1.capacity());
  }

  @Test
  public void test1()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll((JSListLogicalAtoms) jSState0, jSSubstitution0, jSListAxioms0);
      assertNotNull(jSListSubstitution0);
      assertEquals(false, jSListSubstitution0.isEmpty());
  }
}
