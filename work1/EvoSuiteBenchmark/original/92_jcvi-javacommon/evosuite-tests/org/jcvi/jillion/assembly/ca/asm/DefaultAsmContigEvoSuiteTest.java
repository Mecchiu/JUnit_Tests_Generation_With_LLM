/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly.ca.asm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.assembly.ca.asm.DefaultAsmContig;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultAsmContigEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        DefaultAsmContig.createBuilder("probabAitymYsE b > , > ", (NucleotideSequence) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * sequence can not be null
         */
      }
  }
}
