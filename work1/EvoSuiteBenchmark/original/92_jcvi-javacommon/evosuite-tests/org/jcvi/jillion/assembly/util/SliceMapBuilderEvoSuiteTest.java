/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.assembly.AssembledRead;
import org.jcvi.jillion.assembly.Contig;
import org.jcvi.jillion.assembly.util.SliceMapBuilder;
import org.jcvi.jillion.core.qual.PhredQuality;
import org.jcvi.jillion.core.qual.QualitySequenceDataStore;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SliceMapBuilderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SliceMapBuilder<AssembledRead> sliceMapBuilder0 = null;
      try {
        sliceMapBuilder0 = new SliceMapBuilder<AssembledRead>((Contig<AssembledRead>) null, (PhredQuality) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * contig can not be null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SliceMapBuilder<AssembledRead> sliceMapBuilder0 = null;
      try {
        sliceMapBuilder0 = new SliceMapBuilder<AssembledRead>((Contig<AssembledRead>) null, (QualitySequenceDataStore) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * contig can not be null
         */
      }
  }
}
