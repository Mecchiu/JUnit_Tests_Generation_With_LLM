/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly.consed.nav;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.assembly.consed.nav.ConsensusNavigationElement;
import org.jcvi.jillion.core.Range;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractNavigationElementEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConsensusNavigationElement consensusNavigationElement0 = null;
      try {
        consensusNavigationElement0 = new ConsensusNavigationElement("a$3JH", (Range) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * ungappedPositionRange can not be null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ConsensusNavigationElement consensusNavigationElement0 = null;
      try {
        consensusNavigationElement0 = new ConsensusNavigationElement((String) null, (Range) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * element id can not be null
         */
      }
  }
}
