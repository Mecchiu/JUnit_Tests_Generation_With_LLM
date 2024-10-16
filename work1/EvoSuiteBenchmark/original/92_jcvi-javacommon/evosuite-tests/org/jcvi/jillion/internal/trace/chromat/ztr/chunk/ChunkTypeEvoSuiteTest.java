/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.internal.trace.chromat.ztr.chunk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.internal.trace.chromat.ztr.chunk.ChunkException;
import org.jcvi.jillion.internal.trace.chromat.ztr.chunk.ChunkType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ChunkTypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ChunkType chunkType0 = ChunkType.CLIP;
      String string0 = chunkType0.getTypeName();
      assertEquals("CLIP", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      try {
        ChunkType.getChunkFor("S>$ALL0");
        fail("Expecting exception: ChunkException");
      } catch(ChunkException e) {
        /*
         * header 'S>$ALL0' is unknown
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ChunkType chunkType0 = ChunkType.getChunkFor("CLIP");
      assertEquals(5, chunkType0.ordinal());
  }
}
