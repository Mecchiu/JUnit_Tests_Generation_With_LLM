/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.search.lucene;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.StringQueryImpl;
import com.liferay.portal.search.lucene.BooleanQueryImpl;
import com.liferay.portal.search.lucene.LuceneQueryImpl;
import com.liferay.portal.search.lucene.QueryTranslatorImpl;
import com.liferay.portal.search.lucene.TermQueryImpl;
import com.liferay.portal.search.lucene.TermRangeQueryImpl;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.NGramPhraseQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TermRangeQuery;
import org.apache.lucene.search.WildcardQuery;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class QueryTranslatorImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      LuceneQueryImpl luceneQueryImpl0 = new LuceneQueryImpl((Query) null);
      Object object0 = queryTranslatorImpl0.translate((com.liferay.portal.kernel.search.Query) luceneQueryImpl0);
      assertNull(object0);
  }

  @Test
  public void test1()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      BooleanQueryImpl booleanQueryImpl0 = new BooleanQueryImpl();
      BooleanQuery booleanQuery0 = (BooleanQuery)queryTranslatorImpl0.translate((com.liferay.portal.kernel.search.Query) booleanQueryImpl0);
      assertEquals("", booleanQuery0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      StringQueryImpl stringQueryImpl0 = new StringQueryImpl("jMR?7U");
      // Undeclared exception!
      try {
        queryTranslatorImpl0.translate((com.liferay.portal.kernel.search.Query) stringQueryImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      Object object0 = queryTranslatorImpl0.translate((com.liferay.portal.kernel.search.Query) null);
      assertNull(object0);
  }

  @Test
  public void test4()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      TermQueryImpl termQueryImpl0 = new TermQueryImpl("L}W-x>qNP&B:-;f?u^", "L}W-x>qNP&B:-;f?u^");
      TermQuery termQuery0 = (TermQuery)queryTranslatorImpl0.translate((com.liferay.portal.kernel.search.Query) termQueryImpl0);
      assertEquals(1.0F, termQuery0.getBoost(), 0.01F);
  }

  @Test
  public void test5()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl(" does not want to merge all ol^ segments, merge remaining ones into new segment: ", " does not want to merge all ol^ segments, merge remaining ones into new segment: ", " does not want to merge all ol^ segments, merge remaining ones into new segment: ", true, true);
      TermRangeQuery termRangeQuery0 = (TermRangeQuery)queryTranslatorImpl0.translate((com.liferay.portal.kernel.search.Query) termRangeQueryImpl0);
      assertEquals(" does not want to merge all ol^ segments, merge remaining ones into new segment: :[ does not want to merge all ol^ segments, merge remaining ones into new segment:  TO  does not want to merge all ol^ segments, merge remaining ones into new segment: ]", termRangeQuery0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      StringQueryImpl stringQueryImpl0 = new StringQueryImpl("m`H[V");
      StringQueryImpl stringQueryImpl1 = (StringQueryImpl)queryTranslatorImpl0.translateForSolr((com.liferay.portal.kernel.search.Query) stringQueryImpl0);
      assertEquals("m`H[V", stringQueryImpl1.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      Term term0 = new Term("*", "*");
      WildcardQuery wildcardQuery0 = new WildcardQuery(term0);
      LuceneQueryImpl luceneQueryImpl0 = new LuceneQueryImpl((Query) wildcardQuery0);
      queryTranslatorImpl0.translateForSolr((com.liferay.portal.kernel.search.Query) luceneQueryImpl0);
      assertEquals("*:", luceneQueryImpl0.toString());
      assertEquals("*:", wildcardQuery0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      NGramPhraseQuery nGramPhraseQuery0 = new NGramPhraseQuery(1225);
      Query[] queryArray0 = new Query[2];
      queryArray0[0] = (Query) nGramPhraseQuery0;
      BooleanQuery booleanQuery0 = (BooleanQuery)nGramPhraseQuery0.combine(queryArray0);
      queryTranslatorImpl0.adjustQuery((Query) booleanQuery0);
      assertEquals("null \"?\"", booleanQuery0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      TermQueryImpl termQueryImpl0 = new TermQueryImpl("L}W-x>qNP&B:-;f?u^", "L}W-x>qNP&B:-;f?u^");
      TermQueryImpl termQueryImpl1 = (TermQueryImpl)queryTranslatorImpl0.translateForSolr((com.liferay.portal.kernel.search.Query) termQueryImpl0);
      assertNotNull(termQueryImpl1);
      assertEquals("L}W-x>qNP&B:-;f?u^:L}W-x>qNP&B:-;f?u^", termQueryImpl0.toString());
      assertEquals("L}W-x>qNP&B:-;f?u^:L}W-x>qNP&B:-;f?u^", termQueryImpl1.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      TermQueryImpl termQueryImpl0 = new TermQueryImpl("e \u0000$", "e \u0000$");
      TermQueryImpl termQueryImpl1 = (TermQueryImpl)queryTranslatorImpl0.translateForSolr((com.liferay.portal.kernel.search.Query) termQueryImpl0);
      assertEquals("e \u0000$:\"e \u0000$\"", termQueryImpl0.toString());
      assertEquals("e \u0000$:\"e \u0000$\"", termQueryImpl1.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      QueryTranslatorImpl queryTranslatorImpl0 = new QueryTranslatorImpl();
      Term term0 = new Term("L}W-x>qNP&B:-;f?u^");
      WildcardQuery wildcardQuery0 = new WildcardQuery(term0);
      queryTranslatorImpl0.adjustQuery((Query) wildcardQuery0);
      assertEquals(1.0F, wildcardQuery0.getBoost(), 0.01F);
  }
}
