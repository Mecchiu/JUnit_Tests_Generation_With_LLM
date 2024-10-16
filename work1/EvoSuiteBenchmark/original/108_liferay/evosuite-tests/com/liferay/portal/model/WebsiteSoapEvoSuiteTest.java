/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.Website;
import com.liferay.portal.model.WebsiteSoap;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WebsiteSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setPrimary(false);
      assertEquals(false, websiteSoap0.isPrimary());
      assertEquals(false, websiteSoap0.getPrimary());
  }

  @Test
  public void test1()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      boolean boolean0 = websiteSoap0.getPrimary();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      long long0 = websiteSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test3()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setTypeId(2);
      assertEquals(2, websiteSoap0.getTypeId());
  }

  @Test
  public void test4()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setModifiedDate((Date) null);
      assertEquals(0L, websiteSoap0.getWebsiteId());
  }

  @Test
  public void test5()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      long long0 = websiteSoap0.getClassNameId();
      assertEquals(0L, long0);
  }

  @Test
  public void test6()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      long long0 = websiteSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test7()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      long long0 = websiteSoap0.getWebsiteId();
      assertEquals(0L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      long long0 = websiteSoap0.getClassPK();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setPrimaryKey((long) 2);
      assertEquals(2L, websiteSoap0.getWebsiteId());
      assertEquals(2L, websiteSoap0.getPrimaryKey());
  }

  @Test
  public void test10()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      Date date0 = websiteSoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test11()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      int int0 = websiteSoap0.getTypeId();
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setUserId(11L);
      assertEquals(11L, websiteSoap0.getUserId());
  }

  @Test
  public void test13()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setClassPK(0L);
      assertEquals(0L, websiteSoap0.getPrimaryKey());
  }

  @Test
  public void test14()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setCreateDate((Date) null);
      assertEquals(false, websiteSoap0.getPrimary());
  }

  @Test
  public void test15()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      String string0 = websiteSoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test16()  throws Throwable  {
      LinkedList<Website> linkedList0 = new LinkedList<Website>();
      linkedList0.add((Website) null);
      // Undeclared exception!
      try {
        WebsiteSoap.toSoapModels((List<Website>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      Date date0 = websiteSoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test18()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setClassNameId(0L);
      assertEquals(0L, websiteSoap0.getCompanyId());
  }

  @Test
  public void test19()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      boolean boolean0 = websiteSoap0.isPrimary();
      assertEquals(false, boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      long long0 = websiteSoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      String string0 = websiteSoap0.getUrl();
      assertNull(string0);
  }

  @Test
  public void test22()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setUserName(":g@W");
      assertEquals(0L, websiteSoap0.getPrimaryKey());
  }

  @Test
  public void test23()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setUrl((String) null);
      assertEquals(0L, websiteSoap0.getWebsiteId());
  }

  @Test
  public void test24()  throws Throwable  {
      WebsiteSoap websiteSoap0 = new WebsiteSoap();
      websiteSoap0.setCompanyId(23L);
      assertEquals(23L, websiteSoap0.getCompanyId());
  }

  @Test
  public void test25()  throws Throwable  {
      Website[][] websiteArray0 = new Website[18][5];
      // Undeclared exception!
      try {
        WebsiteSoap.toSoapModels(websiteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      LinkedList<Website> linkedList0 = new LinkedList<Website>();
      WebsiteSoap[] websiteSoapArray0 = WebsiteSoap.toSoapModels((List<Website>) linkedList0);
      assertNotNull(websiteSoapArray0);
  }
}
