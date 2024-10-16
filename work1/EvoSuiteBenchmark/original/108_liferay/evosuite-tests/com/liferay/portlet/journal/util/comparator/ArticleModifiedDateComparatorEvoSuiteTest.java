/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.journal.util.comparator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.journal.util.comparator.ArticleModifiedDateComparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArticleModifiedDateComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ArticleModifiedDateComparator articleModifiedDateComparator0 = new ArticleModifiedDateComparator();
      String[] stringArray0 = articleModifiedDateComparator0.getOrderByFields();
      assertNotNull(stringArray0);
      assertEquals("modifiedDate DESC", articleModifiedDateComparator0.toString());
      assertEquals("modifiedDate DESC", articleModifiedDateComparator0.getOrderBy());
  }

  @Test
  public void test1()  throws Throwable  {
      ArticleModifiedDateComparator articleModifiedDateComparator0 = new ArticleModifiedDateComparator();
      boolean boolean0 = articleModifiedDateComparator0.isAscending();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      ArticleModifiedDateComparator articleModifiedDateComparator0 = new ArticleModifiedDateComparator();
      String string0 = articleModifiedDateComparator0.toString();
      assertEquals("modifiedDate DESC", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ArticleModifiedDateComparator articleModifiedDateComparator0 = new ArticleModifiedDateComparator(true);
      String string0 = articleModifiedDateComparator0.toString();
      assertEquals(true, articleModifiedDateComparator0.isAscending());
      assertEquals("modifiedDate ASC", string0);
  }
}
