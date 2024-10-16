/*
 * This file was automatically generated by EvoSuite
 */

package brain.ga;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import brain.ga.GAEnumAllelesSet;
import java.util.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GAEnumAllelesSetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      // Undeclared exception!
      try {
        gAEnumAllelesSet0.size();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      // Undeclared exception!
      try {
        gAEnumAllelesSet0.allele();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      Vector<String> vector0 = new Vector<String>();
      gAEnumAllelesSet0.setAlleles(vector0);
      assertEquals(true, vector0.isEmpty());
  }

  @Test
  public void test3()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      // Undeclared exception!
      try {
        gAEnumAllelesSet0.allele((-211));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
