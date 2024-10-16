/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.search.lucene;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.search.lucene.TermQueryImpl;
import org.apache.lucene.search.TermQuery;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TermQueryImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TermQueryImpl termQueryImpl0 = new TermQueryImpl("Clone not supported: ", 950L);
      TermQuery termQuery0 = (TermQuery)termQueryImpl0.getWrappedQuery();
      assertEquals("Clone not supported: :950", termQuery0.toString());
      assertNotNull(termQuery0);
  }

  @Test
  public void test1()  throws Throwable  {
      TermQueryImpl termQueryImpl0 = new TermQueryImpl("tf(termFreq(", (-194L));
      // Undeclared exception!
      try {
        termQueryImpl0.getQueryTerm();
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TermQueryImpl termQueryImpl0 = new TermQueryImpl("Clone not supported: ", 950L);
      String string0 = termQueryImpl0.toString();
      assertEquals("Clone not supported: :950", string0);
      assertNotNull(string0);
  }
}
