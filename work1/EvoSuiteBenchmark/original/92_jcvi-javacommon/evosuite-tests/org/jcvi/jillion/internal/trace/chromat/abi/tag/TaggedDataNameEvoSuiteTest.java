/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.internal.trace.chromat.abi.tag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.TaggedDataName;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TaggedDataNameEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.GEL_FILE_PATH;
      String string0 = taggedDataName0.toString();
      assertEquals("GELP", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.GEL_FILE_PATH;
      boolean boolean0 = taggedDataName0.usesNullTerminatedStringValues();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        TaggedDataName.parseTaggedDataName("0Qph]-^@C>");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown tag data name 0Qph]-^@C>
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.parseTaggedDataName("GELP");
      assertEquals("GELP", taggedDataName0.toString());
  }
}
