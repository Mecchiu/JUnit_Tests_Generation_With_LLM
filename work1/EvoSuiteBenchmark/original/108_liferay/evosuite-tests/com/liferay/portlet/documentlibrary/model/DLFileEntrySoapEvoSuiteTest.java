/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.documentlibrary.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileEntrySoap;
import com.liferay.portlet.documentlibrary.model.DLFileEntryWrapper;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DLFileEntrySoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getFolderId();
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getVersion();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setReadCount(31);
      assertEquals(31, dLFileEntrySoap0.getReadCount());
  }

  @Test
  public void test3()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setVersionUserId((-1L));
      assertEquals((-1L), dLFileEntrySoap0.getVersionUserId());
  }

  @Test
  public void test4()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setUserName((String) null);
      assertNull(dLFileEntrySoap0.getMimeType());
  }

  @Test
  public void test5()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setDescription("l^O2@+T7kng");
      assertNull(dLFileEntrySoap0.getExtension());
  }

  @Test
  public void test6()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setFileEntryTypeId(0L);
      assertNull(dLFileEntrySoap0.getVersion());
  }

  @Test
  public void test7()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setPrimaryKey((-1280L));
      assertEquals((-1280L), dLFileEntrySoap0.getPrimaryKey());
      assertEquals((-1280L), dLFileEntrySoap0.getFileEntryId());
  }

  @Test
  public void test8()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getTitle();
      assertNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test10()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      boolean boolean0 = dLFileEntrySoap0.getManualCheckInRequired();
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setUserId(0L);
      assertNull(dLFileEntrySoap0.getTitle());
  }

  @Test
  public void test12()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setGroupId(0L);
      assertNull(dLFileEntrySoap0.getExtraSettings());
  }

  @Test
  public void test13()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setTitle("G.=}2@Y5{Y");
      assertNull(dLFileEntrySoap0.getName());
  }

  @Test
  public void test14()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getFileEntryId();
      assertEquals(0L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      LinkedList<DLFileEntry> linkedList0 = new LinkedList<DLFileEntry>();
      DLFileEntryWrapper dLFileEntryWrapper0 = new DLFileEntryWrapper((DLFileEntry) null);
      linkedList0.add((DLFileEntry) dLFileEntryWrapper0);
      // Undeclared exception!
      try {
        DLFileEntrySoap.toSoapModels((List<DLFileEntry>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getFileEntryTypeId();
      assertEquals(0L, long0);
  }

  @Test
  public void test17()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setMimeType((String) null);
      assertEquals(0L, dLFileEntrySoap0.getFileEntryId());
  }

  @Test
  public void test18()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setManualCheckInRequired(true);
      assertEquals(true, dLFileEntrySoap0.isManualCheckInRequired());
      assertEquals(true, dLFileEntrySoap0.getManualCheckInRequired());
  }

  @Test
  public void test19()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setLargeImageId(0L);
      assertNull(dLFileEntrySoap0.getExtraSettings());
  }

  @Test
  public void test20()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getUuid();
      assertNull(string0);
  }

  @Test
  public void test21()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getVersionUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test22()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getRepositoryId();
      assertEquals(0L, long0);
  }

  @Test
  public void test23()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setRepositoryId((-1280L));
      assertEquals((-1280L), dLFileEntrySoap0.getRepositoryId());
  }

  @Test
  public void test24()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setCustom2ImageId(0L);
      assertEquals(0L, dLFileEntrySoap0.getCustom1ImageId());
  }

  @Test
  public void test25()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      int int0 = dLFileEntrySoap0.getReadCount();
      assertEquals(0, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getVersionUserName();
      assertNull(string0);
  }

  @Test
  public void test27()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getMimeType();
      assertNull(string0);
  }

  @Test
  public void test28()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getSize();
      assertEquals(0L, long0);
  }

  @Test
  public void test29()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getCustom1ImageId();
      assertEquals(0L, long0);
  }

  @Test
  public void test30()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getUserName();
      assertNull(string0);
  }

  @Test
  public void test31()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setName((String) null);
      assertNull(dLFileEntrySoap0.getVersionUserName());
  }

  @Test
  public void test32()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getLargeImageId();
      assertEquals(0L, long0);
  }

  @Test
  public void test33()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setVersion("l^O2@+T7kng");
      assertEquals("l^O2@+T7kng", dLFileEntrySoap0.getVersion());
  }

  @Test
  public void test34()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setSize((-29L));
      assertEquals((-29L), dLFileEntrySoap0.getSize());
  }

  @Test
  public void test35()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test36()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setFolderId((-29L));
      assertEquals((-29L), dLFileEntrySoap0.getFolderId());
  }

  @Test
  public void test37()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setCompanyId(0L);
      assertNull(dLFileEntrySoap0.getUuid());
  }

  @Test
  public void test38()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      Date date0 = dLFileEntrySoap0.getCreateDate();
      assertNull(date0);
  }

  @Test
  public void test39()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test40()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setCustom1ImageId(0L);
      assertNull(dLFileEntrySoap0.getName());
  }

  @Test
  public void test41()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getSmallImageId();
      assertEquals(0L, long0);
  }

  @Test
  public void test42()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getName();
      assertNull(string0);
  }

  @Test
  public void test43()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setModifiedDate((Date) null);
      assertEquals(0L, dLFileEntrySoap0.getSize());
  }

  @Test
  public void test44()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setExtension("gow%u9J");
      assertEquals("gow%u9J", dLFileEntrySoap0.getExtension());
  }

  @Test
  public void test45()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getDescription();
      assertNull(string0);
  }

  @Test
  public void test46()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setSmallImageId(0L);
      assertEquals(0L, dLFileEntrySoap0.getSize());
  }

  @Test
  public void test47()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test48()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      boolean boolean0 = dLFileEntrySoap0.isManualCheckInRequired();
      assertEquals(false, boolean0);
  }

  @Test
  public void test49()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      long long0 = dLFileEntrySoap0.getCustom2ImageId();
      assertEquals(0L, long0);
  }

  @Test
  public void test50()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getExtraSettings();
      assertNull(string0);
  }

  @Test
  public void test51()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setVersionUserName("gow%u9J");
      assertEquals(0L, dLFileEntrySoap0.getRepositoryId());
  }

  @Test
  public void test52()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setExtraSettings("G.=}2@Y5{Y");
      assertEquals(0L, dLFileEntrySoap0.getCustom1ImageId());
  }

  @Test
  public void test53()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setUuid((String) null);
      assertNull(dLFileEntrySoap0.getExtension());
  }

  @Test
  public void test54()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      String string0 = dLFileEntrySoap0.getExtension();
      assertNull(string0);
  }

  @Test
  public void test55()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      dLFileEntrySoap0.setCreateDate((Date) null);
      assertNull(dLFileEntrySoap0.getDescription());
  }

  @Test
  public void test56()  throws Throwable  {
      DLFileEntrySoap dLFileEntrySoap0 = new DLFileEntrySoap();
      Date date0 = dLFileEntrySoap0.getModifiedDate();
      assertNull(date0);
  }

  @Test
  public void test57()  throws Throwable  {
      DLFileEntry[][] dLFileEntryArray0 = new DLFileEntry[1][10];
      // Undeclared exception!
      try {
        DLFileEntrySoap.toSoapModels(dLFileEntryArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test58()  throws Throwable  {
      LinkedList<DLFileEntry> linkedList0 = new LinkedList<DLFileEntry>();
      DLFileEntrySoap[] dLFileEntrySoapArray0 = DLFileEntrySoap.toSoapModels((List<DLFileEntry>) linkedList0);
      assertNotNull(dLFileEntrySoapArray0);
  }
}
