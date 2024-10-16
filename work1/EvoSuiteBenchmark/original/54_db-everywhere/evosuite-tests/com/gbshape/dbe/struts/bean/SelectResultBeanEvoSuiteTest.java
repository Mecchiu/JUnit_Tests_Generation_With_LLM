/*
 * This file was automatically generated by EvoSuite
 */

package com.gbshape.dbe.struts.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.gbshape.dbe.struts.bean.ColumnBean;
import com.gbshape.dbe.struts.bean.SelectResultBean;
import com.gbshape.dbe.utils.ValueListHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SelectResultBeanEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SelectResultBean selectResultBean0 = new SelectResultBean();
      selectResultBean0.setValueListHandler((ValueListHandler) null);
      assertEquals("", selectResultBean0.getTable());
  }

  @Test
  public void test1()  throws Throwable  {
      SelectResultBean selectResultBean0 = new SelectResultBean();
      ColumnBean[] columnBeanArray0 = selectResultBean0.getColumnBeans();
      assertNull(columnBeanArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      SelectResultBean selectResultBean0 = new SelectResultBean();
      selectResultBean0.setTable("");
      assertEquals("", selectResultBean0.getTable());
  }

  @Test
  public void test3()  throws Throwable  {
      SelectResultBean selectResultBean0 = new SelectResultBean();
      ValueListHandler valueListHandler0 = selectResultBean0.getValueListHandler();
      assertNull(valueListHandler0);
  }

  @Test
  public void test4()  throws Throwable  {
      SelectResultBean selectResultBean0 = new SelectResultBean();
      String string0 = selectResultBean0.getTable();
      assertEquals("", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      SelectResultBean selectResultBean0 = new SelectResultBean();
      ColumnBean[] columnBeanArray0 = new ColumnBean[8];
      selectResultBean0.setColumnBeans(columnBeanArray0);
      assertEquals("", selectResultBean0.getTable());
  }
}
