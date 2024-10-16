/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.expando.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.model.ExpandoValueSoap;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ExpandoValueSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setPrimaryKey(1L);
      assertEquals(1L, expandoValueSoap0.getPrimaryKey());
      assertEquals(1L, expandoValueSoap0.getValueId());
  }

  @Test
  public void test1()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      String string0 = expandoValueSoap0.getData();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getTableId();
      assertEquals(0L, long0);
  }

  @Test
  public void test3()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setColumnId(0L);
      assertNull(expandoValueSoap0.getData());
  }

  @Test
  public void test4()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getValueId();
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setCompanyId(1L);
      assertEquals(1L, expandoValueSoap0.getCompanyId());
  }

  @Test
  public void test6()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setData((String) null);
      assertEquals(0L, expandoValueSoap0.getClassPK());
  }

  @Test
  public void test7()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setClassPK(0L);
      assertEquals(0L, expandoValueSoap0.getTableId());
  }

  @Test
  public void test9()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setClassNameId(1L);
      assertEquals(1L, expandoValueSoap0.getClassNameId());
  }

  @Test
  public void test10()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getClassPK();
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setRowId(1L);
      assertEquals(1L, expandoValueSoap0.getRowId());
  }

  @Test
  public void test13()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getRowId();
      assertEquals(0L, long0);
  }

  @Test
  public void test14()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getClassNameId();
      assertEquals(0L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      expandoValueSoap0.setTableId(0L);
      assertEquals(0L, expandoValueSoap0.getPrimaryKey());
  }

  @Test
  public void test16()  throws Throwable  {
      ExpandoValueSoap expandoValueSoap0 = new ExpandoValueSoap();
      long long0 = expandoValueSoap0.getColumnId();
      assertEquals(0L, long0);
  }

  @Test
  public void test17()  throws Throwable  {
      ExpandoValue[][] expandoValueArray0 = new ExpandoValue[1][6];
      // Undeclared exception!
      try {
        ExpandoValueSoap.toSoapModels(expandoValueArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      LinkedList<ExpandoValue> linkedList0 = new LinkedList<ExpandoValue>();
      ExpandoValueSoap[] expandoValueSoapArray0 = ExpandoValueSoap.toSoapModels((List<ExpandoValue>) linkedList0);
      assertNotNull(expandoValueSoapArray0);
  }

  @Test
  public void test19()  throws Throwable  {
      LinkedList<ExpandoValue> linkedList0 = new LinkedList<ExpandoValue>();
      linkedList0.add((ExpandoValue) null);
      // Undeclared exception!
      try {
        ExpandoValueSoap.toSoapModels((List<ExpandoValue>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
