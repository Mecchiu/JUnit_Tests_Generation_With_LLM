/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.journal.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.journal.model.JournalStructure;
import com.liferay.portlet.journal.model.JournalStructureSoap;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JournalStructureSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      String string0 = journalStructureSoap0.getDescription();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      String string0 = journalStructureSoap0.getName();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setModifiedDate((Date) null);
      assertNull(journalStructureSoap0.getUuid());
  }

  @Test
  public void test3()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      long long0 = journalStructureSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test4()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setPrimaryKey((-1L));
      assertEquals((-1L), journalStructureSoap0.getPrimaryKey());
      assertEquals((-1L), journalStructureSoap0.getId());
  }

  @Test
  public void test5()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setUserId(18L);
      assertEquals(18L, journalStructureSoap0.getUserId());
  }

  @Test
  public void test6()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      String string0 = journalStructureSoap0.getXsd();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      String string0 = journalStructureSoap0.getParentStructureId();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      long long0 = journalStructureSoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setDescription((String) null);
      assertEquals(0L, journalStructureSoap0.getUserId());
  }

  @Test
  public void test10()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      long long0 = journalStructureSoap0.getId();
      assertEquals(0L, long0);
  }

  @Test
  public void test11()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      Date date0 = journalStructureSoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test12()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setXsd((String) null);
      assertNull(journalStructureSoap0.getDescription());
  }

  @Test
  public void test13()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      String string0 = journalStructureSoap0.getUuid();
      assertNull(string0);
  }

  @Test
  public void test14()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setStructureId("");
      assertEquals(0L, journalStructureSoap0.getPrimaryKey());
  }

  @Test
  public void test15()  throws Throwable  {
      LinkedList<JournalStructure> linkedList0 = new LinkedList<JournalStructure>();
      linkedList0.add((JournalStructure) null);
      // Undeclared exception!
      try {
        JournalStructureSoap.toSoapModels((List<JournalStructure>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      String string0 = journalStructureSoap0.getStructureId();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setCompanyId((-1696L));
      assertEquals((-1696L), journalStructureSoap0.getCompanyId());
  }

  @Test
  public void test18()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setName("");
      assertEquals(0L, journalStructureSoap0.getUserId());
  }

  @Test
  public void test19()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      Date date0 = journalStructureSoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test20()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      long long0 = journalStructureSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setUuid("");
      assertNull(journalStructureSoap0.getXsd());
  }

  @Test
  public void test22()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      String string0 = journalStructureSoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setUserName((String) null);
      assertNull(journalStructureSoap0.getParentStructureId());
  }

  @Test
  public void test24()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setCreateDate((Date) null);
      assertNull(journalStructureSoap0.getParentStructureId());
  }

  @Test
  public void test25()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setGroupId(0L);
      assertNull(journalStructureSoap0.getName());
  }

  @Test
  public void test26()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      long long0 = journalStructureSoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      JournalStructureSoap journalStructureSoap0 = new JournalStructureSoap();
      journalStructureSoap0.setParentStructureId((String) null);
      assertEquals(0L, journalStructureSoap0.getCompanyId());
  }

  @Test
  public void test28()  throws Throwable  {
      JournalStructure[][] journalStructureArray0 = new JournalStructure[34][5];
      // Undeclared exception!
      try {
        JournalStructureSoap.toSoapModels(journalStructureArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      LinkedList<JournalStructure> linkedList0 = new LinkedList<JournalStructure>();
      JournalStructureSoap[] journalStructureSoapArray0 = JournalStructureSoap.toSoapModels((List<JournalStructure>) linkedList0);
      assertNotNull(journalStructureSoapArray0);
  }
}
