/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.journal.atom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.atom.AtomRequestContextImpl;
import com.liferay.portal.kernel.atom.AtomException;
import com.liferay.portal.kernel.atom.AtomRequestContext;
import com.liferay.portlet.journal.atom.JournalArticleAtomCollectionProvider;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleWrapper;
import java.util.Date;
import org.apache.abdera.protocol.server.RequestContext;
import org.apache.abdera.protocol.server.context.RequestContextWrapper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JournalArticleAtomCollectionProviderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      try {
        journalArticleAtomCollectionProvider0.doDeleteEntry("wfnCU`[^t9?", (AtomRequestContext) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      RequestContextWrapper requestContextWrapper0 = new RequestContextWrapper((RequestContext) null);
      AtomRequestContextImpl atomRequestContextImpl0 = new AtomRequestContextImpl((RequestContext) requestContextWrapper0);
      String string0 = journalArticleAtomCollectionProvider0.getFeedTitle((AtomRequestContext) atomRequestContextImpl0);
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      JournalArticleWrapper journalArticleWrapper0 = new JournalArticleWrapper((JournalArticle) null);
      // Undeclared exception!
      try {
        journalArticleAtomCollectionProvider0.getEntryTitle((JournalArticle) journalArticleWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      JournalArticleWrapper journalArticleWrapper0 = new JournalArticleWrapper((JournalArticle) null);
      // Undeclared exception!
      try {
        journalArticleAtomCollectionProvider0.getEntryAuthors((JournalArticle) journalArticleWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      String string0 = journalArticleAtomCollectionProvider0.getCollectionName();
      assertEquals("web-content", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      // Undeclared exception!
      try {
        journalArticleAtomCollectionProvider0.getEntryId((JournalArticle) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      RequestContextWrapper requestContextWrapper0 = new RequestContextWrapper((RequestContext) null);
      AtomRequestContextImpl atomRequestContextImpl0 = new AtomRequestContextImpl((RequestContext) requestContextWrapper0);
      // Undeclared exception!
      try {
        journalArticleAtomCollectionProvider0.getEntryContent((JournalArticle) null, (AtomRequestContext) atomRequestContextImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      // Undeclared exception!
      try {
        journalArticleAtomCollectionProvider0.getEntryUpdated((JournalArticle) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      AtomRequestContextImpl atomRequestContextImpl0 = new AtomRequestContextImpl((RequestContext) null);
      try {
        journalArticleAtomCollectionProvider0.postEntry("jRVFma]=K7Ii1oA@m", "jRVFma]=K7Ii1oA@m", "jRVFma]=K7Ii1oA@m", (Date) null, (AtomRequestContext) atomRequestContextImpl0);
        fail("Expecting exception: AtomException");
      } catch(AtomException e) {
        /*
         * 500
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      String string0 = journalArticleAtomCollectionProvider0.getEntrySummary((JournalArticle) null);
      assertNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      AtomRequestContextImpl atomRequestContextImpl0 = new AtomRequestContextImpl((RequestContext) null);
      try {
        journalArticleAtomCollectionProvider0.putEntry((JournalArticle) null, "", "", "", (Date) null, (AtomRequestContext) atomRequestContextImpl0);
        fail("Expecting exception: AtomException");
      } catch(AtomException e) {
        /*
         * 500
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      JournalArticleAtomCollectionProvider journalArticleAtomCollectionProvider0 = new JournalArticleAtomCollectionProvider();
      try {
        journalArticleAtomCollectionProvider0.doGetEntry((String) null, (AtomRequestContext) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
