/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.bookmarks.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.bookmarks.model.BookmarksEntry;
import com.liferay.portlet.bookmarks.model.BookmarksEntrySoap;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BookmarksEntrySoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      long long0 = bookmarksEntrySoap0.getFolderId();
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      long long0 = bookmarksEntrySoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test2()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      Date date0 = bookmarksEntrySoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test3()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      String string0 = bookmarksEntrySoap0.getName();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setUserName(",0O)7");
      assertEquals(",0O)7", bookmarksEntrySoap0.getUserName());
  }

  @Test
  public void test5()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setCompanyId(0L);
      assertEquals(0L, bookmarksEntrySoap0.getFolderId());
  }

  @Test
  public void test6()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      String string0 = bookmarksEntrySoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      int int0 = bookmarksEntrySoap0.getVisits();
      assertEquals(0, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      Date date0 = bookmarksEntrySoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test9()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      long long0 = bookmarksEntrySoap0.getResourceBlockId();
      assertEquals(0L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setResourceBlockId((long) (-11));
      assertEquals((-11L), bookmarksEntrySoap0.getResourceBlockId());
  }

  @Test
  public void test11()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      long long0 = bookmarksEntrySoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      BookmarksEntry[][] bookmarksEntryArray0 = new BookmarksEntry[1][5];
      // Undeclared exception!
      try {
        BookmarksEntrySoap.toSoapModels(bookmarksEntryArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setName((String) null);
      assertEquals(0, bookmarksEntrySoap0.getVisits());
  }

  @Test
  public void test14()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setCreateDate((Date) null);
      assertNull(bookmarksEntrySoap0.getDescription());
  }

  @Test
  public void test15()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setDescription((String) null);
      assertEquals(0L, bookmarksEntrySoap0.getGroupId());
  }

  @Test
  public void test16()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setUserId(0L);
      assertEquals(0L, bookmarksEntrySoap0.getEntryId());
  }

  @Test
  public void test17()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      long long0 = bookmarksEntrySoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test18()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      String string0 = bookmarksEntrySoap0.getUuid();
      assertNull(string0);
  }

  @Test
  public void test19()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setVisits((-11));
      assertEquals(-11, bookmarksEntrySoap0.getVisits());
  }

  @Test
  public void test20()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      long long0 = bookmarksEntrySoap0.getEntryId();
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      int int0 = bookmarksEntrySoap0.getPriority();
      assertEquals(0, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      long long0 = bookmarksEntrySoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test23()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setFolderId((-14L));
      assertEquals((-14L), bookmarksEntrySoap0.getFolderId());
  }

  @Test
  public void test24()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setModifiedDate((Date) null);
      assertEquals(0L, bookmarksEntrySoap0.getResourceBlockId());
  }

  @Test
  public void test25()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setPriority((-11));
      assertEquals(-11, bookmarksEntrySoap0.getPriority());
  }

  @Test
  public void test26()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setPrimaryKey((long) (-11));
      assertEquals((-11L), bookmarksEntrySoap0.getEntryId());
      assertEquals((-11L), bookmarksEntrySoap0.getPrimaryKey());
  }

  @Test
  public void test27()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setGroupId(0L);
      assertNull(bookmarksEntrySoap0.getDescription());
  }

  @Test
  public void test28()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setUrl("A");
      assertNull(bookmarksEntrySoap0.getUuid());
  }

  @Test
  public void test29()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      bookmarksEntrySoap0.setUuid((String) null);
      assertEquals(0, bookmarksEntrySoap0.getPriority());
  }

  @Test
  public void test30()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      String string0 = bookmarksEntrySoap0.getDescription();
      assertNull(string0);
  }

  @Test
  public void test31()  throws Throwable  {
      BookmarksEntrySoap bookmarksEntrySoap0 = new BookmarksEntrySoap();
      String string0 = bookmarksEntrySoap0.getUrl();
      assertNull(string0);
  }

  @Test
  public void test32()  throws Throwable  {
      LinkedList<BookmarksEntry> linkedList0 = new LinkedList<BookmarksEntry>();
      BookmarksEntrySoap[] bookmarksEntrySoapArray0 = BookmarksEntrySoap.toSoapModels((List<BookmarksEntry>) linkedList0);
      assertNotNull(bookmarksEntrySoapArray0);
  }

  @Test
  public void test33()  throws Throwable  {
      LinkedList<BookmarksEntry> linkedList0 = new LinkedList<BookmarksEntry>();
      linkedList0.addLast((BookmarksEntry) null);
      // Undeclared exception!
      try {
        BookmarksEntrySoap.toSoapModels((List<BookmarksEntry>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
