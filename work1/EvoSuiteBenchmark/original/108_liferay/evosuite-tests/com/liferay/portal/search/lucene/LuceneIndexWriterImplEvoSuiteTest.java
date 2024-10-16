/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.search.lucene;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.search.lucene.LuceneIndexWriterImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Set;
import org.apache.lucene.analysis.StopAnalyzer;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LuceneIndexWriterImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LuceneIndexWriterImpl luceneIndexWriterImpl0 = new LuceneIndexWriterImpl();
      ArrayList<Document> arrayList0 = new ArrayList<Document>();
      luceneIndexWriterImpl0.addDocuments((SearchContext) null, (Collection<Document>) arrayList0);
      assertEquals("[]", arrayList0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      LuceneIndexWriterImpl luceneIndexWriterImpl0 = new LuceneIndexWriterImpl();
      SearchContext searchContext0 = new SearchContext();
      Set<?> set0 = StopAnalyzer.ENGLISH_STOP_WORDS_SET;
      // Undeclared exception!
      try {
        luceneIndexWriterImpl0.addDocuments(searchContext0, set0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * [C cannot be cast to com.liferay.portal.kernel.search.Document
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LuceneIndexWriterImpl luceneIndexWriterImpl0 = new LuceneIndexWriterImpl();
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      luceneIndexWriterImpl0.deleteDocuments((SearchContext) null, (Collection<String>) priorityQueue0);
      assertEquals(true, priorityQueue0.isEmpty());
  }

  @Test
  public void test3()  throws Throwable  {
      LuceneIndexWriterImpl luceneIndexWriterImpl0 = new LuceneIndexWriterImpl();
      CompilerConfiguration compilerConfiguration0 = CompilerConfiguration.DEFAULT;
      Set<String> set0 = compilerConfiguration0.getScriptExtensions();
      // Undeclared exception!
      try {
        luceneIndexWriterImpl0.deleteDocuments((SearchContext) null, (Collection<String>) set0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LuceneIndexWriterImpl luceneIndexWriterImpl0 = new LuceneIndexWriterImpl();
      Set<?> set0 = StopAnalyzer.ENGLISH_STOP_WORDS_SET;
      SearchContext searchContext0 = new SearchContext();
      // Undeclared exception!
      try {
        luceneIndexWriterImpl0.updateDocuments(searchContext0, set0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * [C cannot be cast to com.liferay.portal.kernel.search.Document
         */
      }
  }
}
