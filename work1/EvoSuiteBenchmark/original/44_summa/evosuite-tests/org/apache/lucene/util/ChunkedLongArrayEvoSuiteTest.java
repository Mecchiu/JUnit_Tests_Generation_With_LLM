/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.lucene.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.apache.lucene.util.ChunkedLongArray;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ChunkedLongArrayEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String string0 = ChunkedLongArray.memStats();
      assertEquals("Allocated memory: 1255MB, Allocated unused memory: 630MB, Heap memory used: 624MB, Max memory: 1422MB", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray(0);
      chunkedLongArray0.add((-15L));
      chunkedLongArray0.add((long) 0);
      chunkedLongArray0.sort();
      assertEquals(2, chunkedLongArray0.size());
      assertEquals("Allocated memory: 1257MB, Allocated unused memory: 954MB, Heap memory used: 303MB, Max memory: 1422MB", chunkedLongArray0.memStats());
  }

  @Test
  public void test2()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
      int int0 = chunkedLongArray0.capacity();
      assertEquals("Allocated memory: 1272MB, Allocated unused memory: 809MB, Heap memory used: 463MB, Max memory: 1422MB", chunkedLongArray0.memStats());
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray(0);
      int int0 = chunkedLongArray0.size();
      assertEquals("Allocated memory: 1272MB, Allocated unused memory: 792MB, Heap memory used: 479MB, Max memory: 1422MB", chunkedLongArray0.memStats());
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray(0);
      String string0 = chunkedLongArray0.toString();
      assertEquals("Allocated memory: 1272MB, Allocated unused memory: 782MB, Heap memory used: 489MB, Max memory: 1422MB", chunkedLongArray0.memStats());
      assertEquals("ChunkedLongArray(0 entries, 0 chunks, 0MB)", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
      // Undeclared exception!
      try {
        chunkedLongArray0.get(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Index 0 requested with array length 0
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
      chunkedLongArray0.set(chunkedLongArray0, 0, 0, 0);
      assertEquals("Allocated memory: 1272MB, Allocated unused memory: 723MB, Heap memory used: 549MB, Max memory: 1422MB", chunkedLongArray0.memStats());
  }

  @Test
  public void test7()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray(2028);
      // Undeclared exception!
      try {
        chunkedLongArray0.set(chunkedLongArray0, 2028, 2028, 2028);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray((-652));
      long[] longArray0 = new long[12];
      chunkedLongArray0.set(longArray0, (-652), (-652), (-652));
      assertEquals("ChunkedLongArray(0 entries, 4096 chunks, 0MB)", chunkedLongArray0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray(0);
      long[] longArray0 = new long[17];
      chunkedLongArray0.set(longArray0, 0, 7, 7);
      assertEquals("ChunkedLongArray(0 entries, 15 chunks, 0MB)", chunkedLongArray0.toString());
      assertEquals("Allocated memory: 1325MB, Allocated unused memory: 637MB, Heap memory used: 688MB, Max memory: 1422MB", chunkedLongArray0.memStats());
  }

  @Test
  public void test10()  throws Throwable  {
      ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray(0);
      chunkedLongArray0.add((long) 0);
      chunkedLongArray0.add((-15L));
      chunkedLongArray0.sort();
      assertEquals(2, chunkedLongArray0.capacity());
      assertEquals(2, chunkedLongArray0.size());
  }
}
