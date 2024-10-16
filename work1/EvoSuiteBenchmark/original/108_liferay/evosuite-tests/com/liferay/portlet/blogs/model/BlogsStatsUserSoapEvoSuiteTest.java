/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.blogs.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.blogs.model.BlogsStatsUser;
import com.liferay.portlet.blogs.model.BlogsStatsUserSoap;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BlogsStatsUserSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      long long0 = blogsStatsUserSoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setPrimaryKey(0L);
      assertEquals(0.0, blogsStatsUserSoap0.getRatingsAverageScore(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setGroupId((long) 1709);
      assertEquals(1709L, blogsStatsUserSoap0.getGroupId());
  }

  @Test
  public void test3()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setRatingsTotalEntries(1709);
      assertEquals(1709, blogsStatsUserSoap0.getRatingsTotalEntries());
  }

  @Test
  public void test4()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setUserId((long) 0);
      assertEquals(0, blogsStatsUserSoap0.getEntryCount());
  }

  @Test
  public void test5()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setEntryCount(0);
      assertEquals(0, blogsStatsUserSoap0.getEntryCount());
  }

  @Test
  public void test6()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setRatingsTotalScore(599.3961499210144);
      assertEquals(599.3961499210144, blogsStatsUserSoap0.getRatingsTotalScore(), 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      long long0 = blogsStatsUserSoap0.getStatsUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      int int0 = blogsStatsUserSoap0.getEntryCount();
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      double double0 = blogsStatsUserSoap0.getRatingsAverageScore();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      double double0 = blogsStatsUserSoap0.getRatingsTotalScore();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setLastPostDate((Date) null);
      assertEquals(0.0, blogsStatsUserSoap0.getRatingsAverageScore(), 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setRatingsAverageScore(599.3961499210144);
      assertEquals(599.3961499210144, blogsStatsUserSoap0.getRatingsAverageScore(), 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      BlogsStatsUser[][] blogsStatsUserArray0 = new BlogsStatsUser[1][5];
      // Undeclared exception!
      try {
        BlogsStatsUserSoap.toSoapModels(blogsStatsUserArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      long long0 = blogsStatsUserSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      long long0 = blogsStatsUserSoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test16()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      int int0 = blogsStatsUserSoap0.getRatingsTotalEntries();
      assertEquals(0, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      Date date0 = blogsStatsUserSoap0.getLastPostDate();
      assertNull(date0);
  }

  @Test
  public void test18()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      blogsStatsUserSoap0.setCompanyId(0L);
      assertEquals(0, blogsStatsUserSoap0.getEntryCount());
  }

  @Test
  public void test19()  throws Throwable  {
      BlogsStatsUserSoap blogsStatsUserSoap0 = new BlogsStatsUserSoap();
      long long0 = blogsStatsUserSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test20()  throws Throwable  {
      LinkedList<BlogsStatsUser> linkedList0 = new LinkedList<BlogsStatsUser>();
      BlogsStatsUserSoap[] blogsStatsUserSoapArray0 = BlogsStatsUserSoap.toSoapModels((List<BlogsStatsUser>) linkedList0);
      assertNotNull(blogsStatsUserSoapArray0);
  }

  @Test
  public void test21()  throws Throwable  {
      LinkedList<BlogsStatsUser> linkedList0 = new LinkedList<BlogsStatsUser>();
      linkedList0.add((BlogsStatsUser) null);
      // Undeclared exception!
      try {
        BlogsStatsUserSoap.toSoapModels((List<BlogsStatsUser>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
