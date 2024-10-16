/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.trash.util.comparator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.trash.util.comparator.EntryTypeComparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EntryTypeComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EntryTypeComparator entryTypeComparator0 = new EntryTypeComparator();
      String[] stringArray0 = entryTypeComparator0.getOrderByConditionFields();
      assertEquals("classNameId DESC", entryTypeComparator0.toString());
      assertNotNull(stringArray0);
      assertEquals("classNameId DESC", entryTypeComparator0.getOrderBy());
  }

  @Test
  public void test1()  throws Throwable  {
      EntryTypeComparator entryTypeComparator0 = new EntryTypeComparator(true);
      boolean boolean0 = entryTypeComparator0.isAscending();
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      EntryTypeComparator entryTypeComparator0 = new EntryTypeComparator();
      String string0 = entryTypeComparator0.toString();
      assertEquals("classNameId DESC", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      EntryTypeComparator entryTypeComparator0 = new EntryTypeComparator(true);
      String string0 = entryTypeComparator0.getOrderBy();
      assertEquals(true, entryTypeComparator0.isAscending());
      assertEquals("classNameId ASC", string0);
  }
}
