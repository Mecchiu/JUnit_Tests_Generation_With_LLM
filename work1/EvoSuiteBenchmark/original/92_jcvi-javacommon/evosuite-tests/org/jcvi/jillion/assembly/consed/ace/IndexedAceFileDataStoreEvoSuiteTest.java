/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly.consed.ace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.jcvi.jillion.assembly.consed.ace.AceConsensusTagVisitor;
import org.jcvi.jillion.assembly.consed.ace.AceContig;
import org.jcvi.jillion.assembly.consed.ace.AceFileVisitorCallback;
import org.jcvi.jillion.assembly.consed.ace.IndexedAceFileDataStore;
import org.jcvi.jillion.core.datastore.DataStoreFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IndexedAceFileDataStoreEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      indexedAceFileDataStore_SingleAceFileVisitor0.halted();
  }

  @Test
  public void test1()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      indexedAceFileDataStore_SingleAceFileVisitor0.visitHeader(35, 35);
  }

  @Test
  public void test2()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      // Undeclared exception!
      try {
        indexedAceFileDataStore_SingleAceFileVisitor0.visitContig((AceFileVisitorCallback) null, "yk", 0, 0, 0, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * initial capacity must be >=1
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      Date date0 = new Date();
      indexedAceFileDataStore_SingleAceFileVisitor0.visitReadTag("xJQNg", "xJQNg", "xJQNg", (long) 35, (long) 35, date0, false);
      assertEquals("02-Jul-2013 03:45:46", date0.toLocaleString());
  }

  @Test
  public void test4()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      AceContig aceContig0 = indexedAceFileDataStore_SingleAceFileVisitor0.getContig();
      assertNull(aceContig0);
  }

  @Test
  public void test5()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      indexedAceFileDataStore_SingleAceFileVisitor0.visitEnd();
  }

  @Test
  public void test6()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      Date date0 = new Date();
      AceConsensusTagVisitor aceConsensusTagVisitor0 = indexedAceFileDataStore_SingleAceFileVisitor0.visitConsensusTag("xJQNg", "xJQNg", "xJQNg", (-9223372036854775808L), (-9223372036854775808L), date0, false);
      assertNull(aceConsensusTagVisitor0);
  }

  @Test
  public void test7()  throws Throwable  {
      IndexedAceFileDataStore.SingleAceFileVisitor indexedAceFileDataStore_SingleAceFileVisitor0 = new IndexedAceFileDataStore.SingleAceFileVisitor();
      Date date0 = new Date();
      indexedAceFileDataStore_SingleAceFileVisitor0.visitWholeAssemblyTag("xJQNg", "xJQNg", date0, "xJQNg");
      assertEquals(1372733147001L, date0.getTime());
  }

  @Test
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try {
        IndexedAceFileDataStore.create((File) null, (DataStoreFilter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * filter can not be null
         */
      }
  }
}
