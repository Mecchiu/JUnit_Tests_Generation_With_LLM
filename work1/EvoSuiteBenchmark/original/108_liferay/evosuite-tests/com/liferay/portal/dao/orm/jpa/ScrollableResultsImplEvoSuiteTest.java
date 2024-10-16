/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.dao.orm.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.dao.orm.jpa.ScrollableResultsImpl;
import com.liferay.portal.kernel.dao.orm.ORMException;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ScrollableResultsImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertNotNull(scrollableResultsImpl0);
      assertEquals(false, scrollableResultsImpl0.next());
      
      boolean boolean0 = scrollableResultsImpl0.first();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "[]");
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertEquals(true, scrollableResultsImpl0.next());
      assertNotNull(scrollableResultsImpl0);
      
      boolean boolean0 = scrollableResultsImpl0.first();
      assertEquals(false, scrollableResultsImpl0.next());
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "[]");
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertEquals(true, scrollableResultsImpl0.next());
      assertNotNull(scrollableResultsImpl0);
      
      scrollableResultsImpl0.last();
      scrollableResultsImpl0.get();
      assertEquals(false, scrollableResultsImpl0.next());
      assertEquals(true, scrollableResultsImpl0.last());
  }

  @Test
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "[]");
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertNotNull(scrollableResultsImpl0);
      assertEquals(true, scrollableResultsImpl0.next());
      
      scrollableResultsImpl0.last();
      scrollableResultsImpl0.get(0);
      assertEquals(false, scrollableResultsImpl0.next());
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertNotNull(scrollableResultsImpl0);
      assertEquals(false, scrollableResultsImpl0.next());
      
      boolean boolean0 = scrollableResultsImpl0.last();
      assertEquals(true, scrollableResultsImpl0.next());
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "[]");
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertEquals(true, scrollableResultsImpl0.next());
      assertNotNull(scrollableResultsImpl0);
      
      scrollableResultsImpl0.next();
      boolean boolean0 = scrollableResultsImpl0.previous();
      assertEquals(false, scrollableResultsImpl0.next());
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertNotNull(scrollableResultsImpl0);
      
      boolean boolean0 = scrollableResultsImpl0.next();
      assertEquals(false, scrollableResultsImpl0.next());
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertNotNull(scrollableResultsImpl0);
      
      boolean boolean0 = scrollableResultsImpl0.previous();
      assertEquals(true, boolean0);
      assertEquals(true, scrollableResultsImpl0.next());
  }

  @Test
  public void test8()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertNotNull(scrollableResultsImpl0);
      assertEquals(false, scrollableResultsImpl0.next());
      
      boolean boolean0 = scrollableResultsImpl0.scroll((-2));
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertNotNull(scrollableResultsImpl0);
      assertEquals(false, scrollableResultsImpl0.next());
      
      boolean boolean0 = scrollableResultsImpl0.scroll(684);
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "[]");
      ScrollableResultsImpl scrollableResultsImpl0 = new ScrollableResultsImpl((List<?>) linkedList0);
      assertEquals(true, scrollableResultsImpl0.next());
      assertNotNull(scrollableResultsImpl0);
      
      scrollableResultsImpl0.last();
      boolean boolean0 = scrollableResultsImpl0.scroll(0);
      assertEquals(false, scrollableResultsImpl0.next());
      assertEquals(true, boolean0);
  }
}
