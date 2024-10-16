/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.ratings.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.ratings.model.RatingsEntry;
import com.liferay.portlet.ratings.model.RatingsEntrySoap;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RatingsEntrySoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      String string0 = ratingsEntrySoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<RatingsEntry> linkedList0 = new LinkedList<RatingsEntry>();
      linkedList0.add((RatingsEntry) null);
      // Undeclared exception!
      try {
        RatingsEntrySoap.toSoapModels((List<RatingsEntry>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setCompanyId(0L);
      assertEquals(0.0, ratingsEntrySoap0.getScore(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setCreateDate((Date) null);
      assertEquals(0L, ratingsEntrySoap0.getPrimaryKey());
  }

  @Test
  public void test4()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      long long0 = ratingsEntrySoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      long long0 = ratingsEntrySoap0.getClassNameId();
      assertEquals(0L, long0);
  }

  @Test
  public void test6()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      long long0 = ratingsEntrySoap0.getEntryId();
      assertEquals(0L, long0);
  }

  @Test
  public void test7()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setModifiedDate((Date) null);
      assertEquals(0L, ratingsEntrySoap0.getCompanyId());
  }

  @Test
  public void test8()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setScore((double) 3L);
      assertEquals(3.0, ratingsEntrySoap0.getScore(), 0.01D);
  }

  @Test
  public void test9()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setUserName((String) null);
      assertEquals(0.0, ratingsEntrySoap0.getScore(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setClassPK(0L);
      assertEquals(0L, ratingsEntrySoap0.getUserId());
  }

  @Test
  public void test11()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      long long0 = ratingsEntrySoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      double double0 = ratingsEntrySoap0.getScore();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setPrimaryKey(0L);
      assertEquals(0L, ratingsEntrySoap0.getEntryId());
  }

  @Test
  public void test14()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      long long0 = ratingsEntrySoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      Date date0 = ratingsEntrySoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test16()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setUserId(3L);
      assertEquals(3L, ratingsEntrySoap0.getUserId());
  }

  @Test
  public void test17()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      ratingsEntrySoap0.setClassNameId(3L);
      assertEquals(3L, ratingsEntrySoap0.getClassNameId());
  }

  @Test
  public void test18()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      long long0 = ratingsEntrySoap0.getClassPK();
      assertEquals(0L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      RatingsEntrySoap ratingsEntrySoap0 = new RatingsEntrySoap();
      Date date0 = ratingsEntrySoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test20()  throws Throwable  {
      RatingsEntry[][] ratingsEntryArray0 = new RatingsEntry[1][1];
      // Undeclared exception!
      try {
        RatingsEntrySoap.toSoapModels(ratingsEntryArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      LinkedList<RatingsEntry> linkedList0 = new LinkedList<RatingsEntry>();
      RatingsEntrySoap[] ratingsEntrySoapArray0 = RatingsEntrySoap.toSoapModels((List<RatingsEntry>) linkedList0);
      assertNotNull(ratingsEntrySoapArray0);
  }
}
