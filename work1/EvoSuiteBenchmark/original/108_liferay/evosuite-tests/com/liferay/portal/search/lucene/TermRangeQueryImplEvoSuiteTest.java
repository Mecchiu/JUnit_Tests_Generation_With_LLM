/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.search.lucene;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.search.lucene.TermRangeQueryImpl;
import org.apache.lucene.search.TermRangeQuery;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TermRangeQueryImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl("", "", "", true, false);
      TermRangeQuery termRangeQuery0 = (TermRangeQuery)termRangeQueryImpl0.getWrappedQuery();
      assertEquals(true, termRangeQuery0.includesLower());
      assertEquals(false, termRangeQuery0.includesUpper());
      assertNotNull(termRangeQuery0);
  }

  @Test
  public void test1()  throws Throwable  {
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl("*9E=f-", "*9E=f-", "*9E=f-", true, true);
      String string0 = termRangeQueryImpl0.getField();
      assertEquals(true, termRangeQueryImpl0.includesUpper());
      assertEquals(true, termRangeQueryImpl0.includesLower());
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl("~u3'WH~;T6A8:", ":", ":", true, false);
      String string0 = termRangeQueryImpl0.toString();
      assertEquals("~u3'WH~;T6A8::[: TO :}", string0);
      assertEquals(true, termRangeQueryImpl0.includesLower());
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl("", "", "", true, true);
      boolean boolean0 = termRangeQueryImpl0.includesUpper();
      assertEquals(true, termRangeQueryImpl0.includesLower());
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl("*9E=f-", "*9E=f-", "*9E=f-", true, true);
      boolean boolean0 = termRangeQueryImpl0.includesLower();
      assertEquals(true, boolean0);
      assertEquals(true, termRangeQueryImpl0.includesUpper());
  }

  @Test
  public void test5()  throws Throwable  {
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl("", "", "", true, true);
      String string0 = termRangeQueryImpl0.getUpperTerm();
      assertEquals(true, termRangeQueryImpl0.includesUpper());
      assertNotNull(string0);
      assertEquals(true, termRangeQueryImpl0.includesLower());
  }

  @Test
  public void test6()  throws Throwable  {
      TermRangeQueryImpl termRangeQueryImpl0 = new TermRangeQueryImpl("", "", "", true, false);
      String string0 = termRangeQueryImpl0.getLowerTerm();
      assertEquals(false, termRangeQueryImpl0.includesUpper());
      assertEquals(true, termRangeQueryImpl0.includesLower());
      assertNotNull(string0);
      assertEquals("[ TO }", termRangeQueryImpl0.toString());
  }
}
