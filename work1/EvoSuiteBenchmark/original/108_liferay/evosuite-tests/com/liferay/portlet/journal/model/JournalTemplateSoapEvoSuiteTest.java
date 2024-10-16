/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.journal.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.journal.model.JournalTemplate;
import com.liferay.portlet.journal.model.JournalTemplateSoap;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JournalTemplateSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setGroupId(103L);
      assertEquals(103L, journalTemplateSoap0.getGroupId());
  }

  @Test
  public void test1()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setPrimaryKey(0L);
      assertNull(journalTemplateSoap0.getUuid());
  }

  @Test
  public void test2()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setUserName((String) null);
      assertEquals(0L, journalTemplateSoap0.getGroupId());
  }

  @Test
  public void test3()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setSmallImageURL("getBeanProperty");
      assertEquals(0L, journalTemplateSoap0.getUserId());
  }

  @Test
  public void test4()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setTemplateId((String) null);
      assertNull(journalTemplateSoap0.getSmallImageURL());
  }

  @Test
  public void test5()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setUserId(0L);
      assertNull(journalTemplateSoap0.getUuid());
  }

  @Test
  public void test6()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setXsl("getBeanProperty");
      assertEquals("getBeanProperty", journalTemplateSoap0.getXsl());
  }

  @Test
  public void test7()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getXsl();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setName("getBeanProperty");
      assertEquals(0L, journalTemplateSoap0.getId());
  }

  @Test
  public void test9()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      boolean boolean0 = journalTemplateSoap0.getSmallImage();
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      long long0 = journalTemplateSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      long long0 = journalTemplateSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getStructureId();
      assertNull(string0);
  }

  @Test
  public void test14()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setSmallImageId(0L);
      assertEquals(0L, journalTemplateSoap0.getSmallImageId());
  }

  @Test
  public void test15()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setDescription((String) null);
      assertEquals(false, journalTemplateSoap0.isCacheable());
  }

  @Test
  public void test16()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getTemplateId();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setLangType((String) null);
      assertNull(journalTemplateSoap0.getStructureId());
  }

  @Test
  public void test18()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getUuid();
      assertNull(string0);
  }

  @Test
  public void test19()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setStructureId((String) null);
      assertEquals(false, journalTemplateSoap0.isSmallImage());
  }

  @Test
  public void test20()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      long long0 = journalTemplateSoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getSmallImageURL();
      assertNull(string0);
  }

  @Test
  public void test22()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      boolean boolean0 = journalTemplateSoap0.isCacheable();
      assertEquals(false, boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      long long0 = journalTemplateSoap0.getSmallImageId();
      assertEquals(0L, long0);
  }

  @Test
  public void test24()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setCreateDate((Date) null);
      assertEquals(0L, journalTemplateSoap0.getGroupId());
  }

  @Test
  public void test25()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getName();
      assertNull(string0);
  }

  @Test
  public void test26()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      long long0 = journalTemplateSoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      Date date0 = journalTemplateSoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test28()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      boolean boolean0 = journalTemplateSoap0.isSmallImage();
      assertEquals(false, boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      boolean boolean0 = journalTemplateSoap0.getCacheable();
      assertEquals(false, boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      long long0 = journalTemplateSoap0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test31()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setUuid((String) null);
      assertEquals(0L, journalTemplateSoap0.getPrimaryKey());
  }

  @Test
  public void test32()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getLangType();
      assertNull(string0);
  }

  @Test
  public void test33()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      Date date0 = journalTemplateSoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test34()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setCompanyId((-11L));
      assertEquals((-11L), journalTemplateSoap0.getCompanyId());
  }

  @Test
  public void test35()  throws Throwable  {
      JournalTemplate[][] journalTemplateArray0 = new JournalTemplate[1][4];
      // Undeclared exception!
      try {
        JournalTemplateSoap.toSoapModels(journalTemplateArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test36()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      String string0 = journalTemplateSoap0.getDescription();
      assertNull(string0);
  }

  @Test
  public void test37()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setModifiedDate((Date) null);
      assertEquals(0L, journalTemplateSoap0.getGroupId());
  }

  @Test
  public void test38()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setSmallImage(true);
      assertEquals(true, journalTemplateSoap0.getSmallImage());
      assertEquals(true, journalTemplateSoap0.isSmallImage());
  }

  @Test
  public void test39()  throws Throwable  {
      JournalTemplateSoap journalTemplateSoap0 = new JournalTemplateSoap();
      journalTemplateSoap0.setCacheable(true);
      assertEquals(true, journalTemplateSoap0.isCacheable());
      assertEquals(true, journalTemplateSoap0.getCacheable());
  }

  @Test
  public void test40()  throws Throwable  {
      LinkedList<JournalTemplate> linkedList0 = new LinkedList<JournalTemplate>();
      JournalTemplateSoap[] journalTemplateSoapArray0 = JournalTemplateSoap.toSoapModels((List<JournalTemplate>) linkedList0);
      assertNotNull(journalTemplateSoapArray0);
  }

  @Test
  public void test41()  throws Throwable  {
      LinkedList<JournalTemplate> linkedList0 = new LinkedList<JournalTemplate>();
      linkedList0.add((JournalTemplate) null);
      // Undeclared exception!
      try {
        JournalTemplateSoap.toSoapModels((List<JournalTemplate>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
