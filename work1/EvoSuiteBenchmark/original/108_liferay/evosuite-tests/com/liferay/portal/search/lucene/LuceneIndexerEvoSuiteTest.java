/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.search.lucene;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.search.DummyIndexer;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.search.lucene.LuceneIndexer;
import java.util.Set;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LuceneIndexerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LuceneIndexer luceneIndexer0 = new LuceneIndexer((-1733L));
      // Undeclared exception!
      try {
        luceneIndexer0.reindex();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.kernel.search.SearchEngineUtil
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LuceneIndexer luceneIndexer0 = new LuceneIndexer((-4L));
      boolean boolean0 = luceneIndexer0.isFinished();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      LuceneIndexer luceneIndexer0 = new LuceneIndexer((-4L));
      // Undeclared exception!
      try {
        luceneIndexer0.run();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsValues
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LuceneIndexer luceneIndexer0 = new LuceneIndexer((-4L));
      luceneIndexer0.halt();
      assertEquals(false, luceneIndexer0.isFinished());
  }

  @Test
  public void test4()  throws Throwable  {
      LuceneIndexer luceneIndexer0 = new LuceneIndexer((-4L));
      Set<String> set0 = luceneIndexer0.getUsedSearchEngineIds();
      assertEquals(true, set0.isEmpty());
  }

  @Test
  public void test5()  throws Throwable  {
      LuceneIndexer luceneIndexer0 = new LuceneIndexer((-1733L));
      DummyIndexer dummyIndexer0 = new DummyIndexer();
      luceneIndexer0.reindex((Indexer) dummyIndexer0);
      assertEquals(false, dummyIndexer0.isFilterSearch());
  }
}
